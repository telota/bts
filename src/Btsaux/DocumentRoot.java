/*
 */
package Btsaux;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getAugroups <em>Augroups</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getAuthorization <em>Authorization</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getAuthors <em>Authors</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getBwlengl <em>Bwlengl</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getBwllink <em>Bwllink</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getBwllist <em>Bwllist</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getStupidXML <em>Stupid XML</em>}</li>
 * <li>{@link Btsaux.DocumentRoot#getThsdata <em>Thsdata</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 * @see Btsaux.BtsauxPackage#getDocumentRoot()
 */
public interface DocumentRoot extends EObject {
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
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Mixed()
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     * extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     * @see Btsaux.BtsauxPackage#getDocumentRoot_XMLNSPrefixMap()
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     * extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     * @see Btsaux.BtsauxPackage#getDocumentRoot_XSISchemaLocation()
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Augroups</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Augroups</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Augroups</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='augroups' namespace='##targetNamespace'"
     * @generated
     * @see #setAugroups(AugroupsType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Augroups()
     */
    AugroupsType getAugroups();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getAugroups <em>Augroups</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Augroups</em>' containment reference.
     * @generated
     * @see #getAugroups()
     */
    void setAugroups(AugroupsType value);

    /**
     * Returns the value of the '<em><b>Authorization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authorization</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Authorization</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='authorization' namespace='##targetNamespace'"
     * @generated
     * @see #setAuthorization(AuthorizationType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Authorization()
     */
    AuthorizationType getAuthorization();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getAuthorization <em>Authorization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Authorization</em>' containment reference.
     * @generated
     * @see #getAuthorization()
     */
    void setAuthorization(AuthorizationType value);

    /**
     * Returns the value of the '<em><b>Authors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Authors</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='authors' namespace='##targetNamespace'"
     * @generated
     * @see #setAuthors(AuthorsType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Authors()
     */
    AuthorsType getAuthors();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getAuthors <em>Authors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Authors</em>' containment reference.
     * @generated
     * @see #getAuthors()
     */
    void setAuthors(AuthorsType value);

    /**
     * Returns the value of the '<em><b>Bwlengl</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwlengl</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwlengl</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwlengl' namespace='##targetNamespace'"
     * @generated
     * @see #setBwlengl(BwlenglType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Bwlengl()
     */
    BwlenglType getBwlengl();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getBwlengl <em>Bwlengl</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bwlengl</em>' containment reference.
     * @generated
     * @see #getBwlengl()
     */
    void setBwlengl(BwlenglType value);

    /**
     * Returns the value of the '<em><b>Bwllink</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwllink</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwllink</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwllink' namespace='##targetNamespace'"
     * @generated
     * @see #setBwllink(BwllinkType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Bwllink()
     */
    BwllinkType getBwllink();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getBwllink <em>Bwllink</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bwllink</em>' containment reference.
     * @generated
     * @see #getBwllink()
     */
    void setBwllink(BwllinkType value);

    /**
     * Returns the value of the '<em><b>Bwllist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwllist</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwllist</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwllist' namespace='##targetNamespace'"
     * @generated
     * @see #setBwllist(BwllistType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Bwllist()
     */
    BwllistType getBwllist();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getBwllist <em>Bwllist</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Bwllist</em>' containment reference.
     * @generated
     * @see #getBwllist()
     */
    void setBwllist(BwllistType value);

    /**
     * Returns the value of the '<em><b>Stupid XML</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stupid XML</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Stupid XML</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='StupidXML' namespace='##targetNamespace'"
     * @generated
     * @see #setStupidXML(StupidXMLType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_StupidXML()
     */
    StupidXMLType getStupidXML();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getStupidXML <em>Stupid XML</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Stupid XML</em>' containment reference.
     * @generated
     * @see #getStupidXML()
     */
    void setStupidXML(StupidXMLType value);

    /**
     * Returns the value of the '<em><b>Thsdata</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thsdata</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Thsdata</em>' containment reference.
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='thsdata' namespace='##targetNamespace'"
     * @generated
     * @see #setThsdata(ThsdataType)
     * @see Btsaux.BtsauxPackage#getDocumentRoot_Thsdata()
     */
    ThsdataType getThsdata();

    /**
     * Sets the value of the '{@link Btsaux.DocumentRoot#getThsdata <em>Thsdata</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Thsdata</em>' containment reference.
     * @generated
     * @see #getThsdata()
     */
    void setThsdata(ThsdataType value);

} // DocumentRoot
