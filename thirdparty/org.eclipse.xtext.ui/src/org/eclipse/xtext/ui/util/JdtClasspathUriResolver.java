/******************************************************************************
 Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.util;

import static org.eclipse.xtext.util.Strings.*;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJarEntryResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ExternalPackageFragmentRoot;
import org.eclipse.xtext.resource.ClasspathUriResolutionException;
import org.eclipse.xtext.resource.ClasspathUriUtil;
import org.eclipse.xtext.resource.IClasspathUriResolver;

public class JdtClasspathUriResolver implements IClasspathUriResolver {

    private IJavaElement javaElement;

    public URI resolve(Object context, URI classpathUri) {
        if (!(context instanceof IJavaElement)) {
            throw new IllegalArgumentException("Context must implement IResource");
        }
        javaElement = (IJavaElement) context;
        try {
            if (ClasspathUriUtil.isClasspathUri(classpathUri)) {
                IJavaProject javaProject = javaElement.getJavaProject();
                URI result = findResourceInWorkspace(javaProject, classpathUri);
                if (classpathUri.fragment() != null)
                    result = result.appendFragment(classpathUri.fragment());
                return result;
            }
        } catch (Exception exc) {
            throw new ClasspathUriResolutionException(exc);
        }
        return classpathUri;
    }

    protected URI findResourceInWorkspace(IJavaProject javaProject, URI classpathUri) throws CoreException {
        if (javaProject.exists()) {
            String packagePath = classpathUri.trimSegments(1).path();
            String fullPath = classpathUri.path();
            String fileName = classpathUri.lastSegment();
            IPath filePath = new Path(fileName);
            String packageName = isEmpty(packagePath) ? "" : packagePath.substring(1).replace('/', '.');
            for (IPackageFragmentRoot packageFragmentRoot : javaProject.getAllPackageFragmentRoots()) {
                IPackageFragment packageFragment = packageFragmentRoot.getPackageFragment(packageName);
                if (packageFragment.exists()) {
                    IResource packageFragmentResource = packageFragment.getResource();
                    if (packageFragmentResource instanceof IContainer) {
                        IFile file = ((IContainer) packageFragmentResource).getFile(filePath);
                        if (file.exists())
                            return createPlatformResourceURI(file);
                    } else { // jar file or external class folder
                        if (packageFragmentRoot.isArchive()) { // jar file
                            Object[] nonJavaResources = getNonJavaResources(packageFragmentRoot, packageFragment);
                            for (Object nonJavaResource : nonJavaResources) {
                                IJarEntryResource jarEntryResource = (IJarEntryResource) nonJavaResource;
                                if (fullPath.equals(jarEntryResource.getFullPath().toString())) {
                                    IResource packageFragmentRootResource = packageFragmentRoot.getResource();
                                    if (packageFragmentRootResource != null) { // we have a resource - use nested platform/resource
                                        URI packageFragmentRootURI = createPlatformResourceURI(packageFragmentRootResource);
                                        return createArchiveURI(packageFragmentRootURI, fullPath);
                                    } else {
                                        // no resource - use file uri
                                        IPath packageFragmentRootPath = packageFragmentRoot.getPath();
                                        URI packageFragmentRootURI = URI.createFileURI(packageFragmentRootPath.toString());
                                        return createArchiveURI(packageFragmentRootURI, fullPath);
                                    }
                                }
                            }
                        } else if (packageFragmentRoot.isExternal()) { // external class folder
                            Object[] nonJavaResources = getNonJavaResources(packageFragmentRoot, packageFragment);
                            for (Object nonJavaResource : nonJavaResources) {
                                IJarEntryResource jarEntryResource = (IJarEntryResource) nonJavaResource;
                                if (fileName.equals(jarEntryResource.getName())) {
                                    IResource packageFragmentRootResource = ((ExternalPackageFragmentRoot) packageFragmentRoot).resource();
                                    IPath absolutePath = packageFragmentRootResource.getFullPath();
                                    absolutePath = absolutePath.append(fullPath);
                                    return createPlatformResourceURI(absolutePath);
                                }
                            }
                        }
                    }
                }
            }
        }
        return classpathUri;
    }

    private Object[] getNonJavaResources(IPackageFragmentRoot packageFragmentRoot, IPackageFragment packageFragment)
            throws JavaModelException {
        Object[] nonJavaResources = null;
        if (packageFragment.isDefaultPackage()) {
            nonJavaResources = packageFragmentRoot.getNonJavaResources();
        } else {
            nonJavaResources = packageFragment.getNonJavaResources();
        }
        return nonJavaResources;
    }

    protected URI createArchiveURI(URI baseURI, String entryPath) {
        return URI.createURI("archive:" + baseURI.toString() + "!" + entryPath);
    }

    protected URI createPlatformResourceURI(IResource resource) {
        IPath resourcePath = resource.getFullPath();
        return createPlatformResourceURI(resourcePath);
    }

    private URI createPlatformResourceURI(IPath resourcePath) {
        return URI.createPlatformResourceURI(resourcePath.toString(), true);
    }

}
