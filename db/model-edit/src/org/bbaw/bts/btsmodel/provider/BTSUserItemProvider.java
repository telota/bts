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

import org.bbaw.bts.btsmodel.BTSUser;
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
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSUser} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class BTSUserItemProvider extends BTSObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public BTSUserItemProvider(AdapterFactory adapterFactory) {
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

            addGroupIdsPropertyDescriptor(object);
            addSiglePropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addWebDescriptionPropertyDescriptor(object);
            addUserNamePropertyDescriptor(object);
            addForeNamePropertyDescriptor(object);
            addSureNamePropertyDescriptor(object);
            addMailPropertyDescriptor(object);
            addWebURLPropertyDescriptor(object);
            addCommentPropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addLoggedInPropertyDescriptor(object);
            addStatusPropertyDescriptor(object);
            addDbAdminPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Group Ids feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addGroupIdsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_groupIds_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_groupIds_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__GROUP_IDS,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Sigle feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSiglePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_sigle_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_sigle_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__SIGLE,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Description feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_description_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_description_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__DESCRIPTION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Web Description feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addWebDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_webDescription_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_webDescription_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__WEB_DESCRIPTION,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the User Name feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUserNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_userName_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_userName_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__USER_NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Fore Name feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addForeNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_foreName_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_foreName_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__FORE_NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Sure Name feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addSureNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_sureName_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_sureName_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__SURE_NAME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Mail feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMailPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_mail_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_mail_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__MAIL,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Web URL feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addWebURLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_webURL_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_webURL_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__WEB_URL,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Comment feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addCommentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_comment_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_comment_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__COMMENT,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Password feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_password_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_password_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__PASSWORD,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Logged In feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLoggedInPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_loggedIn_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_loggedIn_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__LOGGED_IN,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Status feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addStatusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_status_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_status_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__STATUS,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Db Admin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addDbAdminPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
                (createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                                getResourceLocator(),
                                getString("_UI_BTSUser_dbAdmin_feature"),
                                getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_dbAdmin_feature", "_UI_BTSUser_type"),
                                BtsmodelPackage.Literals.BTS_USER__DB_ADMIN,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This returns BTSUser.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generatedNOT
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getBTSResourceProvider().getImage(
                Display.getDefault(), BTSResourceProvider.IMG_USER));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getText(Object object) {
        return ((StyledString) getStyledText(object)).getString();
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
        BTSUser user = (BTSUser) object;
        String label = "";
        if (user.getForeName() != null && !"".equals(user.getForeName().trim())) {
            label = user.getForeName();
        }
        if (user.getSureName() != null && !"".equals(user.getSureName().trim())) {
            if ("".equals(label)) {
                label = user.getSureName();
            } else {
                label += " " + user.getSureName();
            }
        }
        if ("".equals(label)) {
            label = user.getUserName();
        } else {
            label += " (" + user.getUserName() + ")";
        }
        StyledString styledLabel = new StyledString();
        if (label == null || label.length() == 0) {
            styledLabel.append(getString("_UI_BTSUser_type"), StyledString.Style.QUALIFIER_STYLER);
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

        switch (notification.getFeatureID(BTSUser.class)) {
            case BtsmodelPackage.BTS_USER__GROUP_IDS:
            case BtsmodelPackage.BTS_USER__SIGLE:
            case BtsmodelPackage.BTS_USER__DESCRIPTION:
            case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
            case BtsmodelPackage.BTS_USER__USER_NAME:
            case BtsmodelPackage.BTS_USER__FORE_NAME:
            case BtsmodelPackage.BTS_USER__SURE_NAME:
            case BtsmodelPackage.BTS_USER__MAIL:
            case BtsmodelPackage.BTS_USER__WEB_URL:
            case BtsmodelPackage.BTS_USER__COMMENT:
            case BtsmodelPackage.BTS_USER__PASSWORD:
            case BtsmodelPackage.BTS_USER__LOGGED_IN:
            case BtsmodelPackage.BTS_USER__STATUS:
            case BtsmodelPackage.BTS_USER__DB_ADMIN:
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
