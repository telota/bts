/*
 */
package CorpusDTDneu.provider;

import CorpusDTDneu.util.CorpusDTDneuAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CorpusDTDneuItemProviderAdapterFactory extends CorpusDTDneuAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<>();
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.BausteinPassageType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BausteinPassageTypeItemProvider bausteinPassageTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.DateThsType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DateThsTypeItemProvider dateThsTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.DateType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DateTypeItemProvider dateTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyPunctuationType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyPunctuationTypeItemProvider egyPunctuationTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgySentType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgySentTypeItemProvider egySentTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgySubTxtType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgySubTxtTypeItemProvider egySubTxtTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgySzenarioType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgySzenarioTypeItemProvider egySzenarioTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyTB1Type} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTB1TypeItemProvider egyTB1TypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyTB3EndType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTB3EndTypeItemProvider egyTB3EndTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyTB3StartType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTB3StartTypeItemProvider egyTB3StartTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyTxtCorpusType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTxtCorpusTypeItemProvider egyTxtCorpusTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyTxtType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyTxtTypeItemProvider egyTxtTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.EgyWordType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EgyWordTypeItemProvider egyWordTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.FormattingElementType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected FormattingElementTypeItemProvider formattingElementTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.GlossePassageType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected GlossePassageTypeItemProvider glossePassageTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.GlosseType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected GlosseTypeItemProvider glosseTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.LanguagePassageType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LanguagePassageTypeItemProvider languagePassageTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.LeipzigPassageType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LeipzigPassageTypeItemProvider leipzigPassageTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.LineCountType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected LineCountTypeItemProvider lineCountTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.NoteType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected NoteTypeItemProvider noteTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.PassportDataItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PassportDataItemItemProvider passportDataItemItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.PassportDataItemType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PassportDataItemTypeItemProvider passportDataItemTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.PicturesTableType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PicturesTableTypeItemProvider picturesTableTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.PictureType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PictureTypeItemProvider pictureTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.PunctuationType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected PunctuationTypeItemProvider punctuationTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCArrangementType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCArrangementTypeItemProvider tcArrangementTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCCaptionType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCCaptionTypeItemProvider tcCaptionTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCGroupType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCGroupTypeItemProvider tcGroupTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCHeaderType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCHeaderTypeItemProvider tcHeaderTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCLocationType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCLocationTypeItemProvider tcLocationTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCObjectType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCObjectTypeItemProvider tcObjectTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCObjPartType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCObjPartTypeItemProvider tcObjPartTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCPassportType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCPassportTypeItemProvider tcPassportTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCPictureType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCPictureTypeItemProvider tcPictureTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCSceneType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCSceneTypeItemProvider tcSceneTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCSuperTextType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCSuperTextTypeItemProvider tcSuperTextTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.TCTextType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TCTextTypeItemProvider tcTextTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.ThsEntryType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ThsEntryTypeItemProvider thsEntryTypeItemProvider;
    /**
     * This keeps track of the one adapter used for all {@link CorpusDTDneu.WorkType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected WorkTypeItemProvider workTypeItemProvider;

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CorpusDTDneuItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.BausteinPassageType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBausteinPassageTypeAdapter() {
        if (bausteinPassageTypeItemProvider == null) {
            bausteinPassageTypeItemProvider = new BausteinPassageTypeItemProvider(this);
        }

        return bausteinPassageTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.DateThsType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDateThsTypeAdapter() {
        if (dateThsTypeItemProvider == null) {
            dateThsTypeItemProvider = new DateThsTypeItemProvider(this);
        }

        return dateThsTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.DateType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDateTypeAdapter() {
        if (dateTypeItemProvider == null) {
            dateTypeItemProvider = new DateTypeItemProvider(this);
        }

        return dateTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.DocumentRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDocumentRootAdapter() {
        if (documentRootItemProvider == null) {
            documentRootItemProvider = new DocumentRootItemProvider(this);
        }

        return documentRootItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyPunctuationType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyPunctuationTypeAdapter() {
        if (egyPunctuationTypeItemProvider == null) {
            egyPunctuationTypeItemProvider = new EgyPunctuationTypeItemProvider(this);
        }

        return egyPunctuationTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgySentType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgySentTypeAdapter() {
        if (egySentTypeItemProvider == null) {
            egySentTypeItemProvider = new EgySentTypeItemProvider(this);
        }

        return egySentTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgySubTxtType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgySubTxtTypeAdapter() {
        if (egySubTxtTypeItemProvider == null) {
            egySubTxtTypeItemProvider = new EgySubTxtTypeItemProvider(this);
        }

        return egySubTxtTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgySzenarioType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgySzenarioTypeAdapter() {
        if (egySzenarioTypeItemProvider == null) {
            egySzenarioTypeItemProvider = new EgySzenarioTypeItemProvider(this);
        }

        return egySzenarioTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyTB1Type}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyTB1TypeAdapter() {
        if (egyTB1TypeItemProvider == null) {
            egyTB1TypeItemProvider = new EgyTB1TypeItemProvider(this);
        }

        return egyTB1TypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyTB3EndType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyTB3EndTypeAdapter() {
        if (egyTB3EndTypeItemProvider == null) {
            egyTB3EndTypeItemProvider = new EgyTB3EndTypeItemProvider(this);
        }

        return egyTB3EndTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyTB3StartType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyTB3StartTypeAdapter() {
        if (egyTB3StartTypeItemProvider == null) {
            egyTB3StartTypeItemProvider = new EgyTB3StartTypeItemProvider(this);
        }

        return egyTB3StartTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyTxtCorpusType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyTxtCorpusTypeAdapter() {
        if (egyTxtCorpusTypeItemProvider == null) {
            egyTxtCorpusTypeItemProvider = new EgyTxtCorpusTypeItemProvider(this);
        }

        return egyTxtCorpusTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyTxtType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyTxtTypeAdapter() {
        if (egyTxtTypeItemProvider == null) {
            egyTxtTypeItemProvider = new EgyTxtTypeItemProvider(this);
        }

        return egyTxtTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.EgyWordType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEgyWordTypeAdapter() {
        if (egyWordTypeItemProvider == null) {
            egyWordTypeItemProvider = new EgyWordTypeItemProvider(this);
        }

        return egyWordTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.FormattingElementType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFormattingElementTypeAdapter() {
        if (formattingElementTypeItemProvider == null) {
            formattingElementTypeItemProvider = new FormattingElementTypeItemProvider(this);
        }

        return formattingElementTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.GlossePassageType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGlossePassageTypeAdapter() {
        if (glossePassageTypeItemProvider == null) {
            glossePassageTypeItemProvider = new GlossePassageTypeItemProvider(this);
        }

        return glossePassageTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.GlosseType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGlosseTypeAdapter() {
        if (glosseTypeItemProvider == null) {
            glosseTypeItemProvider = new GlosseTypeItemProvider(this);
        }

        return glosseTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.LanguagePassageType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLanguagePassageTypeAdapter() {
        if (languagePassageTypeItemProvider == null) {
            languagePassageTypeItemProvider = new LanguagePassageTypeItemProvider(this);
        }

        return languagePassageTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.LeipzigPassageType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLeipzigPassageTypeAdapter() {
        if (leipzigPassageTypeItemProvider == null) {
            leipzigPassageTypeItemProvider = new LeipzigPassageTypeItemProvider(this);
        }

        return leipzigPassageTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.LineCountType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLineCountTypeAdapter() {
        if (lineCountTypeItemProvider == null) {
            lineCountTypeItemProvider = new LineCountTypeItemProvider(this);
        }

        return lineCountTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.NoteType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createNoteTypeAdapter() {
        if (noteTypeItemProvider == null) {
            noteTypeItemProvider = new NoteTypeItemProvider(this);
        }

        return noteTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.PassportDataItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPassportDataItemAdapter() {
        if (passportDataItemItemProvider == null) {
            passportDataItemItemProvider = new PassportDataItemItemProvider(this);
        }

        return passportDataItemItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.PassportDataItemType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPassportDataItemTypeAdapter() {
        if (passportDataItemTypeItemProvider == null) {
            passportDataItemTypeItemProvider = new PassportDataItemTypeItemProvider(this);
        }

        return passportDataItemTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.PicturesTableType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPicturesTableTypeAdapter() {
        if (picturesTableTypeItemProvider == null) {
            picturesTableTypeItemProvider = new PicturesTableTypeItemProvider(this);
        }

        return picturesTableTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.PictureType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPictureTypeAdapter() {
        if (pictureTypeItemProvider == null) {
            pictureTypeItemProvider = new PictureTypeItemProvider(this);
        }

        return pictureTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.PunctuationType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPunctuationTypeAdapter() {
        if (punctuationTypeItemProvider == null) {
            punctuationTypeItemProvider = new PunctuationTypeItemProvider(this);
        }

        return punctuationTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCArrangementType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCArrangementTypeAdapter() {
        if (tcArrangementTypeItemProvider == null) {
            tcArrangementTypeItemProvider = new TCArrangementTypeItemProvider(this);
        }

        return tcArrangementTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCCaptionType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCCaptionTypeAdapter() {
        if (tcCaptionTypeItemProvider == null) {
            tcCaptionTypeItemProvider = new TCCaptionTypeItemProvider(this);
        }

        return tcCaptionTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCGroupType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCGroupTypeAdapter() {
        if (tcGroupTypeItemProvider == null) {
            tcGroupTypeItemProvider = new TCGroupTypeItemProvider(this);
        }

        return tcGroupTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCHeaderType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCHeaderTypeAdapter() {
        if (tcHeaderTypeItemProvider == null) {
            tcHeaderTypeItemProvider = new TCHeaderTypeItemProvider(this);
        }

        return tcHeaderTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCLocationType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCLocationTypeAdapter() {
        if (tcLocationTypeItemProvider == null) {
            tcLocationTypeItemProvider = new TCLocationTypeItemProvider(this);
        }

        return tcLocationTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCObjectType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCObjectTypeAdapter() {
        if (tcObjectTypeItemProvider == null) {
            tcObjectTypeItemProvider = new TCObjectTypeItemProvider(this);
        }

        return tcObjectTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCObjPartType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCObjPartTypeAdapter() {
        if (tcObjPartTypeItemProvider == null) {
            tcObjPartTypeItemProvider = new TCObjPartTypeItemProvider(this);
        }

        return tcObjPartTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCPassportType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCPassportTypeAdapter() {
        if (tcPassportTypeItemProvider == null) {
            tcPassportTypeItemProvider = new TCPassportTypeItemProvider(this);
        }

        return tcPassportTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCPictureType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCPictureTypeAdapter() {
        if (tcPictureTypeItemProvider == null) {
            tcPictureTypeItemProvider = new TCPictureTypeItemProvider(this);
        }

        return tcPictureTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCSceneType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCSceneTypeAdapter() {
        if (tcSceneTypeItemProvider == null) {
            tcSceneTypeItemProvider = new TCSceneTypeItemProvider(this);
        }

        return tcSceneTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCSuperTextType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCSuperTextTypeAdapter() {
        if (tcSuperTextTypeItemProvider == null) {
            tcSuperTextTypeItemProvider = new TCSuperTextTypeItemProvider(this);
        }

        return tcSuperTextTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.TCTextType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTCTextTypeAdapter() {
        if (tcTextTypeItemProvider == null) {
            tcTextTypeItemProvider = new TCTextTypeItemProvider(this);
        }

        return tcTextTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.ThsEntryType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createThsEntryTypeAdapter() {
        if (thsEntryTypeItemProvider == null) {
            thsEntryTypeItemProvider = new ThsEntryTypeItemProvider(this);
        }

        return thsEntryTypeItemProvider;
    }

    /**
     * This creates an adapter for a {@link CorpusDTDneu.WorkType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createWorkTypeAdapter() {
        if (workTypeItemProvider == null) {
            workTypeItemProvider = new WorkTypeItemProvider(this);
        }

        return workTypeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
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
     *
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
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
     *
     * @generated
     */
    public void dispose() {
        if (bausteinPassageTypeItemProvider != null) bausteinPassageTypeItemProvider.dispose();
        if (dateThsTypeItemProvider != null) dateThsTypeItemProvider.dispose();
        if (dateTypeItemProvider != null) dateTypeItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
        if (egyPunctuationTypeItemProvider != null) egyPunctuationTypeItemProvider.dispose();
        if (egySentTypeItemProvider != null) egySentTypeItemProvider.dispose();
        if (egySubTxtTypeItemProvider != null) egySubTxtTypeItemProvider.dispose();
        if (egySzenarioTypeItemProvider != null) egySzenarioTypeItemProvider.dispose();
        if (egyTB1TypeItemProvider != null) egyTB1TypeItemProvider.dispose();
        if (egyTB3EndTypeItemProvider != null) egyTB3EndTypeItemProvider.dispose();
        if (egyTB3StartTypeItemProvider != null) egyTB3StartTypeItemProvider.dispose();
        if (egyTxtCorpusTypeItemProvider != null) egyTxtCorpusTypeItemProvider.dispose();
        if (egyTxtTypeItemProvider != null) egyTxtTypeItemProvider.dispose();
        if (egyWordTypeItemProvider != null) egyWordTypeItemProvider.dispose();
        if (formattingElementTypeItemProvider != null) formattingElementTypeItemProvider.dispose();
        if (glossePassageTypeItemProvider != null) glossePassageTypeItemProvider.dispose();
        if (glosseTypeItemProvider != null) glosseTypeItemProvider.dispose();
        if (languagePassageTypeItemProvider != null) languagePassageTypeItemProvider.dispose();
        if (leipzigPassageTypeItemProvider != null) leipzigPassageTypeItemProvider.dispose();
        if (lineCountTypeItemProvider != null) lineCountTypeItemProvider.dispose();
        if (noteTypeItemProvider != null) noteTypeItemProvider.dispose();
        if (passportDataItemItemProvider != null) passportDataItemItemProvider.dispose();
        if (passportDataItemTypeItemProvider != null) passportDataItemTypeItemProvider.dispose();
        if (picturesTableTypeItemProvider != null) picturesTableTypeItemProvider.dispose();
        if (pictureTypeItemProvider != null) pictureTypeItemProvider.dispose();
        if (punctuationTypeItemProvider != null) punctuationTypeItemProvider.dispose();
        if (tcArrangementTypeItemProvider != null) tcArrangementTypeItemProvider.dispose();
        if (tcCaptionTypeItemProvider != null) tcCaptionTypeItemProvider.dispose();
        if (tcGroupTypeItemProvider != null) tcGroupTypeItemProvider.dispose();
        if (tcHeaderTypeItemProvider != null) tcHeaderTypeItemProvider.dispose();
        if (tcLocationTypeItemProvider != null) tcLocationTypeItemProvider.dispose();
        if (tcObjectTypeItemProvider != null) tcObjectTypeItemProvider.dispose();
        if (tcObjPartTypeItemProvider != null) tcObjPartTypeItemProvider.dispose();
        if (tcPassportTypeItemProvider != null) tcPassportTypeItemProvider.dispose();
        if (tcPictureTypeItemProvider != null) tcPictureTypeItemProvider.dispose();
        if (tcSceneTypeItemProvider != null) tcSceneTypeItemProvider.dispose();
        if (tcSuperTextTypeItemProvider != null) tcSuperTextTypeItemProvider.dispose();
        if (tcTextTypeItemProvider != null) tcTextTypeItemProvider.dispose();
        if (thsEntryTypeItemProvider != null) thsEntryTypeItemProvider.dispose();
        if (workTypeItemProvider != null) workTypeItemProvider.dispose();
    }

}
