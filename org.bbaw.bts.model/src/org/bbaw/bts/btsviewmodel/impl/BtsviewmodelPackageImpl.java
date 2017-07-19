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
package org.bbaw.bts.btsviewmodel.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.bbaw.bts.btsviewmodel.MessageType;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsviewmodelPackageImpl extends EPackageImpl implements BtsviewmodelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeNodeWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObjectTypeTreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbCollectionStatusInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType btsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeSupportEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeListenerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeEventEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bbaw.bts.btsviewmodel.BtsviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtsviewmodelPackageImpl()
	{
		super(eNS_URI, BtsviewmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BtsviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtsviewmodelPackage init()
	{
		if (isInited) return (BtsviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(BtsviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		BtsviewmodelPackageImpl theBtsviewmodelPackage = (BtsviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtsviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtsviewmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBtsviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theBtsviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtsviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtsviewmodelPackage.eNS_URI, theBtsviewmodelPackage);
		return theBtsviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeNodeWrapper()
	{
		return treeNodeWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeNodeWrapper_Parent()
	{
		return (EReference)treeNodeWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeNodeWrapper_Children()
	{
		return (EReference)treeNodeWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNodeWrapper_Object()
	{
		return (EAttribute)treeNodeWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNodeWrapper_PropertyChangeSupport()
	{
		return (EAttribute)treeNodeWrapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNodeWrapper_ChildrenLoaded()
	{
		return (EAttribute)treeNodeWrapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNodeWrapper_Label()
	{
		return (EAttribute)treeNodeWrapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNodeWrapper_ParentObject()
	{
		return (EAttribute)treeNodeWrapperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTreeNodeWrapper__AddPropertyChangeListener__PropertyChangeListener()
	{
		return treeNodeWrapperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTreeNodeWrapper__RemovePropertyChangeListener__PropertyChangeListener()
	{
		return treeNodeWrapperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusMessage() {
		return statusMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusMessage_Message() {
		return (EAttribute)statusMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusMessage_CreationTime() {
		return (EAttribute)statusMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusMessage_UserId() {
		return (EAttribute)statusMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusMessage_MessageType() {
		return (EAttribute)statusMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusMessage_Children() {
		return (EReference)statusMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObjectTypeTreeNode() {
		return btsObjectTypeTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSObjectTypeTreeNode_Children() {
		return (EReference)btsObjectTypeTreeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSObjectTypeTreeNode_ReferencedTypesPath() {
		return (EReference)btsObjectTypeTreeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObjectTypeTreeNode_Value() {
		return (EAttribute)btsObjectTypeTreeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObjectTypeTreeNode_Selected() {
		return (EAttribute)btsObjectTypeTreeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBCollectionStatusInformation() {
		return dbCollectionStatusInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbCollectionName() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbDocCount() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_SyncStatusToRemote() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_SyncStatusFromRemote() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_IndexDocCount() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_IndexStatus() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbDiskSize() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbDocDelCount() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbPurgeSeq() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_DbUpdateSeq() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCollectionStatusInformation_IndexUpdateSeq() {
		return (EAttribute)dbCollectionStatusInformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageType() {
		return messageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBTSObject()
	{
		return btsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeSupport()
	{
		return propertyChangeSupportEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeListener()
	{
		return propertyChangeListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeEvent()
	{
		return propertyChangeEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsviewmodelFactory getBtsviewmodelFactory()
	{
		return (BtsviewmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		treeNodeWrapperEClass = createEClass(TREE_NODE_WRAPPER);
		createEReference(treeNodeWrapperEClass, TREE_NODE_WRAPPER__PARENT);
		createEReference(treeNodeWrapperEClass, TREE_NODE_WRAPPER__CHILDREN);
		createEAttribute(treeNodeWrapperEClass, TREE_NODE_WRAPPER__OBJECT);
		createEAttribute(treeNodeWrapperEClass, TREE_NODE_WRAPPER__PROPERTY_CHANGE_SUPPORT);
		createEAttribute(treeNodeWrapperEClass, TREE_NODE_WRAPPER__CHILDREN_LOADED);
		createEAttribute(treeNodeWrapperEClass, TREE_NODE_WRAPPER__LABEL);
		createEAttribute(treeNodeWrapperEClass, TREE_NODE_WRAPPER__PARENT_OBJECT);
		createEOperation(treeNodeWrapperEClass, TREE_NODE_WRAPPER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);
		createEOperation(treeNodeWrapperEClass, TREE_NODE_WRAPPER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);

		statusMessageEClass = createEClass(STATUS_MESSAGE);
		createEAttribute(statusMessageEClass, STATUS_MESSAGE__MESSAGE);
		createEAttribute(statusMessageEClass, STATUS_MESSAGE__CREATION_TIME);
		createEAttribute(statusMessageEClass, STATUS_MESSAGE__USER_ID);
		createEAttribute(statusMessageEClass, STATUS_MESSAGE__MESSAGE_TYPE);
		createEReference(statusMessageEClass, STATUS_MESSAGE__CHILDREN);

		btsObjectTypeTreeNodeEClass = createEClass(BTS_OBJECT_TYPE_TREE_NODE);
		createEReference(btsObjectTypeTreeNodeEClass, BTS_OBJECT_TYPE_TREE_NODE__CHILDREN);
		createEReference(btsObjectTypeTreeNodeEClass, BTS_OBJECT_TYPE_TREE_NODE__REFERENCED_TYPES_PATH);
		createEAttribute(btsObjectTypeTreeNodeEClass, BTS_OBJECT_TYPE_TREE_NODE__VALUE);
		createEAttribute(btsObjectTypeTreeNodeEClass, BTS_OBJECT_TYPE_TREE_NODE__SELECTED);

		dbCollectionStatusInformationEClass = createEClass(DB_COLLECTION_STATUS_INFORMATION);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ);
		createEAttribute(dbCollectionStatusInformationEClass, DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ);

		// Create enums
		messageTypeEEnum = createEEnum(MESSAGE_TYPE);

		// Create data types
		btsObjectEDataType = createEDataType(BTS_OBJECT);
		propertyChangeSupportEDataType = createEDataType(PROPERTY_CHANGE_SUPPORT);
		propertyChangeListenerEDataType = createEDataType(PROPERTY_CHANGE_LISTENER);
		propertyChangeEventEDataType = createEDataType(PROPERTY_CHANGE_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(treeNodeWrapperEClass, TreeNodeWrapper.class, "TreeNodeWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTreeNodeWrapper_Parent(), this.getTreeNodeWrapper(), null, "parent", null, 0, 1, TreeNodeWrapper.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNodeWrapper_Children(), this.getTreeNodeWrapper(), null, "children", null, 0, -1, TreeNodeWrapper.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNodeWrapper_Object(), ecorePackage.getEJavaObject(), "object", null, 0, 1, TreeNodeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNodeWrapper_PropertyChangeSupport(), this.getPropertyChangeSupport(), "propertyChangeSupport", null, 0, 1, TreeNodeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNodeWrapper_ChildrenLoaded(), ecorePackage.getEBoolean(), "childrenLoaded", null, 0, 1, TreeNodeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNodeWrapper_Label(), ecorePackage.getEString(), "label", null, 0, 1, TreeNodeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNodeWrapper_ParentObject(), ecorePackage.getEJavaObject(), "parentObject", null, 0, 1, TreeNodeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTreeNodeWrapper__AddPropertyChangeListener__PropertyChangeListener(), null, "addPropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTreeNodeWrapper__RemovePropertyChangeListener__PropertyChangeListener(), null, "removePropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statusMessageEClass, StatusMessage.class, "StatusMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, StatusMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusMessage_CreationTime(), ecorePackage.getEDate(), "creationTime", null, 0, 1, StatusMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusMessage_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, StatusMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusMessage_MessageType(), this.getMessageType(), "messageType", "INFORMATION", 0, 1, StatusMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatusMessage_Children(), this.getStatusMessage(), null, "children", null, 0, -1, StatusMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObjectTypeTreeNodeEClass, BTSObjectTypeTreeNode.class, "BTSObjectTypeTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSObjectTypeTreeNode_Children(), this.getBTSObjectTypeTreeNode(), null, "children", null, 0, -1, BTSObjectTypeTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSObjectTypeTreeNode_ReferencedTypesPath(), this.getBTSObjectTypeTreeNode(), null, "referencedTypesPath", null, 0, 1, BTSObjectTypeTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObjectTypeTreeNode_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSObjectTypeTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObjectTypeTreeNode_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, BTSObjectTypeTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbCollectionStatusInformationEClass, DBCollectionStatusInformation.class, "DBCollectionStatusInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBCollectionStatusInformation_DbCollectionName(), ecorePackage.getEString(), "dbCollectionName", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_DbDocCount(), ecorePackage.getELong(), "dbDocCount", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_SyncStatusToRemote(), ecorePackage.getEString(), "syncStatusToRemote", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_SyncStatusFromRemote(), ecorePackage.getEString(), "syncStatusFromRemote", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_IndexDocCount(), ecorePackage.getELong(), "indexDocCount", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_IndexStatus(), ecorePackage.getEString(), "indexStatus", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_DbDiskSize(), ecorePackage.getEString(), "dbDiskSize", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_DbDocDelCount(), ecorePackage.getEString(), "dbDocDelCount", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_DbPurgeSeq(), ecorePackage.getEString(), "dbPurgeSeq", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_DbUpdateSeq(), ecorePackage.getEString(), "dbUpdateSeq", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBCollectionStatusInformation_IndexUpdateSeq(), ecorePackage.getEString(), "indexUpdateSeq", null, 0, 1, DBCollectionStatusInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageTypeEEnum, MessageType.class, "MessageType");
		addEEnumLiteral(messageTypeEEnum, MessageType.ERROR);
		addEEnumLiteral(messageTypeEEnum, MessageType.WARNING);
		addEEnumLiteral(messageTypeEEnum, MessageType.LOCKED);
		addEEnumLiteral(messageTypeEEnum, MessageType.NO_EDITING_RIGHTS);
		addEEnumLiteral(messageTypeEEnum, MessageType.FILTERED);
		addEEnumLiteral(messageTypeEEnum, MessageType.UPDATE);
		addEEnumLiteral(messageTypeEEnum, MessageType.INFORMATION);

		// Initialize data types
		initEDataType(btsObjectEDataType, BTSObject.class, "BTSObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeSupportEDataType, PropertyChangeSupport.class, "PropertyChangeSupport", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeListenerEDataType, PropertyChangeListener.class, "PropertyChangeListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeEventEDataType, PropertyChangeEvent.class, "PropertyChangeEvent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BtsviewmodelPackageImpl
