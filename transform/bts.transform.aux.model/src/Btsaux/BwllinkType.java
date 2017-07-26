/*
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bwllink Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.BwllinkType#getLclass <em>Lclass</em>}</li>
 * <li>{@link Btsaux.BwllinkType#getLcomment <em>Lcomment</em>}</li>
 * <li>{@link Btsaux.BwllinkType#getLkey <em>Lkey</em>}</li>
 * <li>{@link Btsaux.BwllinkType#getLtype <em>Ltype</em>}</li>
 * <li>{@link Btsaux.BwllinkType#getWcn <em>Wcn</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='bwllink_._type' kind='empty'"
 * @generated
 * @see Btsaux.BtsauxPackage#getBwllinkType()
 */
public interface BwllinkType extends EObject {
    /**
     * Returns the value of the '<em><b>Lclass</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lclass</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lclass</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='lclass' namespace='##targetNamespace'"
     * @generated
     * @see #setLclass(Object)
     * @see Btsaux.BtsauxPackage#getBwllinkType_Lclass()
     */
    Object getLclass();

    /**
     * Sets the value of the '{@link Btsaux.BwllinkType#getLclass <em>Lclass</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lclass</em>' attribute.
     * @generated
     * @see #getLclass()
     */
    void setLclass(Object value);

    /**
     * Returns the value of the '<em><b>Lcomment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lcomment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lcomment</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='lcomment' namespace='##targetNamespace'"
     * @generated
     * @see #setLcomment(Object)
     * @see Btsaux.BtsauxPackage#getBwllinkType_Lcomment()
     */
    Object getLcomment();

    /**
     * Sets the value of the '{@link Btsaux.BwllinkType#getLcomment <em>Lcomment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lcomment</em>' attribute.
     * @generated
     * @see #getLcomment()
     */
    void setLcomment(Object value);

    /**
     * Returns the value of the '<em><b>Lkey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lkey</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lkey</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='lkey' namespace='##targetNamespace'"
     * @generated
     * @see #setLkey(String)
     * @see Btsaux.BtsauxPackage#getBwllinkType_Lkey()
     */
    String getLkey();

    /**
     * Sets the value of the '{@link Btsaux.BwllinkType#getLkey <em>Lkey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lkey</em>' attribute.
     * @generated
     * @see #getLkey()
     */
    void setLkey(String value);

    /**
     * Returns the value of the '<em><b>Ltype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ltype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ltype</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='ltype' namespace='##targetNamespace'"
     * @generated
     * @see #setLtype(Object)
     * @see Btsaux.BtsauxPackage#getBwllinkType_Ltype()
     */
    Object getLtype();

    /**
     * Sets the value of the '{@link Btsaux.BwllinkType#getLtype <em>Ltype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ltype</em>' attribute.
     * @generated
     * @see #getLtype()
     */
    void setLtype(Object value);

    /**
     * Returns the value of the '<em><b>Wcn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wcn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Wcn</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='wcn' namespace='##targetNamespace'"
     * @generated
     * @see #setWcn(String)
     * @see Btsaux.BtsauxPackage#getBwllinkType_Wcn()
     */
    String getWcn();

    /**
     * Sets the value of the '{@link Btsaux.BwllinkType#getWcn <em>Wcn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Wcn</em>' attribute.
     * @generated
     * @see #getWcn()
     */
    void setWcn(String value);

} // BwllinkType
