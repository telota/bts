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
package org.bbaw.bts.btsviewmodel.impl;

import java.util.Collection;
import java.util.Date;

import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.MessageType;
import org.bbaw.bts.btsviewmodel.StatusMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl#getMessage <em>Message</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl#getCreationTime <em>Creation Time</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl#getUserId <em>User Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl#getMessageType <em>Message Type</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusMessageImpl extends MinimalEObjectImpl.Container implements StatusMessage {
    /**
     * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMessage()
     */
    protected static final String MESSAGE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCreationTime()
     */
    protected static final Date CREATION_TIME_EDEFAULT = null;
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
     * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMessageType()
     */
    protected static final MessageType MESSAGE_TYPE_EDEFAULT = MessageType.INFORMATION;
    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMessage()
     */
    protected String message = MESSAGE_EDEFAULT;
    /**
     * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCreationTime()
     */
    protected Date creationTime = CREATION_TIME_EDEFAULT;
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
     * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMessageType()
     */
    protected MessageType messageType = MESSAGE_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getChildren()
     */
    protected EList<StatusMessage> children;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected StatusMessageImpl() {
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
        return BtsviewmodelPackage.Literals.STATUS_MESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getMessage() {
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setMessage(String newMessage) {
        String oldMessage = message;
        message = newMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE, oldMessage, message));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setCreationTime(Date newCreationTime) {
        Date oldCreationTime = creationTime;
        creationTime = newCreationTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME, oldCreationTime, creationTime));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.STATUS_MESSAGE__USER_ID, oldUserId, userId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setMessageType(MessageType newMessageType) {
        MessageType oldMessageType = messageType;
        messageType = newMessageType == null ? MESSAGE_TYPE_EDEFAULT : newMessageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE, oldMessageType, messageType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<StatusMessage> getChildren() {
        if (children == null) {
            children = new EObjectResolvingEList<>(StatusMessage.class, this, BtsviewmodelPackage.STATUS_MESSAGE__CHILDREN);
        }
        return children;
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
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE:
                return getMessage();
            case BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME:
                return getCreationTime();
            case BtsviewmodelPackage.STATUS_MESSAGE__USER_ID:
                return getUserId();
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE:
                return getMessageType();
            case BtsviewmodelPackage.STATUS_MESSAGE__CHILDREN:
                return getChildren();
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
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE:
                setMessage((String) newValue);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME:
                setCreationTime((Date) newValue);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__USER_ID:
                setUserId((String) newValue);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE:
                setMessageType((MessageType) newValue);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends StatusMessage>) newValue);
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
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE:
                setMessage(MESSAGE_EDEFAULT);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME:
                setCreationTime(CREATION_TIME_EDEFAULT);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__USER_ID:
                setUserId(USER_ID_EDEFAULT);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE:
                setMessageType(MESSAGE_TYPE_EDEFAULT);
                return;
            case BtsviewmodelPackage.STATUS_MESSAGE__CHILDREN:
                getChildren().clear();
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
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE:
                return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
            case BtsviewmodelPackage.STATUS_MESSAGE__CREATION_TIME:
                return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
            case BtsviewmodelPackage.STATUS_MESSAGE__USER_ID:
                return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
            case BtsviewmodelPackage.STATUS_MESSAGE__MESSAGE_TYPE:
                return messageType != MESSAGE_TYPE_EDEFAULT;
            case BtsviewmodelPackage.STATUS_MESSAGE__CHILDREN:
                return children != null && !children.isEmpty();
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
        result.append(" (message: ");
        result.append(message);
        result.append(", creationTime: ");
        result.append(creationTime);
        result.append(", userId: ");
        result.append(userId);
        result.append(", messageType: ");
        result.append(messageType);
        result.append(')');
        return result.toString();
    }

} //StatusMessageImpl
