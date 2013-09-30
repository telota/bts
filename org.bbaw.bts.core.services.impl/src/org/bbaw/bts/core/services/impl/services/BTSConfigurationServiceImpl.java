package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.core.dao.BTSConfigurationDao;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;

public class BTSConfigurationServiceImpl extends GenericObjectServiceImpl<BTSConfiguration, String> implements
		BTSConfigurationService
{

	@Inject
	private BTSConfigurationDao configurationDao;

	@Override
	public BTSConfiguration createNew()
	{
		BTSConfiguration config = BtsmodelFactory.eINSTANCE.createBTSConfiguration();
		super.setId(config);
		super.setRevision(config);
		return config;
	}

	@Override
	public boolean save(BTSConfiguration entity)
	{
		if (entity != null)
		{
			configurationDao.add(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);
		}
		return false;
	}

	@Override
	public void update(BTSConfiguration entity)
	{
		configurationDao.update(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public void remove(BTSConfiguration entity)
	{
		configurationDao.remove(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public BTSConfiguration find(String key)
	{
		BTSConfiguration config = null;
		config = configurationDao.find(key, main_project + ServiceConstants.ADMIN_SUFFIX);
		if (config != null)
		{
			return config;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			config = configurationDao.find(key, p + ServiceConstants.ADMIN_SUFFIX);
			if (config != null)
			{
				return config;
			}
		}
		return null;
	}

	@Override
	public List<BTSConfiguration> list()
	{
		List<BTSConfiguration> configs = new Vector<BTSConfiguration>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			configs.addAll(configurationDao.list(p + ServiceConstants.ADMIN_SUFFIX));
		}
		return configs;
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
					if (ci.getValue() != null && ci.getValue().equals(BTSUIConstants.PASSPORT))
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
		// FIXME logic!!!
		List<BTSConfiguration> list = list();
		if (list == null || list.isEmpty())
		{
			BTSConfiguration config = createNew();
			save(config);
		}
		return list().get(0);
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
					if (ci.getValue() != null && ci.getValue().equals(BTSUIConstants.OBJECT_TYPES))
					{
						return ci;
					}
				}
			}
		}
		return null;
	}

}
