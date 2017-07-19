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
package org.bbaw.bts.btsmodel.provider;

import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSObject} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class BTSObjectItemProvider extends AdministrativDataObjectItemProvider
{
	private BTSConfigurationController configurationController = StaticAccessController
			.getContext().get(BTSConfigurationController.class);
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BTSObjectItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			add_revPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addLockedPropertyDescriptor(object);
			addUpdatersPropertyDescriptor(object);
			addReadersPropertyDescriptor(object);
			add_deletedPropertyDescriptor(object);
			addConflictingRevsPropertyDescriptor(object);
			addDBCollectionKeyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addSortKeyPropertyDescriptor(object);
			addSubtypePropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addTempSortKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the rev feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_revPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject__rev_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject__rev_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__REV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_project_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_locked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_locked_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__LOCKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Updaters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_updaters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_updaters_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Readers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_readers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_readers_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the deleted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_deletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject__deleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject__deleted_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__DELETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conflicting Revs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConflictingRevsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_conflictingRevs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_conflictingRevs_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__CONFLICTING_REVS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DB Collection Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDBCollectionKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSDBBaseObject_dBCollectionKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSDBBaseObject_dBCollectionKey_feature", "_UI_BTSDBBaseObject_type"),
				 BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sort Key feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSortKeyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSNamedTypedObject_sortKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSNamedTypedObject_sortKey_feature", "_UI_BTSNamedTypedObject_type"),
				 BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__SORT_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSNamedTypedObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSNamedTypedObject_name_feature", "_UI_BTSNamedTypedObject_type"),
				 BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSNamedTypedObject_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSNamedTypedObject_type_feature", "_UI_BTSNamedTypedObject_type"),
				 BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subtype feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSubtypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSNamedTypedObject_subtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSNamedTypedObject_subtype_feature", "_UI_BTSNamedTypedObject_type"),
				 BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSObject_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSObject_code_feature", "_UI_BTSObject_type"),
				 BtsmodelPackage.Literals.BTS_OBJECT__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temp Sort Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempSortKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSObject_tempSortKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSObject_tempSortKey_feature", "_UI_BTSObject_type"),
				 BtsmodelPackage.Literals.BTS_OBJECT__TEMP_SORT_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_OBJECT__RELATIONS);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_OBJECT__EXTERNAL_REFERENCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return ((StyledString)getStyledText(object)).getString();
	}

	protected String getTypeSubtypeString(Object object) {
		if (object instanceof BTSObject)
		{
			BTSObject o = (BTSObject) object;
			String str = configurationController.getLabelOfTypeSubtypeString(o, true);
			return str;
		}
		return null;
	}
	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((BTSObject)object).getName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_BTSObject_type"), StyledString.Style.QUALIFIER_STYLER); 
		} else {
			styledLabel.append(label, StyledString.Style.QUALIFIER_STYLER);
		}
		return styledLabel;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		int featureID = notification.getFeatureID(BTSObject.class);
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__SORT_KEY:
			case BtsmodelPackage.BTS_OBJECT__NAME:
//			case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
			case BtsmodelPackage.BTS_OBJECT__TYPE:
			case BtsmodelPackage.BTS_OBJECT__SUBTYPE:
			case BtsmodelPackage.BTS_OBJECT__CODE:
			case 8: // set locked
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		case BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_OBJECT__RELATIONS,
				 BtsmodelFactory.eINSTANCE.createBTSRelation()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_OBJECT__EXTERNAL_REFERENCES,
				 BtsmodelFactory.eINSTANCE.createBTSExternalReference()));
	}
	protected BTSConfigurationController getConfigurationController()
	{
		if (configurationController == null)
		{
			configurationController = StaticAccessController
					.getContext().get(BTSConfigurationController.class);
		}
		return configurationController;
	}
}
