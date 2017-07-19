/*
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Count Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.LineCountType#getMixed <em>Mixed</em>}</li>
 * <li>{@link CorpusDTDneu.LineCountType#getGroup <em>Group</em>}</li>
 * <li>{@link CorpusDTDneu.LineCountType#getValue <em>Value</em>}</li>
 * <li>{@link CorpusDTDneu.LineCountType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='LineCount_._type' kind='mixed'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getLineCountType()
 */
public interface LineCountType extends EObject {
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLineCountType_Mixed()
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Group</em>' attribute list.
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='group' name='group:1'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLineCountType_Group()
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Value</em>' attribute list.
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='Value' namespace='##targetNamespace' group='group:1'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLineCountType_Value()
     */
    EList<String> getValue();

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Comment</em>' attribute list.
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace' group='group:1'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getLineCountType_Comment()
     */
    EList<String> getComment();

} // LineCountType
