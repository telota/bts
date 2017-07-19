/*
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCTextType#getTCPassport <em>TC Passport</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getTCPicture <em>TC Picture</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getTCNotebook <em>TC Notebook</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getEgyTxt <em>Egy Txt</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getBearbeitungsstand <em>Bearbeitungsstand</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getTCName <em>TC Name</em>}</li>
 * <li>{@link CorpusDTDneu.TCTextType#getTextID <em>Text ID</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCText_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType()
 */
public interface TCTextType extends EObject {
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCPassport()
     */
    TCPassportType getTCPassport();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTCPassport <em>TC Passport</em>}' containment reference.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCPicture()
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCNotebook()
     */
    EList<String> getTCNotebook();

    /**
     * Returns the value of the '<em><b>Egy Txt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Egy Txt</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Egy Txt</em>' containment reference.
     * @model containment="true"
     * extendedMetaData="kind='element' name='EgyTxt' namespace='##targetNamespace'"
     * @generated
     * @see #setEgyTxt(EgyTxtType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_EgyTxt()
     */
    EgyTxtType getEgyTxt();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getEgyTxt <em>Egy Txt</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Egy Txt</em>' containment reference.
     * @generated
     * @see #getEgyTxt()
     */
    void setEgyTxt(EgyTxtType value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_Author()
     */
    Object getAuthor();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Author</em>' attribute.
     * @generated
     * @see #getAuthor()
     */
    void setAuthor(Object value);

    /**
     * Returns the value of the '<em><b>Bearbeitungsstand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bearbeitungsstand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bearbeitungsstand</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     * extendedMetaData="kind='attribute' name='Bearbeitungsstand' namespace='##targetNamespace'"
     * @generated
     * @see #setBearbeitungsstand(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_Bearbeitungsstand()
     */
    String getBearbeitungsstand();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getBearbeitungsstand <em>Bearbeitungsstand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bearbeitungsstand</em>' attribute.
     * @generated
     * @see #getBearbeitungsstand()
     */
    void setBearbeitungsstand(String value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_SortKey()
     */
    Object getSortKey();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute.
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
     * Unsets the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute.
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
     * Returns whether the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute is set.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCName()
     */
    Object getTCName();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTCName <em>TC Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>TC Name</em>' attribute.
     * @generated
     * @see #getTCName()
     */
    void setTCName(Object value);

    /**
     * Returns the value of the '<em><b>Text ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Text ID</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     * extendedMetaData="kind='attribute' name='TextID' namespace='##targetNamespace'"
     * @generated
     * @see #setTextID(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TextID()
     */
    String getTextID();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTextID <em>Text ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Text ID</em>' attribute.
     * @generated
     * @see #getTextID()
     */
    void setTextID(String value);

} // TCTextType
