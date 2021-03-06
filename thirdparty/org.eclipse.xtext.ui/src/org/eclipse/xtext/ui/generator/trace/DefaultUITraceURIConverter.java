/******************************************************************************
 Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.generator.trace;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.generator.trace.DefaultTraceURIConverter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * @author Holger Schill
 */
public class DefaultUITraceURIConverter extends DefaultTraceURIConverter {

    private final static Logger LOG = Logger.getLogger(DefaultUITraceURIConverter.class);

    @Inject
    private IStorage2UriMapper mapper;

    @Override
    public URI getURIForTrace(XtextResource context) {
        ResourceSet rs = context.getResourceSet();
        if (!(rs instanceof XtextResourceSet && ((XtextResourceSet) rs).getClasspathURIContext() instanceof IJavaProject))
            return super.getURIForTrace(context);
        IJavaProject javaProject = (IJavaProject) ((XtextResourceSet) rs).getClasspathURIContext();
        try {
            return computeTraceURI(context.getURI(), javaProject);
        } catch (JavaModelException e) {
            LOG.error(e);
        }
        return super.getURIForTrace(context);
    }

    @Override
    public URI getURIForTrace(URI uri) {
        if (uri.isPlatform() && uri.segmentCount() > 1) {
            Iterator<Pair<IStorage, IProject>> storagesIterator = mapper.getStorages(uri).iterator();
            if (storagesIterator.hasNext()) {
                Pair<IStorage, IProject> candidate = storagesIterator.next();
                IProject project = candidate.getSecond();
                try {
                    if (project.exists()) {
                        if (project.hasNature(JavaCore.NATURE_ID)) {
                            IJavaProject javaProject = JavaCore.create(project);
                            if (javaProject != null)
                                return computeTraceURI(uri, javaProject);
                        }
                    }
                } catch (CoreException e) {
                    LOG.error(e);
                }
            }
        }
        return super.getURIForTrace(uri);
    }

    protected URI computeTraceURI(URI uri, IJavaProject javaProject) throws JavaModelException {
        for (IPackageFragmentRoot root : javaProject.getPackageFragmentRoots())
            if (root.getKind() == IPackageFragmentRoot.K_SOURCE) {
                URI prefix = URI.createPlatformResourceURI(root.getResource().getFullPath().addTrailingSeparator().toString(), true);
                if (isPrefix(prefix, uri))
                    return uri.deresolve(prefix).trimFragment().trimQuery();
            }
        return super.getURIForTrace(uri);
    }
}
