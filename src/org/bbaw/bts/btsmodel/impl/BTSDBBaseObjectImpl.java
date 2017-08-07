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
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTSDB Base Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#get_rev <em>rev</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getProject <em>Project</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#isLocked <em>Locked</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getUpdaters <em>Updaters</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getReaders <em>Readers</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#is_deleted <em>deleted</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getConflictingRevs <em>Conflicting Revs</em>}</li>
 * <li>{@link org.bbaw.bts.btsmodel.impl.BTSDBBaseObjectImpl#getDBCollectionKey <em>DB Collection Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BTSDBBaseObjectImpl extends BTSIdentifiableItemImpl implements BTSDBBaseObject {

    /**
     * The default value of the '{@link #get_rev() <em>rev</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #get_rev()
     */
    protected static final String _REV_EDEFAULT = null;
    /**
     * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getProject()
     */
    protected static final String PROJECT_EDEFAULT = null;
    /**
     * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #isLocked()
     */
    protected static final boolean LOCKED_EDEFAULT = false;
    /**
     * The default value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #is_deleted()
     */
    protected static final boolean _DELETED_EDEFAULT = false;
    /**
     * The default value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDBCollectionKey()
     */
    protected static final String DB_COLLECTION_KEY_EDEFAULT = null;
    /**
     * The cached value of the '{@link #get_rev() <em>rev</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #get_rev()
     */
    protected String _rev = _REV_EDEFAULT;
    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getProject()
     */
    protected String project = PROJECT_EDEFAULT;
    /**
     * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #isLocked()
     */
    protected boolean locked = LOCKED_EDEFAULT;
    /**
     * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getUpdaters()
     */
    protected EList<String> updaters;
    /**
     * The cached value of the '{@link #getReaders() <em>Readers</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getReaders()
     */
    protected EList<String> readers;
    /**
     * The cached value of the '{@link #is_deleted() <em>deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #is_deleted()
     */
    protected boolean _deleted = _DELETED_EDEFAULT;
    /**
     * The cached value of the '{@link #getConflictingRevs() <em>Conflicting Revs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getConflictingRevs()
     */
    protected EList<String> conflictingRevs;
    /**
     * The cached value of the '{@link #getDBCollectionKey() <em>DB Collection Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDBCollectionKey()
     */
    protected String dBCollectionKey = DB_COLLECTION_KEY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BTSDBBaseObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BtsmodelPackage.Literals.BTSDB_BASE_OBJECT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String get_rev() {
        return _rev;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void set_rev(String new_rev) {
        String old_rev = _rev;
        _rev = new_rev;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__REV, old_rev, _rev));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generatedNOT
     */
    public String getProject() {
        if (dBCollectionKey != null) {
            project = dBCollectionKey.split("_")[0];
        }
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setProject(String newProject) {
        String oldProject = project;
        project = newProject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT, oldProject, project));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setLocked(boolean newLocked) {
        boolean oldLocked = locked;
        locked = newLocked;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED, oldLocked, locked));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getUpdaters() {
        if (updaters == null) {
            updaters = new EDataTypeUniqueEList<>(String.class, this, BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS);
        }
        return updaters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getReaders() {
        if (readers == null) {
            readers = new EDataTypeUniqueEList<>(String.class, this, BtsmodelPackage.BTSDB_BASE_OBJECT__READERS);
        }
        return readers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean is_deleted() {
        return _deleted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void set_deleted(boolean new_deleted) {
        boolean old_deleted = _deleted;
        _deleted = new_deleted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED, old_deleted, _deleted));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getConflictingRevs() {
        if (conflictingRevs == null) {
            conflictingRevs = new EDataTypeUniqueEList<>(String.class, this, BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS);
        }
        return conflictingRevs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getDBCollectionKey() {
        return dBCollectionKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setDBCollectionKey(String newDBCollectionKey) {
        String oldDBCollectionKey = dBCollectionKey;
        dBCollectionKey = newDBCollectionKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY, oldDBCollectionKey, dBCollectionKey));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
                return get_rev();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
                return getProject();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
                return isLocked();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
                return getUpdaters();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
                return getReaders();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
                return is_deleted();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS:
                return getConflictingRevs();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY:
                return getDBCollectionKey();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
                set_rev((String) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
                setProject((String) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
                setLocked((Boolean) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
                getUpdaters().clear();
                getUpdaters().addAll((Collection<? extends String>) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
                getReaders().clear();
                getReaders().addAll((Collection<? extends String>) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
                set_deleted((Boolean) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS:
                getConflictingRevs().clear();
                getConflictingRevs().addAll((Collection<? extends String>) newValue);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY:
                setDBCollectionKey((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
                set_rev(_REV_EDEFAULT);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
                setProject(PROJECT_EDEFAULT);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
                setLocked(LOCKED_EDEFAULT);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
                getUpdaters().clear();
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
                getReaders().clear();
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
                set_deleted(_DELETED_EDEFAULT);
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS:
                getConflictingRevs().clear();
                return;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY:
                setDBCollectionKey(DB_COLLECTION_KEY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BtsmodelPackage.BTSDB_BASE_OBJECT__REV:
                return _REV_EDEFAULT == null ? _rev != null : !_REV_EDEFAULT.equals(_rev);
            case BtsmodelPackage.BTSDB_BASE_OBJECT__PROJECT:
                return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
            case BtsmodelPackage.BTSDB_BASE_OBJECT__LOCKED:
                return locked != LOCKED_EDEFAULT;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__UPDATERS:
                return updaters != null && !updaters.isEmpty();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__READERS:
                return readers != null && !readers.isEmpty();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DELETED:
                return _deleted != _DELETED_EDEFAULT;
            case BtsmodelPackage.BTSDB_BASE_OBJECT__CONFLICTING_REVS:
                return conflictingRevs != null && !conflictingRevs.isEmpty();
            case BtsmodelPackage.BTSDB_BASE_OBJECT__DB_COLLECTION_KEY:
                return DB_COLLECTION_KEY_EDEFAULT == null ? dBCollectionKey != null : !DB_COLLECTION_KEY_EDEFAULT.equals(dBCollectionKey);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (_rev: ");
        result.append(_rev);
        result.append(", project: ");
        result.append(project);
        result.append(", locked: ");
        result.append(locked);
        result.append(", updaters: ");
        result.append(updaters);
        result.append(", readers: ");
        result.append(readers);
        result.append(", _deleted: ");
        result.append(_deleted);
        result.append(", conflictingRevs: ");
        result.append(conflictingRevs);
        result.append(", dBCollectionKey: ");
        result.append(dBCollectionKey);
        result.append(')');
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BTSDBBaseObject) {
            BTSDBBaseObject o = (BTSDBBaseObject) obj;
            if (o.get_id() == null || this.get_id() == null) {
                return false;
            } else if (this.get_id().equals(o.get_id())) {
                if (get_rev() != null) {
                    return get_rev().equals(((BTSDBBaseObject) obj).get_rev());
                }
                return (((BTSDBBaseObject) obj).get_rev() == null);
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        if (_id != null) {
            return (_id + _rev).hashCode();
        }
        return super.hashCode();
    }


} // BTSDBBaseObjectImpl
