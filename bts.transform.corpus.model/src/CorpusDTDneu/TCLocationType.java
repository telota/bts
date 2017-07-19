/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCLocationType#getThsEntry <em>Ths Entry</em>}</li>
 * <li>{@link CorpusDTDneu.TCLocationType#getMuseumNumber <em>Museum Number</em>}</li>
 * <li>{@link CorpusDTDneu.TCLocationType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCLocation_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCLocationType()
 */
public interface TCLocationType extends EObject {
    /**
     * Returns the value of the '<em><b>Ths Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ths Entry</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Ths Entry</em>' containment reference.
     * @model containment="true" required="true"
     * extendedMetaData="kind='element' name='ThsEntry' namespace='##targetNamespace'"
     * @generated
     * @see #setThsEntry(ThsEntryType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCLocationType_ThsEntry()
     */
    ThsEntryType getThsEntry();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCLocationType#getThsEntry <em>Ths Entry</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Ths Entry</em>' containment reference.
     * @generated
     * @see #getThsEntry()
     */
    void setThsEntry(ThsEntryType value);

    /**
     * Returns the value of the '<em><b>Museum Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Museum Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Museum Number</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='MuseumNumber' namespace='##targetNamespace'"
     * @generated
     * @see #setMuseumNumber(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCLocationType_MuseumNumber()
     */
    String getMuseumNumber();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCLocationType#getMuseumNumber <em>Museum Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Museum Number</em>' attribute.
     * @generated
     * @see #getMuseumNumber()
     */
    void setMuseumNumber(String value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCLocationType_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCLocationType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

} // TCLocationType
