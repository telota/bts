/******************************************************************************
 Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.syntaxcoloring;

import com.google.inject.ImplementedBy;

/**
 * Clients should implement this interface to provide the set of highlighting styles.
 * Implementors have to provide an <code>id</code>, <code>name</code> and default <code>style</code>.
 *
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@ImplementedBy(DefaultHighlightingConfiguration.class)
public interface IHighlightingConfiguration {

    /**
     * This method is called by the framework and allows clients to register the default styles for
     * the semantic highlighting stage.
     *
     * @param acceptor the acceptor is used to announce the various default styles. It is never <code>null</code>.
     * @see IHighlightingConfigurationAcceptor#acceptDefaultHighlighting(String, String, org.eclipse.xtext.ui.editor.utils.TextStyle)
     */
    void configure(IHighlightingConfigurationAcceptor acceptor);

}
