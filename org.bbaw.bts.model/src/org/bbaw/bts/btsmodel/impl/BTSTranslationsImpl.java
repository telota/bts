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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>BTS Translations</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.impl.BTSTranslationsImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BTSTranslationsImpl extends MinimalEObjectImpl.Container implements BTSTranslations
{
	private static final String EN = "en";
	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}
	 * ' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<BTSTranslation> translations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTranslationsImpl()
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
		return BtsmodelPackage.Literals.BTS_TRANSLATIONS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTSTranslation> getTranslations()
	{
		if (translations == null) {
			translations = new EObjectContainmentEList<BTSTranslation>(BTSTranslation.class, this, BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * tries to return a translation, tries first for the given language, if not availabe, tries english, if not available
	 * tries anyother language.
	 * <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public String getTranslation(String language)
	{
		if (language == null)
		{
			if (getTranslations().isEmpty()) return null;
			else
			{
				return getTranslations().get(0).getValue();
			}
		}
		BTSTranslation trans = getTranslationInternal(language);
		{
			if (trans != null)
			{
				return trans.getValue();
			}
			trans = getTranslationInternal(EN);
			if (trans != null)
			{
				return trans.getValue();
			}
			trans = getTranslationInternal(null);
			if (trans != null)
			{
				return trans.getValue();
			}

		}
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public String setTranslation(String translation, String language)
	{
		BTSTranslation trans = getTranslationInternal(language);
		if (trans != null)
		{
			trans.setValue(translation);
			return trans.getValue();
		} else
		{
			trans = BtsmodelFactory.eINSTANCE.createBTSTranslation();
			trans.setLang(language);
			trans.setValue(translation);
			getTranslations().add(trans);
			return translation;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	public BTSTranslation getBTSTranslation(String lang) {
		return getTranslationInternal(lang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public EList<String> getLanguages() {
		EList<String> langs = new BasicEList<String>();
		if (translations == null) {
			return langs;
		}
		for (BTSTranslation t : translations) {
			if (t.getLang() != null && !"".equals(t.getLang())
					&& t.getValue() != null && !"".equals(t.getValue()))
			{
				langs.add(t.getLang());
			}

		}
		return langs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * return only the translation for the given language, or null if not available.
	 * <!-- end-user-doc -->
	 * @generatedNOT
	 */
	public String getTranslationStrict(String language) {
		BTSTranslation tr = getTranslationInternal(language);
		if (tr != null) return tr.getValue();
		return null;
	}

	private BTSTranslation getTranslationInternal(String language)
	{
		if (language != null)
		{
			for (BTSTranslation tr : getTranslations())
			{
				if (language.equals(tr.getLang())) {
					return tr;
				}
			}
		}
		else if (getTranslations() != null && !getTranslations().isEmpty()) {
			return getTranslations().get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS:
				return ((InternalEList<?>)getTranslations()).basicRemove(otherEnd, msgs);
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
			case BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS:
				return getTranslations();
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
			case BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS:
				getTranslations().clear();
				getTranslations().addAll((Collection<? extends BTSTranslation>)newValue);
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
			case BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS:
				getTranslations().clear();
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
			case BtsmodelPackage.BTS_TRANSLATIONS__TRANSLATIONS:
				return translations != null && !translations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case BtsmodelPackage.BTS_TRANSLATIONS___GET_TRANSLATION__STRING:
				return getTranslation((String)arguments.get(0));
			case BtsmodelPackage.BTS_TRANSLATIONS___SET_TRANSLATION__STRING_STRING:
				return setTranslation((String)arguments.get(0), (String)arguments.get(1));
			case BtsmodelPackage.BTS_TRANSLATIONS___GET_BTS_TRANSLATION__STRING:
				return getBTSTranslation((String)arguments.get(0));
			case BtsmodelPackage.BTS_TRANSLATIONS___GET_LANGUAGES:
				return getLanguages();
			case BtsmodelPackage.BTS_TRANSLATIONS___GET_TRANSLATION_STRICT__STRING:
				return getTranslationStrict((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // BTSTranslationsImpl
