#!/usr/bin/env python3
import sqlite3
import json
import hashlib
import re
from enum import Enum

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
        flask.g._database = sqlite3.connect(app.config['DATABASE_SQLITE_FILE'])
        flask.g._database.row_factory = sqlite3.Row
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

