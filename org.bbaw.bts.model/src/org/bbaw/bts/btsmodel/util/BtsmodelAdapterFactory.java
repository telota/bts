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
package org.bbaw.bts.btsmodel.util;

import java.util.Map;

import org.bbaw.bts.btsmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 */
public class BtsmodelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static BtsmodelPackage modelPackage;
    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BtsmodelSwitch<Adapter> modelSwitch =
            new BtsmodelSwitch<Adapter>() {
                @Override
                public Adapter caseAdministrativDataObject(AdministrativDataObject object) {
                    return createAdministrativDataObjectAdapter();
                }

                @Override
                public Adapter caseBTSObject(BTSObject object) {
                    return createBTSObjectAdapter();
                }

                @Override
                public Adapter caseBTSUser(BTSUser object) {
                    return createBTSUserAdapter();
                }

                @Override
                public Adapter caseBTSComment(BTSComment object) {
                    return createBTSCommentAdapter();
                }

                @Override
                public Adapter caseBTSInterTextReference(BTSInterTextReference object) {
                    return createBTSInterTextReferenceAdapter();
                }

                @Override
                public Adapter caseBTSTranslation(BTSTranslation object) {
                    return createBTSTranslationAdapter();
                }

                @Override
                public Adapter caseBTSDate(BTSDate object) {
                    return createBTSDateAdapter();
                }

                @Override
                public Adapter caseBTSRelation(BTSRelation object) {
                    return createBTSRelationAdapter();
                }

                @Override
                public Adapter caseBTSConfiguration(BTSConfiguration object) {
                    return createBTSConfigurationAdapter();
                }

                @Override
                public Adapter caseBTSDBBaseObject(BTSDBBaseObject object) {
                    return createBTSDBBaseObjectAdapter();
                }

                @Override
                public Adapter caseBTSRevision(BTSRevision object) {
                    return createBTSRevisionAdapter();
                }

                @Override
                public Adapter caseBTSTimespan(BTSTimespan object) {
                    return createBTSTimespanAdapter();
                }

                @Override
                public Adapter caseBTSExternalReference(BTSExternalReference object) {
                    return createBTSExternalReferenceAdapter();
                }

                @Override
                public Adapter caseBTSReferencableItem(BTSReferencableItem object) {
                    return createBTSReferencableItemAdapter();
                }

                @Override
                public Adapter caseBTSTranslations(BTSTranslations object) {
                    return createBTSTranslationsAdapter();
                }

                @Override
                public Adapter caseBTSConfigItem(BTSConfigItem object) {
                    return createBTSConfigItemAdapter();
                }

                @Override
                public Adapter caseBTSPassportEditorConfig(BTSPassportEditorConfig object) {
                    return createBTSPassportEditorConfigAdapter();
                }

                @Override
                public Adapter caseBTSUserGroup(BTSUserGroup object) {
                    return createBTSUserGroupAdapter();
                }

                @Override
                public Adapter caseBTSConfig(BTSConfig object) {
                    return createBTSConfigAdapter();
                }

                @Override
                public Adapter caseBTSObservableObject(BTSObservableObject object) {
                    return createBTSObservableObjectAdapter();
                }

                @Override
                public Adapter caseBTSProject(BTSProject object) {
                    return createBTSProjectAdapter();
                }

                @Override
                public Adapter caseBTSDBConnection(BTSDBConnection object) {
                    return createBTSDBConnectionAdapter();
                }

                @Override
                public Adapter caseBTSWorkflowRule(BTSWorkflowRule object) {
                    return createBTSWorkflowRuleAdapter();
                }

                @Override
                public Adapter caseBTSOperator(BTSOperator object) {
                    return createBTSOperatorAdapter();
                }

                @Override
                public Adapter caseBTSWorkflowRuleItem(BTSWorkflowRuleItem object) {
                    return createBTSWorkflowRuleItemAdapter();
                }

                @Override
                public Adapter caseDBLease(DBLease object) {
                    return createDBLeaseAdapter();
                }

                @Override
                public Adapter caseBTSProjectDBCollection(BTSProjectDBCollection object) {
                    return createBTSProjectDBCollectionAdapter();
                }

                @Override
                public Adapter caseBTSIdentifiableItem(BTSIdentifiableItem object) {
                    return createBTSIdentifiableItemAdapter();
                }

                @Override
                public Adapter caseBTSDBCollectionRoleDesc(BTSDBCollectionRoleDesc object) {
                    return createBTSDBCollectionRoleDescAdapter();
                }

                @Override
                public Adapter caseUserActionCounter(UserActionCounter object) {
                    return createUserActionCounterAdapter();
                }

                @Override
                public Adapter caseStringToStringListMap(Map.Entry<String, EList<String>> object) {
                    return createStringToStringListMapAdapter();
                }

                @Override
                public Adapter caseStringToStringMap(Map object) {
                    return createStringToStringMapAdapter();
                }

                @Override
                public Adapter caseBTSIDReservationObject(BTSIDReservationObject object) {
                    return createBTSIDReservationObjectAdapter();
                }

                @Override
                public Adapter caseBTSNamedTypedObject(BTSNamedTypedObject object) {
                    return createBTSNamedTypedObjectAdapter();
                }

                @Override
                public Adapter defaultCase(EObject object) {
                    return createEObjectAdapter();
                }
            };

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BtsmodelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BtsmodelPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.AdministrativDataObject <em>Administrativ Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.AdministrativDataObject
     */
    public Adapter createAdministrativDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSObject <em>BTS Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSObject
     */
    public Adapter createBTSObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSUser <em>BTS User</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSUser
     */
    public Adapter createBTSUserAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSComment <em>BTS Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSComment
     */
    public Adapter createBTSCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSInterTextReference <em>BTS Inter Text Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSInterTextReference
     */
    public Adapter createBTSInterTextReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTranslation <em>BTS Translation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSTranslation
     */
    public Adapter createBTSTranslationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDate <em>BTS Date</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSDate
     */
    public Adapter createBTSDateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSRelation <em>BTS Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSRelation
     */
    public Adapter createBTSRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfiguration <em>BTS Configuration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSConfiguration
     */
    public Adapter createBTSConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject <em>BTSDB Base Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSDBBaseObject
     */
    public Adapter createBTSDBBaseObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSRevision <em>BTS Revision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSRevision
     */
    public Adapter createBTSRevisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTimespan <em>BTS Timespan</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSTimespan
     */
    public Adapter createBTSTimespanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSExternalReference <em>BTS External Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSExternalReference
     */
    public Adapter createBTSExternalReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSReferencableItem <em>BTS Referencable Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSReferencableItem
     */
    public Adapter createBTSReferencableItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSTranslations <em>BTS Translations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSTranslations
     */
    public Adapter createBTSTranslationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfigItem <em>BTS Config Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSConfigItem
     */
    public Adapter createBTSConfigItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSPassportEditorConfig <em>BTS Passport Editor Config</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSPassportEditorConfig
     */
    public Adapter createBTSPassportEditorConfigAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSUserGroup <em>BTS User Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSUserGroup
     */
    public Adapter createBTSUserGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSConfig <em>BTS Config</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSConfig
     */
    public Adapter createBTSConfigAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSObservableObject <em>BTS Observable Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSObservableObject
     */
    public Adapter createBTSObservableObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSProject <em>BTS Project</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSProject
     */
    public Adapter createBTSProjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBConnection <em>BTSDB Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSDBConnection
     */
    public Adapter createBTSDBConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRule <em>BTS Workflow Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSWorkflowRule
     */
    public Adapter createBTSWorkflowRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSOperator <em>BTS Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSOperator
     */
    public Adapter createBTSOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSWorkflowRuleItem <em>BTS Workflow Rule Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSWorkflowRuleItem
     */
    public Adapter createBTSWorkflowRuleItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.DBLease <em>DB Lease</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.DBLease
     */
    public Adapter createDBLeaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSProjectDBCollection <em>BTS Project DB Collection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSProjectDBCollection
     */
    public Adapter createBTSProjectDBCollectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSIdentifiableItem <em>BTS Identifiable Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSIdentifiableItem
     */
    public Adapter createBTSIdentifiableItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc <em>BTSDB Collection Role Desc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc
     */
    public Adapter createBTSDBCollectionRoleDescAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.UserActionCounter <em>User Action Counter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.UserActionCounter
     */
    public Adapter createUserActionCounterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String List Map</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see java.util.Map.Entry
     */
    public Adapter createStringToStringListMapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.util.Map <em>String To String Map</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see java.util.Map
     */
    public Adapter createStringToStringMapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSIDReservationObject <em>BTSID Reservation Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSIDReservationObject
     */
    public Adapter createBTSIDReservationObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.btsmodel.BTSNamedTypedObject <em>BTS Named Typed Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.btsmodel.BTSNamedTypedObject
     */
    public Adapter createBTSNamedTypedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BtsmodelAdapterFactory
