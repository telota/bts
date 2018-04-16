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

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
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
import org.bbaw.bts.ui.commons.corpus.text.BTSReferenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLinkageAnnotation;
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
import org.eclipse.core.runtime.Assert;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
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
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;

import com.google.inject.Injector;

public class EgyTextEditorPart extends AbstractTextEditorLogic implements IBTSEditor, EventHandler {
	public static final int LINE_SPACE = 8;

	protected int counter;
	protected boolean loading; /* TODO get rid of this */
	protected boolean isDocUpdating;
	protected BTSTextSelectionEvent deepCopyCache;

	@Optional @Inject private MDirtyable dirty;
	@Inject private BTSTextEditorController textEditorController;
	@Inject private BTSLemmaEntryService lemmaService;
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
    private CTabItem textTab;
    private CTabItem signTab;
    private CTabItem jseshTab;

	private JMDCEditor jseshEditor;
	private SignTextComposite signTextEditor;
    AnnotationModel annotationModel;

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
	//private CompositeRuler ruler;
	//private OverviewRuler oruler;
    private TextUpdater.LinkageData linkageData = new TextUpdater.LinkageData();
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(0);
    private Map<String, List<BTSInterTextReference>> relatingObjectsMap = new HashMap<>(0);
	private StyleRange selectionRange;
	private StyleRange[] preSelectionRanges;
	private TranslationEditorComposite sentenceTranslate_Editor;
	private EditingDomain editingDomain;
	private MPart part;
	@SuppressWarnings("restriction")
	@Inject private Logger logger;
	private EgyLineNumberRulerColumn lineNumberRulerColumn;
	private HashMap<String, List<Object>> lemmaAnnotationMap;
	@Inject @Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private boolean editable;
	@Optional @Inject @Active private Shell parentShell;
	private boolean loaded; // boolean if object is loaded into gui
	private boolean constructed; // boolean if gui is constructed
	@Inject @Active @Optional private Shell shell;
	private ScrolledComposite scrolledCompJSesh;
	@Inject @Preference(value = BTSEGYUIConstants.PREF_TRANSLITERATION_EDITOR_SHOW_LINE_NUMBER_RULER, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private boolean show_line_number_ruler;

	private CommandStackListener commandStackListener = new CommandStackListener() {
        @Override
        public void commandStackChanged(EventObject event) {
            if (editingDomain == null)
                return;

            Command mostRecentCommand = editingDomain.getCommandStack().getMostRecentCommand();
            if (mostRecentCommand == null)
                return;

            if (mostRecentCommand.equals(editingDomain.getCommandStack().getUndoCommand())) {
                // normal command or redo executed
                localCommandCacheSet.add(mostRecentCommand);
                if (dirty != null && localCommandCacheSet.isEmpty())
                    dirty.setDirty(false);
                else
                    setDirtyInternal();

            } else {
                // undo executed
                if (localCommandCacheSet.remove(mostRecentCommand)
                        && localCommandCacheSet.isEmpty() && dirty != null)
                    dirty.setDirty(false);
                else
                    setDirtyInternal();
            }
        }
    };


	@Inject
	public EgyTextEditorPart(EPartService partService) {
        part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);
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
		AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, getAnnotationPreferences());

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout l = new GridLayout();
		l.marginHeight = 0;
		l.marginWidth = 0;
		composite.setLayout(l);

		tabFolder = new CTabFolder(composite, SWT.BORDER);
		tabFolder.setSimple(false);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		tabFolder.addSelectionListener(new SelectionAdapter() {
            private CTabItem oldSelection = null;

			@Override public void widgetSelected(SelectionEvent e) {
				if (oldSelection == e.item)
					return;

				// update model from old selection editor
				if (oldSelection == textTab) {
                    /* Cancel selection if necessary FIXME: test this */
					if (!userConfirmsSyntaxErrors()) {
                        e.doit = false;
                        return;
                    }
                }

                if (e.item != textTab) {
                    loadTab(null);
                    return;
                }

                contextService.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
                syncFromModel();

                oldSelection = (CTabItem)e.item;
			}
		});

		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

		embeddedEditorParentComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
		embeddedEditorParentComp.setLayout(new GridLayout());
		((GridLayout) embeddedEditorParentComp.getLayout()).marginHeight = 0;
		((GridLayout) embeddedEditorParentComp.getLayout()).marginWidth = 0;

		textTab = new CTabItem(tabFolder, SWT.NONE);
		textTab.setText("Transliteration");
		textTab.setControl(embeddedEditorParentComp);

		embeddedEditorParentComp.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				// remove translit editor contents (including annotation model)
				// before xtext HighlightingHelper gets a chance
				// to clog main thread with its painful editor dismantling.
				syncFromModel();
			}
		});

		embeddedEditorComp = new Composite(embeddedEditorParentComp, SWT.None);
        l = new GridLayout();
		l.marginHeight = 0;
		l.marginWidth = 0;
		embeddedEditorComp.setLayout(l);
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
        XtextSourceViewer v = embeddedEditor.getViewer();
		v.getTextWidget().setLineSpacing(LINE_SPACE);


		//ruler = EmbeddedEditorFactory.getCpAnnotationRuler();
		//oruler = EmbeddedEditorFactory.getOverViewRuler();

		painter = new AnnotationPainter(v, null);
		v.addTextPresentationListener(painter);
		v.addPainter(painter);

		configureEditorDrawingStrategies(null);//oruler);
		if (show_line_number_ruler) {
			lineNumberRulerColumn = new EgyLineNumberRulerColumn(LINE_SPACE);
			v.addVerticalRulerColumn(lineNumberRulerColumn);
		}

		embeddedEditorParentComp.layout();

		context.set(XtextSourceViewer.class, v);
		BTSE4ToGuiceXtextSourceViewerProvider.setContext(context);

		v.getTextWidget().addCaretListener(new CaretListener() {
			@Override public void caretMoved(CaretEvent event) {
                XtextSourceViewer v = embeddedEditor.getViewer();
				/* get char right of caret and show Unicode code point in status line */
				if (event.caretOffset >= v.getTextWidget().getText().length())
                    return;

                String sign = v.getTextWidget().getText(event.caretOffset, event.caretOffset);
                if (sign.isEmpty())
                    return;

                int line = v.getTextWidget().getLineAtOffset(event.caretOffset);
                int offset = event.caretOffset - v.getTextWidget().getOffsetAtLine(line);
                showCurrentSignUnicode(sign, line, offset);
			}
		});

		embeddedEditor.getDocument().addDocumentListener(new IDocumentListener() {
			public void documentAboutToBeChanged(DocumentEvent event) {}
			public void documentChanged(DocumentEvent event) {
				if (!loading)
					setDirtyInternal();
			}
		});

		Menu menu = v.getTextWidget().getMenu();
		menu.addMenuListener(new MenuListener() {
			public void menuHidden(MenuEvent e) {}
			public void menuShown(MenuEvent e) {
				boolean syntaxErrors = hasSyntaxErrors();

                Menu menu = embeddedEditor.getViewer().getTextWidget().getMenu();
                MenuItem itemPaste = new MenuItem(menu, SWT.NONE);
                itemPaste.setText("Paste items with Lemmata");
                itemPaste.setEnabled(!syntaxErrors && deepCopyCache != null);
                itemPaste.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        pasteItems();
                    }
                });

                MenuItem itemCopy = new MenuItem(menu, SWT.NONE);
                itemCopy.setText("Copy with Lemmata" );
                itemCopy.setEnabled(!syntaxErrors);
                itemCopy.addSelectionListener(new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                        copyTextWithLemmata();
                    }
                });
			}
		});

		v.addPostSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent e) {
                fireTextSelectionEvent();
			}
		});

		signTab = new CTabItem(tabFolder, SWT.NONE);
		signTab.setText("Sign Text Editor");
		Composite signTabContainer = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
        l = new GridLayout();
		l.marginHeight = 0;
		l.marginWidth = 0;
		signTabContainer.setLayout(l);
		signTab.setControl(signTabContainer);
		IEclipseContext child = context.createChild();
		child.set(Composite.class, signTabContainer);
		child.set(IBTSEditor.class, EgyTextEditorPart.this);
		signTextEditor = ContextInjectionFactory.make(SignTextComposite.class, child);
		signTabContainer.layout();
		signTabContainer.pack();

		jseshTab = new CTabItem(tabFolder, SWT.NONE);
		jseshTab.setText("JSesh View");
		scrolledCompJSesh = new ScrolledComposite(tabFolder, SWT.HORIZONTAL | SWT.VERTICAL);
		scrolledCompJSesh.setMinWidth(800);
		scrolledCompJSesh.setMinHeight(400);
		scrolledCompJSesh.setExpandHorizontal(true);
		scrolledCompJSesh.setExpandVertical(true);
		jseshTab.setControl(scrolledCompJSesh);

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
	}

	private void copyTextWithLemmata() {
        /* TODO this implementation is very poor. This should just use the regular system keyboard and a sane
         * serialization of the selected objects. */
        /* TODO But first, create copies here instead of just caching the selection event */
		deepCopyCache = probeCurrentTextSelection();
	}

    private BTSTextSelectionEvent probeCurrentTextSelection() {
        TextSelection selection = (TextSelection)embeddedEditor.getViewer().getSelection();
        BTSTextSelectionEvent evt = new BTSTextSelectionEvent(selection, text);
        evt.setSelectedItems(getSelectedItems(/*completeOverlapOnly*/false));
        evt.setSelectedSentences(getSelectedSentences(/*completeOverlapOnly*/true));
        /* FIXME */
        for (BTSReferenceAnnotation anno : getSelectedReferences()) {
            evt.getInterTextReferences().add(anno.getInterTextReference());
            evt.getRelatingObjects().add(anno.getRelatingObject());
        }
        return evt;
    }

    private void fireTextSelectionEvent() {
        BTSTextSelectionEvent evt = probeCurrentTextSelection();

        if (evt.getSelectedSentences().size() == 1)
            setSentenceTranslation(evt.getSelectedSentences().iterator().next());
        else
            setSentenceTranslation((BTSSenctence)null);

        selectionService.setSelection(evt);
    }

    /* Note that this does not copy links to comments, annotations, rubra or other related objects */
	private void pasteItems() {
        /* TODO here and below in pasteSentences the dirty flag might have to be set */
        /* TODO fixup cursor afterwards */

        /* === Find out what to paste === */
        BTSTextSelectionEvent copied = deepCopyCache;
        /* copied.getSelectedItems().isEmpty() implies copied.getSelectedSentences().isEmpty() */
        if (copied == null || copied.getSelectedItems().isEmpty())
            return;

        /* === Synchronize any pending changes to model === */
        if (!userConfirmsSyntaxErrors())
            return;
        syncToModel();

        TextSelection sel = (TextSelection)embeddedEditor.getViewer().getSelection();
        int offx = sel.getOffset(), len = sel.getLength();

        /* === Check for sentence paste === */
		Iterator<Annotation> it = linkageData.amSentence.getAnnotationIterator(offx, len,
                /*canStartBefore*/true, /*canEndAfter*/true);
        /* The cursor must always be either within a sentence or on a sentence boundary. */
        Assert.isTrue(it.hasNext());

        BTSSentenceAnnotation sanno = (BTSSentenceAnnotation)it.next();
        BTSSenctence          sent  = sanno.getModel();
        Position              spos  = linkageData.amSentence.getPosition(sanno);

        /* The cursor must never be on two sentences at once. Note that sentences are separated by a newline
         * character per grammar and thus a cursor between two sentences is always after the one xor in front of
         * the other. */
        Assert.isTrue(!it.hasNext());

        /* Check whether the cursor is right in front of or behind a sentence. This has to work both at the
         * beginning and at the end of a text. */
        boolean atBeginning = offx == spos.getOffset(),
                atEnd       = offx == spos.getOffset()+spos.getLength();
        if (atBeginning || atEnd) {
            if (copied.getSelectedSentences().isEmpty())
                return;

            EList l = ((BTSTextContent)sent.eContainer()).getTextItems();
            int idx = l.indexOf(sent);
            Assert.isTrue(idx >= 0);

            /* The cursor is between sentences or the selection starts between sentences. */
            Collection<BTSSenctence> copies = textEditorController.copySentences(copied.getSelectedSentences());

            /* Delete all fully selected sentences */
            for (BTSSenctence foo : getSelectedSentences(/*completeOverlapOnly*/true))
                EcoreUtil.delete(foo, true);

            /* paste behind sentence if cursor is at eos */
            l.addAll(atEnd ? idx+1 : idx, copies);
        } else {
            /* === Check for item paste === */
            it = linkageData.amLinkage.getAnnotationIterator(offx, len, /*canStartBefore*/true, /*canEndAfter*/true);

            BTSLinkageAnnotation ianno = null;
            BTSSentenceItem      item  = null;
            BTSLinkageAnnotation aanno = null;
            BTSAmbivalence       ambi  = null;

            while (it.hasNext()) {
                BTSLinkageAnnotation anno = (BTSLinkageAnnotation)it.next();
                BTSIdentifiableItem foo = ianno.getModel();

                if (foo instanceof BTSLemmaCase)
                    continue; /* will lead to the outer ambivalence being chosen */

                if (foo instanceof BTSAmbivalence) {
                    ambi = (BTSAmbivalence)foo;
                    aanno = anno;
                    continue;
                }

                Assert.isTrue(foo instanceof BTSSentenceItem);
                Assert.isTrue(item == null);
                item = (BTSSentenceItem)foo;
                ianno = anno;
            }

            /* The cursor must always be either on an ambivalence or on another sentence item. */
            Assert.isTrue(ambi != null || item != null);

            /* Insert in front/behind the ambivalence if the cursor is somewhere in the middle of a case label */
            if (item == null)
                item = ambi;

            Position ipos = linkageData.amLinkage.getPosition(ianno);
            atBeginning   = offx == ipos.getOffset();
            atEnd         = offx == ipos.getOffset()+ipos.getLength();
            if (atBeginning || atEnd) {
                EObject cont = item.eContainer();
                EList l = ambi == null ? ((BTSSenctence)cont).getSentenceItems() : ((BTSLemmaCase)cont).getScenario();
                int idx = l.indexOf(item);
                Assert.isTrue(idx >= 0);

                /* Note that this might include ambivalences, and will even span any whole sentences selected. Due to
                 * the offsetting logic in populateSelectionEvent the items of consecutive sentences will be treated
                 * as if their sentences were concatenated. */
                Collection<BTSSentenceItem> copies = textEditorController.copySentenceItems(
                        copied.getSelectedItems());

                /* Delete all fully selected things */
                for (BTSSenctence foo : getSelectedSentences(/*completeOverlapOnly*/true))
                    EcoreUtil.delete(foo, false); /* do not recurse, delete items below. */
                for (BTSSentenceItem foo : getSelectedItems(/*completeOverlapOnly*/true))
                    EcoreUtil.delete(foo, true);
                /* TODO Maybe deal with now-empty lemma cases here? */

                /* paste behind sentence if cursor is at eos */
                l.addAll(atEnd ? idx+1 : idx, copies);
            }
        }

        /* === Re-load text from model === */
        syncFromModel();
	}

    private TextContent parseDocument() {
        return (TextContent)embeddedEditor.getDocument().readOnly(new IUnitOfWork<EObject, XtextResource>() {
            @Override public EObject exec(XtextResource state) throws Exception {
                return state.getContents().get(0);
            }
        });
    }

	protected void syncToModel() {
        ModelUpdater mu = new ModelUpdater(linkageData);
        mu.synchronize(text.getTextContent(), parseDocument());
	}

    /** If there are any syntax errors in the text, warn the user about possible data loss.
     *
     * Return true if there are no syntax errors or the user confirms it is acceptable to discard changes.
     */
    private boolean userConfirmsSyntaxErrors() {
        if (!hasSyntaxErrors())
            return true;

        if (shell == null)
            shell = new Shell();
        MessageDialog dialog = new MessageDialog(shell, "Errors in Text - Possible Data Loss", null,
                  "You are trying to save a text which contains errors, saving this text may lead to loss of data.\n\n"
                + "It is not recommended to save a text which contains errors!\n\n"
                + "Are you sure that you want to risk data loss and save with errors?\n\n",
                MessageDialog.WARNING, new String[] { "Save with Errors", "Don't Save" }, 1);
        return dialog.open() == MessageDialog.OK;
    }

	private boolean hasSyntaxErrors() {
		for (Diagnostic error : parseDocument().eResource().getErrors()) {
			String msg = error.getMessage();

			// exception: if errors only concern beginning and end of file
			if ("missing EOF at '\\r'".equals(msg))
				continue;
			if ("extraneous input '\\r' expecting '§'".equals(msg))
				continue;
			if ("mismatched input '<EOF>' expecting '§'".equals(msg))
				continue;

			return true;
		}
		return false;
	}

	protected void loadInputJSesh() {
		String jseshMdc = textEditorController.transformTextToJSeshMdCString(text);
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

    private BTSIdentifiableItem getItemAtCursor() {
        /* FIXME handle overlapping linkage annotations in ambivalences */
        TextSelection selection = (TextSelection)embeddedEditor.getViewer().getSelection();
        Iterator<Annotation> it = annotationModel.getAnnotationIterator(
                selection.getOffset(), 0, /*canStartBefore*/true, /*canStartAfter*/true);
        while (it.hasNext()) {
            Annotation a = it.next();
            if (a instanceof BTSLinkageAnnotation)
                return ((BTSLinkageAnnotation)a).getModel();
        }
        return null;
    }

	public void loadInput(BTSText text) {
        System.out.println("Loading input "+text);
        if (this.text == text) { /* We already (un)loaded this. `text` may be null.  */
            System.out.println("Already loaded.");
            return;
        }

        /* TODO Make this autosave configurable. */
        if (text != null)
            save();

        purgeCacheAndEditingDomain();
		// wipe latest text selection event in order to avoid leak FIXME wat?
		selectionService.setSelection(null);
        this.text = text;
        part.setLabel(text == null ? "Text Editor" : text.getName());

        if (text != null) {
            editingDomain = editingDomainController.getEditingDomain(text);
            editingDomain.getCommandStack().addCommandStackListener(commandStackListener);

            syncFromModel();
            if (tabFolder != null && tabFolder.getSelection() != textTab)
                loadTab(null);

            part.setLabel(text.getName());

            setEnabled(true);
            setEditable(editable);

        } else {
            part.setLabel("Text Editor");

            setEnabled(false);
            setEditable(editable);
        }
	}

	private void loadInputSignText(IProgressMonitor monitor) {
		if (monitor != null)
			monitor.setTaskName("Load relating text into Sign-Text-Editor.");

        syncToModel();
        signTextEditor.setInput(text, text.getTextContent(), relatingObjects, monitor, getItemAtCursor());
	}

	private void purgeCacheAndEditingDomain() {
        this.relatingObjects = new Vector<BTSObject>(0);
        this.relatingObjectsMap = new HashMap<>(0);
        this.linkageData = new TextUpdater.LinkageData();
		localCommandCacheSet.clear();
		if (editingDomain != null)
			editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
		this.editingDomain = null;
	}


	protected void syncFromModel() {
        syncFromModel(null);
    }

	@SuppressWarnings({ "rawtypes", "restriction" })
	protected void syncFromModel(IProgressMonitor monitor) {
		if (monitor != null)
			monitor.beginTask("Load text into Transliteration-Editor.", IProgressMonitor.UNKNOWN);

        if (this.text == null)
            return; /* nothing to sync */

		this.loading = true;
        ISelection oldSelection = embeddedEditor.getViewer().getSelection();

        this.relatingObjects = textEditorController.queryReferences(text, monitor);
        this.relatingObjectsMap = textEditorController.fillRelatingObjectsMap(relatingObjects);
        eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED, new BTSRelatingObjectsLoadingEvent(text, relatingObjects));

        TextUpdater upd = new TextUpdater(lemmaService, relatingObjectsMap);
        upd.generateFromModel(text.getTextContent());
		embeddedEditorModelAccess.updateModel("", upd.getContent(), "");
        this.linkageData = upd.getLinkageData();

        /* Add new annotation models to the editor's annotation model. This couples the annotations' positions to
         * the text we just loaded into the editor. This means the annotations' positions will change with edits
         * to the text. This is the reason we have to add the invisible models (linkage and sentence) in addition
         * to the visible ones (lemma and reference). */
        AnnotationModel am = (AnnotationModel)embeddedEditor.getViewer().getAnnotationModel();
        am.removeAnnotationModel("bts_items");
        am.removeAnnotationModel("bts_sentences");
        am.removeAnnotationModel("bts_lemmatized");
        am.removeAnnotationModel("bts_references");
        am.addAnnotationModel("bts_items", linkageData.amLinkage);
        am.addAnnotationModel("bts_sentences", linkageData.amSentence);
        am.addAnnotationModel("bts_lemmatized", linkageData.amLemma);
        am.addAnnotationModel("bts_references", linkageData.amReference);

		embeddedEditorParentComp.layout(); /* FIXME why? */
        embeddedEditor.getViewer().setSelection(oldSelection, /*reveal*/true);
		this.loading = false;
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

	private void revealAnnotation(List<BTSModelAnnotation> relatingObjectsAnnotations, final boolean force) {
        /* FIXME where to hook this into? */
        int minPos = Integer.MAX_VALUE;
        int maxPos = Integer.MIN_VALUE;

        for (Annotation anno : relatingObjectsAnnotations) {
            final Position pos = annotationModel.getPosition(anno);
            if (pos == null)
                continue;

            int start = pos.getOffset();
            int end = start + pos.getLength();
            
            if (start < minPos)
                minPos = start;

            if (end > maxPos)
                maxPos = end;
        }

        if (minPos != Integer.MAX_VALUE) {
            final int off = minPos, len = maxPos - minPos;
            sync.asyncExec(new Runnable() {
                @SuppressWarnings("restriction")
                public void run() {
                    embeddedEditor.getViewer().revealRange(off, len);
                }
            });	
        }
	}

	protected void setDirtyInternal() {
		if (!permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), text))
            return;

        if (text == null || dirty == null)
            return;
        
        dirty.setDirty(true);
	}

    /* Helper methods for querying things selected */
	private Collection<BTSReferenceAnnotation> getSelectedReferences() {
        return getSelectedReferences((TextSelection)embeddedEditor.getViewer().getSelection());
    }

	private Collection<BTSReferenceAnnotation> getSelectedReferences(TextSelection sel) {
        /* Create a sorted collection of all sentence items that overlap with the current selection. */
        HashSet<BTSReferenceAnnotation> annos = new HashSet<>();
		Iterator<Annotation> it = linkageData.amReference.getAnnotationIterator(
                sel.getOffset(), sel.getLength(), /*canStartBefore*/true, /*canStartAfter*/true);
        while (it.hasNext())
            annos.add((BTSReferenceAnnotation)it.next());

        return annos;
    }

	private Collection<BTSSenctence> getSelectedSentences(boolean completeOverlapOnly) {
        TextSelection sel = (TextSelection)embeddedEditor.getViewer().getSelection();
        return getSelectedSentences(sel, completeOverlapOnly);
    }

	private Collection<BTSSenctence> getSelectedSentences(TextSelection sel, boolean completeOverlapOnly) {
        /* Create a sorted collection of all sentence items that overlap with the current selection. */
        TreeMap<Integer, BTSSenctence> annos = new TreeMap<>();

		Iterator<Annotation> it = linkageData.amSentence.getAnnotationIterator(
                sel.getOffset(), sel.getLength(),
                /*canStartBefore*/!completeOverlapOnly, /*canStartAfter*/!completeOverlapOnly);
        while (it.hasNext()) {
            BTSSentenceAnnotation a = (BTSSentenceAnnotation)it.next();
            annos.put(linkageData.amSentence.getPosition(a).getOffset(), a.getModel());
        }

        return annos.values();
    }

	private Collection<BTSSentenceItem> getSelectedItems(boolean completeOverlapOnly) {
        TextSelection sel = (TextSelection)embeddedEditor.getViewer().getSelection();
        return getSelectedItems(sel, completeOverlapOnly);
    }

	private Collection<BTSSentenceItem> getSelectedItems(TextSelection sel, boolean completeOverlapOnly) {
        /* This method is a bit more complex than one might initially expect due to ambiguities with ambivalences.
         *
         * getSelectedItems returns a linearized list of selected text items. This leads to problems when
         * ambivalences are selected, since those are tree-shaped. We chose the following behavior for this case:
         *
         * If more than a single case of an ambivalence is selected the ambivalence is returned whole including
         * any other cases that might not be selected. In consequence, if only part of one case or only one case
         * is selected, this case's items only are returned and the containing ambivalence is ignored.
         */

        /* Create a sorted collection of all sentence items that overlap with the current selection. */
        TreeMap<Integer, BTSSentenceItem> annos = new TreeMap<>();
		Iterator<Annotation> it = linkageData.amLinkage.getAnnotationIterator(
                sel.getOffset(), sel.getLength(), /*canStartBefore*/!completeOverlapOnly, /*canStartAfter*/!completeOverlapOnly);
        ArrayList foundLemmaCases = new ArrayList<>(10);
        ArrayList includedAmbivalences = new ArrayList<>(10);
        while (it.hasNext()) {
            BTSLinkageAnnotation a = (BTSLinkageAnnotation)it.next();
            BTSIdentifiableItem item = a.getModel();

            if (item instanceof BTSLemmaCase) {
                if (foundLemmaCases.contains(item))
                    includedAmbivalences.add(item.eContainer());
                else
                    foundLemmaCases.add(item);
            } else {
                annos.put(linkageData.amLinkage.getPosition(a).getOffset(), (BTSSentenceItem)item);
            }
        }

        /* Remove all items that belong to ambivalences that are to be included whole and remove all ambivalences
         * that are to be included only partially (but keep the items of those around) */
        Iterator<BTSSentenceItem> it2 = annos.values().iterator();
        while (it2.hasNext()) {
            BTSIdentifiableItem item = it2.next();
            EObject caseOrSent = item.eContainer();
            if ((caseOrSent instanceof BTSLemmaCase) && includedAmbivalences.contains(caseOrSent.eContainer()))
                it2.remove();
            if ((caseOrSent instanceof BTSAmbivalence) && !includedAmbivalences.contains(caseOrSent))
                it2.remove();
        }

		return annos.values();
	}

	@SuppressWarnings("restriction")
	@Inject
	@Optional
	void eventReceivedCaretEvents(@EventTopic("event_text_selection/*") final Object event) {
        if(tabFolder.getSelection() == signTab) {
            sync.asyncExec(new Runnable() {
                public void run() {
                    signTextEditor.setTextSelectionEvent((String) event);
                }
            });
        }
	}

	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
        /* This method loads the text that is selected in the object tree viewer on the left. */

		if (selection == null || parent == null || parent.isDisposed() || !constructed)
			return;

        System.out.println(String.format("EgyTextEditorPart received selection: %s", selection.toString()));
        if (selection instanceof BTSText)
            loadInput((BTSText) selection);
        else if (selection instanceof BTSCorpusObject) /* Something was selected in the corpus navigator */
            loadInput(null);
	}

    private void highlightReferences(List<BTSIdentifiableItem> objs) {
        for (BTSReferenceAnnotation a : linkageData.rlist)
            a.setHighlighted(objs.contains(a.getRelatingObject()));
        refreshAnnotations();
    }
    
    private void highlightSentence(BTSSenctence sentence) {
        for (Map.Entry<BTSSenctence, BTSSentenceAnnotation> e : linkageData.smap.entrySet())
            e.getValue().setHighlighted(e.getKey() == sentence);
        refreshAnnotations();
    }

    private void refreshAnnotations() {
        AnnotationModelEvent ev = new AnnotationModelEvent(annotationModel);
        /* Dumbly add every here. There should not be many of these annotations or these events so the impact of this
         * should be neglegible. */
        for (BTSReferenceAnnotation a : linkageData.rlist)
            ev.annotationChanged(a);
        for (Map.Entry<BTSSenctence, BTSSentenceAnnotation> e : linkageData.smap.entrySet())
            ev.annotationChanged(e.getValue());

        /* TODO find out what of this is actually needed */
        painter.modelChanged(ev);
        painter.paint(painter.INTERNAL);
        //ruler.update();
        //ruler.relayout();
        //oruler.update();
        embeddedEditor.getViewer().getTextWidget().redraw();
    }

	private void setSentenceTranslation(BTSSenctence sentence) {
        sentenceTranslate_Editor.load(sentence, editingDomain, false);
        highlightSentence(sentence);
	}

	private void setSentenceTranslation(BTSSentenceItem sentenceItem) {
		if (sentenceItem == null) {
            setSentenceTranslation((BTSSenctence)null);
			return;
		}

        EObject container = sentenceItem.eContainer();
		if (container instanceof BTSSenctence) {
            setSentenceTranslation((BTSSenctence)container);
            return;
		}
        
        if (container instanceof BTSLemmaCase) {
            EObject obj = container.eContainer().eContainer();
            if (obj instanceof BTSSenctence) {
                setSentenceTranslation((BTSSenctence)obj);
                return;
			}
		}

        setSentenceTranslation((BTSSenctence)null);
	}

    private void loadTab(IProgressMonitor monitor) {
        if (tabFolder == null)
            return;

        CTabItem tab = tabFolder.getSelection();
        if (tab ==  textTab) syncFromModel(monitor);
        if (tab ==  signTab) loadInputSignText(monitor);
        if (tab == jseshTab) loadInputJSesh();
    }

	@Focus
	public void setFocus() {
		// now set focus on specific editor pane
		if (tabFolder != null && text != null) {
			if (tabFolder.getSelection() == textTab)
				embeddedEditor.getViewer().getControl().setFocus();

			if (tabFolder.getSelection() == signTab)
				signTextEditor.setFocus();
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

        if (!userConfirmsSyntaxErrors())
			return false;
        syncToModel();

		localCommandCacheSet.clear();

		// turn word-wise graphical update on model change notifications off 
		signTextEditor.setNotifyWords(false);
		sentenceTranslate_Editor.save();
		boolean success = textEditorController.save(this.text);

        if (success)
            dirty.setDirty(false);
		// turn word-wise update back on
		signTextEditor.setNotifyWords(true);
		return success;
	}

	@Override
	public void childSelectionChanged(final BTSIdentifiableItem item) {
        /* This method is called by the annotations thingy and the sign text editor when the user selects something. */
		if (item == null)
            return;

        sync.asyncExec(new Runnable() {
            public void run() {
                /* TODO Remove workaround here and below. The workaround is there because selection service requires
                 * iniating part to be the active part.  Do this by emitting the selection event from the source part.
                 * Do this by moving the population of the various fields of a BTSTextSelectionEvent into the event
                 * class or something. */
                MPart activePart = partService.getActivePart();
                try {
                    if (activePart != part)
                        partService.activate(part);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                trySelectItem(item);

                /* workaround */
                if (activePart != part)
                    partService.activate(activePart);
            }
        });
	}

    private void trySelectItem(BTSIdentifiableItem item) {
        Position pos = annotationModel.getPosition(linkageData.smap.get(item));
        if (pos == null)
            return;

        embeddedEditor.getViewer().setSelection(new TextSelection(pos.getOffset(), pos.getLength()), /*reveal*/true);
        fireTextSelectionEvent();
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
        highlightReferences((List<BTSIdentifiableItem>)event);
    }

    @SuppressWarnings("restriction")
    @Inject
    @Optional
    void eventReceivedUpdates(@EventTopic("model_update/*") final BTSModelUpdateNotification notification) {
        if (text == null)
            return; /* There is no text loaded, so there are no events relevant for us. */

        if (!(notification.getQueryIds().contains("relations.objectId-" + text.get_id())))
            return;

        Object obj = notification.getObject();
        if (!(obj instanceof BTSAnnotation) && !(obj instanceof BTSComment) && !(obj instanceof BTSText))
            return;
        sync.asyncExec(new Runnable() {
            @Override public void run() {
                tryReload();
                if (tabFolder != null && tabFolder.getSelection() != textTab)
                    loadTab(null);
            }
        });
    }

    @Inject
    @Optional
    void eventReceivedUpdates(@EventTopic("event_preferences_changed/*") String preferencePath) {
        if (preferencePath != null && preferencePath.endsWith(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS)) {
            sync.asyncExec(new Runnable() {
                @Override public void run() {
                    AnnotationToolbarItemCreator.processAndUpateToolbarItemsAnnotationShortcut(part, getAnnotationPreferences());
                    configureEditorDrawingStrategies(null);//oruler);
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
        /* FIXME find out whether anybody is using this and axe it if not. */
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
                    painter.setAnnotationTypeColor(typeId+suffix, getBackgroundColorTypePath(strategyId));
                    //oruler.addAnnotationType(typeId+suffix);

                } else {
                    painter.removeAnnotationType(typeId+suffix);
                    //oruler.removeAnnotationType(typeId+suffix);
                }
            }
            painter.paint(IPainter.INTERNAL);
        }
    }

    private Color getBackgroundColorTypePath(String typePath) {
        // read values from the instance scope
        try {
            for (String childNode : getAnnotationPreferences().childrenNames()) {
                Preferences typeNode = getAnnotationPreferences().node(childNode);
                String settingsTypePath = AnnotationToolbarItemCreator.getAnnotationTypePath((IEclipsePreferences) typeNode);
                if (settingsTypePath.equals(typePath)) {
                    String colorString = typeNode.get(BTSCorpusConstants.PREF_COLOR, null);
                    if (colorString != null)
                        return BTSUIConstants.getColor(colorString);
                }
            }
        } catch (BackingStoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (typePath.startsWith(BTSConstants.COMMENT))
            return BTSUIConstants.COLOR_COMMENT;

        if (typePath.startsWith(BTSConstants.TEXT))
            return BTSUIConstants.COLOR_SUBTEXT;

        if (typePath.startsWith(BTSConstants.ANNOTATION + "." +CorpusUtils.ANNOTATION_RUBRUM_TYPE))
            return BTSUIConstants.COLOR_RUBRUM;

        return BTSUIConstants.COLOR_ANNOTATTION;
    }

    @Inject
    @Optional
    void eventReceivedLoadLemmata(@EventTopic("event_egy_text_editor_load_lemmata/*") Object o) {
        sync.asyncExec(new Runnable() {
            public void run() {
                tryReload();
            }
        });
    }

    private void tryReload() {
        if (hasSyntaxErrors())
            return;

        syncToModel();
        syncFromModel();
    }

    @Inject
    @Optional
    public void setUserMayEdit(@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
        /* FIXME wtf */
        sync.asyncExec(new Runnable() {
            @Override public void run() {
                setEditable(userMayEdit);
            }
        });
    }

    private boolean partEditable = false;
    private boolean partEnabled = false;

    protected void setEditable(boolean editable) {
        partEditable = editable;
        updateEnabled();
    }

	private void setEnabled(boolean enabled) {
        partEnabled = enabled;
        updateEnabled();
    }

    private void updateEnabled() {
        if (parent == null || parent.isDisposed())
            return;
        Color c = partEnabled ? BTSUIConstants.COLOR_WIHTE : BTSUIConstants.COLOR_BACKGROUND_DISABLED;

        /* editability of sentenceTranslate_Editor is handled via its load method */
        sentenceTranslate_Editor.setEditable(partEditable);

        XtextSourceViewer viewer = (XtextSourceViewer)embeddedEditor.getViewer();
		viewer.setEditable(partEnabled && partEditable);
		viewer.getTextWidget().setEnabled(partEnabled);
        viewer.getTextWidget().setBackground(c);

		signTextEditor.setEnabled(partEnabled);

		jseshEditor.setEnabled(partEnabled);

		tabFolder.setEnabled(partEnabled);
    }
}
