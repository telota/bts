package org.bbaw.bts.core.services.impl.services;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;

public abstract class GenericObjectServiceImpl<E extends BTSDBBaseObject, K extends Serializable> implements
		GenericObjectService<E, K>
{
	@Inject
	protected IEclipseContext context;
	
	@Inject
	protected CorpusObjectDao corpusObjectDao;
	
	@Inject
	protected GeneralPurposeDao generalPurposeDao;


	@Inject
	protected IDService idService;

	@Inject
	protected DBConnectionProvider connectionProvider;

	@Inject
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_PROJECTS, nodePath = "org.bbaw.bts.app")
	protected String active_projects;

	@Inject
	@Preference(value = BTSPluginIDs.PREF_MAIN_PROJECT_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_project;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	private String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;

	@Inject
	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;

	protected Class<? extends BTSDBBaseObject> daoType;

	@Inject
	private BTSEvaluationService evaluationService;

	@SuppressWarnings("unchecked")
	public GenericObjectServiceImpl()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		System.out.println("Construct GenericObjectServiceImpl");
	}

	@Override
	public abstract E createNew();

	public void setId(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			((BTSDBBaseObject) entity).set_id(idService.createId());
			entity.setProject(main_project);
			if (authenticatedUser != null)
			{
				entity.getUpdaters().add(authenticatedUser.getUserName());
			}
		}
		if (entity instanceof BTSCorpusObject)
		{
			((BTSCorpusObject) entity).setCorpusPrefix(main_corpus_key);
		}
	}

	public void setRevision(E entity)
	{
		if (entity instanceof BTSDBBaseObject)
		{
			// FIXME fill out!
		}
	}
	
	public void reloadConflicts(E entity)
	{
		 generalPurposeDao.reloadConflicts(entity);
	}

	@Override
	public abstract boolean save(E entity);

	@Override
	public boolean saveMultiple(Set<E> entities)
	{
		// FIXME optimize batch saving!!!
		for (E entity : entities)
		{
			save(entity);
		}
		return true;
	}

	@Override
	public abstract void update(E entity);

	@Override
	public abstract void remove(E entity);

	public boolean removeRevision(E entity, String revision) {
		return generalPurposeDao.remove(entity, entity.getDBCollectionKey(), revision);

		}
		
	@Override
	public abstract E find(K key);

	@Override
	public E find(K key, String path, String revision) {
		if (path != null && !"".equals(path))
		{
			return (E) generalPurposeDao.find((String)key, path, revision);
		}
//		BTSCorpusObject tcObject = null;
//		tcObject = corpusObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + main_corpus_key, revision);
//		if (tcObject != null)
//		{
//			return tcObject;
//		}
//		for (String c : getActive_corpora())
//		{
//			tcObject = corpusObjectDao.find(key, main_project + ServiceConstants.CORPUS_INTERFIX + c, revision);
//			if (tcObject != null)
//			{
//				return tcObject;
//			}
//		}
//		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
//		{
//			for (String c : getActive_corpora())
//			{
//				tcObject = corpusObjectDao.find(key, p + ServiceConstants.CORPUS_INTERFIX + c, revision);
//				if (tcObject != null)
//				{
//					return tcObject;
//				}
//			}
//		}
//		return tcObject;
		return null;
	}

	@Override
	public abstract List<E> list(String objectState);

	@Override
	public abstract List<E> query(BTSQueryRequest query, String objectState);

	public List<E> filter(List<E> objects)
	{
		return evaluationService.filter(objects);

	}

	public SearchRequestBuilder getSearchRequestBuilder() {
		return new SearchRequestBuilder(
				connectionProvider.getSearchClient(Client.class));
	}

	@Override
	public void addRevisionStatement(E entity) {

		if (entity instanceof AdministrativDataObject) {
			Date now = Calendar.getInstance(Locale.getDefault()).getTime();

			if (!((AdministrativDataObject) entity).getRevisions().isEmpty()) {
				BTSRevision rev = ((AdministrativDataObject) entity)
						.getRevisions().get(
								((AdministrativDataObject) entity)
										.getRevisions().size() - 1);
				if (rev != null
						&& now.getTime() > (rev.getTimeStamp().getTime() + 10000)) {
					addRevisionStatementInternal(
							(AdministrativDataObject) entity, now);
				}
			}
 else {
				addRevisionStatementInternal((AdministrativDataObject) entity,
						now);
			}

		}
	}

	private void addRevisionStatementInternal(AdministrativDataObject entity,
			Date now) {
		if (entity != null && authenticatedUser != null) {
			BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
			rev.setRef(entity.getRevisions().size());

			rev.setTimeStamp(now);
			rev.setUserId(authenticatedUser.get_id());
			entity.getRevisions().add(rev);
		}
	}

	protected String[] getActive_corpora() {
		return active_corpora.split(ServiceConstants.SPLIT_PATTERN);
	}

	protected void setActive_corpora(String active_corpora) {
		this.active_corpora = active_corpora;
	}
}
