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

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getObjectId <em>Object Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getType <em>Type</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getSubtype <em>Subtype</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getComment <em>Comment</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getParts <em>Parts</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl#getCertainty <em>Certainty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSRelationImpl extends BTSIdentifiableItemImpl implements BTSRelation {
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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getType()
     */
    protected static final String TYPE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSubtype()
     */
    protected static final String SUBTYPE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getComment()
     */
    protected static final String COMMENT_EDEFAULT = null;
    /**
     * The default value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCertainty()
     */
    protected static final String CERTAINTY_EDEFAULT = null;
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
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getType()
     */
    protected String type = TYPE_EDEFAULT;
    /**
     * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSubtype()
     */
    protected String subtype = SUBTYPE_EDEFAULT;
    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getComment()
     */
    protected String comment = COMMENT_EDEFAULT;
    /**
     * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getParts()
     */
    protected EList<BTSInterTextReference> parts;
    /**
     * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCertainty()
     */
    protected String certainty = CERTAINTY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BTSRelationImpl() {
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
        return BtsmodelPackage.Literals.BTS_RELATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_RELATION__OBJECT_ID, oldObjectId, objectId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_RELATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setSubtype(String newSubtype) {
        String oldSubtype = subtype;
        subtype = newSubtype;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_RELATION__SUBTYPE, oldSubtype, subtype));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_RELATION__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<BTSInterTextReference> getParts() {
        if (parts == null) {
            parts = new EObjectContainmentEList<>(BTSInterTextReference.class, this, BtsmodelPackage.BTS_RELATION__PARTS);
        }
        return parts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getCertainty() {
        return certainty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setCertainty(String newCertainty) {
        String oldCertainty = certainty;
        certainty = newCertainty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_RELATION__CERTAINTY, oldCertainty, certainty));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BtsmodelPackage.BTS_RELATION__PARTS:
                return ((InternalEList<?>) getParts()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case BtsmodelPackage.BTS_RELATION__OBJECT_ID:
                return getObjectId();
            case BtsmodelPackage.BTS_RELATION__TYPE:
                return getType();
            case BtsmodelPackage.BTS_RELATION__SUBTYPE:
                return getSubtype();
            case BtsmodelPackage.BTS_RELATION__COMMENT:
                return getComment();
            case BtsmodelPackage.BTS_RELATION__PARTS:
                return getParts();
            case BtsmodelPackage.BTS_RELATION__CERTAINTY:
                return getCertainty();
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
            case BtsmodelPackage.BTS_RELATION__OBJECT_ID:
                setObjectId((String) newValue);
                return;
            case BtsmodelPackage.BTS_RELATION__TYPE:
                setType((String) newValue);
                return;
            case BtsmodelPackage.BTS_RELATION__SUBTYPE:
                setSubtype((String) newValue);
                return;
            case BtsmodelPackage.BTS_RELATION__COMMENT:
                setComment((String) newValue);
                return;
            case BtsmodelPackage.BTS_RELATION__PARTS:
                getParts().clear();
                getParts().addAll((Collection<? extends BTSInterTextReference>) newValue);
                return;
            case BtsmodelPackage.BTS_RELATION__CERTAINTY:
                setCertainty((String) newValue);
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
            case BtsmodelPackage.BTS_RELATION__OBJECT_ID:
                setObjectId(OBJECT_ID_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_RELATION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_RELATION__SUBTYPE:
                setSubtype(SUBTYPE_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_RELATION__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_RELATION__PARTS:
                getParts().clear();
                return;
            case BtsmodelPackage.BTS_RELATION__CERTAINTY:
                setCertainty(CERTAINTY_EDEFAULT);
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
            case BtsmodelPackage.BTS_RELATION__OBJECT_ID:
                return OBJECT_ID_EDEFAULT == null ? objectId != null : !OBJECT_ID_EDEFAULT.equals(objectId);
            case BtsmodelPackage.BTS_RELATION__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case BtsmodelPackage.BTS_RELATION__SUBTYPE:
                return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
            case BtsmodelPackage.BTS_RELATION__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case BtsmodelPackage.BTS_RELATION__PARTS:
                return parts != null && !parts.isEmpty();
            case BtsmodelPackage.BTS_RELATION__CERTAINTY:
                return CERTAINTY_EDEFAULT == null ? certainty != null : !CERTAINTY_EDEFAULT.equals(certainty);
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (objectId: ");
        result.append(objectId);
        result.append(", type: ");
        result.append(type);
        result.append(", subtype: ");
        result.append(subtype);
        result.append(", comment: ");
        result.append(comment);
        result.append(", certainty: ");
        result.append(certainty);
        result.append(')');
        return result.toString();
    }

} //BTSRelationImpl
