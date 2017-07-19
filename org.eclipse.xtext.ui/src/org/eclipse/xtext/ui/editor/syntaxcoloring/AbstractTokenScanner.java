/******************************************************************************
 Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.syntaxcoloring;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ITokenScanner;

import com.google.inject.Inject;

/**
 * @author Jan K�hnlein - Initial contribution and API
 * @author Dennis H�bner - Initial contribution and API
 */
public abstract class AbstractTokenScanner implements ITokenScanner {

    @Inject
    private ITextAttributeProvider textAttributeProvider;

    public ITextAttributeProvider getTextAttributeProvider() {
        return textAttributeProvider;
    }

    public void setTextAttributeProvider(ITextAttributeProvider textAttributeProvider) {
        this.textAttributeProvider = textAttributeProvider;
    }

    protected TextAttribute getAttribute(String id) {
        return textAttributeProvider.getAttribute(id);
    }

}
