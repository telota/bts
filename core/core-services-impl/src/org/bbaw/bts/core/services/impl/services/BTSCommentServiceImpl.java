package org.bbaw.bts.core.services.impl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSCommentServiceImpl extends GenericObjectServiceImpl<BTSComment, String> implements BTSCommentService, BTSObjectSearchService{

	@Inject
	private BTSCommentDao commentDao;


	@Override
	public List<BTSComment> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor) {
		List<BTSComment> objects = new Vector<BTSComment>();
		
		String[] indexArray = buildIndexArray();
		
		try {
			objects.addAll(commentDao.query(query, indexArray, indexArray, objectState,
					registerQuery));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (monitor != null)
		{
			if (monitor.isCanceled()) return filter(objects);
			monitor.worked(20);
		}
		return objects;
	}

	

	@Override
	public BTSComment createNew() {
		BTSComment comment = BtsmodelFactory.eINSTANCE.createBTSComment();
		comment.setDBCollectionKey(main_project + BTSCoreConstants.ADMIN_SUFFIX);

		super.setId(comment, comment.getDBCollectionKey());
		super.setRevision(comment);
		return comment;
	}

	@Override
	public boolean save(BTSComment entity) {
		super.addRevisionStatement(entity);
		commentDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSComment entity) {
		commentDao.update(entity, entity.getDBCollectionKey());
		
	}

	@Override
	public void remove(BTSComment entity) {
		commentDao.remove(entity, entity.getDBCollectionKey());
		
	}

	@Override
	public BTSComment find(String key, IProgressMonitor monitor) {
		BTSComment comment = null;
		comment = commentDao.find(key, main_project + BTSCoreConstants.ADMIN_SUFFIX);
		if (comment != null)
		{
			return comment;
		}
		for (String p : getActiveProjects())
		{
			comment = commentDao.find(key, p + BTSCoreConstants.ADMIN_SUFFIX);
			if (comment != null)
			{
				return comment;
			}
		}
		return comment;
	}

	

	@Override
	public List<BTSComment> list(String objectState, IProgressMonitor monitor) {
		List<BTSComment> comments = new Vector<BTSComment>();
		for (String p : getActiveProjects())
		{
				comments.addAll(commentDao.list(p
						+ BTSCoreConstants.ADMIN_SUFFIX, objectState));
		}
		return filter(comments);
	}
	@Override
	public List<BTSComment> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);

	}
	
	@Override
	public List<BTSComment> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSComment> comments = new Vector<BTSComment>();
		comments.addAll(commentDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(comments);
	}
	
	@Override
	public List<BTSComment> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
	{
		return filter(commentDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public String getNameOfServedClass() {
		return "BTSComment";
	}

	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSComment.class;
	}

	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String comment = commentDao.findAsJsonString(key, main_project + BTSCoreConstants.ADMIN_SUFFIX);
		if (comment != null)
		{
			return comment;
		}
		for (String p : getActiveProjects())
		{
			comment = commentDao.findAsJsonString(key, p + BTSCoreConstants.ADMIN_SUFFIX);
			if (comment != null)
			{
				return comment;
			}
		}
		return comment;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		List<String> objects = new Vector<String>();
		String[] indexArray = buildIndexArray();
		try {
			objects.addAll(commentDao.queryAsJsonString(query, indexArray, indexArray, objectState,
					false));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (monitor != null)
		{
			if (monitor.isCanceled()) return objects;
			monitor.worked(20);
		}
		return objects;
	}

	
}
