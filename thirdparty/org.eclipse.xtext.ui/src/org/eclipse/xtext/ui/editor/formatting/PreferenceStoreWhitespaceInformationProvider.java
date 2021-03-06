/******************************************************************************
 Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.formatting;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.formatting.ILineSeparatorInformation;
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;

import com.google.inject.Inject;

import java.util.Iterator;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * @since 2.3
 */
public class PreferenceStoreWhitespaceInformationProvider implements IWhitespaceInformationProvider {

    @Inject
    private IIndentationInformation indentInfo;

    @Inject
    private IStorage2UriMapper storage2UriMapper;

    @Inject
    private IWorkspace workspace;

    public IIndentationInformation getIndentationInformation(URI uri) {
        return indentInfo;
    }

    public ILineSeparatorInformation getLineSeparatorInformation(URI uri) {
        final String lineSeparator = getLineSeparatorPreference(uri);
        return new ILineSeparatorInformation() {
            public String getLineSeparator() {
                return lineSeparator;
            }
        };
    }

    protected String getLineSeparatorPreference(URI uri) {
        IProject project = null;
        if (uri.isPlatformResource()) {
            project = workspace.getRoot().getProject(uri.segment(1));
        } else {
            Iterator<Pair<IStorage, IProject>> it = storage2UriMapper.getStorages(uri).iterator();
            if (it.hasNext())
                project = it.next().getSecond();
        }
        if (project != null) {
            String result = getLineSeparatorPreference(new ProjectScope(project));
            if (result != null)
                return result;
        }
        String result = getLineSeparatorPreference(new InstanceScope());
        if (result != null)
            return result;
        return System.getProperty("line.separator");
    }

    protected String getLineSeparatorPreference(IScopeContext scopeContext) {
        return Platform.getPreferencesService().getString(Platform.PI_RUNTIME,
                Platform.PREF_LINE_SEPARATOR, null, new IScopeContext[]{scopeContext});
    }
}
