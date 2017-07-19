/*
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Augroups Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.AugroupsType#getCategory <em>Category</em>}</li>
 * <li>{@link Btsaux.AugroupsType#getComment <em>Comment</em>}</li>
 * <li>{@link Btsaux.AugroupsType#getGpct <em>Gpct</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='augroups_._type' kind='empty'"
 * @generated
 * @see Btsaux.BtsauxPackage#getAugroupsType()
 */
public interface AugroupsType extends EObject {
    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Category</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='category' namespace='##targetNamespace'"
     * @generated
     * @see #setCategory(Object)
     * @see Btsaux.BtsauxPackage#getAugroupsType_Category()
     */
    Object getCategory();

    /**
     * Sets the value of the '{@link Btsaux.AugroupsType#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Category</em>' attribute.
     * @generated
     * @see #getCategory()
     */
    void setCategory(Object value);

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
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
     * @generated
     * @see #setComment(Object)
     * @see Btsaux.BtsauxPackage#getAugroupsType_Comment()
     */
    Object getComment();

    /**
     * Sets the value of the '{@link Btsaux.AugroupsType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(Object value);

    /**
     * Returns the value of the '<em><b>Gpct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gpct</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Gpct</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='gpct' namespace='##targetNamespace'"
     * @generated
     * @see #setGpct(String)
     * @see Btsaux.BtsauxPackage#getAugroupsType_Gpct()
     */
    String getGpct();

    /**
     * Sets the value of the '{@link Btsaux.AugroupsType#getGpct <em>Gpct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Gpct</em>' attribute.
     * @generated
     * @see #getGpct()
     */
    void setGpct(String value);

} // AugroupsType
