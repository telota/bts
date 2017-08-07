/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formatting Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.FormattingElementType#getValue <em>Value</em>}</li>
 * <li>{@link CorpusDTDneu.FormattingElementType#getBtsCodes <em>Bts Codes</em>}</li>
 * <li>{@link CorpusDTDneu.FormattingElementType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='FormattingElement_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getFormattingElementType()
 */
public interface FormattingElementType extends EObject {
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
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     * extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
     * @generated
     * @see #setValue(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getFormattingElementType_Value()
     */
    String getValue();

    /**
     * Sets the value of the '{@link CorpusDTDneu.FormattingElementType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Value</em>' attribute.
     * @generated
     * @see #getValue()
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bts Codes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bts Codes</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
     * @generated
     * @see #setBtsCodes(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getFormattingElementType_BtsCodes()
     */
    String getBtsCodes();

    /**
     * Sets the value of the '{@link CorpusDTDneu.FormattingElementType#getBtsCodes <em>Bts Codes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bts Codes</em>' attribute.
     * @generated
     * @see #getBtsCodes()
     */
    void setBtsCodes(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Type</em>' attribute.
     * @model unsettable="true"
     * extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getFormattingElementType_Type()
     */
    TypeType getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.FormattingElementType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.FormattingElementType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.FormattingElementType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType)
     */
    boolean isSetType();

} // FormattingElementType
