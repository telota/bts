/******************************************************************************
 Copyright (c) 2011 Guillaume Hillairet.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html

 Contributors:
 Guillaume Hillairet - initial API and implementation
 */
package org.eclipselabs.emfjson.couchdb.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;

import javax.xml.ws.http.HTTPException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.eclipse.emf.common.util.URI;
import org.eclipselabs.emfjson.internal.JSONSave;

/**
 * CouchDB, A simple client client for CouchDB Server.
 *
 * @author ghillairet
 */
public class CouchDB {

    private static final String rev = "_rev";
    private static final String allDbs = "_all_dbs";
    private static final String allDocs = "_all_docs";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";

    public static JsonNode getContent(URI uri) {
        JsonNode node = null;

        setAuthenticator(uri);

        HttpURLConnection connection = null;
        try {
            connection = getGetConnection(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (connection != null && connection.getResponseCode() == 200) {
                node = getRootNode(connection.getInputStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }

        return node;
    }

    public static HttpURLConnection getGetConnection(URI uri) throws IOException {
        URL url = null;
        try {
            url = new URL(uri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            return (HttpURLConnection) url.openConnection();
        } else {
            return null;
        }
    }

    public static HttpURLConnection getConnection(URI uri, String type) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) new URL(uri.toString()).openConnection();

        connection.setDoOutput(true);
        connection.setRequestMethod(type);
        connection.setRequestProperty("Content-Type", "application/json");

        return connection;
    }

    public static boolean isCouchDbService(URI uri) {
        final URI baseURI = uri.trimSegments(uri.segmentCount());
        boolean isCouchDB = false;
        setAuthenticator(uri);

        try {
            HttpURLConnection connection = getGetConnection(baseURI);
            try (InputStream inStream = connection.getInputStream()) {
                JsonNode node = getRootNode(inStream);
                isCouchDB = node.has("couchdb");
            } catch (Exception e) {
                return false;
            } finally {
                if (uri.userInfo() != null)
                    Authenticator.setDefault(null);
                connection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }

        return isCouchDB;
    }

    public static void createDataBase(URI uri) {
        setAuthenticator(uri);

        HttpURLConnection connection;
        try {
            String db = uri.segments()[0];
            URI baseURI = uri.trimSegments(uri.segmentCount());

            connection = getGetConnection(baseURI.appendSegment(db));
            connection.setDoOutput(true);
            connection.setRequestMethod(PUT);

            if (checkResponse(connection.getInputStream()) == 0) {
                throw new IllegalArgumentException("Could not create database on " + uri);
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }
    }

    public static int checkDataBase(URI uri) {
        final String[] segments = uri.segments();
        int result = 0;

        if (segments.length == 0) {
            throw new IllegalArgumentException();
        } else {

            setAuthenticator(uri);

            String database = segments[0];
            URI baseURI = uri.trimSegments(uri.segmentCount());

            HttpURLConnection connection = null;
            try {
                connection = getGetConnection(baseURI.appendSegment(allDbs));
                connection.setAllowUserInteraction(true);
                connection.setRequestProperty("Authorization", "Basic");
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }

            InputStream inputStream = null;
            try {
                inputStream = connection.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }

            JsonNode node = getRootNode(inputStream);

            if (node != null) {
                if (node.isArray()) {
                    for (Iterator<JsonNode> it = node.elements(); it.hasNext() && result == 0; ) {
                        JsonNode n = it.next();

                        if (database.equalsIgnoreCase(n.asText())) {
                            result = 1;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static String[] getListOfDatabases(String url) {
        URI uri = URI.createURI(url);
        try {

            setAuthenticator(uri);

            HttpURLConnection connection = getGetConnection(uri.appendSegment(allDbs));
            JsonNode node = getRootNode(connection.getInputStream());

            if (uri.userInfo() != null) {
                Authenticator.setDefault(null);
            }

            if (node != null) {

                if (node.isArray()) {

                    String[] result = new String[1];

                    for (Iterator<JsonNode> it = node.elements(); it.hasNext(); ) {
                        JsonNode n = it.next();
                        String value = n.asText();

                        if (!value.startsWith("_")) {
                            result[result.length - 1] = value;

                            if (it.hasNext()) {
                                result = Arrays.copyOf(result, result.length + 1);
                            }
                        }
                    }

                    return result;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static JsonNode getListOfDocuments(String url) {
        URI uri = URI.createURI(url);
        try {

            setAuthenticator(uri);

            HttpURLConnection connection = getGetConnection(uri.appendSegment(allDocs));
            JsonNode node = getRootNode(connection.getInputStream());

            if (uri.userInfo() != null) {
                Authenticator.setDefault(null);
            }

            if (node != null) {
                if (node.isObject()) {
                    return node.get("rows");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static URI getDocumentURI(URI baseURI, InputStream inStream) {
        final JsonNode rootNode = getRootNode(inStream);

        URI result = null;
        if (rootNode.isObject()) {
            JsonNode okNode = rootNode.findValue("ok");

            if (okNode.asBoolean()) {
                JsonNode idNode = rootNode.findValue("id");

                //plutte added check if baseURI not already ends with id
                if (!baseURI.path().endsWith(idNode.asText())) {
                    result = baseURI.appendSegment(idNode.asText());
                } else {
                    result = baseURI;
                }
            }
        }
        return result;
    }

    public static String getLastRevisionID(URI uri) {
        try {
            HttpURLConnection connection = getGetConnection(uri);
            JsonNode node = getRootNode(connection.getInputStream());
            return node.findValue(rev).asText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static URI createOrUpdateDocument(URI uri, JSONSave writer, JsonNode current) {
        if (current.isArray() && current.elements().hasNext()) {
            throw new IllegalArgumentException("Document Root must be an Object");
        }
        if (isUpdate(uri)) {
            return updateDocument(uri, writer, current);
        } else {
            return createDocument(uri, writer, current);
        }
    }

    public static void delete(URI uri) {
        if (checkDataBase(uri) == 1) {
            String[] segments = uri.segments();
            if (segments.length < 3) {
                HttpURLConnection connection;
                try {
                    connection = getConnection(uri, DELETE);
                    connection.connect();
                    int code = connection.getResponseCode();
                    if (code == 200) {
                        connection.getInputStream();
                    }
                    connection.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static JsonParser getJsonParser(InputStream inStream) {
        final ObjectMapper mapper = new ObjectMapper();
        final JsonFactory jsonFactory = mapper.getFactory();
        JsonParser jp = null;
        try {
            jp = jsonFactory.createJsonParser(inStream);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return jp;
    }

    private static URI updateDocument(URI uri, JSONSave writer, JsonNode current) {
        final String lastRevision = getLastRevisionID(uri);
        if (current.isObject()) {
            ((ObjectNode) current).put(rev, lastRevision);
        }

        HttpURLConnection connection;
        try {
            connection = getConnection(uri, PUT);
            OutputStream output = null;
            try {
                output = connection.getOutputStream();
                writer.writeValue(output, current);
            } finally {
                if (output != null) try {
                    output.close();
                } catch (IOException ignored) {
                }
            }
            try {
                if (connection.getResponseCode() >= 400) {
                    System.err.println(connection.getResponseMessage());
                    System.err.println(getRootNode(connection.getErrorStream()));
                    throw new HTTPException(connection.getResponseCode());
                } else {
                    return uri;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uri;
    }

    private static URI createDocument(URI uri, JSONSave writer, JsonNode current) {
        HttpURLConnection connection = null;
        try {
            connection = getConnection(uri, uri.segmentCount() == 1 ? POST : PUT);
            OutputStream output = null;
            try {
                if (current != null && current.isObject()) {
                    output = connection.getOutputStream();
                    writer.writeValue(output, current);
                } else {
                    output = connection.getOutputStream();
                    writer.writeValue(output, emptyNode());
                }
            } finally {
                if (output != null) try {
                    output.close();
                } catch (IOException ignored) {
                }
            }
            try {
                if (connection.getResponseCode() >= 400) {
                    System.err.println(connection.getResponseMessage());
                    System.err.println(getRootNode(connection.getErrorStream()));
                    throw new HTTPException(connection.getResponseCode());
                } else {
                    return getDocumentURI(uri, connection.getInputStream());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static boolean isUpdate(URI uri) {
        if (uri.segmentCount() > 1) {
            try {
                HttpURLConnection connection = getGetConnection(uri);
                if (connection.getResponseCode() == 200) {
                    return true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static void setAuthenticator(URI uri) {
        if (uri.userInfo() != null) {
            final String username = uri.userInfo().split(":")[0];
            final String password = uri.userInfo().split(":")[1];

            Authenticator.setDefault(new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password.toCharArray());
                }
            });

        }
    }

    private static int checkResponse(InputStream inStream) {
        try {
            JsonNode node = getRootNode(inStream);
            if (node != null && node.isObject()) {
                return node.findValue("ok") != null ? 1 : 0;
            }
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private static JsonNode getRootNode(InputStream inStream) {
        final JsonParser parser = getJsonParser(inStream);
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(parser, JsonNode.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static JsonNode emptyNode() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.createObjectNode();
    }
}
