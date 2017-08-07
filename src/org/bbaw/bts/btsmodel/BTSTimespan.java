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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Timespan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSTimespan#getFrom <em>From</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSTimespan#getTo <em>To</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.BTSTimespan#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTimespan()
 */
public interface BTSTimespan extends EObject {
    /**
     * Returns the value of the '<em><b>From</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>From</em>' containment reference.
     * @model containment="true"
     * @generated
     * @see #setFrom(BTSDate)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTimespan_From()
     */
    BTSDate getFrom();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSTimespan#getFrom <em>From</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>From</em>' containment reference.
     * @generated
     * @see #getFrom()
     */
    void setFrom(BTSDate value);

    /**
     * Returns the value of the '<em><b>To</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>To</em>' containment reference.
     * @model containment="true"
     * @generated
     * @see #setTo(BTSDate)
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTimespan_To()
     */
    BTSDate getTo();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSTimespan#getTo <em>To</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>To</em>' containment reference.
     * @generated
     * @see #getTo()
     */
    void setTo(BTSDate value);

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
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSTimespan_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSTimespan#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

} // BTSTimespan
