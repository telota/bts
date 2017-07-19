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
package org.bbaw.bts.btsmodel.impl;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSNamedTypedObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#is_deleted <em>deleted</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getConflictingRevs <em>Conflicting Revs</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getDBCollectionKey <em>DB Collection Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getTempSortKey <em>Temp Sort Key</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSObjectImpl#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSObjectImpl extends AdministrativDataObjectImpl implements BTSObject
{
	/**
	 * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected static final String _REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_rev()
	 * @generated
	 * @ordered
	 */
	protected String _rev = _REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected String project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean locked = LOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> updaters;

	/**
	 * The cached value of the '{@link #getReaders() <em>Readers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> readers;

	/**
	 * The default value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_deleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _DELETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_deleted()
	 * @generated
	 * @ordered
	 */
	protected boolean _deleted = _DELETED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConflictingRevs() <em>Conflicting Revs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictingRevs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conflictingRevs;

	/**
	 * The default value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBCollectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_COLLECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBCollectionKey()
	 * @generated
	 * @ordered
	 */
	protected String dBCollectionKey = DB_COLLECTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected int sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSRelation> relations;

	/**
	 * The default value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_SORT_KEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempSortKey() <em>Temp Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempSortKey()
	 * @generated
	 * @ordered
	 */
	protected int tempSortKey = TEMP_SORT_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSExternalReference> externalReferences;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSObjectImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_rev() {
		return _rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_rev(String new_rev) {
		String old_rev = _rev;
		_rev = new_rev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__REV, old_rev, _rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String getProject()
	{
		if (dBCollectionKey != null)
		{
			project = dBCollectionKey.split("_")[0];
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(boolean newLocked) {
		boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpdaters() {
		if (updaters == null) {
			updaters = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_OBJECT__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReaders() {
		if (readers == null) {
			readers = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_OBJECT__READERS);
		}
		return readers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is_deleted() {
		return _deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_deleted(boolean new_deleted) {
		boolean old_deleted = _deleted;
		_deleted = new_deleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__DELETED, old_deleted, _deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConflictingRevs() {
		if (conflictingRevs == null) {
			conflictingRevs = new EDataTypeUniqueEList<String>(String.class, this, BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS);
		}
		return conflictingRevs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortKey()
	{
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(int newSortKey)
	{
		int oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType)
	{
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype()
	{
		return subtype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype)
	{
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode)
	{
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<BTSRelation>(BTSRelation.class, this, BtsmodelPackage.BTS_OBJECT__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempSortKey() {
		return tempSortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempSortKey(int newTempSortKey) {
		int oldTempSortKey = tempSortKey;
		tempSortKey = newTempSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY, oldTempSortKey, tempSortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSExternalReference> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new EObjectContainmentEList<BTSExternalReference>(BTSExternalReference.class, this, BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES);
		}
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBCollectionKey() {
		return dBCollectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBCollectionKey(String newDBCollectionKey) {
		String oldDBCollectionKey = dBCollectionKey;
		dBCollectionKey = newDBCollectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY, oldDBCollectionKey, dBCollectionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES:
				return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__REV:
				return get_rev();
			case BtsmodelPackage.BTS_OBJECT__PROJECT:
				return getProject();
			case BtsmodelPackage.BTS_OBJECT__LOCKED:
				return isLocked();
			case BtsmodelPackage.BTS_OBJECT__UPDATERS:
				return getUpdaters();
			case BtsmodelPackage.BTS_OBJECT__READERS:
				return getReaders();
			case BtsmodelPackage.BTS_OBJECT__DELETED:
				return is_deleted();
			case BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS:
				return getConflictingRevs();
			case BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY:
				return getDBCollectionKey();
			case BtsmodelPackage.BTS_OBJECT__NAME:
				return getName();
			case BtsmodelPackage.BTS_OBJECT__TYPE:
				return getType();
			case BtsmodelPackage.BTS_OBJECT__SORT_KEY:
				return getSortKey();
			case BtsmodelPackage.BTS_OBJECT__SUBTYPE:
				return getSubtype();
			case BtsmodelPackage.BTS_OBJECT__CODE:
				return getCode();
			case BtsmodelPackage.BTS_OBJECT__RELATIONS:
				return getRelations();
			case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY:
				return getTempSortKey();
			case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES:
				return getExternalReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__REV:
				set_rev((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__PROJECT:
				setProject((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__READERS:
				getReaders().clear();
				getReaders().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__DELETED:
				set_deleted((Boolean)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS:
				getConflictingRevs().clear();
				getConflictingRevs().addAll((Collection<? extends String>)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY:
				setDBCollectionKey((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__NAME:
				setName((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__TYPE:
				setType((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__SORT_KEY:
				setSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__CODE:
				setCode((String)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends BTSRelation>)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY:
				setTempSortKey((Integer)newValue);
				return;
			case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				getExternalReferences().addAll((Collection<? extends BTSExternalReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__REV:
				set_rev(_REV_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__UPDATERS:
				getUpdaters().clear();
				return;
			case BtsmodelPackage.BTS_OBJECT__READERS:
				getReaders().clear();
				return;
			case BtsmodelPackage.BTS_OBJECT__DELETED:
				set_deleted(_DELETED_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS:
				getConflictingRevs().clear();
				return;
			case BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY:
				setDBCollectionKey(DB_COLLECTION_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__RELATIONS:
				getRelations().clear();
				return;
			case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY:
				setTempSortKey(TEMP_SORT_KEY_EDEFAULT);
				return;
			case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES:
				getExternalReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_OBJECT__REV:
				return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
			case BtsmodelPackage.BTS_OBJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case BtsmodelPackage.BTS_OBJECT__LOCKED:
				return locked != LOCKED_EDEFAULT;
			case BtsmodelPackage.BTS_OBJECT__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case BtsmodelPackage.BTS_OBJECT__READERS:
				return readers != null && !readers.isEmpty();
			case BtsmodelPackage.BTS_OBJECT__DELETED:
				return _deleted != _DELETED_EDEFAULT;
			case BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS:
				return conflictingRevs != null && !conflictingRevs.isEmpty();
			case BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY:
				return DB_COLLECTION_KEY_EDEFAULT == null ? dBCollectionKey != null : !DB_COLLECTION_KEY_EDEFAULT.equals(dBCollectionKey);
			case BtsmodelPackage.BTS_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtsmodelPackage.BTS_OBJECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BtsmodelPackage.BTS_OBJECT__SORT_KEY:
				return sortKey != SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_OBJECT__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case BtsmodelPackage.BTS_OBJECT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case BtsmodelPackage.BTS_OBJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY:
				return tempSortKey != TEMP_SORT_KEY_EDEFAULT;
			case BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES:
				return externalReferences != null && !externalReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BTSDBBaseObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_OBJECT__REV: return BtsmodelPackage.BTSDB_BASE_OBJECT__REV;
				case BtsmodelPackage.BTS_OBJECT__PROJECT: return BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT;
				case BtsmodelPackage.BTS_OBJECT__LOCKED: return BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED;
				case BtsmodelPackage.BTS_OBJECT__UPDATERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS;
				case BtsmodelPackage.BTS_OBJECT__READERS: return BtsmodelPackage.BTSDB_BASE_OBJECT__READERS;
				case BtsmodelPackage.BTS_OBJECT__DELETED: return BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED;
				case BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS: return BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS;
				case BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY: return BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY;
				default: return -1;
			}
		}
		if (baseClass == BTSNamedTypedObject.class) {
			switch (derivedFeatureID) {
				case BtsmodelPackage.BTS_OBJECT__NAME: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__NAME;
				case BtsmodelPackage.BTS_OBJECT__TYPE: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__TYPE;
				case BtsmodelPackage.BTS_OBJECT__SORT_KEY: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SORT_KEY;
				case BtsmodelPackage.BTS_OBJECT__SUBTYPE: return BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SUBTYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BTSDBBaseObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTSDB_BASE_OBJECT__REV: return BtsmodelPackage.BTS_OBJECT__REV;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT: return BtsmodelPackage.BTS_OBJECT__PROJECT;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED: return BtsmodelPackage.BTS_OBJECT__LOCKED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS: return BtsmodelPackage.BTS_OBJECT__UPDATERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS: return BtsmodelPackage.BTS_OBJECT__READERS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED: return BtsmodelPackage.BTS_OBJECT__DELETED;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS: return BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS;
				case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY: return BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY;
				default: return -1;
			}
		}
		if (baseClass == BTSNamedTypedObject.class) {
			switch (baseFeatureID) {
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__NAME: return BtsmodelPackage.BTS_OBJECT__NAME;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__TYPE: return BtsmodelPackage.BTS_OBJECT__TYPE;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SORT_KEY: return BtsmodelPackage.BTS_OBJECT__SORT_KEY;
				case BtsmodelPackage.BTS_NAMED_TYPED_OBJECT__SUBTYPE: return BtsmodelPackage.BTS_OBJECT__SUBTYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sortKey: ");
		result.append(sortKey);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} // BTSObjectImpl
