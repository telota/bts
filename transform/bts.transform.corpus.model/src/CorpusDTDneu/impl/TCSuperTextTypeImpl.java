/*
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.TCPassportType;
import CorpusDTDneu.TCPictureType;
import CorpusDTDneu.TCSuperTextType;
import CorpusDTDneu.TCTextType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Super Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getTCPassport <em>TC Passport</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getTCPicture <em>TC Picture</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getTCNotebook <em>TC Notebook</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getTCText <em>TC Text</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getAuthor <em>Author</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getSortKey <em>Sort Key</em>}</li>
 * <li>{@link CorpusDTDneu.impl.TCSuperTextTypeImpl#getTCName <em>TC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCSuperTextTypeImpl extends MinimalEObjectImpl.Container implements TCSuperTextType {
    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getAuthor()
     */
    protected static final Object AUTHOR_EDEFAULT = null;
    /**
     * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSortKey()
     */
    protected static final Object SORT_KEY_EDEFAULT = "0";
    /**
     * The default value of the '{@link #getTCName() <em>TC Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCName()
     */
    protected static final Object TC_NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTCPassport() <em>TC Passport</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCPassport()
     */
    protected TCPassportType tCPassport;
    /**
     * The cached value of the '{@link #getTCPicture() <em>TC Picture</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCPicture()
     */
    protected EList<TCPictureType> tCPicture;
    /**
     * The cached value of the '{@link #getTCNotebook() <em>TC Notebook</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCNotebook()
     */
    protected EList<String> tCNotebook;
    /**
     * The cached value of the '{@link #getTCText() <em>TC Text</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCText()
     */
    protected EList<TCTextType> tCText;
    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getAuthor()
     */
    protected Object author = AUTHOR_EDEFAULT;
    /**
     * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSortKey()
     */
    protected Object sortKey = SORT_KEY_EDEFAULT;
    /**
     * This is true if the Sort Key attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean sortKeyESet;
    /**
     * The cached value of the '{@link #getTCName() <em>TC Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTCName()
     */
    protected Object tCName = TC_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCSuperTextTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorpusDTDneuPackage.Literals.TC_SUPER_TEXT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public TCPassportType getTCPassport() {
        return tCPassport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTCPassport(TCPassportType newTCPassport) {
        if (newTCPassport != tCPassport) {
            NotificationChain msgs = null;
            if (tCPassport != null)
                msgs = ((InternalEObject) tCPassport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT, null, msgs);
            if (newTCPassport != null)
                msgs = ((InternalEObject) newTCPassport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT, null, msgs);
            msgs = basicSetTCPassport(newTCPassport, msgs);
            if (msgs != null) msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT, newTCPassport, newTCPassport));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTCPassport(TCPassportType newTCPassport, NotificationChain msgs) {
        TCPassportType oldTCPassport = tCPassport;
        tCPassport = newTCPassport;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT, oldTCPassport, newTCPassport);
            if (msgs == null) msgs = notification;
            else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<TCPictureType> getTCPicture() {
        if (tCPicture == null) {
            tCPicture = new EObjectContainmentEList<>(TCPictureType.class, this, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE);
        }
        return tCPicture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getTCNotebook() {
        if (tCNotebook == null) {
            tCNotebook = new EDataTypeEList<>(String.class, this, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NOTEBOOK);
        }
        return tCNotebook;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<TCTextType> getTCText() {
        if (tCText == null) {
            tCText = new EObjectContainmentEList<>(TCTextType.class, this, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT);
        }
        return tCText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setAuthor(Object newAuthor) {
        Object oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object getSortKey() {
        return sortKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setSortKey(Object newSortKey) {
        Object oldSortKey = sortKey;
        sortKey = newSortKey;
        boolean oldSortKeyESet = sortKeyESet;
        sortKeyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY, oldSortKey, sortKey, !oldSortKeyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void unsetSortKey() {
        Object oldSortKey = sortKey;
        boolean oldSortKeyESet = sortKeyESet;
        sortKey = SORT_KEY_EDEFAULT;
        sortKeyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY, oldSortKey, SORT_KEY_EDEFAULT, oldSortKeyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean isSetSortKey() {
        return sortKeyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object getTCName() {
        return tCName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTCName(Object newTCName) {
        Object oldTCName = tCName;
        tCName = newTCName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NAME, oldTCName, tCName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT:
                return basicSetTCPassport(null, msgs);
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE:
                return ((InternalEList<?>) getTCPicture()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT:
                return ((InternalEList<?>) getTCText()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT:
                return getTCPassport();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE:
                return getTCPicture();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NOTEBOOK:
                return getTCNotebook();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT:
                return getTCText();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__AUTHOR:
                return getAuthor();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY:
                return getSortKey();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NAME:
                return getTCName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT:
                setTCPassport((TCPassportType) newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE:
                getTCPicture().clear();
                getTCPicture().addAll((Collection<? extends TCPictureType>) newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NOTEBOOK:
                getTCNotebook().clear();
                getTCNotebook().addAll((Collection<? extends String>) newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT:
                getTCText().clear();
                getTCText().addAll((Collection<? extends TCTextType>) newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__AUTHOR:
                setAuthor(newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY:
                setSortKey(newValue);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NAME:
                setTCName(newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT:
                setTCPassport(null);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE:
                getTCPicture().clear();
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NOTEBOOK:
                getTCNotebook().clear();
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT:
                getTCText().clear();
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY:
                unsetSortKey();
                return;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NAME:
                setTCName(TC_NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PASSPORT:
                return tCPassport != null;
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_PICTURE:
                return tCPicture != null && !tCPicture.isEmpty();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NOTEBOOK:
                return tCNotebook != null && !tCNotebook.isEmpty();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_TEXT:
                return tCText != null && !tCText.isEmpty();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__SORT_KEY:
                return isSetSortKey();
            case CorpusDTDneuPackage.TC_SUPER_TEXT_TYPE__TC_NAME:
                return TC_NAME_EDEFAULT == null ? tCName != null : !TC_NAME_EDEFAULT.equals(tCName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (tCNotebook: ");
        result.append(tCNotebook);
        result.append(", author: ");
        result.append(author);
        result.append(", sortKey: ");
        if (sortKeyESet) result.append(sortKey);
        else result.append("<unset>");
        result.append(", tCName: ");
        result.append(tCName);
        result.append(')');
        return result.toString();
    }

} //TCSuperTextTypeImpl
