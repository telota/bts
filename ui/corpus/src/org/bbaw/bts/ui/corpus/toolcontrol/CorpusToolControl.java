package org.bbaw.bts.ui.corpus.toolcontrol;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class CorpusToolControl {

    @Inject
    private BTSResourceProvider resourceProvider;

    @Inject
    private ECommandService commandService;

    @Inject
    private EHandlerService handlerService;
    @Inject
    private IStylingEngine engine;

    private ComposedAdapterFactory factory = new ComposedAdapterFactory(
            ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
            factory);
    private Label corpusLabel;

    private Composite composite;

    private BTSTextCorpus mainCorpus;

    @PostConstruct
    public void postConstruct(@Optional Composite composite, @Optional
    @Named(BTSPluginIDs.PREF_MAIN_CORPUS) BTSTextCorpus corpus) {
        this.composite = composite;
        this.mainCorpus = corpus;
        composite.setLayout(new GridLayout(6, false));
        engine.setClassname(composite, "MToolBar");

        Label l = new Label(composite, SWT.None);
        l.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_CORPUS));
        l.setLayoutData(new GridData());
        l.pack();

        corpusLabel = new Label(composite, SWT.None);
        corpusLabel.setLayoutData(new GridData());
        ((GridData) corpusLabel.getLayoutData()).horizontalSpan = 2;
        if (mainCorpus != null) {
            corpusLabel.setText(labelProvider.getText(mainCorpus));
        } else {
            corpusLabel.setText("No Corpus");
        }
        corpusLabel.pack();

//		Label editPrefs = new Label(composite, SWT.PUSH);
//		editPrefs.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_PREFERENCES));
//		editPrefs.setToolTipText("Edit project settings.");
//		editPrefs.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
//				false, false, 1, 1));
//		((GridData) editPrefs.getLayoutData()).verticalIndent = 2;
//		editPrefs.addMouseListener(new MouseAdapter() {
//
//
//			@Override
//			public void mouseDown(MouseEvent e) {
//				Label l = (Label) e.getSource();
//				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
//
//			}
//
//			@Override
//			public void mouseUp(MouseEvent e) {
//				// Activate Handler
//				handlerService.activateHandler(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE, new E4PreferencesHandler());
//
//				Map map = new HashMap(1);
//				map.put("preferencePageId", "org.bbaw.bts.ui.corpus.corpussettings.page");
//
//				Command cmd = commandService.getCommand(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE);
//				ParameterizedCommand command = ParameterizedCommand.generateCommand(cmd, map);
//				//				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);
//
//				handlerService.executeHandler(command);
//				Label l = (Label) e.getSource();
//				l.setBackground(l.getParent().getBackground());
//			}
//		});

        composite.layout();
        composite.pack();
    }

    @Inject
    @Optional
    public void setMainCorpus(
            @Named(BTSPluginIDs.PREF_MAIN_CORPUS) Object corpus) {

        if (corpus instanceof BTSTextCorpus && corpus != null
                && (this.mainCorpus == null || !corpus.equals(this.mainCorpus))) {
            this.mainCorpus = (BTSTextCorpus) corpus;
            if (corpusLabel != null) {
                if (mainCorpus != null) {
                    corpusLabel.setText(labelProvider.getText(mainCorpus));
                }
                corpusLabel.pack();
                composite.layout();
                composite.pack();
            }
        }
    }
}
