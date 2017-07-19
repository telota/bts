/*
  This file is part of Berlin Text System.

  The software Berlin Text System serves as a client user interface for working with
  text corpus data. See: aaew.bbaw.de

  The software Berlin Text System was developed at the Berlin-Brandenburg Academy
  of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
  www.bbaw.de

  Copyright (C) 2013-2015  Berlin-Brandenburg Academy
  of Sciences and Humanities

  The software Berlin Text System was developed by @author: Christoph Plutte.

  Berlin Text System is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  Berlin Text System is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with Berlin Text System.
  If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.corpus.btsCorpusModel.provider;


import java.util.Collection;
import java.util.List;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BTSTextCorpusItemProvider
        extends BTSCorpusObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BTSTextCorpusItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addActivePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Active feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addActivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSTextCorpus_active_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSTextCorpus_active_feature", "_UI_BTSTextCorpus_type"),
                                BtsCorpusModelPackage.Literals.BTS_TEXT_CORPUS__ACTIVE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(BtsCorpusModelPackage.Literals.BTS_TEXT_CORPUS__HEADER);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns BTSTextCorpus.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generatedNOT
     */
    @Override
    public Object getImage(Object object) {
        Image im = null;
        if (((BTSTextCorpus) object).isActive()) {
            im = getBTSResourceProvider().getImage(Display
                    .getDefault(), getConfigurationController()
                    .getIconStringOfObjectType((BTSCorpusObject) object));
        } else {
            im = getBTSResourceProvider().getImage(Display
                    .getDefault(), BTSResourceProvider.IMG_CORPUS_DISABLED);
        }
        return overlayImage(object, im);
    }


    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generatedNOT
     */
    @Override
    public String getText(Object object) {
        String label = ((BTSTextCorpus) object).getName();
        return label == null || label.length() == 0 ?
                getString("_UI_BTSTextCorpus_type") :
                label;
    }

    /**
     * This returns the label styled text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generatedNOT
     */
    @Override
    public Object getStyledText(Object object) {
        String label = ((BTSTextCorpus) object).getName();
        StyledString styledLabel = new StyledString();
        if (label == null || label.length() == 0) {

            styledLabel.append(getString("_UI_BTSTextCorpus_type"), StyledString.Style.QUALIFIER_STYLER);

        } else {
            if (object.equals(getMainCorpus())) {
                styledLabel.append(label, UNDERLINED);
            } else {
                styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
            }
        }
        styledLabel.append(" [" + ((BTSCorpusObject) object).getProject() + "\\" + ((BTSCorpusObject) object).getCorpusPrefix() + "]", GREY);

        return styledLabel;
    }

    private BTSTextCorpus getMainCorpus() {
        BTSTextCorpus mainCorpus = null;
        if (mainCorpus == null) {
            mainCorpus = (BTSTextCorpus) StaticAccessController.getContext().get("main_corpus");
        }
        return mainCorpus;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(BTSTextCorpus.class)) {
            case BtsCorpusModelPackage.BTS_TEXT_CORPUS__ACTIVE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BtsCorpusModelPackage.BTS_TEXT_CORPUS__HEADER:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
                (createChildParameter
                        (BtsCorpusModelPackage.Literals.BTS_TEXT_CORPUS__HEADER,
                                BtsCorpusModelFactory.eINSTANCE.createBTSCorpusHeader()));
    }

}
