#!/usr/bin/env python3

import json
import re
import sqlite3
from pathlib import Path
from enum import Enum
from warnings import warn

import text_content

MAX_PREVIEW_CHARS = 250

class ObjectType(Enum):
    CORPUS      = 0
    OBJECT      = 1
    PART        = 2
    CAPTION     = 3
    SCENE       = 4
    GROUP       = 5
    ARRANGEMENT = 6
    TEXT        = 7

TYPE_DICT = {
        'TCObject':     ObjectType.OBJECT,
        'ObjectPart':   ObjectType.PART,
        'Caption':      ObjectType.CAPTION,
        'Scene':        ObjectType.SCENE,
        'Group':        ObjectType.GROUP,
        'Arrangement':  ObjectType.ARRANGEMENT
        }

def ensure_tables_exist(db):
    db.execute('''
        CREATE TABLE IF NOT EXISTS corpus_object(
            oid INTEGER PRIMARY KEY,
            couch_id TEXT DEFAULT null, -- CouchDB object ID
            name TEXT,
            type INTEGER, -- object type:
                          -- Corpus(0), Object(1), Part(2), Caption(3), Scene(4), Group(5), Arrangement(6), Text(7)
            parent INTEGER,
            metadata TEXT DEFAULT "{}", -- JSON passport data
            FOREIGN KEY (parent) REFERENCES corpus_object(oid) ON DELETE CASCADE
        )
    ''')

    db.execute('CREATE UNIQUE INDEX IF NOT EXISTS corpus_object_couchid ON corpus_object(couch_id)')

    db.execute('''
        CREATE TABLE IF NOT EXISTS text_content(
            oid INTEGER PRIMARY KEY,
            corpus_object INTEGER,
            content_json TEXT,
            preview TEXT,
            FOREIGN KEY (corpus_object) REFERENCES corpus_object(oid) ON DELETE CASCADE
        )
    ''')

    db.execute('CREATE VIRTUAL TABLE IF NOT EXISTS text_fts USING fts4(mdc, transliteration, lemmata, translation)')
    db.execute('CREATE VIRTUAL TABLE IF NOT EXISTS corpus_fts USING fts4(name, passport_values)')
    db.execute('DELETE FROM text_fts')
    db.execute('DELETE FROM corpus_fts')

def get_etype(doc):
    _1, _2, etype = doc.get('eClass', '').rpartition('//')
    return etype

def ensure_corpus_object_exists(db, parent_id, name, couch_id=None):
    db.execute('''
        INSERT INTO corpus_object(name, type, parent, couch_id)
        SELECT ?1, 0, ?2, ?3 WHERE NOT EXISTS (SELECT * FROM corpus_object WHERE name=?1 AND parent=?2)
    ''', (name, parent_id, couch_id))
    
    oid, = db.execute('SELECT oid FROM corpus_object WHERE name=?1 AND parent=?2', (name, parent_id)).fetchone()
    return oid

def ensure_corpus_exists(db, project_name, corpus_name, couch_id=None):
    ensure_corpus_object_exists(db, 0, "Database root object")
    project_id = ensure_corpus_object_exists(db, 0, project_name)
    corpus_id = ensure_corpus_object_exists(db, project_id, corpus_name, couch_id=couch_id)
    orphans_id = ensure_corpus_object_exists(db, corpus_id, "Orphaned Objects")
    return corpus_id, orphans_id

def format_preview(content):
    foo, _, bar = ' '.join(sentence['translation'] for sentence in content[:3] if
            sentence['translation'])[:MAX_PREVIEW_CHARS].rpartition(' ')
    return foo

def import_objects(db, documents, project_name, corpus_name):
    corpus_id, orphans_id = ensure_corpus_exists(db, project_name, corpus_name)
    """ Import all objects into corpus_object table """
    objects_to_insert, texts_to_insert, corpus_fts_data_to_insert, text_fts_data_to_insert = [], [], [], []
    for doc in documents:
        if 'eClass' not in doc: # doc is a design document
            continue

        etype = get_etype(doc)
        if etype == 'BTSTCObject':
            doc_type = doc.get('type')
            sql_type = TYPE_DICT.get(doc_type)
            if sql_type is None:
                warn('Object {_id} has unhandled corpus object type "{doc_type}". Defaulting to OBJECT.'.format(
                    _id=doc.get('_id'), doc_type=doc_type))
                sql_type = ObjectType.OBJECT
        elif etype == 'BTSText':
            sql_type = ObjectType.TEXT
        else:
            warn('Object {_id} has unhandled eClass "{etype}"'.format(_id=doc.get('_id'), etype=etype))
            continue
        
        passport = doc.get('passport', {})

        # Initialize parent with corpus object by default.
        objects_to_insert.append(
                (doc['_id'],
                 doc.get('name', '<Unnamed Object>'),
                 sql_type.value,
                 orphans_id,
                 json.dumps(format_passport(passport))))

        corpus_fts_data_to_insert.append(
                (doc['_id'],
                 doc.get('name', '<Unnamed Object>'),
                 dump_passport_values(passport)))

        if etype == 'BTSText':
            text_data = list(text_content.extract(doc, render_mdc=False))
            texts_to_insert.append(
                (doc['_id'], json.dumps(text_data), format_preview(text_data)))
            text_fts_data_to_insert.append((
                    doc['_id'],
                    ' '.join(item['mdc'].replace('-', ' ').replace(':', ' ')
                            for sentence in text_data for item in sentence['items'] if item['mdc']),
                    ' '.join(item['lemma']
                            for sentence in text_data for item in sentence['items'] if item['lemma']),
                    ' '.join(item['transliteration']
                            for sentence in text_data for item in sentence['items'] if item['transliteration']),
                    ' '.join(sentence['translation']
                            for sentence in text_data if sentence['translation'])))
    db.executemany('''
            INSERT OR REPLACE INTO corpus_object(couch_id, name, type, parent, metadata) VALUES (?, ?, ?, ?, ?)
            ''', objects_to_insert)
    db.executemany('''
            INSERT INTO text_content (corpus_object, content_json, preview)
            VALUES ((SELECT oid FROM corpus_object WHERE couch_id=?), ?, ?)
            ''', texts_to_insert)
    db.executemany('''
            INSERT INTO corpus_fts(docid, name, passport_values) VALUES (
            (SELECT rowid FROM corpus_object WHERE couch_id=?),
            ?, ?)
            ''', corpus_fts_data_to_insert)
    db.executemany('''
            INSERT INTO text_fts(docid, mdc, transliteration, lemmata, translation) VALUES (
            (SELECT rowid FROM corpus_object WHERE couch_id=?),
            ?, ?, ?, ?)
            ''', text_fts_data_to_insert)

def import_hierarchy(db, documents):
    """ Link imported objects into parent/child tree """
    to_insert = []
    for doc in documents:
        rels = doc.get('relations', [])
        if not rels:
            continue

        if len(rels) > 1:
            warn('Too many relations on document {_id}'.format(_id=doc.get('_id')))

        reltype = rels[0].get('type')
        if reltype != 'partOf':
            warn('Unhandled relation type {reltype} on document {_id}'.format(reltype=reltype, _id=doc.get('_id')))
            continue

        target = rels[0].get('objectId')
        if not target:
            warn('Empty partOf relation on document {_id}'.format(_id=doc.get('_id')))
            continue

        to_insert.append((target, doc['_id']))

    db.executemany('''
            UPDATE corpus_object
            SET parent=coalesce((SELECT oid FROM corpus_object WHERE couch_id=?), parent)
            WHERE couch_id=?''',
            to_insert)

def format_passport(entry):
    # TODO: Possibly fix up find_spot, date. Their hierarchy is b0rked in the source data.
    # TODO: Fix up couchDB references in some fields such as date.
    # TODO: Fix up list handling
    d = { child.get('type', '<unnamed group>'):
            format_passport(child) if 'children' in child else child['value']
            for child in entry.get('children', [])
            if child.get('children') or child.get('value') }
    # Filter out empty subtrees
    return { k: v for k, v in d.items() if v }

def dump_passport_values(entry):
    ''' Dump all passport values to a flat, space-separated string for full-text search '''

    return ' '.join(dump_passport_values(child) if 'children' in child else child['value']
            for child in entry.get('children', [])
            if child.get('children') or child.get('value'))

def import_corpora(db, docs, project_name):
    for doc in docs:
        if get_etype(doc) == 'BTSTextCorpus':
            ensure_corpus_exists(db, project_name, doc['name'], couch_id=doc['_id'])

if __name__ == '__main__':
    import argparse
    parser = argparse.ArgumentParser()
    parser.add_argument('json_dir', help=
            'BTS couchDB backup directory with one JSON file per collection named [collection name].json')
    parser.add_argument('sqlite_file', help='Output sqlite database file name')
    args = parser.parse_args()
    json_dir = Path(args.json_dir)
    corpus_files = list(json_dir.glob('*_corpus_*.json'))

    db = sqlite3.connect(args.sqlite_file)
    with db as conn:
        ensure_tables_exist(conn)

        for fn in json_dir.glob('*_corpus.json'):
            project_name,_1,_2 = fn.stem.partition('_')
            with fn.open() as f:
                import_corpora(conn, json.load(f)['docs'], project_name)

        # Import objects and hierarchy information in two steps, since hierarchical relationships may exist across
        # collections.
        for fn in corpus_files:
            project_name, _, corpus_name = fn.stem.partition('_corpus_')

            with fn.open() as f:
                import_objects(conn, json.load(f)['docs'], project_name, corpus_name)

        for fn in corpus_files:
            with fn.open() as f:
                import_hierarchy(conn, json.load(f)['docs'])

