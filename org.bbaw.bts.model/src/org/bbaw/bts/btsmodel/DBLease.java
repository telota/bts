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
package org.bbaw.bts.btsmodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Lease</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <!-- begin-model-doc -->
 * DBLease used to implement locking of objects. Locks are leases with timestamp.
 * <p>
 * <!-- end-model-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getPath <em>Path</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getObjectId <em>Object Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getUserId <em>User Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getTimeStamp <em>Time Stamp</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getObject <em>Object</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getActive <em>Active</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.DBLease#getBtsUUID <em>Bts UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease()
 */
public interface DBLease extends BTSDBBaseObject {
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Path</em>' attribute.
     * @model
     * @generated
     * @see #setPath(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Path()
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Path</em>' attribute.
     * @generated
     * @see #getPath()
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>Object Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Object Id</em>' attribute.
     * @model
     * @generated
     * @see #setObjectId(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_ObjectId()
     */
    String getObjectId();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getObjectId <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Object Id</em>' attribute.
     * @generated
     * @see #getObjectId()
     */
    void setObjectId(String value);

    /**
     * Returns the value of the '<em><b>User Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>User Id</em>' attribute.
     * @model
     * @generated
     * @see #setUserId(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_UserId()
     */
    String getUserId();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getUserId <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>User Id</em>' attribute.
     * @generated
     * @see #getUserId()
     */
    void setUserId(String value);

    /**
     * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Time Stamp</em>' attribute.
     * @model
     * @generated
     * @see #setTimeStamp(Date)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_TimeStamp()
     */
    Date getTimeStamp();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Time Stamp</em>' attribute.
     * @generated
     * @see #getTimeStamp()
     */
    void setTimeStamp(Date value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Object</em>' reference.
     * @model transient="true"
     * @generated
     * @see #setObject(BTSDBBaseObject)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Object()
     */
    BTSDBBaseObject getObject();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Object</em>' reference.
     * @generated
     * @see #getObject()
     */
    void setObject(BTSDBBaseObject value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Active</em>' attribute.
     * @model
     * @generated
     * @see #setActive(Boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Active()
     */
    Boolean getActive();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Active</em>' attribute.
     * @generated
     * @see #getActive()
     */
    void setActive(Boolean value);

    /**
     * Returns the value of the '<em><b>Bts UUID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bts UUID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bts UUID</em>' attribute.
     * @model
     * @generated
     * @see #setBtsUUID(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_BtsUUID()
     */
    String getBtsUUID();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getBtsUUID <em>Bts UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bts UUID</em>' attribute.
     * @generated
     * @see #getBtsUUID()
     */
    void setBtsUUID(String value);

} // DBLease
