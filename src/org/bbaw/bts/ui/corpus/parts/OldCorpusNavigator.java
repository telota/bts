//package org.bbaw.bts.ui.corpus.parts;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Vector;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import org.bbaw.bts.btsmodel.BTSDBBaseObject;
//import org.bbaw.bts.btsmodel.BTSObject;
//import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
//import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
//import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
//import org.bbaw.bts.commons.BTSPluginIDs;
//import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
//import org.bbaw.bts.core.commons.BTSCoreConstants;
//import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
//import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
//import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
//import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
//import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
//import org.bbaw.bts.searchModel.BTSQueryRequest;
//import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
//import org.bbaw.bts.ui.commons.search.SearchViewer;
//import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
//import org.bbaw.bts.ui.commons.viewerSorter.BTSObjectByNameViewerSorter;
//import org.bbaw.bts.ui.main.handlers.NewConfigurationHandler;
//import org.eclipse.core.commands.Command;
//import org.eclipse.core.commands.ParameterizedCommand;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.IStatus;
//import org.eclipse.core.runtime.Status;
//import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.e4.core.commands.ECommandService;
//import org.eclipse.e4.core.commands.EHandlerService;
//import org.eclipse.e4.core.contexts.IEclipseContext;
//import org.eclipse.e4.core.di.annotations.Optional;
//import org.eclipse.e4.core.di.extensions.EventTopic;
//import org.eclipse.e4.core.services.log.Logger;
//import org.eclipse.e4.ui.di.Focus;
//import org.eclipse.e4.ui.di.UISynchronize;
//import org.eclipse.e4.ui.services.EMenuService;
//import org.eclipse.e4.ui.services.IServiceConstants;
//import org.eclipse.e4.ui.services.internal.events.EventBroker;
//import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.edit.domain.EditingDomain;
//import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
//import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
//import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
//import org.eclipse.jface.viewers.ISelectionChangedListener;
//import org.eclipse.jface.viewers.SelectionChangedEvent;
//import org.eclipse.jface.viewers.StructuredSelection;
//import org.eclipse.jface.viewers.TreePath;
//import org.eclipse.jface.viewers.TreeViewer;
//import org.eclipse.jface.viewers.Viewer;
//import org.eclipse.jface.viewers.ViewerSorter;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//
//public class OldCorpusNavigator implements ScatteredCachingPart, SearchViewer
//{
//
//	@Inject
//	private EventBroker eventBroker;
//	@Inject
//	private CorpusNavigatorController corpusNavigatorController;
//	// Get UISynchronize injected as field
//	@Inject
//	private UISynchronize sync;
//	// use field injection for the service
//	@Inject
//	private ESelectionService selectionService;
//
//	@Inject
//	private IEclipseContext context;
//
//	@Inject
//	private PermissionsAndExpressionsEvaluationController evaluationController;
//
//	@Inject
//	@Optional
//	@Named(BTSUIConstants.SELECTION_TYPE)
//	private String selectionType;
//	
//	@Inject
//	private Logger logger;
//	
//
//	@Inject
//	private EMenuService menuService;
//
//	@Inject
//	private ECommandService commandService;
//
//	@Inject
//	private EHandlerService handlerService;
//	
//	private TreeViewer treeViewer;
//	private StructuredSelection selection;
//	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();
//	private Map<String, List<TreeNodeWrapper>> viewHolderMap = new HashMap<String, List<TreeNodeWrapper>>();
//
//	private EditingDomain editingDomain;
//	private ISelectionChangedListener selectionListener;
//	private Composite composite;
//
//	private Map<Control, Map> cachingMap = new HashMap<Control, Map>();
//
//
//	@Inject
//	public OldCorpusNavigator()
//	{
//		// TODO Your code here
//	}
//
//	@PostConstruct
//	public void postConstruct(Composite parent)
//	{
//		logger.info("Calling postconstruct on CorpusNavigatorPart");
//		parent.setLayout(new GridLayout());
//		((GridLayout) parent.getLayout()).marginHeight = 0;
//		((GridLayout) parent.getLayout()).marginWidth = 0;
//		composite = new Composite(parent, SWT.NONE);
//		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
//		composite.setLayout(new GridLayout());
//		((GridLayout) composite.getLayout()).marginHeight = 0;
//		((GridLayout) composite.getLayout()).marginWidth = 0;
//
//		treeViewer = new TreeViewer(composite);
//		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
//		treeViewer.getTree().setLayout(new GridLayout());
//
//		loadInput(composite);
//		// register context menu on the table
//		menuService.registerContextMenu(
//				treeViewer.getControl(),
//				BTSPluginIDs.POPMENU_CORPUS_NAVIGATOR_TREE_MENU);
//		parent.layout();
//		// parent.pack();
//		// tryRunnable();
//	}
//
//	private void loadInput(final Control parentControl)
//	{
//		Job job = new Job("load input")
//		{
//			@Override
//			protected IStatus run(IProgressMonitor monitor)
//			{
//				final TreeNodeWrapper root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
//
//				// input = new WritableList(nodes, TreeNodeWrapper.class);
//				// Set the writeableList as input for the viewer
//				// Create sample data
//				final List<BTSCorpusObject> obs = corpusNavigatorController.getRootEntries(queryResultMap,
//						treeViewer, root, BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, BTSCorpusConstants.VIEW_CORPUS_ROOT_OBJECTS);
//				storeIntoMap(obs, parentControl);
//				List<TreeNodeWrapper> nodes = loadNodes(obs);
//				root.getChildren().addAll(nodes);
//				logger.info("CorpusNavigatorPart load Input, no of children " + nodes.size());
//
//				// If you want to update the UI
//				sync.asyncExec(new Runnable()
//				{
//					@Override
//					public void run()
//					{
//						loadTree(root, parentControl);
//					}
//				});
//				return Status.OK_STATUS;
//			}
//		};
//
//		// Start the Job
//		job.schedule();
//
//	}
//
//	private void loadChildren(final List<TreeNodeWrapper> parents, boolean includeGrandChildren,
//			final Control parentControl)
//	{
//		Job job = new Job("load children")
//		{
//			@Override
//			protected IStatus run(IProgressMonitor monitor)
//			{
//				final List<TreeNodeWrapper> grandChildren = new Vector<>();
//				for (final TreeNodeWrapper parent : parents)
//				{
//					final List<BTSCorpusObject> children = corpusNavigatorController.findChildren(
//							(BTSCorpusObject) parent.getObject(), queryResultMap, treeViewer, parent,
//							BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
//
//					storeIntoMap(children, parentControl);
//					// If you want to update the UI
//					sync.asyncExec(new Runnable()
//					{
//
//						@Override
//						public void run()
//						{
//							System.out.println("add children" + children.size());
//							for (BTSObject o : children)
//							{
//								TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
//								tn.setObject(o);
//								addTooHolderMap(o, tn);
//								tn.setParent(parent);
//								// grandChildren.add(tn);
//								parent.getChildren().add(tn);
//							}
//							parent.setChildrenLoaded(true);
//
//						}
//
//					});
//				}
//				// loadChildren(grandChildren, false);
//
//				return Status.OK_STATUS;
//			}
//		};
//		// Start the Job
//		job.schedule();
//		refreshTreeViewer(null);
//	}
//
//	protected void storeIntoMap(final List<BTSCorpusObject> children, final Control parentControl)
//	{
//		if (parentControl != null && children != null && !children.isEmpty())
//		{
//			Map map = null;
//			if (cachingMap.get(parentControl) != null && cachingMap.get(parentControl) instanceof Map)
//			{
//				map = (Map) cachingMap.get(parentControl);
//			} else
//			{
//				map = new HashMap<URI, Resource>();
//				cachingMap.put(parentControl, map);
//			}
//			if (map != null)
//			{
//				for (BTSCorpusObject o : children)
//				{
//					map.put(o.eResource().getURI(), o.eResource());
//				}
//			}
//
//		}
//
//	}
//
//	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn)
//	{
//		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o).get_id());
//		if (list == null)
//		{
//			list = new Vector<TreeNodeWrapper>(1);
//		}
//		if (!list.contains(tn))
//		{
//			list.add(tn);
//		}
//		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);
//
//	}
//
//	private void loadTree(TreeNodeWrapper root, final Control parentControl)
//	{
//		//
//		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
//		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(factory);
//
//		treeViewer.setContentProvider(contentProvider);
//		treeViewer.setLabelProvider(labelProvider);
//
//		treeViewer.setUseHashlookup(true);
//		selectionListener = new ISelectionChangedListener()
//		{
//
//			private BTSCorpusObject selectedTreeObject;
//
//			@Override
//			public void selectionChanged(SelectionChangedEvent event)
//			{
//				selection = (StructuredSelection) event.getSelection();
//				if (selection.getFirstElement() != null && selection.getFirstElement() instanceof TreeNodeWrapper)
//				{
//					TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
//					if (tn.getObject() != null)
//					{
//						BTSObject o = (BTSObject) tn.getObject();
//						if (!o.equals(selectedTreeObject))
//						{
//							if (!BTSUIConstants.SELECTION_TYPE_SECONDARY
//									.equals(selectionType)) {
//								executeSaveAllCommand();
//								selectionService.setSelection(o);
//							} else {
//								eventBroker.post(
//										"ui_secondarySelection/corpusNavigator", o);
//
//							}
//							if (o instanceof BTSCorpusObject)
//							{
//								selectedTreeObject = (BTSCorpusObject) o;
//								if (!tn.isChildrenLoaded() || tn.getChildren().isEmpty())
//								{
//									List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
//									parents.add(tn);
//									tn.setChildrenLoaded(true);
//									loadChildren(parents, false, parentControl);
//								}
//								
//							}
//						}
//						
//					}
//
//				}
//			}
//		};
//
//		treeViewer.setSorter(new BTSObjectByNameViewerSorter());
//		treeViewer.setInput(root);
//		treeViewer.addSelectionChangedListener(selectionListener);
//
//	}
//
//	private void executeSaveAllCommand() {
//
//		ParameterizedCommand cmd = commandService.createCommand(
//				"org.eclipse.ui.file.saveAll", null);
//
//		handlerService.executeHandler(cmd);
//		
//	}
//
//	private List<TreeNodeWrapper> loadNodes(List<BTSCorpusObject> obs)
//	{
//		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(obs.size());
//		for (BTSObject o : obs)
//		{
//			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
//			tn.setObject(o);
//			nodes.add(tn);
//		}
//		return nodes;
//	}
//
//	@PreDestroy
//	public void preDestroy()
//	{
//		// TODO Your code here
//	}
//
//	@Focus
//	public void onFocus()
//	{
//		evaluationController
//				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
//	}
//
//	@Inject
//	@Optional
//	void eventReceivedNew(
//@EventTopic("model_new/*") BTSObject object)
//	{
//		if (object instanceof BTSTextCorpus)
//		{
//			addObjectToInput((BTSCorpusObject) object);
//		} else if ((object instanceof BTSTCObject || object instanceof BTSText) && selection != null
//				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSCorpusObject)
//		{
////			corpusNavigatorController.addRelation((BTSCorpusObject) object,
////					BTSCoreConstants.BASIC_RELATIONS_PARTOF,
////					(TreeNodeWrapper) selection.getFirstElement());
//
//			//			refreshTreeViewer((BTSCorpusObject) object);
//
//		}
//	}
//
////	@Inject
////	@Optional
////	void eventReceivedAdd(@EventTopic("model_add/*") BTSObject object) {
//////		if (object instanceof BTSAnnotation
//////				&& selection != null
//////				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSCorpusObject) {
//////			corpusNavigatorController.addRelation((BTSCorpusObject) object,
//////					BTSCoreConstants.BASIC_RELATIONS_PARTOF,
//////					(TreeNodeWrapper) selection.getFirstElement());
//////
//////			// refreshTreeViewer((BTSCorpusObject) object);
//////
//////		}
////	}
//
//	@Inject
//	@Optional
//	void eventReceivedUpdates(@EventTopic("model_update/*") BTSModelUpdateNotification object)
//	{
//		logger.info("CorpusNavigatorPart eventReceivedUpdates. object: " + object);
//
//		if (object instanceof BTSTextCorpus)
//		{
//			sync.asyncExec(new Runnable()
//			{
//				public void run()
//				{
//					// if (input.contains(object))
//					// {
//					// input.remove(object);
//					// input.add(object);
//					//
//					// } else
//					// {
//					// input.add(object);
//					// }
//				}
//			});
//		} else if (object instanceof BTSTCObject && selection != null
//				&& selection.getFirstElement() instanceof BTSCorpusObject)
//		{
//			// corpusNavigatorController.addRelation((BTSCorpusObject) object,
//			// "partOf",
//			// (BTSCorpusObject) selection.getFirstElement(), input);
//
//			refreshTreeViewer((BTSTCObject) object);
//		} else if (object instanceof BTSTCObject)
//		{
//			refreshTreeViewer((BTSTCObject) object);
//		} else if (object instanceof BTSModelUpdateNotification)
//		{
//			if (corpusNavigatorController.handleModelUpdate((BTSModelUpdateNotification) object, queryResultMap,
//					viewHolderMap))
//			{
//				refreshTreeViewer((BTSCorpusObject) ((BTSModelUpdateNotification) object).getObject());
//			}
//
//		}
//	}
//
//	private void refreshTreeViewer(final BTSCorpusObject btsCorpusObject)
//	{
//		sync.asyncExec(new Runnable()
//		{
//			public void run()
//			{
//				if (treeViewer != null && !treeViewer.getTree().isDisposed())
//				{
//					treeViewer.removeSelectionChangedListener(selectionListener);
//					for (TreePath path : treeViewer.getExpandedTreePaths())
//						System.out.println(path.getLastSegment());
//					treeViewer.refresh();
//					treeViewer.addSelectionChangedListener(selectionListener);
//				}
//			}
//		});
//
//	}
//
//	private void addObjectToInput(final BTSCorpusObject object)
//	{
//		sync.asyncExec(new Runnable()
//		{
//			@Override
//			public void run()
//			{
//				List<BTSCorpusObject> obs = new Vector<BTSCorpusObject>(1);
//				obs.add(object);
//				storeIntoMap(obs, composite);
//				List<TreeNodeWrapper> nodes = loadNodes(obs);
//				((TreeNodeWrapper) treeViewer.getInput()).getChildren().addAll(nodes);
//			}
//		});
//
//	}
//
//	@Override
//	public List<Map> getScatteredCashMaps()
//	{
//		final List<Map> maps = new Vector<Map>(1);
//		if (composite != null && cachingMap.containsKey(composite) && cachingMap.get(composite) instanceof Map)
//		{
//			Map map = (Map) cachingMap.get(composite);
//			maps.add(map);
//
//		}
//		return maps;
//	}
//
//	@Inject
//	void setSelection(
//			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
//		if (selection == null) {
//			/* implementation not shown */
//		} else if (treeViewer != null){
//			if ((selection instanceof BTSCorpusObject) && ((selection instanceof BTSThsEntry)
//					|| (selection instanceof BTSLemmaEntry))) {
//				treeViewer.setSelection(null);
//			}
//			System.out.println("CorpusNavigator selection received");
//		}
//	}
//
//	@Override
//	public void dispose() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void search(BTSQueryRequest query, String queryName) {
//		// TODO Auto-generated method stub
//		
//	}
//}