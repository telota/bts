/*******************************************************************************
 * Copyright (c) 2010 Michael Clay and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.folding;

import java.util.Collection;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.inject.ImplementedBy;

/**
 * Compute the folding regions in the given document. This is a blocking
 * action when opening the editor in e4, so clients should be careful to
 * not resolve too many cross references in their implementation.
 * 
 * @author Michael Clay - Initial contribution and API
 * @author Sebastian Zarnekow - Refactoring, introduced FoldedPosition
 */
@ImplementedBy(DefaultFoldingRegionProvider.class)
public interface IFoldingRegionProvider {

	/**
	 * @return the list of <code>FoldedPosition</code> for the given document
	 */
	Collection<FoldedPosition> getFoldingRegions(IXtextDocument xtextDocument);

}
