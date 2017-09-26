package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.impl.util.BTSEgyObjectByNameComparator;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.elasticsearch.index.query.QueryBuilders;

public class LemmaNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSLemmaEntry, String> 
implements LemmaNavigatorController{

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	protected List<BTSLemmaEntry> retrieveTypedRootEntries(IProgressMonitor monitor) {
		return lemmaService.listRootEntries(monitor);
	}

	@Override
	protected List<BTSLemmaEntry> executeTypedQuery(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		query.setResponseFields(null);
		return lemmaService.query(query, objectState, monitor);
	}

	@Override
	protected BTSLemmaEntry typedCreateNew() {
		return lemmaService.createNew();
	}

	@Override
	protected List<BTSLemmaEntry> typedListEntries(String objectState, IProgressMonitor monitor) {
		return lemmaService.list(objectState, monitor);
	}

	@Override
	protected List<BTSLemmaEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return lemmaService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSLemmaEntry find(String id, IProgressMonitor monitor) {
		return lemmaService.find(id, monitor);
	}

	@Override
	public BTSLemmaSubentry createNewSubEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void sortEntries(List<BTSLemmaEntry> list) {
		Collections.sort(list, new BTSEgyObjectByNameComparator());
	}

	protected String[] getChildRelationTypes() {
		return new String[]{"partOf", "referencedBy", "referencing", "rootOf"};
	}
	
	protected String[] getChildSubEntryRelationTypes() {
		return new String[]{"partOf"};
	}


	
	@Override
	public LinkedHashMap<String, TreeNodeWrapper> loadNodesWithChildren(
			List<BTSLemmaEntry> subList, IProgressMonitor monitor, boolean b) {
		LinkedHashMap<String, TreeNodeWrapper> nodeReg = new LinkedHashMap<String, TreeNodeWrapper>();
		if (monitor != null)
			monitor.beginTask("Load nodes", subList.size());

		// initialize nodes registry with lemma wrappers
		for (BTSLemmaEntry lemma : subList) {
			TreeNodeWrapper node = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			node.setObject(lemma);
			nodeReg.put(lemma.get_id(), node);
		}
		

		// nest wrappers according to subList interrelations
		for (BTSLemmaEntry lemma : subList) {
			TreeNodeWrapper node = nodeReg.get(lemma.get_id());
			for (BTSRelation rel : lemma.getRelations())
				// XXX meh
				if (BTSCoreConstants.BASIC_RELATIONS_CONTAINS.equals(rel.getType())
						|| "successor".equals(rel.getType())
						|| "referencing".equals(rel.getType())) {
					if (nodeReg.containsKey(rel.getObjectId())) {
						TreeNodeWrapper childNode = nodeReg.get(rel.getObjectId());
						if (!node.getChildren().contains(childNode) && !ancestry(node, childNode)) {
							node.getChildren().add(childNode);
							childNode.setParent(node);
						}
					}
				} else if (BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType())
						|| "predecessor".equals(rel.getType())
						|| "referencedBy".equals(rel.getType()))
					if (nodeReg.containsKey(rel.getObjectId())) {
						TreeNodeWrapper parentNode = nodeReg.get(rel.getObjectId());
						if (!parentNode.getChildren().contains(node) && !ancestry(parentNode, node)) {
							parentNode.getChildren().add(node);
							node.setParent(parentNode);
						}
					}
			if (monitor != null)
				monitor.worked(1);
		}

		return nodeReg;
	}
	
	/**
	 * Checks if <code>test</code> is an ancestor of <code>node</code>.
	 * @param node
	 * @param test
	 * @return
	 */
	private static boolean ancestry(TreeNodeWrapper node, TreeNodeWrapper test) {
		for (;node != null; node = node.getParent())
			if (node.equals(test))
				return true;
		return false;
	}

	@Override
	public List<BTSLemmaEntry> findChildrenOnlySubEntries(BTSLemmaEntry parent, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.boolQuery().must(
				QueryBuilders.matchQuery("relations.objectId",	parent.get_id()))
				.must(QueryBuilders.matchQuery("relations.type", "partOf"))
				);
		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		
		query.setQueryId("relations.objectId-" + parent.get_id());
		System.out.println(query.getQueryId());
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		List<BTSLemmaEntry> children = executeTypedQuery(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor); //thsService.query(query,BTSConstants.OBJECT_STATE_ACTIVE);
		List<BTSLemmaEntry> result = new Vector<BTSLemmaEntry>(children.size());
		for (BTSLemmaEntry o : children)
		{
			if (!(o instanceof BTSAnnotation))
			{
				result.add(o);
			}
		}
		sortEntries(result);
		return result;
	}


	// zur liste der Kinder auch die Elemente hinzufügen, die sich aus den Relationen des Objekts selber ergeben,
	// über Relationen iterieren und entsp. Objekte finden
	@Override
	public List<BTSLemmaEntry> findChildren(BTSLemmaEntry parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		List<BTSLemmaEntry> children = super.findChildren(parent, queryResultMap, viewer, parentHolder,
				referenceName, monitor);
		
		if (children == null)
		{
			children = new Vector<BTSLemmaEntry>();
		}
		for (BTSRelation rel : parent.getRelations())
		{
			Object o = null;
			try {
				try {
					o = lemmaService.find(rel.getObjectId(), null);
				} catch (Exception e) {
				}
				if (o instanceof BTSLemmaEntry && !children.contains(o))
				{
					children.add((BTSLemmaEntry) o);
				}
			} catch (Exception e) {
			}
		}
		return children;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.corpus.controller.partController.GenericCorpusObjectNavigatorController#createNewAnnotation(org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject)
	 */
	@Override
	public BTSAnnotation createNewAnnotation(BTSLemmaEntry selection, String annotationTypePath) {
		BTSAnnotation anno = lemmaService
				.createNewAnnotationRelationPartOf(selection);
		setObjectTypePath(anno, annotationTypePath);

		return anno;
	}

}
