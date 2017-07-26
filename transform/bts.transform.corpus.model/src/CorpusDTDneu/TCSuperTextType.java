/*
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Super Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getTCPassport <em>TC Passport</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getTCPicture <em>TC Picture</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getTCNotebook <em>TC Notebook</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getTCText <em>TC Text</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getSortKey <em>Sort Key</em>}</li>
 * <li>{@link CorpusDTDneu.TCSuperTextType#getTCName <em>TC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCSuperText_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType()
 */
public interface TCSuperTextType extends EObject {
    /**
     * Returns the value of the '<em><b>TC Passport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Passport</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Passport</em>' containment reference.
     * @model containment="true"
     * extendedMetaData="kind='element' name='TCPassport' namespace='##targetNamespace'"
     * @generated
     * @see #setTCPassport(TCPassportType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_TCPassport()
     */
    TCPassportType getTCPassport();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCSuperTextType#getTCPassport <em>TC Passport</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>TC Passport</em>' containment reference.
     * @generated
     * @see #getTCPassport()
     */
    void setTCPassport(TCPassportType value);

    /**
     * Returns the value of the '<em><b>TC Picture</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCPictureType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Picture</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Picture</em>' containment reference list.
     * @model containment="true"
     * extendedMetaData="kind='element' name='TCPicture' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_TCPicture()
     */
    EList<TCPictureType> getTCPicture();

    /**
     * Returns the value of the '<em><b>TC Notebook</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Notebook</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Notebook</em>' attribute list.
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='TCNotebook' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_TCNotebook()
     */
    EList<String> getTCNotebook();

    /**
     * Returns the value of the '<em><b>TC Text</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCTextType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Text</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Text</em>' containment reference list.
     * @model containment="true"
     * extendedMetaData="kind='element' name='TCText' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_TCText()
     */
    EList<TCTextType> getTCText();

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
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='Author' namespace='##targetNamespace'"
     * @generated
     * @see #setAuthor(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_Author()
     */
    Object getAuthor();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCSuperTextType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Author</em>' attribute.
     * @generated
     * @see #getAuthor()
     */
    void setAuthor(Object value);

    /**
     * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sort Key</em>' attribute.
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='SortKey' namespace='##targetNamespace'"
     * @generated
     * @see #isSetSortKey()
     * @see #unsetSortKey()
     * @see #setSortKey(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_SortKey()
     */
    Object getSortKey();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCSuperTextType#getSortKey <em>Sort Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sort Key</em>' attribute.
     * @generated
     * @see #isSetSortKey()
     * @see #unsetSortKey()
     * @see #getSortKey()
     */
    void setSortKey(Object value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.TCSuperTextType#getSortKey <em>Sort Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetSortKey()
     * @see #getSortKey()
     * @see #setSortKey(Object)
     */
    void unsetSortKey();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.TCSuperTextType#getSortKey <em>Sort Key</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Sort Key</em>' attribute is set.
     * @generated
     * @see #unsetSortKey()
     * @see #getSortKey()
     * @see #setSortKey(Object)
     */
    boolean isSetSortKey();

    /**
     * Returns the value of the '<em><b>TC Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Name</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='TCName' namespace='##targetNamespace'"
     * @generated
     * @see #setTCName(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCSuperTextType_TCName()
     */
    Object getTCName();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCSuperTextType#getTCName <em>TC Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>TC Name</em>' attribute.
     * @generated
     * @see #getTCName()
     */
    void setTCName(Object value);

} // TCSuperTextType
