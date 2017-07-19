/*
 */
package CorpusDTDneu.impl;

import CorpusDTDneu.CorpusDTDneuPackage;
import CorpusDTDneu.LineCountType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Count Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link CorpusDTDneu.impl.LineCountTypeImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link CorpusDTDneu.impl.LineCountTypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link CorpusDTDneu.impl.LineCountTypeImpl#getValue <em>Value</em>}</li>
 * <li>{@link CorpusDTDneu.impl.LineCountTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineCountTypeImpl extends MinimalEObjectImpl.Container implements LineCountType {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getMixed()
     */
    protected FeatureMap mixed;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LineCountTypeImpl() {
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
        return CorpusDTDneuPackage.Literals.LINE_COUNT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public FeatureMap getGroup() {
        return (FeatureMap) getMixed().<FeatureMap.Entry>list(CorpusDTDneuPackage.Literals.LINE_COUNT_TYPE__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getValue() {
        return getGroup().list(CorpusDTDneuPackage.Literals.LINE_COUNT_TYPE__VALUE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList<String> getComment() {
        return getGroup().list(CorpusDTDneuPackage.Literals.LINE_COUNT_TYPE__COMMENT);
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
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED:
                return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
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
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal) getMixed()).getWrapper();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__VALUE:
                return getValue();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__COMMENT:
                return getComment();
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
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED:
                ((FeatureMap.Internal) getMixed()).set(newValue);
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__VALUE:
                getValue().clear();
                getValue().addAll((Collection<? extends String>) newValue);
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__COMMENT:
                getComment().clear();
                getComment().addAll((Collection<? extends String>) newValue);
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
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED:
                getMixed().clear();
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__GROUP:
                getGroup().clear();
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__VALUE:
                getValue().clear();
                return;
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__COMMENT:
                getComment().clear();
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
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__MIXED:
                return mixed != null && !mixed.isEmpty();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__GROUP:
                return !getGroup().isEmpty();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__VALUE:
                return !getValue().isEmpty();
            case CorpusDTDneuPackage.LINE_COUNT_TYPE__COMMENT:
                return !getComment().isEmpty();
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //LineCountTypeImpl
