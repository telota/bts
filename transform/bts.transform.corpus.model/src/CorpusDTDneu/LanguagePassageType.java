/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.LanguagePassageType#getLanguage <em>Language</em>}</li>
 * <li>{@link CorpusDTDneu.LanguagePassageType#getPassageID <em>Passage ID</em>}</li>
 * <li>{@link CorpusDTDneu.LanguagePassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='LanguagePassage_._type' kind='empty'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getLanguagePassageType()
 */
public interface LanguagePassageType extends EObject {
    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Language</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='Language' namespace='##targetNamespace'"
     * @generated
     * @see #setLanguage(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLanguagePassageType_Language()
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LanguagePassageType#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Language</em>' attribute.
     * @generated
     * @see #getLanguage()
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Passage ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passage ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Passage ID</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     * extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
     * @generated
     * @see #setPassageID(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLanguagePassageType_PassageID()
     */
    String getPassageID();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LanguagePassageType#getPassageID <em>Passage ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Passage ID</em>' attribute.
     * @generated
     * @see #getPassageID()
     */
    void setPassageID(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Type</em>' attribute.
     * @model unsettable="true" required="true"
     * extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.TypeType1
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType1)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLanguagePassageType_Type()
     */
    TypeType1 getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LanguagePassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType1
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType1 value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.LanguagePassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType1)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.LanguagePassageType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType1)
     */
    boolean isSetType();

} // LanguagePassageType
