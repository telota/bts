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
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTSDB Collection Role Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl#getRoleName <em>Role Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl#getUserNames <em>User Names</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl#getUserRoles <em>User Roles</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBCollectionRoleDescImpl#getCachedChildren <em>Cached Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSDBCollectionRoleDescImpl extends BTSIdentifiableItemImpl implements BTSDBCollectionRoleDesc {
    /**
     * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRoleName()
     */
    protected static final String ROLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRoleName()
     */
    protected String roleName = ROLE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getUserNames() <em>User Names</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getUserNames()
     */
    protected EList<String> userNames;

    /**
     * The cached value of the '{@link #getUserRoles() <em>User Roles</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getUserRoles()
     */
    protected EList<String> userRoles;

    /**
     * The cached value of the '{@link #getCachedChildren() <em>Cached Children</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCachedChildren()
     */
    protected EList<Object> cachedChildren;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BTSDBCollectionRoleDescImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setRoleName(String newRoleName) {
        String oldRoleName = roleName;
        roleName = newRoleName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME, oldRoleName, roleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getUserNames() {
        if (userNames == null) {
            userNames = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES);
        }
        return userNames;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getUserRoles() {
        if (userRoles == null) {
            userRoles = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES);
        }
        return userRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<Object> getCachedChildren() {
        if (cachedChildren == null) {
            cachedChildren = new EDataTypeUniqueEList<Object>(Object.class, this, BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN);
        }
        return cachedChildren;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME:
                return getRoleName();
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES:
                return getUserNames();
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES:
                return getUserRoles();
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN:
                return getCachedChildren();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME:
                setRoleName((String) newValue);
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES:
                getUserNames().clear();
                getUserNames().addAll((Collection<? extends String>) newValue);
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES:
                getUserRoles().clear();
                getUserRoles().addAll((Collection<? extends String>) newValue);
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN:
                getCachedChildren().clear();
                getCachedChildren().addAll((Collection<? extends Object>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME:
                setRoleName(ROLE_NAME_EDEFAULT);
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES:
                getUserNames().clear();
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES:
                getUserRoles().clear();
                return;
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN:
                getCachedChildren().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME:
                return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES:
                return userNames != null && !userNames.isEmpty();
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES:
                return userRoles != null && !userRoles.isEmpty();
            case BtsmodelPackage.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN:
                return cachedChildren != null && !cachedChildren.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (roleName: ");
        result.append(roleName);
        result.append(", userNames: ");
        result.append(userNames);
        result.append(", userRoles: ");
        result.append(userRoles);
        result.append(", cachedChildren: ");
        result.append(cachedChildren);
        result.append(')');
        return result.toString();
    }

} //BTSDBCollectionRoleDescImpl
