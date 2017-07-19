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
 *
 * <!-- begin-model-doc -->
 * DBLease used to implement locking of objects. Locks are leases with timestamp.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getPath <em>Path</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getObject <em>Object</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getActive <em>Active</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.DBLease#getBtsUUID <em>Bts UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease()
 * @model
 * @generated
 */
public interface DBLease extends BTSDBBaseObject
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
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
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_ObjectId()
	 * @model
	 * @generated
	 */
	String getObjectId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
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
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
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
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
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
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(BTSDBBaseObject)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Object()
	 * @model transient="true"
	 * @generated
	 */
	BTSDBBaseObject getObject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
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
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_Active()
	 * @model
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
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
	 * @return the value of the '<em>Bts UUID</em>' attribute.
	 * @see #setBtsUUID(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getDBLease_BtsUUID()
	 * @model
	 * @generated
	 */
	String getBtsUUID();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.DBLease#getBtsUUID <em>Bts UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bts UUID</em>' attribute.
	 * @see #getBtsUUID()
	 * @generated
	 */
	void setBtsUUID(String value);

} // DBLease
