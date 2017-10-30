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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <!-- begin-model-doc -->
 * BTSExternalRefernce-objects are used to describe references of BTSObjects
 * to external identification systems e.g. authority files, repositories etc.
 * <!-- end-model-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSExternalReference#getReference <em>Reference</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSExternalReference#getProvider <em>Provider</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSExternalReference#getType <em>Type</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSExternalReference#getQuality <em>Quality</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSExternalReference()
 */
public interface BTSExternalReference extends BTSIdentifiableItem {
    /**
     * Returns the value of the '<em><b>Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reference</em>' attribute.
     * @model
     * @generated
     * @see #setReference(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSExternalReference_Reference()
     */
    String getReference();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getReference <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Reference</em>' attribute.
     * @generated
     * @see #getReference()
     */
    void setReference(String value);

    /**
     * Returns the value of the '<em><b>Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Provider</em>' attribute.
     * @model
     * @generated
     * @see #setProvider(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSExternalReference_Provider()
     */
    String getProvider();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @generated
     * @see #getProvider()
     */
    void setProvider(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Type</em>' attribute.
     * @model
     * @generated
     * @see #setType(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSExternalReference_Type()
     */
    String getType();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see #getType()
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Quality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Quality</em>' attribute.
     * @model
     * @generated
     * @see #setQuality(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSExternalReference_Quality()
     */
    String getQuality();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getQuality <em>Quality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Quality</em>' attribute.
     * @generated
     * @see #getQuality()
     */
    void setQuality(String value);

} // BTSExternalReference