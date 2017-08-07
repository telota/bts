/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Punctuation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.EgyPunctuationType#getValue <em>Value</em>}</li>
 * <li>{@link CorpusDTDneu.EgyPunctuationType#getBtsCodes <em>Bts Codes</em>}</li>
 * <li>{@link CorpusDTDneu.EgyPunctuationType#getComment <em>Comment</em>}</li>
 * <li>{@link CorpusDTDneu.EgyPunctuationType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='EgyPunctuation_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyPunctuationType()
 */
public interface EgyPunctuationType extends EObject {
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyPunctuationType_Value()
     */
    String getValue();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyPunctuationType#getValue <em>Value</em>}' attribute.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyPunctuationType_BtsCodes()
     */
    String getBtsCodes();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyPunctuationType#getBtsCodes <em>Bts Codes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bts Codes</em>' attribute.
     * @generated
     * @see #getBtsCodes()
     */
    void setBtsCodes(String value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Comment</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
     * @generated
     * @see #setComment(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyPunctuationType_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyPunctuationType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType6}.
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
     * @see CorpusDTDneu.TypeType6
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType6)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyPunctuationType_Type()
     */
    TypeType6 getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyPunctuationType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType6
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType6 value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.EgyPunctuationType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType6)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.EgyPunctuationType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType6)
     */
    boolean isSetType();

} // EgyPunctuationType
