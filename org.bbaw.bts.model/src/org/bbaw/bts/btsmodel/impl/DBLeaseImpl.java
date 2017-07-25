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

import java.util.Date;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.DBLease;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Lease</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getPath <em>Path</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getObjectId <em>Object Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getUserId <em>User Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getObject <em>Object</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getActive <em>Active</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.DBLeaseImpl#getBtsUUID <em>Bts UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBLeaseImpl extends BTSDBBaseObjectImpl implements DBLease {
    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPath()
     */
    protected static final String PATH_EDEFAULT = null;
    /**
     * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getObjectId()
     */
    protected static final String OBJECT_ID_EDEFAULT = null;
    /**
     * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getUserId()
     */
    protected static final String USER_ID_EDEFAULT = null;
    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTimeStamp()
     */
    protected static final Date TIME_STAMP_EDEFAULT = null;
    /**
     * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getActive()
     */
    protected static final Boolean ACTIVE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getBtsUUID() <em>Bts UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBtsUUID()
     */
    protected static final String BTS_UUID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPath()
     */
    protected String path = PATH_EDEFAULT;
    /**
     * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getObjectId()
     */
    protected String objectId = OBJECT_ID_EDEFAULT;
    /**
     * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getUserId()
     */
    protected String userId = USER_ID_EDEFAULT;
    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTimeStamp()
     */
    protected Date timeStamp = TIME_STAMP_EDEFAULT;
    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getObject()
     */
    protected BTSDBBaseObject object;
    /**
     * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getActive()
     */
    protected Boolean active = ACTIVE_EDEFAULT;
    /**
     * The cached value of the '{@link #getBtsUUID() <em>Bts UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBtsUUID()
     */
    protected String btsUUID = BTS_UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generatedNot
     */
    public DBLeaseImpl() {
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
        return BtsmodelPackage.Literals.DB_LEASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setObjectId(String newObjectId) {
        String oldObjectId = objectId;
        objectId = newObjectId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__OBJECT_ID, oldObjectId, objectId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setUserId(String newUserId) {
        String oldUserId = userId;
        userId = newUserId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__USER_ID, oldUserId, userId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTimeStamp(Date newTimeStamp) {
        Date oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__TIME_STAMP, oldTimeStamp, timeStamp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BTSDBBaseObject getObject() {
        if (object != null && object.eIsProxy()) {
            InternalEObject oldObject = (InternalEObject) object;
            object = (BTSDBBaseObject) eResolveProxy(oldObject);
            if (object != oldObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtsmodelPackage.DB_LEASE__OBJECT, oldObject, object));
            }
        }
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setObject(BTSDBBaseObject newObject) {
        BTSDBBaseObject oldObject = object;
        object = newObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__OBJECT, oldObject, object));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BTSDBBaseObject basicGetObject() {
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setActive(Boolean newActive) {
        Boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getBtsUUID() {
        return btsUUID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setBtsUUID(String newBtsUUID) {
        String oldBtsUUID = btsUUID;
        btsUUID = newBtsUUID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.DB_LEASE__BTS_UUID, oldBtsUUID, btsUUID));
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
            case BtsmodelPackage.DB_LEASE__PATH:
                return getPath();
            case BtsmodelPackage.DB_LEASE__OBJECT_ID:
                return getObjectId();
            case BtsmodelPackage.DB_LEASE__USER_ID:
                return getUserId();
            case BtsmodelPackage.DB_LEASE__TIME_STAMP:
                return getTimeStamp();
            case BtsmodelPackage.DB_LEASE__OBJECT:
                if (resolve) return getObject();
                return basicGetObject();
            case BtsmodelPackage.DB_LEASE__ACTIVE:
                return getActive();
            case BtsmodelPackage.DB_LEASE__BTS_UUID:
                return getBtsUUID();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BtsmodelPackage.DB_LEASE__PATH:
                setPath((String) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__OBJECT_ID:
                setObjectId((String) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__USER_ID:
                setUserId((String) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__TIME_STAMP:
                setTimeStamp((Date) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__OBJECT:
                setObject((BTSDBBaseObject) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__ACTIVE:
                setActive((Boolean) newValue);
                return;
            case BtsmodelPackage.DB_LEASE__BTS_UUID:
                setBtsUUID((String) newValue);
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
            case BtsmodelPackage.DB_LEASE__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case BtsmodelPackage.DB_LEASE__OBJECT_ID:
                setObjectId(OBJECT_ID_EDEFAULT);
                return;
            case BtsmodelPackage.DB_LEASE__USER_ID:
                setUserId(USER_ID_EDEFAULT);
                return;
            case BtsmodelPackage.DB_LEASE__TIME_STAMP:
                setTimeStamp(TIME_STAMP_EDEFAULT);
                return;
            case BtsmodelPackage.DB_LEASE__OBJECT:
                setObject(null);
                return;
            case BtsmodelPackage.DB_LEASE__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case BtsmodelPackage.DB_LEASE__BTS_UUID:
                setBtsUUID(BTS_UUID_EDEFAULT);
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
            case BtsmodelPackage.DB_LEASE__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case BtsmodelPackage.DB_LEASE__OBJECT_ID:
                return OBJECT_ID_EDEFAULT == null ? objectId != null : !OBJECT_ID_EDEFAULT.equals(objectId);
            case BtsmodelPackage.DB_LEASE__USER_ID:
                return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
            case BtsmodelPackage.DB_LEASE__TIME_STAMP:
                return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
            case BtsmodelPackage.DB_LEASE__OBJECT:
                return object != null;
            case BtsmodelPackage.DB_LEASE__ACTIVE:
                return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
            case BtsmodelPackage.DB_LEASE__BTS_UUID:
                return BTS_UUID_EDEFAULT == null ? btsUUID != null : !BTS_UUID_EDEFAULT.equals(btsUUID);
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
        result.append(" (path: ");
        result.append(path);
        result.append(", objectId: ");
        result.append(objectId);
        result.append(", userId: ");
        result.append(userId);
        result.append(", timeStamp: ");
        result.append(timeStamp);
        result.append(", active: ");
        result.append(active);
        result.append(", btsUUID: ");
        result.append(btsUUID);
        result.append(')');
        return result.toString();
    }

} //DBLeaseImpl
