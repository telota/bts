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
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Corpus Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getAuthorName <em>Author Name</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectId <em>Project Id</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusHeader()
 */
public interface BTSCorpusHeader extends EObject {
    /**
     * Returns the value of the '<em><b>Author Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Author Name</em>' attribute.
     * @model
     * @generated
     * @see #setAuthorName(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusHeader_AuthorName()
     */
    String getAuthorName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getAuthorName <em>Author Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Author Name</em>' attribute.
     * @generated
     * @see #getAuthorName()
     */
    void setAuthorName(String value);

    /**
     * Returns the value of the '<em><b>Project Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Project Id</em>' attribute.
     * @model
     * @generated
     * @see #setProjectId(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusHeader_ProjectId()
     */
    String getProjectId();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectId <em>Project Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Project Id</em>' attribute.
     * @generated
     * @see #getProjectId()
     */
    void setProjectId(String value);

    /**
     * Returns the value of the '<em><b>Project Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Project Name</em>' attribute.
     * @model
     * @generated
     * @see #setProjectName(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSCorpusHeader_ProjectName()
     */
    String getProjectName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectName <em>Project Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Project Name</em>' attribute.
     * @generated
     * @see #getProjectName()
     */
    void setProjectName(String value);

} // BTSCorpusHeader
