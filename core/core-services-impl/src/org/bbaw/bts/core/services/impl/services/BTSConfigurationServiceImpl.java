package org.bbaw.bts.core.services.impl.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.comparator.BTSConfigSortKeyLabelSorter;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.osgi.service.prefs.BackingStoreException;

public class BTSConfigurationServiceImpl extends GenericObjectServiceImpl<BTSConfiguration, String> implements
		BTSConfigurationService
{

	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	@Inject
	private BTSConfigurationDao configurationDao;
	@Inject
	private IEclipseContext context;
	@Inject
	@Preference(value = BTSPluginIDs.ACTIVE_CONFIGURATION, nodePath = "org.bbaw.bts.app")
	protected String active_configuration_name;
	@Inject
	@Optional
	@Named(BTSCoreConstants.CONTEXT_TYPE_SUBTYEPE_LABEL_MAP)
	private HashMap<String, String> typeSubtypeLabelMap;
	private Map<String, String> typeSubtypeAbbreviationLabelMap;
	@Override
	public BTSConfiguration createNew()
	{
		BTSConfiguration config = BtsmodelFactory.eINSTANCE.createBTSConfiguration();
		config.setDBCollectionKey(main_project + BTSCoreConstants.ADMIN_SUFFIX);

		super.setId(config, config.getDBCollectionKey());
		super.setRevision(config);
		return config;
	}

	@Override
	public boolean save(BTSConfiguration entity)
	{
		if (entity != null)
		{
			configurationDao.add(entity, entity.getProject() + BTSCoreConstants.ADMIN_SUFFIX);
			// purge cache
			purgeCache();

		}
		if (active_configuration_name.equals(entity.getName())) {
			context.set(BTSPluginIDs.ACTIVE_CONFIGURATION, entity);
		}
		
		return true;
	}

	private void purgeCache() {
		typeSubtypeLabelMap = null;
		context.set(BTSCoreConstants.CONTEXT_TYPE_SUBTYEPE_LABEL_MAP, null);
		typeSubtypeAbbreviationLabelMap = null;
		context.set(BTSCoreConstants.CONTEXT_TYPE_SUBTYEPE_ABBREVIATION_LABEL_MAP, typeSubtypeAbbreviationLabelMap);
		context.set("passportConfigLabelmap", null);
	}

	@Override
	public void update(BTSConfiguration entity)
	{
		configurationDao.update(entity, entity.getProject() + BTSCoreConstants.ADMIN_SUFFIX);

	}

	@Override
	public void remove(BTSConfiguration entity)
	{
		configurationDao.remove(entity, entity.getProject() + BTSCoreConstants.ADMIN_SUFFIX);

	}

	@Override
	public BTSConfiguration find(String key, IProgressMonitor monitor)
	{
		BTSConfiguration config = null;
		config = configurationDao.find(key, main_project + BTSCoreConstants.ADMIN_SUFFIX);
		if (config != null)
		{
			return config;
		}
		for (String p : getActiveProjects())
		{
			config = configurationDao.find(key, p + BTSCoreConstants.ADMIN_SUFFIX);
			if (config != null)
			{
				return config;
			}
		}
		return null;
	}

	@Override
	public List<BTSConfiguration> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSConfiguration> configs = new Vector<BTSConfiguration>();
		for (String p : getAllProjects())
		{
			configs.addAll(configurationDao.list(p
					+ BTSCoreConstants.ADMIN_SUFFIX, objectState));
		}
		return configs;
	}
	

	@Override
	public List<BTSConfiguration> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSConfiguration> configs = new Vector<BTSConfiguration>();
		configs.addAll(configurationDao.listChunks(chunkSize, chunkIds,dbCollectionName, objectState));
		return filter(configs);
	}
	@Override
	public BTSConfigItem createNewConfigItem()
	{
		BTSConfigItem config = BtsmodelFactory.eINSTANCE.createBTSConfigItem();
		config.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
		config.setDescription(BtsmodelFactory.eINSTANCE.createBTSTranslations());
		config.setPassportEditorConfig(BtsmodelFactory.eINSTANCE.createBTSPassportEditorConfig());
		return config;
	}

	@Override
	public BTSConfigItem getActivePassportConfigItem()
	{
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null)
		{
			for (BTSConfig c : configuration.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(BTSCoreConstants.PASSPORT))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

	@Override
	public BTSConfiguration getActiveConfiguration()
	{
		BTSConfiguration activeConfig = (BTSConfiguration) context.get(BTSPluginIDs.ACTIVE_CONFIGURATION);
		if (activeConfig != null)
		{
			return (BTSConfiguration) activeConfig;
		}
		List<BTSConfiguration> list = list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		if (list == null || list.isEmpty())
		{
			return null;
		}
		
		activeConfig = list.get(0);
		if (active_configuration_name == null)
		{
			active_configuration_name = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.ACTIVE_CONFIGURATION, null); 
		}
		for (BTSConfiguration c : list) {
			if (active_configuration_name.equals(c.getProvider())) {
				activeConfig = c;
				break;
			}
		}
		context.set(BTSPluginIDs.ACTIVE_CONFIGURATION, activeConfig);
		return activeConfig;
	}

	@Override
	public BTSConfigItem getObjectTypesConfigItem()
	{
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null)
		{
			for (BTSConfig c : configuration.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null && ci.getValue().equals(BTSCoreConstants.OBJECT_TYPES))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSConfiguration> query(BTSQueryRequest query,
			String objectState, boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSConfiguration> objects = new Vector<BTSConfiguration>();
		String[] indexArray = buildIndexArray();
		objects.addAll(configurationDao.query(query, indexArray, indexArray, objectState,
				registerQuery));
		return filter(objects);
	}
	@Override
	public List<BTSConfiguration> query(BTSQueryRequest query,
			String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public List<BTSConfiguration> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
	{
		return configurationDao.findByQueryId(queryId, dbPath,
				objectState);
	}

	@Override
	public BTSConfigItem getConfigItemOfObjectType(BTSObject object,
			boolean strict) {
		BTSConfigItem objectTypesCI = getObjectTypesConfigItem();
		if (objectTypesCI == null) return null;
		String oClass = findObjectClass((BTSObject) object);
		for (BTSConfig c : objectTypesCI.getChildren()) {
			if (oClass.equals(((BTSConfigItem) c).getValue())) {
				if (object.getType() == null || "".equals(object.getType())) {
					return (BTSConfigItem) c;
				} else {
					for (BTSConfig cc : c.getChildren()) {
						if (object.getType().equalsIgnoreCase(
								((BTSConfigItem) cc).getValue())) {
							if (object.getSubtype() != null
									&& "".equals(object.getSubtype())) {
								for (BTSConfig ccc : cc.getChildren()) {
									if (object.getSubtype().equalsIgnoreCase(
											((BTSConfigItem) ccc).getValue())) {
										return (BTSConfigItem) ccc;
									}

								}
								if (!strict) {
									return (BTSConfigItem) cc;
								}
							} else {
								return (BTSConfigItem) cc;
							}
						}

					}
				}
			}

		}
		return null;
	}

	@Override
	public String findObjectClass(BTSObject corpusObject) {
		if (corpusObject.eClass().getName().startsWith("BTSAbstractText")) {
			return BTSConstants.BASIC_OBJECT_TYPES[0];
		}else if (corpusObject.eClass().getName().startsWith("BTSAnnotation")) {
			return BTSConstants.BASIC_OBJECT_TYPES[1];
		}
		else if (corpusObject.eClass().getName().startsWith("BTSTCObject")) {
			return BTSConstants.BASIC_OBJECT_TYPES[2];
		} else if (corpusObject.eClass().getName().startsWith("BTSImage")) {
			return BTSConstants.BASIC_OBJECT_TYPES[3];
		} else if (corpusObject.eClass().getName().startsWith("BTSLemmaEntry")) {
			return BTSConstants.BASIC_OBJECT_TYPES[4];
		} 
		else if (corpusObject.eClass().getName().startsWith("BTSTextCorpus")) {
			return BTSConstants.BASIC_OBJECT_TYPES[6];
		}
		else if (corpusObject.eClass().getName().startsWith("BTSText")) {
			return BTSConstants.BASIC_OBJECT_TYPES[5];
		}
		  else if (corpusObject.eClass().getName().startsWith("BTSThsEntry")) {
			return BTSConstants.BASIC_OBJECT_TYPES[7];
		} else if (corpusObject.eClass().getName().startsWith("BTSComment")) {
			return BTSConstants.BASIC_OBJECT_TYPES[8];
		}
		return null;
	}

	@Override
	public BTSConfigItem getRelationsConfigItem() {
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null) {
			for (BTSConfig c : configuration.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null
							&& ci.getValue().equals(BTSCoreConstants.RELATIONS)) {
						return ci;
					}
				}
			}
		}
		return null;
	}
	
	public BTSConfigItem getVisibilityConfigItem() {
		BTSConfiguration config = getActiveConfiguration();
		if (config != null) {
			for (BTSConfig c : config.getChildren()) {
				if (BTSCoreConstants.VISIBILITY_CONFIG.equals(((BTSConfigItem) c)
						.getValue())) {
					return (BTSConfigItem) c;
				}
			}
		}
		return null;
	}

	

	public BTSConfigItem getReviewStatusConfigItem() {
		BTSConfiguration config = getActiveConfiguration();
		for (BTSConfig c : config.getChildren()) {
			if (BTSCoreConstants.REVIEW_STATUS_CONFIG
					.equals(((BTSConfigItem) c).getValue())) {
				return (BTSConfigItem) c;
			}
		}
		return null;
	}

	@Override
	public boolean objectTypesPathsContainsObjectype(
			Map<String, List<String>> ownerTypesMap,
			BTSObject object) {
		if (object == null) {
			return false;
		}
		if (ownerTypesMap == null)
		{
			return true;
		}
		else
		{
			String oClass = findObjectClass(object);
			String oType = object.getType();
			String oSubtype = object.getSubtype();
			return objectTypesPathMapContainsObject(ownerTypesMap, oClass,
					oType, oSubtype, 2);

		}
	}
	public void calculateChildrenRecurcively(BTSObjectTypeTreeNode rootpath,
			BTSConfig config, BTSConfigItem pathClonesList,
			BTSObject object) {
		if (rootpath != null) {
		for (BTSObjectTypeTreeNode pathEntry : rootpath.getChildren()) {
			if (pathEntry instanceof BTSObjectTypeTreeNode) {
				for (BTSConfig c : config.getChildren()) {
					if (c instanceof BTSConfigItem) {
						BTSConfigItem l1CI = (BTSConfigItem) c;
						if (!l1CI.isIgnore()
								&& l1CI.getValue() != null
								&& l1CI.getValue().equals(
										((BTSObjectTypeTreeNode) pathEntry)
												.getValue())
								&& objectTypesPathsContainsObjectype(
										l1CI.getOwnerTypesMap(), object)) {
							int size = pathClonesList.getChildren().size();

							calculateChildrenRecurcively(pathEntry, l1CI,
									pathClonesList, object);
							if (pathClonesList.getChildren().size() == size) {
								// add this level if no children were added
								pathClonesList.getChildren().add(
										EcoreUtil.copy(l1CI));
							}

						}
					}
				}
			}
		}
		} else {
			for (BTSConfig c : config.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem l1CI = (BTSConfigItem) c;
					if (!l1CI.isIgnore()
							&& l1CI.getValue() != null
							&& objectTypesPathsContainsObjectype(
									l1CI.getOwnerTypesMap(), object)) {
						int size = pathClonesList.getChildren().size();

						calculateChildrenRecurcively(null, l1CI,
								pathClonesList, object);
						if (pathClonesList.getChildren().size() == size) {
							// add this level if no children were added
							pathClonesList.getChildren().add(
									EcoreUtil.copy(l1CI));
						}

					}
				}
			}
		}

	}

	public void calculateChildrenReferncedObjectsRecurcively(
			BTSObjectTypeTreeNode rootpath, BTSConfig config,
			BTSConfigItem pathClonesList, BTSObject object) {
		if (rootpath != null) {
			for (BTSObjectTypeTreeNode pathEntry : rootpath.getChildren()) {
				if (pathEntry instanceof BTSObjectTypeTreeNode) {
					for (BTSConfig c : config.getChildren()) {
						if (c instanceof BTSConfigItem) {
							BTSConfigItem l1CI = (BTSConfigItem) c;
							if (!l1CI.isIgnore() && l1CI.getValue() != null
									// && l1CI.getValue().equals(
									// ((ObjectTypePathEntry) pathEntry)
									// .getValue())
//									//FIXME update
//									&& objectTypesPathsContainsObjectype(l1CI
//											.getPassportEditorConfig()
//											.getReferencedTypesPath(),
//											corpusObject)) {
									){
								int size = pathClonesList.getChildren().size();

								calculateChildrenReferncedObjectsRecurcively(
										pathEntry, l1CI, pathClonesList,
										object);
								if (pathClonesList.getChildren().size() == size) {
									// add this level if no children were added
									pathClonesList.getChildren().add(
											EcoreUtil.copy(l1CI));
								}

							}
						}
					}
					break;
				}
			}
		} else if (config != null) {
			for (BTSConfig c : config.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem l1CI = (BTSConfigItem) c;
					if (!l1CI.isIgnore()
							&& l1CI.getValue() != null
							&& objectTypesPathsContainsObjectype(
									l1CI.getOwnerTypesMap(), object)) {
						int size = pathClonesList.getChildren().size();

						calculateChildrenRecurcively(null, l1CI,
								pathClonesList, object);
						if (pathClonesList.getChildren().size() == size) {
							// add this level if no children were added
							pathClonesList.getChildren().add(
									EcoreUtil.copy(l1CI));
						}

					}
				}
			}
		}

	}
	
	private boolean objectTypesMapContainsObject(
			Map<String, List<String>> ownerTypesMap, BTSConfig root,
			BTSConfig child, BTSConfig grandChild, BTSConfig grandGrandChild) {
		if (root != null)
		{
			if (child != null)
			{
				if (grandChild != null)
				{
					if (grandGrandChild != null)
					{
						return objectTypesPathMapContainsObject(ownerTypesMap, ((BTSConfigItem) root).getValue(),
								((BTSConfigItem) child).getValue(), 
								((BTSConfigItem) grandChild).getValue(), 3);
					}
					return objectTypesPathMapContainsObject(ownerTypesMap, ((BTSConfigItem) root).getValue(),
							((BTSConfigItem) child).getValue(), 
							((BTSConfigItem) grandChild).getValue(), 3);
				}
				return objectTypesPathMapContainsObject(ownerTypesMap, ((BTSConfigItem) root).getValue(),
						((BTSConfigItem) child).getValue(), 
						null, 2);
			}
			return objectTypesPathMapContainsObject(ownerTypesMap, ((BTSConfigItem) root).getValue(),
					null, 
					null, 1);
		}
		return false;
	}
	
	private boolean objectTypesPathMapContainsObject(
			Map<String, List<String>> ownerTypesMap, String oClass,
			String oType, String oSubtype, int level) {
		if (ownerTypesMap.containsKey(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
		{
			return true;
		}
		else if (ownerTypesMap.containsKey(oClass))
		{
			return true;
		}
		else if (ownerTypesMap.containsKey(BTSCoreConstants.OBJECT_TYPES 
				+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oClass))
		{
			return true;
		}
		else if (oType != null && !"".equals(oType.trim()))
				
		{
			if (ownerTypesMap.containsKey(oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType))
			{
				return true;
			}
			else if (ownerTypesMap.containsKey(BTSCoreConstants.OBJECT_TYPES 
					+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType))
			{
				return true;
			}
			else if (oSubtype != null && !"".equals(oSubtype.trim()) 
					&&ownerTypesMap.containsKey(oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype))
			{
				return true;
			}
			else if (oSubtype != null && !"".equals(oSubtype.trim()) 
					&&ownerTypesMap.containsKey(BTSCoreConstants.OBJECT_TYPES 
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR +oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype))
			{
				return true;
			}
		}
		
		return false;
	}
	
	private boolean objectTypesPathStringContainsObject(
			String ownerType, String oClass,
			String oType, String oSubtype) {
		if (ownerType == null) return false;
		if (ownerType.equals(BTSConstants.OWNER_REFERENCED_TYPES_ANY))
		{
			return true;
		}
		else if (ownerType.equals(oClass))
		{
			return true;
		}
		else if (ownerType.equals(BTSCoreConstants.OBJECT_TYPES 
				+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oClass))
		{
			return true;
		}
		else if (oType != null && !"".equals(oType.trim()))
				
		{
			if (ownerType.equals(oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType))
			{
				return true;
			}
			else if (ownerType.equals(BTSCoreConstants.OBJECT_TYPES 
					+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType))
			{
				return true;
			}
			else if (oSubtype != null && !"".equals(oSubtype.trim()) 
					&&ownerType.equals(oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype))
			{
				return true;
			}
			else if (oSubtype != null && !"".equals(oSubtype.trim()) 
					&&ownerType.equals(BTSCoreConstants.OBJECT_TYPES 
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR +oClass + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oType
							+ BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + oSubtype))
			{
				return true;
			}
		}
		
		return false;
	}
	

	@Override
	public BTSConfigItem getReviewStateConfigItemProcessedClones(
			BTSObject corpusObject) {
		BTSConfigItem reviewStatusCI = getReviewStatusConfigItem();
		BTSConfigItem reviewStatusClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		if (corpusObject == null)
		{
			for (BTSConfig c : reviewStatusCI.getChildren()) {
				if (c instanceof BTSConfigItem && !((BTSConfigItem) c).isIgnore() && ((BTSConfigItem) c).getValue() != null) {
					reviewStatusClone.getChildren().add(
						EcoreUtil.copy(c));
				}
			}
			return reviewStatusClone;
		}
		boolean found = false;
		if (reviewStatusCI != null && reviewStatusCI.getChildren() != null) {
			for (BTSConfig c : reviewStatusCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem visCI = (BTSConfigItem) c;
					if (!visCI.isIgnore()
							&& objectTypesPathsContainsObjectype(
									visCI.getOwnerTypesMap(), corpusObject)
							&& visCI.getValue() != null) {
						reviewStatusClone.getChildren().add(
								EcoreUtil.copy(visCI));
						if (corpusObject.getRevisionState() != null
								&& !"".equals(corpusObject.getRevisionState())
								&& visCI.getValue() != null
								&& visCI.getValue().equals(
										corpusObject.getRevisionState())) {
							found = true;
						}

					}
				}
			}
			if (corpusObject != null && !found
					&& corpusObject.getRevisionState() != null
					&& !"".equals(corpusObject.getRevisionState())) {
				BTSConfigItem ci = BtsmodelFactory.eINSTANCE
						.createBTSConfigItem();
				ci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
				ci.getLabel().setTranslation(corpusObject.getRevisionState(),
						lang);
				ci.setValue(corpusObject.getRevisionState());
				reviewStatusClone.getChildren().add(ci);
			}

			return reviewStatusClone;
		}

		return reviewStatusClone;
	}

	@Override
	public BTSConfigItem getObjectTypeConfigItemProcessedClones(BTSObject object) {
		String className = findObjectClass(object);

		return getObjectTypeConfigItemProcessedClonesInternal(className, object.getType());
	}
		/**
	 * @param className
	 * @param type
	 * @return
	 */
	private BTSConfigItem getObjectTypeConfigItemProcessedClonesInternal(String className, String type) {
		BTSConfigItem typesCI = getObjectTypesConfigItem();
		BTSConfigItem typeClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		List<BTSConfig> children = new Vector<BTSConfig>();
		boolean found = false;
		if (typesCI != null && typesCI.getChildren() != null) {
			for (BTSConfig c : typesCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem typeCI = (BTSConfigItem) c;
					if (!typeCI.isIgnore() && typeCI.getValue() != null
							&& typeCI.getValue().equals(className)) {
						for (BTSConfig cc : typeCI.getChildren()) {
							if (cc instanceof BTSConfigItem) {
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
										) {
									children.add(
											EcoreUtil.copy(ci));
									if (type != null
											&& !"".equals(type)
											&& ci.getValue() != null
											&& ci.getValue().equals(
													type)) {
										found = true;
									}
								}
							}
						}
						if (!found && type != null
								&& !"".equals(type)) {
							BTSConfigItem ci = BtsmodelFactory.eINSTANCE
									.createBTSConfigItem();
							ci.setLabel(BtsmodelFactory.eINSTANCE
									.createBTSTranslations());
							ci.getLabel().setTranslation(
									type, lang);
							ci.setValue(type);
							children.add(ci);
						}
						Collections.sort(children, new BTSConfigSortKeyLabelSorter());
						typeClone.getChildren().addAll(children);
						return typeClone;
					}
				}
			}
		}

		Collections.sort(children, new BTSConfigSortKeyLabelSorter());
		typeClone.getChildren().addAll(children);
		return typeClone;
	}

	@Override
	public BTSConfigItem getVisibilityConfigItemProcessedClones(BTSObject object) {
		BTSConfigItem visibilityCI = getVisibilityConfigItem();

		BTSConfigItem visibilityClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		if (object == null) {
			for (BTSConfig c : visibilityCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem visCI = (BTSConfigItem) c;
					if (!visCI.isIgnore()&& visCI.getValue() != null) {
						visibilityClone.getChildren()
								.add(EcoreUtil.copy(visCI));
					}
				}
			}
			return visibilityClone;
		}
		boolean found = false;
		if (visibilityCI != null && visibilityCI.getChildren() != null) {
			for (BTSConfig c : visibilityCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem visCI = (BTSConfigItem) c;
					if (!visCI.isIgnore()
							&& objectTypesPathsContainsObjectype(
									visCI.getOwnerTypesMap(), object)
							&& visCI.getValue() != null) {
						visibilityClone.getChildren()
								.add(EcoreUtil.copy(visCI));
						if (object.getVisibility() != null
								&& !"".equals(object.getVisibility())
								&& visCI.getValue() != null
								&& visCI.getValue().equals(
										object.getVisibility())) {
							found = true;
						}

					}
				}
			}
			if (object != null && !found
					&& object.getVisibility() != null
					&& !"".equals(object.getVisibility())) {
				BTSConfigItem ci = BtsmodelFactory.eINSTANCE
						.createBTSConfigItem();
				ci.setLabel(BtsmodelFactory.eINSTANCE.createBTSTranslations());
				ci.getLabel()
						.setTranslation(object.getVisibility(), lang);
				ci.setValue(object.getVisibility());
				visibilityClone.getChildren().add(ci);
			}
			return visibilityClone;
		}

		return visibilityClone;
	}

	@Override
	public BTSConfigItem getObjectSubtypeConfigItemProcessedClones(
			BTSObject object) {
		String className = findObjectClass(object);
		return getObjectSubtypeConfigItemProcessedClones(className, object.getType(), object.getSubtype());
	}
		/**
	 * @param className
	 * @param type
	 * @param subtype
	 * @return
	 */
	private BTSConfigItem getObjectSubtypeConfigItemProcessedClones(String className, String type, String subtype) {
		BTSConfigItem typesCI = getObjectTypesConfigItem();
		
		BTSConfigItem subtypeClone = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		List<BTSConfig> children = new Vector<BTSConfig>();

		boolean found = false;
		if (typesCI != null && typesCI.getChildren() != null) {
			for (BTSConfig c : typesCI.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem typeCI = (BTSConfigItem) c;
					if (!typeCI.isIgnore() && typeCI.getValue() != null
							&& typeCI.getValue().equals(className)) {
						for (BTSConfig cc : typeCI.getChildren()) {
							if (cc instanceof BTSConfigItem) {
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
										&& ci.getValue() != null
										&& ci.getValue().equals(
												type)) {
									for (BTSConfig ccc : ci.getChildren()) {
										if (cc instanceof BTSConfigItem) {
											BTSConfigItem cci = (BTSConfigItem) ccc;
											if (!cci.isIgnore()) {
												children.add(
														EcoreUtil
														.copy(cci));
												if (subtype != null
														&& !"".equals(subtype)
														&& cci.getValue() != null
														&& cci.getValue()
																.equals(subtype)) {
													found = true;
												}
											}
										}
									}
									if (!found
											&& subtype != null
											&& !"".equals(subtype)) {
										BTSConfigItem cci = BtsmodelFactory.eINSTANCE
												.createBTSConfigItem();
										cci.setLabel(BtsmodelFactory.eINSTANCE
												.createBTSTranslations());

										cci.getLabel()
												.setTranslation(
														subtype,
														lang);
										cci.setValue(subtype);
										subtypeClone.getChildren().add(cci);
									}
									BTSConfigItem ci2 = BtsmodelFactory.eINSTANCE
											.createBTSConfigItem();
									ci2.setLabel(BtsmodelFactory.eINSTANCE
											.createBTSTranslations());
									ci2.getLabel().setTranslation("", lang);
									ci2.setValue(null);
									children.add(ci2);
									Collections.sort(children, new BTSConfigSortKeyLabelSorter());
									subtypeClone.getChildren().addAll(children);
									return subtypeClone;
								}
							}
						}
					}

				}
			}
		}

		Collections.sort(children, new BTSConfigSortKeyLabelSorter());
		subtypeClone.getChildren().addAll(children);
		return subtypeClone;
	}

	@Override
	public List<BTSConfigItem> getPassportCategories(BTSObject object) {
		BTSConfigItem passportCI = getActivePassportConfigItem();
		List<BTSConfigItem> categories = new ArrayList<BTSConfigItem>();
		if (passportCI != null && passportCI.getChildren() != null)
		{
			for (BTSConfig c : passportCI.getChildren())
			{
				if (c instanceof BTSConfigItem)
				{
					BTSConfigItem categoriesCI = (BTSConfigItem) c;
					if (!categoriesCI.isIgnore()
							&& categoriesCI.getValue() != null
							&& categoriesCI.getValue().equals(
									BTSCoreConstants.CATEGORIES)
							&& categoriesCI.getChildren() != null)
					{
						for (BTSConfig cc : categoriesCI.getChildren())
						{
							if (cc instanceof BTSConfigItem)
							{
								BTSConfigItem ci = (BTSConfigItem) cc;
								if (!ci.isIgnore()
										&& (objectTypesPathsContainsObjectype(
										ci.getOwnerTypesMap(), object) || object == null))
								{
									categories.add(ci);
								}
							}
						}
						return categories;
					}
				}
			}
		}

		return categories;
	}

	@Override
	public BTSConfigItem getIdentifiersConfigItem() {
		BTSConfiguration configuration = getActiveConfiguration();
		if (configuration != null && configuration.getChildren() != null) {
			for (BTSConfig c : configuration.getChildren()) {
				if (c instanceof BTSConfigItem) {
					BTSConfigItem ci = (BTSConfigItem) c;
					if (ci.getValue() != null
							&& ci.getValue().equals(BTSCoreConstants.IDENTIFIERS)) {
						return ci;
					}
				}
			}
		}
		return null;
	}

	@Override
	public void setActiveConfiguration(BTSConfiguration configuration) {
		ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.ACTIVE_CONFIGURATION, configuration.getProvider());
		InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.ACTIVE_CONFIGURATION, configuration.getProvider());

		context.set(BTSPluginIDs.ACTIVE_CONFIGURATION, configuration);
		IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		prefs.put(BTSPluginIDs.ACTIVE_CONFIGURATION, configuration.getProvider());
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		prefs = InstanceScope.INSTANCE.getNode("org.bbaw.bts.app");
		prefs.put(BTSPluginIDs.ACTIVE_CONFIGURATION, configuration.getProvider());
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BTSConfiguration createNew(BTSConfiguration originalconfiguration) {
		BTSConfiguration config = createNew();
		String dbcoll = config.getDBCollectionKey();
		Copier copier = new Copier();
		config = (BTSConfiguration) copier.copy(originalconfiguration);
//		copyChildrenRecursively(config, originalconfiguration, copier);
//		config = EmfModelHelper.mergeChanges(config, originalconfiguration);
		config.getRevisions().clear();
		config.getReaders().clear();
		config.getUpdaters().clear();

		config.setDBCollectionKey(dbcoll);
		config.setProject(main_project);
		super.setId(config, config.getDBCollectionKey());
		super.setRevision(config);

		return config;
	}

	@Override
	public String getLabelOfTypeSubtypeString(BTSObject object, boolean prefereAbbreviation) {
		String str = object.getType();
		if (str == null) return null;
		BTSConfigItem objectTypesCI = getObjectTypesConfigItem();
		if (objectTypesCI == null) return null;
		String oClass = findObjectClass((BTSObject) object);
		String labelKeyString = oClass;
		if (str != null)
		{
			labelKeyString+= "/" + str;
		}
		if (object.getSubtype() != null)
		{
			labelKeyString+= "/" + object.getSubtype();
		}
		if (prefereAbbreviation)
		{
			return getInternalAbbreviationLabelOfTypeSubtypeString(object, labelKeyString, objectTypesCI, oClass);
		}
		Map<String, String> labelMap = getTypeSubtypeLabelMap();
		if (labelMap.containsKey(labelKeyString))
		{
			return labelMap.get(labelKeyString);
		}
		for (BTSConfig c : objectTypesCI.getChildren()) {
			if (oClass.equals(((BTSConfigItem) c).getValue())) {
//				str = ((BTSConfigItem) c).getLabel().getTranslation(lang);
				if (object.getType() == null || "".equals(object.getType())) {
					return null;
				} else {
					for (BTSConfig cc : c.getChildren()) {
						if (object.getType().equalsIgnoreCase(
								((BTSConfigItem) cc).getValue())) {
							str = ((BTSConfigItem) cc).getLabel().getTranslation(lang);
							if (object.getSubtype() != null
									&& !"".equals(object.getSubtype())) {
								for (BTSConfig ccc : cc.getChildren()) {
									if (object.getSubtype().equalsIgnoreCase(
											((BTSConfigItem) ccc).getValue())) {
										str = str + "/" + ((BTSConfigItem) ccc).getLabel().getTranslation(lang);
										labelMap.put(labelKeyString, str);
										return str;
									}

								}
								labelMap.put(labelKeyString, str);
								return str;
							} else {
								labelMap.put(labelKeyString, str);
								return str;
							}
						}

					}
				}
			}

		}
		
		return null;
	}

	private String getInternalAbbreviationLabelOfTypeSubtypeString(
			BTSObject object, String labelKeyString, BTSConfig objectTypesCI, Object oClass) {
		Map<String, String> abbreviationMap = getTypeSubtypeAbbreviationLabelMap();
		if (abbreviationMap.containsKey(labelKeyString))
		{
			return abbreviationMap.get(labelKeyString);
		}
		String str = object.getType();
		if (str == null) return null;
		for (BTSConfig c : objectTypesCI.getChildren()) {
			if (oClass.equals(((BTSConfigItem) c).getValue())) {
//				str = ((BTSConfigItem) c).getLabel().getTranslation(lang);
				if (object.getType() == null || "".equals(object.getType())) {
					return null;
				} else {
					for (BTSConfig cc : c.getChildren()) {
						if (object.getType().equalsIgnoreCase(
								((BTSConfigItem) cc).getValue())) {
							if (((BTSConfigItem) cc).getAbbreviation() != null)
							{
								str = ((BTSConfigItem) cc).getAbbreviation();
							}
							else
							{
								str = ((BTSConfigItem) cc).getLabel().getTranslation(lang);
							}
							if (object.getSubtype() != null
									&& !"".equals(object.getSubtype())) {
								for (BTSConfig ccc : cc.getChildren()) {
									if (object.getSubtype().equalsIgnoreCase(
											((BTSConfigItem) ccc).getValue())) {
										if (((BTSConfigItem) ccc).getAbbreviation() != null)
										{
											str = str + "/" + ((BTSConfigItem) ccc).getAbbreviation();
										}
										else
										{
											str = str + "/" + ((BTSConfigItem) ccc).getLabel().getTranslation(lang);
										}
										abbreviationMap.put(labelKeyString, str);
										return str;
									}

								}
								abbreviationMap.put(labelKeyString, str);
								return str;
							} else {
								abbreviationMap.put(labelKeyString, str);
								return str;
							}
						}

					}
				}
			}

		}
		return null;
	}

	private Map<String, String> getTypeSubtypeAbbreviationLabelMap() {
		if (typeSubtypeAbbreviationLabelMap == null)
		{
			typeSubtypeAbbreviationLabelMap = new HashMap<String, String>();
			context.set(BTSCoreConstants.CONTEXT_TYPE_SUBTYEPE_ABBREVIATION_LABEL_MAP, typeSubtypeAbbreviationLabelMap);
		}
		return typeSubtypeAbbreviationLabelMap;
	}

	private Map<String, String> getTypeSubtypeLabelMap() {
		if (typeSubtypeLabelMap == null)
		{
			typeSubtypeLabelMap = new HashMap<String, String>();
			context.set(BTSCoreConstants.CONTEXT_TYPE_SUBTYEPE_LABEL_MAP, typeSubtypeLabelMap);
		}
		return typeSubtypeLabelMap;
	}

	@Override
	public BTSConfigItem calculateReferencedConfigItemsProcessedClones(
			BTSConfigItem itemConfig, BTSConfig configuration, BTSObject object) {
		BTSConfigItem rootItem = BtsmodelFactory.eINSTANCE.createBTSConfigItem();
		if (itemConfig == null || object == null) return rootItem;
		String oClass = findObjectClass(object);
		String oType = object.getType();
		String oSubtype = object.getSubtype();
		for(String ownerType : itemConfig.getOwnerTypesMap().keySet())
		{
			if (objectTypesPathStringContainsObject(ownerType, oClass, oType, oSubtype))
			{
				List<String> referencedTypes = itemConfig.getOwnerTypesMap().get(ownerType);
				if (referencedTypes != null && !referencedTypes.isEmpty())
				{
					for (String referencedType : referencedTypes)
					{
						BTSConfigItem configItem = findConfigItemByConfigPath(referencedType, configuration);
						if (configItem != null)
						{
							rootItem.getChildren().add(EcoreUtil.copy(configItem));
//							for (BTSConfig cc : configItem.getChildren())
//							{
//								rootItem.getChildren().add(EcoreUtil.copy(cc));
//							}
						}
					}
				}
			}
		}
		return rootItem;
	}

	private BTSConfigItem findConfigItemByConfigPath(String referencedType, BTSConfig config) {
		BTSConfig localConfig = null;
		int index = 1;

		if (referencedType.startsWith(BTSCoreConstants.OBJECT_TYPES))
		{
			localConfig = getObjectTypesConfigItem();
		}
		else if (config instanceof BTSConfiguration && referencedType.startsWith(((BTSConfiguration)config).get_id()))
		{
			localConfig = config;
		}
		else
		{
			for (BTSConfig child : config.getChildren())
			{
				if (child instanceof BTSConfigItem && referencedType.startsWith(((BTSConfigItem)child).getValue()))
				{
					localConfig = child;
					break;
				}
			}
		}
		if (localConfig == null)
		{
			index = 0;
			localConfig = getActiveConfiguration();
		}
		String[] path = referencedType.split("\\" + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR);
		BTSConfigItem child = findBTSConfigItemByPath(localConfig, path, index);
		return child;
	}

	private BTSConfigItem findBTSConfigItemByPath(BTSConfig parentConfig,
			String[] path, int index) {
		if (path.length <= index)
		{
			if (parentConfig instanceof BTSConfigItem)
			{
				return (BTSConfigItem) parentConfig;
			}
			return null;
		}
		String configValue = path[index];
		for (BTSConfig child : parentConfig.getChildren())
		{
			if (child instanceof BTSConfigItem && configValue.equals(((BTSConfigItem)child).getValue()))
			{
				return findBTSConfigItemByPath(child, path, index + 1);
			}
		}
		return null;
	}

	@Override
	public List<String> getListOfReferencedObjectTypeSubtypesOfObject(
			BTSObject object, BTSConfigItem itemConfig) {

		String oClass = findObjectClass(object);
		String oType = object.getType();
		String oSubtype = object.getSubtype();
		List<String> result = new Vector<String>();

		for (Entry<String, List<String>> e : itemConfig.getOwnerTypesMap().entrySet()) {
			String domainType = e.getKey();
			List<String> rangeTypes = e.getValue();
			// if no range list given, consider listed type legal for relation object
			if (rangeTypes == null) {
				String type = domainType.startsWith(BTSCoreConstants.OBJECT_TYPES) ?
						domainType.substring(BTSCoreConstants.OBJECT_TYPES.length() + 1) :
						domainType;
				result.add(type);
			} else if (objectTypesPathStringContainsObject(domainType, oClass, oType, oSubtype)) {
				// otherwise, find legal object types in entries containing subject type
				for (String rangeType : rangeTypes) {
					String type = rangeType.startsWith(BTSCoreConstants.OBJECT_TYPES) ?
							rangeType.substring(BTSCoreConstants.OBJECT_TYPES.length() + 1) :
							rangeType;
					result.add(type);
				}
			}
		}
		return result;
	}

	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String config = configurationDao.findAsJsonString(key, main_project + BTSCoreConstants.ADMIN_SUFFIX);
		if (config != null)
		{
			return config;
		}
		for (String p : getActiveProjects())
		{
			config = configurationDao.findAsJsonString(key, p + BTSCoreConstants.ADMIN_SUFFIX);
			if (config != null)
			{
				return config;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		List<String> objects = new Vector<String>();
		String[] indexArray = buildIndexArray();
		objects.addAll(configurationDao.queryAsJsonString(query, indexArray, indexArray, objectState,
						false));
		return objects;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.BTSConfigurationService#getObjectTypeConfigItemProcessedClones(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public BTSConfigItem getObjectTypeConfigItemProcessedClones(String className, String type) {
		if (type == null) return getObjectTypeConfigItemProcessedClonesInternal(className, type);
		else return getObjectSubtypeConfigItemProcessedClones(className, type, null);
	}




//	private void copyChildrenRecursively(BTSConfig config,
//			BTSConfig originalconfiguration, Copier copier) {
//		for (BTSConfig c : originalconfiguration.getChildren())
//		{
//			BTSConfigItem ci = BtsmodelFactory.eINSTANCE.createBTSConfigItem();
//			String id = ci.get_id();
//			ci = (BTSConfigItem) copier.copy(c);
//			ci.set_id(id);
//			config.getChildren().add(ci);
//			copyChildrenRecursively(ci, c, copier);
//		}
//		if (originalconfiguration instanceof BTSConfigItem)
//		{
//			BTSTranslations t = ((BTSConfigItem)originalconfiguration).getDescription();
//			BTSTranslations ti = (BTSTranslations) copier.copy(t);
//			for (BTSTranslation tt : t.getTranslations())
//			{
//				BTSTranslation tti = BtsmodelFactory.eINSTANCE.createBTSTranslation();
//				tti = (BTSTranslation) copier.copy(tt);
//				ti.getTranslations().add(tti);
//			}
//			((BTSConfigItem)config).setDescription(ti);
//			
//			BTSPassportEditorConfig p = ((BTSConfigItem)originalconfiguration).getPassportEditorConfig();
//			BTSPassportEditorConfig pi = (BTSPassportEditorConfig) copier.copy(p);
//			((BTSConfigItem)config).setPassportEditorConfig(pi);
//		}
//	}


	
}
