 
package org.bbaw.bts.ui.corpus.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.filter.BTSObjectStateViewerFilter;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.viewerSorter.BTSObjectByNameViewerSorter;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.bbaw.bts.ui.corpus.parts.corpusNavigator.BTSCorpusObjectBySortKeyNameViewerSorter;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

public class CorpusNavigatorPart extends NavigatorPart implements ScatteredCachingPart, SearchViewer, StructuredViewerProvider {

	@Inject
	private EventBroker eventBroker;
	@Inject
	private CorpusNavigatorController corpusNavigatorController;
	// Get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	// use field injection for the service
	@Inject
	private ESelectionService selectionService;

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private EMenuService menuService;
	
	@Inject
	@Optional
	@Named(BTSUIConstants.SELECTION_TYPE)
	private String selectionType;

	@Inject
	private Logger logger;
	
	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;
	
	private TreeViewer mainTreeViewer;
	private StructuredSelection selection;
	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();
	private Map<String, List<TreeNodeWrapper>> viewHolderMap = new HashMap<String, List<TreeNodeWrapper>>();

	private ISelectionChangedListener selectionListener;
	private Composite composite;

	private Map<Control, Map<URI, Resource>> cachingMap = new HashMap<Control, Map<URI, Resource>>();
	private TreeNodeWrapper mainRootNode;
	private CTabFolder tabFolder;
	private CTabItem mainTabItem;
	private Composite mainTabItemComp;
	private CTabItem binTabItem;
	private Composite binTabItemComp;
	private TreeViewer bintreeViewer;
	private TreeNodeWrapper binRootNode;
	private boolean loaded;
	protected TreeNodeWrapper orphanNode;
	protected TreeNodeWrapper selectedTreeNode;
	protected BTSObject selectedCorpusObject;
	
	@Inject
	@Active
	@Optional
	private Shell parentShell;
	private ViewerSorter sorter;
	
//	@Inject
	private IEclipseContext context;
	
	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_CORPUS_ACTIVATE_MAIN_CORPUS_SELECTION, nodePath = "org.bbaw.bts.app")
	private Boolean activeMainCorpusSelection;
	private Object mainTextCorpus;

	@Inject
	public CorpusNavigatorPart() {
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		if (parentShell == null ) parentShell = new Shell();
		// important to get the right context which is also injected into toolcontrol
		// and which listens to modifications
		context = StaticAccessController.getContext();
		context.declareModifiable(BTSPluginIDs.PREF_MAIN_CORPUS);
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
				BTSResourceProvider.IMG_CORPORA));
		mainTabItem.setText("Text Corpora");
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
		if (BTSUIConstants.SELECTION_TYPE_SECONDARY
				.equals(selectionType)) {
			loadInput(mainTabItemComp, mainTreeViewer, mainRootNode, false);
		}

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
		
		// parent.pack();
		// tryRunnable();
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
		treeViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
labelProvider));

		treeViewer.setUseHashlookup(true);
		selectionListener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (StructuredSelection) event.getSelection();
				System.out.println(event.getSelection());
				if (selection.getFirstElement() != null
						&& selection.getFirstElement() instanceof TreeNodeWrapper) {
					selectedTreeNode = (TreeNodeWrapper) selection
							.getFirstElement();
					if (!BTSUIConstants.SELECTION_TYPE_SECONDARY
							.equals(selectionType) && !activeMainCorpusSelection) {
							setMainCorpusSelection(selectedTreeNode);
					}
					
					if (selectedTreeNode.getObject() != null) {
						selectedCorpusObject = (BTSObject) selectedTreeNode.getObject();
						if (selectedCorpusObject instanceof BTSCorpusObject) {
							corpusNavigatorController.checkAndFullyLoad((BTSCorpusObject) selectedCorpusObject, true);
						}

						if ((!(selectedCorpusObject instanceof BTSTextCorpus) || ((BTSTextCorpus)selectedCorpusObject).isActive())
								&& !selectedTreeNode.isChildrenLoaded() || selectedTreeNode.getChildren().isEmpty()) {
							
							
							List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
							parents.add(selectedTreeNode);
							selectedTreeNode.setChildrenLoaded(true);
							loadChildren(parents, false, parentControl);

							Job j = new Job("expand") {
								@Override
								protected IStatus run(IProgressMonitor monitor) {
									sync.asyncExec(new Runnable() {
										public void run() {
											treeViewer.setExpandedState(selectedTreeNode, true);
										}
									});
									return Status.OK_STATUS;
								}
							};
							j.schedule(750);
						}
						if (!BTSUIConstants.SELECTION_TYPE_SECONDARY
								.equals(selectionType)) {
							selectionService.setSelection(selectedCorpusObject);
						} else {
							eventBroker.send(
									"ui_secondarySelection/corpusNavigator", selectedCorpusObject);

						}
					}
					else if (selectedTreeNode.getLabel().equals(BTSConstants.ORPHANS_NODE_LABEL))
					{
						if (!selectedTreeNode.isChildrenLoaded())
						{
							selectedTreeNode.setChildrenLoaded(true);
							loadOrphans(parentControl, treeViewer, selectedTreeNode);
						}
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
						eventBroker.post("navigator_path_event_with_root/corpus", path.toArray(new BTSObject[path.size()]));
					}
					else
					{
						eventBroker.post("navigator_path_event_no_root/corpus", path.toArray(new BTSObject[path.size()]));
					}
				}

			}
			
		};
		if (sorter == null)
		{
			sorter = ContextInjectionFactory.make(BTSCorpusObjectBySortKeyNameViewerSorter.class, context);
		}

		treeViewer.setSorter(sorter);
		treeViewer.addSelectionChangedListener(selectionListener);
	}

	protected void setMainCorpusSelection(TreeNodeWrapper selectedTreeNode) {
		
		BTSTextCorpus selectedTextCorpus = null;
		selectedTextCorpus = findParentCorpusRecursively(selectedTreeNode);
		if (selectedTextCorpus == null || !selectedTextCorpus.isActive() 
				|| !BTSConstants.OBJECT_STATE_ACTIVE.equals(selectedTextCorpus.getState())
				|| selectedTextCorpus.is_deleted())
		{
			return;
		}
		
		if (mainTextCorpus == null)
		{
			mainTextCorpus = context.get(BTSPluginIDs.PREF_MAIN_CORPUS);
		}
		if (selectedTextCorpus != null && selectedTextCorpus.getDBCollectionKey() != null
				&& (mainTextCorpus == null || !mainTextCorpus.equals(selectedTextCorpus))
				&& (corpusNavigatorController.isWriteable(selectedTextCorpus)))
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, selectedTextCorpus.getDBCollectionKey()+ "_" + selectedTextCorpus.getCorpusPrefix());
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, selectedTextCorpus.getDBCollectionKey()+ "_" + selectedTextCorpus.getCorpusPrefix());
			try {
				context.modify(BTSPluginIDs.PREF_MAIN_CORPUS, selectedTextCorpus);
			} catch (Exception e1) {
				context.declareModifiable(BTSPluginIDs.PREF_MAIN_CORPUS);
				context.modify(BTSPluginIDs.PREF_MAIN_CORPUS, selectedTextCorpus);
				e1.printStackTrace();
			}
			mainTextCorpus = selectedTextCorpus;
			try {
				ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				logger.error(e);
			}
			try {
				InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				logger.error(e);
			}
		}
	}

	private BTSTextCorpus findParentCorpusRecursively(
			TreeNodeWrapper tn) {
		if (tn.getObject() instanceof BTSTextCorpus)
		{
			return (BTSTextCorpus) tn.getObject();
		}
		else if (tn.getParent() != null)
		{
			return findParentCorpusRecursively(tn.getParent());
		}
		return null;
	}

	protected void loadOrphans(final Control parentControl,
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
						List<BTSCorpusObject> obs;
						obs = corpusNavigatorController
								.getOrphanEntries(map,
										treeViewer.getFilters(), monitor);
						storeIntoMap(obs, parentControl, true);
						final List<TreeNodeWrapper> nodes = corpusNavigatorController.loadNodes(obs, monitor, true);
						
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
	private void executeSaveAllCommand() {

		ParameterizedCommand cmd = commandService.createCommand(
				"org.eclipse.ui.file.saveAll", null);

		handlerService.executeHandler(cmd);
		
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
						List<BTSCorpusObject> obs;
						if (!deleted) {
							obs = corpusNavigatorController
								.getRootEntries(
										queryResultMap,
										treeViewer,
										rootNode,
										BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
										BTSCorpusConstants.VIEW_ALL_ACTIVE_CORPUS_OBJECTS, monitor);
						} else {
							obs = corpusNavigatorController
									.getDeletedEntries(
											queryResultMap,
											treeViewer,
											rootNode,
											BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
											BTSCorpusConstants.VIEW_ALL_TERMINATED_CORPUS_OBJECTS, monitor);
						}
						storeIntoMap(obs, parentControl, true);
						List<TreeNodeWrapper> nodes = corpusNavigatorController.loadNodes(obs, monitor, true);
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
											BTSPluginIDs.POPMENU_CORPUS_NAVIGATOR_TREE_MENU);
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
					corpusNavigatorController.checkAndFullyLoad((BTSCorpusObject) localCorpusObject, true);
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
							final List<BTSCorpusObject> children = corpusNavigatorController
									.findChildren(
											(BTSCorpusObject) parent.getObject(),
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
									refreshTreeViewer(null);
								}
							});
						}
					}};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
		
	}

	protected void storeIntoMap(final List<BTSCorpusObject> children,
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
					Map<URI, Resource> map = null;
					if (cachingMap.get(parentControl) != null
							&& cachingMap.get(parentControl) instanceof Map) {
						map = cachingMap.get(parentControl);
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
		treeViewer.setInput(root);
	}


	@PreDestroy
	public void preDestroy() {
	}

	@Focus
	public void onFocus() {
		if (!loaded)
		{
			loaded = true;
			loadInput(mainTabItemComp, mainTreeViewer, mainRootNode, false);
		}
		permissionController
				.activateDBCollectionContext("corpus");
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_corpus_new_root/*") BTSObject object) {
		if ((object instanceof BTSTextCorpus)) {
			final TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(object);
			mainRootNode.getChildren().add(tn);
			tn.setParent(mainRootNode);
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
	void eventReceivedViewRefresh(@EventTopic("view_refresh/*") BTSObject selectionObject) {
		if ((selectionObject instanceof BTSCorpusObject) && selectionObject.equals(selectedCorpusObject)) {
			final List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(1);
			nodes.add(selectedTreeNode);
			
			sync.asyncExec(new Runnable() {
				public void run() {
					final CTabItem ti = tabFolder.getSelection();
					TreeViewer tv = (TreeViewer) ti.getData("tv");
					if (BTSConstants.ORPHANS_NODE_LABEL.equals(selectedTreeNode.getLabel()))
					{
						loadOrphans(tv.getControl(), tv, selectedTreeNode);
					}
					else
					{
						loadChildren(nodes, true, tv.getControl());
					}
				}
			});
		}
	}

	@Inject
	@Optional
	void eventReceivedAdd(@EventTopic("model_corpus_add/*") BTSObject object) {
		if ((object instanceof BTSCorpusObject) 
				&& !(object instanceof BTSAnnotation)
				&& !(object instanceof BTSLemmaEntry)
				&& !(object instanceof BTSThsEntry)
				&& selection != null
				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSCorpusObject) {
			final TreeNodeWrapper tn = corpusNavigatorController.addRelation((BTSCorpusObject) object,
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
		//logger.info("CorpusNavigatorPart eventReceivedUpdates. object: " + object);

		if (object instanceof BTSCorpusObject && selection != null
				&& selection.getFirstElement() instanceof BTSCorpusObject) {
			// corpusNavigatorController.addRelation((BTSCorpusObject) object,
			// "partOf",
			// (BTSCorpusObject) selection.getFirstElement(), input);

			refreshTreeViewer((BTSCorpusObject) object);
		} else if (object instanceof BTSCorpusObject) {
			refreshTreeViewer((BTSCorpusObject) object);
		} else if (object instanceof BTSModelUpdateNotification) {
			BTSModelUpdateNotification notification = (BTSModelUpdateNotification) object;
			if (notification.getObject() instanceof BTSComment)
			{
				// comment, do nothing
			}
			else if (notification.getObject() instanceof BTSLemmaEntry)
			{
				// BTSLemmaEntry, do nothing
			}
			else if (notification.getObject() instanceof BTSThsEntry)
			{
				// BTSThsEntry, do nothing
			}
			else if (notification.getObject() instanceof BTSTextCorpus)
			{
				boolean found = false;
				for (TreeNodeWrapper t : mainRootNode.getChildren())
				{
					if (notification.getObject().equals(t.getObject()))
					{
						found = true;
						break;
					}
				}
				if (!found)
				{
					final TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
					tn.setLabel(BTSConstants.ORPHANS_NODE_LABEL);
					tn.setObject(notification.getObject());
					tn.setParent(mainRootNode);
					sync.asyncExec(new Runnable() {
						@Override
						public void run() {
							mainRootNode.getChildren().add(tn);
						}
					});
				}
			}
			else if (!(notification.getObject() instanceof BTSAnnotation) && corpusNavigatorController.handleModelUpdate(
					notification, queryResultMap,
					viewHolderMap) && notification.getObject() instanceof BTSCorpusObject) {
				
//				refreshTreeViewer((BTSCorpusObject) notification.getObject());
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
	
	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null) {
			/* implementation not shown */
		} else {
			if (!(selection instanceof BTSCorpusObject)) {
				if (loaded)
				{
					mainTreeViewer.setSelection(null);
				}
			}
			System.out.println("CorpusNavigator selection received");
		}
	}

	@Override
	public void dispose() {
		
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
	
	public void setInputList(List<BTSCorpusObject> objects, String queryName) {
		if (objects == null)
		{
			return;
		}
		
		// make new tab, with queryName if name != null
		createNewSearchTab(null, queryName, objects);
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

		// // in new job, search
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						List<BTSCorpusObject> obs;
						if (objects != null && !objects.isEmpty())
						{
							obs = objects;
						}
						else
						{
							obs = corpusNavigatorController
								.getSearchEntries(query,
										queryResultMap,
										treeViewer,
										rootNode,
										BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, monitor);
						}
						if (obs != null && obs.size() > 0)
						{
							storeIntoMap(obs, parentControl, true);
							List<TreeNodeWrapper> nodes = corpusNavigatorController.loadNodes(obs, monitor, true);
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
										BTSPluginIDs.POPMENU_CORPUS_NAVIGATOR_TREE_MENU);
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
	@Override
	public void reloadViewerNodes(final StructuredViewer viewer) {
		// get nodes
		if (viewer == null) return;
		final Control parent = viewer.getControl().getParent();
		if (parent == null) return;
		Object data = parent.getData("objs");
		List<BTSCorpusObject> objs = null;
		if (data instanceof List<?>)
		{
			objs = (List<BTSCorpusObject>) data;
		}
		if (objs == null) return;
		// filter nodes
		objs = filterObjects(objs, viewer);
		// load nodes
		final TreeNodeWrapper rootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (objs != null && objs.size() > 0)
		{
			List<TreeNodeWrapper> nodes = corpusNavigatorController.loadNodes(objs, null, true);
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

	private List<BTSCorpusObject> filterObjects(List<BTSCorpusObject> objs,
			StructuredViewer viewer) {
		List<BTSCorpusObject> filtered = new Vector<BTSCorpusObject>();
		for (BTSCorpusObject e : objs)
		{
			if (isFiltered(e, viewer))
			{
				filtered.add(e);
			}
		}
		return filtered;
	}

	private boolean isFiltered(BTSCorpusObject e, StructuredViewer viewer) {
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
		return new String[]{BTSConstants.TEXT, BTSConstants.TEXT_CORPUS, BTSConstants.CORPUS_OBJECT};
	}
}