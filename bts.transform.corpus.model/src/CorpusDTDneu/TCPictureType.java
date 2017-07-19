/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Picture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCPictureType#getMixed <em>Mixed</em>}</li>
 * <li>{@link CorpusDTDneu.TCPictureType#getPictureType <em>Picture Type</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCPicture_._type' kind='mixed'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCPictureType()
 */
public interface TCPictureType extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     * extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCPictureType_Mixed()
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Picture Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Picture Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Picture Type</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='PictureType' namespace='##targetNamespace'"
     * @generated
     * @see #setPictureType(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCPictureType_PictureType()
     */
    Object getPictureType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCPictureType#getPictureType <em>Picture Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Picture Type</em>' attribute.
     * @generated
     * @see #getPictureType()
     */
    void setPictureType(Object value);

} // TCPictureType
