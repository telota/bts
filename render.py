#!/usr/bin/env python3
import sqlite3
import json
import hashlib
import re

from cleanSVG import CleanSVG
import requests
import flask
from flask import Flask, render_template, redirect, abort, url_for, Response, request

# FIXME Development-only. For production, use simple HTTP caching in front of the render_mdc endpoint.
from werkzeug.contrib.cache import SimpleCache
render_mdc_cache = SimpleCache()


DATABASE = 'corpus.sqlite3'

app = Flask(__name__)


def get_db():
    if not hasattr(flask.g, '_database'):
        flask.g._database = sqlite3.connect(DATABASE)
        flask.g._database.row_factory = sqlite3.Row
    return flask.g._database

@app.teardown_appcontext
def close_connection(_exception):
    if hasattr(flask.g, '_database'):
        flask.g._database.close()


@app.route('/couch/<string:couch_id>/')
def redirect_corpus_couch_id(couch_id):
    results = get_db().execute('SELECT oid FROM corpus_objects WHERE couch_id=?', (couch_id,)).fetchall()
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
            FROM corpus_objects obj
            JOIN corpus_objects parent ON obj.parent = parent.oid
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
    return 'Not implemented.'

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

