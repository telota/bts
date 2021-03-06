/******************************************************************************
 Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.templates;

import org.eclipse.osgi.util.NLS;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class Messages extends NLS {
    private static final String BUNDLE_NAME = "org.eclipse.xtext.ui.editor.templates.messages"; //$NON-NLS-1$
    public static String CrossReferenceTemplateVariableResolver_1;
    public static String EnumTemplateVariableResolver_0;
    public static String EnumTemplateVariableResolver_1;
    public static String EnumTemplateVariableResolver_2;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
