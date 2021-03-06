/******************************************************************************
 Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.refactoring.ui;

import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;

import com.google.inject.Inject;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RefactoringPreferences {

    public static final String SAVE_ALL_BEFORE_REFACTORING = "saveAllBeforeRefactoring";
    public static final String USE_INLINE_REFACTORING = "useInlineRefactoring";
    @Inject
    private IPreferenceStoreAccess preferenceStoreAccess;

    public boolean isSaveAllBeforeRefactoring() {
        return preferenceStoreAccess.getPreferenceStore().getBoolean(SAVE_ALL_BEFORE_REFACTORING);
    }

    public void setSaveAllBeforeRefactoring(boolean isSaveAllBeforeRefatoring) {
        preferenceStoreAccess.getWritablePreferenceStore().setValue(SAVE_ALL_BEFORE_REFACTORING, isSaveAllBeforeRefatoring);
    }

    public boolean useInlineRefactoring() {
        return preferenceStoreAccess.getPreferenceStore().getBoolean(USE_INLINE_REFACTORING);
    }

    public void setUseInlineRefactoring(boolean useInlineRefatoring) {
        preferenceStoreAccess.getWritablePreferenceStore().setValue(USE_INLINE_REFACTORING, useInlineRefatoring);
    }

    public static class Initializer implements IPreferenceStoreInitializer {
        public void initialize(IPreferenceStoreAccess access) {
            access.getWritablePreferenceStore().setDefault(SAVE_ALL_BEFORE_REFACTORING, false);
            access.getWritablePreferenceStore().setDefault(USE_INLINE_REFACTORING, true);
        }
    }
}
