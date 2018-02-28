/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.egy.parts;

import java.awt.Dimension;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.custom.BTSE4ToGuiceXtextSourceViewerProvider;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsFilterEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsLoadingEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.corpus.util.AnnotationToolbarItemCreator;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.EgyLineNumberRulerColumn;
import org.bbaw.bts.ui.egy.parts.support.AbstractTextEditorLogic;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IPainter;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationModelEvent;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import com.google.inject.Injector;

public class EgyTextEditorPart extends AbstractTextEditorLogic implements IBTSEditor, EventHandler {

	private static final int EDITOR_PREFIX_LENGTH = 1;
	private static final int LINE_SPACE = 8;

	protected int counter;
	protected boolean loading;
	protected int tabSelection;
	protected boolean isDocUpdating;
	protected String queryId;
	protected int cachedCursor;
	protected BTSTextSelectionEvent deepCopyCache;

	@Optional @Inject private MDirtyable dirty;
	@Inject private BTSTextEditorController textEditorController;
    @Inject private ESelectionService selectionService;
    @Inject private UISynchronize sync;
    @Inject private EventBroker eventBroker;
    @Inject IEclipseContext context;
    @Inject private EContextService contextService;
    @Inject private EPartService partService;
    @Inject private EditingDomainController editingDomainController;
    @Inject private PermissionsAndExpressionsEvaluationController permissionsController;

	private BTSText text;
	private CTabFolder tabFolder;
	private JMDCEditor jseshEditor;
	private Document document;
	private IAnnotationModel annotationModel;
	private SignTextComposite signTextEditor;

	@SuppressWarnings("restriction")
	private EmbeddedEditorFactory embeddedEditorFactory;
	private Injector injector;
	private BTSTextXtextEditedResourceProvider xtextResourceProvider = new BTSTextXtextEditedResourceProvider();
	private Composite embeddedEditorComp;
	@SuppressWarnings("restriction")
	private EmbeddedEditorModelAccess embeddedEditorModelAccess;
    private Set<Command> localCommandCacheSet = new HashSet<Command>();
	private Composite embeddedEditorParentComp;
    private Composite parent;
	private CompositeRuler ruler;
	private OverviewRuler oruler;
	private BTSSenctence selectedSentence;
	private Map<String, BTSModelAnnotation> modelAnnotationMap;
	private StyleRange selectionRange;
	private StyleRange[] preSelectionRanges;
	private TranslationEditorComposite sentenceTranslate_Editor;
	private EditingDomain editingDomain;
	private CommandStackListener commandStackListener;
	private MPart part;
	private List<BTSObject> relatingObjects;
	@SuppressWarnings("restriction")
	@Inject private Logger logger;
	private Map<EObject, List<BTSModelAnnotation>> relatingObjectsAnnotationMap = new HashMap<EObject, List<BTSModelAnnotation>>();
	private Map<String, List<BTSInterTextReference>> relatingObjectsMap;
	private EgyLineNumberRulerColumn lineNumberRulerColumn;
	private HashMap<String, List<Object>> lemmaAnnotationMap;
	@Inject @Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private Boolean userMayEdit;
	@Optional @Inject @Active private Shell parentShell;
	private boolean loaded; // boolean if object is loaded into gui
	private boolean constructed; // boolean if gui is constructed
	private boolean selectionCached; // boolean if selection is cached and can be loaded when gui becomes visible or constructed
	@Inject @Active @Optional private Shell shell;
	private ScrolledComposite scrolledCompJSesh;
	@Inject @Preference(value = BTSEGYUIConstants.PREF_TRANSLITERATION_EDITOR_SHOW_LINE_NUMBER_RULER, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private boolean show_line_number_ruler;
	private BTSModelAnnotation highlightedSentenceAnnotation;
    private boolean deepCopyEnabled = false;


	@Inject
	public EgyTextEditorPart(EPartService partService) {
		try {
			part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);
		} catch (Exception e) {
			logger.warn("Part Service couldn't find "+BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);
			e.printStackTrace();
		}
	}

	@SuppressWarnings("restriction")
	@PostConstruct
	public void postConstruct(Composite parent) {

		if (parentShell == null)
			parentShell = new Shell();

		this.parent = parent;
		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		contextService
		.activateContext("org.eclipse.ui.contexts.dialogAndWindow");

		// load annotatin styling settings node
		AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, 
				getAnnotationPreferences());

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;

		tabFolder = new CTabFolder(composite, SWT.BORDER);
		tabFolder.setSimple(false);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override public void widgetSelected(SelectionEvent e) {
				int oldSelection = tabSelection;
				tabSelection = tabFolder.getSelectionIndex();
				boolean canSwitch = true;
				if (tabSelection == oldSelection)
					return;

				// update model from old selection editor
				switch (oldSelection) {
				case 0:
					cachedCursor = embeddedEditor.getViewer().getTextWidget().getCaretOffset();
					canSwitch = updateModelFromTranscription();
					break;
				case 1:
					signTextEditor.clearContent();
					break;
				}

				// reset selection if switching selection is not permitted!
				if (!canSwitch) {
					tabFolder.setSelection(oldSelection);
					tabSelection = oldSelection;
					return;
				}

				try {
					// load updated model into selected editor
					IRunnableWithProgress op = new IRunnableWithProgress() {
						@Override public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							sync.asyncExec(new Runnable() {
								public void run() {
									switch (tabSelection) {
									case 0:
										contextService.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
										loadInputTranscription(text, relatingObjects, monitor);

                                        /* FIXME - Sebastian: Sync selection from hieroglyph editor
                                        Annotation an = modelAnnotationMap.get(((BTSIdentifiableItem) selectedTextItem).get_id());
                                        if (an != null) {
                                            Position pos = annotationModel.getPosition(an);
                                            try {
                                                embeddedEditor.getViewer().getTextWidget().setCaretOffset(pos.getOffset());
                                                embeddedEditor.getViewer().revealRange(pos.getOffset(), pos.getLength());
                                            } catch (Exception e) {}
                                        }
                                        */
										break;

									case 1:
										loadInputSignText(text, relatingObjects, relatingObjectsMap, monitor, getSelectedSentenceItem());
										break;

									case 2:
										loadInputJSesh(text, relatingObjects);
										break;
									}
								}
							});
						}
					};
					new ProgressMonitorDialog(new Shell()).run(true, true, op);
				} catch (InvocationTargetException ee) {
				} catch (InterruptedException ee) {
				}				
			}
		});

		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
		tbtmPlaintext2.setText("Transliteration");

		embeddedEditorParentComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
		embeddedEditorParentComp.setLayout(new GridLayout());
		((GridLayout) embeddedEditorParentComp.getLayout()).marginHeight = 0;
		((GridLayout) embeddedEditorParentComp.getLayout()).marginWidth = 0;
		tbtmPlaintext2.setControl(embeddedEditorParentComp);

		embeddedEditorParentComp.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				// remove translit editor contents (including annotation model)
				// before xtext HighlightingHelper gets a chance
				// to clog main thread with its painful editor dismantling.
				loadInputTranscription(null, relatingObjects, null);
			}
		});

		embeddedEditorComp = new Composite(embeddedEditorParentComp, SWT.None);
		embeddedEditorComp.setLayout(new GridLayout());
		embeddedEditorComp.setLayout(new GridLayout());
		((GridLayout) embeddedEditorComp.getLayout()).marginHeight = 0;
		((GridLayout) embeddedEditorComp.getLayout()).marginWidth = 0;
		embeddedEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		context.get(StaticAccessController.class);

		// new trial
		injector = textEditorController.findEgyDslInjector();

		embeddedEditorFactory = injector.getInstance(EmbeddedEditorFactory.class);

		embeddedEditor = embeddedEditorFactory
				.newEditor(xtextResourceProvider)
				.showAnnotations(
						"org.eclipse.xtext.ui.editor.error",
						"org.eclipse.xtext.ui.editor.warning")
				.withParent(embeddedEditorComp);

		embeddedEditorModelAccess = embeddedEditor.createPartialEditor("", "§§", "", false);
		embeddedEditor.getViewer().getTextWidget().setLineSpacing(LINE_SPACE);

		// keep the partialEditor as instance var to read / write the edited text

		IAnnotationAccess annotationAccess = new IAnnotationAccess() {
			public Object getType(Annotation annotation) {
				return annotation.getType();
			}

			public boolean isMultiLine(Annotation annotation) {
				return true;
			}

			public boolean isTemporary(Annotation annotation) {
				return true;
			}
		};
		painter = new AnnotationPainter(embeddedEditor.getViewer(), annotationAccess);

		ruler = EmbeddedEditorFactory.getCpAnnotationRuler();
		oruler = EmbeddedEditorFactory.getOverViewRuler();

		configureEditorDrawingStrategies(oruler);
		if (show_line_number_ruler) {
			lineNumberRulerColumn = new EgyLineNumberRulerColumn(LINE_SPACE);
			//lineNumberRulerColumn.setModel(annotationModel); // does nothing
			embeddedEditor.getViewer().addVerticalRulerColumn(lineNumberRulerColumn);
		}

		embeddedEditor.getViewer().addTextPresentationListener(painter);
		embeddedEditor.getViewer().addPainter(painter);

		embeddedEditorParentComp.layout();

		context.set(XtextSourceViewer.class, embeddedEditor.getViewer());
		BTSE4ToGuiceXtextSourceViewerProvider.setContext(context);

		loadInputTranscription(null, relatingObjects, null);

		embeddedEditor.getViewer().getTextWidget().addCaretListener(new CaretListener() {
			@Override public void caretMoved(CaretEvent event) {
				/* get char right of caret and show Unicode code point in status line */
				if (event.caretOffset < embeddedEditor.getViewer().getTextWidget().getText().length()) {
					String sign = embeddedEditor.getViewer().getTextWidget().getText(event.caretOffset, event.caretOffset);
					if (sign != null && !"".equals(sign)) {
						int lineIndex = embeddedEditor.getViewer().getTextWidget().getLineAtOffset(event.caretOffset);
						int offset = event.caretOffset - embeddedEditor.getViewer().getTextWidget().getOffsetAtLine(lineIndex);
						showCurrentSignUnicode(sign, lineIndex, offset);
					}
				}
			}
		});

		embeddedEditor.getDocument().addDocumentListener(new IDocumentListener() {
			public void documentAboutToBeChanged(DocumentEvent event) {}
			public void documentChanged(DocumentEvent event) {
				if (!loading)
					setDirtyInternal();
			}
		});

		Menu menu = embeddedEditor.getViewer().getTextWidget().getMenu();
		menu.addMenuListener(new MenuListener() {
			public void menuHidden(MenuEvent e) {}
			public void menuShown(MenuEvent e) {
				if (!checkTransliterationHasNoErrors(text))
                    return;

                Menu menu = embeddedEditor.getViewer().getTextWidget().getMenu();
                MenuItem itemPaste;
                itemPaste = new MenuItem(menu, SWT.NONE);
                itemPaste.setText("Paste items with Lemmata");
                itemPaste.setEnabled(deepCopyCache != null);
                itemPaste.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        pasteItems();
                    }
                });

                MenuItem sentPaste;
                sentPaste = new MenuItem(menu, SWT.NONE);
                sentPaste.setText("Paste sentences with Lemmata");
                sentPaste.setEnabled(deepCopyCache != null);
                sentPaste.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        pasteSentences();
                    }
                });

                MenuItem itemCopy;
                itemCopy = new MenuItem(embeddedEditor.getViewer().getTextWidget().getMenu(), SWT.NONE);
                itemCopy.setText("Copy with Lemmata" );
                itemCopy.setEnabled(deepCopyEnabled);
                itemCopy.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        copyTextWithLemmata();
                    }
                });
			}
		});

		embeddedEditor.getViewer().addPostSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent e) {
                BTSTextSelectionEvent evt = fireTextSelectionEvent((TextSelection)e.getSelection());
                deepCopyEnabled = !evt.getSelectedItems().isEmpty();
                System.err.println("SelectionChangedEvent: "+evt.toString());
			}
		});

		CTabItem signTextTab = new CTabItem(tabFolder, SWT.NONE);
		signTextTab.setText("Sign Text Editor");
		Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
		plainTextComp.setLayout(new GridLayout());
		((GridLayout) plainTextComp.getLayout()).marginHeight = 0;
		((GridLayout) plainTextComp.getLayout()).marginWidth = 0;
		signTextTab.setControl(plainTextComp);
		IEclipseContext child = context.createChild();
		child.set(Composite.class, plainTextComp);
		child.set(IBTSEditor.class, EgyTextEditorPart.this);
		signTextEditor = ContextInjectionFactory.make(
				SignTextComposite.class, child);
		plainTextComp.layout();
		plainTextComp.pack();

		CTabItem tbtm5 = new CTabItem(tabFolder, SWT.NONE);
		tbtm5.setText("JSesh View");
		scrolledCompJSesh = new ScrolledComposite(tabFolder, SWT.HORIZONTAL | SWT.VERTICAL);
		scrolledCompJSesh.setMinWidth(800);
		scrolledCompJSesh.setMinHeight(400);
		scrolledCompJSesh.setExpandHorizontal(true);
		scrolledCompJSesh.setExpandVertical(true);
		tbtm5.setControl(scrolledCompJSesh);

		final Composite comEmbeded = new Composite(scrolledCompJSesh, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
		scrolledCompJSesh.setContent(comEmbeded);

		Frame frame = SWT_AWT.new_Frame(comEmbeded);

		jseshEditor = new JMDCEditor();
		jseshEditor.setMDCText("");
		jseshEditor.setPreferredSize(new Dimension(500, 500));
		frame.add(jseshEditor);

		comEmbeded.layout();
		scrolledCompJSesh.layout();
		scrolledCompJSesh.pack();

		tabFolder.setSelection(0);
		composite.layout();
		composite.pack();

		Group sentenceTranslateComp = new Group(sashForm, SWT.NONE);
		sentenceTranslateComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		sentenceTranslateComp.setLayout(new GridLayout());
		sentenceTranslateComp.setText("Sentence Translation");
		sentenceTranslate_Editor = new TranslationEditorComposite(sentenceTranslateComp, SWT.WRAP | SWT.MULTI | SWT.V_SCROLL | SWT.BORDER, null, null, false, true);
		sentenceTranslate_Editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		sentenceTranslateComp.layout();
		sashForm.setWeights(new int[] { 6, 1 });
		parent.layout();

		constructed = true;
		if (selectionCached)
			loadInput(text);
	}

	private void copyTextWithLemmata() {
        /* TODO this implementation is very poor. This should just use the regular system keyboard and a sane
         * serialization of the selected objects. */
		deepCopyCache = probeCurrentTextSelection();
        System.err.println("Setting deepCopyCache: "+deepCopyCache);
	}

    private BTSTextSelectionEvent probeCurrentTextSelection(TextSelection selection) {
        return probeTextSelectionEvent((TextSelection)embeddedEditor.getViewer().getSelection());
    }

    private BTSTextSelectionEvent probeTextSelection(TextSelection selection) {
        BTSTextSelectionEvent evt = new BTSTextSelectionEvent(selection, text);
        populateSelectionEvent(evt);
    }

    private BTSTextSelectionEvent fireTextSelectionEvent(TextSelection selection) {
        BTSTextSelectionEvent evt = probeTextSelection(selection);
        highlightAnnotations(evt.getTextAnnotations());
        updateSentenceTranslation(evt);
        selectionService.setSelection(evt);
        return evt;
    }

    private void updateSentenceTranslation(BTSTextSelectionEvent evt) {
        if (evt.getSelectedItems().isEmpty()) {
            setSentenceTranslationActive(false);
            return;
        }

        for (BTSIdentifiableItem o : evt.getSelectedItems()) {
            if (o instanceof BTSSenctence) {
                setSentenceTranslation((BTSSenctence)o, true);
                return;
            }
        }

        setSentenceTranslation(evt.getSelectedItems().get(0));
    }

    /* Note that this does not copy comments, annotations, rubra or other related objects */
	private void pasteItems() {
        BTSTextSelectionEvent copied = deepCopyCache;
        if (!copied || copied.getSelectedItems().isEmpty())
            return;

        updateModelFromTranscription();

        /* Note that this might include ambivalences, and will even span any whole sentences selected. Due to the
         * offsetting logic in populateSelectionEvent the items of consecutive sentences will be treated as if their
         * sentences were concatenated. */
        Collection<BTSSentenceItems> copies = textEditorController.copySentenceItems(now.getSelectedItems());

		BTSTextSelectionEvent now = probeCurrentTextSelection();

        BTSSentenceItem first = now.getSelectedItems(0);
        /* Since selectedItems does not contain any items within BTSAmbivalences all items have the sentence as their
         * container. */
        BTSSenctence sentence = (BTSSenctence)first.eContainer();
        int insertOffset = sentence.getSentenceItems().indexOf(first);

        if (!now.isCursorEvent()) {
            /* Delete current selection */
            for (BTSSenctence sent : now.getSelectedSentences())
                EcoreUtil.delete(sent, false); /* Do not recurse as we will delete the items below */
            for (BTSTextItem item : now.getSelectedItems())
                EcoreUtil.delete(item, true); /* Recurse to handle ambivalences */
        }

        sentence.getSentenceItems().add(insertOffset, copies);
        /* FIXME loadInputTranscription(text, relatingObjects, monitor); */
        /* FIXME fixup cursor */
	}

    /* Note that this does not copy comments, annotations, rubra or other related objects */
	private void pasteSentences() {
        BTSTextSelectionEvent copied = deepCopyCache;
        if (!copied || copied.getSelectedItems().isEmpty())
            return;

        updateModelFromTranscription();

        /* Note that this might include ambivalences, and will even span any whole sentences selected. Due to the
         * offsetting logic in populateSelectionEvent the items of consecutive sentences will be treated as if their
         * sentences were concatenated. */
        Collection<BTSSentenceItems> copies = textEditorController.copy(now.getSelectedItems());

		BTSTextSelectionEvent now = probeCurrentTextSelection();

        BTSSenctence first = now.getSelectedSentences(0);
        BTSTextContent textContent = (BTSTextContent)first.eContainer();
        int insertOffset = textContent.getTextItems().indexOf(first);

        if (!now.isCursorEvent()) {
            /* Delete current selection */
            for (BTSSenctence sent : now.getSelectedSentences())
                EcoreUtil.delete(sent, false); /* Do not recurse as we will delete the items below */
        }

        textContent.getTextItems().add(insertOffset, copies);
        /* FIXME see above in pasteItems */
	}

	@SuppressWarnings("restriction")
	protected boolean updateModelFromTranscription() {
		if (text != null) {
			IAnnotationModel am = embeddedEditor.getViewer().getAnnotationModel();
			IXtextDocument document = embeddedEditor.getDocument();

			EList<EObject> objects = document.readOnly(new IUnitOfWork<EList<EObject>, XtextResource>() {
				@Override public EList<EObject> exec(XtextResource state) throws Exception {
					return state.getContents();
				}
			});
			EObject eo = objects.get(0);
			Resource resource = eo.eResource();
			boolean valid = checkResourceErrors(resource);
			if (!valid) {
				if (shell == null)
					shell = new Shell();
				MessageDialog dialog = new MessageDialog(shell, "Errors in Text - Possible Data Loss", null,
						"You are trying to save a text which contains errors, saving this text may lead to loss of data."
								+ "\n\nIt is not recommended to save a text which contains errors!"
								+ "\n\nAre you sure that you want to risk data loss and save with errors?", MessageDialog.WARNING,
								new String[] { "Save with Errors", "Don't Save" }, 1);
				int result = dialog.open();
				if (result != MessageDialog.OK)
					return false;
			}

			if (eo instanceof TextContent) {
				text.setTextContent(textEditorController.updateModelFromTextContent(
						text.getTextContent(), eo, am));
			}
		}
		return true;
	}

	private boolean checkTransliterationHasNoErrors(BTSText text2) {
		// XXX irgendwo fehler: wenn vorher irgendwann man errors drin waren,
		// bleibt das auch wenn man den text wechselt...
		IXtextDocument document = embeddedEditor.getDocument();

		EList<EObject> objects = document
				.readOnly(new IUnitOfWork<EList<EObject>, XtextResource>() {
					@Override
					public EList<EObject> exec(XtextResource state)
							throws Exception {
						return state.getContents();
					}
				});
		EObject eo = objects.get(0);
		Resource resource = eo.eResource();
		return checkResourceErrors(resource);
	}

	private boolean checkResourceErrors(Resource resource) {
		for (Diagnostic error : resource.getErrors()) {
			String msg = error.getMessage();

			if (msg == null)
				return false;

			// exception: if errors only concern beginning and end of file
			if (msg.equals("missing EOF at '\\r'"))
				continue;
			if (msg.equals("extraneous input '\\r' expecting '§'"))
				continue;
			if (msg.equals("mismatched input '<EOF>' expecting '§'"))
				continue;

			return false;
		}
		return true;
	}

	protected void loadInputJSesh(BTSText text2, List<BTSObject> localRelatingObjects) {
		String jseshMdc = textEditorController.transformTextToJSeshMdCString(text2);
		try {
			jseshEditor.setMDCText(jseshMdc + "-!"); // add line break
		} catch (Exception e) {
			logger.error(e);
		}

		try {
			java.awt.Rectangle r = jseshEditor.getBounds();
			scrolledCompJSesh.getContent().setSize(r.width,	r.height + 50);
			scrolledCompJSesh.setMinSize(r.width, r.height + 50);
			scrolledCompJSesh.layout();
		} catch (Exception e) {
			logger.error(e);
		}
	}

	@SuppressWarnings({ "rawtypes", "restriction" })
	protected void loadInputTranscription(BTSText localtext, List<BTSObject> localRelatingObjects, IProgressMonitor monitor) {
		text = localtext;
		loading = true;
		lemmaAnnotationMap = new HashMap<String, List<Object>>();
		annotationModel = embeddedEditor.getViewer().getAnnotationModel();

		if (monitor != null)
			monitor.beginTask("Load text into Transliteration-Editor.", IProgressMonitor.UNKNOWN);

		if (this.document == null)
			this.document = embeddedEditor.getDocument();

		embeddedEditorModelAccess.updateModel("\r", "§§", "\r");
		// remove old annotations
		List<Annotation> toRemove = new Vector<Annotation>();
		if (annotationModel != null) {
			// remove old annotations
			Iterator i = annotationModel.getAnnotationIterator();
			while (i.hasNext())
				toRemove.add((Annotation) i.next());
			for (Annotation a : toRemove)
				annotationModel.removeAnnotation(a);
		}

		AnnotationModel tempAnnotationModel = new AnnotationModel();
		if (localtext == null) {
			document.set("§§");
			if (relatingObjectsMap != null)
				relatingObjectsMap.clear();

		} else {
			if (localtext.getTextContent() == null) {
				localtext.setTextContent(BtsCorpusModelFactory.eINSTANCE
						.createBTSTextContent());
			}

			int fontSize = 12;
			try {
				FontData[] fds = embeddedEditor.getViewer().getTextWidget().getFont().getFontData();
				fontSize = fds[0].getHeight();
				fontSize = fontSize - 2;
			} catch (Exception e) {
			}

			int lineWith = embeddedEditor.getViewer().getTextWidget().getSize().x / fontSize;
			textEditorController.transformToDocument(
					localtext.getTextContent(), document, tempAnnotationModel,
					localRelatingObjects, relatingObjectsMap, lemmaAnnotationMap, monitor, lineWith);
		}

		String textString = document.get();
		// take care of empty input
		if (textString.length() == 0)
			textString = "§§";
		embeddedEditorModelAccess.updateModel("\r", textString, "\r");

		// remove painter so annotations are not painted individually
		painter.deactivate(false);
		loadAnnotations2Editor(annotationModel, tempAnnotationModel, monitor);
		painter.paint(IPainter.INTERNAL);
		painter.modelChanged(embeddedEditor.getViewer().getAnnotationModel());
		embeddedEditorParentComp.layout();

		// connect ruler to annotationModel
		ruler.setModel(annotationModel);
		ruler.update();
		ruler.relayout();

		// connect overview ruler to annotationModel
		oruler.setModel(annotationModel);
		oruler.update();

		loading = false;
	}

	private void processLemmaAnnotions(final HashMap<String, List<Object>> localLemmaAnnotationMap) {
		// FIXME cache map with text object
		// clear this cache on new selection
		// create command and handler that allows to execute this processing on user demand!

		sync.asyncExec(new Runnable() {
			public void run() {
				try {
					IRunnableWithProgress op = new IRunnableWithProgress() {
						@Override public void run(IProgressMonitor monitor) {
							monitor.beginTask("Load Lemmata referenced in text. Number of Lemmata: " + localLemmaAnnotationMap.size(), localLemmaAnnotationMap.size());
							for (String lemmaId : localLemmaAnnotationMap.keySet()) {
								List<Object> list = localLemmaAnnotationMap.get(lemmaId);
								if (list != null && !list.isEmpty()) {

									BTSLemmaEntry lemma = null;
									try {
										lemma = textEditorController.findLemmaEntry(lemmaId, monitor);
									} catch (Exception e) {
										e.printStackTrace();
									}

									if (lemma == null)
										continue;

									for (Object annotation : list) {
										if (monitor.isCanceled())
											return;

										if (annotation instanceof BTSModelAnnotation)
											((BTSModelAnnotation) annotation).setRelatingObject(lemma);
									}
								}
								monitor.worked(1);
							}
							lemmaAnnotationMap = null;

							return;
						}
					};
					new ProgressMonitorDialog(parentShell).run(true, true, op);
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		});
	}

	protected void showCurrentSignUnicode(String sign, int lineIndex, int caretOffset) {
		CharsetDecoder charsetDecoder = Charset.forName(BTSConstants.ENCODING).newDecoder();
		byte[] b = sign.getBytes(Charset.forName(BTSConstants.ENCODING));

		String codes = "";
		try {
			CharBuffer out = charsetDecoder.decode(ByteBuffer.wrap(b));
			for (char ch : out.array())
				codes += String.format(" U+%04X", (int)ch);
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}

		StatusMessage sm = BtsviewmodelFactory.eINSTANCE.createInfoMessage();
		sm.setMessage("Line: " + (lineIndex+1) + ", Column: " + caretOffset + ", UTF-8:" + codes);
		eventBroker.post("status_info/current_text_code", sm);
	}

	protected void highlightAnnotations(List<BTSModelAnnotation> annotations) {
		IAnnotationModel amodel = embeddedEditor.getViewer().getAnnotationModel();
        final AnnotationModelEvent ev = new AnnotationModelEvent(annotationModel);
		for (Iterator<Annotation> it = amodel.getAnnotationIterator(); it.hasNext();) {
            Annotation a = it.next();

			if (! (a instanceof BTSModelAnnotation))
				continue;
            BTSModelAnnotation ma = (BTSModelAnnotation)a;

            boolean old = ma.getHighlighted();
            boolean now;
            if (annotations.contains(ma))
                now = true;
            else
                now = false;

			ma.setHighlighted(now);
            if (old != now)
                ev.annotationChanged(a);
        }

        if (!ev.isEmpty()) {
            sync.asyncExec(new Runnable() {
                public void run() {
                    // TODO this can be improved in order to reduce work load repainting large texts
                    painter.modelChanged(ev);
                    painter.paint(IPainter.INTERNAL);
                    ruler.update();
                    ruler.relayout();
                    oruler.update();
                    embeddedEditor.getViewer().getTextWidget().redraw();
                }
            });
        }
	}

	private void revealAnnotation(List<BTSModelAnnotation> relatingObjectsAnnotations, final boolean force) {
		try {
			// TODO annotations should be sorted based on startpos?
			Annotation anno = relatingObjectsAnnotations.get(0);
			final Position pos = annotationModel.getPosition(anno);

			if (pos != null) {
				sync.asyncExec(new Runnable() {
					@SuppressWarnings("restriction")
					public void run() {
						XtextSourceViewer viewer = embeddedEditor.getViewer();
						if (!force) {
							int topLine = viewer.getTopIndex();
							int botLine = viewer.getBottomIndex();
							int caretPos = viewer.getTextWidget().getCaretOffset();
							int curLine = viewer.getTextWidget().getLineAtOffset(caretPos);
							int annoLineTop = viewer.getTextWidget().getLineAtOffset(pos.offset);
							int annoLineBot = viewer.getTextWidget().getLineAtOffset(pos.offset+pos.length);
							// consider changing displayed range if annotation exceeds current range
							// only jump if cursor would likely remain in visible range
							if ((topLine > annoLineTop) || (botLine < annoLineBot))
								if (botLine - curLine >= topLine - annoLineTop)
									viewer.revealRange(pos.getOffset(), pos.length);
						} else // jump regardless of cursor position
							viewer.revealRange(pos.getOffset(), pos.length);
					}
				});	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	protected void setDirtyInternal() {
		if (!permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), text))
            return;

        if (text == null || dirty == null)
            return;
        
        dirty.setDirty(true);
	}

	/** 
	 * Populate a BTSTextSelectionEvent with the annotations and BTSSentenceItems that are selected.
	 *
	 * This method is called to prepare further processing of a BTSTextSelectionEvent. I.e. a BTSTextSelectionEvent is
	 * constructed from a cursor or selection event, then this is called to map the base event's offset(s) to
	 * Annotations in xtext and BTSSentenceItems in the model.
	 */
	private BTSTextSelectionEvent populateSelectionEvent(BTSTextSelectionEvent evt) {
		BTSSentenceItem minItem = null, maxItem = null;
		int min_l = Integer.MAX_VALUE, max_r = -1;
		int sel_l = evt.x, sel_r = evt.y;

		IAnnotationModel amodel = embeddedEditor.getViewer().getAnnotationModel();
        List<Annotation> annos = new ArrayList<Annotation>();
		for (Iterator<Annotation> it = amodel.getAnnotationIterator(); it.hasNext();) {
			annos.add(it.next());

        /* Sort by offset. Xtext's wonderful getAnnotationIterator apart from being an iterator returns its elements in
         * a random order, which obviously is what you want in most cases. not. 8*/
        Collections.sort(annos, new Comparator<Annotation>() {
            public int compare(Annotation a, Annotation b) {
                return a.getOffset() - b.getOffset();
            }

            public boolean equals(Annotation a, Annotation b) {
                return a.getOffset() == b.getOffset();
            }
        });

        for (Annotation a : annos) {
			if (! (a instanceof BTSModelAnnotation))
				continue;
            BTSModelAnnotation ma = (BTSModelAnnotation)a;
			BTSIdentifiableItem iitem = ma.getModel();

			Position pos = amodel.getPosition(a);
			int ano_l = pos.getOffset(), ano_r = pos.getOffset() + pos.getLength();

			/* Check if selection interval [sel_l, sel_r] and annotation interval [ano_l, ano_r] overlap */
			boolean intervals_overlap = ano_l <= sel_r && sel_l <= ano_r;

			/* Check if annotation interval [ano_l, ano_r] is contained within selection interval [sel_l, sel_r] */
			boolean sel_contains_ano = sel_l <= ano_l && ano_r <= sel_r;

            boolean item_within_ambivalence = item.eContainer() instanceof BTSLemmaCase;

			/* For cursor events, add all items that the cursor is placed inside. This includes e.g. a containing
			 * ambivalence.  This is done so that when the cursor is placed somewhere, all comments that include that
			 * cursor position are highlighted.
			 *
			 * For selection events, only add items that are *fully contained* in the selection. This is done so you can
			 * place comments on parts of larger items, such as some words in one case of an ambivalence.
			 */
			if ((evt.isCursorEvent() && intervals_overlap)
					|| (!evt.isCursorEvent() && sel_contains_ano)) {

                if (iitem instanceof BTSSenctence) {
                    evt.getSelectedSentences().add((BTSSenctence)iitem);
                    continue;
                }

                if (! (iitem instanceof BTSSentenceItem)) /* item might also be e.g. a (BTS) annotation for annotationannotations */
                    continue;
                BTSSentenceItem item = (BTSSentenceItem)iitem;

				/* Store leftmost and rightmost selected item */
				if (ano_l <= min_l) {
					minItem = (BTSSentenceItem)item;
					min_l = ano_l;
				}
				if (ano_r >= max_r) {
					maxItem = (BTSSentenceItem)item;
					max_r = ano_r;
				}
				/* Store annotation and item in range. */
				evt.getTextAnnotations().add((BTSModelAnnotation)a);

                /* Do not add items within ambivalences, only add whole ambivalences. This is to prevent the ambiguity
                 * inherent in a selection starting inside an ambivalence's first LemmaCase and spanning its second
                 * LemmaCase.
                 *
                 * TODO Add special case for selections starting in an Ambivalence's *last* LemmaCase.
                 * TODO Add special case for selections entirely within a single LemmaCase. Fixup paste stuff in that
                 * instance.
                 *
                 * LemmaCases themselves do not need special handling here as they will be filtered out above since they
                 * are no SentenceItems.
                 *
                 * See also doc on BTSTextSelectionEvent#getSelectedItems */
                if (!item_within_ambivalence)
                    evt.getSelectedItems().add(item);

                if (ma instanceof BTSAnnotationAnnotation
                 || ma instanceof BTSCommentAnnotation
                 || ma instanceof BTSSubtextAnnotation) {
                    evt.getRelatedObjectAnnotations().add(ma);
                    evt.getRelatingObjects().add(ma.getRelatingObject());
                    evt.getInterTextReferences().add(ma.getInterTextReference());
                }
			}
		}

		/* The selected items may well be empty, e.g. if the cursor is placed right at the start or end of a document.
		 * We're only looking at certain types of items here, and that excludes e.g. sentence delimiters. */
        evt.setStart(minItem);
        evt.setEnd(maxItem);
		if (minItem != null)
			evt.setStartId(minItem.get_id());
		if (maxItem != null)
			evt.setEndId(maxItem.get_id());

		return evt;
	}



	@SuppressWarnings("rawtypes")
	private void loadAnnotations2Editor(IAnnotationModel editorModel, IAnnotationModel model, IProgressMonitor monitor) {
		if (monitor != null)
			monitor.beginTask("Load visible annotations to Text-Editor", IProgressMonitor.UNKNOWN);

		Issue issue = new Issue.IssueImpl();
		Iterator i = model.getAnnotationIterator();
		while (i.hasNext()) {
			Object a = i.next();
			Position pos = model.getPosition((Annotation) a);
			loadSingleAnnotation2Editor(editorModel, (BTSModelAnnotation)a, pos, issue);
			if (monitor != null)
				monitor.worked(1);
		}
	}

	protected void loadSingleAnnotation2Editor(IAnnotationModel editorModel, BTSModelAnnotation a, Position pos, Issue issue) {
		if (a instanceof BTSLemmaAnnotation) {
			if (((BTSLemmaAnnotation) a).getModel() instanceof BTSWord) {
				Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) a, pos2);
				modelAnnotationMap.put(((BTSIdentifiableItem) a.getModel()).get_id(), a);
			}
		} else if (a instanceof BTSAnnotationAnnotation) {
			if (((BTSAnnotationAnnotation) a).getRelatingObject() != null
					&& ((BTSAnnotationAnnotation) a).getRelatingObject().getType() != null
					&& ((BTSAnnotationAnnotation) a).getRelatingObject().getType().equalsIgnoreCase("rubrum")) {

				// Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) a, pos2);
				addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);
			}
			// Position pos = model.getPosition((Annotation) a);

			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} else if (a instanceof BTSCommentAnnotation) {
			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} else if (a instanceof BTSSubtextAnnotation) {
			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} 
		else if (a instanceof BTSSentenceAnnotation) {
			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			modelAnnotationMap.put(((BTSIdentifiableItem) a.getModel()).get_id(), a);
		}
		else if (a instanceof BTSModelAnnotation) {
			// Position pos = model.getPosition((Annotation) a);
			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			modelAnnotationMap.put(((BTSIdentifiableItem) a.getModel()).get_id(), a);
		}
	}

	private void addToRelatingObjectAnnotationMap(EObject object, BTSModelAnnotation ma) {
		List<BTSModelAnnotation> l = relatingObjectsAnnotationMap.get(object);
		if (l == null) {
			l = new Vector<BTSModelAnnotation>(2);
			relatingObjectsAnnotationMap.put(object, l);
		}
		l.add(ma);
	}

	@SuppressWarnings("restriction")
	@Inject
	@Optional
	void eventReceivedCaretEvents(@EventTopic("event_text_selection/*") final Object event) {
		if (text != null && event instanceof String) {
			switch (tabFolder.getSelectionIndex()) { /* the what?! - Sebastian */
			case 0:
				setTextSelectionEvent((String) event);
				break;
			case 1: // signtextEditor
				sync.asyncExec(new Runnable() {
					public void run() {
						signTextEditor.setTextSelectionEvent((String) event);
					}
				});
				break;
			}
		}
	}

	private void setTextSelectionEvent(String event) {
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1);
		}
	}

	private void shiftSelection(int i) {
	}

	public void setInputObjectDirect(BTSText object) {
		purgeCacheAndEditingDomain();
		text = object;
		if (object != null)loadInput(object);
		editingDomain = editingDomainController.getEditingDomain(text);
		editingDomain.getCommandStack().addCommandStackListener(getCommandStackListener());
	}

	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSIdentifiableItem selection) {
        /* This method is called when the selection is changed from the outside. This is the case when the
         * cursor jumps to the block a user selected in the hieroglyph viewer.
         *
         * This method also performs the totally unrelated function of loading the text that is selected in the
         * object tree viewer on the left. */

        System.out.println("ETE.p:setSelection: "+selection.toString());
		if (selection == null || parent == null || parent.isDisposed())
			return;

		if (selectedTextItem == selection)
            return;

        if (selection instanceof BTSWord) {
            setSentenceTranslation((BTSWord) selection);
            return;
        }

        if (selection instanceof BTSSenctence) {
            if (selectedSentence != selection)
                setSentenceTranslation((BTSSenctence) selection, false);
            return;
        }

        if (!(selection instanceof BTSCorpusObject))
            return;

        if (selection == text)
            return;

        BTSCorpusObject btsObject = (BTSCorpusObject) selection;
        if (!constructed && selection instanceof BTSText) {
            // not constructed, cache selection
            text = (BTSText) selection;
            selectionCached = true;
            return;
        }

        // TODO save configurable this is autosave!!!
        if (loaded && text != null)
            save();

        purgeCacheAndEditingDomain();

        if (selection instanceof BTSText) { // requires load
            if (part != null)
                part.setLabel(btsObject.getName());
            makePartActive(true);
            loadInput((BTSCorpusObject) selection);
            editingDomain = editingDomainController.getEditingDomain(text);
            editingDomain.getCommandStack().addCommandStackListener(getCommandStackListener());

        } else if (loaded) { // requires clear
            loadInput(null);
            if (part != null)
                part.setLabel("Text Editor");
            text = null;
            selectionCached = false;
            makePartActive(false);
        }
	}

	@SuppressWarnings("restriction")
	private void makePartActive(boolean activate) {
		embeddedEditor.getViewer().setEditable(activate);
		embeddedEditor.getViewer().getTextWidget().setEnabled(activate);
		signTextEditor.setEnabled(activate);
		jseshEditor.setEnabled(activate);
		sentenceTranslate_Editor.setEnabled(activate && userMayEdit);
		tabFolder.setEnabled(activate);
		if (activate)
		{
			embeddedEditor.getViewer().getTextWidget().setBackground(BTSUIConstants.COLOR_WIHTE);
			signTextEditor.setBackground(BTSUIConstants.COLOR_WIHTE);
		}
		else
		{
			embeddedEditor.getViewer().getTextWidget().setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
			signTextEditor.setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
		}

	}

	private void bringPartToFront(boolean b) {
		try {
			partService.bringToTop(part);
		} catch (Exception e) {
		}

	}

	private CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {

				@Override
				public void commandStackChanged(EventObject event) {
					if (editingDomain == null)
					{
						if (text == null)
							return;
						else
							editingDomain = getEditingDomain(text);
					}
					Command mostRecentCommand = editingDomain.getCommandStack()
							.getMostRecentCommand();
					if (mostRecentCommand != null) {
						if (mostRecentCommand.equals(editingDomain.getCommandStack().getUndoCommand())) {
							// normal command or redo executed
							localCommandCacheSet.add(mostRecentCommand);
							if (dirty != null && localCommandCacheSet.isEmpty()) {
								dirty.setDirty(false);
							} else  {
								setDirtyInternal();
							}
						} else {
							// undo executed
							if (localCommandCacheSet.remove(mostRecentCommand)
									&& localCommandCacheSet.isEmpty() && dirty != null) {
								dirty.setDirty(false);
							} else  {
								setDirtyInternal();
							}
						}
					}

				}
			};
		}
		return commandStackListener;
	}


	@SuppressWarnings("restriction")
	private void setSentenceItemSelected(BTSSentenceItem selectedItem) {
		if (selectionRange != null) {
			embeddedEditor
			.getViewer()
			.getTextWidget()
			.replaceStyleRanges(selectionRange.start,
					selectionRange.length, preSelectionRanges);
		}
		BTSModelAnnotation annotation = getModelAnnotationAtModelObject(selectedItem);
		if (annotation != null) {
			Position pos = embeddedEditor.getViewer().getAnnotationModel()
					.getPosition(annotation);
			int start = pos.getOffset() - 1;
			int len = pos.getLength();
			selectionRange = new StyleRange(start, len, null,
					BTSUIConstants.COLOR_SUBTEXT);
			preSelectionRanges = embeddedEditor.getViewer().getTextWidget()
					.getStyleRanges(start, len);
			embeddedEditor.getViewer().getTextWidget()
			.setStyleRange(selectionRange);
		}

	}

	private BTSModelAnnotation getModelAnnotationAtModelObject(
			BTSSentenceItem selectedItem) {
		return modelAnnotationMap.get(selectedItem.get_id());
	}

	private void setSentenceItemDeselected(BTSSentenceItem oldSelectedItem) {
		// TODO
	}

	private AnnotationModelEvent setSentenceTranslation(BTSSenctence sentence, boolean postSelection) {
		// TODO: allow for multiple sentence translations to be highlighted simultaneously
		// i.e. create method setSentenceTranslation(List<BTSSentence>) which gets passed
		// a Collection containing all sentences detected within a BTSTextSelectionEvent
		final AnnotationModelEvent ev = new AnnotationModelEvent(annotationModel);
		if (sentence == null || sentence == selectedSentence)
            return null;

        selectedSentence = sentence;
        if (selectedSentence.getTranslation() == null) {
            Command command = AddCommand.create(editingDomain, selectedSentence,
                    BtsCorpusModelPackage.BTS_SENCTENCE__TRANSLATION,
                    BtsmodelFactory.eINSTANCE
                    .createBTSTranslations());
            editingDomain.getCommandStack().execute(command);
        }
        sentenceTranslate_Editor.setEnabled(userMayEdit);
        sentenceTranslate_Editor.load(selectedSentence.getTranslation(), editingDomain, false);

        BTSModelAnnotation am = modelAnnotationMap.get(sentence.get_id());
        if (am != null) {
            if (!am.equals(highlightedSentenceAnnotation) || !am.getType().endsWith(".highlighted")) {
                // highlight current translation
                am.setHighlighted(true);
                ev.annotationChanged(am);
                // remove previous highlight
                if (highlightedSentenceAnnotation != null) { 
                    highlightedSentenceAnnotation.setHighlighted(false);
                    ev.annotationChanged(highlightedSentenceAnnotation);
                }
                highlightedSentenceAnnotation = am;
            }
            if (!postSelection) {
                // make sure annotation is visible in text editor 
                Position pos = annotationModel.getPosition(am);
                if (pos != null)
                    embeddedEditor.getViewer().revealRange(pos.getOffset(), pos.length);

                /* In order to limit workload, only repaint text editor (including highlight of line(s) containing
                 * this sentence) if method call seems to come from selection listener in EgyTextTranslationPart.
                 * This is indicated by postSelection being false.  (if postSelection is true, repaint has most
                 * likely already been invoked in highlightAnnotations) */
                sync.asyncExec(new Runnable() {
                    public void run() {
                        // TODO this can be improved in order to reduce work load repainting large texts
                        if (painter == null || embeddedEditor.getViewer().getTextWidget().isDisposed())
                            return;

                        painter.modelChanged(ev);
                        painter.paint(IPainter.INTERNAL);
                        ruler.update();
                        ruler.relayout();
                        oruler.update();
                        embeddedEditor.getViewer().getTextWidget().redraw();
                    }
                });
                return null;
            }
        }

        if (postSelection)
            selectionService.setSelection(sentence);
        return ev;
	}

	private void setSentenceTranslation(BTSSentenceItem sentenceItem) {
		if (sentenceItem == null) {
			setSentenceTranslationActive(false);
			return;
		}

		BTSSenctence sentence = null;
		if (sentenceItem.eContainer() instanceof BTSSenctence) {
			sentence = (BTSSenctence) sentenceItem.eContainer();
		} else if (sentenceItem.eContainer() instanceof BTSLemmaCase) {
			EObject container = sentenceItem.eContainer();
			if (container.eContainer() instanceof BTSAmbivalence) {
				EObject containerParent = container.eContainer();
				if (containerParent.eContainer() instanceof BTSSenctence)
					sentence = (BTSSenctence) containerParent.eContainer();
			}
		}
		setSentenceTranslation(sentence, true);
	}

	private void setSentenceTranslationActive(boolean active) {
		if(!active) {
			selectedSentence = null;
			sentenceTranslate_Editor.load(null, editingDomain, false);
		}
		sentenceTranslate_Editor.setEnabled(active && userMayEdit);
	}

	private void loadInput(BTSCorpusObject o) {
		setSentenceTranslationActive(false);
		// wipe latest text selection event in order to avoid leak
		selectionService.setSelection(new BTSTextSelectionEvent(new TypedEvent(this), o));

		if (tabFolder != null && o instanceof BTSText) {
			this.text = (BTSText) o;

			if (text != null) {
				try {
					IRunnableWithProgress op = new IRunnableWithProgress() {

						@Override
						public void run(final IProgressMonitor monitor)
								throws InvocationTargetException,
								InterruptedException {
							monitor.beginTask("Load relating objects (comments, annotations, glosses).", 100);
							relatingObjects = textEditorController
									.getRelatingObjects(text, monitor);
							relatingObjectsMap = textEditorController
									.fillRelatingObjectsMap(relatingObjects);
							queryId = "relations.objectId-" + text.get_id();

							sync.asyncExec(new Runnable() {
								public void run() {
									switch (tabFolder.getSelectionIndex()) {
									case 0: {
										loadInputTranscription(text,
												relatingObjects, monitor);
										break;
									}
									case 1: {
										loadInputSignText(text, relatingObjects, relatingObjectsMap, monitor, selectedTextItem);
										break;
									}
									case 2: {
										loadInputJSesh(text, relatingObjects);
										break;
									}
									}
									setUserMayEditInteral(userMayEdit);
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
			// plainTextEditor.setText(((BTSText) o).getCode());
		} else if (tabFolder != null && o == null) {
			this.text = null;
			loaded = false;

			relatingObjects = null;
			switch (tabFolder.getSelectionIndex()) {
			case 0: {
				loadInputTranscription(null, relatingObjects, null);
				break;
			}
			case 1: {
				loadInputSignText(null, relatingObjects, relatingObjectsMap, null, selectedTextItem);
				break;
			}
			case 2: {
				loadInputJSesh(null, relatingObjects);
				break;
			}
			}
		}
	}

	private void loadInputSignText(
			BTSText localText,
			List<BTSObject> localRelatingObjects,
			Map<String, List<BTSInterTextReference>> relatingObjectsMap2,
			IProgressMonitor monitor,
			Object localSelectedTextItem) {
		if (monitor != null)
			monitor.setTaskName("Load relating text into Sign-Text-Editor.");
		if (localText != null)
			signTextEditor.setInput(localText, localText.getTextContent(), localRelatingObjects, monitor, localSelectedTextItem);
		else
			signTextEditor.setInput(null, null, localRelatingObjects, monitor, localSelectedTextItem);
	}

	private BTSText createMockUp(BTSText text2) {
		if (text2 == null)
			text2 = BtsCorpusModelFactory.eINSTANCE.createBTSText();

		if (text2.getTextContent() == null)
			text2.setTextContent(BtsCorpusModelFactory.eINSTANCE.createBTSTextContent());

		BTSSenctence sentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();

		for (int i = 0; i < 20; i++) {
			BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
			w.setWChar(i + "hh");
			BTSGraphic g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
			g.setCode("n-s-t");
			w.getGraphics().add(g);
			sentence.getSentenceItems().add(w);
		}
		text2.getTextContent().getTextItems().add(sentence);

		return text2;
	}

	private void purgeCacheAndEditingDomain() {
		selectedSentence = null;
		cachedCursor = 0;
		modelAnnotationMap = new HashMap<String, BTSModelAnnotation>();
		relatingObjectsAnnotationMap.clear();
		localCommandCacheSet.clear();
		if (editingDomain != null)
			// remove commandstacklistener from old selection
			editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
		editingDomain = null;
		if (relatingObjectsMap != null)
			relatingObjectsMap.clear();
	}

	@Focus
	public void setFocus() {
		if (!loaded && selectionCached) // not yet loaded but has cached selection
			loadInput(text);

		// now set focus on specific editor pane
		if (tabFolder != null && text != null) {
			switch (tabFolder.getSelectionIndex()) {
			case 0:
				embeddedEditor.getViewer().getControl().setFocus();
				break;
			case 1:
				signTextEditor.setFocus();
				break;
			case 2:
				break;
			}

		}

		permissionsController.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
	}

	/**
	 * @return true, if successful
	 */
	@Persist
	public boolean save() {
		if (text == null || dirty == null || !dirty.isDirty() || 
				!permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), this.text))
			return false;

		if (tabFolder.getSelectionIndex() == 0 && !updateModelFromTranscription())
			return false;

		localCommandCacheSet.clear();

		// turn word-wise graphical update on model change notifications off 
		signTextEditor.setNotifyWords(false);
		sentenceTranslate_Editor.save();
		boolean success = textEditorController.save(this.text);

		dirty.setDirty(!success);
		// turn word-wise update back on
		signTextEditor.setNotifyWords(true);
		return success;
	}

	@Override
	public void setEditorSelection(final Object selection) {
		if (selection == null)
            return;

        sync.asyncExec(new Runnable() {
            public void run() {
                // workaround because selection service requires iniating
                // part to be the active part
                // see some bug of e4
                MPart p = null;
                MPart activePart = null;
                try {
                    p = partService.findPart("org.bbaw.bts.ui.corpus.egy.part.textEditor");
                    activePart = partService.getActivePart();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                boolean workaround = activePart != null && !activePart.equals(p);

                if (workaround)
                    partService.activate(p);

                if (selection instanceof BTSTextSelectionEvent
                        && ((BTSTextSelectionEvent) selection).data instanceof EObject) {
                    BTSTextSelectionEvent event = (BTSTextSelectionEvent) selection;
                    // remove listener from old editingDomain
                    if (editingDomain != null)
                        editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);

                    // get selected item, add listener to domain
                    if (!event.getSelectedItems().isEmpty()) {
                        editingDomain = getEditingDomain((EObject) event.getSelectedItems().get(0));
                        editingDomain.getCommandStack().addCommandStackListener(getCommandStackListener());
                        if (event.getSelectedItems().get(0) instanceof BTSSenctence)
                            setSentenceTranslation((BTSSenctence) event.getSelectedItems().get(0), true);
                        else if (event.getSelectedItems().get(0) instanceof BTSSentenceItem)
                            setSentenceTranslation((BTSSentenceItem) event.getSelectedItems().get(0));
                    }
                }
                selectionService.setSelection(selection);
                if (workaround)
                    partService.activate(activePart);
            }
        });
	}

	private EditingDomain getEditingDomain(EObject editingObject) {
		return editingDomainController.getEditingDomain(editingObject);
	}

	@Override
	public void handleEvent(Event event) {
		if (event.getTopic().startsWith("event_text_selection/"))
			eventReceivedCaretEvents(event.getTopic());
        else if (event.getTopic().equals("event_relating_objects/selected"))
				eventReceivedRelatingObjectsLoadedEvents(event.getProperty("org.eclipse.e4.data"));
    }

    @SuppressWarnings({ "restriction", "rawtypes" })
    @Inject
    @Optional
    void eventReceivedRelatingObjectsLoadedEvents(@EventTopic("event_relating_objects/*") Object event) {
        if (event instanceof List) {
            List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(((List) event).size());
            for (Object o : (List) event) {
                if (o instanceof BTSObject) {
                    List<BTSModelAnnotation> a = relatingObjectsAnnotationMap.get(o);
                    if (a != null)
                        annotations.addAll(a);
                }
            }

            if (!annotations.isEmpty())
                highlightAnnotations(annotations);
        }
    }

    @SuppressWarnings("restriction")
    @Inject
    @Optional
    void eventReceivedUpdates(@EventTopic("model_update/*") final BTSModelUpdateNotification notification) {
        if (notification.getQueryIds() != null) {
            sync.asyncExec(new Runnable() {
                @Override public void run() {
                    for (String id : notification.getQueryIds()) {
                        if (id.equals(queryId))
                            processModelUpdate(notification, id);
                    }
                }
            });
        }
    }

    @Inject
    @Optional
    void eventReceivedUpdates(@EventTopic("event_preferences_changed/*") String preferencePath) {
        if (preferencePath != null && preferencePath.endsWith(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS)) {
            sync.asyncExec(new Runnable() {
                @Override public void run() {
                    AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, getAnnotationPreferences());
                    configureEditorDrawingStrategies(oruler);
                }
            });

        }
    }

    @Inject
    @Optional
    void eventReceivedTextRequested(@UIEventTopic(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED+"translation_part") final BTSText current) {
        if (current == null || !current.equals(text))
            if (text != null)
                eventBroker.post(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED+"response", text);
    }

    @Inject
    @Optional
    void eventReceivedRelatedObjectsRequested(@UIEventTopic(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED+"annotations_part") final BTSRelatingObjectsLoadingEvent e) {
        if (e == null && text != null) {
            BTSRelatingObjectsLoadingEvent event = new BTSRelatingObjectsLoadingEvent(text);
            event.setRelatingObjects(relatingObjects);
            eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED, event);
        } 
    }

    @Inject
    @Optional
    void eventReceivedRelatedObjectsFilterSet(@UIEventTopic("event_anno_filters/*") final BTSRelatingObjectsFilterEvent event) {
        if (event == null)
            return;

        Map<String, Boolean> filters = event.getFilters();
        //painter.removeAllAnnotationTypes();
        for (Entry<String, Boolean> e : filters.entrySet()) {
            String typeId = e.getKey();
            String strategyId = null;
            if (getAnnotationStrategySet().contains(typeId)) {
                strategyId = typeId;
            } else {
                if (typeId.startsWith(BTSConstants.COMMENT))
                    strategyId = BTSConstants.COMMENT;
                else if (typeId.startsWith(CorpusUtils.SUBTEXT_TYPE))
                    strategyId = CorpusUtils.SUBTEXT_TYPE;
                else if (typeId.startsWith(BTSConstants.ANNOTATION + "." +CorpusUtils.ANNOTATION_RUBRUM_TYPE))
                    strategyId = BTSConstants.ANNOTATION + "." +CorpusUtils.ANNOTATION_RUBRUM_TYPE;
                else if (typeId.startsWith(BTSConstants.ANNOTATION))
                    strategyId = BTSConstants.ANNOTATION;
                else
                    strategyId = BTSConstants.ANNOTATION;
            }
            // update editor painter and ruler annotation types
            for (String suffix : ANNO_TYPES_SUFFIXES) {
                if (e.getValue()) {
                    painter.addAnnotationType(typeId+suffix, strategyId+suffix);
                    painter.setAnnotationTypeColor(typeId +suffix, getBackgroundColorTypePath(strategyId));
                    oruler.addAnnotationType(typeId+suffix);

                } else {
                    painter.removeAnnotationType(typeId+suffix);
                    oruler.removeAnnotationType(typeId+suffix);
                }
            }
            painter.paint(IPainter.INTERNAL);
        }
    }

    private Color getBackgroundColorTypePath(String typePath) {
        // read values from the instance scope
        String colorString = null;
        try {
            for (String childNode : getAnnotationPreferences().childrenNames()) {
                Preferences typeNode = getAnnotationPreferences().node(childNode);
                String settingsTypePath = AnnotationToolbarItemCreator.getAnnotationTypePath((IEclipsePreferences) typeNode);
                if (settingsTypePath.equals(typePath)) {
                    colorString = typeNode.get(BTSCorpusConstants.PREF_COLOR, null);
                    break;
                }
            }
        } catch (BackingStoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (colorString != null)
            return BTSUIConstants.getColor(colorString);

        if (typePath.startsWith(BTSConstants.COMMENT))
            return BTSUIConstants.COLOR_COMMENT;

        if (typePath.startsWith(BTSConstants.TEXT))
            return BTSUIConstants.COLOR_SUBTEXT;

        if (typePath.startsWith(BTSConstants.ANNOTATION + "." +CorpusUtils.ANNOTATION_RUBRUM_TYPE))
            return BTSUIConstants.COLOR_RUBRUM;

        if (typePath.startsWith(BTSConstants.ANNOTATION))
            return BTSUIConstants.COLOR_ANNOTATTION;

        return BTSUIConstants.COLOR_ANNOTATTION;
    }

    @Inject
    @Optional
    void eventReceivedLoadLemmata(@EventTopic("event_egy_text_editor_load_lemmata/*") Object o) {
        sync.asyncExec(new Runnable() {
            public void run() {
                cachedCursor = embeddedEditor.getViewer().getTextWidget().getCaretOffset();
                if (updateModelFromTranscription()) {
                    try {
                        // load updated model into selected editor
                        IRunnableWithProgress op = new IRunnableWithProgress() {
                            @Override public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                                sync.asyncExec(new Runnable() {
                                    public void run() {
                                        loadInputTranscription(text, relatingObjects, monitor);
                                        try {
                                            embeddedEditor.getViewer().getTextWidget().setCaretOffset(cachedCursor);
                                            embeddedEditor.getViewer().revealRange(cachedCursor, 0);
                                        } catch (Exception e) {
                                        }
                                    }
                                });
                            }
                        };
                        new ProgressMonitorDialog(new Shell()).run(true, true, op);
                    } catch (InvocationTargetException ee) {
                    } catch (InterruptedException ee) {
                    }
                }
            }
        });
    }

    private void processModelUpdate(BTSModelUpdateNotification notification, String id) {
        if (notification.getObject() instanceof BTSAnnotation
                || notification.getObject() instanceof BTSComment
                || notification.getObject() instanceof BTSText) {
            if (relatingObjects != null) {
                String state = ((BTSObject) notification.getObject()).getState();
                if (BTSConstants.OBJECT_STATE_ACTIVE.equals(state)) {
                    if (!relatingObjects.contains(notification.getObject()))
                        relatingObjects.add((BTSObject) notification.getObject());
                } else {
                    relatingObjects.remove((BTSObject) notification.getObject());
                }
            }

            switch (tabFolder.getSelectionIndex()) {
            case 0:
                addAnnotationToTranscription(notification);
                addAnnotationToSignText(notification);
                break;
            case 1:
                addAnnotationToTranscription(notification);
                addAnnotationToSignText(notification);
                break;
            }
        }
    }

    private void addAnnotationToSignText(BTSModelUpdateNotification notification) {
        signTextEditor.addRelatingObjectNotification(notification);
    }

    private void addAnnotationToTranscription(BTSModelUpdateNotification notification) {
        List<BTSModelAnnotation> mas = relatingObjectsAnnotationMap.get(notification.getObject());
        BTSObject object = (BTSObject) notification.getObject();

        // remove old annotations
        if (mas != null)
            for (BTSModelAnnotation ma : mas)
                annotationModel.removeAnnotation(ma);

        if (!BTSConstants.OBJECT_STATE_TERMINATED.equals(object.getState())) {
            // relObject ist neu
            for (BTSRelation rel : object.getRelations()) {
                if (rel.getObjectId() != null && text != null
                        && rel.getObjectId().equals(text.get_id())) {
                    for (BTSInterTextReference ref : rel.getParts()) {
                        int offset = 0;
                        int len = 0;
                        if (ref.getBeginId() != null
                                && ref.getBeginId().equals(ref.getEndId())) {
                            BTSModelAnnotation ma1 = modelAnnotationMap.get(ref
                                    .getBeginId());
                            Position pos = annotationModel.getPosition(ma1);
                            offset = pos.getOffset();
                            len = pos.getLength();
                        } else {
                            BTSModelAnnotation ma1 = modelAnnotationMap.get(ref.getBeginId());
                            BTSModelAnnotation ma2 = modelAnnotationMap.get(ref.getEndId());

                            Position pos = annotationModel.getPosition(ma1);
                            Position pos2 = annotationModel.getPosition(ma2);

                            if (pos2 != null) {
                                if (pos != null) {
                                    offset = pos.getOffset();
                                    len = (pos2.getOffset() - pos.getOffset())
                                            + pos2.getLength();
                                } else {
                                    offset = pos2.getOffset();
                                    len = pos2.getLength();
                                }
                            }
                        }

                        Issue issue = new Issue.IssueImpl();
                        Annotation annotation = makeAnnotation(object, issue, ref);
                        if (annotation != null)
                            annotationModel.addAnnotation(annotation, new Position(offset, len));
                    }
                }
            }
        }

        painter.modelChanged(annotationModel);
    }

    @SuppressWarnings("restriction")
    private Annotation makeAnnotation(BTSObject object, Issue issue, BTSInterTextReference ref) {
        BTSModelAnnotation ta = null;
        if (object instanceof BTSAnnotation) {
            if (((BTSAnnotation) object).getType() != null
                    && ((BTSAnnotation) object).getType().equalsIgnoreCase(
                            "rubrum")) {
                ta = new BTSAnnotationAnnotation(embeddedEditor.getDocument(), issue, object, (BTSAnnotation) object);
                ta.setInterTextReference(ref);
                addToRelatingObjectAnnotationMap(object, ta);
            } else {
                ta = new BTSAnnotationAnnotation(embeddedEditor.getDocument(), issue, object, (BTSAnnotation) object);
                ta.setInterTextReference(ref);
                addToRelatingObjectAnnotationMap(object, ta);
            }

        } else if (object instanceof BTSComment) {
            ta = new BTSCommentAnnotation(embeddedEditor.getDocument(), issue, object, (BTSComment) object);
            ta.setInterTextReference(ref);
            ta.setText("Comment Annotation --> here is a comment on this word.");
            addToRelatingObjectAnnotationMap(object, ta);

        } else if (object instanceof BTSText) {
            if (((BTSText) object).getType().equalsIgnoreCase("subtext")) {
                ta = new BTSSubtextAnnotation(embeddedEditor.getDocument(), issue, object, (BTSText) object);
                ta.setInterTextReference(ref);
                addToRelatingObjectAnnotationMap(object, ta);
            }
        }

        return ta;
    }

    @Inject
    @Optional
    public void setUserMayEdit(@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
        if(this.userMayEdit == null || userMayEdit != this.userMayEdit) {
            sync.asyncExec(new Runnable() {
                @Override public void run() {
                    setUserMayEditInteral(userMayEdit);
                }
            });
        }
    }

    protected void setUserMayEditInteral(boolean mayEdit) {
        if (parent != null && !parent.isDisposed()) {
            embeddedEditor.getViewer().setEditable(mayEdit);
            signTextEditor.setEnabled(mayEdit);
            sentenceTranslate_Editor.setEnabled(mayEdit);
            this.userMayEdit = mayEdit;
        }
    }
}
