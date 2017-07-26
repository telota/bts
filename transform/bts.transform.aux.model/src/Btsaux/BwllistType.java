/*
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bwllist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.BwllistType#getArbVermerk <em>Arb Vermerk</em>}</li>
 * <li>{@link Btsaux.BwllistType#getHsort <em>Hsort</em>}</li>
 * <li>{@link Btsaux.BwllistType#getKommentar <em>Kommentar</em>}</li>
 * <li>{@link Btsaux.BwllistType#getLabel <em>Label</em>}</li>
 * <li>{@link Btsaux.BwllistType#getLemma <em>Lemma</em>}</li>
 * <li>{@link Btsaux.BwllistType#getLock <em>Lock</em>}</li>
 * <li>{@link Btsaux.BwllistType#getLsort <em>Lsort</em>}</li>
 * <li>{@link Btsaux.BwllistType#getRedaction <em>Redaction</em>}</li>
 * <li>{@link Btsaux.BwllistType#getRstatus <em>Rstatus</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc00 <em>Sc00</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc01 <em>Sc01</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc02 <em>Sc02</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc03 <em>Sc03</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc04 <em>Sc04</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc05 <em>Sc05</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc06 <em>Sc06</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc07 <em>Sc07</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc08 <em>Sc08</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc09 <em>Sc09</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSc10 <em>Sc10</em>}</li>
 * <li>{@link Btsaux.BwllistType#getShortref <em>Shortref</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSimplify <em>Simplify</em>}</li>
 * <li>{@link Btsaux.BwllistType#getWclass <em>Wclass</em>}</li>
 * <li>{@link Btsaux.BwllistType#getWclassnum <em>Wclassnum</em>}</li>
 * <li>{@link Btsaux.BwllistType#getWcn <em>Wcn</em>}</li>
 * <li>{@link Btsaux.BwllistType#getWoart <em>Woart</em>}</li>
 * <li>{@link Btsaux.BwllistType#getGlyphs <em>Glyphs</em>}</li>
 * <li>{@link Btsaux.BwllistType#getPredecessor <em>Predecessor</em>}</li>
 * <li>{@link Btsaux.BwllistType#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='bwllist_._type' kind='empty'"
 * @generated
 * @see Btsaux.BtsauxPackage#getBwllistType()
 */
public interface BwllistType extends EObject {
    /**
     * Returns the value of the '<em><b>Arb Vermerk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arb Vermerk</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Arb Vermerk</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='arb_vermerk' namespace='##targetNamespace'"
     * @generated
     * @see #setArbVermerk(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_ArbVermerk()
     */
    Object getArbVermerk();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getArbVermerk <em>Arb Vermerk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Arb Vermerk</em>' attribute.
     * @generated
     * @see #getArbVermerk()
     */
    void setArbVermerk(Object value);

    /**
     * Returns the value of the '<em><b>Hsort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hsort</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Hsort</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='hsort' namespace='##targetNamespace'"
     * @generated
     * @see #setHsort(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Hsort()
     */
    String getHsort();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getHsort <em>Hsort</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Hsort</em>' attribute.
     * @generated
     * @see #getHsort()
     */
    void setHsort(String value);

    /**
     * Returns the value of the '<em><b>Kommentar</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kommentar</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Kommentar</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     * extendedMetaData="kind='attribute' name='kommentar' namespace='##targetNamespace'"
     * @generated
     * @see #setKommentar(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Kommentar()
     */
    Object getKommentar();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getKommentar <em>Kommentar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Kommentar</em>' attribute.
     * @generated
     * @see #getKommentar()
     */
    void setKommentar(Object value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Label</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
     * @generated
     * @see #setLabel(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Label()
     */
    Object getLabel();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Label</em>' attribute.
     * @generated
     * @see #getLabel()
     */
    void setLabel(Object value);

    /**
     * Returns the value of the '<em><b>Lemma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lemma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lemma</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='lemma' namespace='##targetNamespace'"
     * @generated
     * @see #setLemma(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Lemma()
     */
    Object getLemma();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getLemma <em>Lemma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lemma</em>' attribute.
     * @generated
     * @see #getLemma()
     */
    void setLemma(Object value);

    /**
     * Returns the value of the '<em><b>Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lock</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='lock' namespace='##targetNamespace'"
     * @generated
     * @see #setLock(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Lock()
     */
    Object getLock();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getLock <em>Lock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lock</em>' attribute.
     * @generated
     * @see #getLock()
     */
    void setLock(Object value);

    /**
     * Returns the value of the '<em><b>Lsort</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lsort</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Lsort</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='lsort' namespace='##targetNamespace'"
     * @generated
     * @see #setLsort(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Lsort()
     */
    Object getLsort();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getLsort <em>Lsort</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Lsort</em>' attribute.
     * @generated
     * @see #getLsort()
     */
    void setLsort(Object value);

    /**
     * Returns the value of the '<em><b>Redaction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Redaction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Redaction</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='redaction' namespace='##targetNamespace'"
     * @generated
     * @see #setRedaction(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Redaction()
     */
    String getRedaction();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getRedaction <em>Redaction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Redaction</em>' attribute.
     * @generated
     * @see #getRedaction()
     */
    void setRedaction(String value);

    /**
     * Returns the value of the '<em><b>Rstatus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rstatus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Rstatus</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='rstatus' namespace='##targetNamespace'"
     * @generated
     * @see #setRstatus(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Rstatus()
     */
    String getRstatus();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getRstatus <em>Rstatus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Rstatus</em>' attribute.
     * @generated
     * @see #getRstatus()
     */
    void setRstatus(String value);

    /**
     * Returns the value of the '<em><b>Sc00</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc00</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc00</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc00' namespace='##targetNamespace'"
     * @generated
     * @see #setSc00(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc00()
     */
    Object getSc00();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc00 <em>Sc00</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc00</em>' attribute.
     * @generated
     * @see #getSc00()
     */
    void setSc00(Object value);

    /**
     * Returns the value of the '<em><b>Sc01</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc01</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc01</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc01' namespace='##targetNamespace'"
     * @generated
     * @see #setSc01(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc01()
     */
    Object getSc01();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc01 <em>Sc01</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc01</em>' attribute.
     * @generated
     * @see #getSc01()
     */
    void setSc01(Object value);

    /**
     * Returns the value of the '<em><b>Sc02</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc02</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc02</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc02' namespace='##targetNamespace'"
     * @generated
     * @see #setSc02(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc02()
     */
    Object getSc02();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc02 <em>Sc02</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc02</em>' attribute.
     * @generated
     * @see #getSc02()
     */
    void setSc02(Object value);

    /**
     * Returns the value of the '<em><b>Sc03</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc03</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc03</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc03' namespace='##targetNamespace'"
     * @generated
     * @see #setSc03(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc03()
     */
    Object getSc03();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc03 <em>Sc03</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc03</em>' attribute.
     * @generated
     * @see #getSc03()
     */
    void setSc03(Object value);

    /**
     * Returns the value of the '<em><b>Sc04</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc04</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc04</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc04' namespace='##targetNamespace'"
     * @generated
     * @see #setSc04(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc04()
     */
    Object getSc04();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc04 <em>Sc04</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc04</em>' attribute.
     * @generated
     * @see #getSc04()
     */
    void setSc04(Object value);

    /**
     * Returns the value of the '<em><b>Sc05</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc05</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc05</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc05' namespace='##targetNamespace'"
     * @generated
     * @see #setSc05(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc05()
     */
    Object getSc05();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc05 <em>Sc05</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc05</em>' attribute.
     * @generated
     * @see #getSc05()
     */
    void setSc05(Object value);

    /**
     * Returns the value of the '<em><b>Sc06</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc06</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc06</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc06' namespace='##targetNamespace'"
     * @generated
     * @see #setSc06(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc06()
     */
    Object getSc06();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc06 <em>Sc06</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc06</em>' attribute.
     * @generated
     * @see #getSc06()
     */
    void setSc06(Object value);

    /**
     * Returns the value of the '<em><b>Sc07</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc07</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc07</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc07' namespace='##targetNamespace'"
     * @generated
     * @see #setSc07(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc07()
     */
    Object getSc07();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc07 <em>Sc07</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc07</em>' attribute.
     * @generated
     * @see #getSc07()
     */
    void setSc07(Object value);

    /**
     * Returns the value of the '<em><b>Sc08</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc08</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc08</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc08' namespace='##targetNamespace'"
     * @generated
     * @see #setSc08(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc08()
     */
    Object getSc08();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc08 <em>Sc08</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc08</em>' attribute.
     * @generated
     * @see #getSc08()
     */
    void setSc08(Object value);

    /**
     * Returns the value of the '<em><b>Sc09</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc09</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc09</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc09' namespace='##targetNamespace'"
     * @generated
     * @see #setSc09(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc09()
     */
    Object getSc09();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc09 <em>Sc09</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc09</em>' attribute.
     * @generated
     * @see #getSc09()
     */
    void setSc09(Object value);

    /**
     * Returns the value of the '<em><b>Sc10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sc10</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Sc10</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='sc10' namespace='##targetNamespace'"
     * @generated
     * @see #setSc10(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Sc10()
     */
    Object getSc10();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSc10 <em>Sc10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Sc10</em>' attribute.
     * @generated
     * @see #getSc10()
     */
    void setSc10(Object value);

    /**
     * Returns the value of the '<em><b>Shortref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shortref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Shortref</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='shortref' namespace='##targetNamespace'"
     * @generated
     * @see #setShortref(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Shortref()
     */
    Object getShortref();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getShortref <em>Shortref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Shortref</em>' attribute.
     * @generated
     * @see #getShortref()
     */
    void setShortref(Object value);

    /**
     * Returns the value of the '<em><b>Simplify</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Simplify</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Simplify</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='simplify' namespace='##targetNamespace'"
     * @generated
     * @see #setSimplify(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Simplify()
     */
    Object getSimplify();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSimplify <em>Simplify</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Simplify</em>' attribute.
     * @generated
     * @see #getSimplify()
     */
    void setSimplify(Object value);

    /**
     * Returns the value of the '<em><b>Wclass</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wclass</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Wclass</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     * extendedMetaData="kind='attribute' name='wclass' namespace='##targetNamespace'"
     * @generated
     * @see #setWclass(Object)
     * @see Btsaux.BtsauxPackage#getBwllistType_Wclass()
     */
    Object getWclass();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getWclass <em>Wclass</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Wclass</em>' attribute.
     * @generated
     * @see #getWclass()
     */
    void setWclass(Object value);

    /**
     * Returns the value of the '<em><b>Wclassnum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wclassnum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Wclassnum</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='wclassnum' namespace='##targetNamespace'"
     * @generated
     * @see #setWclassnum(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Wclassnum()
     */
    String getWclassnum();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getWclassnum <em>Wclassnum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Wclassnum</em>' attribute.
     * @generated
     * @see #getWclassnum()
     */
    void setWclassnum(String value);

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
     * @see Btsaux.BtsauxPackage#getBwllistType_Wcn()
     */
    String getWcn();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getWcn <em>Wcn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Wcn</em>' attribute.
     * @generated
     * @see #getWcn()
     */
    void setWcn(String value);

    /**
     * Returns the value of the '<em><b>Woart</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Woart</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Woart</em>' attribute.
     * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
     * extendedMetaData="kind='attribute' name='woart' namespace='##targetNamespace'"
     * @generated
     * @see #setWoart(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Woart()
     */
    String getWoart();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getWoart <em>Woart</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Woart</em>' attribute.
     * @generated
     * @see #getWoart()
     */
    void setWoart(String value);

    /**
     * Returns the value of the '<em><b>Glyphs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Glyphs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Glyphs</em>' attribute.
     * @model
     * @generated
     * @see #setGlyphs(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Glyphs()
     */
    String getGlyphs();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getGlyphs <em>Glyphs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Glyphs</em>' attribute.
     * @generated
     * @see #getGlyphs()
     */
    void setGlyphs(String value);

    /**
     * Returns the value of the '<em><b>Predecessor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Predecessor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Predecessor</em>' attribute.
     * @model
     * @generated
     * @see #setPredecessor(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Predecessor()
     */
    String getPredecessor();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getPredecessor <em>Predecessor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Predecessor</em>' attribute.
     * @generated
     * @see #getPredecessor()
     */
    void setPredecessor(String value);

    /**
     * Returns the value of the '<em><b>Successor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Successor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Successor</em>' attribute.
     * @model
     * @generated
     * @see #setSuccessor(String)
     * @see Btsaux.BtsauxPackage#getBwllistType_Successor()
     */
    String getSuccessor();

    /**
     * Sets the value of the '{@link Btsaux.BwllistType#getSuccessor <em>Successor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Successor</em>' attribute.
     * @generated
     * @see #getSuccessor()
     */
    void setSuccessor(String value);

} // BwllistType
