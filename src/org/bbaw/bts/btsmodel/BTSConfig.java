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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <!-- begin-model-doc -->
 * superclass of configuration treenodes.
 * <!-- end-model-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.BTSConfig#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @model abstract="true"
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfig()
 */
public interface BTSConfig extends EObject {
    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSConfig}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Children</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSConfig_Children()
     */
    EList<BTSConfig> getChildren();

} // BTSConfig
