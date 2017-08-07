/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCHeaderType#getDate <em>Date</em>}</li>
 * <li>{@link CorpusDTDneu.TCHeaderType#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.TCHeaderType#getProject <em>Project</em>}</li>
 * <li>{@link CorpusDTDneu.TCHeaderType#getTitle <em>Title</em>}</li>
 * <li>{@link CorpusDTDneu.TCHeaderType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCHeader_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType()
 */
public interface TCHeaderType extends EObject {
    /**
     * Returns the value of the '<em><b>Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Date</em>' containment reference.
     * @model containment="true"
     * extendedMetaData="kind='element' name='Date' namespace='##targetNamespace'"
     * @generated
     * @see #setDate(DateType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType_Date()
     */
    DateType getDate();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCHeaderType#getDate <em>Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Date</em>' containment reference.
     * @generated
     * @see #getDate()
     */
    void setDate(DateType value);

    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Author</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Author' namespace='##targetNamespace'"
     * @generated
     * @see #setAuthor(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType_Author()
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCHeaderType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Author</em>' attribute.
     * @generated
     * @see #getAuthor()
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Project</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Project' namespace='##targetNamespace'"
     * @generated
     * @see #setProject(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType_Project()
     */
    String getProject();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCHeaderType#getProject <em>Project</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Project</em>' attribute.
     * @generated
     * @see #getProject()
     */
    void setProject(String value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Title</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
     * @generated
     * @see #setTitle(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType_Title()
     */
    String getTitle();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCHeaderType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Title</em>' attribute.
     * @generated
     * @see #getTitle()
     */
    void setTitle(String value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCHeaderType_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCHeaderType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

} // TCHeaderType
