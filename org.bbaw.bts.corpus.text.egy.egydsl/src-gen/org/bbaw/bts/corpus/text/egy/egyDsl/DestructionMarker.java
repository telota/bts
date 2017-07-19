/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destruction Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType <em>Type</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getDestructionMarker()
 */
public interface DestructionMarker extends AbstractMarker {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Type</em>' attribute.
     * @model
     * @generated
     * @see #setType(String)
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage#getDestructionMarker_Type()
     */
    String getType();

    /**
     * Sets the value of the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see #getType()
     */
    void setType(String value);

} // DestructionMarker
