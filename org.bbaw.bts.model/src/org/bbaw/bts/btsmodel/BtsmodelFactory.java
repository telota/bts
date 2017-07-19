/*
  This file is part of Berlin Text System.

  The software Berlin Text System serves as a client user interface for working with
  text corpus data. See: aaew.bbaw.de

  The software Berlin Text System was developed at the Berlin-Brandenburg Academy
  of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
  www.bbaw.de

  Copyright (C) 2013-2015  Berlin-Brandenburg Academy
  of Sciences and Humanities

  The software Berlin Text System was developed by @author: Christoph Plutte.

  Berlin Text System is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  Berlin Text System is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with Berlin Text System.
  If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.btsmodel;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 * @generated
 */
public interface BtsmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsmodelFactory eINSTANCE = org.bbaw.bts.btsmodel.impl.BtsmodelFactoryImpl.init();


	/**
	 * Returns a new object of class '<em>BTS User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS User</em>'.
	 * @generated
	 */
	BTSUser createBTSUser();

	/**
	 * Returns a new object of class '<em>BTS Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Comment</em>'.
	 * @generated
	 */
	BTSComment createBTSComment();

	/**
	 * Returns a new object of class '<em>BTS Inter Text Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Inter Text Reference</em>'.
	 * @generated
	 */
	BTSInterTextReference createBTSInterTextReference();

	/**
	 * Returns a new object of class '<em>BTS Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Translation</em>'.
	 * @generated
	 */
	BTSTranslation createBTSTranslation();

	/**
	 * Returns a new object of class '<em>BTS Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Date</em>'.
	 * @generated
	 */
	BTSDate createBTSDate();

	/**
	 * Returns a new object of class '<em>BTS Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Relation</em>'.
	 * @generated
	 */
	BTSRelation createBTSRelation();

	/**
	 * Returns a new object of class '<em>BTS Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Configuration</em>'.
	 * @generated
	 */
	BTSConfiguration createBTSConfiguration();

	/**
	 * Returns a new object of class '<em>BTS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Revision</em>'.
	 * @generated
	 */
	BTSRevision createBTSRevision();

	
	/**
	 * Returns a new object of class '<em>BTS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Revision</em>'.
	 * @generatedNOT
	 */
	BTSRevision createBTSRevision(int rev, Date timestamp, String userId);
	/**
	 * Returns a new object of class '<em>BTS Timespan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Timespan</em>'.
	 * @generated
	 */
	BTSTimespan createBTSTimespan();

	/**
	 * Returns a new object of class '<em>BTS External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS External Reference</em>'.
	 * @generated
	 */
	BTSExternalReference createBTSExternalReference();

	/**
	 * Returns a new object of class '<em>BTS Translations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Translations</em>'.
	 * @generated
	 */
	BTSTranslations createBTSTranslations();

	/**
	 * Returns a new object of class '<em>BTS Config Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Config Item</em>'.
	 * @generated
	 */
	BTSConfigItem createBTSConfigItem();

	/**
	 * Returns a new object of class '<em>BTS Passport Editor Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Editor Config</em>'.
	 * @generated
	 */
	BTSPassportEditorConfig createBTSPassportEditorConfig();

	/**
	 * Returns a new object of class '<em>BTS User Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS User Group</em>'.
	 * @generated
	 */
	BTSUserGroup createBTSUserGroup();

	/**
	 * Returns a new object of class '<em>BTS Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Project</em>'.
	 * @generated
	 */
	BTSProject createBTSProject();

	/**
	 * Returns a new object of class '<em>BTSDB Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSDB Connection</em>'.
	 * @generated
	 */
	BTSDBConnection createBTSDBConnection();

	/**
	 * Returns a new object of class '<em>BTS Workflow Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Workflow Rule</em>'.
	 * @generated
	 */
	BTSWorkflowRule createBTSWorkflowRule();

	/**
	 * Returns a new object of class '<em>BTS Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Operator</em>'.
	 * @generated
	 */
	BTSOperator createBTSOperator();

	/**
	 * Returns a new object of class '<em>DB Lease</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Lease</em>'.
	 * @generated
	 */
	DBLease createDBLease();

	/**
	 * Returns a new object of class '<em>BTS Project DB Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Project DB Collection</em>'.
	 * @generated
	 */
	BTSProjectDBCollection createBTSProjectDBCollection();

	/**
	 * Returns a new object of class '<em>BTSDB Collection Role Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSDB Collection Role Desc</em>'.
	 * @generated
	 */
	BTSDBCollectionRoleDesc createBTSDBCollectionRoleDesc();

	/**
	 * Returns a new object of class '<em>User Action Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Action Counter</em>'.
	 * @generated
	 */
	UserActionCounter createUserActionCounter();

	/**
	 * Returns a new object of class '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String To String Map</em>'.
	 * @generated
	 */
	Map createStringToStringMap();

	/**
	 * Returns a new object of class '<em>BTSID Reservation Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSID Reservation Object</em>'.
	 * @generated
	 */
	BTSIDReservationObject createBTSIDReservationObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsmodelPackage getBtsmodelPackage();

	BTSRevision createBTSRevision(String revisionString);

} //BtsmodelFactory
