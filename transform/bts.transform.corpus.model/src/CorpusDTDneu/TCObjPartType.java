/*
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Obj Part Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCPassport <em>TC Passport</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCPicture <em>TC Picture</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCNotebook <em>TC Notebook</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getGroup <em>Group</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCCaption <em>TC Caption</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCObject <em>TC Object</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCObjPart <em>TC Obj Part</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCScene <em>TC Scene</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCSuperText <em>TC Super Text</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCText <em>TC Text</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getSortKey <em>Sort Key</em>}</li>
 * <li>{@link CorpusDTDneu.TCObjPartType#getTCName <em>TC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='TCObjPart_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType()
 */
public interface TCObjPartType extends EObject {
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCPassport()
     */
    TCPassportType getTCPassport();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCObjPartType#getTCPassport <em>TC Passport</em>}' containment reference.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCPicture()
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCNotebook()
     */
    EList<String> getTCNotebook();

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
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     * extendedMetaData="kind='group' name='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_Group()
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>TC Caption</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCCaptionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Caption</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Caption</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCCaption' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCCaption()
     */
    EList<TCCaptionType> getTCCaption();

    /**
     * Returns the value of the '<em><b>TC Object</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCObjectType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Object</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Object</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCObject' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCObject()
     */
    EList<TCObjectType> getTCObject();

    /**
     * Returns the value of the '<em><b>TC Obj Part</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCObjPartType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Obj Part</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Obj Part</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCObjPart' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCObjPart()
     */
    EList<TCObjPartType> getTCObjPart();

    /**
     * Returns the value of the '<em><b>TC Scene</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCSceneType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Scene</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Scene</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCScene' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCScene()
     */
    EList<TCSceneType> getTCScene();

    /**
     * Returns the value of the '<em><b>TC Super Text</b></em>' containment reference list.
     * The list contents are of type {@link CorpusDTDneu.TCSuperTextType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TC Super Text</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>TC Super Text</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCSuperText' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCSuperText()
     */
    EList<TCSuperTextType> getTCSuperText();

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
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='TCText' namespace='##targetNamespace' group='group:3'"
     * @generated
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCText()
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_Author()
     */
    Object getAuthor();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCObjPartType#getAuthor <em>Author</em>}' attribute.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_SortKey()
     */
    Object getSortKey();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCObjPartType#getSortKey <em>Sort Key</em>}' attribute.
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
     * Unsets the value of the '{@link CorpusDTDneu.TCObjPartType#getSortKey <em>Sort Key</em>}' attribute.
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
     * Returns whether the value of the '{@link CorpusDTDneu.TCObjPartType#getSortKey <em>Sort Key</em>}' attribute is set.
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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getTCObjPartType_TCName()
     */
    Object getTCName();

    /**
     * Sets the value of the '{@link CorpusDTDneu.TCObjPartType#getTCName <em>TC Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>TC Name</em>' attribute.
     * @generated
     * @see #getTCName()
     */
    void setTCName(Object value);

} // TCObjPartType
