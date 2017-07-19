/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName <em>Name</em>}</li>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getCase()
 */
public interface Case extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @model
     * @generated
     * @see #setName(String)
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getCase_Name()
     */
    String getName();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Name</em>' attribute.
     * @generated
     * @see #getName()
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Items</em>' containment reference list.
     * @model containment="true"
     * @generated
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getCase_Items()
     */
    EList<SentenceItemNoAmbivalence> getItems();

} // Case
