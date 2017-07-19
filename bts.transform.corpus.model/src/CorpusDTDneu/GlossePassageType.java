/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glosse Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.GlossePassageType#getPassageID <em>Passage ID</em>}</li>
 * <li>{@link CorpusDTDneu.GlossePassageType#getScript <em>Script</em>}</li>
 * <li>{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='GlossePassage_._type' kind='empty'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType()
 */
public interface GlossePassageType extends EObject {
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_PassageID()
     */
    String getPassageID();

    /**
     * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getPassageID <em>Passage ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Passage ID</em>' attribute.
     * @generated
     * @see #getPassageID()
     */
    void setPassageID(String value);

    /**
     * Returns the value of the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Script</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='Script' namespace='##targetNamespace'"
     * @generated
     * @see #setScript(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_Script()
     */
    Object getScript();

    /**
     * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getScript <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Script</em>' attribute.
     * @generated
     * @see #getScript()
     */
    void setScript(Object value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType3}.
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
     * @see CorpusDTDneu.TypeType3
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType3)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getGlossePassageType_Type()
     */
    TypeType3 getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType3
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType3 value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType3)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.GlossePassageType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType3)
     */
    boolean isSetType();

} // GlossePassageType
