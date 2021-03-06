/******************************************************************************
 Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html

 */
package org.eclipse.xtext.ui;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;

import com.ibm.icu.text.MessageFormat;

/**
 * Singleton for all message bundle classes used from within
 * <i>org.eclipse.xtext.ui</i>.
 *
 * @author Dennis H�bner - Initial contribution and API
 * @author Michael Clay
 * @see org.eclipse.osgi.util.NLS
 */
public class XtextUIMessages extends NLS {

    private static final String BUNDLE_NAME = XtextUIMessages.class.getPackage().getName() + ".messages"; //$NON-NLS-1$

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
    /**
     * messages for hovers
     */
    public static String AbstractHover_MultipleMarkers;
    /**
     * editor ruler context menu
     */
    public static String Editor_FoldingMenu_name;
    /**
     * messages for outline
     */
    public static String LexicalSortingAction_description;
    public static String LexicalSortingAction_label;
    public static String LexicalSortingAction_tooltip;
    public static String ToggleLinkWithEditorAction_description;
    public static String ToggleLinkWithEditorAction_label;
    public static String ToggleLinkWithEditorAction_toolTip;
    /**
     * messages for hover
     */
    public static String XtextBrowserInformationControlInput_Back;
    public static String XtextBrowserInformationControlInput_BackTo;
    public static String XtextBrowserInformationControlInput_Forward;
    public static String XtextBrowserInformationControlInput_ForwardTo;
    public static String XtextBrowserInformationControlInput_OpenDeclaration;
    public static String AnnotationWithQuickFixesHover_message_singleQuickFix;
    public static String AnnotationWithQuickFixesHover_message_multipleQuickFix;
    /**
     * @since 2.3
     */
    public static String XtextBrowserInformationControlInput_ShowInJavaDocView;

    static {
        NLS.initializeMessages(BUNDLE_NAME, XtextUIMessages.class);
    }
    private XtextUIMessages() {
    }

    /**
     * @param key
     * @return
     */
    public static String getString(String key) {
        try {
            return getResourceBundle().getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    /**
     * @return the rESOURCE_BUNDLE
     */
    public static ResourceBundle getResourceBundle() {
        return RESOURCE_BUNDLE;
    }

    /**
     * @param key
     * @param args
     * @return Formatted message
     */
    public static String getFormattedString(String key, Object... args) {
        return MessageFormat.format(RESOURCE_BUNDLE.getString(key), args);
    }

}
