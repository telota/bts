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
 * A representation of the model object '<em><b>BTS Referencable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getComment <em>Comment</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParent <em>Parent</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId <em>Parent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @model abstract="true"
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSReferencableItem()
 */
public interface BTSReferencableItem extends BTSObject, BTSIdentifiableItem {
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
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSReferencableItem_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Parent</em>' reference.
     * @model transient="true"
     * @generated
     * @see #setParent(BTSObject)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSReferencableItem_Parent()
     */
    BTSObject getParent();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Parent</em>' reference.
     * @generated
     * @see #getParent()
     */
    void setParent(BTSObject value);

    /**
     * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Parent Id</em>' attribute.
     * @model
     * @generated
     * @see #setParentId(String)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSReferencableItem_ParentId()
     */
    String getParentId();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Parent Id</em>' attribute.
     * @generated
     * @see #getParentId()
     */
    void setParentId(String value);

} // BTSReferencableItem
