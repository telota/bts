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

import org.bbaw.bts.btsmodel.BTSTranslations;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getTranslation <em>Translation</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWType <em>WType</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLType <em>LType</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLKey <em>LKey</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getFlexCode <em>Flex Code</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWChar <em>WChar</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getValue <em>Value</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getGraphics <em>Graphics</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord()
 */
public interface BTSWord extends BTSAmbivalenceItem, BTSSentenceItem {
    /**
     * Returns the value of the '<em><b>Translation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Translation</em>' containment reference.
     * @model containment="true"
     * @generated
     * @see #setTranslation(BTSTranslations)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_Translation()
     */
    BTSTranslations getTranslation();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getTranslation <em>Translation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Translation</em>' containment reference.
     * @generated
     * @see #getTranslation()
     */
    void setTranslation(BTSTranslations value);

    /**
     * Returns the value of the '<em><b>WType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WType</em>' attribute.
     * @model
     * @generated
     * @see #setWType(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_WType()
     */
    String getWType();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWType <em>WType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>WType</em>' attribute.
     * @generated
     * @see #getWType()
     */
    void setWType(String value);

    /**
     * Returns the value of the '<em><b>LType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>LType</em>' attribute.
     * @model
     * @generated
     * @see #setLType(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_LType()
     */
    String getLType();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLType <em>LType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>LType</em>' attribute.
     * @generated
     * @see #getLType()
     */
    void setLType(String value);

    /**
     * Returns the value of the '<em><b>LKey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LKey</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>LKey</em>' attribute.
     * @model
     * @generated
     * @see #setLKey(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_LKey()
     */
    String getLKey();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLKey <em>LKey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>LKey</em>' attribute.
     * @generated
     * @see #getLKey()
     */
    void setLKey(String value);

    /**
     * Returns the value of the '<em><b>Flex Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flex Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Flex Code</em>' attribute.
     * @model
     * @generated
     * @see #setFlexCode(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_FlexCode()
     */
    String getFlexCode();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getFlexCode <em>Flex Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Flex Code</em>' attribute.
     * @generated
     * @see #getFlexCode()
     */
    void setFlexCode(String value);

    /**
     * Returns the value of the '<em><b>WChar</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WChar</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WChar</em>' attribute.
     * @model
     * @generated
     * @see #setWChar(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_WChar()
     */
    String getWChar();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWChar <em>WChar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>WChar</em>' attribute.
     * @generated
     * @see #getWChar()
     */
    void setWChar(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Value</em>' attribute.
     * @model
     * @generated
     * @see #setValue(String)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_Value()
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Value</em>' attribute.
     * @generated
     * @see #getValue()
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Graphics</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Graphics</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Graphics</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSWord_Graphics()
     */
    EList<BTSGraphic> getGraphics();

    /**
     * @return
     * @generatedNOT
     */
    String getGraficsAsMdC();

} // BTSWord
