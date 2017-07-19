/******************************************************************************
 Copyright (c) 2010 Michael Clay and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html

 */
package org.eclipse.xtext.ui.editor.folding;

import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.ImplementedBy;

/**
 * @author Michael Clay - Initial contribution and API
 */
@ImplementedBy(DefaultFoldingStructureProvider.class)
public interface IFoldingStructureProvider {

    /**
     * Installs this structure provider on the given editor and viewer. Implementations should listen to the projection
     * events generated by <code>viewer</code> and enable / disable generation of projection structure accordingly.
     *
     * @param editor the editor that this provider works on
     * @param viewer the projection viewer that displays the annotations created by this structure provider
     */
    void install(XtextEditor editor, ProjectionViewer viewer);

    /**
     * Uninstalls this structure provider. Any references to editors or viewers should be cleared.
     */
    void uninstall();

    /**
     * (Re-)initializes the structure provided by the receiver.
     */
    void initialize();

}
