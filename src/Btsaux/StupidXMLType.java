/*
 */
package Btsaux;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stupid XML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link Btsaux.StupidXMLType#getGroup <em>Group</em>}</li>
 * <li>{@link Btsaux.StupidXMLType#getThsdata <em>Thsdata</em>}</li>
 * <li>{@link Btsaux.StupidXMLType#getAuthors <em>Authors</em>}</li>
 * <li>{@link Btsaux.StupidXMLType#getBwlengl <em>Bwlengl</em>}</li>
 * <li>{@link Btsaux.StupidXMLType#getBwllink <em>Bwllink</em>}</li>
 * <li>{@link Btsaux.StupidXMLType#getBwllist <em>Bwllist</em>}</li>
 * </ul>
 * </p>
 *
 * @model extendedMetaData="name='StupidXML_._type' kind='elementOnly'"
 * @generated
 * @see Btsaux.BtsauxPackage#getStupidXMLType()
 */
public interface StupidXMLType extends EObject {
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
     * extendedMetaData="kind='group' name='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Group()
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Thsdata</b></em>' containment reference list.
     * The list contents are of type {@link Btsaux.ThsdataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thsdata</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Thsdata</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='thsdata' namespace='##targetNamespace' group='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Thsdata()
     */
    EList<ThsdataType> getThsdata();

    /**
     * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
     * The list contents are of type {@link Btsaux.AuthorsType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Authors</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='authors' namespace='##targetNamespace' group='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Authors()
     */
    EList<AuthorsType> getAuthors();

    /**
     * Returns the value of the '<em><b>Bwlengl</b></em>' containment reference list.
     * The list contents are of type {@link Btsaux.BwlenglType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwlengl</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwlengl</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwlengl' namespace='##targetNamespace' group='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Bwlengl()
     */
    EList<BwlenglType> getBwlengl();

    /**
     * Returns the value of the '<em><b>Bwllink</b></em>' containment reference list.
     * The list contents are of type {@link Btsaux.BwllinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwllink</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwllink</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwllink' namespace='##targetNamespace' group='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Bwllink()
     */
    EList<BwllinkType> getBwllink();

    /**
     * Returns the value of the '<em><b>Bwllist</b></em>' containment reference list.
     * The list contents are of type {@link Btsaux.BwllistType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bwllist</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Bwllist</em>' containment reference list.
     * @model containment="true" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='bwllist' namespace='##targetNamespace' group='group:0'"
     * @generated
     * @see Btsaux.BtsauxPackage#getStupidXMLType_Bwllist()
     */
    EList<BwllistType> getBwllist();

} // StupidXMLType
