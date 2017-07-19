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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <!-- begin-model-doc -->
 * BTSRelation-objects describe relations between BTSObject-objects to objects that extend BTSIdentifiableItem.
 * <p>
 * <p>
 * <!-- end-model-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getParts <em>Parts</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation()
 */
public interface BTSRelation extends BTSIdentifiableItem {
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
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_ObjectId()
     */
    String getObjectId();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Object Id</em>' attribute.
     * @generated
     * @see #getObjectId()
     */
    void setObjectId(String value);

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
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Type()
     */
    String getType();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see #getType()
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Subtype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Subtype</em>' attribute.
     * @model
     * @generated
     * @see #setSubtype(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Subtype()
     */
    String getSubtype();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Subtype</em>' attribute.
     * @generated
     * @see #getSubtype()
     */
    void setSubtype(String value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Comment</em>' attribute.
     * @model
     * @generated
     * @see #setComment(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSInterTextReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The list parts holds references inside the related object.
     * <p>
     * E.g.: A relation references a text-object by referencing its id in objectId. Parts can
     * then contain references into the text-object itself, e.g. certain words.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Parts</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Parts()
     */
    EList<BTSInterTextReference> getParts();

    /**
     * Returns the value of the '<em><b>Certainty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Certainty</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Certainty</em>' attribute.
     * @model
     * @generated
     * @see #setCertainty(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSRelation_Certainty()
     */
    String getCertainty();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Certainty</em>' attribute.
     * @generated
     * @see #getCertainty()
     */
    void setCertainty(String value);

} // BTSRelation
