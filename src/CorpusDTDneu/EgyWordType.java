/*
 */
package CorpusDTDneu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Egy Word Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CorpusDTDneu.EgyWordType#getForm <em>Form</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getTranslat <em>Translat</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getGraphics <em>Graphics</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getBtsCodes <em>Bts Codes</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getComment <em>Comment</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getConnect <em>Connect</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getFKey <em>FKey</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getLeipzig3Modul <em>Leipzig3 Modul</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getLKey <em>LKey</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getLType <em>LType</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getReihenfolge <em>Reihenfolge</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getReihenfolgeID <em>Reihenfolge ID</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getScript <em>Script</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getStatus <em>Status</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getWChr <em>WChr</em>}</li>
 * <li>{@link CorpusDTDneu.EgyWordType#getWType <em>WType</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='EgyWord_._type' kind='elementOnly'"
 * @generated
 * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType()
 */
public interface EgyWordType extends EObject {
    /**
     * Returns the value of the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Form</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     * extendedMetaData="kind='element' name='Form' namespace='##targetNamespace'"
     * @generated
     * @see #setForm(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Form()
     */
    String getForm();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getForm <em>Form</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Form</em>' attribute.
     * @generated
     * @see #getForm()
     */
    void setForm(String value);

    /**
     * Returns the value of the '<em><b>Translat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Translat</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Translat</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Translat' namespace='##targetNamespace'"
     * @generated
     * @see #setTranslat(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Translat()
     */
    String getTranslat();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getTranslat <em>Translat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Translat</em>' attribute.
     * @generated
     * @see #getTranslat()
     */
    void setTranslat(String value);

    /**
     * Returns the value of the '<em><b>Graphics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Graphics</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Graphics</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='Graphics' namespace='##targetNamespace'"
     * @generated
     * @see #setGraphics(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Graphics()
     */
    String getGraphics();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getGraphics <em>Graphics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Graphics</em>' attribute.
     * @generated
     * @see #getGraphics()
     */
    void setGraphics(String value);

    /**
     * Returns the value of the '<em><b>Bts Codes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bts Codes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bts Codes</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * extendedMetaData="kind='element' name='BtsCodes' namespace='##targetNamespace'"
     * @generated
     * @see #setBtsCodes(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_BtsCodes()
     */
    String getBtsCodes();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getBtsCodes <em>Bts Codes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bts Codes</em>' attribute.
     * @generated
     * @see #getBtsCodes()
     */
    void setBtsCodes(String value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Comment()
     */
    String getComment();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @generated
     * @see #getComment()
     */
    void setComment(String value);

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
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Author()
     */
    Object getAuthor();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Author</em>' attribute.
     * @generated
     * @see #getAuthor()
     */
    void setAuthor(Object value);

    /**
     * Returns the value of the '<em><b>Connect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Connect</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='Connect' namespace='##targetNamespace'"
     * @generated
     * @see #setConnect(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Connect()
     */
    String getConnect();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getConnect <em>Connect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Connect</em>' attribute.
     * @generated
     * @see #getConnect()
     */
    void setConnect(String value);

    /**
     * Returns the value of the '<em><b>FKey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FKey</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>FKey</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='FKey' namespace='##targetNamespace'"
     * @generated
     * @see #setFKey(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_FKey()
     */
    String getFKey();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getFKey <em>FKey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>FKey</em>' attribute.
     * @generated
     * @see #getFKey()
     */
    void setFKey(String value);

    /**
     * Returns the value of the '<em><b>Leipzig3 Modul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leipzig3 Modul</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Leipzig3 Modul</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='Leipzig3Modul' namespace='##targetNamespace'"
     * @generated
     * @see #setLeipzig3Modul(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Leipzig3Modul()
     */
    Object getLeipzig3Modul();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getLeipzig3Modul <em>Leipzig3 Modul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Leipzig3 Modul</em>' attribute.
     * @generated
     * @see #getLeipzig3Modul()
     */
    void setLeipzig3Modul(Object value);

    /**
     * Returns the value of the '<em><b>LKey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LKey</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>LKey</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='LKey' namespace='##targetNamespace'"
     * @generated
     * @see #setLKey(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_LKey()
     */
    String getLKey();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getLKey <em>LKey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>LKey</em>' attribute.
     * @generated
     * @see #getLKey()
     */
    void setLKey(String value);

    /**
     * Returns the value of the '<em><b>LType</b></em>' attribute.
     * The literals are from the enumeration {@link CorpusDTDneu.LTypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>LType</em>' attribute.
     * @model unsettable="true" required="true"
     * extendedMetaData="kind='attribute' name='LType' namespace='##targetNamespace'"
     * @generated
     * @see CorpusDTDneu.LTypeType
     * @see #isSetLType()
     * @see #unsetLType()
     * @see #setLType(LTypeType)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_LType()
     */
    LTypeType getLType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getLType <em>LType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>LType</em>' attribute.
     * @generated
     * @see CorpusDTDneu.LTypeType
     * @see #isSetLType()
     * @see #unsetLType()
     * @see #getLType()
     */
    void setLType(LTypeType value);

    /**
     * Unsets the value of the '{@link CorpusDTDneu.EgyWordType#getLType <em>LType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @see #isSetLType()
     * @see #getLType()
     * @see #setLType(LTypeType)
     */
    void unsetLType();

    /**
     * Returns whether the value of the '{@link CorpusDTDneu.EgyWordType#getLType <em>LType</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>LType</em>' attribute is set.
     * @generated
     * @see #unsetLType()
     * @see #getLType()
     * @see #setLType(LTypeType)
     */
    boolean isSetLType();

    /**
     * Returns the value of the '<em><b>Reihenfolge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reihenfolge</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reihenfolge</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     * extendedMetaData="kind='attribute' name='Reihenfolge' namespace='##targetNamespace'"
     * @generated
     * @see #setReihenfolge(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Reihenfolge()
     */
    String getReihenfolge();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getReihenfolge <em>Reihenfolge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Reihenfolge</em>' attribute.
     * @generated
     * @see #getReihenfolge()
     */
    void setReihenfolge(String value);

    /**
     * Returns the value of the '<em><b>Reihenfolge ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reihenfolge ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reihenfolge ID</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
     * extendedMetaData="kind='attribute' name='ReihenfolgeID' namespace='##targetNamespace'"
     * @generated
     * @see #setReihenfolgeID(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_ReihenfolgeID()
     */
    String getReihenfolgeID();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getReihenfolgeID <em>Reihenfolge ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Reihenfolge ID</em>' attribute.
     * @generated
     * @see #getReihenfolgeID()
     */
    void setReihenfolgeID(String value);

    /**
     * Returns the value of the '<em><b>Script</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Script</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='Script' namespace='##targetNamespace'"
     * @generated
     * @see #setScript(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Script()
     */
    Object getScript();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getScript <em>Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Script</em>' attribute.
     * @generated
     * @see #getScript()
     */
    void setScript(Object value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Status</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='Status' namespace='##targetNamespace'"
     * @generated
     * @see #setStatus(Object)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_Status()
     */
    Object getStatus();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Status</em>' attribute.
     * @generated
     * @see #getStatus()
     */
    void setStatus(Object value);

    /**
     * Returns the value of the '<em><b>WChr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WChr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WChr</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='WChr' namespace='##targetNamespace'"
     * @generated
     * @see #setWChr(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_WChr()
     */
    String getWChr();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getWChr <em>WChr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>WChr</em>' attribute.
     * @generated
     * @see #getWChr()
     */
    void setWChr(String value);

    /**
     * Returns the value of the '<em><b>WType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>WType</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='WType' namespace='##targetNamespace'"
     * @generated
     * @see #setWType(String)
     * @see CorpusDTDneu.CorpusDTDneuPackage#getEgyWordType_WType()
     */
    String getWType();

    /**
     * Sets the value of the '{@link CorpusDTDneu.EgyWordType#getWType <em>WType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>WType</em>' attribute.
     * @generated
     * @see #getWType()
     */
    void setWType(String value);

} // EgyWordType
