/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BtsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btsmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btsmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsmodelPackage eINSTANCE = org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl <em>Administrativ Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getAdministrativDataObject()
	 * @generated
	 */
	int ADMINISTRATIV_DATA_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__REVISIONS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__STATE = 1;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__REVISION_STATE = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT__VISIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Administrativ Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl <em>BTS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObject()
	 * @generated
	 */
	int BTS_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REVISIONS = ADMINISTRATIV_DATA_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__STATE = ADMINISTRATIV_DATA_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__REVISION_STATE = ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__VISIBILITY = ADMINISTRATIV_DATA_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SORT_KEY = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__NAME = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__TYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__SUBTYPE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT__CODE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_FEATURE_COUNT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>BTS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBJECT_OPERATION_COUNT = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusObject()
	 * @generated
	 */
	int BTS_CORPUS_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__LEASE = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__ID = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REV = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROJECT = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__RELATIONS = BTS_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PASSPORT = BTS_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PARENT = BTS_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CORPUS_PREFIX = BTS_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CHILDREN = BTS_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__WORK_PHASE = BTS_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTCObject()
	 * @generated
	 */
	int BTSTC_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextImpl <em>BTS Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSText()
	 * @generated
	 */
	int BTS_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Text Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TEXT_ITEMS = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl <em>BTS Referencable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReferencableItem()
	 * @generated
	 */
	int BTS_REFERENCABLE_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REVISIONS = BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__STATE = BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__REVISION_STATE = BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__VISIBILITY = BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__SORT_KEY = BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__NAME = BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__TYPE = BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__SUBTYPE = BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__CODE = BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__ID = BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__COMMENT = BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT = BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM__PARENT_ID = BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_FEATURE_COUNT = BTS_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS Referencable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCABLE_ITEM_OPERATION_COUNT = BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.BTSTextItems
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextItems()
	 * @generated
	 */
	int BTS_TEXT_ITEMS = 5;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSenctence()
	 * @generated
	 */
	int BTS_SENCTENCE = 2;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISIONS = BTS_TEXT_ITEMS__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__STATE = BTS_TEXT_ITEMS__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISION_STATE = BTS_TEXT_ITEMS__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__VISIBILITY = BTS_TEXT_ITEMS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SORT_KEY = BTS_TEXT_ITEMS__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__NAME = BTS_TEXT_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TYPE = BTS_TEXT_ITEMS__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SUBTYPE = BTS_TEXT_ITEMS__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__CODE = BTS_TEXT_ITEMS__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__ID = BTS_TEXT_ITEMS__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__COMMENT = BTS_TEXT_ITEMS__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT = BTS_TEXT_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT_ID = BTS_TEXT_ITEMS__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Sentence Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SENTENCE_ITEMS = BTS_TEXT_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TRANSLATION = BTS_TEXT_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_FEATURE_COUNT = BTS_TEXT_ITEMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_OPERATION_COUNT = BTS_TEXT_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSSentenceItemsImpl <em>BTS Sentence Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSSentenceItemsImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSentenceItems()
	 * @generated
	 */
	int BTS_SENTENCE_ITEMS = 6;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Sentence Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Sentence Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEMS_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl <em>BTS Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWordImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWord()
	 * @generated
	 */
	int BTS_WORD = 3;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISIONS = BTS_SENTENCE_ITEMS__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__STATE = BTS_SENTENCE_ITEMS__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISION_STATE = BTS_SENTENCE_ITEMS__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VISIBILITY = BTS_SENTENCE_ITEMS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SORT_KEY = BTS_SENTENCE_ITEMS__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__NAME = BTS_SENTENCE_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TYPE = BTS_SENTENCE_ITEMS__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SUBTYPE = BTS_SENTENCE_ITEMS__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__CODE = BTS_SENTENCE_ITEMS__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__ID = BTS_SENTENCE_ITEMS__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__COMMENT = BTS_SENTENCE_ITEMS__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT = BTS_SENTENCE_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT_ID = BTS_SENTENCE_ITEMS__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TRANSLATION = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>WType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WTYPE = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LTYPE = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LKEY = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flex Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__FLEX_CODE = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WChar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WCHAR = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VALUE = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__GRAPHICS = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_FEATURE_COUNT = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_OPERATION_COUNT = BTS_SENTENCE_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextSentenceItem()
	 * @generated
	 */
	int BTS_TEXT_SENTENCE_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISIONS = BTS_SENTENCE_ITEMS__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__STATE = BTS_SENTENCE_ITEMS__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISION_STATE = BTS_SENTENCE_ITEMS__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__VISIBILITY = BTS_SENTENCE_ITEMS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SORT_KEY = BTS_SENTENCE_ITEMS__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__NAME = BTS_SENTENCE_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__TYPE = BTS_SENTENCE_ITEMS__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SUBTYPE = BTS_SENTENCE_ITEMS__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__CODE = BTS_SENTENCE_ITEMS__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__ID = BTS_SENTENCE_ITEMS__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__COMMENT = BTS_SENTENCE_ITEMS__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT = BTS_SENTENCE_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT_ID = BTS_SENTENCE_ITEMS__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT = BTS_SENTENCE_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT = BTS_SENTENCE_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDelimiterImpl <em>BTS Delimiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDelimiterImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDelimiter()
	 * @generated
	 */
	int BTS_DELIMITER = 4;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__REVISIONS = BTS_TEXT_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__STATE = BTS_TEXT_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__REVISION_STATE = BTS_TEXT_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__VISIBILITY = BTS_TEXT_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__SORT_KEY = BTS_TEXT_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__NAME = BTS_TEXT_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__TYPE = BTS_TEXT_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__SUBTYPE = BTS_TEXT_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__CODE = BTS_TEXT_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__ID = BTS_TEXT_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__COMMENT = BTS_TEXT_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__PARENT = BTS_TEXT_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__PARENT_ID = BTS_TEXT_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER__VALUE = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Delimiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER_FEATURE_COUNT = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Delimiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DELIMITER_OPERATION_COUNT = BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListEntryImpl <em>BTS List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListEntry()
	 * @generated
	 */
	int BTS_LIST_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__IGNORE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__SUBENTRIES = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY__WORDS = BTS_CORPUS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassport()
	 * @generated
	 */
	int BTS_PASSPORT = 8;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__BIBLIOGRAPHY = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Wb Slips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_SLIPS = 3;

	/**
	 * The feature id for the '<em><b>Wb Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROVENANCE = 5;

	/**
	 * The feature id for the '<em><b>Passport Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PASSPORT_ENTRIES = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DESCRIPTIONS = 8;

	/**
	 * The number of structural features of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalence()
	 * @generated
	 */
	int BTS_AMBIVALENCE = 11;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISIONS = BTS_TEXT_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__STATE = BTS_TEXT_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISION_STATE = BTS_TEXT_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__VISIBILITY = BTS_TEXT_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SORT_KEY = BTS_TEXT_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__NAME = BTS_TEXT_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__TYPE = BTS_TEXT_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SUBTYPE = BTS_TEXT_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CODE = BTS_TEXT_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__ID = BTS_TEXT_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__COMMENT = BTS_TEXT_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT = BTS_TEXT_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT_ID = BTS_TEXT_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CASES = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_FEATURE_COUNT = BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_OPERATION_COUNT = BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLemmaCase()
	 * @generated
	 */
	int BTS_LEMMA_CASE = 12;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SCENARIO = 0;

	/**
	 * The number of structural features of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl <em>BTS Observable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObservableObject()
	 * @generated
	 */
	int BTS_OBSERVABLE_OBJECT = 43;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT = 0;

	/**
	 * The number of structural features of the '<em>BTS Observable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = 1;

	/**
	 * The number of operations of the '<em>BTS Observable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OBSERVABLE_OBJECT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl <em>BTSDB Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBBaseObject()
	 * @generated
	 */
	int BTSDB_BASE_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__LEASE = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__ID = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__REV = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT__PROJECT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_FEATURE_COUNT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTSDB Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_BASE_OBJECT_OPERATION_COUNT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl <em>BTS User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSUserImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUser()
	 * @generated
	 */
	int BTS_USER = 13;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__LEASE = BTSDB_BASE_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__GROUP_IDS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SIGLE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__DESCRIPTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Web Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_DESCRIPTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__USER_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__FORE_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__SURE_NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__MAIL = BTSDB_BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__WEB_URL = BTSDB_BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__COMMENT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>External Referneces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__EXTERNAL_REFERNECES = BTSDB_BASE_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER__ROLES = BTSDB_BASE_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCommentImpl <em>BTS Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCommentImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSComment()
	 * @generated
	 */
	int BTS_COMMENT = 14;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISIONS = ADMINISTRATIV_DATA_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__STATE = ADMINISTRATIV_DATA_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REVISION_STATE = ADMINISTRATIV_DATA_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__VISIBILITY = ADMINISTRATIV_DATA_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROPERTY_CHANGE_SUPPORT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__LEASE = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__ID = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REV = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__PROJECT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__COMMENT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__REFERENCES = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT__TAGS = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_FEATURE_COUNT = ADMINISTRATIV_DATA_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_COMMENT_OPERATION_COUNT = ADMINISTRATIV_DATA_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl <em>BTS Inter Text Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSInterTextReference()
	 * @generated
	 */
	int BTS_INTER_TEXT_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Begin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE__BEGIN_ID = 0;

	/**
	 * The feature id for the '<em><b>End Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE__END_ID = 1;

	/**
	 * The number of structural features of the '<em>BTS Inter Text Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BTS Inter Text Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_INTER_TEXT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferenceImpl <em>BTS Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReference()
	 * @generated
	 */
	int BTS_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE__OBJECT_ID = 1;

	/**
	 * The number of structural features of the '<em>BTS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BTS Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAnnotation()
	 * @generated
	 */
	int BTS_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REFERENCES = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationImpl <em>BTS Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslation()
	 * @generated
	 */
	int BTS_TRANSLATION = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION__LANG = 2;

	/**
	 * The number of structural features of the '<em>BTS Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl <em>BTS Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDateImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDate()
	 * @generated
	 */
	int BTS_DATE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__MONTH = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__DAY = 3;

	/**
	 * The feature id for the '<em><b>Relative Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE__RELATIVE_REF = 4;

	/**
	 * The number of structural features of the '<em>BTS Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BTS Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntry()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__SUBENTRIES = 5;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl <em>BTS Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRelationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRelation()
	 * @generated
	 */
	int BTS_RELATION = 22;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__OBJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__SUBTYPE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION__CERTAINTY = 4;

	/**
	 * The number of structural features of the '<em>BTS Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BTS Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl <em>BTS Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfiguration()
	 * @generated
	 */
	int BTS_CONFIGURATION = 23;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__LEASE = BTSDB_BASE_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__CHILDREN = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION__PROVIDER = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIGURATION_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextCorpus()
	 * @generated
	 */
	int BTS_TEXT_CORPUS = 25;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__HEADER = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl <em>BTS Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSRevisionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRevision()
	 * @generated
	 */
	int BTS_REVISION = 26;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__REF = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__TIME_STAMP = 2;

	/**
	 * The feature id for the '<em><b>Rights Revoked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION__RIGHTS_REVOKED = 3;

	/**
	 * The number of structural features of the '<em>BTS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BTS Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_REVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSLeaseImpl <em>BTS Lease</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSLeaseImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLease()
	 * @generated
	 */
	int BTS_LEASE = 27;

	/**
	 * The feature id for the '<em><b>Leasing User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEASE__LEASING_USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Lease Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEASE__LEASE_TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>BTS Lease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BTS Lease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSImageImpl <em>BTS Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSImageImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSImage()
	 * @generated
	 */
	int BTS_IMAGE = 28;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__MEDIA_TYPE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get Attachement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___GET_ATTACHEMENT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusHeader()
	 * @generated
	 */
	int BTS_CORPUS_HEADER = 29;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__AUTHOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_ID = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_NAME = 2;

	/**
	 * The number of structural features of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTimespanImpl <em>BTS Timespan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTimespanImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTimespan()
	 * @generated
	 */
	int BTS_TIMESPAN = 30;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__TO = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>BTS Timespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Timespan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TIMESPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl <em>BTS External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSExternalReference()
	 * @generated
	 */
	int BTS_EXTERNAL_REFERENCE = 32;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_EXTERNAL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSGraphicImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSGraphic()
	 * @generated
	 */
	int BTS_GRAPHIC = 34;

	/**
	 * The feature id for the '<em><b>Inner Sentence Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__INNER_SENTENCE_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__CODE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl <em>BTS Translations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslations()
	 * @generated
	 */
	int BTS_TRANSLATIONS = 35;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS__TRANSLATIONS = 0;

	/**
	 * The number of structural features of the '<em>BTS Translations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Translations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TRANSLATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigImpl <em>BTS Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfig()
	 * @generated
	 */
	int BTS_CONFIG = 42;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>BTS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl <em>BTS Config Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfigItem()
	 * @generated
	 */
	int BTS_CONFIG_ITEM = 36;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__CHILDREN = BTS_CONFIG__CHILDREN;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__VALUE = BTS_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__LABEL = BTS_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__DESCRIPTION = BTS_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SORT_KEY = BTS_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__IGNORE = BTS_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passport Editor Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG = BTS_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__TYPE = BTS_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SUBTYPE = BTS_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owner Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__OWNER_TYPE = BTS_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__REFERENCED_TYPE = BTS_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__RULES = BTS_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Show Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM__SHOW_WIDGET = BTS_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>BTS Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM_FEATURE_COUNT = BTS_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CONFIG_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CONFIG_ITEM_OPERATION_COUNT = BTS_CONFIG_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl <em>BTS Passport Editor Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEditorConfig()
	 * @generated
	 */
	int BTS_PASSPORT_EDITOR_CONFIG = 37;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE = 2;

	/**
	 * The feature id for the '<em><b>Horizontal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG__REGEX = 4;

	/**
	 * The number of structural features of the '<em>BTS Passport Editor Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BTS Passport Editor Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_EDITOR_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl <em>BTS User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUserGroup()
	 * @generated
	 */
	int BTS_USER_GROUP = 38;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__LEASE = BTSDB_BASE_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISIONS = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__REVISION_STATE = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__VISIBILITY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__CATEGORY = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP__COMMENT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_USER_GROUP_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListImpl <em>BTS List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSList()
	 * @generated
	 */
	int BTS_LIST = 39;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl <em>BTS Pp Subentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPpSubentry()
	 * @generated
	 */
	int BTS_PP_SUBENTRY = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__SUBTYPE = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__KEY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Sub Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__SUB_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__NAME = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__EXTERNAL_REFERENCES = 8;

	/**
	 * The feature id for the '<em><b>Timespan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__TIMESPAN = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY__TRANSLATION = 11;

	/**
	 * The number of structural features of the '<em>BTS Pp Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>BTS Pp Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PP_SUBENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl <em>BTS List Subentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListSubentry()
	 * @generated
	 */
	int BTS_LIST_SUBENTRY = 41;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__REVISIONS = BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__STATE = BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__REVISION_STATE = BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__VISIBILITY = BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__SORT_KEY = BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__NAME = BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__TYPE = BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__SUBTYPE = BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__CODE = BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__ID = BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__COMMENT = BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PARENT = BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PARENT_ID = BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__PASSPORT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY__WORDS = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS List Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY_FEATURE_COUNT = BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BTS List Subentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LIST_SUBENTRY_OPERATION_COUNT = BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSThsEntry()
	 * @generated
	 */
	int BTS_THS_ENTRY = 44;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__LEASE = BTS_CORPUS_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PARENT = BTS_CORPUS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CHILDREN = BTS_CORPUS_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl <em>BTS Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSProjectImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProject()
	 * @generated
	 */
	int BTS_PROJECT = 45;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROPERTY_CHANGE_SUPPORT = BTSDB_BASE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Lease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__LEASE = BTSDB_BASE_OBJECT__LEASE;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__ID = BTSDB_BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__REV = BTSDB_BASE_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PROJECT = BTSDB_BASE_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__NAME = BTSDB_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__PREFIX = BTSDB_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DESCRIPTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Db Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT__DB_CONNECTION = BTSDB_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_FEATURE_COUNT = BTSDB_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTSDB_BASE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PROJECT_OPERATION_COUNT = BTSDB_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl <em>BTSDB Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBConnection()
	 * @generated
	 */
	int BTSDB_CONNECTION = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Master Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__MASTER_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Db Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION__DB_PATH = 2;

	/**
	 * The number of structural features of the '<em>BTSDB Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTSDB Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSDB_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl <em>BTS Workflow Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRule()
	 * @generated
	 */
	int BTS_WORKFLOW_RULE = 47;

	/**
	 * The feature id for the '<em><b>Sub Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__SUB_RULES = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Accept Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__ACCEPT_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__OCL = 3;

	/**
	 * The feature id for the '<em><b>Ocl Self Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__OCL_SELF_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Denial Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE__DENIAL_MESSAGE = 5;

	/**
	 * The number of structural features of the '<em>BTS Workflow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BTS Workflow Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl <em>BTS Workflow Rule Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRuleItem()
	 * @generated
	 */
	int BTS_WORKFLOW_RULE_ITEM = 49;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__PRIORITY = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM__IGNORE = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS Workflow Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT = BTS_OBSERVABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Workflow Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORKFLOW_RULE_ITEM_OPERATION_COUNT = BTS_OBSERVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.btsmodel.impl.BTSOperatorImpl <em>BTS Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.btsmodel.impl.BTSOperatorImpl
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSOperator()
	 * @generated
	 */
	int BTS_OPERATOR = 48;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__PROPERTY_CHANGE_SUPPORT = BTS_WORKFLOW_RULE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__PRIORITY = BTS_WORKFLOW_RULE_ITEM__PRIORITY;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__IGNORE = BTS_WORKFLOW_RULE_ITEM__IGNORE;

	/**
	 * The feature id for the '<em><b>Opperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR__OPPERATOR = BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR_FEATURE_COUNT = BTS_WORKFLOW_RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_WORKFLOW_RULE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_WORKFLOW_RULE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_OPERATOR_OPERATION_COUNT = BTS_WORKFLOW_RULE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Property Change Support</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeSupport
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeSupport()
	 * @generated
	 */
	int PROPERTY_CHANGE_SUPPORT = 50;

	/**
	 * The meta object id for the '<em>Property Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeListener
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeListener()
	 * @generated
	 */
	int PROPERTY_CHANGE_LISTENER = 51;

	/**
	 * The meta object id for the '<em>Property Change Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.beans.PropertyChangeEvent
	 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeEvent()
	 * @generated
	 */
	int PROPERTY_CHANGE_EVENT = 52;


	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTCObject <em>BTSTC Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSTC Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTCObject
	 * @generated
	 */
	EClass getBTSTCObject();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSText <em>BTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSText
	 * @generated
	 */
	EClass getBTSText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSText#getTextItems <em>Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSText#getTextItems()
	 * @see #getBTSText()
	 * @generated
	 */
	EReference getBTSText_TextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSSenctence <em>BTS Senctence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Senctence</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence
	 * @generated
	 */
	EClass getBTSSenctence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSSenctence#getSentenceItems <em>Sentence Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentence Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence#getSentenceItems()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_SentenceItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSSenctence#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSenctence#getTranslation()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_Translation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWord <em>BTS Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Word</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord
	 * @generated
	 */
	EClass getBTSWord();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSWord#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getTranslation()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getWType <em>WType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WType</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getWType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getLType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LType</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getLType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getLKey <em>LKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LKey</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getLKey()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getFlexCode <em>Flex Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flex Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getFlexCode()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_FlexCode();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getWChar <em>WChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WChar</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getWChar()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WChar();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getValue()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSWord#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphics</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWord#getGraphics()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Graphics();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDelimiter <em>BTS Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Delimiter</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDelimiter
	 * @generated
	 */
	EClass getBTSDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDelimiter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDelimiter#getValue()
	 * @see #getBTSDelimiter()
	 * @generated
	 */
	EAttribute getBTSDelimiter_Value();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextItems
	 * @generated
	 */
	EClass getBTSTextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSSentenceItems <em>BTS Sentence Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Sentence Items</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSSentenceItems
	 * @generated
	 */
	EClass getBTSSentenceItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSListEntry <em>BTS List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry
	 * @generated
	 */
	EClass getBTSListEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSListEntry#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#isIgnore()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EAttribute getBTSListEntry_Ignore();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListEntry#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subentries</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#getSubentries()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EReference getBTSListEntry_Subentries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListEntry#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListEntry#getWords()
	 * @see #getBTSListEntry()
	 * @generated
	 */
	EReference getBTSListEntry_Words();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassport <em>BTS Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport
	 * @generated
	 */
	EClass getBTSPassport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getProtocol()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliography</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getBibliography()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Bibliography();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPassport#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getDate()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getWbSlips <em>Wb Slips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Slips</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getWbSlips()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbSlips();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getWbFolder <em>Wb Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Folder</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getWbFolder()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provenance</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getProvenance()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassport#getPassportEntries <em>Passport Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passport Entries</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getPassportEntries()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_PassportEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassport#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getComment()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassport#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassport#getDescriptions()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Descriptions();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.AdministrativDataObject <em>Administrativ Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrativ Data Object</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject
	 * @generated
	 */
	EClass getAdministrativDataObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisions()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EReference getAdministrativDataObject_Revisions();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getState()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_State();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState <em>Revision State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision State</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getRevisionState()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_RevisionState();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.bbaw.bts.btsmodel.AdministrativDataObject#getVisibility()
	 * @see #getAdministrativDataObject()
	 * @generated
	 */
	EAttribute getAdministrativDataObject_Visibility();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSObject <em>BTS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject
	 * @generated
	 */
	EClass getBTSObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getSortKey <em>Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getSortKey()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_SortKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getName()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getType()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getSubtype()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObject#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObject#getCode()
	 * @see #getBTSObject()
	 * @generated
	 */
	EAttribute getBTSObject_Code();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSAmbivalence <em>BTS Ambivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ambivalence</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalence
	 * @generated
	 */
	EClass getBTSAmbivalence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSAmbivalence#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAmbivalence#getCases()
	 * @see #getBTSAmbivalence()
	 * @generated
	 */
	EReference getBTSAmbivalence_Cases();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSLemmaCase <em>BTS Lemma Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Lemma Case</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLemmaCase
	 * @generated
	 */
	EClass getBTSLemmaCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSLemmaCase#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLemmaCase#getScenario()
	 * @see #getBTSLemmaCase()
	 * @generated
	 */
	EReference getBTSLemmaCase_Scenario();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSUser <em>BTS User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS User</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser
	 * @generated
	 */
	EClass getBTSUser();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSUser#getGroupIds <em>Group Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group Ids</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getGroupIds()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_GroupIds();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getSigle <em>Sigle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigle</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getSigle()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Sigle();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getDescription()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getWebDescription <em>Web Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getWebDescription()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_WebDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getUserName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getForeName <em>Fore Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fore Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getForeName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_ForeName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getSureName <em>Sure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sure Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getSureName()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_SureName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getMail()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Mail();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getWebURL <em>Web URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web URL</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getWebURL()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_WebURL();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUser#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getComment()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSUser#getExternalReferneces <em>External Referneces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Referneces</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getExternalReferneces()
	 * @see #getBTSUser()
	 * @generated
	 */
	EReference getBTSUser_ExternalReferneces();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSUser#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUser#getRoles()
	 * @see #getBTSUser()
	 * @generated
	 */
	EAttribute getBTSUser_Roles();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSComment <em>BTS Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment
	 * @generated
	 */
	EClass getBTSComment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getComment()
	 * @see #getBTSComment()
	 * @generated
	 */
	EAttribute getBTSComment_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSComment#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getReferences()
	 * @see #getBTSComment()
	 * @generated
	 */
	EReference getBTSComment_References();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSComment#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSComment#getTags()
	 * @see #getBTSComment()
	 * @generated
	 */
	EAttribute getBTSComment_Tags();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSInterTextReference <em>BTS Inter Text Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Inter Text Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference
	 * @generated
	 */
	EClass getBTSInterTextReference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId <em>Begin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference#getBeginId()
	 * @see #getBTSInterTextReference()
	 * @generated
	 */
	EAttribute getBTSInterTextReference_BeginId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId <em>End Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSInterTextReference#getEndId()
	 * @see #getBTSInterTextReference()
	 * @generated
	 */
	EAttribute getBTSInterTextReference_EndId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextSentenceItem <em>BTS Text Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Sentence Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextSentenceItem
	 * @generated
	 */
	EClass getBTSTextSentenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSReference <em>BTS Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference
	 * @generated
	 */
	EClass getBTSReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSReference#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference#getParts()
	 * @see #getBTSReference()
	 * @generated
	 */
	EReference getBTSReference_Parts();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReference#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReference#getObjectId()
	 * @see #getBTSReference()
	 * @generated
	 */
	EAttribute getBTSReference_ObjectId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSAnnotation <em>BTS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Annotation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAnnotation
	 * @generated
	 */
	EClass getBTSAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSAnnotation#getReferences()
	 * @see #getBTSAnnotation()
	 * @generated
	 */
	EReference getBTSAnnotation_References();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTranslation <em>BTS Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation
	 * @generated
	 */
	EClass getBTSTranslation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getValue()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getType()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTranslation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslation#getLang()
	 * @see #getBTSTranslation()
	 * @generated
	 */
	EAttribute getBTSTranslation_Lang();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDate <em>BTS Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Date</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate
	 * @generated
	 */
	EClass getBTSDate();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getType()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getYear()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getMonth()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getDay()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDate#getRelativeRef <em>Relative Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Ref</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDate#getRelativeRef()
	 * @see #getBTSDate()
	 * @generated
	 */
	EAttribute getBTSDate_RelativeRef();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEntry <em>BTS Passport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry
	 * @generated
	 */
	EClass getBTSPassportEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getProvider()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getComment()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getType()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getValue()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getCategory()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPassportEntry#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subentries</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEntry#getSubentries()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EReference getBTSPassportEntry_Subentries();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSRelation <em>BTS Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Relation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation
	 * @generated
	 */
	EClass getBTSRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getObjectId()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_ObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getType()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getSubtype()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getComment()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRelation#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certainty</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRelation#getCertainty()
	 * @see #getBTSRelation()
	 * @generated
	 */
	EAttribute getBTSRelation_Certainty();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfiguration <em>BTS Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Configuration</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration
	 * @generated
	 */
	EClass getBTSConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration#getName()
	 * @see #getBTSConfiguration()
	 * @generated
	 */
	EAttribute getBTSConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfiguration#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfiguration#getProvider()
	 * @see #getBTSConfiguration()
	 * @generated
	 */
	EAttribute getBTSConfiguration_Provider();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject <em>BTSDB Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSDB Base Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject
	 * @generated
	 */
	EClass getBTSDBBaseObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getLease <em>Lease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lease</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getLease()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EReference getBTSDBBaseObject_Lease();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_id <em>id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#get_id()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject__id();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>rev</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject__rev();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject()
	 * @see #getBTSDBBaseObject()
	 * @generated
	 */
	EAttribute getBTSDBBaseObject_Project();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTextCorpus <em>BTS Text Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Corpus</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextCorpus
	 * @generated
	 */
	EClass getBTSTextCorpus();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTextCorpus#getHeader()
	 * @see #getBTSTextCorpus()
	 * @generated
	 */
	EReference getBTSTextCorpus_Header();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSRevision <em>BTS Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Revision</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision
	 * @generated
	 */
	EClass getBTSRevision();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getRef()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getUserId()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#getTimeStamp()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSRevision#isRightsRevoked <em>Rights Revoked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights Revoked</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSRevision#isRightsRevoked()
	 * @see #getBTSRevision()
	 * @generated
	 */
	EAttribute getBTSRevision_RightsRevoked();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSLease <em>BTS Lease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Lease</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLease
	 * @generated
	 */
	EClass getBTSLease();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSLease#getLeasingUserId <em>Leasing User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leasing User Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLease#getLeasingUserId()
	 * @see #getBTSLease()
	 * @generated
	 */
	EAttribute getBTSLease_LeasingUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSLease#getLeaseTimeStamp <em>Lease Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lease Time Stamp</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSLease#getLeaseTimeStamp()
	 * @see #getBTSLease()
	 * @generated
	 */
	EAttribute getBTSLease_LeaseTimeStamp();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSImage <em>BTS Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Image</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSImage
	 * @generated
	 */
	EClass getBTSImage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSImage#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSImage#getMediaType()
	 * @see #getBTSImage()
	 * @generated
	 */
	EAttribute getBTSImage_MediaType();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSImage#getAttachement() <em>Get Attachement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachement</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSImage#getAttachement()
	 * @generated
	 */
	EOperation getBTSImage__GetAttachement();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader <em>BTS Corpus Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Header</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader
	 * @generated
	 */
	EClass getBTSCorpusHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getAuthorName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectId()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusHeader#getProjectName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectName();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTimespan <em>BTS Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Timespan</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan
	 * @generated
	 */
	EClass getBTSTimespan();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTimespan#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getFrom()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EReference getBTSTimespan_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSTimespan#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getTo()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EReference getBTSTimespan_To();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSTimespan#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTimespan#getComment()
	 * @see #getBTSTimespan()
	 * @generated
	 */
	EAttribute getBTSTimespan_Comment();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSCorpusObject <em>BTS Corpus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject
	 * @generated
	 */
	EClass getBTSCorpusObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getRelations()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getPassport <em>Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getPassport()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Passport();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getParent()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus Prefix</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getCorpusPrefix()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_CorpusPrefix();

	/**
	 * Returns the meta object for the reference list '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getChildren()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Phase</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSCorpusObject#getWorkPhase()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_WorkPhase();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSExternalReference <em>BTS External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS External Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference
	 * @generated
	 */
	EClass getBTSExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getReference()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getProvider()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSExternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSExternalReference#getType()
	 * @see #getBTSExternalReference()
	 * @generated
	 */
	EAttribute getBTSExternalReference_Type();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSReferencableItem <em>BTS Referencable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Referencable Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem
	 * @generated
	 */
	EClass getBTSReferencableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getId()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EAttribute getBTSReferencableItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getComment()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EAttribute getBTSReferencableItem_Comment();

	/**
	 * Returns the meta object for the reference '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getParent()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EReference getBTSReferencableItem_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSReferencableItem#getParentId()
	 * @see #getBTSReferencableItem()
	 * @generated
	 */
	EAttribute getBTSReferencableItem_ParentId();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSGraphic <em>BTS Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Graphic</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic
	 * @generated
	 */
	EClass getBTSGraphic();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder <em>Inner Sentence Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Sentence Order</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getInnerSentenceOrder()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_InnerSentenceOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getCode()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSGraphic#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSGraphic#getReference()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Reference();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSTranslations <em>BTS Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Translations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations
	 * @generated
	 */
	EClass getBTSTranslations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSTranslations#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSTranslations#getTranslations()
	 * @see #getBTSTranslations()
	 * @generated
	 */
	EReference getBTSTranslations_Translations();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfigItem <em>BTS Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Config Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem
	 * @generated
	 */
	EClass getBTSConfigItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getValue()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getLabel()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getDescription()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey <em>Sort Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getSortKey()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_SortKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#isIgnore()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Ignore();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig <em>Passport Editor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport Editor Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getPassportEditorConfig()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_PassportEditorConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getType()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getSubtype()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_Subtype();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Owner Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getOwnerType()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_OwnerType();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getReferencedType <em>Referenced Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Referenced Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getReferencedType()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_ReferencedType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSConfigItem#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#getRules()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EReference getBTSConfigItem_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget <em>Show Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Widget</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfigItem#isShowWidget()
	 * @see #getBTSConfigItem()
	 * @generated
	 */
	EAttribute getBTSConfigItem_ShowWidget();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig <em>BTS Passport Editor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Editor Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig
	 * @generated
	 */
	EClass getBTSPassportEditorConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getWidgetType()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_WidgetType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isRequired()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple <em>Allow Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#isAllowMultiple()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_AllowMultiple();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth <em>Horizontal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Width</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getHorizontalWidth()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_HorizontalWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig#getRegex()
	 * @see #getBTSPassportEditorConfig()
	 * @generated
	 */
	EAttribute getBTSPassportEditorConfig_Regex();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSUserGroup <em>BTS User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS User Group</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup
	 * @generated
	 */
	EClass getBTSUserGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUserGroup#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup#getCategory()
	 * @see #getBTSUserGroup()
	 * @generated
	 */
	EAttribute getBTSUserGroup_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSUserGroup#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSUserGroup#getComment()
	 * @see #getBTSUserGroup()
	 * @generated
	 */
	EAttribute getBTSUserGroup_Comment();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSList <em>BTS List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSList
	 * @generated
	 */
	EClass getBTSList();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSPpSubentry <em>BTS Pp Subentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Pp Subentry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry
	 * @generated
	 */
	EClass getBTSPpSubentry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getType()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getSubtype()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getKey()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getValue()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getSubValue <em>Sub Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Value</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getSubValue()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_SubValue();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getProvider()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getName()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getComment()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EAttribute getBTSPpSubentry_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getExternalReferences()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EReference getBTSPpSubentry_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getTimespan <em>Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timespan</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getTimespan()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EReference getBTSPpSubentry_Timespan();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getDescription()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EReference getBTSPpSubentry_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSPpSubentry#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSPpSubentry#getTranslation()
	 * @see #getBTSPpSubentry()
	 * @generated
	 */
	EReference getBTSPpSubentry_Translation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSListSubentry <em>BTS List Subentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS List Subentry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry
	 * @generated
	 */
	EClass getBTSListSubentry();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSListSubentry#getPassport <em>Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry#getPassport()
	 * @see #getBTSListSubentry()
	 * @generated
	 */
	EReference getBTSListSubentry_Passport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSListSubentry#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSListSubentry#getWords()
	 * @see #getBTSListSubentry()
	 * @generated
	 */
	EReference getBTSListSubentry_Words();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSConfig <em>BTS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Config</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfig
	 * @generated
	 */
	EClass getBTSConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSConfig#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSConfig#getChildren()
	 * @see #getBTSConfig()
	 * @generated
	 */
	EReference getBTSConfig_Children();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSObservableObject <em>BTS Observable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Observable Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject
	 * @generated
	 */
	EClass getBTSObservableObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Change Support</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#getPropertyChangeSupport()
	 * @see #getBTSObservableObject()
	 * @generated
	 */
	EAttribute getBTSObservableObject_PropertyChangeSupport();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSObservableObject#addPropertyChangeListener(java.beans.PropertyChangeListener) <em>Add Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.btsmodel.BTSObservableObject#removePropertyChangeListener(java.beans.PropertyChangeListener) <em>Remove Property Change Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property Change Listener</em>' operation.
	 * @see org.bbaw.bts.btsmodel.BTSObservableObject#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 * @generated
	 */
	EOperation getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSThsEntry <em>BTS Ths Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ths Entry</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSThsEntry
	 * @generated
	 */
	EClass getBTSThsEntry();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSProject <em>BTS Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Project</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject
	 * @generated
	 */
	EClass getBTSProject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getName()
	 * @see #getBTSProject()
	 * @generated
	 */
	EAttribute getBTSProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProject#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getPrefix()
	 * @see #getBTSProject()
	 * @generated
	 */
	EAttribute getBTSProject_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSProject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getDescription()
	 * @see #getBTSProject()
	 * @generated
	 */
	EAttribute getBTSProject_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.btsmodel.BTSProject#getDbConnection <em>Db Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Db Connection</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSProject#getDbConnection()
	 * @see #getBTSProject()
	 * @generated
	 */
	EReference getBTSProject_DbConnection();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSDBConnection <em>BTSDB Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSDB Connection</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection
	 * @generated
	 */
	EClass getBTSDBConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getType()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer <em>Master Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Server</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getMasterServer()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_MasterServer();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath <em>Db Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Path</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSDBConnection#getDbPath()
	 * @see #getBTSDBConnection()
	 * @generated
	 */
	EAttribute getBTSDBConnection_DbPath();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule <em>BTS Workflow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Workflow Rule</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule
	 * @generated
	 */
	EClass getBTSWorkflowRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules <em>Sub Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Rules</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getSubRules()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EReference getBTSWorkflowRule_SubRules();

	/**
	 * Returns the meta object for the attribute list '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getActions()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage <em>Accept Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Message</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getAcceptMessage()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_AcceptMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl <em>Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getOcl()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_Ocl();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject <em>Ocl Self Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Self Object</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getOclSelfObject()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_OclSelfObject();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage <em>Denial Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denial Message</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRule#getDenialMessage()
	 * @see #getBTSWorkflowRule()
	 * @generated
	 */
	EAttribute getBTSWorkflowRule_DenialMessage();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSOperator <em>BTS Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Operator</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSOperator
	 * @generated
	 */
	EClass getBTSOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSOperator#getOpperator <em>Opperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opperator</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSOperator#getOpperator()
	 * @see #getBTSOperator()
	 * @generated
	 */
	EAttribute getBTSOperator_Opperator();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem <em>BTS Workflow Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Workflow Rule Item</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem
	 * @generated
	 */
	EClass getBTSWorkflowRuleItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#getPriority()
	 * @see #getBTSWorkflowRuleItem()
	 * @generated
	 */
	EAttribute getBTSWorkflowRuleItem_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem#isIgnore()
	 * @see #getBTSWorkflowRuleItem()
	 * @generated
	 */
	EAttribute getBTSWorkflowRuleItem_Ignore();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeSupport <em>Property Change Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Support</em>'.
	 * @see java.beans.PropertyChangeSupport
	 * @model instanceClass="java.beans.PropertyChangeSupport" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeSupport();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeListener <em>Property Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Listener</em>'.
	 * @see java.beans.PropertyChangeListener
	 * @model instanceClass="java.beans.PropertyChangeListener" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeListener();

	/**
	 * Returns the meta object for data type '{@link java.beans.PropertyChangeEvent <em>Property Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Change Event</em>'.
	 * @see java.beans.PropertyChangeEvent
	 * @model instanceClass="java.beans.PropertyChangeEvent" serializeable="false"
	 * @generated
	 */
	EDataType getPropertyChangeEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtsmodelFactory getBtsmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTCObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTCObject()
		 * @generated
		 */
		EClass BTSTC_OBJECT = eINSTANCE.getBTSTCObject();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextImpl <em>BTS Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSText()
		 * @generated
		 */
		EClass BTS_TEXT = eINSTANCE.getBTSText();

		/**
		 * The meta object literal for the '<em><b>Text Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT__TEXT_ITEMS = eINSTANCE.getBTSText_TextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSSenctenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSenctence()
		 * @generated
		 */
		EClass BTS_SENCTENCE = eINSTANCE.getBTSSenctence();

		/**
		 * The meta object literal for the '<em><b>Sentence Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__SENTENCE_ITEMS = eINSTANCE.getBTSSenctence_SentenceItems();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__TRANSLATION = eINSTANCE.getBTSSenctence_Translation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWordImpl <em>BTS Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWordImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWord()
		 * @generated
		 */
		EClass BTS_WORD = eINSTANCE.getBTSWord();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__TRANSLATION = eINSTANCE.getBTSWord_Translation();

		/**
		 * The meta object literal for the '<em><b>WType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WTYPE = eINSTANCE.getBTSWord_WType();

		/**
		 * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LTYPE = eINSTANCE.getBTSWord_LType();

		/**
		 * The meta object literal for the '<em><b>LKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LKEY = eINSTANCE.getBTSWord_LKey();

		/**
		 * The meta object literal for the '<em><b>Flex Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__FLEX_CODE = eINSTANCE.getBTSWord_FlexCode();

		/**
		 * The meta object literal for the '<em><b>WChar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WCHAR = eINSTANCE.getBTSWord_WChar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__VALUE = eINSTANCE.getBTSWord_Value();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__GRAPHICS = eINSTANCE.getBTSWord_Graphics();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDelimiterImpl <em>BTS Delimiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDelimiterImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDelimiter()
		 * @generated
		 */
		EClass BTS_DELIMITER = eINSTANCE.getBTSDelimiter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DELIMITER__VALUE = eINSTANCE.getBTSDelimiter_Value();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.BTSTextItems <em>BTS Text Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.BTSTextItems
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextItems()
		 * @generated
		 */
		EClass BTS_TEXT_ITEMS = eINSTANCE.getBTSTextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSSentenceItemsImpl <em>BTS Sentence Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSSentenceItemsImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSSentenceItems()
		 * @generated
		 */
		EClass BTS_SENTENCE_ITEMS = eINSTANCE.getBTSSentenceItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListEntryImpl <em>BTS List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListEntry()
		 * @generated
		 */
		EClass BTS_LIST_ENTRY = eINSTANCE.getBTSListEntry();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_LIST_ENTRY__IGNORE = eINSTANCE.getBTSListEntry_Ignore();

		/**
		 * The meta object literal for the '<em><b>Subentries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_ENTRY__SUBENTRIES = eINSTANCE.getBTSListEntry_Subentries();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_ENTRY__WORDS = eINSTANCE.getBTSListEntry_Words();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassport()
		 * @generated
		 */
		EClass BTS_PASSPORT = eINSTANCE.getBTSPassport();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROTOCOL = eINSTANCE.getBTSPassport_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__BIBLIOGRAPHY = eINSTANCE.getBTSPassport_Bibliography();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DATE = eINSTANCE.getBTSPassport_Date();

		/**
		 * The meta object literal for the '<em><b>Wb Slips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_SLIPS = eINSTANCE.getBTSPassport_WbSlips();

		/**
		 * The meta object literal for the '<em><b>Wb Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_FOLDER = eINSTANCE.getBTSPassport_WbFolder();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROVENANCE = eINSTANCE.getBTSPassport_Provenance();

		/**
		 * The meta object literal for the '<em><b>Passport Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__PASSPORT_ENTRIES = eINSTANCE.getBTSPassport_PassportEntries();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__COMMENT = eINSTANCE.getBTSPassport_Comment();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DESCRIPTIONS = eINSTANCE.getBTSPassport_Descriptions();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl <em>Administrativ Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.AdministrativDataObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getAdministrativDataObject()
		 * @generated
		 */
		EClass ADMINISTRATIV_DATA_OBJECT = eINSTANCE.getAdministrativDataObject();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATIV_DATA_OBJECT__REVISIONS = eINSTANCE.getAdministrativDataObject_Revisions();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__STATE = eINSTANCE.getAdministrativDataObject_State();

		/**
		 * The meta object literal for the '<em><b>Revision State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__REVISION_STATE = eINSTANCE.getAdministrativDataObject_RevisionState();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIV_DATA_OBJECT__VISIBILITY = eINSTANCE.getAdministrativDataObject_Visibility();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl <em>BTS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObject()
		 * @generated
		 */
		EClass BTS_OBJECT = eINSTANCE.getBTSObject();

		/**
		 * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__SORT_KEY = eINSTANCE.getBTSObject_SortKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__NAME = eINSTANCE.getBTSObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__TYPE = eINSTANCE.getBTSObject_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__SUBTYPE = eINSTANCE.getBTSObject_Subtype();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBJECT__CODE = eINSTANCE.getBTSObject_Code();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSAmbivalenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAmbivalence()
		 * @generated
		 */
		EClass BTS_AMBIVALENCE = eINSTANCE.getBTSAmbivalence();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_AMBIVALENCE__CASES = eINSTANCE.getBTSAmbivalence_Cases();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSLemmaCaseImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLemmaCase()
		 * @generated
		 */
		EClass BTS_LEMMA_CASE = eINSTANCE.getBTSLemmaCase();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LEMMA_CASE__SCENARIO = eINSTANCE.getBTSLemmaCase_Scenario();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserImpl <em>BTS User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSUserImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUser()
		 * @generated
		 */
		EClass BTS_USER = eINSTANCE.getBTSUser();

		/**
		 * The meta object literal for the '<em><b>Group Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__GROUP_IDS = eINSTANCE.getBTSUser_GroupIds();

		/**
		 * The meta object literal for the '<em><b>Sigle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__SIGLE = eINSTANCE.getBTSUser_Sigle();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__DESCRIPTION = eINSTANCE.getBTSUser_Description();

		/**
		 * The meta object literal for the '<em><b>Web Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__WEB_DESCRIPTION = eINSTANCE.getBTSUser_WebDescription();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__USER_NAME = eINSTANCE.getBTSUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Fore Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__FORE_NAME = eINSTANCE.getBTSUser_ForeName();

		/**
		 * The meta object literal for the '<em><b>Sure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__SURE_NAME = eINSTANCE.getBTSUser_SureName();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__MAIL = eINSTANCE.getBTSUser_Mail();

		/**
		 * The meta object literal for the '<em><b>Web URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__WEB_URL = eINSTANCE.getBTSUser_WebURL();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__COMMENT = eINSTANCE.getBTSUser_Comment();

		/**
		 * The meta object literal for the '<em><b>External Referneces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_USER__EXTERNAL_REFERNECES = eINSTANCE.getBTSUser_ExternalReferneces();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER__ROLES = eINSTANCE.getBTSUser_Roles();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCommentImpl <em>BTS Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCommentImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSComment()
		 * @generated
		 */
		EClass BTS_COMMENT = eINSTANCE.getBTSComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_COMMENT__COMMENT = eINSTANCE.getBTSComment_Comment();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_COMMENT__REFERENCES = eINSTANCE.getBTSComment_References();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_COMMENT__TAGS = eINSTANCE.getBTSComment_Tags();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl <em>BTS Inter Text Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSInterTextReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSInterTextReference()
		 * @generated
		 */
		EClass BTS_INTER_TEXT_REFERENCE = eINSTANCE.getBTSInterTextReference();

		/**
		 * The meta object literal for the '<em><b>Begin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_INTER_TEXT_REFERENCE__BEGIN_ID = eINSTANCE.getBTSInterTextReference_BeginId();

		/**
		 * The meta object literal for the '<em><b>End Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_INTER_TEXT_REFERENCE__END_ID = eINSTANCE.getBTSInterTextReference_EndId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextSentenceItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextSentenceItem()
		 * @generated
		 */
		EClass BTS_TEXT_SENTENCE_ITEM = eINSTANCE.getBTSTextSentenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferenceImpl <em>BTS Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReference()
		 * @generated
		 */
		EClass BTS_REFERENCE = eINSTANCE.getBTSReference();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_REFERENCE__PARTS = eINSTANCE.getBTSReference_Parts();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCE__OBJECT_ID = eINSTANCE.getBTSReference_ObjectId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSAnnotationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSAnnotation()
		 * @generated
		 */
		EClass BTS_ANNOTATION = eINSTANCE.getBTSAnnotation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_ANNOTATION__REFERENCES = eINSTANCE.getBTSAnnotation_References();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationImpl <em>BTS Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslation()
		 * @generated
		 */
		EClass BTS_TRANSLATION = eINSTANCE.getBTSTranslation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__VALUE = eINSTANCE.getBTSTranslation_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__TYPE = eINSTANCE.getBTSTranslation_Type();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TRANSLATION__LANG = eINSTANCE.getBTSTranslation_Lang();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDateImpl <em>BTS Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDateImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDate()
		 * @generated
		 */
		EClass BTS_DATE = eINSTANCE.getBTSDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__TYPE = eINSTANCE.getBTSDate_Type();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__YEAR = eINSTANCE.getBTSDate_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__MONTH = eINSTANCE.getBTSDate_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__DAY = eINSTANCE.getBTSDate_Day();

		/**
		 * The meta object literal for the '<em><b>Relative Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_DATE__RELATIVE_REF = eINSTANCE.getBTSDate_RelativeRef();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEntry()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY = eINSTANCE.getBTSPassportEntry();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__PROVIDER = eINSTANCE.getBTSPassportEntry_Provider();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__COMMENT = eINSTANCE.getBTSPassportEntry_Comment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__TYPE = eINSTANCE.getBTSPassportEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__VALUE = eINSTANCE.getBTSPassportEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__CATEGORY = eINSTANCE.getBTSPassportEntry_Category();

		/**
		 * The meta object literal for the '<em><b>Subentries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY__SUBENTRIES = eINSTANCE.getBTSPassportEntry_Subentries();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSRelationImpl <em>BTS Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSRelationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRelation()
		 * @generated
		 */
		EClass BTS_RELATION = eINSTANCE.getBTSRelation();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__OBJECT_ID = eINSTANCE.getBTSRelation_ObjectId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__TYPE = eINSTANCE.getBTSRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__SUBTYPE = eINSTANCE.getBTSRelation_Subtype();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__COMMENT = eINSTANCE.getBTSRelation_Comment();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_RELATION__CERTAINTY = eINSTANCE.getBTSRelation_Certainty();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl <em>BTS Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigurationImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfiguration()
		 * @generated
		 */
		EClass BTS_CONFIGURATION = eINSTANCE.getBTSConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIGURATION__NAME = eINSTANCE.getBTSConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIGURATION__PROVIDER = eINSTANCE.getBTSConfiguration_Provider();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl <em>BTSDB Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBBaseObject()
		 * @generated
		 */
		EClass BTSDB_BASE_OBJECT = eINSTANCE.getBTSDBBaseObject();

		/**
		 * The meta object literal for the '<em><b>Lease</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTSDB_BASE_OBJECT__LEASE = eINSTANCE.getBTSDBBaseObject_Lease();

		/**
		 * The meta object literal for the '<em><b>id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__ID = eINSTANCE.getBTSDBBaseObject__id();

		/**
		 * The meta object literal for the '<em><b>rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__REV = eINSTANCE.getBTSDBBaseObject__rev();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_BASE_OBJECT__PROJECT = eINSTANCE.getBTSDBBaseObject_Project();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTextCorpusImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTextCorpus()
		 * @generated
		 */
		EClass BTS_TEXT_CORPUS = eINSTANCE.getBTSTextCorpus();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT_CORPUS__HEADER = eINSTANCE.getBTSTextCorpus_Header();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSRevisionImpl <em>BTS Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSRevisionImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSRevision()
		 * @generated
		 */
		EClass BTS_REVISION = eINSTANCE.getBTSRevision();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__REF = eINSTANCE.getBTSRevision_Ref();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__USER_ID = eINSTANCE.getBTSRevision_UserId();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__TIME_STAMP = eINSTANCE.getBTSRevision_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Rights Revoked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REVISION__RIGHTS_REVOKED = eINSTANCE.getBTSRevision_RightsRevoked();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSLeaseImpl <em>BTS Lease</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSLeaseImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSLease()
		 * @generated
		 */
		EClass BTS_LEASE = eINSTANCE.getBTSLease();

		/**
		 * The meta object literal for the '<em><b>Leasing User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_LEASE__LEASING_USER_ID = eINSTANCE.getBTSLease_LeasingUserId();

		/**
		 * The meta object literal for the '<em><b>Lease Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_LEASE__LEASE_TIME_STAMP = eINSTANCE.getBTSLease_LeaseTimeStamp();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSImageImpl <em>BTS Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSImageImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSImage()
		 * @generated
		 */
		EClass BTS_IMAGE = eINSTANCE.getBTSImage();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_IMAGE__MEDIA_TYPE = eINSTANCE.getBTSImage_MediaType();

		/**
		 * The meta object literal for the '<em><b>Get Attachement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_IMAGE___GET_ATTACHEMENT = eINSTANCE.getBTSImage__GetAttachement();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusHeaderImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusHeader()
		 * @generated
		 */
		EClass BTS_CORPUS_HEADER = eINSTANCE.getBTSCorpusHeader();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__AUTHOR_NAME = eINSTANCE.getBTSCorpusHeader_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_ID = eINSTANCE.getBTSCorpusHeader_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_NAME = eINSTANCE.getBTSCorpusHeader_ProjectName();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTimespanImpl <em>BTS Timespan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTimespanImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTimespan()
		 * @generated
		 */
		EClass BTS_TIMESPAN = eINSTANCE.getBTSTimespan();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TIMESPAN__FROM = eINSTANCE.getBTSTimespan_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TIMESPAN__TO = eINSTANCE.getBTSTimespan_To();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_TIMESPAN__COMMENT = eINSTANCE.getBTSTimespan_Comment();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSCorpusObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSCorpusObject()
		 * @generated
		 */
		EClass BTS_CORPUS_OBJECT = eINSTANCE.getBTSCorpusObject();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__RELATIONS = eINSTANCE.getBTSCorpusObject_Relations();

		/**
		 * The meta object literal for the '<em><b>Passport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__PASSPORT = eINSTANCE.getBTSCorpusObject_Passport();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__PARENT = eINSTANCE.getBTSCorpusObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Corpus Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__CORPUS_PREFIX = eINSTANCE.getBTSCorpusObject_CorpusPrefix();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__CHILDREN = eINSTANCE.getBTSCorpusObject_Children();

		/**
		 * The meta object literal for the '<em><b>Work Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__WORK_PHASE = eINSTANCE.getBTSCorpusObject_WorkPhase();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl <em>BTS External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSExternalReferenceImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSExternalReference()
		 * @generated
		 */
		EClass BTS_EXTERNAL_REFERENCE = eINSTANCE.getBTSExternalReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__REFERENCE = eINSTANCE.getBTSExternalReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__PROVIDER = eINSTANCE.getBTSExternalReference_Provider();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_EXTERNAL_REFERENCE__TYPE = eINSTANCE.getBTSExternalReference_Type();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl <em>BTS Referencable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSReferencableItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSReferencableItem()
		 * @generated
		 */
		EClass BTS_REFERENCABLE_ITEM = eINSTANCE.getBTSReferencableItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCABLE_ITEM__ID = eINSTANCE.getBTSReferencableItem_Id();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCABLE_ITEM__COMMENT = eINSTANCE.getBTSReferencableItem_Comment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_REFERENCABLE_ITEM__PARENT = eINSTANCE.getBTSReferencableItem_Parent();

		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_REFERENCABLE_ITEM__PARENT_ID = eINSTANCE.getBTSReferencableItem_ParentId();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSGraphicImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSGraphic()
		 * @generated
		 */
		EClass BTS_GRAPHIC = eINSTANCE.getBTSGraphic();

		/**
		 * The meta object literal for the '<em><b>Inner Sentence Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__INNER_SENTENCE_ORDER = eINSTANCE.getBTSGraphic_InnerSentenceOrder();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__CODE = eINSTANCE.getBTSGraphic_Code();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__REFERENCE = eINSTANCE.getBTSGraphic_Reference();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl <em>BTS Translations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSTranslations()
		 * @generated
		 */
		EClass BTS_TRANSLATIONS = eINSTANCE.getBTSTranslations();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TRANSLATIONS__TRANSLATIONS = eINSTANCE.getBTSTranslations_Translations();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl <em>BTS Config Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfigItem()
		 * @generated
		 */
		EClass BTS_CONFIG_ITEM = eINSTANCE.getBTSConfigItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__VALUE = eINSTANCE.getBTSConfigItem_Value();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__LABEL = eINSTANCE.getBTSConfigItem_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__DESCRIPTION = eINSTANCE.getBTSConfigItem_Description();

		/**
		 * The meta object literal for the '<em><b>Sort Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SORT_KEY = eINSTANCE.getBTSConfigItem_SortKey();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__IGNORE = eINSTANCE.getBTSConfigItem_Ignore();

		/**
		 * The meta object literal for the '<em><b>Passport Editor Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG = eINSTANCE.getBTSConfigItem_PassportEditorConfig();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__TYPE = eINSTANCE.getBTSConfigItem_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SUBTYPE = eINSTANCE.getBTSConfigItem_Subtype();

		/**
		 * The meta object literal for the '<em><b>Owner Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__OWNER_TYPE = eINSTANCE.getBTSConfigItem_OwnerType();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__REFERENCED_TYPE = eINSTANCE.getBTSConfigItem_ReferencedType();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG_ITEM__RULES = eINSTANCE.getBTSConfigItem_Rules();

		/**
		 * The meta object literal for the '<em><b>Show Widget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CONFIG_ITEM__SHOW_WIDGET = eINSTANCE.getBTSConfigItem_ShowWidget();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl <em>BTS Passport Editor Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPassportEditorConfigImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPassportEditorConfig()
		 * @generated
		 */
		EClass BTS_PASSPORT_EDITOR_CONFIG = eINSTANCE.getBTSPassportEditorConfig();

		/**
		 * The meta object literal for the '<em><b>Widget Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE = eINSTANCE.getBTSPassportEditorConfig_WidgetType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__REQUIRED = eINSTANCE.getBTSPassportEditorConfig_Required();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE = eINSTANCE.getBTSPassportEditorConfig_AllowMultiple();

		/**
		 * The meta object literal for the '<em><b>Horizontal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH = eINSTANCE.getBTSPassportEditorConfig_HorizontalWidth();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_EDITOR_CONFIG__REGEX = eINSTANCE.getBTSPassportEditorConfig_Regex();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl <em>BTS User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSUserGroupImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSUserGroup()
		 * @generated
		 */
		EClass BTS_USER_GROUP = eINSTANCE.getBTSUserGroup();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER_GROUP__CATEGORY = eINSTANCE.getBTSUserGroup_Category();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_USER_GROUP__COMMENT = eINSTANCE.getBTSUserGroup_Comment();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListImpl <em>BTS List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSList()
		 * @generated
		 */
		EClass BTS_LIST = eINSTANCE.getBTSList();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl <em>BTS Pp Subentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSPpSubentryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSPpSubentry()
		 * @generated
		 */
		EClass BTS_PP_SUBENTRY = eINSTANCE.getBTSPpSubentry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__TYPE = eINSTANCE.getBTSPpSubentry_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__SUBTYPE = eINSTANCE.getBTSPpSubentry_Subtype();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__KEY = eINSTANCE.getBTSPpSubentry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__VALUE = eINSTANCE.getBTSPpSubentry_Value();

		/**
		 * The meta object literal for the '<em><b>Sub Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__SUB_VALUE = eINSTANCE.getBTSPpSubentry_SubValue();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__PROVIDER = eINSTANCE.getBTSPpSubentry_Provider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__NAME = eINSTANCE.getBTSPpSubentry_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PP_SUBENTRY__COMMENT = eINSTANCE.getBTSPpSubentry_Comment();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PP_SUBENTRY__EXTERNAL_REFERENCES = eINSTANCE.getBTSPpSubentry_ExternalReferences();

		/**
		 * The meta object literal for the '<em><b>Timespan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PP_SUBENTRY__TIMESPAN = eINSTANCE.getBTSPpSubentry_Timespan();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PP_SUBENTRY__DESCRIPTION = eINSTANCE.getBTSPpSubentry_Description();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PP_SUBENTRY__TRANSLATION = eINSTANCE.getBTSPpSubentry_Translation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl <em>BTS List Subentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSListSubentryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSListSubentry()
		 * @generated
		 */
		EClass BTS_LIST_SUBENTRY = eINSTANCE.getBTSListSubentry();

		/**
		 * The meta object literal for the '<em><b>Passport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_SUBENTRY__PASSPORT = eINSTANCE.getBTSListSubentry_Passport();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LIST_SUBENTRY__WORDS = eINSTANCE.getBTSListSubentry_Words();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSConfigImpl <em>BTS Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSConfigImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSConfig()
		 * @generated
		 */
		EClass BTS_CONFIG = eINSTANCE.getBTSConfig();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CONFIG__CHILDREN = eINSTANCE.getBTSConfig_Children();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl <em>BTS Observable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSObservableObjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSObservableObject()
		 * @generated
		 */
		EClass BTS_OBSERVABLE_OBJECT = eINSTANCE.getBTSObservableObject();

		/**
		 * The meta object literal for the '<em><b>Property Change Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT = eINSTANCE.getBTSObservableObject_PropertyChangeSupport();

		/**
		 * The meta object literal for the '<em><b>Add Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '<em><b>Remove Property Change Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = eINSTANCE.getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSThsEntryImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSThsEntry()
		 * @generated
		 */
		EClass BTS_THS_ENTRY = eINSTANCE.getBTSThsEntry();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSProjectImpl <em>BTS Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSProjectImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSProject()
		 * @generated
		 */
		EClass BTS_PROJECT = eINSTANCE.getBTSProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT__NAME = eINSTANCE.getBTSProject_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT__PREFIX = eINSTANCE.getBTSProject_Prefix();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PROJECT__DESCRIPTION = eINSTANCE.getBTSProject_Description();

		/**
		 * The meta object literal for the '<em><b>Db Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PROJECT__DB_CONNECTION = eINSTANCE.getBTSProject_DbConnection();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl <em>BTSDB Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSDBConnectionImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSDBConnection()
		 * @generated
		 */
		EClass BTSDB_CONNECTION = eINSTANCE.getBTSDBConnection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__TYPE = eINSTANCE.getBTSDBConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Master Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__MASTER_SERVER = eINSTANCE.getBTSDBConnection_MasterServer();

		/**
		 * The meta object literal for the '<em><b>Db Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTSDB_CONNECTION__DB_PATH = eINSTANCE.getBTSDBConnection_DbPath();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl <em>BTS Workflow Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRule()
		 * @generated
		 */
		EClass BTS_WORKFLOW_RULE = eINSTANCE.getBTSWorkflowRule();

		/**
		 * The meta object literal for the '<em><b>Sub Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORKFLOW_RULE__SUB_RULES = eINSTANCE.getBTSWorkflowRule_SubRules();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__ACTIONS = eINSTANCE.getBTSWorkflowRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Accept Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__ACCEPT_MESSAGE = eINSTANCE.getBTSWorkflowRule_AcceptMessage();

		/**
		 * The meta object literal for the '<em><b>Ocl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__OCL = eINSTANCE.getBTSWorkflowRule_Ocl();

		/**
		 * The meta object literal for the '<em><b>Ocl Self Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__OCL_SELF_OBJECT = eINSTANCE.getBTSWorkflowRule_OclSelfObject();

		/**
		 * The meta object literal for the '<em><b>Denial Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE__DENIAL_MESSAGE = eINSTANCE.getBTSWorkflowRule_DenialMessage();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSOperatorImpl <em>BTS Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSOperatorImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSOperator()
		 * @generated
		 */
		EClass BTS_OPERATOR = eINSTANCE.getBTSOperator();

		/**
		 * The meta object literal for the '<em><b>Opperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_OPERATOR__OPPERATOR = eINSTANCE.getBTSOperator_Opperator();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl <em>BTS Workflow Rule Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.btsmodel.impl.BTSWorkflowRuleItemImpl
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getBTSWorkflowRuleItem()
		 * @generated
		 */
		EClass BTS_WORKFLOW_RULE_ITEM = eINSTANCE.getBTSWorkflowRuleItem();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE_ITEM__PRIORITY = eINSTANCE.getBTSWorkflowRuleItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORKFLOW_RULE_ITEM__IGNORE = eINSTANCE.getBTSWorkflowRuleItem_Ignore();

		/**
		 * The meta object literal for the '<em>Property Change Support</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeSupport
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeSupport()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_SUPPORT = eINSTANCE.getPropertyChangeSupport();

		/**
		 * The meta object literal for the '<em>Property Change Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeListener
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeListener()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_LISTENER = eINSTANCE.getPropertyChangeListener();

		/**
		 * The meta object literal for the '<em>Property Change Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.beans.PropertyChangeEvent
		 * @see org.bbaw.bts.btsmodel.impl.BtsmodelPackageImpl#getPropertyChangeEvent()
		 * @generated
		 */
		EDataType PROPERTY_CHANGE_EVENT = eINSTANCE.getPropertyChangeEvent();

	}

} //BtsmodelPackage
