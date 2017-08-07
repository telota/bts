/******************************************************************************
 Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;

import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class PluginProjectFactory extends JavaProjectFactory {

    protected List<String> requiredBundles;
    protected List<String> exportedPackages;
    protected List<String> importedPackages;
    protected String activatorClassName;

    public PluginProjectFactory addRequiredBundles(List<String> requiredBundles) {
        if (this.requiredBundles == null)
            this.requiredBundles = Lists.newArrayList();
        this.requiredBundles.addAll(requiredBundles);
        return this;
    }

    public PluginProjectFactory addExportedPackages(List<String> exportedPackages) {
        if (this.exportedPackages == null)
            this.exportedPackages = Lists.newArrayList();
        this.exportedPackages.addAll(exportedPackages);
        return this;
    }

    public PluginProjectFactory addImportedPackages(List<String> importedPackages) {
        if (this.importedPackages == null)
            this.importedPackages = Lists.newArrayList();
        this.importedPackages.addAll(importedPackages);
        return this;
    }

    public PluginProjectFactory setActivatorClassName(String activatorClassName) {
        this.activatorClassName = activatorClassName;
        return this;
    }

    @Override
    protected void enhanceProject(IProject project, SubMonitor subMonitor, Shell shell) throws CoreException {
        super.enhanceProject(project, subMonitor, shell);
        if (projectNatures.contains("org.eclipse.pde.PluginNature")) {
            createManifest(project, subMonitor.newChild(1));
            createBuildProperties(project, subMonitor.newChild(1));
        }
    }

    @Override
    protected void addMoreClasspathEntriesTo(List<IClasspathEntry> classpathEntries) {
        super.addMoreClasspathEntriesTo(classpathEntries);
        classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"))); //$NON-NLS-1$
    }

    protected void createBuildProperties(IProject project, IProgressMonitor progressMonitor) {
        final StringBuilder content = new StringBuilder("source.. = ");
        for (final Iterator<String> iterator = folders.iterator(); iterator.hasNext(); ) {
            content.append(iterator.next()).append('/');
            if (iterator.hasNext()) {
                content.append(",\\\n");
                //              source.. =
                content.append("          ");
            }
        }
        content.append("\n");
        content.append("bin.includes = META-INF/,\\\n");
        content.append("               .,\\\n");
        content.append("               plugin.xml");

        createFile("build.properties", project, content.toString(), progressMonitor);
    }

    protected void createManifest(IProject project, IProgressMonitor progressMonitor) throws CoreException {
        final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
        content.append("Bundle-ManifestVersion: 2\n");
        content.append("Bundle-Name: ").append(projectName).append("\n");
        content.append("Bundle-Vendor: My Company\n");
        content.append("Bundle-Version: 1.0.0.qualifier\n");
        content.append("Bundle-SymbolicName: ").append(projectName).append("; singleton:=true\n");
        if (null != activatorClassName) {
            content.append("Bundle-Activator: ").append(activatorClassName).append("\n");
        }
        content.append("Bundle-ActivationPolicy: lazy\n");

        addToContent(content, requiredBundles, "Require-Bundle");
        addToContent(content, exportedPackages, "Export-Package");
        addToContent(content, importedPackages, "Import-Package");

        content.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");

        final IFolder metaInf = project.getFolder("META-INF");
        SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
        try {
            if (metaInf.exists())
                metaInf.delete(false, progressMonitor);
            metaInf.create(false, true, subMonitor.newChild(1));
            createFile("org.bbaw.bts.app/META-INF/MANIFEST.MF", metaInf, content.toString(), subMonitor.newChild(1));
        } finally {
            subMonitor.done();
        }
    }

    protected void addToContent(final StringBuilder content, List<String> entries, String prefix) {
        if (entries != null && !entries.isEmpty()) {
            content.append(prefix).append(": ").append(entries.get(0));
            for (int i = 1, x = entries.size(); i < x; i++) {
                content.append(",\n ").append(entries.get(i));
            }
            content.append("\n");
        }
    }

    @Override
    public PluginProjectFactory addBuilderIds(String... builderIds) {
        return (PluginProjectFactory) super.addBuilderIds(builderIds);
    }

    @Override
    public PluginProjectFactory addFolders(List<String> folders) {
        return (PluginProjectFactory) super.addFolders(folders);
    }

    @Override
    public PluginProjectFactory setProjectName(String projectName) {
        return (PluginProjectFactory) super.setProjectName(projectName);
    }

    @Override
    public PluginProjectFactory addProjectNatures(String... projectNatures) {
        return (PluginProjectFactory) super.addProjectNatures(projectNatures);
    }

    @Override
    public PluginProjectFactory addReferencedProjects(List<IProject> referencedProjects) {
        return (PluginProjectFactory) super.addReferencedProjects(referencedProjects);
    }

    @Override
    public PluginProjectFactory setLocation(IPath location) {
        return (PluginProjectFactory) super.setLocation(location);
    }

    @Override
    public PluginProjectFactory addWorkingSets(List<IWorkingSet> workingSets) {
        return (PluginProjectFactory) super.addWorkingSets(workingSets);
    }
}
