/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar <em>WChar</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getWordPart()
 */
public interface WordPart extends EObject {
    /**
     * Returns the value of the '<em><b>WChar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WChar</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WChar</em>' containment reference.
     * @model containment="true"
     * @generated
     * @see #setWChar(WordMiddle)
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getWordPart_WChar()
     */
    WordMiddle getWChar();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar <em>WChar</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>WChar</em>' containment reference.
     * @generated
     * @see #getWChar()
     */
    void setWChar(WordMiddle value);

} // WordPart
