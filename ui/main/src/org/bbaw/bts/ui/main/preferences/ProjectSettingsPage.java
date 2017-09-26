package org.bbaw.bts.ui.main.preferences;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
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

import com.richclientgui.toolbox.duallists.DualListComposite;

public class ProjectSettingsPage extends FieldEditorPreferencePage {

	private ComboViewer comboViewer;
	private BTSProject selectedProject;
	private String main_project;
	private DualListComposite<BTSProject> duallistcomposite;
	private IEclipseContext context;
	private BTSProjectController projectController;
	private List<BTSProject> projects;
	private String active_projects;
	private BTSProjectRemovableContentProvider chrosenProvider;
	private IEclipsePreferences prefs;
	private Logger logger;
	private boolean loaded;

	/**
	 * Create the preference page.
	 */
	public ProjectSettingsPage() {
		super(FLAT);
		setTitle("Project Settings");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		
		Composite container = (Composite) this.getControl();
		
		Label lblSelectYourMain = new Label(container, SWT.NONE);
		lblSelectYourMain.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblSelectYourMain.setText("Select your main working project");

		comboViewer = new ComboViewer(container, SWT.READ_ONLY);
		comboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		comboViewer.setContentProvider(new ListContentProvider());
		comboViewer.setLabelProvider(labelProvider);
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				selectedProject = (BTSProject) sel.getFirstElement();
			}
		});
		
		Group grpFurtherProjectsFrom = new Group(container, SWT.NONE);
		grpFurtherProjectsFrom.setLayout(new GridLayout(2, false));
		grpFurtherProjectsFrom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpFurtherProjectsFrom.setText("Further projects from which you want to load and read data");
		
		Label lblAvailableProjects = new Label(grpFurtherProjectsFrom, SWT.NONE);
		lblAvailableProjects.setText("Available Projects (Not downloaded)");
		
		Label lblProjectsToBe = new Label(grpFurtherProjectsFrom, SWT.NONE);
		lblProjectsToBe.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		lblProjectsToBe.setAlignment(SWT.RIGHT);
		lblProjectsToBe.setText("Projects to be downloaded");

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
		main_project = prefs.get(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null);
		active_projects = prefs.get(BTSPluginIDs.PREF_ACTIVE_PROJECTS, null);
		logger = context.get(Logger.class);
		
		loadListInput();

	}
	
	
	private void loadListInput()
	{

		projects = projectController.listProjects(null);
		comboViewer.setInput(projects);
		List<BTSProject> availableProjects = new Vector<BTSProject>(1);

		List<BTSProject> chosenProjects = new Vector<BTSProject>(1);
		if (active_projects != null && active_projects.trim().length() > 0)
		{
			String[] pros = active_projects.split("\\|");

			for (BTSProject pp : projects)
			{

				boolean found = false;
				if (main_project != null && main_project.equals(pp.getPrefix()))
				{
					selectedProject = pp;
					comboViewer.setSelection(new StructuredSelection(pp));
				}
				for (String p : pros)
				{
					if (p.equals(pp.getPrefix()))
					{
						chosenProjects.add(pp);
						found = true;
						break;
					}
				}
				if (!found)
				{
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
		for (String s : getActiveProjectSelectionsAsStringList())
		{
			string += s + "|";
		}
		return string.length() > 2 ? string.substring(0, string.length() - 1) : "";
	}
	
	private List<String> getActiveProjectSelectionsAsStringList()
	{
		List<String> prefixes = new Vector<String>();
		if (chrosenProvider == null)
		{
			return prefixes;
		}
		List<BTSProject> selections = chrosenProvider.getInputElements();
		for (BTSProject project : selections)
		{
			if (project.getPrefix() != null)
			{
				prefixes.add(project.getPrefix());
			}
		}
		return prefixes;
	}
	@Override
	public boolean performOk() {
		if (!loaded)
		{
			return super.performOk();
		}
		boolean saveRequired = false;
		if (selectedProject != null && (main_project == null ||  (main_project != null && !main_project.equals(selectedProject.getPrefix()))))
		{
			prefs.put(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, selectedProject.getPrefix());
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, selectedProject.getPrefix());
			context.modify(BTSCoreConstants.MAIN_PROJECT, selectedProject);
			saveRequired = true;
		}
		String selectedProjetsString = getActiveProjectSelectionsAsString();
		if (selectedProjetsString != null && !selectedProjetsString.equals(active_projects))
		{
			prefs.put(BTSPluginIDs.PREF_ACTIVE_PROJECTS, selectedProjetsString);
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_PROJECTS, selectedProjetsString);
			saveRequired = true;
		}
		if (saveRequired)
		{

			try {
				prefs.flush();
			} catch (BackingStoreException e) {
				logger.error(e);
			}
		}
		return super.performOk();
	}
}
