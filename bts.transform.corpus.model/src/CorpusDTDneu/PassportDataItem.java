/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passport Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.PassportDataItem#getPassportDataItem <em>Passport Data Item</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='PassportDataItem' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItem()
 */
public interface PassportDataItem extends EObject {
    /**
     * Returns the value of the '<em><b>Passport Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passport Data Item</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Passport Data Item</em>' containment reference.
     * @model containment="true" required="true"
     * extendedMetaData="kind='element' name='PassportDataItem' namespace='##targetNamespace'"
     * @generated
     * @see #setPassportDataItem(PassportDataItemType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getPassportDataItem_PassportDataItem()
     */
    PassportDataItemType getPassportDataItem();

    /**
     * Sets the value of the '{@link CorpusDTDneu.PassportDataItem#getPassportDataItem <em>Passport Data Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Passport Data Item</em>' containment reference.
     * @generated
     * @see #getPassportDataItem()
     */
    void setPassportDataItem(PassportDataItemType value);

} // PassportDataItem
