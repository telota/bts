package org.eclipselabs.emfjson.internal;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {

    public static JsonParser getJsonParser(URL url) {
        final ObjectMapper mapper = new ObjectMapper();
        final JsonFactory jsonFactory = mapper.getFactory();
        JsonParser jp = null;
        try {
            jp = jsonFactory.createJsonParser(url);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return jp;
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

    public static JsonNode getRootNode(JsonParser jp) {
        final ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;

        if (jp != null) {
            try {
                rootNode = mapper.readValue(jp, JsonNode.class);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        return rootNode;
    }

}
