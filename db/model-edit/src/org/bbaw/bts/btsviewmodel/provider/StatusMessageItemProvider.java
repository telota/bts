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
package org.bbaw.bts.btsviewmodel.provider;


import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsviewmodel.StatusMessage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StatusMessageItemProvider
        extends ItemProviderAdapter
        implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
        IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, ITableItemFontProvider,
        IItemColorProvider, IItemFontProvider, IItemStyledLabelProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public StatusMessageItemProvider(AdapterFactory adapterFactory) {
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

            addMessagePropertyDescriptor(object);
            addCreationTimePropertyDescriptor(object);
            addUserIdPropertyDescriptor(object);
            addMessageTypePropertyDescriptor(object);
            addChildrenPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Message feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMessagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_StatusMessage_message_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_StatusMessage_message_feature", "_UI_StatusMessage_type"),
                                BtsviewmodelPackage.Literals.STATUS_MESSAGE__MESSAGE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Creation Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addCreationTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_StatusMessage_creationTime_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_StatusMessage_creationTime_feature", "_UI_StatusMessage_type"),
                                BtsviewmodelPackage.Literals.STATUS_MESSAGE__CREATION_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the User Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUserIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_StatusMessage_userId_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_StatusMessage_userId_feature", "_UI_StatusMessage_type"),
                                BtsviewmodelPackage.Literals.STATUS_MESSAGE__USER_ID,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Message Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMessageTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_StatusMessage_messageType_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_StatusMessage_messageType_feature", "_UI_StatusMessage_type"),
                                BtsviewmodelPackage.Literals.STATUS_MESSAGE__MESSAGE_TYPE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Children feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addChildrenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_StatusMessage_children_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_StatusMessage_children_feature", "_UI_StatusMessage_type"),
                                BtsviewmodelPackage.Literals.STATUS_MESSAGE__CHILDREN,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This returns StatusMessage.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/StatusMessage"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getText(Object object) {
        return ((StyledString) getStyledText(object)).getString();
    }

    @Override
    public String getColumnText(Object object, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ((StatusMessage) object).getMessageType().getLiteral();
            case 2:
                return ((StatusMessage) object).getUserId();
            case 3:
                return BTSConstants.ADMIN_DATE_FORMAT.format(((StatusMessage) object).getCreationTime());
            default:
                return getText(object);
        }
//		return super.getColumnText(object, columnIndex);
    }

    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(BtsviewmodelPackage.Literals.STATUS_MESSAGE__CHILDREN);
        }
        return childrenFeatures;
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
        String label = ((StatusMessage) object).getMessage();
        StyledString styledLabel = new StyledString();
        if (label == null || label.length() == 0) {
            styledLabel.append(getString("_UI_StatusMessage_type"), StyledString.Style.QUALIFIER_STYLER);
        } else {
            styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
        }
        return styledLabel;
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

        switch (notification.getFeatureID(StatusMessage.class)) {
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE:
            case BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME:
            case BtsviewmodelPackage.STATUS_MESSAGE__USER_ID:
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return BTSViewModelEditPlugin.INSTANCE;
    }

}
