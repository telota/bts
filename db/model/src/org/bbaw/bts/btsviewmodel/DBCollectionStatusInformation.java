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
package org.bbaw.bts.btsviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Collection Status Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbCollectionName <em>Db Collection Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocCount <em>Db Doc Count</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusToRemote <em>Sync Status To Remote</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusFromRemote <em>Sync Status From Remote</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexDocCount <em>Index Doc Count</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexStatus <em>Index Status</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDiskSize <em>Db Disk Size</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocDelCount <em>Db Doc Del Count</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbPurgeSeq <em>Db Purge Seq</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbUpdateSeq <em>Db Update Seq</em>}</li>
 * <li>{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexUpdateSeq <em>Index Update Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation()
 */
public interface DBCollectionStatusInformation extends EObject {
    /**
     * Returns the value of the '<em><b>Db Collection Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Collection Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Collection Name</em>' attribute.
     * @model
     * @generated
     * @see #setDbCollectionName(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbCollectionName()
     */
    String getDbCollectionName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbCollectionName <em>Db Collection Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Collection Name</em>' attribute.
     * @generated
     * @see #getDbCollectionName()
     */
    void setDbCollectionName(String value);

    /**
     * Returns the value of the '<em><b>Db Doc Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Doc Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Doc Count</em>' attribute.
     * @model
     * @generated
     * @see #setDbDocCount(long)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbDocCount()
     */
    long getDbDocCount();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocCount <em>Db Doc Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Doc Count</em>' attribute.
     * @generated
     * @see #getDbDocCount()
     */
    void setDbDocCount(long value);

    /**
     * Returns the value of the '<em><b>Sync Status To Remote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sync Status To Remote</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sync Status To Remote</em>' attribute.
     * @model
     * @generated
     * @see #setSyncStatusToRemote(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_SyncStatusToRemote()
     */
    String getSyncStatusToRemote();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusToRemote <em>Sync Status To Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sync Status To Remote</em>' attribute.
     * @generated
     * @see #getSyncStatusToRemote()
     */
    void setSyncStatusToRemote(String value);

    /**
     * Returns the value of the '<em><b>Sync Status From Remote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sync Status From Remote</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sync Status From Remote</em>' attribute.
     * @model
     * @generated
     * @see #setSyncStatusFromRemote(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_SyncStatusFromRemote()
     */
    String getSyncStatusFromRemote();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getSyncStatusFromRemote <em>Sync Status From Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sync Status From Remote</em>' attribute.
     * @generated
     * @see #getSyncStatusFromRemote()
     */
    void setSyncStatusFromRemote(String value);

    /**
     * Returns the value of the '<em><b>Index Doc Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Index Doc Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Index Doc Count</em>' attribute.
     * @model
     * @generated
     * @see #setIndexDocCount(long)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_IndexDocCount()
     */
    long getIndexDocCount();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexDocCount <em>Index Doc Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Index Doc Count</em>' attribute.
     * @generated
     * @see #getIndexDocCount()
     */
    void setIndexDocCount(long value);

    /**
     * Returns the value of the '<em><b>Index Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Index Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Index Status</em>' attribute.
     * @model
     * @generated
     * @see #setIndexStatus(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_IndexStatus()
     */
    String getIndexStatus();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexStatus <em>Index Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Index Status</em>' attribute.
     * @generated
     * @see #getIndexStatus()
     */
    void setIndexStatus(String value);

    /**
     * Returns the value of the '<em><b>Db Disk Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Disk Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Disk Size</em>' attribute.
     * @model
     * @generated
     * @see #setDbDiskSize(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbDiskSize()
     */
    String getDbDiskSize();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDiskSize <em>Db Disk Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Disk Size</em>' attribute.
     * @generated
     * @see #getDbDiskSize()
     */
    void setDbDiskSize(String value);

    /**
     * Returns the value of the '<em><b>Db Doc Del Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Doc Del Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Doc Del Count</em>' attribute.
     * @model
     * @generated
     * @see #setDbDocDelCount(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbDocDelCount()
     */
    String getDbDocDelCount();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbDocDelCount <em>Db Doc Del Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Doc Del Count</em>' attribute.
     * @generated
     * @see #getDbDocDelCount()
     */
    void setDbDocDelCount(String value);

    /**
     * Returns the value of the '<em><b>Db Purge Seq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Purge Seq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Purge Seq</em>' attribute.
     * @model
     * @generated
     * @see #setDbPurgeSeq(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbPurgeSeq()
     */
    String getDbPurgeSeq();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbPurgeSeq <em>Db Purge Seq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Purge Seq</em>' attribute.
     * @generated
     * @see #getDbPurgeSeq()
     */
    void setDbPurgeSeq(String value);

    /**
     * Returns the value of the '<em><b>Db Update Seq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Db Update Seq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Db Update Seq</em>' attribute.
     * @model
     * @generated
     * @see #setDbUpdateSeq(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_DbUpdateSeq()
     */
    String getDbUpdateSeq();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getDbUpdateSeq <em>Db Update Seq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Db Update Seq</em>' attribute.
     * @generated
     * @see #getDbUpdateSeq()
     */
    void setDbUpdateSeq(String value);

    /**
     * Returns the value of the '<em><b>Index Update Seq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Index Update Seq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Index Update Seq</em>' attribute.
     * @model
     * @generated
     * @see #setIndexUpdateSeq(String)
     * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#getDBCollectionStatusInformation_IndexUpdateSeq()
     */
    String getIndexUpdateSeq();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation#getIndexUpdateSeq <em>Index Update Seq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Index Update Seq</em>' attribute.
     * @generated
     * @see #getIndexUpdateSeq()
     */
    void setIndexUpdateSeq(String value);

} // DBCollectionStatusInformation
