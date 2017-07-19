/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restoration Over Rasur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar <em>WChar</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getRestorationOverRasur()
 */
public interface RestorationOverRasur extends Brackets, NoCartouche, NoDisputableReading, NoDeletion {
    /**
     * Returns the value of the '<em><b>WChar</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WChar</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WChar</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getRestorationOverRasur_WChar()
     */
    EList<NoRestorationOverRasur> getWChar();

} // RestorationOverRasur
