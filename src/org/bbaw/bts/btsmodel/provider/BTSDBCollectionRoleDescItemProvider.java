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
package org.bbaw.bts.btsmodel.provider;

import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a
 * {@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class BTSDBCollectionRoleDescItemProvider extends BTSIdentifiableItemItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public BTSDBCollectionRoleDescItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addRoleNamePropertyDescriptor(object);
            addUserNamesPropertyDescriptor(object);
            addUserRolesPropertyDescriptor(object);
            addCachedChildrenPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Role Name feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRoleNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSDBCollectionRoleDesc_roleName_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSDBCollectionRoleDesc_roleName_feature", "_UI_BTSDBCollectionRoleDesc_type"),
                                BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the User Names feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUserNamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSDBCollectionRoleDesc_userNames_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSDBCollectionRoleDesc_userNames_feature", "_UI_BTSDBCollectionRoleDesc_type"),
                                BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the User Roles feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUserRolesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSDBCollectionRoleDesc_userRoles_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSDBCollectionRoleDesc_userRoles_feature", "_UI_BTSDBCollectionRoleDesc_type"),
                                BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Cached Children feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addCachedChildrenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSDBCollectionRoleDesc_cachedChildren_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSDBCollectionRoleDesc_cachedChildren_feature", "_UI_BTSDBCollectionRoleDesc_type"),
                                BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This returns BTSDBCollectionRoleDesc.gif. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generatedNOT
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, resourceProvider.getImage(
                Display.getDefault(), BTSResourceProvider.IMG_USERROLE));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generatedNOT
     */
    @Override
    public String getText(Object object) {
        String label = ((BTSDBCollectionRoleDesc) object).getRoleName();
        return label == null || label.length() == 0 ? getString("_UI_BTSDBCollectionRoleDesc_type") : label;
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
        String label = ((BTSDBCollectionRoleDesc) object).getRoleName();
        StyledString styledLabel = new StyledString();
        if (label == null || label.length() == 0) {
            styledLabel.append(getString("_UI_BTSDBCollectionRoleDesc_type"), StyledString.Style.QUALIFIER_STYLER);
        } else {
            styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
        }
        return styledLabel;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(BTSDBCollectionRoleDesc.class)) {
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME:
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES:
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES:
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
     * describing the children that can be created under this object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
