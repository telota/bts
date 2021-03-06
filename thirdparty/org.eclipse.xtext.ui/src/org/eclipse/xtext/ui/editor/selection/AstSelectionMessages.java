/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.selection;

import org.eclipse.osgi.util.NLS;

/**
 * Helper class to get NLSed messages.
 *
 * @author Michael Clay - Initial contribution and API
 */
public final class AstSelectionMessages extends NLS {

    private static final String BUNDLE_NAME = AstSelectionMessages.class.getName();
    public static String AstSelectNext_label;
    public static String AstSelectNext_tooltip;
    public static String AstSelectNext_description;
    public static String AstSelectPrevious_label;
    public static String AstSelectPrevious_tooltip;
    public static String AstSelectPrevious_description;
    public static String AstSelectEnclosing_label;
    public static String AstSelectEnclosing_tooltip;
    public static String AstSelectEnclosing_description;
    public static String AstSelectLast_label;
    public static String AstSelectLast_tooltip;
    public static String AstSelectLast_description;

    static {
        NLS.initializeMessages(BUNDLE_NAME, AstSelectionMessages.class);
    }

    private AstSelectionMessages() {
        // Do not instantiate
    }
}
