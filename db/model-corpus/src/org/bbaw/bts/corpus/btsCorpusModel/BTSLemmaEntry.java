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
 * A representation of the model object '<em><b>BTS Lemma Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore <em>Ignore</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getWords <em>Words</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry()
 */
public interface BTSLemmaEntry extends BTSCorpusObject {
    /**
     * Returns the value of the '<em><b>Ignore</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ignore</em>' attribute.
     * @model
     * @generated
     * @see #setIgnore(boolean)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Ignore()
     */
    boolean isIgnore();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore <em>Ignore</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ignore</em>' attribute.
     * @generated
     * @see #isIgnore()
     */
    void setIgnore(boolean value);

    /**
     * Returns the value of the '<em><b>Words</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Words</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Words()
     */
    EList<BTSWord> getWords();

    /**
     * Returns the value of the '<em><b>Translations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Translations</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Translations</em>' containment reference.
     * @model containment="true"
     * @generated
     * @see #setTranslations(BTSTranslations)
     * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSLemmaEntry_Translations()
     */
    BTSTranslations getTranslations();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations <em>Translations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Translations</em>' containment reference.
     * @generated
     * @see #getTranslations()
     */
    void setTranslations(BTSTranslations value);

} // BTSLemmaEntry
