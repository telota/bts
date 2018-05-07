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
        CREATE TABLE IF NOT EXISTS corpus_objects(
            oid INTEGER PRIMARY KEY,
            couch_id TEXT DEFAULT null, -- CouchDB object ID
            name TEXT,
            type INTEGER, -- object type:
                          -- Corpus(0), Object(1), Part(2), Caption(3), Scene(4), Group(5), Arrangement(6), Text(7)
            parent INTEGER,
            metadata TEXT DEFAULT "{}", -- JSON passport data
            FOREIGN KEY (parent) REFERENCES corpus_objects(oid) ON DELETE CASCADE
        )
    ''')

    db.execute('''
        INSERT OR IGNORE INTO corpus_objects(oid, name, type, parent) VALUES (
            0, "Database root object", 0, null
        )
    ''')

    db.execute('INSERT OR IGNORE INTO corpus_objects(name, type, parent) VALUES (?, 0, 0)', (project_name,))

    db.execute('''
        INSERT INTO corpus_objects(name, type, parent) VALUES (
            ?, 0, (SELECT oid FROM corpus_objects WHERE parent=0 AND name=?)
        ) 
    ''', (corpus_name, project_name))

    db.execute('''
        CREATE TABLE IF NOT EXISTS text_content(
            oid INTEGER PRIMARY KEY,
            corpus_object INTEGER,
            content_json TEXT,
            FOREIGN KEY (corpus_object) REFERENCES corpus_objects(oid) ON DELETE CASCADE
        )
    ''')

    # Import all objects into corpus_objects table
    with db as connection:
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
            
            cursor = db.execute(
                    'INSERT INTO corpus_objects(couch_id, name, type, parent, metadata) VALUES (?, ?, ?, ?, ?)',
                    (doc['_id'], doc.get('name', '<Unnamed Object>'), sql_type.value, 0, json.dumps(format_passport(doc))))

            if etype == 'BTSText':
                cursor.execute('INSERT INTO text_content (corpus_object, content_json) VALUES (?, ?)',
                        (cursor.lastrowid, json.dumps(list(text_content.extract(doc, render_mdc=False)))))

    # Link imported objects into parent/child tree

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

