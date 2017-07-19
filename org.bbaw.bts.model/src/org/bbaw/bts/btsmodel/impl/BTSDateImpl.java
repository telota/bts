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

import org.bbaw.bts.btsmodel.BTSDate;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl#getType <em>Type</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl#getYear <em>Year</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl#getMonth <em>Month</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl#getDay <em>Day</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl#getRelativeRef <em>Relative Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSDateImpl extends MinimalEObjectImpl.Container implements BTSDate {
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
     * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getYear()
     */
    protected static final int YEAR_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMonth()
     */
    protected static final int MONTH_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDay()
     */
    protected static final int DAY_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getRelativeRef() <em>Relative Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRelativeRef()
     */
    protected static final String RELATIVE_REF_EDEFAULT = null;
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
     * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getYear()
     */
    protected int year = YEAR_EDEFAULT;
    /**
     * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMonth()
     */
    protected int month = MONTH_EDEFAULT;
    /**
     * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDay()
     */
    protected int day = DAY_EDEFAULT;
    /**
     * The cached value of the '{@link #getRelativeRef() <em>Relative Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRelativeRef()
     */
    protected String relativeRef = RELATIVE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BTSDateImpl() {
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
        return BtsmodelPackage.Literals.BTS_DATE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_DATE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getYear() {
        return year;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setYear(int newYear) {
        int oldYear = year;
        year = newYear;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_DATE__YEAR, oldYear, year));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getMonth() {
        return month;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setMonth(int newMonth) {
        int oldMonth = month;
        month = newMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_DATE__MONTH, oldMonth, month));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getDay() {
        return day;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setDay(int newDay) {
        int oldDay = day;
        day = newDay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_DATE__DAY, oldDay, day));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getRelativeRef() {
        return relativeRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setRelativeRef(String newRelativeRef) {
        String oldRelativeRef = relativeRef;
        relativeRef = newRelativeRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_DATE__RELATIVE_REF, oldRelativeRef, relativeRef));
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
            case BtsmodelPackage.BTS_DATE__TYPE:
                return getType();
            case BtsmodelPackage.BTS_DATE__YEAR:
                return getYear();
            case BtsmodelPackage.BTS_DATE__MONTH:
                return getMonth();
            case BtsmodelPackage.BTS_DATE__DAY:
                return getDay();
            case BtsmodelPackage.BTS_DATE__RELATIVE_REF:
                return getRelativeRef();
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
            case BtsmodelPackage.BTS_DATE__TYPE:
                setType((String) newValue);
                return;
            case BtsmodelPackage.BTS_DATE__YEAR:
                setYear((Integer) newValue);
                return;
            case BtsmodelPackage.BTS_DATE__MONTH:
                setMonth((Integer) newValue);
                return;
            case BtsmodelPackage.BTS_DATE__DAY:
                setDay((Integer) newValue);
                return;
            case BtsmodelPackage.BTS_DATE__RELATIVE_REF:
                setRelativeRef((String) newValue);
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
            case BtsmodelPackage.BTS_DATE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_DATE__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_DATE__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_DATE__DAY:
                setDay(DAY_EDEFAULT);
                return;
            case BtsmodelPackage.BTS_DATE__RELATIVE_REF:
                setRelativeRef(RELATIVE_REF_EDEFAULT);
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
            case BtsmodelPackage.BTS_DATE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case BtsmodelPackage.BTS_DATE__YEAR:
                return year != YEAR_EDEFAULT;
            case BtsmodelPackage.BTS_DATE__MONTH:
                return month != MONTH_EDEFAULT;
            case BtsmodelPackage.BTS_DATE__DAY:
                return day != DAY_EDEFAULT;
            case BtsmodelPackage.BTS_DATE__RELATIVE_REF:
                return RELATIVE_REF_EDEFAULT == null ? relativeRef != null : !RELATIVE_REF_EDEFAULT.equals(relativeRef);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", year: ");
        result.append(year);
        result.append(", month: ");
        result.append(month);
        result.append(", day: ");
        result.append(day);
        result.append(", relativeRef: ");
        result.append(relativeRef);
        result.append(')');
        return result.toString();
    }

} //BTSDateImpl
