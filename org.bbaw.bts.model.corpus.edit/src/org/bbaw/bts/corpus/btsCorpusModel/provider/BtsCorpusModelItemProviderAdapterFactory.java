/**
 */
package org.bbaw.bts.corpus.btsCorpusModel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.bbaw.bts.corpus.btsCorpusModel.util.BtsCorpusModelAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsCorpusModelItemProviderAdapterFactory extends BtsCorpusModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsCorpusModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ITableItemColorProvider.class);
		supportedTypes.add(ITableItemFontProvider.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
		supportedTypes.add(IItemStyledLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTCObjectItemProvider btstcObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSTCObjectAdapter() {
		if (btstcObjectItemProvider == null) {
			btstcObjectItemProvider = new BTSTCObjectItemProvider(this);
		}

		return btstcObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTextItemProvider btsTextItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSTextAdapter() {
		if (btsTextItemProvider == null) {
			btsTextItemProvider = new BTSTextItemProvider(this);
		}

		return btsTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSLemmaEntryItemProvider btsLemmaEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSLemmaEntryAdapter() {
		if (btsLemmaEntryItemProvider == null) {
			btsLemmaEntryItemProvider = new BTSLemmaEntryItemProvider(this);
		}

		return btsLemmaEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportItemProvider btsPassportItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSPassportAdapter() {
		if (btsPassportItemProvider == null) {
			btsPassportItemProvider = new BTSPassportItemProvider(this);
		}

		return btsPassportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSAnnotationItemProvider btsAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSAnnotationAdapter() {
		if (btsAnnotationItemProvider == null) {
			btsAnnotationItemProvider = new BTSAnnotationItemProvider(this);
		}

		return btsAnnotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportEntryGroupItemProvider btsPassportEntryGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSPassportEntryGroupAdapter() {
		if (btsPassportEntryGroupItemProvider == null) {
			btsPassportEntryGroupItemProvider = new BTSPassportEntryGroupItemProvider(this);
		}

		return btsPassportEntryGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTextCorpusItemProvider btsTextCorpusItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSTextCorpusAdapter() {
		if (btsTextCorpusItemProvider == null) {
			btsTextCorpusItemProvider = new BTSTextCorpusItemProvider(this);
		}

		return btsTextCorpusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSImageItemProvider btsImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSImageAdapter() {
		if (btsImageItemProvider == null) {
			btsImageItemProvider = new BTSImageItemProvider(this);
		}

		return btsImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSCorpusHeaderItemProvider btsCorpusHeaderItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSCorpusHeaderAdapter() {
		if (btsCorpusHeaderItemProvider == null) {
			btsCorpusHeaderItemProvider = new BTSCorpusHeaderItemProvider(this);
		}

		return btsCorpusHeaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSThsEntryItemProvider btsThsEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSThsEntryAdapter() {
		if (btsThsEntryItemProvider == null) {
			btsThsEntryItemProvider = new BTSThsEntryItemProvider(this);
		}

		return btsThsEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSTextContentItemProvider btsTextContentItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSTextContentAdapter() {
		if (btsTextContentItemProvider == null) {
			btsTextContentItemProvider = new BTSTextContentItemProvider(this);
		}

		return btsTextContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSLemmaSubentryItemProvider btsLemmaSubentryItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSLemmaSubentryAdapter() {
		if (btsLemmaSubentryItemProvider == null) {
			btsLemmaSubentryItemProvider = new BTSLemmaSubentryItemProvider(this);
		}

		return btsLemmaSubentryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSWordItemProvider btsWordItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSWordAdapter() {
		if (btsWordItemProvider == null) {
			btsWordItemProvider = new BTSWordItemProvider(this);
		}

		return btsWordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSGraphicItemProvider btsGraphicItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSGraphicAdapter() {
		if (btsGraphicItemProvider == null) {
			btsGraphicItemProvider = new BTSGraphicItemProvider(this);
		}

		return btsGraphicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSSenctenceItemProvider btsSenctenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSSenctenceAdapter() {
		if (btsSenctenceItemProvider == null) {
			btsSenctenceItemProvider = new BTSSenctenceItemProvider(this);
		}

		return btsSenctenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSMarker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSMarkerItemProvider btsMarkerItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSMarker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSMarkerAdapter() {
		if (btsMarkerItemProvider == null) {
			btsMarkerItemProvider = new BTSMarkerItemProvider(this);
		}

		return btsMarkerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSAmbivalenceItemProvider btsAmbivalenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSAmbivalenceAdapter() {
		if (btsAmbivalenceItemProvider == null) {
			btsAmbivalenceItemProvider = new BTSAmbivalenceItemProvider(this);
		}

		return btsAmbivalenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSLemmaCaseItemProvider btsLemmaCaseItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSLemmaCaseAdapter() {
		if (btsLemmaCaseItemProvider == null) {
			btsLemmaCaseItemProvider = new BTSLemmaCaseItemProvider(this);
		}

		return btsLemmaCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSPassportEntryItemItemProvider btsPassportEntryItemItemProvider;

	/**
	 * This creates an adapter for a {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTSPassportEntryItemAdapter() {
		if (btsPassportEntryItemItemProvider == null) {
			btsPassportEntryItemItemProvider = new BTSPassportEntryItemItemProvider(this);
		}

		return btsPassportEntryItemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (btstcObjectItemProvider != null) btstcObjectItemProvider.dispose();
		if (btsTextItemProvider != null) btsTextItemProvider.dispose();
		if (btsLemmaEntryItemProvider != null) btsLemmaEntryItemProvider.dispose();
		if (btsPassportItemProvider != null) btsPassportItemProvider.dispose();
		if (btsAnnotationItemProvider != null) btsAnnotationItemProvider.dispose();
		if (btsPassportEntryGroupItemProvider != null) btsPassportEntryGroupItemProvider.dispose();
		if (btsTextCorpusItemProvider != null) btsTextCorpusItemProvider.dispose();
		if (btsImageItemProvider != null) btsImageItemProvider.dispose();
		if (btsCorpusHeaderItemProvider != null) btsCorpusHeaderItemProvider.dispose();
		if (btsThsEntryItemProvider != null) btsThsEntryItemProvider.dispose();
		if (btsTextContentItemProvider != null) btsTextContentItemProvider.dispose();
		if (btsLemmaSubentryItemProvider != null) btsLemmaSubentryItemProvider.dispose();
		if (btsWordItemProvider != null) btsWordItemProvider.dispose();
		if (btsGraphicItemProvider != null) btsGraphicItemProvider.dispose();
		if (btsSenctenceItemProvider != null) btsSenctenceItemProvider.dispose();
		if (btsMarkerItemProvider != null) btsMarkerItemProvider.dispose();
		if (btsAmbivalenceItemProvider != null) btsAmbivalenceItemProvider.dispose();
		if (btsLemmaCaseItemProvider != null) btsLemmaCaseItemProvider.dispose();
		if (btsPassportEntryItemItemProvider != null) btsPassportEntryItemItemProvider.dispose();
	}

}
