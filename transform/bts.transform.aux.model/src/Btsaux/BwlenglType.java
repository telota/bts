/*
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bwlengl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.BwlenglType#getEcomment <em>Ecomment</em>}</li>
 * <li>{@link Btsaux.BwlenglType#getElabel <em>Elabel</em>}</li>
 * <li>{@link Btsaux.BwlenglType#getWcn <em>Wcn</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='bwlengl_._type' kind='empty'"
 * @generated
 * @see Btsaux.BtsauxPackage#getBwlenglType()
 */
public interface BwlenglType extends EObject {
    /**
     * Returns the value of the '<em><b>Ecomment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ecomment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ecomment</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='ecomment' namespace='##targetNamespace'"
     * @generated
     * @see #setEcomment(Object)
     * @see Btsaux.BtsauxPackage#getBwlenglType_Ecomment()
     */
    Object getEcomment();

    /**
     * Sets the value of the '{@link Btsaux.BwlenglType#getEcomment <em>Ecomment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ecomment</em>' attribute.
     * @generated
     * @see #getEcomment()
     */
    void setEcomment(Object value);

    /**
     * Returns the value of the '<em><b>Elabel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elabel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Elabel</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='elabel' namespace='##targetNamespace'"
     * @generated
     * @see #setElabel(Object)
     * @see Btsaux.BtsauxPackage#getBwlenglType_Elabel()
     */
    Object getElabel();

    /**
     * Sets the value of the '{@link Btsaux.BwlenglType#getElabel <em>Elabel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Elabel</em>' attribute.
     * @generated
     * @see #getElabel()
     */
    void setElabel(Object value);

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
     * @see Btsaux.BtsauxPackage#getBwlenglType_Wcn()
     */
    String getWcn();

    /**
     * Sets the value of the '{@link Btsaux.BwlenglType#getWcn <em>Wcn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Wcn</em>' attribute.
     * @generated
     * @see #getWcn()
     */
    void setWcn(String value);

} // BwlenglType
