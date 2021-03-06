/******************************************************************************
 Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.model;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.Region;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class XtextDocumentEvent extends DocumentEvent {

    private DocumentEvent original;
    private Region damagedRegion;

    public XtextDocumentEvent(DocumentEvent original, Region damagedRegion) {
        super(original.fDocument, original.fOffset, original.fLength, original.fText);
        this.original = original;
        this.damagedRegion = damagedRegion;
    }

    public Region getDamagedRegion() {
        return damagedRegion;
    }

    public DocumentEvent getOriginalDocumentEvent() {
        return original;
    }

}
