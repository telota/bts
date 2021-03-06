/******************************************************************************
 Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.contentassist;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationExtension;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * A smart context information allows to customize the strategy that determines
 * validity and that allows to update the presentation.
 *
 * @author Sebastian Zarnekow - Initial contribution and API
 * @see IContextInformationValidator
 * @see IContextInformationPresenter
 * @since 2.3
 */
public interface ISmartContextInformation extends IContextInformation, IContextInformationExtension {

    /**
     * @see org.eclipse.jface.text.contentassist.IContextInformationValidator#isContextInformationValid(int)
     */
    boolean isContextInformationValid(ITextViewer viewer, int offset);

    /**
     * @see IContextInformationPresenter#updatePresentation(int, TextPresentation)
     */
    boolean updatePresentation(ITextViewer viewer, int offset, TextPresentation presentation);

}
