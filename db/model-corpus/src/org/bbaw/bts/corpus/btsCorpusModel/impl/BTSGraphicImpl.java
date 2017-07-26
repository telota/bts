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
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import org.bbaw.bts.btsmodel.impl.BTSIdentifiableItemImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Graphic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl#getInnerSentenceOrder <em>Inner Sentence Order</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl#getCode <em>Code</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl#getReference <em>Reference</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl#isIgnored <em>Ignored</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSGraphicImpl extends BTSIdentifiableItemImpl implements BTSGraphic {
    /**
     * The default value of the '{@link #getInnerSentenceOrder() <em>Inner Sentence Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getInnerSentenceOrder()
     */
    protected static final int INNER_SENTENCE_ORDER_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCode()
     */
    protected static final String CODE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getReference()
     */
    protected static final String REFERENCE_EDEFAULT = null;
    /**
     * The default value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #isIgnored()
     */
    protected static final boolean IGNORED_EDEFAULT = false;
    /**
     * The cached value of the '{@link #getInnerSentenceOrder() <em>Inner Sentence Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getInnerSentenceOrder()
     */
    protected int innerSentenceOrder = INNER_SENTENCE_ORDER_EDEFAULT;
    /**
     * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCode()
     */
    protected String code = CODE_EDEFAULT;
    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getReference()
     */
    protected String reference = REFERENCE_EDEFAULT;
    /**
     * The cached value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #isIgnored()
     */
    protected boolean ignored = IGNORED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BTSGraphicImpl() {
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
        return BtsCorpusModelPackage.Literals.BTS_GRAPHIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getInnerSentenceOrder() {
        return innerSentenceOrder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setInnerSentenceOrder(int newInnerSentenceOrder) {
        int oldInnerSentenceOrder = innerSentenceOrder;
        innerSentenceOrder = newInnerSentenceOrder;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_GRAPHIC__INNER_SENTENCE_ORDER, oldInnerSentenceOrder, innerSentenceOrder));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getCode() {
        return code;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setCode(String newCode) {
        String oldCode = code;
        code = newCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_GRAPHIC__CODE, oldCode, code));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setReference(String newReference) {
        String oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_GRAPHIC__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean isIgnored() {
        return ignored;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setIgnored(boolean newIgnored) {
        boolean oldIgnored = ignored;
        ignored = newIgnored;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED, oldIgnored, ignored));
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
            case BtsCorpusModelPackage.BTS_GRAPHIC__INNER_SENTENCE_ORDER:
                return getInnerSentenceOrder();
            case BtsCorpusModelPackage.BTS_GRAPHIC__CODE:
                return getCode();
            case BtsCorpusModelPackage.BTS_GRAPHIC__REFERENCE:
                return getReference();
            case BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED:
                return isIgnored();
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
            case BtsCorpusModelPackage.BTS_GRAPHIC__INNER_SENTENCE_ORDER:
                setInnerSentenceOrder((Integer) newValue);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__CODE:
                setCode((String) newValue);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__REFERENCE:
                setReference((String) newValue);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED:
                setIgnored((Boolean) newValue);
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
            case BtsCorpusModelPackage.BTS_GRAPHIC__INNER_SENTENCE_ORDER:
                setInnerSentenceOrder(INNER_SENTENCE_ORDER_EDEFAULT);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__CODE:
                setCode(CODE_EDEFAULT);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__REFERENCE:
                setReference(REFERENCE_EDEFAULT);
                return;
            case BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED:
                setIgnored(IGNORED_EDEFAULT);
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
            case BtsCorpusModelPackage.BTS_GRAPHIC__INNER_SENTENCE_ORDER:
                return innerSentenceOrder != INNER_SENTENCE_ORDER_EDEFAULT;
            case BtsCorpusModelPackage.BTS_GRAPHIC__CODE:
                return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
            case BtsCorpusModelPackage.BTS_GRAPHIC__REFERENCE:
                return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
            case BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED:
                return ignored != IGNORED_EDEFAULT;
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
        result.append(" (innerSentenceOrder: ");
        result.append(innerSentenceOrder);
        result.append(", code: ");
        result.append(code);
        result.append(", reference: ");
        result.append(reference);
        result.append(", ignored: ");
        result.append(ignored);
        result.append(')');
        return result.toString();
    }

} //BTSGraphicImpl
