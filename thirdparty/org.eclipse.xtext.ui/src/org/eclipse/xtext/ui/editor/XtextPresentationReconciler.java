/******************************************************************************
 Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.PresentationReconciler;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class XtextPresentationReconciler extends PresentationReconciler {

    /**
     * Last used document
     */
    private IDocument fLastDocument;

    public TextPresentation createRepairDescription(IRegion damage, IDocument document) {
        if (document != fLastDocument) {
            setDocumentToDamagers(document);
            setDocumentToRepairers(document);
            fLastDocument = document;
        }
        return super.createPresentation(new Region(0, document.getLength()), document);
    }
}
