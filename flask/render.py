#!/usr/bin/env python3
import sqlite3
import json
import hashlib
import re
import html
from enum import Enum
from time import time

from cleanSVG import CleanSVG
import requests
import flask
from flask import Flask, render_template, redirect, abort, url_for, Response, request, jsonify

# FIXME Development-only. For production, use simple HTTP caching in front of the render_mdc endpoint.
from werkzeug.contrib.cache import SimpleCache
render_mdc_cache = SimpleCache()


app = Flask(__name__)
app.config.from_envvar('BTSRENDER_SETTINGS')


class ObjectType(Enum):
    CORPUS      = 0
    OBJECT      = 1
    PART        = 2
    CAPTION     = 3
    SCENE       = 4
    GROUP       = 5
    ARRANGEMENT = 6
    TEXT        = 7


def get_db():
    if not hasattr(flask.g, '_database'):
        db = flask.g._database = sqlite3.connect(app.config['DATABASE_SQLITE_FILE'])
        db.row_factory = sqlite3.Row
    return flask.g._database

@app.teardown_appcontext
def close_connection(_exception):
    if hasattr(flask.g, '_database'):
        flask.g._database.close()


@app.route('/')
def root():
    return redirect(url_for('index'))

@app.route('/index.html')
def index():
    return render_template('index.html')

@app.route('/couch/<string:couch_id>/')
def redirect_corpus_couch_id(couch_id):
    results = get_db().execute('SELECT oid FROM corpus_object WHERE couch_id=?', (couch_id,)).fetchall()
    if not results:
        abort(404)

    (oid,), = results
    return redirect(url_for('render_corpus_object', oid=oid))

@app.route('/text/<int:oid>/')
def render_text(oid):
    db = get_db()
    results = db.execute('''
            SELECT parent.type AS parent_type, parent.name AS parent_name,
                   obj.type, obj.name, obj.metadata,
                   content.content_json
            FROM corpus_object obj
            JOIN corpus_object parent ON obj.parent = parent.oid
            LEFT JOIN text_content content ON content.corpus_object = obj.oid
            WHERE obj.oid = ?''', (oid,)).fetchall()

    if not results:
        abort(404)
    row, = results

    if row['content_json'] is None:
        return redirect(url_for('render_corpus_object', oid=oid))

    return render_template('text_content.html', sentences=json.loads(row['content_json']))

@app.route('/corpus/<int:oid>/')
def render_corpus_object(oid):
    return render_template('corpus_object.html',
            obj=load_corpus_object(oid),
            ObjectType=ObjectType,
            ROOT_OID=0,
            children=children)

def svg_filename(mdc):
    return '{:.12}-{:.32}.svg'.format(
            hashlib.sha256(mdc.encode('ASCII')).hexdigest(),
            re.sub('[^a-zA-Z0-9]+', '-', mdc))

@app.route('/render_mdc')
def render_mdc():
    if 'mdc' not in request.args:
        abort(400)
    mdc = request.args['mdc']

    svg = render_mdc_cache.get(mdc)
    if svg is None:
        svg = requests.get('http://localhost:5001/render_mdc', params={'mdc': mdc}).text

        cleaner = CleanSVG(svgstring=svg)
        w, h = cleaner.root.attrib.pop('width'), cleaner.root.attrib.pop('height')
        cleaner.root.attrib['viewBox'] = '0 0 {} {}'.format(w, h)
        cleaner.setDecimalPlaces(4)
        svg = str(cleaner).replace('fill:#000000', 'fill:#254048')

        render_mdc_cache.set(mdc, svg, timeout=86400)

    resp = Response(svg)
    #resp.headers['Content-Disposition'] = 'attachment; filename={}'.format(svg_filename(mdc))
    resp.headers['Content-Type'] = 'image/svg+xml'
    return resp

def corpus_url(oid):
    return url_for('get_corpus_object', oid=oid)

def parents(oid):
    return [dict(row, url=corpus_url(row['oid'])) for row in get_db().execute('''
            WITH RECURSIVE tree(parent) AS ( VALUES(?) UNION
            SELECT corpus_object.parent FROM corpus_object, tree
            WHERE oid=tree.parent)
            SELECT oid, type, name FROM corpus_object JOIN tree ON oid=tree.parent
            ''', (oid,)).fetchall() ][::-1]

def children(oid):
    return [dict(row, url=corpus_url(row['oid'])) for row in get_db().execute(
            'SELECT oid, type, name FROM corpus_object WHERE parent=? ORDER BY name COLLATE NOCASE',
            (oid,)).fetchall()]

@app.route('/api/v1/corpus/<int:oid>/children')
def list_children(oid):
    return jsonify(children(oid))

@app.route('/api/v1/corpus/<int:oid>/parents')
def list_parents(oid):
    return json.dumps(parents(oid))

@app.route('/api/v1/corpus/<int:oid>')
def get_corpus_object(oid):
    obj = load_corpus_object(oid)
    if not obj:
        abort(404)
    return jsonify(obj)

@app.route('/search')
def search_results():
    query = request.args['query']
    offset = int(request.args.get('offset', 0))
    limit = min(int(request.args.get('limit', app.config['DEFAULT_SEARCH_RESULTS'])), int(app.config['MAX_SEARCH_RESULTS']))

    result_counts = fts_count(query)

    # Show tab given as request parameter. If none given, show tab with most results
    tab = request.args.get('tab', sorted([ (cnt, stype) for stype, cnt in result_counts.items() ])[-1][1])

    ts = time()
    matches = perform_fts(tab, query, offset, limit)
    te = time()

    def format_snippet(val):
        ' Escape HTML except for <b> and </b> tags to allow sqlite to highlight the search result span in the snippet. '
        return html.escape(val.replace('<b>', '\x1e').replace('</b>', '\x1f')).replace('\x1e', '<b>').replace('\x1f', '</b>').replace('<b>...</b>', '...')

    return render_template('search_results.html',
            results=matches,
            result_counts=result_counts,
            min=min, max=max,
            offset=offset,
            limit=limit,
            npagelinks=10,
            query=query,
            query_time=te-ts,
            ObjectType=ObjectType,
            format_snippet=format_snippet,
            tab=tab,
            SEARCH_TYPE_DESCRIPTIONS=SEARCH_TYPE_DESCRIPTIONS)

@app.route('/api/v1/search')
def search():
    query = request.args['query']
    offset = request.args.get('offset', 0)
    limit = min(request.args.get('limit', app.config['DEFAULT_SEARCH_RESULTS']), app.config['MAX_SEARCH_RESULTS'])

    t_rec, matches = perform_fts(query, offset, limit)

    return jsonify({'query_times': t_rec,
        'offset': offset,
        'queries': {
            k: {'result_count': cnt, 'results:': [dict(e) for e in vs]} for k, (cnt, vs) in matches.items()
        }})

SEARCH_TYPE_DESCRIPTIONS = {
    'exact': 'Exact ID',
    'corpus_name': 'Object name',
    'corpus_passport_values': 'Passport value',
    'text_lemmata': 'Lemmata',
    'text_mdc': 'MDC',
    'text_transliteration': 'Transliteration',
    'text_translation': 'Translation'
}

# This recursive query looks terrible, but it performs really well in practice. Just make sure to not evaluate it for
# *everything* (e.g. in a JOIN query), as that may take a second or two.
# If this every turns out to be a problem, the result of this query could be cached inside the database using the SQL in
# the "Object Path Caching" SQL script next to this file. This would incur another 3MB or so of storage cost, but would
# also potentially increase the maintenance burden of the database since everytime an object moves or is renamed all the
# cached paths would have to be recomputed.
path_subquery = lambda colname: '''(
    WITH RECURSIVE parent_of(oid, parent, distance, path) AS (
        SELECT oid, parent, 0, NULL FROM corpus_object WHERE oid={colname}
        UNION ALL
        SELECT parent_of.oid, corpus_object.parent, distance+1,
            CASE WHEN path NOTNULL THEN corpus_object.name || "/" || path ELSE corpus_object.name END
        FROM corpus_object JOIN parent_of ON corpus_object.oid = parent_of.parent
    )
    SELECT path FROM parent_of ORDER BY distance DESC LIMIT 1)'''.format(colname=colname)

def fts_count(query):
    cur = get_db().cursor()
    counts = {}

    exact_count, = cur.execute('SELECT COUNT(*) FROM corpus_object WHERE couch_id=?1 OR oid=?1', (query,)).fetchone()
    counts['exact'] = int(exact_count)

    for col in ('name', 'passport_values'):
        count, = cur.execute('SELECT COUNT(*) FROM corpus_fts WHERE {col} MATCH ?'.format(col=col), (query,)).fetchone()
        counts['corpus_{col}'.format(col=col)] = int(count)

    for col in ('mdc', 'transliteration', 'lemmata', 'translation'):
        count, = cur.execute('SELECT COUNT(*) FROM text_fts WHERE {col} MATCH ?'.format(col=col), (query,)).fetchone()
        counts['text_{col}'.format(col=col)] = int(count)

    return counts

def perform_fts(searchtype, query, offset, limit=app.config['DEFAULT_SEARCH_RESULTS']):
    # FTS4 SQLite full text search extension search table schemata:
    # CREATE VIRTUAL TABLE text_fts   USING fts4(mdc, transliteration, lemmata, translation)
    # CREATE VIRTUAL TABLE corpus_fts USING fts4(name, passport_values)

    cur = get_db().cursor()

    if searchtype == 'exact':
        obj = cur.execute('''
                SELECT  oid AS id,
                        name,
                        type,
                        content.preview,
                        ?1 AS snippet
                FROM corpus_object
                LEFT JOIN text_content content ON content.corpus_object = corpus_object.oid
                WHERE corpus_object.couch_id=?1 OR corpus_object.oid=?1''', (query,))
        return cur.fetchall()

    table, _, col = searchtype.partition('_') 

    if table == 'corpus':
        if col not in ('name', 'passport_values'):
            return []

        count, = cur.execute('SELECT COUNT(*) FROM corpus_fts WHERE {col} MATCH ?'.format(col=col), (query,)).fetchone()
        cur.execute('''
                SELECT  id,
                        corpus_object.name,
                        corpus_object.type,
                        content.preview,
                        snippet,
                        {path_subquery} AS path
                FROM (
                    SELECT
                        corpus_fts.oid AS id,
                        snippet(corpus_fts) AS snippet
                    FROM corpus_fts
                    WHERE corpus_fts.{col} MATCH ?
                    LIMIT ? OFFSET ?
                )
                LEFT JOIN corpus_object ON corpus_object.oid=id
                LEFT JOIN text_content content ON content.corpus_object = corpus_object.oid
                '''.format(col=col, path_subquery=path_subquery('id')),
                (query, limit, offset))
        return cur.fetchall()

    if table == 'text':
        if col not in ('mdc', 'transliteration', 'lemmata', 'translation'):
            return []

        count, = cur.execute('SELECT COUNT(*) FROM text_fts WHERE {col} MATCH ?'.format(col=col), (query,)).fetchone()
        cur.execute('''
                SELECT  id,
                        corpus_object.name,
                        corpus_object.type,
                        content.preview,
                        snippet,
                        {path_subquery} AS path
                FROM (
                    SELECT  docid AS id,
                            snippet(text_fts) AS snippet
                    FROM text_fts
                    WHERE text_fts.{col} match ?
                    LIMIT ? OFFSET ?
                )
                LEFT JOIN corpus_object ON corpus_object.oid=id
                LEFT JOIN text_content content ON content.corpus_object = corpus_object.oid
                '''.format(col=col, path_subquery=path_subquery('id')),
                (query, limit, offset))
        return cur.fetchall()

    return []

def load_corpus_object(oid):
    results = get_db().execute('''
            SELECT corpus_object.oid, couch_id, name, type, metadata, content_json FROM corpus_object
            LEFT JOIN text_content ON corpus_object.oid=text_content.corpus_object
            WHERE corpus_object.oid=?
            ''', (oid,)).fetchall()
    if not results:
        return None
    row, = results
    otype = ObjectType(row['type'])
    lineage, descendants = parents(oid), children(oid)

    d = {   'oid':      row['oid'],
            'couch_id': row['couch_id'],
            'name':     row['name'],
            'type':     otype.name,
            'metadata': json.loads(row['metadata']),
            'parents':  lineage,
            'parent_oids': [elem['oid'] for elem in lineage],
            'child_oids': [elem['oid'] for elem in descendants],
            'children': descendants}
    if otype is ObjectType.TEXT:
        d['content'] = json.loads(row['content_json'])
    return d

