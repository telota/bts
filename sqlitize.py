#!/usr/bin/env python3

import json
import re
import sqlite3
from pathlib import Path
from enum import Enum
from warnings import warn

import text_content

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

def format_passport(entry):
    return { child.get('type', '<unnamed group>'):
            format_passport(child) if 'children' in child else child['value']
            for child in entry.get('children', [])
            if child.get('children') or child.get('value') }

def import_json(db, documents, collection_name):
    project_name, _, corpus_name = collection_name.partition('_corpus_')

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
        INSERT OR IGNORE INTO corpus_object(oid, name, type, parent) VALUES (
            0, "Database root object", 0, null
        )
    ''')

    db.execute('''
        INSERT INTO corpus_object(name, type, parent)
        SELECT ?1, 0, 0 WHERE NOT EXISTS (SELECT * FROM corpus_object WHERE parent=0 AND name=?1)
    ''', (project_name,))
    
    project_id, = db.execute('SELECT oid FROM corpus_object WHERE parent=0 AND name=?', (project_name,)).fetchone()

    db.execute('''
        INSERT INTO corpus_object(name, type, parent)
        SELECT ?2, 0, ?1
        WHERE NOT EXISTS (SELECT * FROM corpus_object WHERE parent=?1 AND name=?2)
    ''', (project_id, corpus_name))

    corpus_id, = db.execute('SELECT oid FROM corpus_object WHERE parent=0 AND name=?', (project_name,)).fetchone()

    db.execute('''
        CREATE TABLE IF NOT EXISTS text_content(
            oid INTEGER PRIMARY KEY,
            corpus_object INTEGER,
            content_json TEXT,
            FOREIGN KEY (corpus_object) REFERENCES corpus_object(oid) ON DELETE CASCADE
        )
    ''')

    with db as connection:
        # Import all objects into corpus_object table
        for doc in documents:
            if 'eClass' not in doc: # doc is a design document
                continue

            _1, _2, etype = doc['eClass'].rpartition('//')
            if etype == 'BTSTCObject':
                doc_type = doc.get('type')
                sql_type = TYPE_DICT.get(doc_type)
                if sql_type is None:
                    warn(f'Object {doc["_id"]} has unhandled corpus object type "{doc_type}". Defaulting to OBJECT.')
                    sql_type = ObjectType.OBJECT
            elif etype == 'BTSText':
                sql_type = ObjectType.TEXT
            else:
                warn(f'Object {doc["_id"]} has unhandled eClass "{etype}"')
                continue
            
            # Initialize parent with corpus object by default.
            cursor = db.execute(
                    'INSERT OR REPLACE INTO corpus_object(couch_id, name, type, parent, metadata) VALUES (?, ?, ?, ?, ?)',
                    (doc['_id'],
                     doc.get('name', '<Unnamed Object>'),
                     sql_type.value,
                     corpus_id,
                     json.dumps(format_passport(doc))))

            if etype == 'BTSText':
                cursor.execute('INSERT INTO text_content (corpus_object, content_json) VALUES (?, ?)',
                        (cursor.lastrowid, json.dumps(list(text_content.extract(doc, render_mdc=False)))))

        # Link imported objects into parent/child tree
        for doc in documents:
            rels = doc.get('relations', [])
            if not rels:
                continue

            if len(rels) > 1:
                warn(f'Too many relations on document {doc["_id"]}')
                continue

            reltype = rels[0].get('type')
            if reltype != 'partOf':
                warn(f'Unhandled relation type {reltype} on document {doc["_id"]}')
                continue

            target = rels[0].get('objectId')
            if not target:
                warn(f'Empty partOf relation on document {doc["_id"]}')
                continue

            parent = db.execute('SELECT oid FROM corpus_object WHERE couch_id=?', (target,)).fetchone()
            if parent:
                db.execute('''UPDATE corpus_object SET parent=?  WHERE couch_id=?''', (parent[0], doc['_id']))
            else:
                warn(f'Cannot find parent {target} for object {doc["_id"]}')

if __name__ == '__main__':
    import argparse
    parser = argparse.ArgumentParser()
    parser.add_argument('json_dir', help=
            'BTS couchDB backup directory with one JSON file per collection named [collection name].json')
    parser.add_argument('sqlite_file', help='Output sqlite database file name')
    args = parser.parse_args()

    db = sqlite3.connect(args.sqlite_file)

    for fn in Path(args.json_dir).glob('*_corpus_*.json'):
        with open(fn) as f:
            import_json(db, json.load(f)['docs'], collection_name=fn.stem)

    # TODO Add corpus passport data

