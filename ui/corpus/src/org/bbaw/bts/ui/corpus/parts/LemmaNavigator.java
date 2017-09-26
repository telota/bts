package org.bbaw.bts.ui.corpus.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.bbaw.bts.ui.corpus.parts.corpusNavigator.BTSCorpusObjectBySortKeyNameViewerSorter;
import org.bbaw.bts.ui.corpus.parts.lemma.BTSLemmaBySortKeyNameViewerSorter;
import org.bbaw.bts.ui.corpus.sorter.BTSEgyObjectByNameViewerSorter;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;

public class LemmaNavigator extends NavigatorPart implements ScatteredCachingPart, SearchViewer, StructuredViewerProvider
{

	@Inject
	private EventBroker eventBroker;
	@Inject
	private LemmaNavigatorController lemmaNavigatorController;
	// Get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	// use field injection for the service
	@Inject
	private ESelectionService selectionService;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private EMenuService menuService;
	
	@Inject
	@Optional
	@Named(BTSUIConstants.SELECTION_TYPE)
	private String selectionType;

	@Inject
	@Active
	@Optional
	private Shell parentShell;
	
	@Inject
	private Logger logger;
	
	private TreeViewer mainTreeViewer;
	private StructuredSelection selection;
	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();
	private Map<String, List<TreeNodeWrapper>> viewHolderMap = new HashMap<String, List<TreeNodeWrapper>>();

	private ISelectionChangedListener selectionListener;
	private Composite composite;

	private Map<Control, Map> cachingMap = new HashMap<Control, Map>();
	private TreeNodeWrapper mainRootNode;
	private CTabFolder tabFolder;
	private CTabItem mainTabItem;
	private Composite mainTabItemComp;
	private CTabItem binTabItem;
	private Composite binTabItemComp;
	private TreeViewer bintreeViewer;
	private boolean loaded;
	protected TreeNodeWrapper orphanNode;
	private ViewerSorter sorter;
	@Inject
	private IEclipseContext context;
	
	@PostConstruct
	public void createComposite(Composite parent)
	{
		if (parentShell == null ) parentShell = new Shell();

		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;

		tabFolder = new CTabFolder(composite, SWT.None);
		tabFolder.setSimple(false);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		tabFolder.addSelectionListener(new SelectionAdapter() {
			
			private TreeNodeWrapper binRootNode;

			@Override
			public void widgetSelected(SelectionEvent e) {
				CTabItem ti = tabFolder.getSelection();
				Object o = ti.getData("key");
				Object o2 = ti.getData("loaded");
				Object tv = ti.getData("tv");
				TreeViewer treeViewer;
				if (tv != null && tv instanceof TreeViewer) {
					treeViewer = (TreeViewer) tv;
					treeViewer.refresh();
				}
				boolean loaded = false;
				if (o2 != null && (boolean) o2)
				{
					loaded = true;
				}
				if (o != null && o instanceof String)
				{
					if (((String)o).equals("bin"))
					{
						if (!loaded)
						{
							binRootNode = BtsviewmodelFactory.eINSTANCE
									.createTreeNodeWrapper();
							loadInput(binTabItemComp, bintreeViewer,
									binRootNode, true);
							// ti.setData("loaded", true);
						}
						
					}
				}
				
			}
		});

		// create main tab item
		mainTabItem = new CTabItem(tabFolder, SWT.NONE);
		mainTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LEMMATA));
		mainTabItem.setText("WL");
		mainTabItem.setData("key", "main");

		mainTabItemComp = new Composite(tabFolder, SWT.NONE);
		mainTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		mainTabItemComp.setLayout(new GridLayout());
		((GridLayout) mainTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) mainTabItemComp.getLayout()).marginWidth = 0;

		mainTabItem.setControl(mainTabItemComp);

		mainTreeViewer = new TreeViewer(mainTabItemComp);
		mainTreeViewer.getTree()
				.setLayoutData(new GridData(GridData.FILL_BOTH));
		mainTreeViewer.getTree().setLayout(new GridLayout());

		mainRootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		prepareTreeViewer(mainTreeViewer, mainTabItemComp);
		loadInput(mainTabItemComp, mainTreeViewer, mainRootNode, false);

		mainTabItem.setData("tv", mainTreeViewer);

		mainTabItemComp.layout();
				
		
		// create bin tab item
		binTabItem = new CTabItem(tabFolder, SWT.NONE);
		binTabItem.setText("Bin");
		binTabItem.setData("key", "bin");
		binTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_BIN));

		binTabItemComp = new Composite(tabFolder, SWT.NONE);
		binTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		binTabItemComp.setLayout(new GridLayout());
		((GridLayout) binTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) binTabItemComp.getLayout()).marginWidth = 0;

		binTabItem.setControl(binTabItemComp);

		bintreeViewer = new TreeViewer(binTabItemComp);
		bintreeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		bintreeViewer.getTree().setLayout(new GridLayout());
		binTabItem.setData("tv", bintreeViewer);
		prepareTreeViewer(bintreeViewer, binTabItemComp);

		binTabItemComp.layout();
		// loadInput(mainTabItemComp);

		tabFolder.setSelection(mainTabItem);
		parent.layout();
		loaded = true;
	}

	private void prepareTreeViewer(final TreeViewer treeViewer,
			final Composite parentControl) {
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider.StyledLabelProvider labelProvider = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, treeViewer);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(labelProvider));

		treeViewer.setUseHashlookup(true);
		selectionListener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (StructuredSelection) event.getSelection();
				System.out.println(event.getSelection());
				if (selection.getFirstElement() != null
						&& selection.getFirstElement() instanceof TreeNodeWrapper) {
					final TreeNodeWrapper tn = (TreeNodeWrapper) selection
							.getFirstElement();
					if (tn.getObject() != null) {
						BTSObject o = (BTSObject) tn.getObject();
						if (o instanceof BTSCorpusObject) {
							lemmaNavigatorController.checkAndFullyLoad((BTSCorpusObject) o, true);

							if (!tn.isChildrenLoaded() || tn.getChildren().isEmpty()) {
								List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
								parents.add(tn);
								tn.setChildrenLoaded(true);
								loadChildren(parents, false, parentControl);
								Job j = new Job("expand") {
									@Override
									protected IStatus run(IProgressMonitor monitor) {
										sync.asyncExec(new Runnable() {
											public void run() {
												treeViewer.setExpandedState(tn, true);
											}
										});
										return Status.OK_STATUS;
									}
								};
								j.schedule(750);
							}
							if (!BTSUIConstants.SELECTION_TYPE_SECONDARY
									.equals(selectionType)) {
								selectionService.setSelection(o);
							} else {
								eventBroker.send(
										"ui_secondarySelection/lemmaNavigator", o);

							}
						}
						
					}
					else if (tn.getLabel().equals(BTSConstants.ORPHANS_NODE_LABEL))
					{
						if (true || !tn.isChildrenLoaded())
						{
							tn.setChildrenLoaded(true);
							loadOrphans(parentControl, treeViewer, tn);
						}
					}
					if (selection instanceof TreeSelection)
					{
						TreeSelection ts = (TreeSelection) selection;
						List<BTSObject> path = new ArrayList<BTSObject>(4);

						for (Object o : ts.getPaths())
						{
							
							if (o instanceof TreePath)
							{
								TreePath tp = (TreePath) o;
								for (int i = 0; i < tp.getSegmentCount(); i++)
								{
									Object segment = tp.getSegment(i);
									BTSObject btso = (BTSObject) ((TreeNodeWrapper)segment).getObject();
									if (btso != null)
									{
										path.add(btso);
									}
								}
								break;
							}
							
						}
						if (event.getSource().equals(mainTreeViewer))
						{
							eventBroker.post("navigator_path_event_with_root/lemma", path.toArray(new BTSObject[path.size()]));
						}
						else
						{
							eventBroker.post("navigator_path_event_no_root/lemma", path.toArray(new BTSObject[path.size()]));
						}
					}
				}
			}
		};
		if (sorter == null)
		{
			sorter = ContextInjectionFactory.make(BTSLemmaBySortKeyNameViewerSorter.class, context);
		}

		treeViewer.setSorter(sorter);
		treeViewer.addSelectionChangedListener(selectionListener);
	}
	
	private void loadOrphans(final Control parentControl,
			final TreeViewer treeViewer, final TreeNodeWrapper localOrphanNode) {
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {
					Map map;

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						sync.asyncExec(new Runnable() {
							public void run() {
								if (parentControl != null && cachingMap.get(parentControl) != null
											&& cachingMap.get(parentControl) instanceof Map) {
									map = (Map) cachingMap.get(parentControl);
								}
								else
								{
									map = null;
								}
							}
						});
						List<BTSLemmaEntry> obs;
						obs = lemmaNavigatorController
								.getOrphanEntries(map,
										treeViewer.getFilters(), monitor);
						storeIntoMap(obs, parentControl, true);
						final List<TreeNodeWrapper> nodes = lemmaNavigatorController.loadNodes(obs, monitor, true);
						
						// If you want to update the UI
						sync.asyncExec(new Runnable() {
							@Override
							public void run() {
								localOrphanNode.getChildren().clear();
								localOrphanNode.getChildren().addAll(nodes);
							}
						});
					}};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
	}
	
	private void loadInput(final Control parentControl,
			final TreeViewer treeViewer, final TreeNodeWrapper rootNode,
			final boolean deleted) {
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						List<BTSLemmaEntry> obs;
						if (!deleted) {
							obs = lemmaNavigatorController
								.getRootEntries(
										queryResultMap,
										treeViewer,
										rootNode,
										BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
										BTSCorpusConstants.VIEW_LEMMA_ROOT_ENTRIES, monitor);
						} else {
							obs = lemmaNavigatorController
									.getDeletedEntries(
											queryResultMap,
											treeViewer,
											rootNode,
											BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, 
											BTSCorpusConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES, monitor);
						}
						storeIntoMap(obs, parentControl, true);
						List<TreeNodeWrapper> nodes = lemmaNavigatorController.loadNodes(obs, monitor, true);
						rootNode.getChildren().addAll(nodes);
						
						orphanNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
						orphanNode.setLabel(BTSConstants.ORPHANS_NODE_LABEL);
						
						rootNode.getChildren().add(orphanNode);

						// If you want to update the UI
						sync.asyncExec(new Runnable() {
							@Override
							public void run() {
								loadTree(treeViewer, rootNode, parentControl);
								treeViewer.addFilter(getDeletedFilter(deleted));
								if (BTSUIConstants.SELECTION_TYPE_SECONDARY
										.equals(selectionType)) {
									// register context menu on the table
									 MenuManager menuMgr = new MenuManager("#PopupMenu"); 
									 menuMgr.setRemoveAllWhenShown(true);
									 menuMgr.addMenuListener(new IMenuListener() {
									     @Override
									     public void menuAboutToShow(IMenuManager manager) {
									         Action action = new Action() {
									      public void run() {
									                openInPassportEditorDialog(treeViewer.getSelection());
									      }

										
									  };
									  action.setText("Open in Passport Data Editor");
									  manager.add(action);
									 }

									 });

									 Menu menu = menuMgr.createContextMenu(treeViewer.getTree());
									 treeViewer.getTree().setMenu(menu);
								}
								else
								{
								// register context menu on the table
								menuService.registerContextMenu(
										treeViewer.getControl(),
										BTSPluginIDs.POPMENU_LEMMA_NAVIGATOR_TREE_MENU);
								}
							}
						});
					}};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
	}
	
	private void openInPassportEditorDialog(
			ISelection sel) {
		StructuredSelection localSelection = (StructuredSelection) sel;
		if (localSelection.getFirstElement() != null
				&& localSelection.getFirstElement() instanceof TreeNodeWrapper) {
			TreeNodeWrapper localTreeNode = (TreeNodeWrapper) localSelection
					.getFirstElement();
			if (localTreeNode.getObject() != null) {
				BTSObject localCorpusObject = (BTSObject) localTreeNode.getObject();
				if (localCorpusObject instanceof BTSCorpusObject) {
					lemmaNavigatorController.checkAndFullyLoad((BTSCorpusObject) localCorpusObject, true);
					IEclipseContext child = context.createChild();
					child.set(BTSObject.class, localCorpusObject);
					child.set(Shell.class, new Shell());
					child.set(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT, false);

					PassportEditorDialog dialog = ContextInjectionFactory.make(
							PassportEditorDialog.class, child);
					dialog.open();
				}
			}
		}
	}
	

	private void loadChildren(final List<TreeNodeWrapper> parents,
			boolean includeGrandChildren, final Control parentControl) {
		
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						for (final TreeNodeWrapper parent : parents) {
							final List<BTSLemmaEntry> children = lemmaNavigatorController
									.findChildren(
											(BTSLemmaEntry) parent.getObject(),
											queryResultMap,
											mainTreeViewer,
											parent,
											BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, monitor);

							storeIntoMap(children, parentControl, false);
							// If you want to update the UI
							sync.asyncExec(new Runnable() {

								@Override
								public void run() {
									System.out.println("add children" + children.size());
									parent.getChildren().clear();
									for (BTSObject o : children) {
										TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
												.createTreeNodeWrapper();
										tn.setObject(o);
										addTooHolderMap(o, tn);
										tn.setParent(parent);
										// grandChildren.add(tn);
										parent.getChildren().add(tn);
									}
									parent.setChildrenLoaded(true);
								}
							});
						}
						refreshTreeViewer(null);

					}};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
		
	}

	protected void storeIntoMap(final List<BTSLemmaEntry> children,
			final Control parentControl, final boolean cacheViewerInput) {
		if (children.isEmpty())
		{
			return;
		}
		sync.asyncExec(new Runnable() {
			public void run() {
				if (parentControl != null && children != null
						&& !children.isEmpty()) {

					if (cacheViewerInput)
					{
						parentControl.setData("objs", children);
					}
					Map map = null;
					if (cachingMap.get(parentControl) != null
							&& cachingMap.get(parentControl) instanceof Map) {
						map = (Map) cachingMap.get(parentControl);
					} else {
						map = new HashMap<URI, Resource>();
						cachingMap.put(parentControl, map);
					}
					if (map != null) {
						for (BTSCorpusObject o : children) {
							if (o.eResource() != null)
							{
								map.put(o.eResource().getURI(), o.eResource());
							}
						}
					}
				}
			}
		});

	}
	
	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn) {
		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o)
				.get_id());
		if (list == null) {
			list = new Vector<TreeNodeWrapper>(1);
		}
		if (!list.contains(tn)) {
			list.add(tn);
		}
		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);

	}

	private void loadTree(TreeViewer treeViewer, TreeNodeWrapper root,
			final Control parentControl) {
		if (treeViewer.getTree().isDisposed()) return;
		treeViewer.setInput(root);
	}
	

	@Focus
	public void setFocus()
	{
		evaluationController
				.activateDBCollectionContext(BTSCoreConstants.MAIN_WORD_LIST);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_lemma_new_root/*") BTSObject object) {
		if ((object instanceof BTSLemmaEntry)) {
			final TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(object);
			mainRootNode.getChildren().add(tn);
			tn.setParentObject(mainRootNode);
			sync.asyncExec(new Runnable() {
				public void run() {
					if (!mainTreeViewer.getTree().isDisposed())
					{
						mainTreeViewer.setSelection(new StructuredSelection(tn), true);
					}
				}
			});
		}
	}
	@Inject
	@Optional
	void eventReceivedAdd(@EventTopic("model_lemma_add/*") BTSObject object) {
		if ((object instanceof BTSLemmaEntry)
				&& selection != null
				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSLemmaEntry) {
			final TreeNodeWrapper tn = lemmaNavigatorController.addRelation((BTSLemmaEntry) object,
					BTSCoreConstants.BASIC_RELATIONS_PARTOF,
					(TreeNodeWrapper) selection.getFirstElement());
			sync.asyncExec(new Runnable() {
				public void run() {
					if (!mainTreeViewer.getTree().isDisposed())
					{
						mainTreeViewer.setSelection(new StructuredSelection(tn), true);
					}
				}
			});
		}
	}
	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/async") Object object) {
		//logger.info("LemmaNavigatorPart eventReceivedUpdates. object: " + object);

		if (object instanceof BTSLemmaEntry && selection != null
				&& selection.getFirstElement() instanceof BTSLemmaEntry) {
			// corpusNavigatorController.addRelation((BTSCorpusObject) object,
			// "partOf",
			// (BTSCorpusObject) selection.getFirstElement(), input);

			refreshTreeViewer((BTSLemmaEntry) object);
		} else if (object instanceof BTSLemmaEntry) {
			refreshTreeViewer((BTSLemmaEntry) object);
		} else if (object instanceof BTSModelUpdateNotification) {
			if (((BTSModelUpdateNotification) object).getObject() instanceof BTSComment)
			{
				// comment, do nothing
			}
			else if (((BTSModelUpdateNotification) object).getObject() instanceof BTSAnnotation)
			{
				// comment, do nothing
			}
			else if (lemmaNavigatorController.handleModelUpdate(
					(BTSModelUpdateNotification) object, queryResultMap,
					viewHolderMap)) {
				refreshTreeViewer((BTSCorpusObject) ((BTSModelUpdateNotification) object)
						.getObject());
			}

		}
	}

	private void refreshTreeViewer(final BTSCorpusObject btsCorpusObject) {
		sync.asyncExec(new Runnable() {
			public void run() {
				if (!mainTreeViewer.getTree().isDisposed())
				{
					
//					mainTreeViewer
//							.removeSelectionChangedListener(selectionListener);
					for (TreePath path : mainTreeViewer.getExpandedTreePaths())
						System.out.println(path.getLastSegment());
					mainTreeViewer.refresh();
//					mainTreeViewer.addSelectionChangedListener(selectionListener);
				}
			}
		});

	}

	@Override
	public List<Map> getScatteredCacheMaps() {
		final List<Map> maps = new Vector<Map>(1);
		for (Map map : cachingMap.values()) {
			maps.add(map);
		}
		return maps;
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null) {
			/* implementation not shown */
		} else {
			if (!(selection instanceof BTSLemmaEntry)) {
				if (loaded)
				{
					mainTreeViewer.setSelection(null);
				}
			}
			System.out.println("CorpusNavigator selection received");
		}
	}


	@Override
	public StructuredViewer getActiveStructuredViewer() {
		CTabItem item = tabFolder.getSelection();
		if (item != null)
		{
			Object o = item.getData("tv");
			if (o instanceof StructuredViewer)
			{
				return (StructuredViewer) o;
			}
		}
		return null;
	}

	@Override
	public void search(BTSQueryRequest query, String queryName, String viewerFilterString) {
		if (query == null)
		{
			return;
		}
		
		// make new tab, with queryName if name != null
		createNewSearchTab(query, queryName, null);
	}

	private void createNewSearchTab(BTSQueryRequest query, String queryName, List<BTSCorpusObject> objects) {
		// create main tab item
		CTabItem searchTab = new CTabItem(tabFolder, SWT.NONE);
		searchTab.setShowClose(true);
		searchTab.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_SEARCH));
		if (queryName != null && queryName.trim().length() > 0)
		{
			searchTab.setText(queryName);
		}
		else
		{
			searchTab.setText(new Integer(tabFolder.getChildren().length - 2).toString());
		}
		if (query != null)
		{
			searchTab.setData("key", query.getQueryId());
		}

		Composite searchTabItemComp = new Composite(tabFolder, SWT.NONE);
		searchTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		searchTabItemComp.setLayout(new GridLayout());
		((GridLayout) searchTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) searchTabItemComp.getLayout()).marginWidth = 0;

		searchTab.setControl(searchTabItemComp);

		TreeViewer searchTreeViewer = new TreeViewer(searchTabItemComp);
		searchTreeViewer.getTree()
				.setLayoutData(new GridData(GridData.FILL_BOTH));
		searchTreeViewer.getTree().setLayout(new GridLayout());
		searchTab.setData("tv", searchTreeViewer);
		searchTabItemComp.layout();
		tabFolder.setSelection(searchTab);
		
		TreeNodeWrapper searchRootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		prepareTreeViewer(searchTreeViewer, searchTabItemComp);
		
		// search
		searchInput(searchTabItemComp, searchTreeViewer, searchRootNode, query, objects, searchTab);

	}

	private void searchInput(final Composite parentControl,
			final TreeViewer treeViewer, final TreeNodeWrapper rootNode,
			final BTSQueryRequest query, final List<BTSCorpusObject> objects, final CTabItem searchTab) {
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						List<BTSLemmaEntry> obs;
						if (objects != null && !objects.isEmpty())
						{
							obs = new Vector<BTSLemmaEntry>(objects.size());
							for (BTSCorpusObject o : objects)
							{
								if (o instanceof BTSLemmaEntry)
								{
									obs.add((BTSLemmaEntry) o);
								}
							}
						}
						else
						{
							obs = lemmaNavigatorController
								.getSearchEntries(query,
										queryResultMap,
										treeViewer,
										rootNode,
										BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, monitor);
						}
						if (obs != null && obs.size() > 0)
						{
							storeIntoMap(obs, parentControl, true);
							List<TreeNodeWrapper> nodes = lemmaNavigatorController.loadNodes(obs, monitor, true);
							rootNode.getChildren().addAll(nodes);
						}
						else
						{
							TreeNodeWrapper emptyNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
							emptyNode.setLabel("Nothing found that matches your query");
							rootNode.getChildren().add(emptyNode);
						}
						// If you want to update the UI
						sync.asyncExec(new Runnable() {
							@Override
							public void run() {
								loadTree(treeViewer, rootNode, parentControl);
								treeViewer.addFilter(getDeletedFilter(false));
								// register context menu on the table
								menuService.registerContextMenu(
										treeViewer.getControl(),
										BTSPluginIDs.POPMENU_LEMMA_NAVIGATOR_TREE_MENU);
							}
						});
					}};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
		
	}

	public void setInputList(List<BTSCorpusObject> objects, String queryName) {
		if (objects == null)
		{
			return;
		}
		
		// make new tab, with queryName if name != null
		createNewSearchTab(null, queryName, objects);
		
	}

	@Override
	public void reloadViewerNodes(final StructuredViewer viewer) {
		// get nodes
		if (viewer == null) return;
		final Control parent = viewer.getControl().getParent();
		if (parent == null) return;
		Object data = parent.getData("objs");
		List<BTSLemmaEntry> objs = null;
		if (data instanceof List<?>)
		{
			objs = (List<BTSLemmaEntry>) data;
		}
		if (objs == null) return;
		// filter nodes
		objs = filterObjects(objs, viewer);
		// load nodes
		final TreeNodeWrapper rootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (objs != null && objs.size() > 0)
		{
			List<TreeNodeWrapper> nodes = lemmaNavigatorController.loadNodes(objs, null, true);
			rootNode.getChildren().addAll(nodes);
		}
		else
		{
			TreeNodeWrapper emptyNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			emptyNode.setLabel("Nothing found that matches your filtering");
			rootNode.getChildren().add(emptyNode);
		}
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				loadTree((TreeViewer) viewer, rootNode, parent);
			}
		});
		
	}

	private List<BTSLemmaEntry> filterObjects(List<BTSLemmaEntry> objs,
			StructuredViewer viewer) {
		List<BTSLemmaEntry> filtered = new Vector<BTSLemmaEntry>();
		for (BTSLemmaEntry e : objs)
		{
			if (isFiltered(e, viewer))
			{
				filtered.add(e);
			}
		}
		return filtered;
	}

	private boolean isFiltered(BTSLemmaEntry e, StructuredViewer viewer) {
		for (ViewerFilter f : viewer.getFilters())
		{
			if (!f.select(viewer, null, e))
			{
				return false;
			}
		}
		return true;
	}
	@Override
	public String[] getTypesFilterTerms() {
		return new String[]{BTSConstants.WLIST_ENTRY};
	}
}
