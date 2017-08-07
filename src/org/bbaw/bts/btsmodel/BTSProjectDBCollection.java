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

import java.util.Map;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Project DB Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName <em>Collection Name</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed <em>Indexed</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized <em>Synchronized</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getRoleDescriptions <em>Role Descriptions</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getPropertyStrings <em>Property Strings</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties <em>Properties</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty <em>Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection()
 */
public interface BTSProjectDBCollection extends BTSIdentifiableItem {
    /**
     * Returns the value of the '<em><b>Collection Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collection Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Collection Name</em>' attribute.
     * @model
     * @generated
     * @see #setCollectionName(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_CollectionName()
     */
    String getCollectionName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getCollectionName <em>Collection Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Collection Name</em>' attribute.
     * @generated
     * @see #getCollectionName()
     */
    void setCollectionName(String value);

    /**
     * Returns the value of the '<em><b>Indexed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indexed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Indexed</em>' attribute.
     * @model
     * @generated
     * @see #setIndexed(boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Indexed()
     */
    boolean isIndexed();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isIndexed <em>Indexed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Indexed</em>' attribute.
     * @generated
     * @see #isIndexed()
     */
    void setIndexed(boolean value);

    /**
     * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Synchronized</em>' attribute.
     * @model
     * @generated
     * @see #setSynchronized(boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Synchronized()
     */
    boolean isSynchronized();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isSynchronized <em>Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Synchronized</em>' attribute.
     * @generated
     * @see #isSynchronized()
     */
    void setSynchronized(boolean value);

    /**
     * Returns the value of the '<em><b>Role Descriptions</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Descriptions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Role Descriptions</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_RoleDescriptions()
     */
    EList<BTSDBCollectionRoleDesc> getRoleDescriptions();

    /**
     * Returns the value of the '<em><b>Property Strings</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Strings</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Property Strings</em>' attribute list.
     * @model
     * @generated
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_PropertyStrings()
     */
    EList<String> getPropertyStrings();


    /**
     * Returns the value of the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Properties</em>' attribute.
     * @model transient="true"
     * @generated
     * @see #setProperties(Map)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Properties()
     */
    Map<String, String> getProperties();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#getProperties <em>Properties</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Properties</em>' attribute.
     * @generated
     * @see #getProperties()
     */
    void setProperties(Map<String, String> value);

    /**
     * Returns the value of the '<em><b>Dirty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dirty</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dirty</em>' attribute.
     * @model transient="true"
     * @generated
     * @see #setDirty(boolean)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSProjectDBCollection_Dirty()
     */
    boolean isDirty();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection#isDirty <em>Dirty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Dirty</em>' attribute.
     * @generated
     * @see #isDirty()
     */
    void setDirty(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     */
    void setProperty(String key, String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     */
    String getProperty(String key);

} // BTSProjectDBCollection
