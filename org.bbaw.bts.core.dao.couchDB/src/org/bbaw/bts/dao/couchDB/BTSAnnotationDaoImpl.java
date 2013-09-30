package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.core.dao.BTSAnnotationDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;

import com.google.gson.JsonObject;

@Creatable
public class BTSAnnotationDaoImpl extends CouchDBDao<BTSAnnotation, String> implements BTSAnnotationDao
{

	@Override
	public List<BTSAnnotation> list(String path)
	{
		List<JsonObject> allDocs = getCouchDBClient(path).view(CouchDBConstants.VIEW_ALL_BTSANNOTATIONS)
				.includeDocs(true).query(JsonObject.class);
		ArrayList<BTSAnnotation> results = new ArrayList<BTSAnnotation>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(CouchDBConstants.ID_STRING).getAsString());
			if (!jo.get(CouchDBConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(local_db_url + path + jo.get(CouchDBConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSAnnotation) resource.getContents().get(0));
			}
		}
		return results;
	}

	@Override
	public boolean removeBTSAnnotation(BTSAnnotation annotation, String path)
	{

		// FIXME add logic and cache syncronisation
		super.remove(annotation, path);
		return true;
	}

}
