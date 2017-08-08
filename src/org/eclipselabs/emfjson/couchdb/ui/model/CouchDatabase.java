/******************************************************************************
 Copyright (c) 2012 Guillaume Hillairet.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html

 Contributors:
 Guillaume Hillairet - initial API and implementation
 */
package org.eclipselabs.emfjson.couchdb.ui.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class CouchDatabase {

    private String name;
    private CouchDB couchDB;

    public CouchDatabase(CouchDB couchDB, String name) {
        this.couchDB = couchDB;
        this.name = name;
    }

    public String getURL() {
        return this.couchDB.getURL() + this.name;
    }

    public String getName() {
        return name;
    }

    public List<CouchDocument> getDocuments() {
        List<CouchDocument> documents = new ArrayList<>();
        JsonNode rows = org.eclipselabs.emfjson.couchdb.internal.CouchDB.getListOfDocuments(couchDB.getURL() + "/" + name);
        if (rows != null && rows.isArray()) {
            for (Iterator<JsonNode> it = rows.elements(); it.hasNext(); ) {
                JsonNode node = it.next();
                documents.add(new CouchDocument(this,
                        node.get("id").asText(),
                        node.get("key").asText(),
                        node.get("revisions")));
            }
        }

        return documents;
    }
}
