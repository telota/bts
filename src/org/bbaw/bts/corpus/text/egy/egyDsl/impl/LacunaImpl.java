/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl.impl;

import java.util.Collection;

import org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage;
import org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna;
import org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lacuna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl#getWChar <em>WChar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LacunaImpl extends BracketsImpl implements Lacuna
{
  /**
   * The cached value of the '{@link #getWChar() <em>WChar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWChar()
   * @generated
   * @ordered
   */
  protected EList<NoLacuna> wChar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LacunaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EgyDslPackage.Literals.LACUNA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NoLacuna> getWChar()
  {
    if (wChar == null)
    {
      wChar = new EObjectContainmentEList<NoLacuna>(NoLacuna.class, this, EgyDslPackage.LACUNA__WCHAR);
    }
    return wChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EgyDslPackage.LACUNA__WCHAR:
        return ((InternalEList<?>)getWChar()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EgyDslPackage.LACUNA__WCHAR:
        return getWChar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgyDslPackage.LACUNA__WCHAR:
        getWChar().clear();
        getWChar().addAll((Collection<? extends NoLacuna>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EgyDslPackage.LACUNA__WCHAR:
        getWChar().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EgyDslPackage.LACUNA__WCHAR:
        return wChar != null && !wChar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LacunaImpl
