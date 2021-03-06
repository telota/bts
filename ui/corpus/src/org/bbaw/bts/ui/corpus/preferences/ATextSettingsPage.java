package org.bbaw.bts.ui.corpus.preferences;

import java.util.List;
import java.util.Vector;

import com.richclientgui.toolbox.duallists.DualListComposite;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.ui.main.provider.BTSProjectLabelProvider;
import org.bbaw.bts.ui.main.provider.BTSProjectRemovableContentProvider;
import org.bbaw.bts.ui.main.provider.ListContentProvider;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.osgi.service.prefs.BackingStoreException;

public class ATextSettingsPage extends FieldEditorPreferencePage {

    private ComboViewer comboViewer;
    private BTSProject selectedProject;
    private String main_atexts;
    private DualListComposite<BTSProject> duallistcomposite;
    private IEclipseContext context;
    private BTSProjectController projectController;
    private List<BTSProject> projects;
    private String active_atexts;
    private BTSProjectRemovableContentProvider chrosenProvider;
    private IEclipsePreferences prefs;
    private Logger logger;
    private boolean loaded;

    /**
     * Create the preference page.
     */
    public ATextSettingsPage() {
        super(FLAT);
        setTitle("Abstract Text Settings");
    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {

        Composite container = (Composite) this.getControl();

        Label lblSelectYourMain = new Label(container, SWT.NONE);
        lblSelectYourMain.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        lblSelectYourMain.setText("Select project with your main working abstract texts");

        comboViewer = new ComboViewer(container, SWT.READ_ONLY);
        comboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

        ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
        comboViewer.setContentProvider(new ListContentProvider());
        comboViewer.setLabelProvider(labelProvider);
        comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                Object o = event.getSelection();
                IStructuredSelection sel = (IStructuredSelection) o;
                selectedProject = (BTSProject) sel.getFirstElement();
            }
        });

        Group grpFurtherProjectsFrom = new Group(container, SWT.NONE);
        grpFurtherProjectsFrom.setLayout(new GridLayout(2, false));
        grpFurtherProjectsFrom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        grpFurtherProjectsFrom.setText("Further projects with abstract texts from which you want to read data");

        Label lblAvailableProjects = new Label(grpFurtherProjectsFrom, SWT.NONE);
        lblAvailableProjects.setText("Available projects with abstract texts");

        Label lblProjectsToBe = new Label(grpFurtherProjectsFrom, SWT.NONE);
        lblProjectsToBe.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        lblProjectsToBe.setAlignment(SWT.RIGHT);
        lblProjectsToBe.setText("Active abstract texts");

        duallistcomposite = new DualListComposite<BTSProject>(grpFurtherProjectsFrom, SWT.NONE);
        duallistcomposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true, 2, 1));
        duallistcomposite.setBackground(grpFurtherProjectsFrom.getBackground());

        init(null);
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
//		BundleContext bundleContext = Platform.getBundle("org.bbaw.bts.ui.main").getBundleContext();
        context = StaticAccessController.getContext();
        projectController = context.get(BTSProjectController.class);
        prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
        main_atexts = prefs.get(BTSPluginIDs.PREF_MAIN_ATEXT_KEY, prefs.get(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null));
        active_atexts = prefs.get(BTSPluginIDs.PREF_ACTIVE_ATEXTS, prefs.get(BTSPluginIDs.PREF_ACTIVE_PROJECTS, null));
        logger = context.get(Logger.class);

        loadListInput();

    }


    private void loadListInput() {

        projects = projectController.listProjects(null);
        comboViewer.setInput(projects);
        List<BTSProject> availableProjects = new Vector<>(1);

        List<BTSProject> chosenProjects = new Vector<>(1);
        if (active_atexts != null && active_atexts.trim().length() > 0) {
            String[] pros = active_atexts.split("\\|");

            for (BTSProject pp : projects) {
                boolean found = false;

                for (BTSProjectDBCollection col : pp.getDbCollections()) {
                    if (col.getCollectionName().endsWith("ths")) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    // no lemma list in project
                    break;
                }
                found = false;

                if (main_atexts != null && main_atexts.equals(pp.getPrefix())) {
                    selectedProject = pp;
                    comboViewer.setSelection(new StructuredSelection(pp));
                }
                for (String p : pros) {
                    if (p.equals(pp.getPrefix())) {
                        chosenProjects.add(pp);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    availableProjects.add(pp);
                }
            }

        }

        duallistcomposite.setAvailableContentProvider(new BTSProjectRemovableContentProvider(availableProjects));
        duallistcomposite.setAvailableLabelProvider(new BTSProjectLabelProvider());
        chrosenProvider = new BTSProjectRemovableContentProvider(chosenProjects);
        duallistcomposite.setChosenContentProvider(chrosenProvider);
        duallistcomposite.setChosenLabelProvider(new BTSProjectLabelProvider());
        loaded = true;

    }


    private String getActiveProjectSelectionsAsString() {
        String string = "";
        for (String s : getActiveProjectSelectionsAsStringList()) {
            string += s + "|";
        }
        return string.length() > 2 ? string.substring(0, string.length() - 1) : "";
    }

    private List<String> getActiveProjectSelectionsAsStringList() {
        List<String> prefixes = new Vector<>();
        if (chrosenProvider == null) {
            return prefixes;
        }
        List<BTSProject> selections = chrosenProvider.getInputElements();
        for (BTSProject project : selections) {
            if (project.getPrefix() != null) {
                prefixes.add(project.getPrefix());
            }
        }
        return prefixes;
    }

    @Override
    public boolean performOk() {
        if (!loaded) {
            return super.performOk();
        }
        boolean saveRequired = false;
        if (selectedProject != null && main_atexts != null && !main_atexts.equals(selectedProject.getPrefix())) {
            prefs.put(BTSPluginIDs.PREF_MAIN_ATEXT_KEY, selectedProject.getPrefix());
            // update instance scope so that new value is injected
            InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_ATEXT_KEY, selectedProject.getPrefix());
            saveRequired = true;
        }
        String selectedProjetsString = getActiveProjectSelectionsAsString();
        if (selectedProjetsString != null && !selectedProjetsString.equals(active_atexts)) {
            prefs.put(BTSPluginIDs.PREF_ACTIVE_ATEXTS, selectedProjetsString);
            // update instance scope so that new value is injected
            InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_ATEXTS, selectedProjetsString);
            saveRequired = true;
        }
        if (saveRequired) {

            try {
                prefs.flush();
            } catch (BackingStoreException e) {
                logger.error(e);
            }
        }
        return super.performOk();
    }
}
