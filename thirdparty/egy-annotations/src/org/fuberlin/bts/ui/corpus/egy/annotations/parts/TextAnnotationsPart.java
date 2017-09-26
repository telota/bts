package org.fuberlin.bts.ui.corpus.egy.annotations.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsFilterEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsLoadingEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.util.AnnotationToolbarItemCreator;
import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.Preferences;

public class TextAnnotationsPart implements IBTSEditor {

	public static final String PART_ID = "org.fuberlin.bts.ui.corpus.egy.annotations.TextAnnotationsPart";



	/** The text editor controller. */
	@Inject
	private BTSTextEditorController textEditorController;
	
	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	
	/** The sync. */
	@Inject
	private UISynchronize sync;
	
	/** The event broker. */
	@Inject
	private EventBroker eventBroker;
	
	/** The context. */
	@Inject
	IEclipseContext context;
	
	/** The part service. */
	@Inject
	private EPartService partService;
	
	/** The selection service. */
	@Inject
	private ESelectionService selectionService;

	private TextAnnotationsComposite textAnnotatationEditor;

	private MPart part;

	/** The parent shell. */
	@Optional
	@Inject
	@Active
	private Shell parentShell;
	
	private Object selectedTextItem;

	private BTSText text;

	private boolean constructed;

	private boolean loaded;

	private Object selectedSentence;

	private List<BTSObject>  relatingObjects;

	protected String queryId;
	
	/** The command stack listener. */
	private CommandStackListener commandStackListener;
	
	private EclipsePreferences annotationSettings;
	
	public TextAnnotationsPart() {
		
	}
	
	
	@PostConstruct
	public void createPartControl(Composite parent) {
		if (parentShell == null)
		{
			parentShell = new Shell();
		}
		try {
			part = partService.findPart(PART_ID);
		} catch (Exception e) {
//			logger.warn("Part Service couldn't find org.fuberlin.bts.ui.corpus.egy.annotations.TextAnnotationsPart ");
			e.printStackTrace();
		}
		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
//		contextService
//				.activateContext("org.eclipse.ui.contexts.dialogAndWindow");
		IEclipseContext child = context.createChild();
		child.set(Composite.class, parent);
		child.set(IBTSEditor.class, TextAnnotationsPart.this);
		textAnnotatationEditor = ContextInjectionFactory.make(
				TextAnnotationsComposite.class, child);
		
		// load annotatin styling settings node
		Preferences rootNode = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");
		annotationSettings = (EclipsePreferences) rootNode.node(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS);
		AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, annotationSettings);

		Map<String, Boolean> filters = (Map<String, Boolean>) context.get("org.bbaw.bts.corpus.annotationsPart.filter");
		textAnnotatationEditor.setFilters(filters );
		if (text != null)
		{
			loadInput(text);
		}
		
		parent.layout();
		parent.pack();
		constructed = true;
	}


	@Override
	public void setEditorSelection(final Object selection) {
		if (selection != null) {
			sync.asyncExec(new Runnable() {
				public void run() {
					// workaround because selection service requires iniating
					// part to be the active part
					// see some bug of e4
					MPart p = null;
					MPart activePart = null;
					try {
						p = partService
								.findPart(PART_ID);
						activePart = partService.getActivePart();
					} catch (Exception e) {
						e.printStackTrace();
					}
					boolean workaround = true;
					if (activePart != null && !activePart.equals(p)) {
						workaround = true;
						partService.activate(p);
					}
					else
					{
						workaround = false;
					}
					
					selectionService.setSelection(selection);
					
					// processEditorSelection(selection);
					if (workaround) {
						partService.activate(activePart);
					}
				}
			});

		}
		
	}
	
	/**
	 * Event received relating objects loaded events.
	 *
	 * @param event the event
	 */
	@SuppressWarnings({ "restriction", "rawtypes" })
	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_relating_objects/*") Object event) {

		if (event != null && event instanceof List) {
			List<BTSObject> annotations = new Vector<BTSObject>(
					((List) event).size());
			for (Object o : (List) event) {
				if (o instanceof BTSObject) {
					if (o != null) {
						annotations.add((BTSObject) o);
					}
				}
			}
			if (!annotations.isEmpty()) {
				processSelection(annotations);
			}
		}
	}

	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/*") BTSModelUpdateNotification notification)
	{
		//logger.info("AnnotationsPart eventReceivedUpdates. object: " + notification);
		if (notification.getQueryIds() != null){
			new Vector<>();
			for (String id : notification.getQueryIds())
			{
				if (id.equals(queryId))
				{
					Object o = notification.getObject();
					if (o instanceof BTSObject)
					{
						BTSObject object = (BTSObject) o;
						if (notification.isDeleted() 
								|| BTSConstants.OBJECT_STATE_TERMINATED.equals(object.getState()))
						{
							relatingObjects.remove(object);
						}
						else if (!relatingObjects.contains(object))
						{
							relatingObjects.add(object);
						}
						textAnnotatationEditor.updateRelatingObjects(relatingObjects);
						return;
					}
					
					
				}
			}
		}
	}
	/**
	 * @param annotations
	 * @param b
	 * @param object
	 */
	private void processSelection(List<BTSObject> annotations) {
		
		textAnnotatationEditor.setSelectedAnnotations(annotations, true);
		
	}


	/**
	 * Sets the selection.
	 *
	 * @param selection the new selection
	 */
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSIdentifiableItem selection) {
		if (selection == null) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedTextItem)) {

			if (selection instanceof BTSCorpusObject) // concered by selection event
			{
				if (selection.equals(text)) return;
				
				if (!constructed && selection instanceof BTSText) // gui not constructed
				{
					text = (BTSText) selection;
					if (part != null) {
						part.setLabel(text.getName());
					}
					return;
				}
				
				if (selection instanceof BTSText) { // requires load
					purgeCache();
					text = (BTSText) selection;
					if (part != null) {
						part.setLabel(text.getName());
					}
					loadInput((BTSCorpusObject) selection);

				} else if (loaded) { // requires clear
					purgeCache();

					loadInput(null);
					if (part != null) {
						part.setLabel("Text Editor");
					}
					text = null;
				}
			}
			if (selection instanceof BTSWord) {
				System.out.println("text editor received word/sent item selection!");
				
				// TODO shift sentence selection
				setSentenceTranslation((BTSWord) selection);
			} else if (selection instanceof BTSSenctence) 
				// TODO shift sentence selection
				if (this.selectedSentence == null || !this.selectedSentence.equals(selection))
					setSentenceTranslation((BTSSenctence) selection, false);
		}
	}


	private void setSentenceTranslation(BTSSenctence selection, boolean b) {
		// TODO Auto-generated method stub
		
	}


	private void setSentenceTranslation(BTSWord selection) {
		// TODO Auto-generated method stub
		
	}


	private void purgeCache() {
		// TODO Auto-generated method stub
		
	}


	private void loadInput(final BTSCorpusObject selection) {
		if (selection instanceof BTSText) {

			this.text = (BTSText) selection;
			
			if (text != null) {
				try {
					IRunnableWithProgress op = new IRunnableWithProgress() {

						@Override
						public void run(final IProgressMonitor monitor)
								throws InvocationTargetException,
								InterruptedException {
							monitor.beginTask("Load relating objects (comments, annotations, glosses).", 100);
							relatingObjects = textEditorController
									.getRelatingObjects((BTSText) text, monitor);
							
							queryId = "relations.objectId-" + text.get_id();

							sync.asyncExec(new Runnable() {
								public void run() {
									
									loadInputTextAnnotations(text,
												relatingObjects,
												monitor, selectedTextItem);
									loaded = true;

								}

							});
							
							Job job = new Job("post_relating_objects")
							{

								@Override
								protected IStatus run(IProgressMonitor monitor) {
									BTSRelatingObjectsLoadingEvent event = new BTSRelatingObjectsLoadingEvent(
											text);
									event.setRelatingObjects(relatingObjects);
									eventBroker
											.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED,
													event);
									return Status.OK_STATUS;
								}
								
							};
							job.schedule(1000);
								
						}
					};
					new ProgressMonitorDialog(new Shell()).run(true, true, op);
				} catch (InvocationTargetException e) {
					// handle exception
				} catch (InterruptedException e) {
					// handle cancelation
				}
			}
		}
		
	}
	
	@Inject
	@Optional
	void eventReceivedRelatedObjectsFilterSet(
			@UIEventTopic("event_anno_filters/*") final BTSRelatingObjectsFilterEvent event) {
		if (event != null) {
			Map<String, Boolean> filters = event.getFilters();
			
			textAnnotatationEditor.setFilters(filters);
		}
	}
	
	@Inject
	@Optional
	void eventReceivedPreferencesChanged(
			@EventTopic("event_preferences_changed/*") final String preferencePath) {
		if (preferencePath != null && preferencePath.endsWith(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS)) {
			
			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					Preferences rootNode = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");
					annotationSettings = (EclipsePreferences) rootNode.node(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS);
					AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, annotationSettings);
					textAnnotatationEditor.reloadCurrentSentence();
				}
			});
			
		}
	}

	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_text_relating_objects/*") final BTSRelatingObjectsLoadingEvent event) {
		if (!(event.getObject() instanceof BTSText)) return;
		
		text = (BTSText) event.getObject();
		queryId = "relations.objectId-" + text.get_id();
		if (event != null) {
			sync.syncExec(new Runnable() {
				public void run() {
					// TODO update annotations!!!!!
//					loadRelatingObjects(event);
				}
			});

		}
	}
	private void loadInputTextAnnotations(BTSText localText, List<BTSObject> localRelatingObjects,
			IProgressMonitor monitor, Object localSelectedTextItem) {
		if (monitor != null) monitor.setTaskName("Load relating text into TextAnnotations-Editor.");
		if (localText != null) {
			textAnnotatationEditor.setInput(localText, localText.getTextContent(),
					localRelatingObjects, monitor, localSelectedTextItem);
		} else {
			textAnnotatationEditor.setInput(null, null, localRelatingObjects, monitor, localSelectedTextItem);
		}	
	}
	
	


}
