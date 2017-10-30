/*
  This file is part of Berlin Text System.

  The software Berlin Text System serves as a client user interface for working with
  text corpus data. See: aaew.bbaw.de

  The software Berlin Text System was developed at the Berlin-Brandenburg Academy
  of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin. www.bbaw.de

  Copyright (C) 2013-2014  Berlin-Brandenburg Academy of Sciences and Humanities

  The software Berlin Text System was developed by @author: Christoph Plutte.

  Berlin Text System is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  Berlin Text System is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with Berlin Text System.
  If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.egy.parts;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import jsesh.editor.JMDCEditor;
import org.bbaw.bts.btsmodel.*;
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
import org.bbaw.bts.corpus.btsCorpusModel.*;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.custom.BTSE4ToGuiceXtextSourceViewerProvider;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsFilterEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsLoadingEvent;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.text.*;
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
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.osgi.service.event.EventHandler;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

import org.osgi.service.event.Event;

public class EgyTextEditorPart extends AbstractTextEditorLogic implements IBTSEditor, EventHandler {
    private static final int EDITOR_PREFIX_LENGTH = 1;
    private static final int LINE_SPACE = 8;
    protected int counter;
    protected boolean loading;
    protected int tabSelection;
    protected Object selectedTextItem;
    protected boolean isDocUpdating;
    protected String queryId;
    protected int cachedCursor;
    protected Object deepCopyCache;
    @Optional
    @Inject
    private MDirtyable dirty;
    @Inject
    private BTSTextEditorController textEditorController;
    @Inject
    private ESelectionService selectionService;
    @Inject
    private UISynchronize sync;
    @Inject
    private EventBroker eventBroker;
    @Inject
    private
    IEclipseContext context;
    @Inject
    private EContextService contextService;
    @Inject
    private EPartService partService;
    @Inject
    private EditingDomainController editingDomainController;
    @Inject
    private PermissionsAndExpressionsEvaluationController permissionsController;
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
    private Composite embeddedEditorParentComp;
    private CompositeRuler ruler;
    private OverviewRuler oruler;
    private BTSSenctence selectedSentence;
    private Map<String, BTSModelAnnotation> modelAnnotationMap;
    private StyleRange selectionRange;
    private StyleRange[] preSelectionRanges;
    private TranslationEditorComposite sentenceTranslate_Editor;
    private EditingDomain editingDomain;
    private CommandStackListener commandStackListener;
    private Set<Command> localCommandCacheSet = new HashSet<Command>();
    private Composite parent;
    private MPart part;
    private List<BTSObject> relatingObjects;
    @SuppressWarnings("restriction")
    @Inject
    private Logger logger;
    private List<BTSModelAnnotation> highlightedAnnotations = new Vector<BTSModelAnnotation>(4);
    private Map<EObject, List<BTSModelAnnotation>> relatingObjectsAnnotationMap = new HashMap<EObject, List<BTSModelAnnotation>>();
    private Map<String, List<BTSInterTextReference>> relatingObjectsMap;
    private CharsetDecoder charsetDecoder;
    private EgyLineNumberRulerColumn lineNumberRulerColumn;
    private HashMap<String, List<Object>> lemmaAnnotationMap;
    @Inject
    @Optional
    @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
    private Boolean userMayEdit;
    @Optional
    @Inject
    @Active
    private Shell parentShell;
    /**
     * Is the/an object loaded into the GUI?
     */
    private boolean loaded;
    /**
     * Has the GUI been constructed yet?
     */
    private boolean constructed;
    /**
     * Has the selection been cached so it can be loaded when gui becomes visible or constructed?
     */
    private boolean selectionCached;
    @Inject
    @Active
    @Optional
    private Shell shell;
    private ScrolledComposite scrolledCompJSesh;
    @Inject
    @Preference(value = BTSEGYUIConstants.PREF_TRANSLITERATION_EDITOR_SHOW_LINE_NUMBER_RULER, nodePath = "org.bbaw.bts.ui.corpus.egy")
    private boolean show_line_number_ruler;
    private BTSModelAnnotation highlightedSentenceAnnotation;
    private BTSTextSelectionEvent btsTextEvent;
    private long lastSelectionTimeStamp = 0;
    private Job delaySelectionJob;

    @Inject
    public EgyTextEditorPart(EPartService partService) {
        try {
            part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);
        } catch (Exception e) {
            logger.warn("Part Service couldn't find " + BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);
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
        contextService.activateContext("org.eclipse.ui.contexts.dialogAndWindow");

        // load annotation styling settings node
        AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, getAnnotationPreferences());

        SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
        sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
        Composite composite = new Composite(sashForm, SWT.NONE);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        composite.setLayout(new GridLayout());
        ((GridLayout) composite.getLayout()).marginHeight = 0;
        ((GridLayout) composite.getLayout()).marginWidth = 0;
        {
            tabFolder = new CTabFolder(composite, SWT.BORDER);
            tabFolder.setSimple(false);
            tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
            tabFolder.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    int oldSelection = tabSelection;
                    tabSelection = tabFolder.getSelectionIndex();
                    boolean canSwitch = true;
                    if (tabSelection != oldSelection) {
                        // update model from old selection editor
                        switch (oldSelection) {
                            case 0:
                                cachedCursor = embeddedEditor.getViewer().getTextWidget().getCaretOffset();
                                canSwitch = updateModelFromTranscription();
                                break;
                            case 1:
                                signTextEditor.clearContent();
                                break;
                            case 2:
                            default:
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

                                @Override
                                public void run(final IProgressMonitor monitor)
                                        throws InvocationTargetException,
                                        InterruptedException {
                                    sync.asyncExec(new Runnable() {
                                        public void run() {
                                            switch (tabSelection) {
                                                case 0: {
                                                    contextService
                                                            .activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");

                                                    loadInputTranscription(text, relatingObjects, monitor);
                                                    if (selectedTextItem != null) {
                                                        Annotation an = modelAnnotationMap.get(((BTSIdentifiableItem) selectedTextItem).get_id());
                                                        if (an != null) {
                                                            Position pos = annotationModel.getPosition(an);
                                                            try {
                                                                embeddedEditor.getViewer().getTextWidget().setCaretOffset(pos.getOffset());
                                                                embeddedEditor.getViewer().revealRange(pos.getOffset(), pos.getLength());
                                                            } catch (Exception e) {
                                                                /* Drop it like a pro */
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            embeddedEditor.getViewer().getTextWidget().setCaretOffset(cachedCursor);
                                                        } catch (Exception e) {
                                                                /* Drop it like a pro */
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 1: {

                                                    loadInputSignText(text, relatingObjects,
                                                            relatingObjectsMap, monitor, selectedTextItem);
                                                    break;
                                                }
                                                case 2: {
                                                    loadInputJSesh(text, relatingObjects);
                                                    break;
                                                }
                                            }
                                        }
                                    });
                                }
                            };
                            new ProgressMonitorDialog(new Shell()).run(true, true, op);
                        } catch (InvocationTargetException | InterruptedException ee) {
                            // handle exception
                        }

                    }

                }
            });

            tabFolder.setSelectionBackground(Display.getCurrent()
                    .getSystemColor(
                            SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
            {
                CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
                tbtmPlaintext2.setText("Transliteration");
                {

                    embeddedEditorParentComp = new Composite(tabFolder,
                            SWT.NONE | SWT.BORDER);
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


                    embeddedEditorComp = new Composite(
                            embeddedEditorParentComp, SWT.None);
                    embeddedEditorComp.setLayout(new GridLayout());
                    embeddedEditorComp.setLayout(new GridLayout());
                    ((GridLayout) embeddedEditorComp.getLayout()).marginHeight = 0;
                    ((GridLayout) embeddedEditorComp.getLayout()).marginWidth = 0;
                    embeddedEditorComp.setLayoutData(new GridData(SWT.FILL,
                            SWT.FILL, true, true));

                    context.get(StaticAccessController.class);

                    oruler = new OverviewRuler(new DefaultMarkerAnnotationAccess(), 12, EditorsUI.getSharedTextColors());

                    // new trial
                    injector = textEditorController.findEgyDslInjector().createChildInjector(
                            new AbstractModule() {
                                @Override
                                protected void configure() {
                                    bind(XtextSourceViewer.Factory.class).to(new XtextSourceViewer.DefaultFactory() {
                                        @Override
                                        public XtextSourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, IOverviewRuler overviewRuler, boolean showsAnnotationOverview, int styles) {
                                            return super.createSourceViewer(
                                                    parent,
                                                    ruler,
                                                    oruler,
                                                    showsAnnotationOverview,
                                                    styles);
                                        }
                                    }.getClass());
                                }
                            });

                    embeddedEditorFactory = injector
                            .getInstance(EmbeddedEditorFactory.class);

                    embeddedEditor = embeddedEditorFactory
                            .newEditor(xtextResourceProvider)
                            .showAnnotations(
                                    "org.eclipse.xtext.ui.editor.error",
                                    "org.eclipse.xtext.ui.editor.warning")
                            .withParent(embeddedEditorComp);

                    embeddedEditorModelAccess = embeddedEditor
                            .createPartialEditor("", "§§", "", false);
                    embeddedEditor.getViewer().getTextWidget()
                            .setLineSpacing(LINE_SPACE);

                    // embeddedEditor.getViewer().getTextWidget().setFont(font);
                    // keep the partialEditor as instance var to read / write
                    // the edited
                    // text

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
                    painter = new AnnotationPainter(embeddedEditor.getViewer(),
                            annotationAccess);

                    configureEditorDrawingStrategies(oruler);

                    embeddedEditor.getViewer().addTextPresentationListener(painter);
                    embeddedEditor.getViewer().addPainter(painter);

                    embeddedEditorParentComp.layout();

                    context.set(XtextSourceViewer.class, embeddedEditor.getViewer());
                    BTSE4ToGuiceXtextSourceViewerProvider.setContext(context);

                    embeddedEditor.getViewer().getTextWidget()
                            .addCaretListener(new CaretListener() {

                                @Override
                                public void caretMoved(CaretEvent event) {
                                    processTextSelection(event);
                                    // get char right of caret and show utf-8
                                    // code in status line
                                    if (event.caretOffset < embeddedEditor
                                            .getViewer().getTextWidget()
                                            .getText().length()) {
                                        String sign = embeddedEditor
                                                .getViewer()
                                                .getTextWidget()
                                                .getText(event.caretOffset,
                                                        event.caretOffset);
                                        if (sign != null && !"".equals(sign)) {
                                            int lineIndex = embeddedEditor
                                                    .getViewer()
                                                    .getTextWidget()
                                                    .getLineAtOffset(
                                                            event.caretOffset);
                                            int offset = event.caretOffset
                                                    - embeddedEditor
                                                    .getViewer()
                                                    .getTextWidget()
                                                    .getOffsetAtLine(
                                                            lineIndex);
                                            showCurrentSignUnicode(sign,
                                                    lineIndex, offset);
                                        }
                                    }
                                }
                            });
                    embeddedEditor.getViewer().getTextWidget()
                            .addSelectionListener(new SelectionListener() {
                                @Override
                                public void widgetSelected(SelectionEvent event) {
                                    processTextSelection(event);
                                }

                                @Override
                                public void widgetDefaultSelected(
                                        SelectionEvent e) {
                                    // TODO Auto-generated method stub

                                }
                            });
                    loadInputTranscription(null, relatingObjects, null);

                    embeddedEditor.getDocument().addDocumentListener(
                            new IDocumentListener() {

                                @Override
                                public void documentChanged(DocumentEvent event) {
                                    if (!loading) {
                                        setDirtyInternal();
                                    }

                                }

                                @Override
                                public void documentAboutToBeChanged(
                                        DocumentEvent event) {
                                    // TODO Auto-generated method stub

                                }
                            });
                    final Menu menu = embeddedEditor.getViewer().getTextWidget().getMenu();
                    menu.addMenuListener(new MenuListener() {

                        @Override
                        public void menuShown(MenuEvent e) {


                            if (checkTransliterationHasNoErrors(text)) {
                                if (!btsTextEvent.getSelectedItems().isEmpty()) {
                                    MenuItem itemCopy = new MenuItem(menu, SWT.NONE);
                                    itemCopy.setText("Copy with Lemmata");
                                    itemCopy.addSelectionListener(new SelectionAdapter() {

                                        @Override
                                        public void widgetSelected(SelectionEvent e) {
                                            copyTextWithLemmata();
                                        }
                                    });
                                }
                                if (deepCopyCache != null) {
                                    MenuItem itemPaste = new MenuItem(menu, SWT.NONE);
                                    itemPaste.setText("Paste with Lemmata");
                                    itemPaste.addSelectionListener(new SelectionAdapter() {

                                        @Override
                                        public void widgetSelected(SelectionEvent e) {
                                            pasteTextWithLemmata();
                                        }
                                    });
                                }

                            } else {
                                MenuItem itemCollectionFolder = new MenuItem(menu, SWT.NONE);
                                itemCollectionFolder.setText("Correct Errors before Copy/Paste!");

                            }

                        }

                        @Override
                        public void menuHidden(MenuEvent e) {
                            // TODO Auto-generated method stub
                        }
                    });


                }
                CTabItem signTextTab = new CTabItem(tabFolder, SWT.NONE);
                signTextTab.setText("Sign Text Editor");
                {
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
                }
                CTabItem tbtm5 = new CTabItem(tabFolder, SWT.NONE);
                tbtm5.setText("JSesh View");
                {
                    scrolledCompJSesh = new ScrolledComposite(tabFolder, SWT.HORIZONTAL
                            | SWT.VERTICAL);
                    scrolledCompJSesh.setMinWidth(800);
                    scrolledCompJSesh.setMinHeight(400);
                    scrolledCompJSesh.setExpandHorizontal(true);
                    scrolledCompJSesh.setExpandVertical(true);
                    tbtm5.setControl(scrolledCompJSesh);

                    final Composite comEmbeded = new Composite(scrolledCompJSesh,
                            SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
                    scrolledCompJSesh.setContent(comEmbeded);

                    Frame frame = SWT_AWT.new_Frame(comEmbeded);

                    jseshEditor = new JMDCEditor();
                    jseshEditor.setMDCText("");
                    jseshEditor.setPreferredSize(new Dimension(500, 500));
                    jseshEditor.addKeyListener(new java.awt.event.KeyListener() {
                        @Override
                        public void keyTyped(java.awt.event.KeyEvent e) {
                        }

                        @Override
                        public void keyReleased(java.awt.event.KeyEvent e) {
                            Display.getDefault().asyncExec(
                                    new Runnable() {

                                        @Override
                                        public void run() {

                                        }
                                    });

                        }

                        @Override
                        public void keyPressed(java.awt.event.KeyEvent e) {
                        }
                    });

                    frame.add(jseshEditor);
                    comEmbeded.layout();
                    scrolledCompJSesh.layout();
                    scrolledCompJSesh.pack();
                }
            }
        }
        tabFolder.setSelection(0);
        composite.layout();
        composite.pack();

        Group sentenceTranslateComp = new Group(sashForm, SWT.NONE);
        sentenceTranslateComp.setLayoutData(new GridData(GridData.FILL_BOTH));
        sentenceTranslateComp.setLayout(new GridLayout());
        sentenceTranslateComp.setText("Sentence Translation");
        sentenceTranslate_Editor = new TranslationEditorComposite(
                sentenceTranslateComp, SWT.WRAP | SWT.MULTI | SWT.V_SCROLL
                | SWT.BORDER, null, null, false, true);
        sentenceTranslate_Editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
                true, true));
        sentenceTranslateComp.layout();
        sashForm.setWeights(new int[]{6, 1});
        parent.layout();

        constructed = true;
        if (selectionCached) {
            loadInput(text);
        }
    }

    private void copyTextWithLemmata() {
        // action: set local copy text
        // design:
        // if all is selected: copy whole textContent
        this.deepCopyCache = this.btsTextEvent;
        // else if sentence and sentence items
        // dont copy comments, annotations, rubra or any other relating object

        // if local copy text set: deep paste action
        // insert design:
        //
    }

    private void pasteTextWithLemmata() {
        if (deepCopyCache instanceof BTSTextSelectionEvent) {
            BTSTextSelectionEvent ev = (BTSTextSelectionEvent) deepCopyCache;

            if (ev.getSelectedItems().isEmpty()) return; // nothing to paste

            cachedCursor = embeddedEditor.getViewer().getTextWidget()
                    .getCaretOffset();
            final int len = ev.y - ev.x;
            updateModelFromTranscription();

            // if copyitems begin with Sentence -> add sentence after selectedItem
            // if copyItems begin with SentenceItem -> add new Sentence with sentenceItems
            Object first = ev.getSelectedItems().get(0);
            if (selectedTextItem instanceof BTSSentenceItem) {
                // if copyItems begin with SentenceItem -> add items after selected sentenceItems
                if (first instanceof BTSSentenceItem || first instanceof BTSSenctence) {
                    if (((BTSSentenceItem) selectedTextItem).eContainer() instanceof BTSSenctence) {
                        BTSSenctence targetSentence = (BTSSenctence) ((BTSSentenceItem) selectedTextItem).eContainer();
                        int index = targetSentence.getSentenceItems().indexOf(selectedTextItem);
                        for (BTSIdentifiableItem copyItem : ev.getSelectedItems()) {
                            if (copyItem instanceof BTSSentenceItem) {
                                BTSSentenceItem copiedItem = copySentenceItem((BTSSentenceItem) copyItem);
                                if (copiedItem != null) {
                                    index = index + 1;
                                    targetSentence.getSentenceItems().add(index, copiedItem);
                                    setDirtyInternal();
                                }
                            }
                        }
                    }
                }
            } else if (selectedTextItem instanceof BTSSenctence) {
                // if copyItems begin with SentenceItem -> add items after selected sentenceItems
                if (first instanceof BTSSentenceItem || first instanceof BTSSenctence) {
                    BTSSenctence sourceSentence = (BTSSenctence) selectedTextItem;
                    BTSTextContent targettextcontent = (BTSTextContent) (sourceSentence).eContainer();
                    int index = targettextcontent.getTextItems().indexOf(sourceSentence);
                    Set<BTSSenctence> copySentences = new HashSet<BTSSenctence>();
                    for (BTSIdentifiableItem copyItem : ev.getSelectedItems()) {
                        if (copyItem instanceof BTSSenctence && !copySentences.contains(copyItem)) {
                            copySentences.add((BTSSenctence) copyItem);
                            BTSSenctence copiedItem = copySentence((BTSSenctence) copyItem);
                            if (copiedItem != null) {
                                index = index + 1;
                                targettextcontent.getTextItems().add(index, copiedItem);
                                setDirtyInternal();
                            }
                        }
                    }
                }
            }
            // update
            try {
                // load updated model into selected editor
                IRunnableWithProgress op = new IRunnableWithProgress() {

                    @Override
                    public void run(final IProgressMonitor monitor)
                            throws InvocationTargetException,
                            InterruptedException {
                        sync.asyncExec(new Runnable() {
                            public void run() {
                                loadInputTranscription(text, relatingObjects, monitor);
                                try {
                                    embeddedEditor
                                            .getViewer()
                                            .getTextWidget()
                                            .setCaretOffset(cachedCursor);
                                    embeddedEditor.getViewer().revealRange(cachedCursor, len);
                                } catch (Exception e) {
                                }
                            }

                        });
                    }
                };
                new ProgressMonitorDialog(new Shell()).run(true, true, op);
            } catch (InvocationTargetException | InterruptedException ee) {
                // handle exception
            }
        }
    }

    private BTSSenctence copySentence(BTSSenctence copyItem) {
        return textEditorController.copySentence(copyItem);
    }

    private BTSSentenceItem copySentenceItem(BTSSentenceItem copyItem) {
        return textEditorController.copySentenceItem(copyItem);
    }

    @SuppressWarnings("restriction")
    protected boolean updateModelFromTranscription() {
        if (text != null) {
            IAnnotationModel am = embeddedEditor.getViewer().getAnnotationModel();
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
            if (!checkResourceErrors(resource)) {
                if (shell == null) shell = new Shell();
                MessageDialog dialog = new MessageDialog(shell, "Errors in Text - Possible Data Loss", null,
                        "You are trying to save a text which contains errors, saving this text may lead to loss of data."
                                + "\n\nIt is not recommended to save a text which contains errors!"
                                + "\n\nAre you sure that you want to risk data loss and save with errors?", MessageDialog.WARNING,
                        new String[]{"Save with Errors", "Don't Save"}, 1);
                int result = dialog.open();
                if (result != MessageDialog.OK)
                    return false;
            }
            if (eo instanceof TextContent)
                text.setTextContent(textEditorController.updateModelFromTextContent(text.getTextContent(), eo, am));
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
            // exception: if errors only concern beginning and end of file
            String msg = error.getMessage();
            if (msg == null)
                return false;
            switch (msg) {
                case "missing EOF at '\\r'":
                case "extraneous input '\\r' expecting '§'":
                case "mismatched input '<EOF>' expecting '§'":
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    protected void loadInputJSesh(BTSText text2, List<BTSObject> localRelatingObjects) {
        String jseshMdc = textEditorController.transformTextToJSeshMdCString(text2);
        System.out.println(jseshMdc);
        try {
            jseshEditor.setMDCText(jseshMdc + "-!"); // add line break
        } catch (Exception e) {
            logger.error(e);
        }
        try {
            java.awt.Rectangle r = jseshEditor.getBounds();
            System.out.println("rectangle r.width,	r.height " + r.width + " " + r.height);
            scrolledCompJSesh.getContent().setSize(r.width, r.height + 50);
            scrolledCompJSesh.setMinSize(r.width,
                    r.height + 50);
            scrolledCompJSesh.layout();
        } catch (Exception e) {
            logger.error(e);
        }

    }

    @SuppressWarnings({"rawtypes", "restriction"})
    protected void loadInputTranscription(BTSText localtext, List<BTSObject> localRelatingObjects, IProgressMonitor monitor) {
        if (delaySelectionJob != null)
            delaySelectionJob.cancel();
        delaySelectionJob = new Job("text_selection_processing_sleeping") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                long t = System.currentTimeMillis();
                while (System.currentTimeMillis() < t + 3000)
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                delaySelectionJob = null;
                return Status.OK_STATUS;
            }
        };

        text = localtext;
        loading = true;
        lemmaAnnotationMap = new HashMap<String, List<Object>>();
        annotationModel = embeddedEditor.getViewer().getAnnotationModel();

        if (monitor != null) monitor.beginTask("Load text into Transliteration-Editor.", IProgressMonitor.UNKNOWN);

        if (this.document == null) {
            this.document = embeddedEditor.getDocument();
        }
//		try {
//			annotationModel.disconnect(document);
//		} catch (Exception e) {
//		}

        embeddedEditorModelAccess.updateModel("\r", "§§", "\r");
        // remove old annotations
        if (annotationModel != null) { // remove old annotations
            Iterator i = annotationModel.getAnnotationIterator();
            while (i.hasNext()) {
                i.next();
                i.remove();
            }
        }

        AnnotationModel tempAnnotationModel = new AnnotationModel();
        if (localtext == null) {
            document.set("§§");
            if (relatingObjectsMap != null)
                relatingObjectsMap.clear();
        } else {
            if (localtext.getTextContent() == null)
                localtext.setTextContent(BtsCorpusModelFactory.eINSTANCE.createBTSTextContent());
            int fontSize = 12;
            try {
                FontData[] fds = embeddedEditor.getViewer().getTextWidget().getFont().getFontData();
                fontSize = fds[0].getHeight() - 2;
            } catch (Exception e) {
            }
            int lineWith = embeddedEditor.getViewer().getTextWidget().getSize().x / fontSize;
            textEditorController.transformToDocument(
                    localtext.getTextContent(), document, tempAnnotationModel,
                    localRelatingObjects, relatingObjectsMap, lemmaAnnotationMap, monitor, lineWith);
        }
        String textString = document.get();
        // take care of empty input
        if (textString.length() == 0) {
            textString = "§§";
        }
        embeddedEditorModelAccess.updateModel("\r", textString, "\r");

        // remove painter so annotations are not painted individually
//		embeddedEditor.getViewer().removePainter(painter);
        painter.deactivate(false);
        loadAnnotations2Editor(annotationModel, tempAnnotationModel, monitor);
//		annotationModel.connect(document);
//		embeddedEditor.getViewer().addPainter(painter);
        painter.paint(IPainter.INTERNAL);
        painter.modelChanged(embeddedEditor.getViewer().getAnnotationModel());
        embeddedEditorParentComp.layout();

        // connect overview ruler to annotationModel
        oruler.setModel(annotationModel);
        oruler.update();

        loading = false;
        delaySelectionJob.schedule();
    }

    private void processLemmaAnnotions(
            final HashMap<String, List<Object>> localLemmaAnnotationMap) {
        // FIXME cache map with text object
        // clear this cache on new selection
        // create command and handler that allows to execute this processing on user demand!

        sync.asyncExec(new Runnable() {
            public void run() {
                try {
                    IRunnableWithProgress op = new IRunnableWithProgress() {

                        @Override
                        public void run(IProgressMonitor monitor) {
                            monitor.beginTask("Load Lemmata referenced in text. Number of Lemmata: " + localLemmaAnnotationMap.size(), localLemmaAnnotationMap.size());
                            for (String lemmaId : localLemmaAnnotationMap.keySet()) {
                                if (monitor.isCanceled()) return;

                                List<Object> list = localLemmaAnnotationMap.get(lemmaId);
                                if (list != null && !list.isEmpty()) {
                                    BTSLemmaEntry lemma = null;
                                    try {
                                        lemma = textEditorController.findLemmaEntry(lemmaId, monitor);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    if (lemma != null) {
                                        for (Object annotation : list) {
                                            if (monitor.isCanceled()) return;

                                            if (annotation instanceof BTSModelAnnotation) {
                                                ((BTSModelAnnotation) annotation).setRelatingObject(lemma);
                                            }
                                        }
                                    }
                                }
                                monitor.worked(1);
                            }
                            lemmaAnnotationMap = null;
                        }
                    };
                    new ProgressMonitorDialog(parentShell).run(true, true, op);
                } catch (InvocationTargetException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }

    protected void showCurrentSignUnicode(String sign, int lineIndex,
                                          int caretOffset) {
        StatusMessage sm = BtsviewmodelFactory.eINSTANCE.createInfoMessage();
        charsetDecoder = Charset.forName(BTSConstants.ENCODING).newDecoder();
        byte[] b = sign.getBytes(Charset.forName(BTSConstants.ENCODING));
        ByteBuffer in = ByteBuffer.wrap(b);
        CharBuffer out;
        StringBuilder codes = new StringBuilder();
        try {
            for (int codepoint : charsetDecoder.decode(in).array())
                codes.append(String.format("U+%04X ", codepoint));
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
        sm.setMessage("Line: " + (lineIndex+1) + ", Column: " + caretOffset + ", UTF-8: " + codes.toString().trim());
        eventBroker.post("status_info/current_text_code", sm);

    }

    protected void processTextSelection(TypedEvent event) {
        BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event, text);
        btsEvent.data = text;
        if (this.delaySelectionJob == null) {
            this.btsTextEvent = btsEvent;
            Job.getJobManager().cancel(BTSTextSelectionEvent.class);
            delaySelectionJob = new Job("delay_selection_processing") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    while (System.nanoTime() < lastSelectionTimeStamp + 350000000) /* ?! */
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            return Status.CANCEL_STATUS;
                        }
                    final BTSTextSelectionEvent btsEvent = btsTextEvent;
                    sync.asyncExec(new Runnable() {

                        @Override
                        public void run() {
                            List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(
                                    btsEvent.x, btsEvent.y, btsEvent);
                            btsEvent.getTextAnnotations().addAll(annotations);
                            processSelection(annotations, false, btsEvent);
                            selectionService.setSelection(btsEvent);

                        }
                    });
                    delaySelectionJob = null;
                    return Status.OK_STATUS;
                }
                @Override
                public boolean belongsTo(Object family) {
                    return family.equals(BTSTextSelectionEvent.class);
                }
            };
            this.delaySelectionJob.schedule(400);
        } else if (!(event instanceof CaretEvent) || (this.btsTextEvent == null)
                || (this.btsTextEvent.getOriginalEvent() instanceof CaretEvent))
            this.btsTextEvent = btsEvent;
        this.lastSelectionTimeStamp = System.nanoTime();
    }

    protected void processSelection(List<BTSModelAnnotation> annotations,
                                    boolean postSelection, BTSTextSelectionEvent btsEvent) {
        List<BTSModelAnnotation> relatingObjectsAnnotations = new Vector<BTSModelAnnotation>(
                annotations.size());
        AnnotationModelEvent ev_trans = null;
        if (!annotations.isEmpty()) {
            BTSSenctence sentence = null;
            for (BTSModelAnnotation ma : annotations) {
                if (ma instanceof BTSLemmaAnnotation
                        && ma.getModel() instanceof BTSObject
                        && !ma.getModel().equals(selectedTextItem)) {
                    if (ma.getModel() instanceof BTSWord) {
                        setSentenceTranslation((BTSWord) ma.getModel());
                    } else if (ma.getModel() instanceof BTSSenctence) {
                        sentence = (BTSSenctence) ma.getModel();
                    }
                    selectedTextItem = ma.getModel();

                } else if (ma instanceof BTSAnnotationAnnotation
                        || ma instanceof BTSCommentAnnotation
                        || ma instanceof BTSSubtextAnnotation) {
                    relatingObjectsAnnotations.add(ma);
                    if (btsEvent != null)
                        btsEvent.getInterTextReferences().add(ma.getInterTextReference());
                } else if (ma != null) {
                    if (ma.getModel() instanceof BTSSenctence)
                        sentence = (BTSSenctence) ma.getModel();
                    if (!ma.getModel().equals(selectedTextItem))
                        selectedTextItem = ma.getModel();
                }
            }
            if (sentence != null)
                ev_trans = setSentenceTranslation(sentence, true);
        } else {
            setSentenceTranslationActive(false);
        }
        List<BTSModelAnnotation> deHighlightedAnnotations = new Vector<BTSModelAnnotation>(
                highlightedAnnotations.size());
        List<BTSModelAnnotation> toBeHighlightedAnnotations = new Vector<BTSModelAnnotation>(
                relatingObjectsAnnotations.size());
        // substract annotations that are already highlighted from those the selected annotations
        toBeHighlightedAnnotations.addAll(relatingObjectsAnnotations);
        toBeHighlightedAnnotations.removeAll(highlightedAnnotations);
        // substract annotations the selected annotations those that are to be de-highlighted
        deHighlightedAnnotations.addAll(highlightedAnnotations);
        deHighlightedAnnotations.removeAll(relatingObjectsAnnotations);

        boolean modelChanged = (!deHighlightedAnnotations.isEmpty() || !toBeHighlightedAnnotations.isEmpty());
        modelChanged |= (ev_trans != null && !ev_trans.isEmpty());

        highlightAnnotations(deHighlightedAnnotations, false);
        highlightAnnotations(toBeHighlightedAnnotations, true);
        toBeHighlightedAnnotations.add(highlightedSentenceAnnotation);

        highlightedAnnotations.clear();
        highlightedAnnotations.addAll(relatingObjectsAnnotations);

        if (modelChanged) {
            final AnnotationModelEvent ev = new AnnotationModelEvent(annotationModel);
            // apply model changes from sentence translation highlighting
            if (ev_trans != null)
                for (Annotation a : ev_trans.getChangedAnnotations())
                    if (a != null) ev.annotationChanged(a);
            for (Annotation a : deHighlightedAnnotations)
                if (a != null) ev.annotationChanged(a);
            for (Annotation a : toBeHighlightedAnnotations)
                if (a != null) ev.annotationChanged(a);

            sync.asyncExec(new Runnable() {
                public void run() {
                    // TODO this can be improved in order to reduce work load repainting large texts
                    painter.modelChanged(ev);
                    painter.paint(IPainter.INTERNAL);
                    oruler.update();
                    embeddedEditor.getViewer().getTextWidget().redraw();
                }
            });
        }

        // calculate event data
        if (!relatingObjectsAnnotations.isEmpty()) {
            List<BTSObject> relSelObjects = new Vector<BTSObject>(
                    annotations.size());
            for (BTSModelAnnotation a : relatingObjectsAnnotations) {
                if (a instanceof BTSAnnotationAnnotation) {
                    relSelObjects.add(a.getRelatingObject());
                } else if (a instanceof BTSCommentAnnotation) {
                    relSelObjects.add(((BTSCommentAnnotation) a).getComment());
                } else if (a instanceof BTSSubtextAnnotation) {
                    relSelObjects.add(a.getRelatingObject());
                }
            }
            if (btsEvent != null) {
                btsEvent.setRelatingObjects(new ArrayList<BTSObject>(relSelObjects));
            } else
                revealAnnotation(relatingObjectsAnnotations, true);

            // if (postSelection){
            // eventBroker.post(
            // BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
            // relSelObjects);
            // }

        }
        // else if (postSelection)
        // {
        // eventBroker.post(
        // BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
        // null);
        // }

    }

    private void revealAnnotation(List<BTSModelAnnotation> relatingObjectsAnnotations, final boolean force) {
        try {
            // TODO annotations should be sorted based on startpos?
            Annotation anno = relatingObjectsAnnotations.get(0);
            final Position pos = annotationModel.getPosition(anno);

            if (pos != null)
                sync.asyncExec(new Runnable() {
                    @SuppressWarnings("restriction")
                    public void run() {
                        XtextSourceViewer viewer = embeddedEditor.getViewer();
                        if (force) { // jump regardless of cursor position
                            viewer.revealRange(pos.getOffset(), pos.length);
                        } else {
                            int topLine = viewer.getTopIndex();
                            int botLine = viewer.getBottomIndex();
                            int caretPos = viewer.getTextWidget().getCaretOffset();
                            int curLine = viewer.getTextWidget().getLineAtOffset(caretPos);
                            int annoLineTop = viewer.getTextWidget().getLineAtOffset(pos.offset);
                            int annoLineBot = viewer.getTextWidget().getLineAtOffset(pos.offset + pos.length);
                            // consider changing displayed range if annotation exceeds current range
                            // only jump if cursor would likely remain in visible range
                            if ((topLine > annoLineTop) || (botLine < annoLineBot))
                                if (botLine - curLine >= topLine - annoLineTop)
                                    viewer.revealRange(pos.getOffset(), pos.length);
                        }
                    }
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void highlightAnnotations(
            List<BTSModelAnnotation> relatingObjectsAnnotations,
            boolean highlighted) {
        for (BTSModelAnnotation a : relatingObjectsAnnotations) {
            a.setHighlighted(highlighted);
        }
    }

    protected void setDirtyInternal() {
        if (permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), text)) {
            if (text != null && dirty != null && !dirty.isDirty()) {
                dirty.setDirty(true);
            }
        }
    }

    @SuppressWarnings("restriction")
    private List<BTSModelAnnotation> getModelAnnotationAtSelection(int start,
                                                                   int end, BTSTextSelectionEvent btsEvent) {
        Iterator<Annotation> it = embeddedEditor.getViewer().getAnnotationModel()
                .getAnnotationIterator();
        List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(4);
        Map<Integer, List<BTSModelAnnotation>> annotationOffsetMap = new HashMap<Integer, List<BTSModelAnnotation>>(4);
        BTSSentenceItem startItem = null;
        BTSSentenceItem endItem = null;
        int endItemOffeset = 0;
        List<BTSIdentifiableItem> textItems = new Vector<BTSIdentifiableItem>();
        while (it.hasNext()) {
            Annotation a = it.next();
            if (a instanceof BTSModelAnnotation) {
                Position pos = embeddedEditor.getViewer().getAnnotationModel()
                        .getPosition(a);
                // System.out.println("pos " + pos.getOffset() + " " +
                // pos.getOffset() + pos.getLength());
                if ((pos.getOffset() <= start && start < pos.getOffset()
                        + pos.getLength())
                        || (pos.getOffset() >= start && pos.getOffset() <= end)) {
                    List<BTSModelAnnotation> list = annotationOffsetMap.get(pos.getOffset());
                    if (list == null) {
                        list = new ArrayList<BTSModelAnnotation>(2);
                        annotationOffsetMap.put(pos.getOffset(), list);
                    }
                    list.add((BTSModelAnnotation) a);

                    // nur sentenceitems oder alles?
//					if (((BTSModelAnnotation) a).getModel() instanceof BTSSentenceItem) {
//						BTSSentenceItem item = (BTSSentenceItem) ((BTSModelAnnotation) a)
//								.getModel();
//						textItems.add(item);
//						
//					}
                }
                // else if (pos.getOffset() >= start && pos.getOffset() <= end) {
                //     annotations.add((ModelAnnotation) a);
                // }
            }
        }

        // sort keys and add annotations to annotationslist according to the order of their offset
        List<Integer> offsets = new ArrayList<Integer>(annotationOffsetMap.size());
        offsets.addAll(annotationOffsetMap.keySet());
        Collections.sort(offsets);
        for (Integer i : offsets) {
            List<BTSModelAnnotation> list = annotationOffsetMap.get(i);
            annotations.addAll(list);

            // calculate the start and end item and startId and endId
            for (BTSModelAnnotation a : list) {
                // add selected Items
                textItems.add(a.getModel());

                // calculate start and end
                if (a.getModel() instanceof BTSSentenceItem)
                    if (!a.getClass().getSuperclass().equals(BTSModelAnnotation.class)
                            || a instanceof BTSLemmaAnnotation) {
                        Position pos = embeddedEditor.getViewer().getAnnotationModel()
                                .getPosition(a);
                        BTSSentenceItem item = (BTSSentenceItem) a.getModel();

                        if (startItem == null
                                && !(item instanceof BTSAmbivalence)) {
                            startItem = item;
                        }
                        if (endItem == null
                                || (!(item instanceof BTSAmbivalence) && pos.getOffset() + pos.getLength() > endItemOffeset)) {
                            endItem = item;
                            endItemOffeset = pos.getOffset() + pos.getLength();
                        }
                    }
            }
        }

        if (btsEvent != null) {
            if (startItem != null) {
                btsEvent.setStartId(startItem.get_id());
            }
            if (endItem != null) {
                btsEvent.setEndId(endItem.get_id());
            }
            btsEvent.getSelectedItems().addAll(textItems);
        }
        return annotations;
    }

    @SuppressWarnings("rawtypes")
    private void loadAnnotations2Editor(IAnnotationModel editorModel,
                                        IAnnotationModel model, IProgressMonitor monitor) {
        Iterator i = model.getAnnotationIterator();
        Issue issue;
        issue = new Issue.IssueImpl();
        if (monitor != null) {
            if (monitor.isCanceled()) return;
            monitor.beginTask("Load visible annotations to Text-Editor", IProgressMonitor.UNKNOWN);
        }
        while (i.hasNext()) {
            Object a = i.next();
            Position pos = model.getPosition((Annotation) a);
            loadSingleAnnotation2Editor(editorModel, (BTSModelAnnotation) a, pos, issue);
            if (monitor != null) {
                monitor.worked(1);
            }
        }

    }

    protected void loadSingleAnnotation2Editor(IAnnotationModel editorModel, BTSModelAnnotation a, Position pos, Issue issue) {
        Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
        if (a instanceof BTSLemmaAnnotation) {
            if (a.getModel() instanceof BTSWord) {
                editorModel.addAnnotation(a, pos2);
                modelAnnotationMap.put(a.getModel().get_id(), a);
            }
        } else if (a instanceof BTSAnnotationAnnotation) {
            if (a.getRelatingObject() != null
                    && a.getRelatingObject().getType() != null
                    && a.getRelatingObject().getType().equalsIgnoreCase("rubrum")) {
                // Position pos = model.getPosition((Annotation) a);
                editorModel.addAnnotation(a, pos2);
                addToRelatingObjectAnnotationMap(a.getRelatingObject(), a);
            }
            // Position pos = model.getPosition((Annotation) a);

            editorModel.addAnnotation(a, pos2);
            addToRelatingObjectAnnotationMap(a.getRelatingObject(), a);
        } else if (a instanceof BTSCommentAnnotation || a instanceof BTSSubtextAnnotation) {
            editorModel.addAnnotation(a, pos2);
            addToRelatingObjectAnnotationMap(a.getRelatingObject(), a);
        } else if (a != null) { /* Includes BTSSentenceAnnotation */
            editorModel.addAnnotation(a, pos2);
            modelAnnotationMap.put(a.getModel().get_id(), a);
        }
    }

    private void addToRelatingObjectAnnotationMap(EObject object,
                                                  BTSModelAnnotation ma) {
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
            switch (tabFolder.getSelectionIndex()) {
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
        switch (event) {
            case BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS:
                shiftSelection(-1);
                break;
            case BTSUIConstants.EVENT_TEXT_SELECTION_NEXT:
                shiftSelection(1);
                break;
        }
    }

    private void shiftSelection(int i) {
//		embeddedEditor.getViewer().getTextWidget().getCaretOffset();
    }

    public void setInputObjectDirect(BTSText object) {
        purgeCacheAndEditingDomain();
        text = object;
        if (object != null)
            loadInput(object);
        editingDomain = editingDomainController.getEditingDomain(text);
        editingDomain.getCommandStack().addCommandStackListener(getCommandStackListener());
    }

    @Inject
    public void setSelection(
            @Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSIdentifiableItem selection) {
        if (selection == null || parent == null)
            return;
        if (parent.isDisposed() || selection.equals(selectedTextItem))
            return;
        if (selection instanceof BTSCorpusObject) { // concered by selection event
            if (selection.equals(text))
                return;
            BTSCorpusObject btsObject = (BTSCorpusObject) selection;
            if (constructed) { // gui constructed
                // TODO save configurable this is autosave!!!
                if (loaded && text != null)
                    save();

                if (selection instanceof BTSText) { // requires load
                    purgeCacheAndEditingDomain();
                    if (part != null) {
                        part.setLabel(btsObject.getName());
                    }
                    makePartActive(true);
//						bringPartToFront(true);
                    loadInput((BTSCorpusObject) selection);
                    editingDomain = editingDomainController.getEditingDomain(text);
                    editingDomain.getCommandStack().addCommandStackListener(getCommandStackListener());
                } else if (loaded) { // requires clear
                    purgeCacheAndEditingDomain();
                    loadInput(null);
                    if (part != null)
                        part.setLabel("Text Editor");
                    text = null;
                    selectionCached = false;
                    makePartActive(false);
                }
            } else if (selection instanceof BTSText) { // not constructed, cache selection
                text = (BTSText) selection;
                selectionCached = true;
            }

            selectedTextItem = selection;
        }
        if (selection instanceof BTSWord) {
            System.out.println("text editor received word/sent item selection!");
            setSentenceTranslation((BTSWord) selection);
        } else if (selection instanceof BTSSenctence) {
            if (this.selectedSentence == null || !this.selectedSentence.equals(selection))
                setSentenceTranslation((BTSSenctence) selection, false);
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
        if (activate) {
            embeddedEditor.getViewer().getTextWidget().setBackground(BTSUIConstants.COLOR_WIHTE);
            signTextEditor.setBackground(BTSUIConstants.COLOR_WIHTE);
        } else {
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
                    if (editingDomain == null) {
                        if (text == null) return;
                        else editingDomain = getEditingDomain(text);
                    }
                    Command mostRecentCommand = editingDomain.getCommandStack().getMostRecentCommand();
                    if (mostRecentCommand != null) {
                        if (mostRecentCommand.equals(editingDomain.getCommandStack().getUndoCommand())) {
                            // normal command or redo executed
                            localCommandCacheSet.add(mostRecentCommand);
                            if (dirty != null && localCommandCacheSet.isEmpty()) {
                                dirty.setDirty(false);
                            } else {
                                setDirtyInternal();
                            }
                        } else {
                            // undo executed
                            if (localCommandCacheSet.remove(mostRecentCommand)
                                    && localCommandCacheSet.isEmpty() && dirty != null) {
                                dirty.setDirty(false);
                            } else {
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
                    .replaceStyleRanges(selectionRange.start, selectionRange.length, preSelectionRanges);
        }
        BTSModelAnnotation annotation = getModelAnnotationAtModelObject(selectedItem);
        if (annotation != null) {
            Position pos = embeddedEditor.getViewer().getAnnotationModel()
                    .getPosition(annotation);
            int start = pos.getOffset() - 1;
            int len = pos.getLength();
            selectionRange = new StyleRange(start, len, null, BTSUIConstants.COLOR_SUBTEXT);
            preSelectionRanges = embeddedEditor.getViewer().getTextWidget().getStyleRanges(start, len);
            embeddedEditor.getViewer().getTextWidget().setStyleRange(selectionRange);
        }
    }

    private BTSModelAnnotation getModelAnnotationAtModelObject(BTSSentenceItem selectedItem) {
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
        if (sentence != null && !sentence.equals(selectedSentence)) {
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

                    // In order to limit workload, only repaint text editor (including highlight of line(s)
                    // containing this sentence) if method call seems to come from selection listener
                    // in EgyTextTranslationPart. This is indicated by postSelection being false.
                    // (if postSelection is true, repaint has most likely already been invoked in processSelection)
                    sync.asyncExec(new Runnable() {
                        public void run() {
                            // TODO this can be improved in order to reduce work load repainting large texts
                            if (painter == null || embeddedEditor.getViewer().getTextWidget().isDisposed()) return;
                            painter.modelChanged(ev);
                            painter.paint(IPainter.INTERNAL);
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
        return null;
    }

    private void setSentenceTranslation(BTSSentenceItem sentenceItem) {
        if (sentenceItem != null) {
            BTSSenctence sentence = null;
            if (sentenceItem.eContainer() instanceof BTSSenctence) {
                sentence = (BTSSenctence) sentenceItem.eContainer();
            } else if (sentenceItem.eContainer() instanceof BTSLemmaCase) {
                EObject container = sentenceItem.eContainer();
                if (sentenceItem.eContainer() instanceof BTSAmbivalence) {
                    EObject containerParent = container.eContainer();
                    if (containerParent.eContainer() instanceof BTSSenctence) {
                        sentence = (BTSSenctence) containerParent.eContainer();
                    }
                }
            }
            setSentenceTranslation(sentence, true);
        } else {
            setSentenceTranslationActive(false);
        }
    }

    private void setSentenceTranslationActive(boolean active) {
        if (!active) {
            selectedSentence = null;
            sentenceTranslate_Editor.load(null, editingDomain, false);
        }
        sentenceTranslate_Editor.setEnabled(active && userMayEdit);
    }

    private void loadInput(BTSCorpusObject o) {
        setSentenceTranslationActive(false);
        // wipe latest text selection event in order to avoid leak
        this.btsTextEvent = new BTSTextSelectionEvent(new TypedEvent(this), o);
        selectionService.setSelection(btsTextEvent);

        if (tabFolder != null && o instanceof BTSText) {
            this.text = (BTSText) o;
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
                                    case 0:
                                        loadInputTranscription(text, relatingObjects, monitor);
                                        break;
                                    case 1:
                                        loadInputSignText(text, relatingObjects, relatingObjectsMap, monitor, selectedTextItem);
                                        break;
                                    case 2:
                                        loadInputJSesh(text, relatingObjects);
                                        break;
                                }
                                setUserMayEditInteral(userMayEdit);
                                loaded = true;
                            }
                        });

                        Job job = new Job("post_relating_objects") {
                            @Override
                            protected IStatus run(IProgressMonitor monitor) {
                                BTSRelatingObjectsLoadingEvent event = new BTSRelatingObjectsLoadingEvent(text);
                                event.setRelatingObjects(relatingObjects);
                                eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED, event);
                                return Status.OK_STATUS;
                            }

                        };
                        job.schedule(1000);

                    }
                };
                new ProgressMonitorDialog(new Shell()).run(true, true, op);
            } catch (InvocationTargetException | InterruptedException e) {
                // handle exception
            }
            // plainTextEditor.setText(((BTSText) o).getCode());
        } else if (tabFolder != null && o == null) {
            this.text = null;
            loaded = false;

            relatingObjects = null;
            switch (tabFolder.getSelectionIndex()) {
                case 0:
                    loadInputTranscription(null, relatingObjects, null);
                    break;
                case 1:
                    loadInputSignText(null, relatingObjects, relatingObjectsMap, null, selectedTextItem);
                    break;
                case 2:
                    loadInputJSesh(null, relatingObjects);
                    break;
            }
        }
    }

    private void loadInputSignText(BTSText localText,
                                   List<BTSObject> localRelatingObjects,
                                   Map<String, List<BTSInterTextReference>> relatingObjectsMap2, IProgressMonitor monitor, Object localSelectedTextItem) {
        // if (text2 == null || text2.getTextContent() == null
        // || text2.getTextContent().getTextItems().isEmpty())
        // text2 = createMockUp(text2);
        if (monitor != null) monitor.setTaskName("Load relating text into Sign-Text-Editor.");
        if (localText != null) {
            signTextEditor.setInput(localText, localText.getTextContent(), localRelatingObjects, monitor, localSelectedTextItem);
        } else {
            signTextEditor.setInput(null, null, localRelatingObjects, monitor, localSelectedTextItem);
        }
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
        if (editingDomain != null) {
            // remove commandstacklistener from old selection
            editingDomain.getCommandStack().removeCommandStackListener(
                    commandStackListener);
        }
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

    @Persist
    public boolean save() {
        if (text == null
                || dirty == null
                || !dirty.isDirty()
                || !permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), this.text))
            return false;

        if (tabFolder.getSelectionIndex() == 0 && !updateModelFromTranscription())
            return false; /* Can't save */

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
                    p = partService
                            .findPart("org.bbaw.bts.ui.corpus.egy.part.textEditor");
                    activePart = partService.getActivePart();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                boolean workaround;
                if (activePart != null && !activePart.equals(p)) {
                    workaround = true;
                    partService.activate(p);
                } else {
                    workaround = false;
                }


                if (selection instanceof BTSTextSelectionEvent
                        && ((BTSTextSelectionEvent) selection).data instanceof EObject) {
                    BTSTextSelectionEvent event = (BTSTextSelectionEvent) selection;
                    // remove listener from old editingDomain
                    if (editingDomain != null) {
                        editingDomain.getCommandStack()
                                .removeCommandStackListener(
                                        commandStackListener);
                    }
                    // get selected item, add listener to domain
                    if (!event.getSelectedItems().isEmpty()) {
                        editingDomain = getEditingDomain(event.getSelectedItems().get(0));
                        editingDomain.getCommandStack()
                                .addCommandStackListener(
                                        getCommandStackListener());
                        if (event.getSelectedItems().get(0) instanceof BTSSenctence) {
                            setSentenceTranslation((BTSSenctence) event.getSelectedItems().get(0), true);
                        } else if (event.getSelectedItems().get(0) instanceof BTSSentenceItem) {
                            setSentenceTranslation((BTSSentenceItem) event.getSelectedItems().get(0));
                            if (!event.getSelectedItems().get(0).equals(selectedTextItem)) {
                                selectedTextItem = event.getSelectedItems().get(0);
                            }
                        }
                    }


                }
                selectionService.setSelection(selection);

                // processEditorSelection(selection);
                if (workaround) {
                    partService.activate(activePart);
                }
            }
        });
    }

    private EditingDomain getEditingDomain(EObject editingObject) {
        return editingDomainController.getEditingDomain(editingObject);
    }

    @Override
    public void handleEvent(Event event) {
        // System.out.println(arg0);
        if (event.getTopic().startsWith("event_text_selection/")) {
            eventReceivedCaretEvents(event.getTopic());
            return;
        }
        switch (event.getTopic()) {
            case "event_text_relating_objects/loaded":
                break;
            case "event_relating_objects/selected":
                eventReceivedRelatingObjectsLoadedEvents(event.getProperty("org.eclipse.e4.data"));
                break;
        }

    }

    @SuppressWarnings({"restriction", "rawtypes"})
    @Inject
    @Optional
    void eventReceivedRelatingObjectsLoadedEvents(
            @EventTopic("event_relating_objects/*") Object event) {

        if (event != null && event instanceof List) {
            List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(
                    ((List) event).size());
            for (Object o : (List) event) {
                if (o instanceof BTSObject) {
                    List<BTSModelAnnotation> a = relatingObjectsAnnotationMap
                            .get(o);
                    if (a != null) {
                        annotations.addAll(a);
                    }
                }
            }
            if (!annotations.isEmpty()) {
                processSelection(annotations, false, null);
            }
        }
    }

    @SuppressWarnings("restriction")
    @Inject
    @Optional
    void eventReceivedUpdates(
            @EventTopic("model_update/*") final BTSModelUpdateNotification notification) {
        //logger.info("EgyTextEditorPart eventReceivedUpdates. object: "
        //		+ notification);
        if (notification.getQueryIds() != null) {

            sync.asyncExec(new Runnable() {
                @Override
                public void run() {
                    for (String id : notification.getQueryIds()) {
                        if (id.equals(queryId)) {
                            processModelUpdate(notification, id);
                        }
                    }
                }
            });

        }
    }

    @Inject
    @Optional
    void eventReceivedUpdates(
            @EventTopic("event_preferences_changed/*") String preferencePath) {
        if (preferencePath != null && preferencePath.endsWith(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS)) {

            sync.asyncExec(new Runnable() {
                @Override
                public void run() {
                    AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part,
                            getAnnotationPreferences());
                    configureEditorDrawingStrategies(oruler);

                }
            });

        }
    }

    @Inject
    @Optional
    void eventReceivedTextRequested(
            @UIEventTopic(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED + "translation_part") final BTSText current) {
        if (current == null || !current.equals(text)) {
            if (text != null) {
                eventBroker.post(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED + "response", text);
            }
        }
    }

    @Inject
    @Optional
    void eventReceivedRelatedObjectsRequested(
            @UIEventTopic(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED + "annotations_part") final BTSRelatingObjectsLoadingEvent e) {
        if (e == null)
            if (text != null) {
                BTSRelatingObjectsLoadingEvent event = new BTSRelatingObjectsLoadingEvent(
                        text);
                event.setRelatingObjects(relatingObjects);
                eventBroker
                        .post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED,
                                event);
            }
    }

    @Inject
    @Optional
    void eventReceivedRelatedObjectsFilterSet(
            @UIEventTopic("event_anno_filters/*") final BTSRelatingObjectsFilterEvent event) {
        if (event != null) {
            Map<String, Boolean> filters = event.getFilters();
            //painter.removeAllAnnotationTypes();
            for (Entry<String, Boolean> e : filters.entrySet()) {
                String typeId = e.getKey();
                String strategyId;
                if (getAnnotationStrategySet().contains(typeId)) {
                    strategyId = typeId;
                } else {
                    if (typeId.startsWith(BTSConstants.COMMENT)) {
                        strategyId = BTSConstants.COMMENT;
                    } else if (typeId.startsWith(CorpusUtils.SUBTEXT_TYPE)) {
                        strategyId = CorpusUtils.SUBTEXT_TYPE;
                    } else if (typeId.startsWith(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE)) {
                        strategyId = BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE;
                    } else if (typeId.startsWith(BTSConstants.ANNOTATION)) {
                        strategyId = BTSConstants.ANNOTATION;
                    } else {
                        strategyId = BTSConstants.ANNOTATION;
                    }
                }
                // update editor painter and ruler annotation types
                for (String suffix : ANNO_TYPES_SUFFIXES) {
                    if (e.getValue()) {
                        painter.addAnnotationType(typeId + suffix,
                                strategyId + suffix);

                        painter.setAnnotationTypeColor(typeId + suffix, getBackgroundColorTypePath(strategyId));
                        oruler.addAnnotationType(typeId + suffix);
                    } else {
                        painter.removeAnnotationType(typeId + suffix);
                        oruler.removeAnnotationType(typeId + suffix);
                    }
                }
                painter.paint(IPainter.INTERNAL);
            }
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
        Color color;
        if (colorString != null) {
            color = BTSUIConstants.getColor(colorString);
        } else {
            if (typePath.startsWith(BTSConstants.COMMENT)) {
                color = BTSUIConstants.COLOR_COMMENT;
            } else if (typePath.startsWith(BTSConstants.TEXT)) {
                color = BTSUIConstants.COLOR_SUBTEXT;
            } else if (typePath.startsWith(BTSConstants.ANNOTATION + "." + CorpusUtils.ANNOTATION_RUBRUM_TYPE)) {
                color = BTSUIConstants.COLOR_RUBRUM;
            } else if (typePath.startsWith(BTSConstants.ANNOTATION)) {
                color = BTSUIConstants.COLOR_ANNOTATTION;
            } else {
                color = BTSUIConstants.COLOR_ANNOTATTION;
            }
        }
        return color;

    }

    @Inject
    @Optional
    void eventReceivedLoadLemmata(
            @EventTopic("event_egy_text_editor_load_lemmata/*") Object o) {
        //logger.info("EgyTextEditorPart eventReceived "
        //		+ BTSUIConstants.EVENT_EGY_TEXT_EDITOR_LOAD_LEMMATA);
        sync.asyncExec(new Runnable() {
            public void run() {
                cachedCursor = embeddedEditor.getViewer().getTextWidget()
                        .getCaretOffset();
                boolean canUpdate = updateModelFromTranscription();

                if (canUpdate) {
                    try {
                        // load updated model into selected editor
                        IRunnableWithProgress op = new IRunnableWithProgress() {

                            @Override
                            public void run(final IProgressMonitor monitor)
                                    throws InvocationTargetException,
                                    InterruptedException {
                                sync.asyncExec(new Runnable() {
                                    public void run() {
                                        loadInputTranscription(text,
                                                relatingObjects, monitor);
                                        try {
                                            embeddedEditor
                                                    .getViewer()
                                                    .getTextWidget()
                                                    .setCaretOffset(
                                                            cachedCursor);
                                            embeddedEditor.getViewer().revealRange(cachedCursor, 0);
                                        } catch (Exception e) {
                                        }
                                    }

                                });
                            }
                        };
                        new ProgressMonitorDialog(new Shell()).run(true, true,
                                op);
                    } catch (InvocationTargetException | InterruptedException ee) {
                        // handle exception
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
                    if (!relatingObjects.contains(notification.getObject())) {
                        relatingObjects.add((BTSObject) notification.getObject());
                    }
                } else {
                    relatingObjects.remove(notification.getObject());
                }
            }
            switch (tabFolder.getSelectionIndex()) {
                case 0:
                case 1:
                    addAnnotationToTranscription(notification);
                    addAnnotationToSignText(notification);
                    break;
                case 2:
                    // addAnnotationToJSesh(notification);
                    break;
            }
        }
    }

    private void addAnnotationToSignText(BTSModelUpdateNotification notification) {
        signTextEditor.addRelatingObjectNotification(notification);

    }

    private void addAnnotationToTranscription(
            BTSModelUpdateNotification notification) {
        List<BTSModelAnnotation> mas = relatingObjectsAnnotationMap.get(notification.getObject());
        BTSObject object = (BTSObject) notification.getObject();
        // remove old annotations
        if (mas != null) {
            for (BTSModelAnnotation ma : mas) {
                annotationModel.removeAnnotation(ma);
            }
        }
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
                            BTSModelAnnotation ma1 = modelAnnotationMap.get(ref
                                    .getBeginId());
                            BTSModelAnnotation ma2 = modelAnnotationMap.get(ref
                                    .getEndId());
                            Position pos = annotationModel.getPosition(ma1);
                            Position pos2 = annotationModel.getPosition(ma2);
                            if (pos2 != null)
                                if (pos != null) {
                                    offset = pos.getOffset();
                                    len = (pos2.getOffset() - pos.getOffset())
                                            + pos2.getLength();
                                } else {
                                    offset = pos2.getOffset();
                                    len = pos2.getLength();
                                }
                        }
                        Issue issue;
                        issue = new Issue.IssueImpl();
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
            ta = new BTSAnnotationAnnotation(embeddedEditor.getDocument(), issue, object, (BTSAnnotation) object);
        } else if (object instanceof BTSComment) {
            ta = new BTSCommentAnnotation(embeddedEditor.getDocument(), issue, object, (BTSComment) object);
            ta.setText("Comment Annotation --> here is a comment on this word.");
        } else if (object instanceof BTSText
                && object.getType().equalsIgnoreCase("subtext")) {
            ta = new BTSSubtextAnnotation(embeddedEditor.getDocument(), issue, object, (BTSText) object);
        } else {
            return null;
        }
        ta.setInterTextReference(ref);
        addToRelatingObjectAnnotationMap(object, ta);
        return ta;
    }

    @Inject
    @Optional
    public void setUserMayEdit(
            @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
        if (this.userMayEdit == null || userMayEdit != this.userMayEdit) {
            sync.asyncExec(new Runnable() {
                @Override
                public void run() {
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
