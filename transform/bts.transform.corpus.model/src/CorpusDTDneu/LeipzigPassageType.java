/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leipzig Passage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.LeipzigPassageType#getAuszeichnung <em>Auszeichnung</em>}</li>
 * <li>{@link CorpusDTDneu.LeipzigPassageType#getPassageID <em>Passage ID</em>}</li>
 * <li>{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='LeipzigPassage_._type' kind='empty'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType()
 */
public interface LeipzigPassageType extends EObject {
    /**
     * Returns the value of the '<em><b>Auszeichnung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auszeichnung</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Auszeichnung</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='Auszeichnung' namespace='##targetNamespace'"
     * @generated
     * @see #setAuszeichnung(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_Auszeichnung()
     */
    Object getAuszeichnung();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getAuszeichnung <em>Auszeichnung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Auszeichnung</em>' attribute.
     * @generated
     * @see #getAuszeichnung()
     */
    void setAuszeichnung(Object value);

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
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='PassageID' namespace='##targetNamespace'"
     * @generated
     * @see #setPassageID(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_PassageID()
     */
    String getPassageID();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getPassageID <em>Passage ID</em>}' attribute.
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
     * The literals are from the enumeration {@link CorpusDTDneu.TypeType2}.
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
     * @see CorpusDTDneu.TypeType2
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeType2)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLeipzigPassageType_Type()
     */
    TypeType2 getType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Type</em>' attribute.
     * @generated
     * @see CorpusDTDneu.TypeType2
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     */
    void setType(TypeType2 value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeType2)
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.LeipzigPassageType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @generated
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeType2)
     */
    boolean isSetType();

} // LeipzigPassageType
