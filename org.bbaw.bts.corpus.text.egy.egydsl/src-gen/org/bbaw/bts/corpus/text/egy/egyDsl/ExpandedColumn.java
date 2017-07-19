/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expanded Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar <em>WChar</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getExpandedColumn()
 */
public interface ExpandedColumn extends Brackets, NoCartouche, NoDisputableReading {
    /**
     * Returns the value of the '<em><b>WChar</b></em>' containment reference list.
     * The list contents are of type {@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn}.
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
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getExpandedColumn_WChar()
     */
    EList<NoExpandedColumn> getWChar();

} // ExpandedColumn
