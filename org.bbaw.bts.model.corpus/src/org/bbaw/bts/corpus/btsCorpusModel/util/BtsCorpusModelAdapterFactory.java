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
package org.bbaw.bts.corpus.btsCorpusModel.util;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSNamedTypedObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.corpus.btsCorpusModel.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @generated
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage
 */
public class BtsCorpusModelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected static BtsCorpusModelPackage modelPackage;
    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BtsCorpusModelSwitch<Adapter> modelSwitch =
            new BtsCorpusModelSwitch<Adapter>() {
                @Override
                public Adapter caseBTSCorpusObject(BTSCorpusObject object) {
                    return createBTSCorpusObjectAdapter();
                }

                @Override
                public Adapter caseBTSTCObject(BTSTCObject object) {
                    return createBTSTCObjectAdapter();
                }

                @Override
                public Adapter caseBTSText(BTSText object) {
                    return createBTSTextAdapter();
                }

                @Override
                public Adapter caseBTSLemmaEntry(BTSLemmaEntry object) {
                    return createBTSLemmaEntryAdapter();
                }

                @Override
                public Adapter caseBTSPassport(BTSPassport object) {
                    return createBTSPassportAdapter();
                }

                @Override
                public Adapter caseBTSAnnotation(BTSAnnotation object) {
                    return createBTSAnnotationAdapter();
                }

                @Override
                public Adapter caseBTSPassportEntryGroup(BTSPassportEntryGroup object) {
                    return createBTSPassportEntryGroupAdapter();
                }

                @Override
                public Adapter caseBTSTextCorpus(BTSTextCorpus object) {
                    return createBTSTextCorpusAdapter();
                }

                @Override
                public Adapter caseBTSImage(BTSImage object) {
                    return createBTSImageAdapter();
                }

                @Override
                public Adapter caseBTSCorpusHeader(BTSCorpusHeader object) {
                    return createBTSCorpusHeaderAdapter();
                }

                @Override
                public Adapter caseBTSThsEntry(BTSThsEntry object) {
                    return createBTSThsEntryAdapter();
                }

                @Override
                public Adapter caseBTSTextContent(BTSTextContent object) {
                    return createBTSTextContentAdapter();
                }

                @Override
                public Adapter caseBTSPassportEntry(BTSPassportEntry object) {
                    return createBTSPassportEntryAdapter();
                }

                @Override
                public Adapter caseBTSWord(BTSWord object) {
                    return createBTSWordAdapter();
                }

                @Override
                public Adapter caseBTSTextItems(BTSTextItems object) {
                    return createBTSTextItemsAdapter();
                }

                @Override
                public Adapter caseBTSGraphic(BTSGraphic object) {
                    return createBTSGraphicAdapter();
                }

                @Override
                public Adapter caseBTSSenctence(BTSSenctence object) {
                    return createBTSSenctenceAdapter();
                }

                @Override
                public Adapter caseBTSMarker(BTSMarker object) {
                    return createBTSMarkerAdapter();
                }

                @Override
                public Adapter caseBTSSentenceItem(BTSSentenceItem object) {
                    return createBTSSentenceItemAdapter();
                }

                @Override
                public Adapter caseBTSAmbivalence(BTSAmbivalence object) {
                    return createBTSAmbivalenceAdapter();
                }

                @Override
                public Adapter caseBTSLemmaCase(BTSLemmaCase object) {
                    return createBTSLemmaCaseAdapter();
                }

                @Override
                public Adapter caseBTSTextSentenceItem(BTSTextSentenceItem object) {
                    return createBTSTextSentenceItemAdapter();
                }

                @Override
                public Adapter caseBTSAmbivalenceItem(BTSAmbivalenceItem object) {
                    return createBTSAmbivalenceItemAdapter();
                }

                @Override
                public Adapter caseBTSPassportEntryItem(BTSPassportEntryItem object) {
                    return createBTSPassportEntryItemAdapter();
                }

                @Override
                public Adapter caseBTSAbstractText(BTSAbstractText object) {
                    return createBTSAbstractTextAdapter();
                }

                @Override
                public Adapter caseBTSAbstractParagraph(BTSAbstractParagraph object) {
                    return createBTSAbstractParagraphAdapter();
                }

                @Override
                public Adapter caseBTSObservableObject(BTSObservableObject object) {
                    return createBTSObservableObjectAdapter();
                }

                @Override
                public Adapter caseBTSIdentifiableItem(BTSIdentifiableItem object) {
                    return createBTSIdentifiableItemAdapter();
                }

                @Override
                public Adapter caseAdministrativDataObject(AdministrativDataObject object) {
                    return createAdministrativDataObjectAdapter();
                }

                @Override
                public Adapter caseBTSDBBaseObject(BTSDBBaseObject object) {
                    return createBTSDBBaseObjectAdapter();
                }

                @Override
                public Adapter caseBTSNamedTypedObject(BTSNamedTypedObject object) {
                    return createBTSNamedTypedObjectAdapter();
                }

                @Override
                public Adapter caseBTSObject(BTSObject object) {
                    return createBTSObjectAdapter();
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
    public BtsCorpusModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BtsCorpusModelPackage.eINSTANCE;
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
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject <em>BTS Corpus Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject
     */
    public Adapter createBTSCorpusObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject <em>BTSTC Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject
     */
    public Adapter createBTSTCObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSText <em>BTS Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSText
     */
    public Adapter createBTSTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry <em>BTS Lemma Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry
     */
    public Adapter createBTSLemmaEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport <em>BTS Passport</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport
     */
    public Adapter createBTSPassportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation <em>BTS Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation
     */
    public Adapter createBTSAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup <em>BTS Passport Entry Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup
     */
    public Adapter createBTSPassportEntryGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus <em>BTS Text Corpus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus
     */
    public Adapter createBTSTextCorpusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage <em>BTS Image</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSImage
     */
    public Adapter createBTSImageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader <em>BTS Corpus Header</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader
     */
    public Adapter createBTSCorpusHeaderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry <em>BTS Ths Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry
     */
    public Adapter createBTSThsEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent <em>BTS Text Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent
     */
    public Adapter createBTSTextContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry <em>BTS Passport Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry
     */
    public Adapter createBTSPassportEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord <em>BTS Word</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord
     */
    public Adapter createBTSWordAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems <em>BTS Text Items</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems
     */
    public Adapter createBTSTextItemsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic <em>BTS Graphic</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic
     */
    public Adapter createBTSGraphicAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence <em>BTS Senctence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence
     */
    public Adapter createBTSSenctenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSMarker <em>BTS Marker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSMarker
     */
    public Adapter createBTSMarkerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem <em>BTS Sentence Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem
     */
    public Adapter createBTSSentenceItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence <em>BTS Ambivalence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence
     */
    public Adapter createBTSAmbivalenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase <em>BTS Lemma Case</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase
     */
    public Adapter createBTSLemmaCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem <em>BTS Text Sentence Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem
     */
    public Adapter createBTSTextSentenceItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem
     */
    public Adapter createBTSAmbivalenceItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem <em>BTS Passport Entry Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem
     */
    public Adapter createBTSPassportEntryItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText <em>BTS Abstract Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText
     */
    public Adapter createBTSAbstractTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph <em>BTS Abstract Paragraph</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph
     */
    public Adapter createBTSAbstractParagraphAdapter() {
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

} //BtsCorpusModelAdapterFactory
