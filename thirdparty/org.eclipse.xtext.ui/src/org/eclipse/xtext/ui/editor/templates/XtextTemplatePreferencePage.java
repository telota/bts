/******************************************************************************
 Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.templates;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.google.inject.Inject;

import e4.handler.E4TemplatePreferencePage;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.1
 */
public class XtextTemplatePreferencePage extends E4TemplatePreferencePage {


    @Inject
    private ContextTypeRegistry registry;
    @Inject
    private TemplateStore templateStoreInternal;

    //XXX added cp
    @javax.inject.Inject
    public XtextTemplatePreferencePage(IPreferenceStore preferenceStore) {
        setPreferenceStore(preferenceStore);
    }

    @Inject
    public XtextTemplatePreferencePage(IPreferenceStore preferenceStore, ContextTypeRegistry registry, TemplateStore templateStore) {
        setPreferenceStore(preferenceStore);
        setContextTypeRegistry(registry);
        setTemplateStore(templateStore);
    }

    public ContextTypeRegistry getRegistry() {
        return registry;
    }

    public void setRegistry(ContextTypeRegistry registry) {
        this.registry = registry;
        setContextTypeRegistry(registry);
    }

    public TemplateStore getTemplateStoreInternal() {
        return templateStoreInternal;
    }

    public void setTemplateStoreInternal(TemplateStore templateStoreInternal) {
        this.templateStoreInternal = templateStoreInternal;
        setTemplateStore(templateStoreInternal);
    }

    @Override
    protected boolean isShowFormatterSetting() {
        return false;
    }

    /**
     * @since 2.1
     */
    @Override
    protected Control createContents(Composite ancestor) {
        Control result = super.createContents(ancestor);
        ancestor.layout();
        return result;
    }

    /**
     * @since 2.1
     */
    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);
        // set the with of the leftmost column ('name')
        getTableViewer().getTable().getColumns()[0].pack();
    }


}
