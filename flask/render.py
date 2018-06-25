#!/usr/bin/env python3
#
# Lightweight Berlin Text System Search Interface
# Copyright 2018 Sebastian Götte/Berlin Brandenburg Academy of Sciences <bbaw@jaseg.net, sgoette@bbaw.de>
#
#   This program is free software: you can redistribute it and/or modify
#   it under the terms of the GNU Affero General Public License as published by
#   the Free Software Foundation, either version 3 of the License, or
#   (at your option) any later version.
#
#   This program is distributed in the hope that it will be useful,
#   but WITHOUT ANY WARRANTY; without even the implied warranty of
#   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#   GNU Affero General Public License for more details.
#
#   You should have received a copy of the GNU Affero General Public License
#   along with this program.  If not, see <http://www.gnu.org/licenses/>.

import sqlite3
import json
import hashlib
import re
import uuid
import html
import atexit
import tempfile
import shutil
import hashlib
from os import path
import os
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
app.jinja_env.line_comment_prefix = '##'


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
    ''' Produce a nice search home page. '''
    return render_template('index.html')

@app.route('/couch/<string:couch_id>/')
def redirect_corpus_couch_id(couch_id):
    ''' Resolve a CouchDB object ID to the corresponding short SQLite object ID. Note that these SQLite object IDs are
    stable within a single instance of this database, and do not change if CouchDB data is re-exported to this same
    instance. They will, however, change if someone deletes the database and they will not be the same accross multiple
    instances of this database. '''
    results = get_db().execute('SELECT oid FROM corpus_object WHERE couch_id=?', (couch_id,)).fetchall()
    if not results:
        abort(404)

    (oid,), = results
    return redirect(url_for('render_corpus_object', oid=oid))

@app.route('/text/<int:oid>/')
def render_text(oid):
    ''' Produce a nice, human-readable rendered version of the given text. If the given oid points to an object that is
    not a text, redirect to render_corpus_object. '''
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

    css_wrapper = MDC_CSS()
    out = render_template('text_content.html',
            obj=load_corpus_object(oid),
            mdc_css=css_wrapper,
            sentences=json.loads(row['content_json']))
    return out

@app.route('/text/mdc_css/<oid>/<hash>')
def render_mdc_css(oid, hash):
    obj = load_corpus_object(oid)
    if not obj:
        abort(404)

    css_wrapper = MDC_CSS()
    for sentence in obj['content']:
        for item in sentence['items']:
            css_wrapper.class_for_mdc(item['mdc'])

    if hash != css_wrapper.content_hash(): # The text content changed since it was rendered in the response
        abort(412)

    return Response(css_wrapper.render_css(), mimetype='text/css')

@app.route('/corpus/<int:oid>/')
def render_corpus_object(oid):
    ''' Render the given corpus object. Produce a navigable tree thingy that can be used to explore other objects. If
    the object is a text, also include the output of render_text. '''
    css_wrapper = MDC_CSS()
    out = render_template('corpus_object.html',
            mdc_css=css_wrapper,
            obj=load_corpus_object(oid),
            ObjectType=ObjectType,
            ROOT_OID=0,
            children=children)
    return out

def svg_filename(mdc):
    ''' Generate a nice, unique, random-looking filename to be used with rendered hieroglyph images. '''
    return '{:.12}-{:.32}.svg'.format(
            hashlib.sha256(mdc.encode('ASCII')).hexdigest(),
            re.sub('[^a-zA-Z0-9]+', '-', mdc))

class MDC_CSS:
    ''' This class is a helper to render MDC hieroglyps as SVG via CSS classes for performance.

    MDC rendering is done in two stages. In the first stage, this classes class_for_mdc method is used to resolve all
    MDC fragments in a document to CSS classes numbered sequentially. A link to a CSS stylesheet resolving these classes
    to their rendered SVG hieroglyphs is appended to the end of the document.

    When this stylesheet is loaded, another instance of this class is created and the sentence items are again passed to
    class_for_mdc, but this time the return value is ignored. This step builds up the same ID cache that was used in the
    first step. Then, render_css generates the actual CSS rule definitions containing the hieroglyph SVGs.

    Since the document might theoretically change in the database between these two invocations, in both runs a digest
    is created of all the MDC rendered. If the digests don't match when the CSS should be rendered, a HTTP 412
    "Precondition failed" error is returned.

    Only ever use one of these helpers in a single page as otherwise the CSS class names would clash.
    '''
    def __init__(self):
        self._mdc_cache = {}
        self._seq = 0
        self._hash = hashlib.sha256()

    def class_for_mdc(self, mdc):
        ''' Return the cached CSS class name for this MDC string, and append the MDC string to the document MDC digest.
        '''
        self._hash.update(mdc.encode() + b'\n')
        if not mdc:
            return ''

        if mdc not in self._mdc_cache:
            seq = self._seq = self._seq+1
            self._mdc_cache[mdc] = seq
        return 'img_hiero_{}'.format(self._mdc_cache[mdc])

    def content_hash(self):
        return self._hash.hexdigest()

    def render_css(self):
        for mdc, seq in self._mdc_cache.items():
            try:
                svg = query_svg_for_mdc(mdc).replace('"', "'")
                yield '.img_hiero_{}::before {{ background: url("data:image/svg+xml;utf8,{}"); }}\n'.format(seq, svg)
            except Exception as e:
                pass # FIXME return image containing error message/symbol instead

def query_svg_for_mdc(mdc):
    ''' Query JSesh MDC rendering backend over HTTP and return cleaned-up SVG data.
        
        For performance, this uses an internal cache with one-day expiry time.

        HACK: This hard-codes a replacement fill color. FIXME: Remove style="..." stuff altogether and style things from
        outside using CSS.
    '''
    svg = render_mdc_cache.get(mdc)
    if svg is None:
        svg = requests.get('http://localhost:5001/render_mdc', params={'mdc': mdc}).text

        # Cleanup: set SVG elem viewbox for proper scaling, truncate decimals to save file size and set fill color.
        cleaner = CleanSVG(svgstring=svg)
        w, h = cleaner.root.attrib.pop('width'), cleaner.root.attrib.pop('height')
        cleaner.root.attrib['viewBox'] = '0 0 {} {}'.format(w, h)
        cleaner.setDecimalPlaces(4)
        svg = re.sub(r'style="[^"]*stroke:\s*none[^"]*"', 'style="stroke:none;fill:rgb(37,64,72);"', str(cleaner))
        svg = re.sub(r'style="[^"]*fill:\s*none[^"]*"', 'style="fill:none;stroke:rgb(37,64,72);"', svg)

        render_mdc_cache.set(mdc, svg, timeout=86400)
    return svg

@app.route('/render_mdc')
def render_mdc():
    ''' Render the given MDC to cleaned-up JSesh SVG '''
    if 'mdc' not in request.args:
        abort(400)
    mdc = request.args['mdc']

    resp = Response(mdc_to_svg(mdc))
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
    ''' Display a search result page for a given query, offset and limit.
        
        If a search type is given, display its search result page. If no search type is given, display results for the
        search type with most results.
    '''
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
    ''' Search the database using the given query and query type. '''
    query = request.args['query']
    offset = request.args.get('offset', 0)
    searchtype = request.args['type']
    limit = min(request.args.get('limit', app.config['DEFAULT_SEARCH_RESULTS']), app.config['MAX_SEARCH_RESULTS'])

    ts = time()
    matches = perform_fts(searchtype, query, offset, limit)
    te = time()

    return jsonify({'query_time': te-ts,
        'offset': offset,
        'limit': limit, # Feed back as above it might have been clipped according to app config
        'results:': matches
        })

@app.route('/api/v1/search/result_counts')
def search_result_counts():
    ''' Count search results for each available query type '''
    query = request.args['query']
    return jsonify(fts_count(query))

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
    ''' Count the search results for the given query for every available search type.

        This might look inefficient as hell, but as it turns out we spend most time not on the actual full-text search
        (which is lightning-fast) and this is a very convenient way to present result counts to the user.
    '''
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
    ''' Perform a search of the given type.

        "exact" matches exact SQLite or CouchDB IDs.

        The following queries perform full-text search:
        "corpus_name" matches object names.
        "corpus_passport" matches passport valuese.
        "text_mdc", "text_translation" and "text_transliteration" match the respective text properties.
        "text_lemmata" performs full-text search on the text's numeric lemma IDs.
    '''

    # FTS4 SQLite full text search extension search table schemata:
    # CREATE VIRTUAL TABLE text_fts   USING fts4(mdc, transliteration, lemmata, translation)
    # CREATE VIRTUAL TABLE corpus_fts USING fts4(name, passport_values)

    # During all fts queries below, be careful to perform full-text matching and result set slicing first, then
    # "decorate" the results using JOINs and the object path subquery above. Otherwise, the JOIN and object path
    # subquery are evaluated for every result up to the one at index OFFSET+LIMIT which at some point gets really
    # boring.

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
    ''' Load a corpus object or text from the database given its SQLite object ID. Return a dict sutiable for e.g. JSON
        serialization containing a description of the object, including its ancestry and children.
    '''
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

