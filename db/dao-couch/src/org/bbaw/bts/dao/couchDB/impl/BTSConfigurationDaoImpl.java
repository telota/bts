package org.bbaw.bts.dao.couchDB.impl;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class BTSConfigurationDaoImpl extends CouchDBDao<BTSConfiguration, String> implements BTSConfigurationDao {

    @Override
    public boolean removeBTSConfiguration(BTSConfiguration btsConfiguration, String path) {
        super.remove(btsConfiguration, path);
        return true;
    }

    @Override
    public List<BTSConfiguration> list(String path, String objectState) {
        String viewId = BTSConstants.VIEW_ALL_BTSCONFIGURATIONS;
        if (objectState != null
                && objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
            viewId = BTSConstants.VIEW_ALL_ACTIVE_BTSCONFIGURATIONS;
        } else if (objectState != null
                && objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
            viewId = BTSConstants.VIEW_ALL_TERMINATED_BTSCONFIGURATIONS;
        }
        List<String> allDocs = loadDocsFromView(viewId, path, DaoConstants.PROJECT_ADMIN);
        List<BTSConfiguration> results = loadObjectsFromStrings(allDocs, path);
        if (!results.isEmpty()) {
            registerQueryIdWithInternalRegistry(viewId, path);
        }
        return results;
//		List<String> allDocs = new ArrayList<String>(0);
//		View view;
//		try
//		{
//			view = connectionProvider.getDBClient(CouchDbClient.class, path)
//					.view(viewId);
//			allDocs = view.includeDocs(true).query();
//		} catch (NoDocumentException e)
//		{
//			e.printStackTrace();
//			createView(path, DaoConstants.PROJECT_ADMIN, viewId);
//			view = connectionProvider.getDBClient(CouchDbClient.class, path).view(viewId);
//			allDocs = view.includeDocs(true).query();
//		}
//
//		ArrayList<BTSConfiguration> results = new ArrayList<BTSConfiguration>();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
//		for (String jo : allDocs)
//		{
////			System.out.println(jo);
//			if (true)
//			{
//				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
//				Resource resource = resourceSet.getResource(uri, true);
//				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
//						new HashMap<Object, Object>());
//				loader.fillResource(resource);
//				results.add((BTSConfiguration) resource.getContents().get(0));
//			}
//		}
//		if (!results.isEmpty())
//		{
//			registerQueryIdWithInternalRegistry(viewId, path);
//		}
//		return results;
    }

}
