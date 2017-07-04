package bts.transform.ui.xtend;

import CorpusDTDneu.DateThsType;
import CorpusDTDneu.DateType;
import CorpusDTDneu.DocumentRoot;
import CorpusDTDneu.EgyPunctuationType;
import CorpusDTDneu.EgySentType;
import CorpusDTDneu.EgySubTxtType;
import CorpusDTDneu.EgyTB1Type;
import CorpusDTDneu.EgyTxtCorpusType;
import CorpusDTDneu.EgyTxtType;
import CorpusDTDneu.EgyWordType;
import CorpusDTDneu.LineCountType;
import CorpusDTDneu.NoteType;
import CorpusDTDneu.PassportDataItem;
import CorpusDTDneu.PassportDataItemType;
import CorpusDTDneu.TCHeaderType;
import CorpusDTDneu.TCLocationType;
import CorpusDTDneu.TCPassportType;
import CorpusDTDneu.TCTextType;
import CorpusDTDneu.ThsEntryType;
import CorpusDTDneu.TypeType5;
import bts.transform.ui.chars.CharsService;
import bts.transform.ui.signs.SignService;
import bts.transform.ui.thsMapping.ThsMappingService;
import bts.transform.ui.usersRole.UserRoleService;
import com.google.common.base.Objects;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import org.apache.commons.lang.StringUtils;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Corpus2BTSTransform {
  @Inject
  private BTSTextCorpusService textCorpusService;
  
  @Inject
  private BTSTCObjectService tcObjectService;
  
  @Inject
  private CorpusObjectService corpusObjectService;
  
  @Inject
  private BTSTextService textService;
  
  @Inject
  private BTSAnnotationService annotationService;
  
  private final List<BTSCorpusObject> objects = new Vector<BTSCorpusObject>();
  
  private String dbCollection;
  
  private String projectPrefix;
  
  private String corpusPrefix;
  
  private Map<String, String> userIdMap;
  
  private Date now = Calendar.getInstance().getTime();
  
  private Map<String, String> userNameMap;
  
  private Map<String, String> thsDateMap;
  
  private Map<String, String> thsIdMap;
  
  private final List<BTSComment> comments = new Vector<BTSComment>();
  
  private Pattern MinusPattern = Pattern.compile("([^-])(-)([^-])");
  
  private boolean demotic;
  
  private String fileName;
  
  public final static String VERS_BREAK_MARKER_SIGN = "ð";
  
  public final static String VERS_FRONTER_MARKER_SIGN = "°";
  
  public final static String BROKEN_VERS_MARKER_SIGN = "\udb80\udc82";
  
  public final static String DISPUTALBE_VERS_MARKER_SIGN = "⸮ð?";
  
  public final static String DELETED_VERS_MARKER_SIGN = "{ð}";
  
  public final static String DESTROYED_VERS_MARKER_SIGN = "[ð]";
  
  public final static String MISSING_VERS_MARKER_SIGN = "〈ð〉";
  
  public final static String DESTROYEDVERSMARKER_SIGN = "[ð]";
  
  public final static String DELETEDVERSMARKER_SIGN = "{ð}";
  
  public final static String DISPUTABLEVERSMARKER_SIGN = "⸮ð?";
  
  public final static String RESTORATIONOVERRASURMARKER_SIGN = "[[ð]]";
  
  public final static String ANCIENTEXPANDEDMARKER_SIGN = "((ð))";
  
  public final static String RASURMARKER_SIGN = "{{ð}}";
  
  public final static String EMENDATIONVERSMARKER_SIGN = "(ð)";
  
  public final static String DESTROYEDVERSFRONTIERMARKER_SIGN = "[°]";
  
  public final static String PARTIALDESTROYEDVERSMARKER_SIGN = "⸢ð⸣";
  
  public final static String PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN = "⸢⸮ð?⸣";
  
  public final static String DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN = "[⸮°?]";
  
  public final static String DISPUTABLEDESTROYEDVERSMARKER_SIGN = "⸮[ð]?";
  
  public final static String DELETEDDISPUTABLEVERSMARKER_SIGN = "{⸮ð?}";
  
  public final static String MISSINGDISPUTABLEVERSMARKER_SIGN = "〈⸮ð?〉";
  
  public final static String DISPUTABLEDELETEDVERSMARKER_SIGN = "⸮{ð}? ";
  
  public final static String PARTIALDESTROYEDDELETEDVERSMARKER_SIGN = "⸢{ð}⸣";
  
  public final static String DESTROYEDDELETEDVERSMARKER_SIGN = "[{ð}]";
  
  public final static String DELETEDDESTROYEDVERSMARKER_SIGN = "{[ð]}";
  
  public List<BTSCorpusObject> transform(final DocumentRoot root, final String dbCollection, final String projectPrefix, final String corpusPrefix, final Map<String, String> userIdMap, final Map<String, String> userNameMap, final Map<String, String> thsDateMap, final Map<String, String> thsIdMap, final boolean demotic, final String fileName) {
    this.dbCollection = dbCollection;
    this.projectPrefix = projectPrefix;
    this.corpusPrefix = corpusPrefix;
    this.userIdMap = userIdMap;
    this.userNameMap = userNameMap;
    this.thsDateMap = thsDateMap;
    this.thsIdMap = thsIdMap;
    this.demotic = demotic;
    this.fileName = fileName;
    this.objects.clear();
    this.comments.clear();
    final EgyTxtCorpusType txtCorpus = this.retrieveEgyTxtCorpus(root);
    final BTSTextCorpus btsCorpus = this.makeTextCorpus(txtCorpus);
    this.processContainedObjects(txtCorpus, btsCorpus);
    int _size = this.objects.size();
    String _plus = ("nummer of transformed objects " + Integer.valueOf(_size));
    System.out.println(_plus);
    return this.objects;
  }
  
  public BTSTextCorpus makeTextCorpus(final EgyTxtCorpusType type) {
    final BTSTextCorpus btsCorpus = this.textCorpusService.createNew();
    btsCorpus.setName(this.corpusPrefix);
    TCHeaderType _tCHeader = type.getTCHeader();
    String _title = _tCHeader.getTitle();
    boolean _notEquals = (!Objects.equal(_title, null));
    if (_notEquals) {
      String _name = btsCorpus.getName();
      String _plus = (_name + "_");
      TCHeaderType _tCHeader_1 = type.getTCHeader();
      String _title_1 = _tCHeader_1.getTitle();
      String _plus_1 = (_plus + _title_1);
      btsCorpus.setName(_plus_1);
    }
    this.objects.add(btsCorpus);
    btsCorpus.setCorpusPrefix(this.corpusPrefix);
    btsCorpus.setProject(this.projectPrefix);
    btsCorpus.setDBCollectionKey((this.projectPrefix + "_corpus"));
    String _reviewState = UserRoleService.reviewState(this.fileName);
    btsCorpus.setRevisionState(_reviewState);
    String _visibility = UserRoleService.getVisibility(this.fileName);
    btsCorpus.setVisibility(_visibility);
    String user = UserRoleService.getMainUser(this.fileName);
    if (((!Objects.equal(user, null)) && this.userIdMap.containsKey(user))) {
      BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
      rev.setRef(0);
      rev.setTimeStamp(this.now);
      String _get = this.userIdMap.get(user);
      rev.setUserId(_get);
      btsCorpus.addRevision(rev);
    }
    if (((!Objects.equal(user, null)) && this.userNameMap.containsKey(user))) {
      EList<String> _updaters = btsCorpus.getUpdaters();
      _updaters.add(user);
    }
    return btsCorpus;
  }
  
  public void processContainedObjects(final EObject type, final BTSCorpusObject parent) {
    List<EObject> list = this.getListReferenceFeatureByName(type, "tccaption");
    boolean _notEquals = (!Objects.equal(list, null));
    if (_notEquals) {
      for (final EObject o : list) {
        this.makeTCCaption(o, parent);
      }
    }
    List _listReferenceFeatureByName = this.getListReferenceFeatureByName(type, "tcarrangement");
    list = _listReferenceFeatureByName;
    boolean _notEquals_1 = (!Objects.equal(list, null));
    if (_notEquals_1) {
      for (final EObject o_1 : list) {
        this.makeTCArrangement(o_1, parent);
      }
    }
    List _listReferenceFeatureByName_1 = this.getListReferenceFeatureByName(type, "tcscene");
    list = _listReferenceFeatureByName_1;
    boolean _notEquals_2 = (!Objects.equal(list, null));
    if (_notEquals_2) {
      for (final EObject o_2 : list) {
        this.makeTCScene(o_2, parent);
      }
    }
    List _listReferenceFeatureByName_2 = this.getListReferenceFeatureByName(type, "tcgroup");
    list = _listReferenceFeatureByName_2;
    boolean _notEquals_3 = (!Objects.equal(list, null));
    if (_notEquals_3) {
      for (final EObject o_3 : list) {
        this.makeTCGroup(o_3, parent);
      }
    }
    List _listReferenceFeatureByName_3 = this.getListReferenceFeatureByName(type, "tcobject");
    list = _listReferenceFeatureByName_3;
    boolean _notEquals_4 = (!Objects.equal(list, null));
    if (_notEquals_4) {
      for (final EObject o_4 : list) {
        this.makeTCObject(o_4, parent);
      }
    }
    List _listReferenceFeatureByName_4 = this.getListReferenceFeatureByName(type, "tcobjpart");
    list = _listReferenceFeatureByName_4;
    boolean _notEquals_5 = (!Objects.equal(list, null));
    if (_notEquals_5) {
      for (final EObject o_5 : list) {
        this.makeTCObjectPart(o_5, parent);
      }
    }
    List _listReferenceFeatureByName_5 = this.getListReferenceFeatureByName(type, "tctext");
    list = _listReferenceFeatureByName_5;
    boolean _notEquals_6 = (!Objects.equal(list, null));
    if (_notEquals_6) {
      for (final EObject o_6 : list) {
        this.makeTCText(o_6, parent);
      }
    }
    List _listReferenceFeatureByName_6 = this.getListReferenceFeatureByName(type, "tcsupertext");
    list = _listReferenceFeatureByName_6;
    boolean _notEquals_7 = (!Objects.equal(list, null));
    if (_notEquals_7) {
      for (final EObject o_7 : list) {
        this.makeTCSuperText(o_7, parent);
      }
    }
  }
  
  public void makeTCScene(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("Scene");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make Scene " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCArrangement(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("Arrangement");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make Arrangement " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCCaption(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("Caption");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make Caption " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCGroup(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("Group");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make Group " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCObject(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("TCObject");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make TCObject " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCSuperText(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("TCSuperText");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make TCSuperText " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCObjectPart(final EObject type, final BTSCorpusObject parent) {
    final BTSTCObject tcObject = this.tcObjectService.createNewRelationPartOf(parent);
    tcObject.setType("ObjectPart");
    this.processPassport(type, tcObject, true);
    this.processContainedObjects(type, tcObject);
    this.addToObjects(tcObject);
    String _name = tcObject.getName();
    String _plus = ("make ObjectPart " + _name);
    System.out.println(_plus);
  }
  
  public void makeTCText(final EObject type, final BTSCorpusObject parent) {
    TCTextType textType = ((TCTextType) type);
    final BTSText text = this.textService.createNewRelationPartOf(parent);
    text.setType("Text");
    this.processPassport(textType, text, true);
    this.processContainedObjects(type, text);
    this.addToObjects(text);
    String _name = text.getName();
    boolean _contains = _name.contains("BM EA 1163");
    if (_contains) {
      System.out.println("test");
    }
    BTSTextContent textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent();
    text.setTextContent(textContent);
    final EgyTxtType egyText = textType.getEgyTxt();
    if (((!Objects.equal(egyText, null)) && (!Objects.equal(egyText.getGroup(), null)))) {
      FeatureMap _group = egyText.getGroup();
      for (final FeatureMap.Entry e : _group) {
        Object _value = e.getValue();
        if ((_value instanceof EgyTB1Type)) {
          Object _value_1 = e.getValue();
          EgyTB1Type egyTB = ((EgyTB1Type) _value_1);
          FeatureMap _group_1 = egyText.getGroup();
          for (final FeatureMap.Entry ee : _group_1) {
            Object _value_2 = ee.getValue();
            if ((_value_2 instanceof EgySentType)) {
              Object _value_3 = ee.getValue();
              String _name_1 = egyTB.getName();
              this.makeSentence(text, ((EgySentType) _value_3), textContent, _name_1);
            }
          }
        } else {
          Object _value_4 = e.getValue();
          if ((_value_4 instanceof EgySentType)) {
            Object _value_5 = e.getValue();
            this.makeSentence(text, ((EgySentType) _value_5), textContent, null);
          } else {
            Object _value_6 = e.getValue();
            if ((_value_6 instanceof EgySubTxtType)) {
              Object _value_7 = e.getValue();
              EgySubTxtType egyTB_1 = ((EgySubTxtType) _value_7);
              if ((((this.fileName.contains("saw_medizin") || this.fileName.contains("saw_lit")) || this.fileName.contains("leuven")) || this.fileName.contains("digitalheka"))) {
                BTSSentenceItem egytbfirstWord = null;
                BTSSentenceItem egytblastWord = null;
                FeatureMap _group_2 = egyTB_1.getGroup();
                for (final FeatureMap.Entry ee_1 : _group_2) {
                  Object _value_8 = ee_1.getValue();
                  if ((_value_8 instanceof EgySentType)) {
                    Object _value_9 = ee_1.getValue();
                    this.makeSentence(text, ((EgySentType) _value_9), textContent, null);
                    if ((Objects.equal(egytbfirstWord, null) && (!textContent.getTextItems().isEmpty()))) {
                      EList<BTSTextItems> _textItems = textContent.getTextItems();
                      EList<BTSTextItems> _textItems_1 = textContent.getTextItems();
                      int _size = _textItems_1.size();
                      int _minus = (_size - 1);
                      BTSTextItems sen = _textItems.get(_minus);
                      if ((((!Objects.equal(sen, null)) && (sen instanceof BTSSenctence)) && (!((BTSSenctence) sen).getSentenceItems().isEmpty()))) {
                        EList<BTSSentenceItem> _sentenceItems = ((BTSSenctence) sen).getSentenceItems();
                        BTSSentenceItem _get = _sentenceItems.get(0);
                        egytbfirstWord = _get;
                      }
                    }
                  } else {
                    Object _value_10 = ee_1.getValue();
                    if ((_value_10 instanceof EgySubTxtType)) {
                      Object _value_11 = ee_1.getValue();
                      EgySubTxtType sub_egyTB = ((EgySubTxtType) _value_11);
                      BTSSentenceItem subegytbfirstWord = null;
                      BTSSentenceItem subegytblastWord = null;
                      EList<EgySentType> _egySent = sub_egyTB.getEgySent();
                      for (final EgySentType sent2 : _egySent) {
                        if ((sent2 instanceof EgySentType)) {
                          this.makeSentence(text, sent2, textContent, null);
                          EList<BTSTextItems> _textItems_2 = textContent.getTextItems();
                          int _size_1 = _textItems_2.size();
                          String _plus = ("sentence count " + Integer.valueOf(_size_1));
                          System.out.println(_plus);
                          if ((Objects.equal(egytbfirstWord, null) && (!textContent.getTextItems().isEmpty()))) {
                            EList<BTSTextItems> _textItems_3 = textContent.getTextItems();
                            EList<BTSTextItems> _textItems_4 = textContent.getTextItems();
                            int _size_2 = _textItems_4.size();
                            int _minus_1 = (_size_2 - 1);
                            BTSTextItems sen_1 = _textItems_3.get(_minus_1);
                            if ((((!Objects.equal(sen_1, null)) && (sen_1 instanceof BTSSenctence)) && (!((BTSSenctence) sen_1).getSentenceItems().isEmpty()))) {
                              EList<BTSSentenceItem> _sentenceItems_1 = ((BTSSenctence) sen_1).getSentenceItems();
                              BTSSentenceItem _get_1 = _sentenceItems_1.get(0);
                              egytbfirstWord = _get_1;
                            }
                          }
                          if ((Objects.equal(subegytbfirstWord, null) && (!textContent.getTextItems().isEmpty()))) {
                            EList<BTSTextItems> _textItems_5 = textContent.getTextItems();
                            EList<BTSTextItems> _textItems_6 = textContent.getTextItems();
                            int _size_3 = _textItems_6.size();
                            int _minus_2 = (_size_3 - 1);
                            BTSTextItems sen_2 = _textItems_5.get(_minus_2);
                            if ((((!Objects.equal(sen_2, null)) && (sen_2 instanceof BTSSenctence)) && (!((BTSSenctence) sen_2).getSentenceItems().isEmpty()))) {
                              EList<BTSSentenceItem> _sentenceItems_2 = ((BTSSenctence) sen_2).getSentenceItems();
                              BTSSentenceItem _get_2 = _sentenceItems_2.get(0);
                              subegytbfirstWord = _get_2;
                            }
                          }
                          EList<BTSTextItems> _textItems_7 = textContent.getTextItems();
                          boolean _isEmpty = _textItems_7.isEmpty();
                          boolean _not = (!_isEmpty);
                          if (_not) {
                            EList<BTSTextItems> _textItems_8 = textContent.getTextItems();
                            EList<BTSTextItems> _textItems_9 = textContent.getTextItems();
                            int _size_4 = _textItems_9.size();
                            int _minus_3 = (_size_4 - 1);
                            BTSTextItems sen_3 = _textItems_8.get(_minus_3);
                            if ((((!Objects.equal(sen_3, null)) && (sen_3 instanceof BTSSenctence)) && (!((BTSSenctence) sen_3).getSentenceItems().isEmpty()))) {
                              EList<BTSSentenceItem> _sentenceItems_3 = ((BTSSenctence) sen_3).getSentenceItems();
                              BTSSentenceItem senItem = _sentenceItems_3.get(0);
                              if ((senItem instanceof BTSWord)) {
                              } else {
                                if ((senItem instanceof BTSMarker)) {
                                }
                              }
                            }
                          }
                        }
                      }
                      if ((Objects.equal(subegytblastWord, null) && (!textContent.getTextItems().isEmpty()))) {
                        EList<BTSTextItems> _textItems_10 = textContent.getTextItems();
                        EList<BTSTextItems> _textItems_11 = textContent.getTextItems();
                        int _size_5 = _textItems_11.size();
                        int _minus_4 = (_size_5 - 1);
                        BTSTextItems sen_4 = _textItems_10.get(_minus_4);
                        if ((((!Objects.equal(sen_4, null)) && (sen_4 instanceof BTSSenctence)) && (!((BTSSenctence) sen_4).getSentenceItems().isEmpty()))) {
                          EList<BTSSentenceItem> _sentenceItems_4 = ((BTSSenctence) sen_4).getSentenceItems();
                          EList<BTSSentenceItem> _sentenceItems_5 = ((BTSSenctence) sen_4).getSentenceItems();
                          int _size_6 = _sentenceItems_5.size();
                          int _minus_5 = (_size_6 - 1);
                          BTSSentenceItem _get_3 = _sentenceItems_4.get(_minus_5);
                          subegytblastWord = _get_3;
                        }
                      }
                      boolean _notEquals = (!Objects.equal(subegytbfirstWord, null));
                      if (_notEquals) {
                        String _name_2 = sub_egyTB.getName();
                        this.makeAnnotation(text, subegytbfirstWord, subegytblastWord, "subtext", _name_2);
                      }
                    }
                  }
                }
                if ((Objects.equal(egytblastWord, null) && (!textContent.getTextItems().isEmpty()))) {
                  EList<BTSTextItems> _textItems_12 = textContent.getTextItems();
                  EList<BTSTextItems> _textItems_13 = textContent.getTextItems();
                  int _size_7 = _textItems_13.size();
                  int _minus_6 = (_size_7 - 1);
                  BTSTextItems sen_5 = _textItems_12.get(_minus_6);
                  if ((((!Objects.equal(sen_5, null)) && (sen_5 instanceof BTSSenctence)) && (!((BTSSenctence) sen_5).getSentenceItems().isEmpty()))) {
                    EList<BTSSentenceItem> _sentenceItems_6 = ((BTSSenctence) sen_5).getSentenceItems();
                    EList<BTSSentenceItem> _sentenceItems_7 = ((BTSSenctence) sen_5).getSentenceItems();
                    int _size_8 = _sentenceItems_7.size();
                    int _minus_7 = (_size_8 - 1);
                    BTSSentenceItem _get_4 = _sentenceItems_6.get(_minus_7);
                    egytblastWord = _get_4;
                  }
                }
                boolean _notEquals_1 = (!Objects.equal(egytbfirstWord, null));
                if (_notEquals_1) {
                  String _name_3 = egyTB_1.getName();
                  this.makeAnnotation(text, egytbfirstWord, egytblastWord, "subtext", _name_3);
                }
              } else {
                this.makeSubText(text, textContent, egyTB_1, textType);
              }
            }
          }
        }
      }
    }
    String _name_4 = text.getName();
    String _plus_1 = ("make Text " + _name_4);
    System.out.println(_plus_1);
  }
  
  public void makeSubText(final BTSText superText, final BTSTextContent content, final EgySubTxtType subtextType, final EObject supertextType) {
    final BTSText subtext = this.textService.createNewRelationPartOf(superText);
    subtext.setType("subtext");
    this.processPassport(subtextType, subtext, false);
    this.processAuthorSubtext(subtextType, subtext, superText);
    this.processUpdaterSupText(subtextType, supertextType, subtext, superText);
    this.processContainedObjects(subtextType, subtext);
    this.addToObjects(subtext);
    if (((!Objects.equal(subtextType.getSortKey(), null)) && (!Objects.equal(subtextType.getSortKey(), Integer.valueOf(0))))) {
      try {
        String _sortKey = subtextType.getSortKey();
        Integer _integer = new Integer(_sortKey);
        subtext.setSortKey((_integer).intValue());
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    BTSTextContent textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent();
    subtext.setTextContent(textContent);
    FeatureMap _group = subtextType.getGroup();
    for (final FeatureMap.Entry e_1 : _group) {
      Object _value = e_1.getValue();
      if ((_value instanceof EgyTB1Type)) {
        Object _value_1 = e_1.getValue();
        EgyTB1Type egyTB = ((EgyTB1Type) _value_1);
        EList<EgySentType> _egySent = egyTB.getEgySent();
        for (final EgySentType sentence : _egySent) {
          String _name = egyTB.getName();
          this.makeSentence(subtext, sentence, textContent, _name);
        }
      } else {
        Object _value_2 = e_1.getValue();
        if ((_value_2 instanceof EgySentType)) {
          Object _value_3 = e_1.getValue();
          this.makeSentence(subtext, ((EgySentType) _value_3), textContent, null);
        } else {
          Object _value_4 = e_1.getValue();
          if ((_value_4 instanceof EgySubTxtType)) {
            Object _value_5 = e_1.getValue();
            EgySubTxtType egyTB_1 = ((EgySubTxtType) _value_5);
            this.makeSubText(subtext, textContent, egyTB_1, subtextType);
          }
        }
      }
    }
    String _name_1 = subtext.getName();
    String _plus = ("make Text " + _name_1);
    System.out.println(_plus);
  }
  
  public void makeSentence(final BTSCorpusObject text, final EgySentType type, final BTSTextContent textContent, final String annotationType) {
    final BTSSenctence btsSentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
    BTSTranslations _createBTSTranslations = BtsmodelFactory.eINSTANCE.createBTSTranslations();
    btsSentence.setTranslation(_createBTSTranslations);
    BTSTranslations _translation = btsSentence.getTranslation();
    String _translat = type.getTranslat();
    String _determineTranslationLanguage = this.determineTranslationLanguage(type, text);
    _translation.setTranslation(_translat, _determineTranslationLanguage);
    BTSIdentifiableItem firstItem = null;
    BTSIdentifiableItem lastItem = null;
    FeatureMap _group = type.getGroup();
    for (final FeatureMap.Entry e : _group) {
      Object _value = e.getValue();
      if ((_value instanceof EgyTB1Type)) {
        Object _value_1 = e.getValue();
        EgyTB1Type egyTB = ((EgyTB1Type) _value_1);
        BTSIdentifiableItem egytbfirstWord = null;
        BTSIdentifiableItem egytblastWord = null;
        FeatureMap _group_1 = egyTB.getGroup();
        for (final FeatureMap.Entry ee : _group_1) {
          Object _value_2 = ee.getValue();
          if ((_value_2 instanceof EgyWordType)) {
            Object _value_3 = ee.getValue();
            BTSIdentifiableItem w = this.makeWord(text, ((EgyWordType) _value_3), btsSentence);
            boolean _equals = Objects.equal(firstItem, null);
            if (_equals) {
              firstItem = w;
            }
            boolean _equals_1 = Objects.equal(egytbfirstWord, null);
            if (_equals_1) {
              egytbfirstWord = w;
            }
            egytblastWord = w;
            lastItem = w;
          } else {
            Object _value_4 = ee.getValue();
            if ((_value_4 instanceof EgyPunctuationType)) {
              Object _value_5 = ee.getValue();
              BTSMarker _makePunctuation = this.makePunctuation(((EgyPunctuationType) _value_5), btsSentence);
              lastItem = _makePunctuation;
              boolean _equals_2 = Objects.equal(firstItem, null);
              if (_equals_2) {
                firstItem = lastItem;
              }
            } else {
              Object _value_6 = ee.getValue();
              if ((_value_6 instanceof LineCountType)) {
                Object _value_7 = ee.getValue();
                LineCountType lc = ((LineCountType) _value_7);
                EList<String> _value_8 = lc.getValue();
                boolean _notEquals = (!Objects.equal(_value_8, null));
                if (_notEquals) {
                  EList<String> _value_9 = lc.getValue();
                  for (final String lcv : _value_9) {
                    {
                      BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
                      marker.setType(("lc: " + lcv));
                      EList<BTSSentenceItem> _sentenceItems = btsSentence.getSentenceItems();
                      _sentenceItems.add(marker);
                      boolean _equals_3 = Objects.equal(firstItem, null);
                      if (_equals_3) {
                        firstItem = marker;
                      }
                      lastItem = marker;
                    }
                  }
                }
              } else {
                Object _value_10 = ee.getValue();
                if ((_value_10 instanceof NoteType)) {
                  Object _value_11 = ee.getValue();
                  NoteType lc_1 = ((NoteType) _value_11);
                  String _value_12 = lc_1.getValue();
                  boolean _notEquals_1 = (!Objects.equal(_value_12, null));
                  if (_notEquals_1) {
                    BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
                    String _value_13 = lc_1.getValue();
                    String _plus = ("para: " + _value_13);
                    marker.setType(_plus);
                    EList<BTSSentenceItem> _sentenceItems = btsSentence.getSentenceItems();
                    _sentenceItems.add(marker);
                    boolean _equals_3 = Objects.equal(firstItem, null);
                    if (_equals_3) {
                      firstItem = marker;
                    }
                    lastItem = marker;
                  }
                }
              }
            }
          }
        }
        boolean _notEquals_2 = (!Objects.equal(egytbfirstWord, null));
        if (_notEquals_2) {
          String _name = egyTB.getName();
          this.makeAnnotation(text, egytbfirstWord, egytblastWord, "subtext", _name);
        }
      } else {
        Object _value_14 = e.getValue();
        if ((_value_14 instanceof LineCountType)) {
          Object _value_15 = e.getValue();
          LineCountType lc_2 = ((LineCountType) _value_15);
          EList<String> _value_16 = lc_2.getValue();
          boolean _notEquals_3 = (!Objects.equal(_value_16, null));
          if (_notEquals_3) {
            EList<String> _value_17 = lc_2.getValue();
            for (final String lcv_1 : _value_17) {
              {
                BTSMarker marker_1 = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
                marker_1.setType(("lc: " + lcv_1));
                EList<BTSSentenceItem> _sentenceItems_1 = btsSentence.getSentenceItems();
                _sentenceItems_1.add(marker_1);
                boolean _equals_4 = Objects.equal(firstItem, null);
                if (_equals_4) {
                  firstItem = marker_1;
                }
                lastItem = marker_1;
              }
            }
          }
        } else {
          Object _value_18 = e.getValue();
          if ((_value_18 instanceof NoteType)) {
            Object _value_19 = e.getValue();
            NoteType lc_3 = ((NoteType) _value_19);
            String _value_20 = lc_3.getValue();
            boolean _notEquals_4 = (!Objects.equal(_value_20, null));
            if (_notEquals_4) {
              BTSMarker marker_1 = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
              String _value_21 = lc_3.getValue();
              String _plus_1 = ("para: " + _value_21);
              marker_1.setType(_plus_1);
              EList<BTSSentenceItem> _sentenceItems_1 = btsSentence.getSentenceItems();
              _sentenceItems_1.add(marker_1);
              boolean _equals_4 = Objects.equal(firstItem, null);
              if (_equals_4) {
                firstItem = marker_1;
              }
              lastItem = marker_1;
            }
          } else {
            Object _value_22 = e.getValue();
            if ((_value_22 instanceof EgyWordType)) {
              Object _value_23 = e.getValue();
              EgyWordType word = ((EgyWordType) _value_23);
              BTSIdentifiableItem w_1 = this.makeWord(text, word, btsSentence);
              boolean _equals_5 = Objects.equal(firstItem, null);
              if (_equals_5) {
                firstItem = w_1;
              }
              lastItem = w_1;
            } else {
              Object _value_24 = e.getValue();
              if ((_value_24 instanceof EgyPunctuationType)) {
                Object _value_25 = e.getValue();
                BTSMarker _makePunctuation_1 = this.makePunctuation(((EgyPunctuationType) _value_25), btsSentence);
                lastItem = _makePunctuation_1;
                boolean _equals_6 = Objects.equal(firstItem, null);
                if (_equals_6) {
                  firstItem = lastItem;
                }
              } else {
                Object _value_26 = e.getValue();
                if ((_value_26 instanceof EgySentType)) {
                  Object _value_27 = e.getValue();
                  EgySentType subsent = ((EgySentType) _value_27);
                  BTSIdentifiableItem egytbfirstWord_1 = null;
                  BTSIdentifiableItem egytblastWord_1 = null;
                  EList<EgyWordType> _egyWord = subsent.getEgyWord();
                  for (final EgyWordType word_1 : _egyWord) {
                    {
                      BTSIdentifiableItem w_2 = this.makeWord(text, word_1, btsSentence);
                      boolean _equals_7 = Objects.equal(firstItem, null);
                      if (_equals_7) {
                        firstItem = w_2;
                      }
                      boolean _equals_8 = Objects.equal(egytbfirstWord_1, null);
                      if (_equals_8) {
                        egytbfirstWord_1 = w_2;
                      }
                      egytblastWord_1 = w_2;
                      lastItem = w_2;
                    }
                  }
                  boolean _notEquals_5 = (!Objects.equal(egytbfirstWord_1, null));
                  if (_notEquals_5) {
                    String annoType = "";
                    if (((!Objects.equal(subsent.getType(), null)) && Objects.equal(Integer.valueOf(subsent.getType().getValue()), TypeType5.HS))) {
                      annoType = "main_clause";
                    } else {
                      if (((!Objects.equal(subsent.getType(), null)) && Objects.equal(Integer.valueOf(subsent.getType().getValue()), TypeType5.NS))) {
                        annoType = "subordinate_clause";
                      } else {
                        annoType = "unknown";
                      }
                    }
                    this.makeAnnotation(text, egytbfirstWord_1, egytblastWord_1, annoType, null);
                  }
                }
              }
            }
          }
        }
      }
    }
    if (((!Objects.equal(type.getComment(), null)) && (!"".equals(type.getComment())))) {
      String _comment = type.getComment();
      this.makeComment(text, firstItem, lastItem, _comment);
    }
    if (((!Objects.equal(annotationType, null)) && (!"".equals(annotationType)))) {
      this.makeAnnotation(text, firstItem, lastItem, annotationType, null);
    }
    EList<BTSTextItems> _textItems = textContent.getTextItems();
    _textItems.add(btsSentence);
    this.processAuthor(type, btsSentence);
    TypeType5 _type = type.getType();
    boolean _notEquals_6 = (!Objects.equal(_type, null));
    if (_notEquals_6) {
      TypeType5 _type_1 = type.getType();
      String _string = _type_1.toString();
      btsSentence.setType(_string);
    }
  }
  
  public BTSMarker makePunctuation(final EgyPunctuationType type, final BTSSenctence btsSentence) {
    BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
    String typeString = type.getValue();
    boolean _equals = Objects.equal(typeString, Corpus2BTSTransform.VERS_FRONTER_MARKER_SIGN);
    if (_equals) {
      marker.setType(BTSConstants.TEXT_VERS_FRONTIER_MARKER);
    } else {
      boolean _equals_1 = Objects.equal(typeString, Corpus2BTSTransform.VERS_BREAK_MARKER_SIGN);
      if (_equals_1) {
        marker.setType(BTSConstants.TEXT_VERS_BREAK_MARKER);
      } else {
        boolean _equals_2 = Objects.equal(typeString, Corpus2BTSTransform.BROKEN_VERS_MARKER_SIGN);
        if (_equals_2) {
          marker.setType(BTSConstants.BROKEN_VERS_MARKER);
        } else {
          boolean _equals_3 = Objects.equal(typeString, Corpus2BTSTransform.DESTROYED_VERS_MARKER_SIGN);
          if (_equals_3) {
            marker.setType(BTSConstants.DESTROYED_VERS_MARKER);
          } else {
            boolean _equals_4 = Objects.equal(typeString, Corpus2BTSTransform.DELETED_VERS_MARKER_SIGN);
            if (_equals_4) {
              marker.setType(BTSConstants.DELETED_VERS_MARKER);
            } else {
              boolean _equals_5 = Objects.equal(typeString, Corpus2BTSTransform.DISPUTALBE_VERS_MARKER_SIGN);
              if (_equals_5) {
                marker.setType(BTSConstants.DISPUTABLEVERSMARKER);
              } else {
                boolean _equals_6 = Objects.equal(typeString, Corpus2BTSTransform.MISSING_VERS_MARKER_SIGN);
                if (_equals_6) {
                  marker.setType(BTSConstants.MISSING_VERS_MARKER);
                } else {
                  boolean _equals_7 = Objects.equal(typeString, Corpus2BTSTransform.DESTROYEDVERSMARKER_SIGN);
                  if (_equals_7) {
                    marker.setType(BTSConstants.DESTROYEDVERSMARKER);
                  } else {
                    boolean _equals_8 = Objects.equal(typeString, Corpus2BTSTransform.DELETEDVERSMARKER_SIGN);
                    if (_equals_8) {
                      marker.setType(BTSConstants.DELETEDVERSMARKER);
                    } else {
                      boolean _equals_9 = Objects.equal(typeString, Corpus2BTSTransform.DISPUTABLEVERSMARKER_SIGN);
                      if (_equals_9) {
                        marker.setType(BTSConstants.DISPUTABLEVERSMARKER);
                      } else {
                        boolean _equals_10 = Objects.equal(typeString, Corpus2BTSTransform.RESTORATIONOVERRASURMARKER_SIGN);
                        if (_equals_10) {
                          marker.setType(BTSConstants.RESTORATIONOVERRASURMARKER);
                        } else {
                          boolean _equals_11 = Objects.equal(typeString, Corpus2BTSTransform.ANCIENTEXPANDEDMARKER_SIGN);
                          if (_equals_11) {
                            marker.setType(BTSConstants.ANCIENTEXPANDEDMARKER);
                          } else {
                            boolean _equals_12 = Objects.equal(typeString, Corpus2BTSTransform.RASURMARKER_SIGN);
                            if (_equals_12) {
                              marker.setType(BTSConstants.RASURMARKER);
                            } else {
                              boolean _equals_13 = Objects.equal(typeString, Corpus2BTSTransform.EMENDATIONVERSMARKER_SIGN);
                              if (_equals_13) {
                                marker.setType(BTSConstants.EMENDATIONVERSMARKER);
                              } else {
                                boolean _equals_14 = Objects.equal(typeString, Corpus2BTSTransform.DESTROYEDVERSFRONTIERMARKER_SIGN);
                                if (_equals_14) {
                                  marker.setType(BTSConstants.DESTROYEDVERSFRONTIERMARKER);
                                } else {
                                  boolean _equals_15 = Objects.equal(typeString, Corpus2BTSTransform.PARTIALDESTROYEDVERSMARKER_SIGN);
                                  if (_equals_15) {
                                    marker.setType(BTSConstants.PARTIALDESTROYEDVERSMARKER);
                                  } else {
                                    boolean _equals_16 = Objects.equal(typeString, Corpus2BTSTransform.PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN);
                                    if (_equals_16) {
                                      marker.setType(BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER);
                                    } else {
                                      boolean _equals_17 = Objects.equal(typeString, Corpus2BTSTransform.DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN);
                                      if (_equals_17) {
                                        marker.setType(BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER);
                                      } else {
                                        boolean _equals_18 = Objects.equal(typeString, Corpus2BTSTransform.DISPUTABLEDESTROYEDVERSMARKER_SIGN);
                                        if (_equals_18) {
                                          marker.setType(BTSConstants.DISPUTABLEDESTROYEDVERSMARKER);
                                        } else {
                                          boolean _equals_19 = Objects.equal(typeString, Corpus2BTSTransform.DELETEDDISPUTABLEVERSMARKER_SIGN);
                                          if (_equals_19) {
                                            marker.setType(BTSConstants.DELETEDDISPUTABLEVERSMARKER);
                                          } else {
                                            boolean _equals_20 = Objects.equal(typeString, Corpus2BTSTransform.MISSINGDISPUTABLEVERSMARKER_SIGN);
                                            if (_equals_20) {
                                              marker.setType(BTSConstants.MISSINGDISPUTABLEVERSMARKER);
                                            } else {
                                              boolean _equals_21 = Objects.equal(typeString, Corpus2BTSTransform.DISPUTABLEDELETEDVERSMARKER_SIGN);
                                              if (_equals_21) {
                                                marker.setType(BTSConstants.DISPUTABLEDELETEDVERSMARKER);
                                              } else {
                                                boolean _equals_22 = Objects.equal(typeString, Corpus2BTSTransform.PARTIALDESTROYEDDELETEDVERSMARKER_SIGN);
                                                if (_equals_22) {
                                                  marker.setType(BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER);
                                                } else {
                                                  boolean _equals_23 = Objects.equal(typeString, Corpus2BTSTransform.DESTROYEDDELETEDVERSMARKER_SIGN);
                                                  if (_equals_23) {
                                                    marker.setType(BTSConstants.DESTROYEDDELETEDVERSMARKER);
                                                  } else {
                                                    boolean _equals_24 = Objects.equal(typeString, Corpus2BTSTransform.DELETEDDESTROYEDVERSMARKER_SIGN);
                                                    if (_equals_24) {
                                                      marker.setType(BTSConstants.DELETEDDESTROYEDVERSMARKER);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    EList<BTSSentenceItem> _sentenceItems = btsSentence.getSentenceItems();
    _sentenceItems.add(marker);
    return marker;
  }
  
  public String determineTranslationLanguage(final EgySentType type, final BTSCorpusObject object) {
    Object o = type.getAuthor();
    int author = Integer.parseInt(((String) o));
    switch (author) {
      case 26:
        return "en";
      case 52:
        return "fr";
      case 60:
        return "en";
      case 59:
        return "en";
      case 64:
        return "fr";
      case 65:
        return "fr";
    }
    return "de";
  }
  
  public void makeComment(final BTSCorpusObject object, final BTSIdentifiableItem item, final BTSIdentifiableItem item2, final String commentString) {
    final BTSComment comment = BtsmodelFactory.eINSTANCE.createBTSComment();
    comment.setRevisionState("published");
    comment.setVisibility("public");
    comment.setComment(commentString);
    comment.setDBCollectionKey((this.projectPrefix + "_admin"));
    final BTSRelation relation = BtsmodelFactory.eINSTANCE.createBTSRelation();
    String __id = object.get_id();
    relation.setObjectId(__id);
    relation.setType("partOf");
    EList<BTSRelation> _relations = comment.getRelations();
    _relations.add(relation);
    if (((!Objects.equal(item, null)) && (!Objects.equal(item2, null)))) {
      final BTSInterTextReference ref1 = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
      String __id_1 = item.get_id();
      ref1.setBeginId(__id_1);
      String __id_2 = item2.get_id();
      ref1.setEndId(__id_2);
      EList<BTSInterTextReference> _parts = relation.getParts();
      _parts.add(ref1);
    }
    this.addToComments(comment);
    BTSRevision revParent = object.getLastRevision();
    boolean _notEquals = (!Objects.equal(revParent, null));
    if (_notEquals) {
      BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
      rev.setRef(0);
      rev.setTimeStamp(this.now);
      String _userId = revParent.getUserId();
      rev.setUserId(_userId);
      comment.addRevision(rev);
    }
    EList<String> _updaters = object.getUpdaters();
    for (final String u : _updaters) {
      EList<String> _updaters_1 = comment.getUpdaters();
      _updaters_1.add(u);
    }
  }
  
  public void addToComments(final BTSComment comment) {
    this.comments.add(comment);
    comment.setDBCollectionKey("admin");
  }
  
  public String normalizeWS(final String string) {
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return null;
    }
    String txt = string.replaceAll("\\n+", " ");
    String _replaceAll = txt.replaceAll("\\s+", " ");
    String _trim = _replaceAll.trim();
    txt = _trim;
    return txt;
  }
  
  public void makeAnnotation(final BTSCorpusObject object, final BTSIdentifiableItem word, final BTSIdentifiableItem word2, final String type, final String name) {
    final BTSAnnotation anno = BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation();
    if ((((!Objects.equal(type, null)) && type.equals("Rubrum")) || ((!Objects.equal(name, null)) && name.equals("Rubrum")))) {
      anno.setType("rubrum");
    } else {
      boolean _notEquals = (!Objects.equal(name, null));
      if (_notEquals) {
        anno.setName(name);
      }
    }
    anno.setRevisionState("published");
    anno.setVisibility("public");
    final BTSRelation relation = BtsmodelFactory.eINSTANCE.createBTSRelation();
    String __id = object.get_id();
    relation.setObjectId(__id);
    relation.setType("partOf");
    EList<BTSRelation> _relations = anno.getRelations();
    _relations.add(relation);
    if (((!Objects.equal(word, null)) && (!Objects.equal(word2, null)))) {
      final BTSInterTextReference ref1 = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
      String __id_1 = word.get_id();
      ref1.setBeginId(__id_1);
      String __id_2 = word2.get_id();
      ref1.setEndId(__id_2);
      EList<BTSInterTextReference> _parts = relation.getParts();
      _parts.add(ref1);
    }
    this.addToObjects(anno);
    BTSRevision revParent = object.getLastRevision();
    boolean _notEquals_1 = (!Objects.equal(revParent, null));
    if (_notEquals_1) {
      BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
      rev.setRef(0);
      rev.setTimeStamp(this.now);
      String _userId = revParent.getUserId();
      rev.setUserId(_userId);
      anno.addRevision(rev);
    }
    EList<String> _updaters = object.getUpdaters();
    for (final String u : _updaters) {
      EList<String> _updaters_1 = anno.getUpdaters();
      _updaters_1.add(u);
    }
  }
  
  public BTSIdentifiableItem makeWord(final BTSCorpusObject object, final EgyWordType word, final BTSSenctence sentence) {
    String wchar = null;
    if ((((!Objects.equal(word.getForm(), null)) && Objects.equal(word.getForm(), "-NN-")) || (word.getForm().startsWith("--") && word.getForm().endsWith("--")))) {
      BTSMarker marker = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
      marker.setType(BTSConstants.DESTRUCTION_MARKER);
      String _form = word.getForm();
      boolean _equals = Objects.equal(_form, "-NN-");
      if (_equals) {
        marker.setName("--NN--");
      } else {
        String _form_1 = word.getForm();
        String _replaceEntities = this.replaceEntities(_form_1);
        String _replaceI = this.replaceI(_replaceEntities);
        String _normalizeDestruction = this.normalizeDestruction(_replaceI);
        String s = this.getReplaceEmptyBrackets(_normalizeDestruction);
        boolean _startsWith = s.startsWith("--");
        if (_startsWith) {
          String _substring = s.substring(2);
          s = _substring;
        }
        boolean _endsWith = s.endsWith("--");
        if (_endsWith) {
          int _length = s.length();
          int _minus = (_length - 2);
          String _substring_1 = s.substring(0, _minus);
          s = _substring_1;
        }
        int _length_1 = s.length();
        boolean _equals_1 = (_length_1 == 0);
        if (_equals_1) {
          marker.setName("--NN--");
        } else {
          marker.setName(s);
        }
      }
      EList<BTSSentenceItem> _sentenceItems = sentence.getSentenceItems();
      _sentenceItems.add(marker);
      return marker;
    } else {
      String _form_2 = word.getForm();
      String _trim = _form_2.trim();
      wchar = _trim;
    }
    final BTSWord btsWord = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
    String _replaceEntities_1 = this.replaceEntities(wchar);
    String _replaceI_1 = this.replaceI(_replaceEntities_1);
    String _normalizeDestruction_1 = this.normalizeDestruction(_replaceI_1);
    String _replaceEmptyBrackets = this.getReplaceEmptyBrackets(_normalizeDestruction_1);
    wchar = _replaceEmptyBrackets;
    String _name = object.getName();
    boolean _startsWith_1 = _name.startsWith("CT");
    if (_startsWith_1) {
      String _doCTspecialReplacements = this.doCTspecialReplacements(wchar);
      wchar = _doCTspecialReplacements;
    }
    btsWord.setWChar(wchar);
    String _lKey = word.getLKey();
    boolean _notEquals = (!Objects.equal(_lKey, "0"));
    if (_notEquals) {
      if (this.demotic) {
        String _lKey_1 = word.getLKey();
        boolean _startsWith_2 = _lKey_1.startsWith("-");
        if (_startsWith_2) {
          String _lKey_2 = word.getLKey();
          String _replaceFirst = _lKey_2.replaceFirst("-", "m");
          String _plus = ("d" + _replaceFirst);
          btsWord.setLKey(_plus);
        } else {
          String _lKey_3 = word.getLKey();
          String _plus_1 = ("d" + _lKey_3);
          btsWord.setLKey(_plus_1);
        }
      } else {
        String _lKey_4 = word.getLKey();
        btsWord.setLKey(_lKey_4);
      }
    }
    BTSTranslations _createBTSTranslations = BtsmodelFactory.eINSTANCE.createBTSTranslations();
    btsWord.setTranslation(_createBTSTranslations);
    String _fKey = word.getFKey();
    btsWord.setFlexCode(_fKey);
    if (((!Objects.equal(word.getTranslat(), null)) && (word.getTranslat().trim().length() > 0))) {
      BTSTranslations _translation = btsWord.getTranslation();
      String _translat = word.getTranslat();
      String _trim_1 = _translat.trim();
      String _replaceEntities_2 = this.replaceEntities(_trim_1);
      String _normalizeWS = this.normalizeWS(_replaceEntities_2);
      _translation.setTranslation(_normalizeWS, "de");
    }
    if (((!Objects.equal(word.getGraphics(), null)) && (word.getGraphics().trim().length() > 0))) {
      boolean first = true;
      String _graphics = word.getGraphics();
      String[] _split = _graphics.split("\\s");
      for (final String s_1 : _split) {
        {
          String string = s_1;
          if (((s_1.length() > 1) && StringUtils.isAlpha(s_1.substring(1, 2)))) {
            String _substring_2 = s_1.substring(0, 1);
            String _substring_3 = s_1.substring(1, 2);
            String _lowerCase = StringUtils.lowerCase(_substring_3);
            String _plus_2 = (_substring_2 + _lowerCase);
            String _substring_4 = string.substring(2);
            String _plus_3 = (_plus_2 + _substring_4);
            string = _plus_3;
          }
          String _name_1 = object.getName();
          boolean _contains = _name_1.contains("Prozessakten");
          if (_contains) {
            System.out.println(string);
          }
          String _replaceSigns = this.replaceSigns(string);
          string = _replaceSigns;
          BTSGraphic g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
          if (first) {
            g.setCode(string);
            first = false;
          } else {
            g.setCode(("-" + string));
          }
          EList<BTSGraphic> _graphics_1 = btsWord.getGraphics();
          _graphics_1.add(g);
        }
      }
    }
    EList<BTSSentenceItem> _sentenceItems_1 = sentence.getSentenceItems();
    _sentenceItems_1.add(btsWord);
    if (((!Objects.equal(word.getComment(), null)) && (!"".equals(word.getComment())))) {
      String _comment = word.getComment();
      this.makeComment(object, btsWord, btsWord, _comment);
    }
    return btsWord;
  }
  
  public String getReplaceEmptyBrackets(final String string) {
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return null;
    }
    String result = string.replaceAll("\\[\\s*\\]", "");
    String _replaceAll = result.replaceAll("〈 〉", "");
    result = _replaceAll;
    String _replaceAll_1 = result.replaceAll(" ", "_");
    result = _replaceAll_1;
    String _replaceAll_2 = result.replaceAll("#", "");
    result = _replaceAll_2;
    String _replaceAll_3 = result.replaceAll("⸢⸣", "");
    result = _replaceAll_3;
    String _replaceAll_4 = result.replaceAll("〈〉", "");
    result = _replaceAll_4;
    String _replaceAll_5 = result.replaceAll("\\{\\}", "");
    result = _replaceAll_5;
    String _replaceAll_6 = result.replaceAll("\\(\\)", "");
    result = _replaceAll_6;
    return result;
  }
  
  public String doCTspecialReplacements(final String string) {
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return null;
    }
    String result = string;
    String _replaceAll = result.replaceAll("\\[\\.\\.\\. x Q\\. \\.\\.\\.\\]", "--x Q.--");
    result = _replaceAll;
    String _replaceAll_1 = result.replaceAll("\\[__x_Q\\.__\\]", "--x Q.--");
    result = _replaceAll_1;
    boolean _contains = result.contains("&verse;|#Q|&verse;");
    if (_contains) {
      String _replaceAll_2 = result.replaceAll("&verse;\\|#Q\\|&verse;", "_");
      result = _replaceAll_2;
    }
    boolean _contains_1 = result.contains("&verse;|#R|&verse;");
    if (_contains_1) {
      String _replaceAll_3 = result.replaceAll("&verse;\\|#R\\|&verse;", "_");
      result = _replaceAll_3;
    }
    boolean _contains_2 = result.contains("&verse;|#&dUs;|&verse;");
    if (_contains_2) {
      String _replaceAll_4 = result.replaceAll("&verse;\\|#&dUs;\\|&verse;", "_");
      result = _replaceAll_4;
    }
    boolean _contains_3 = result.contains("&verse;|#P|&verse;");
    if (_contains_3) {
      String _replaceAll_5 = result.replaceAll("&verse;\\|#P\\|&verse;", "_");
      result = _replaceAll_5;
    }
    boolean _contains_4 = result.contains("&verse;|#I|&verse;");
    if (_contains_4) {
      String _replaceAll_6 = result.replaceAll("&verse;\\|#I\\|&verse;", "_");
      result = _replaceAll_6;
    }
    boolean _contains_5 = result.contains("&verse;|#E|&verse;");
    if (_contains_5) {
      String _replaceAll_7 = result.replaceAll("&verse;\\|#E\\|&verse;", "_");
      result = _replaceAll_7;
    }
    boolean _contains_6 = result.contains("$|");
    if (_contains_6) {
      String _replaceAll_8 = result.replaceAll("\\$\\|", "〈");
      result = _replaceAll_8;
    }
    boolean _contains_7 = result.contains("|$");
    if (_contains_7) {
      String _replaceAll_9 = result.replaceAll("\\|\\$", "〉");
      result = _replaceAll_9;
    }
    String _replaceAll_10 = result.replaceAll("\\{\\+", "{");
    result = _replaceAll_10;
    String _replaceAll_11 = result.replaceAll("\\+\\}", "}");
    result = _replaceAll_11;
    String _replaceAll_12 = result.replaceAll("\\[\\|", "⸢");
    result = _replaceAll_12;
    String _replaceAll_13 = result.replaceAll("\\|\\]", "⸣");
    result = _replaceAll_13;
    String _replaceAll_14 = result.replaceAll("\\{\\|", "{{");
    result = _replaceAll_14;
    String _replaceAll_15 = result.replaceAll("\\|\\}", "}}");
    result = _replaceAll_15;
    String _replaceAll_16 = result.replaceAll(">\\|", "((");
    result = _replaceAll_16;
    String _replaceAll_17 = result.replaceAll("\\|<", "))");
    result = _replaceAll_17;
    String _replaceAll_18 = result.replaceAll("\\?\\|", "⸮");
    result = _replaceAll_18;
    String _replaceAll_19 = result.replaceAll("\\|\\?", "?");
    result = _replaceAll_19;
    String _replaceAll_20 = result.replaceAll("&\\|", "〈〈");
    result = _replaceAll_20;
    String _replaceAll_21 = result.replaceAll("\\|&", "〉〉");
    result = _replaceAll_21;
    String _replaceAll_22 = result.replaceAll("#\\|", "");
    result = _replaceAll_22;
    String _replaceAll_23 = result.replaceAll("\\|#", "");
    result = _replaceAll_23;
    String _replaceAll_24 = result.replaceAll("%\\|", "");
    result = _replaceAll_24;
    String _replaceAll_25 = result.replaceAll("\\|%", "");
    result = _replaceAll_25;
    String _replaceAll_26 = result.replaceAll("!\\|", "");
    result = _replaceAll_26;
    String _replaceAll_27 = result.replaceAll("\\|!", "");
    result = _replaceAll_27;
    String _replaceAll_28 = result.replaceAll("\\{,\\|", "--");
    result = _replaceAll_28;
    String _replaceAll_29 = result.replaceAll("\\|,\\}", "--");
    result = _replaceAll_29;
    String _replaceAll_30 = result.replaceAll(",\\|", "--");
    result = _replaceAll_30;
    String _replaceAll_31 = result.replaceAll("\\|,", "--");
    result = _replaceAll_31;
    String _replaceAll_32 = result.replaceAll("\\.\\.\\.", "_");
    result = _replaceAll_32;
    String _replaceAll_33 = result.replaceAll("\\|", "");
    result = _replaceAll_33;
    String _replaceAll_34 = result.replaceAll("\\[\\.\\.\\. x Q\\. \\.\\.\\.\\]", "--x Q.--");
    result = _replaceAll_34;
    String _replaceAll_35 = result.replaceAll("\\[__x_Q\\.__\\]", "--x Q.--");
    result = _replaceAll_35;
    String _replaceAll_36 = result.replaceAll("\\[__1_q\\.__\\]", "--1 Q.--");
    result = _replaceAll_36;
    String _replaceAll_37 = result.replaceAll("\\[__2_q\\.__\\]", "--2 Q.--");
    result = _replaceAll_37;
    String _replaceAll_38 = result.replaceAll("\\[__1/2_q\\.__\\]", "--1/2 Q.--");
    result = _replaceAll_38;
    String _replaceAll_39 = result.replaceAll("\\[__3_q\\.__\\]", "--3 Q.--");
    result = _replaceAll_39;
    String _replaceAll_40 = result.replaceAll("\\[__1_1/2_q\\.__\\]", "--1 1/2 Q.--");
    result = _replaceAll_40;
    return result;
  }
  
  public String normalizeDestruction(final String string) {
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return null;
    }
    String result = string;
    boolean _contains = string.contains("---");
    if (_contains) {
      String _replaceAll = string.replaceAll("---", "--");
      result = _replaceAll;
    }
    boolean _contains_1 = result.contains("--");
    if (_contains_1) {
      Matcher m = this.MinusPattern.matcher(result);
      boolean _find = m.find();
      if (_find) {
        String _replaceAll_1 = m.replaceAll("$1_$3");
        result = _replaceAll_1;
      }
    }
    String _replaceAll_2 = string.replaceAll("\\(\\?\\)", "(_)");
    result = _replaceAll_2;
    return result;
  }
  
  public String replaceI(final String string) {
    if (((!Objects.equal(string, null)) && (string.contains("rdi") || string.contains("jri")))) {
      String replace = string.replaceAll("i", "i̯");
      String _replaceAll = replace.replaceAll("̯̯", "̯");
      replace = _replaceAll;
      return replace;
    }
    return string;
  }
  
  public String replaceSigns(final String string) {
    return SignService.replaceSigns(string);
  }
  
  public void processAuthor(final EObject type, final AdministrativDataObject object) {
    String user = this.getStringFeatureByName(type, "Author");
    if ((Objects.equal(user, null) || user.equals("0"))) {
      String _mainUser = UserRoleService.getMainUser(this.fileName);
      user = _mainUser;
    }
    if (((!Objects.equal(user, null)) && this.userIdMap.containsKey(user))) {
      BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
      rev.setRef(0);
      rev.setTimeStamp(this.now);
      String _get = this.userIdMap.get(user);
      rev.setUserId(_get);
      object.addRevision(rev);
    }
  }
  
  public void processAuthorSubtext(final EgySubTxtType type, final BTSText object, final BTSText supertext) {
    String user = this.getStringFeatureByName(type, "Author");
    if (((!Objects.equal(user, null)) && this.userIdMap.containsKey(user))) {
      BTSRevision rev = BtsmodelFactory.eINSTANCE.createBTSRevision();
      rev.setRef(0);
      rev.setTimeStamp(this.now);
      String _get = this.userIdMap.get(user);
      rev.setUserId(_get);
      object.addRevision(rev);
    } else {
      BTSRevision rev_1 = supertext.getRevision(0);
      boolean _notEquals = (!Objects.equal(rev_1, null));
      if (_notEquals) {
        String _userId = rev_1.getUserId();
        user = _userId;
        rev_1.setRef(0);
        rev_1.setTimeStamp(this.now);
        rev_1.setUserId(user);
        object.addRevision(rev_1);
      }
    }
  }
  
  public boolean processUpdater(final EObject type, final BTSCorpusObject object) {
    boolean _xblockexpression = false;
    {
      String user = this.getStringFeatureByName(type, "Author");
      boolean _xifexpression = false;
      if (((!Objects.equal(user, null)) && this.userNameMap.containsKey(user))) {
        EList<String> _updaters = object.getUpdaters();
        String _get = this.userNameMap.get(user);
        _xifexpression = _updaters.add(_get);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean processUpdaterSupText(final EObject type, final EObject superTexttype, final BTSCorpusObject object, final BTSText supertext) {
    boolean _xblockexpression = false;
    {
      String user = this.getStringFeatureByName(type, "Author");
      if ((Objects.equal(user, null) || (!this.userNameMap.containsKey(user)))) {
        String _stringFeatureByName = this.getStringFeatureByName(superTexttype, "Author");
        user = _stringFeatureByName;
      }
      boolean _xifexpression = false;
      if (((!Objects.equal(user, null)) && this.userNameMap.containsKey(user))) {
        EList<String> _updaters = object.getUpdaters();
        String _get = this.userNameMap.get(user);
        _xifexpression = _updaters.add(_get);
      } else {
        EList<String> _updaters_1 = object.getUpdaters();
        EList<String> _updaters_2 = supertext.getUpdaters();
        String _get_1 = _updaters_2.get(0);
        _xifexpression = _updaters_1.add(_get_1);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean processPassport(final EObject type, final BTSCorpusObject object, final boolean processAuthors) {
    boolean _xblockexpression = false;
    {
      String title = this.getStringFeatureByName(type, "title");
      boolean _equals = Objects.equal(title, null);
      if (_equals) {
        String _stringFeatureByName = this.getStringFeatureByName(type, "tcname");
        title = _stringFeatureByName;
      }
      boolean _equals_1 = Objects.equal(title, null);
      if (_equals_1) {
        String _stringFeatureByName_1 = this.getStringFeatureByName(type, "name");
        title = _stringFeatureByName_1;
      }
      if ((Objects.equal(title, null) || Objects.equal(title.trim(), ""))) {
        String __id = object.get_id();
        String _plus = ("test" + __id);
        title = _plus;
      }
      boolean _contains = title.contains("pLeiden I 348");
      if (_contains) {
        System.out.println("test");
      }
      String _replaceEntities = this.replaceEntities(title);
      object.setName(_replaceEntities);
      String _reviewState = UserRoleService.reviewState(this.fileName);
      object.setRevisionState(_reviewState);
      String _visibility = UserRoleService.getVisibility(this.fileName);
      object.setVisibility(_visibility);
      Object sKey = this.getStringFeatureByName(type, "sortKey");
      if (((!Objects.equal(sKey, null)) && (sKey instanceof String))) {
        String sortKey = ((String) sKey);
        boolean _equals_2 = sortKey.equals("0");
        boolean _not = (!_equals_2);
        if (_not) {
          Integer i = new Integer(sortKey);
          object.setSortKey((i).intValue());
        }
      }
      Object o = this.getSingleRefernceFeatureByName(type, "TCPassport");
      if ((o instanceof TCPassportType)) {
        TCPassportType xmlPassport = ((TCPassportType) o);
        final BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport();
        final BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
        object.setPassport(passport);
        EList<BTSPassportEntry> _children = passport.getChildren();
        _children.add(pGroup);
        pGroup.setType("definition");
        final BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
        mainGroup.setType("main_group");
        EList<BTSPassportEntry> _children_1 = pGroup.getChildren();
        _children_1.add(mainGroup);
        String _definition = xmlPassport.getDefinition();
        String definition = this.replaceEntities(_definition);
        boolean _notEquals = (!Objects.equal(definition, null));
        if (_notEquals) {
          final BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          ppEntryOldType.setType("definition");
          ppEntryOldType.setValue(definition);
          EList<BTSPassportEntry> _children_2 = mainGroup.getChildren();
          _children_2.add(ppEntryOldType);
        }
        String _comment = xmlPassport.getComment();
        String comment = this.replaceEntities(_comment);
        boolean _notEquals_1 = (!Objects.equal(definition, null));
        if (_notEquals_1) {
          final BTSPassportEntryItem ppEntryOldType2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          ppEntryOldType2.setType("comment");
          ppEntryOldType2.setValue(comment);
          EList<BTSPassportEntry> _children_3 = mainGroup.getChildren();
          _children_3.add(ppEntryOldType2);
        }
        String folder = xmlPassport.getWbFolder();
        boolean _notEquals_2 = (!Objects.equal(definition, null));
        if (_notEquals_2) {
          final BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          ppEntryOldId.setType("folder");
          String _replaceEntities_1 = this.replaceEntities(folder);
          ppEntryOldId.setValue(_replaceEntities_1);
          EList<BTSPassportEntry> _children_4 = mainGroup.getChildren();
          _children_4.add(ppEntryOldId);
        }
        String _name = object.getName();
        boolean _contains_1 = _name.contains("652");
        if (_contains_1) {
          LineCountType _lineCount = xmlPassport.getLineCount();
          System.out.println(_lineCount);
        }
        LineCountType line_count = xmlPassport.getLineCount();
        boolean _notEquals_3 = (!Objects.equal(line_count, null));
        if (_notEquals_3) {
          String line_count_value = this.getLineCountSTring(line_count);
          boolean _notEquals_4 = (!Objects.equal(line_count_value, null));
          if (_notEquals_4) {
            final BTSPassportEntryItem line_countt = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            line_countt.setType("line_count");
            line_countt.setValue(line_count_value);
            EList<BTSPassportEntry> _children_5 = mainGroup.getChildren();
            _children_5.add(line_countt);
          }
        }
        String protocol = xmlPassport.getProtocol();
        boolean _notEquals_5 = (!Objects.equal(protocol, null));
        if (_notEquals_5) {
          final BTSPassportEntryItem protocolt = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          protocolt.setType("protocol");
          String _replaceEntitiesNOLB = this.getReplaceEntitiesNOLB(protocol);
          protocolt.setValue(_replaceEntitiesNOLB);
          EList<BTSPassportEntry> _children_6 = mainGroup.getChildren();
          _children_6.add(protocolt);
        }
        String slips = xmlPassport.getWbSlips();
        boolean _notEquals_6 = (!Objects.equal(slips, null));
        if (_notEquals_6) {
          final BTSPassportEntryItem slipst = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          slipst.setType("slips");
          String _replaceEntities_2 = this.replaceEntities(slips);
          slipst.setValue(_replaceEntities_2);
          EList<BTSPassportEntry> _children_7 = mainGroup.getChildren();
          _children_7.add(slipst);
        }
        String _bibliography = xmlPassport.getBibliography();
        String bib = this.getReplaceEntitiesNOLB(_bibliography);
        boolean _notEquals_7 = (!Objects.equal(bib, null));
        if (_notEquals_7) {
          final BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_8 = passport.getChildren();
          _children_8.add(dGroup);
          dGroup.setType("bibliography");
          final BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          ppBegin.setType("bibliographical_text_field");
          ppBegin.setValue(bib);
          EList<BTSPassportEntry> _children_9 = dGroup.getChildren();
          _children_9.add(ppBegin);
        }
        if ((((!Objects.equal(xmlPassport.getObjectType(), null)) && (!Objects.equal(xmlPassport.getObjectType().getPassportDataItem(), null))) && (!Objects.equal(xmlPassport.getObjectType().getPassportDataItem().getThsEntry(), null)))) {
          final BTSPassportEntryGroup dGroup_1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_10 = passport.getChildren();
          _children_10.add(dGroup_1);
          dGroup_1.setType("object");
          final BTSPassportEntryGroup dGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_11 = dGroup_1.getChildren();
          _children_11.add(dGroup2);
          dGroup2.setType("description_of_object");
          PassportDataItem _objectType = xmlPassport.getObjectType();
          PassportDataItemType _passportDataItem = _objectType.getPassportDataItem();
          ThsEntryType _thsEntry = _passportDataItem.getThsEntry();
          String _comment_1 = _thsEntry.getComment();
          String commentString = ((String) _comment_1);
          if ((Objects.equal(commentString, null) || (commentString.length() == 0))) {
            PassportDataItem _objectType_1 = xmlPassport.getObjectType();
            PassportDataItemType _passportDataItem_1 = _objectType_1.getPassportDataItem();
            String _comment_2 = _passportDataItem_1.getComment();
            commentString = ((String) _comment_2);
          }
          if (((!Objects.equal(commentString, null)) && (commentString.length() > 0))) {
            final BTSPassportEntryItem commentEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            commentEntry.setType("comment");
            commentEntry.setValue(commentString);
            EList<BTSPassportEntry> _children_12 = dGroup2.getChildren();
            _children_12.add(commentEntry);
          }
          PassportDataItem _objectType_2 = xmlPassport.getObjectType();
          PassportDataItemType _passportDataItem_2 = _objectType_2.getPassportDataItem();
          ThsEntryType _thsEntry_1 = _passportDataItem_2.getThsEntry();
          Object _key = _thsEntry_1.getKey();
          boolean _notEquals_8 = (!Objects.equal(_key, null));
          if (_notEquals_8) {
            PassportDataItem _objectType_3 = xmlPassport.getObjectType();
            PassportDataItemType _passportDataItem_3 = _objectType_3.getPassportDataItem();
            ThsEntryType _thsEntry_2 = _passportDataItem_3.getThsEntry();
            Object _key_1 = _thsEntry_2.getKey();
            String typeString = ("7/" + ((String) _key_1));
            List<String> mappedTypes = this.processTypeMapping(typeString);
            if (((!Objects.equal(mappedTypes, null)) && (!mappedTypes.isEmpty()))) {
              for (final String s : mappedTypes) {
                boolean _startsWith = s.startsWith("review");
                boolean _not_1 = (!_startsWith);
                if (_not_1) {
                  String value = s;
                  boolean _containsKey = this.thsIdMap.containsKey(s);
                  if (_containsKey) {
                    String _get = this.thsIdMap.get(s);
                    value = _get;
                  }
                  final BTSPassportEntryItem ppBegin_1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                  ppBegin_1.setValue(value);
                  boolean _startsWith_1 = s.startsWith("21");
                  if (_startsWith_1) {
                    ppBegin_1.setType("type");
                  } else {
                    boolean _startsWith_2 = s.startsWith("22");
                    if (_startsWith_2) {
                      ppBegin_1.setType("component");
                    } else {
                      boolean _startsWith_3 = s.startsWith("23");
                      if (_startsWith_3) {
                        ppBegin_1.setType("agent");
                      } else {
                        boolean _startsWith_4 = s.startsWith("24");
                        if (_startsWith_4) {
                          final BTSPassportEntryGroup dGroupMaterial = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
                          EList<BTSPassportEntry> _children_13 = dGroup_1.getChildren();
                          _children_13.add(dGroupMaterial);
                          dGroupMaterial.setType("technical_details");
                          final BTSPassportEntryItem itemMaterial = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                          itemMaterial.setValue(value);
                          itemMaterial.setType("material");
                          EList<BTSPassportEntry> _children_14 = dGroupMaterial.getChildren();
                          _children_14.add(itemMaterial);
                        } else {
                          boolean _startsWith_5 = s.startsWith("25");
                          if (_startsWith_5) {
                            final BTSPassportEntryGroup dGroupContext = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
                            EList<BTSPassportEntry> _children_15 = dGroup_1.getChildren();
                            _children_15.add(dGroupContext);
                            dGroupContext.setType("archaeological_cultural_context_of_object");
                            final BTSPassportEntryItem itemContext = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                            itemContext.setValue(value);
                            itemContext.setType("cultural_context");
                            EList<BTSPassportEntry> _children_16 = dGroupContext.getChildren();
                            _children_16.add(itemContext);
                          } else {
                            boolean _startsWith_6 = s.startsWith("26");
                            if (_startsWith_6) {
                              ppBegin_1.setType("model");
                              ppBegin_1.setValue("true");
                            } else {
                              boolean _startsWith_7 = s.startsWith("27");
                              if (_startsWith_7) {
                                ppBegin_1.setType("imitation");
                                ppBegin_1.setValue("true");
                              } else {
                                boolean _startsWith_8 = s.startsWith("28");
                                if (_startsWith_8) {
                                  ppBegin_1.setType("miniature");
                                  ppBegin_1.setValue("true");
                                } else {
                                  boolean _startsWith_9 = s.startsWith("29");
                                  if (_startsWith_9) {
                                    ppBegin_1.setType("skeuomorph");
                                    ppBegin_1.setValue("true");
                                  } else {
                                    boolean _startsWith_10 = s.startsWith("30");
                                    if (_startsWith_10) {
                                      ppBegin_1.setType("copy");
                                      ppBegin_1.setValue("true");
                                    } else {
                                      ppBegin_1.setType("type");
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  EList<BTSPassportEntry> _children_17 = dGroup2.getChildren();
                  _children_17.add(ppBegin_1);
                } else {
                  int _length = s.length();
                  String _substring = s.substring(7, _length);
                  object.setRevisionState(_substring);
                }
              }
            } else {
              final BTSPassportEntryItem ppBegin_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              ppBegin_2.setType("type_of_object");
              ppBegin_2.setValue(typeString);
              EList<BTSPassportEntry> _children_18 = dGroup2.getChildren();
              _children_18.add(ppBegin_2);
            }
          }
        }
        if ((((!Objects.equal(xmlPassport.getProvenance(), null)) && (!Objects.equal(xmlPassport.getProvenance().getPassportDataItem(), null))) && (!Objects.equal(xmlPassport.getProvenance().getPassportDataItem().getThsEntry(), null)))) {
          final BTSPassportEntryGroup dGroup_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_19 = passport.getChildren();
          _children_19.add(dGroup_2);
          dGroup_2.setType("find_spot");
          final BTSPassportEntryGroup dGroup1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_20 = dGroup_2.getChildren();
          _children_20.add(dGroup1);
          dGroup1.setType("find_spot");
          final BTSPassportEntryGroup dGroup2_1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_21 = dGroup1.getChildren();
          _children_21.add(dGroup2_1);
          dGroup2_1.setType("place");
          PassportDataItem _provenance = xmlPassport.getProvenance();
          PassportDataItemType _passportDataItem_4 = _provenance.getPassportDataItem();
          ThsEntryType _thsEntry_3 = _passportDataItem_4.getThsEntry();
          Object _key_2 = _thsEntry_3.getKey();
          boolean _notEquals_9 = (!Objects.equal(_key_2, null));
          if (_notEquals_9) {
            PassportDataItem _provenance_1 = xmlPassport.getProvenance();
            PassportDataItemType _passportDataItem_5 = _provenance_1.getPassportDataItem();
            ThsEntryType _thsEntry_4 = _passportDataItem_5.getThsEntry();
            Object _key_3 = _thsEntry_4.getKey();
            String typeString_1 = ("3/" + ((String) _key_3));
            boolean _containsKey_1 = this.thsIdMap.containsKey(typeString_1);
            if (_containsKey_1) {
              String _get_1 = this.thsIdMap.get(typeString_1);
              typeString_1 = _get_1;
            }
            final BTSPassportEntryItem ppBegin_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            ppBegin_3.setType("place");
            ppBegin_3.setValue(typeString_1);
            EList<BTSPassportEntry> _children_22 = dGroup2_1.getChildren();
            _children_22.add(ppBegin_3);
          }
          PassportDataItem _provenance_2 = xmlPassport.getProvenance();
          PassportDataItemType _passportDataItem_6 = _provenance_2.getPassportDataItem();
          ThsEntryType _thsEntry_5 = _passportDataItem_6.getThsEntry();
          String _comment_3 = _thsEntry_5.getComment();
          String commentString_1 = ((String) _comment_3);
          if ((Objects.equal(commentString_1, null) || (commentString_1.length() == 0))) {
            PassportDataItem _provenance_3 = xmlPassport.getProvenance();
            PassportDataItemType _passportDataItem_7 = _provenance_3.getPassportDataItem();
            String _comment_4 = _passportDataItem_7.getComment();
            commentString_1 = ((String) _comment_4);
          }
          if (((!Objects.equal(commentString_1, null)) && (commentString_1.length() > 0))) {
            final BTSPassportEntryItem commentEntry_1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            commentEntry_1.setType("comment");
            commentEntry_1.setValue(commentString_1);
            EList<BTSPassportEntry> _children_23 = dGroup2_1.getChildren();
            _children_23.add(commentEntry_1);
          }
        }
        {
          final BTSPassportEntryGroup dGroup_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_24 = passport.getChildren();
          _children_24.add(dGroup_3);
          dGroup_3.setType("text");
          final BTSPassportEntryGroup dGroup2_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_25 = dGroup_3.getChildren();
          _children_25.add(dGroup2_2);
          dGroup2_2.setType("textual_metadata");
          if ((((type instanceof TCTextType) && (!Objects.equal(((TCTextType) type).getEgyTxt(), null))) && (!Objects.equal(((TCTextType) type).getEgyTxt().getName(), null)))) {
            EgyTxtType _egyTxt = ((TCTextType) type).getEgyTxt();
            String _name_1 = _egyTxt.getName();
            String egyTextName = this.replaceEntities(_name_1);
            boolean _notEquals_10 = (!Objects.equal(egyTextName, null));
            if (_notEquals_10) {
              final BTSPassportEntryItem pptextName = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              pptextName.setType("egyTextName");
              pptextName.setValue(egyTextName);
              EList<BTSPassportEntry> _children_26 = dGroup2_2.getChildren();
              _children_26.add(pptextName);
            }
          }
          if (((((!Objects.equal(xmlPassport.getScript(), null)) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem(), null))) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem().getThsEntry(), null))) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem().getThsEntry().getKey(), null)))) {
            PassportDataItem _script = xmlPassport.getScript();
            PassportDataItemType _passportDataItem_8 = _script.getPassportDataItem();
            ThsEntryType _thsEntry_6 = _passportDataItem_8.getThsEntry();
            Object _key_4 = _thsEntry_6.getKey();
            String typeString_2 = ("5/" + ((String) _key_4));
            boolean _containsKey_2 = this.thsIdMap.containsKey(typeString_2);
            if (_containsKey_2) {
              String _get_2 = this.thsIdMap.get(typeString_2);
              typeString_2 = _get_2;
            }
            final BTSPassportEntryItem ppBegin_4 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            ppBegin_4.setType("script");
            ppBegin_4.setValue(typeString_2);
            EList<BTSPassportEntry> _children_27 = dGroup2_2.getChildren();
            _children_27.add(ppBegin_4);
          }
          if (((((!Objects.equal(xmlPassport.getScript(), null)) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem(), null))) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem().getThsEntry(), null))) && (!Objects.equal(xmlPassport.getScript().getPassportDataItem().getThsEntry().getComment(), null)))) {
            PassportDataItem _script_1 = xmlPassport.getScript();
            PassportDataItemType _passportDataItem_9 = _script_1.getPassportDataItem();
            ThsEntryType _thsEntry_7 = _passportDataItem_9.getThsEntry();
            String _comment_5 = _thsEntry_7.getComment();
            String commentString_2 = ((String) _comment_5);
            if ((Objects.equal(commentString_2, null) || (commentString_2.length() == 0))) {
              PassportDataItem _script_2 = xmlPassport.getScript();
              PassportDataItemType _passportDataItem_10 = _script_2.getPassportDataItem();
              String _comment_6 = _passportDataItem_10.getComment();
              commentString_2 = ((String) _comment_6);
            }
            if (((!Objects.equal(commentString_2, null)) && (commentString_2.length() > 0))) {
              final BTSPassportEntryItem commentEntry_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              commentEntry_2.setType("comment_on_script");
              commentEntry_2.setValue(commentString_2);
              EList<BTSPassportEntry> _children_28 = dGroup2_2.getChildren();
              _children_28.add(commentEntry_2);
            }
          }
          if ((((!Objects.equal(xmlPassport.getLanguage(), null)) && (!Objects.equal(xmlPassport.getLanguage().getPassportDataItem(), null))) && (!Objects.equal(xmlPassport.getLanguage().getPassportDataItem().getThsEntry(), null)))) {
            PassportDataItem _language = xmlPassport.getLanguage();
            PassportDataItemType _passportDataItem_11 = _language.getPassportDataItem();
            ThsEntryType _thsEntry_8 = _passportDataItem_11.getThsEntry();
            Object _key_5 = _thsEntry_8.getKey();
            boolean _notEquals_11 = (!Objects.equal(_key_5, null));
            if (_notEquals_11) {
              PassportDataItem _language_1 = xmlPassport.getLanguage();
              PassportDataItemType _passportDataItem_12 = _language_1.getPassportDataItem();
              ThsEntryType _thsEntry_9 = _passportDataItem_12.getThsEntry();
              Object _key_6 = _thsEntry_9.getKey();
              String typeString_3 = ("4/" + ((String) _key_6));
              boolean _containsKey_3 = this.thsIdMap.containsKey(typeString_3);
              if (_containsKey_3) {
                String _get_3 = this.thsIdMap.get(typeString_3);
                typeString_3 = _get_3;
              }
              final BTSPassportEntryItem ppBegin_5 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              ppBegin_5.setType("language");
              ppBegin_5.setValue(typeString_3);
              EList<BTSPassportEntry> _children_29 = dGroup2_2.getChildren();
              _children_29.add(ppBegin_5);
            }
            PassportDataItem _language_2 = xmlPassport.getLanguage();
            PassportDataItemType _passportDataItem_13 = _language_2.getPassportDataItem();
            ThsEntryType _thsEntry_10 = _passportDataItem_13.getThsEntry();
            String _comment_7 = _thsEntry_10.getComment();
            String commentString_3 = ((String) _comment_7);
            if ((Objects.equal(commentString_3, null) || (commentString_3.length() == 0))) {
              PassportDataItem _language_3 = xmlPassport.getLanguage();
              PassportDataItemType _passportDataItem_14 = _language_3.getPassportDataItem();
              String _comment_8 = _passportDataItem_14.getComment();
              commentString_3 = ((String) _comment_8);
            }
            if (((!Objects.equal(commentString_3, null)) && (commentString_3.length() > 0))) {
              final BTSPassportEntryItem commentEntry_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              commentEntry_3.setType("comment_on_language");
              commentEntry_3.setValue(commentString_3);
              EList<BTSPassportEntry> _children_30 = dGroup2_2.getChildren();
              _children_30.add(commentEntry_3);
            }
          }
          if (((!Objects.equal(xmlPassport.getTextType(), null)) && (!Objects.equal(xmlPassport.getTextType().getPassportDataItem(), null)))) {
            PassportDataItem _textType = xmlPassport.getTextType();
            PassportDataItemType _passportDataItem_15 = _textType.getPassportDataItem();
            ThsEntryType _thsEntry_11 = _passportDataItem_15.getThsEntry();
            Object _key_7 = _thsEntry_11.getKey();
            boolean _notEquals_12 = (!Objects.equal(_key_7, null));
            if (_notEquals_12) {
              PassportDataItem _textType_1 = xmlPassport.getTextType();
              PassportDataItemType _passportDataItem_16 = _textType_1.getPassportDataItem();
              ThsEntryType _thsEntry_12 = _passportDataItem_16.getThsEntry();
              Object _key_8 = _thsEntry_12.getKey();
              String typeString_4 = ("11/" + ((String) _key_8));
              boolean _containsKey_4 = this.thsIdMap.containsKey(typeString_4);
              if (_containsKey_4) {
                String _get_4 = this.thsIdMap.get(typeString_4);
                typeString_4 = _get_4;
              }
              final BTSPassportEntryItem ppBegin_6 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              ppBegin_6.setType("texttype");
              ppBegin_6.setValue(typeString_4);
              EList<BTSPassportEntry> _children_31 = dGroup2_2.getChildren();
              _children_31.add(ppBegin_6);
            }
            PassportDataItem _textType_2 = xmlPassport.getTextType();
            PassportDataItemType _passportDataItem_17 = _textType_2.getPassportDataItem();
            ThsEntryType _thsEntry_13 = _passportDataItem_17.getThsEntry();
            String _comment_9 = _thsEntry_13.getComment();
            String commentString_4 = ((String) _comment_9);
            if ((Objects.equal(commentString_4, null) || (commentString_4.length() == 0))) {
              PassportDataItem _textType_3 = xmlPassport.getTextType();
              PassportDataItemType _passportDataItem_18 = _textType_3.getPassportDataItem();
              String _comment_10 = _passportDataItem_18.getComment();
              commentString_4 = ((String) _comment_10);
            }
            if (((!Objects.equal(commentString_4, null)) && (commentString_4.length() > 0))) {
              final BTSPassportEntryItem commentEntry_4 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              commentEntry_4.setType("comment_on_texttype");
              commentEntry_4.setValue(commentString_4);
              EList<BTSPassportEntry> _children_32 = dGroup2_2.getChildren();
              _children_32.add(commentEntry_4);
            }
          }
        }
        DateType date = xmlPassport.getDate();
        if (((!Objects.equal(date, null)) && (!date.getDateThs().isEmpty()))) {
          final BTSPassportEntryGroup dGroup_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_24 = passport.getChildren();
          _children_24.add(dGroup_3);
          dGroup_3.setType("date");
          final BTSPassportEntryGroup dGroup2_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_25 = dGroup_3.getChildren();
          _children_25.add(dGroup2_2);
          dGroup2_2.setType("date");
          EList<DateThsType> _dateThs = date.getDateThs();
          DateThsType _get_2 = _dateThs.get(0);
          Object _yearFrom = _get_2.getYearFrom();
          String dateString1 = ((String) _yearFrom);
          EList<DateThsType> _dateThs_1 = date.getDateThs();
          DateThsType _get_3 = _dateThs_1.get(0);
          Object _yearTo = _get_3.getYearTo();
          String dateString2 = ((String) _yearTo);
          if (((((!Objects.equal(dateString1, "-1")) && (!Objects.equal(dateString2, "-1"))) && (!Objects.equal(dateString1, "1"))) && (!Objects.equal(dateString2, "1")))) {
            String dateString = ((dateString1 + ":") + dateString2);
            final BTSPassportEntryItem ppBegin_4 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            ppBegin_4.setType("date");
            boolean _containsKey_2 = this.thsDateMap.containsKey(dateString);
            if (_containsKey_2) {
              String _get_4 = this.thsDateMap.get(dateString);
              ppBegin_4.setValue(_get_4);
              EList<BTSPassportEntry> _children_26 = dGroup2_2.getChildren();
              _children_26.add(ppBegin_4);
            } else {
              boolean _containsKey_3 = this.thsDateMap.containsKey(("B" + dateString1));
              if (_containsKey_3) {
                String _get_5 = this.thsDateMap.get(("B" + dateString1));
                ppBegin_4.setValue(_get_5);
                EList<BTSPassportEntry> _children_27 = dGroup2_2.getChildren();
                _children_27.add(ppBegin_4);
              } else {
                ppBegin_4.setValue(dateString1);
                EList<BTSPassportEntry> _children_28 = dGroup2_2.getChildren();
                _children_28.add(ppBegin_4);
              }
              boolean _containsKey_4 = this.thsDateMap.containsKey(("E" + dateString2));
              if (_containsKey_4) {
                final BTSPassportEntryItem d = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                d.setType("date");
                String _get_6 = this.thsDateMap.get(("E" + dateString2));
                d.setValue(_get_6);
                EList<BTSPassportEntry> _children_29 = dGroup2_2.getChildren();
                _children_29.add(d);
              } else {
                final BTSPassportEntryItem d_1 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                d_1.setType("date");
                d_1.setValue(dateString2);
                EList<BTSPassportEntry> _children_30 = dGroup2_2.getChildren();
                _children_30.add(d_1);
              }
            }
          }
          final BTSPassportEntryItem ppcomment = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
          ppcomment.setType("comment");
          EList<String> _comment_5 = date.getComment();
          String _appendedString = this.toAppendedString(_comment_5);
          ppcomment.setValue(_appendedString);
          EList<BTSPassportEntry> _children_31 = dGroup2_2.getChildren();
          _children_31.add(ppcomment);
        }
        if (((!Objects.equal(xmlPassport.getTCLocation(), null)) && (!xmlPassport.getTCLocation().isEmpty()))) {
          final BTSPassportEntryGroup dGroup_4 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
          EList<BTSPassportEntry> _children_32 = passport.getChildren();
          _children_32.add(dGroup_4);
          dGroup_4.setType("present_location");
          EList<TCLocationType> _tCLocation = xmlPassport.getTCLocation();
          for (final TCLocationType loc : _tCLocation) {
            {
              final BTSPassportEntryGroup dGroup2_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
              EList<BTSPassportEntry> _children_33 = dGroup_4.getChildren();
              _children_33.add(dGroup2_3);
              dGroup2_3.setType("location");
              ThsEntryType _thsEntry_6 = loc.getThsEntry();
              Object _key_4 = _thsEntry_6.getKey();
              String typeString_2 = ("2/" + ((String) _key_4));
              boolean _containsKey_5 = this.thsIdMap.containsKey(typeString_2);
              if (_containsKey_5) {
                String _get_7 = this.thsIdMap.get(typeString_2);
                typeString_2 = _get_7;
              }
              final BTSPassportEntryItem location = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
              location.setType("location");
              location.setValue(typeString_2);
              EList<BTSPassportEntry> _children_34 = dGroup2_3.getChildren();
              _children_34.add(location);
              String _museumNumber = loc.getMuseumNumber();
              String inventoryString = ((String) _museumNumber);
              if (((!Objects.equal(inventoryString, null)) && (inventoryString.length() > 0))) {
                final BTSPassportEntryItem commentEntry_2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                commentEntry_2.setType("inventory_number");
                commentEntry_2.setValue(inventoryString);
                EList<BTSPassportEntry> _children_35 = dGroup2_3.getChildren();
                _children_35.add(commentEntry_2);
              }
              String _comment_6 = loc.getComment();
              String commentString_2 = ((String) _comment_6);
              if (((!Objects.equal(commentString_2, null)) && (commentString_2.length() > 0))) {
                final BTSPassportEntryItem commentEntry_3 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
                commentEntry_3.setType("comment");
                commentEntry_3.setValue(commentString_2);
                EList<BTSPassportEntry> _children_36 = dGroup2_3.getChildren();
                _children_36.add(commentEntry_3);
              }
            }
          }
        }
      }
      boolean _xifexpression = false;
      if (processAuthors) {
        boolean _xblockexpression_1 = false;
        {
          this.processAuthor(type, object);
          _xblockexpression_1 = this.processUpdater(type, object);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String getLineCountSTring(final LineCountType type) {
    String value = null;
    boolean _notEquals = (!Objects.equal(type, null));
    if (_notEquals) {
      FeatureMap _mixed = type.getMixed();
      BasicFeatureMap mixed = ((BasicFeatureMap) _mixed);
      boolean _isEmpty = mixed.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        FeatureMap.Entry _get = mixed.get(0);
        EStructuralFeatureImpl.SimpleFeatureMapEntry o = ((EStructuralFeatureImpl.SimpleFeatureMapEntry) _get);
        String _string = o.toString();
        String _substring = _string.substring(20);
        value = _substring;
        System.out.println(value);
      }
    }
    return value;
  }
  
  public List<String> processTypeMapping(final String string) {
    String[] results = ThsMappingService.replaceSigns(string);
    final String[] _converted_results = (String[])results;
    int _size = ((List<String>)Conversions.doWrapArray(_converted_results)).size();
    List<String> l = new Vector<String>(_size);
    for (final String s : results) {
      l.add(s);
    }
    return l;
  }
  
  public String toAppendedString(final EList<String> list) {
    String all = null;
    boolean sep = false;
    for (final String s : list) {
      String _trim = s.trim();
      int _length = _trim.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        if (sep) {
          all = ((all + ", ") + s);
        } else {
          all = s;
          sep = true;
        }
      }
    }
    return all;
  }
  
  public String getStringFeatureByName(final EObject object, final String string) {
    EClass _eClass = object.eClass();
    EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
    for (final EAttribute o : _eAllAttributes) {
      String _name = o.getName();
      String _lowerCase = _name.toLowerCase();
      String _lowerCase_1 = string.toLowerCase();
      boolean _endsWith = _lowerCase.endsWith(_lowerCase_1);
      if (_endsWith) {
        Object _eGet = object.eGet(o);
        return ((String) _eGet);
      }
    }
    return null;
  }
  
  public List getListReferenceFeatureByName(final EObject object, final String string) {
    EClass _eClass = object.eClass();
    EList<EReference> _eAllReferences = _eClass.getEAllReferences();
    for (final EReference o : _eAllReferences) {
      String _name = o.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _equals = _lowerCase.equals(string);
      if (_equals) {
        Object _eGet = object.eGet(o);
        return ((List) _eGet);
      }
    }
    return null;
  }
  
  public Object getSingleRefernceFeatureByName(final EObject object, final String string) {
    EClass _eClass = object.eClass();
    EList<EReference> _eAllReferences = _eClass.getEAllReferences();
    for (final EReference o : _eAllReferences) {
      String _name = o.getName();
      String _lowerCase = _name.toLowerCase();
      String _lowerCase_1 = string.toLowerCase();
      boolean _equals = _lowerCase.equals(_lowerCase_1);
      if (_equals) {
        return object.eGet(o);
      }
    }
    return null;
  }
  
  public void addToObjects(final BTSCorpusObject object) {
    this.objects.add(object);
    object.setDBCollectionKey(this.dbCollection);
  }
  
  public EgyTxtCorpusType retrieveEgyTxtCorpus(final DocumentRoot root) {
    FeatureMap _mixed = root.getMixed();
    for (final Object o : _mixed) {
      if (((o instanceof FeatureMap.Entry) && (((FeatureMap.Entry) o).getValue() instanceof EgyTxtCorpusType))) {
        Object _value = ((FeatureMap.Entry) o).getValue();
        return ((EgyTxtCorpusType) _value);
      }
    }
    return null;
  }
  
  public String replaceEntities(final String string) {
    String str = CharsService.replaceEntities(string, true);
    boolean _equals = Objects.equal(str, null);
    if (_equals) {
      return null;
    }
    String _trim = str.trim();
    boolean _equals_1 = "".equals(_trim);
    if (_equals_1) {
      return null;
    }
    return this.normalizeWS(str);
  }
  
  public String getReplaceEntitiesNOLB(final String string) {
    String str = CharsService.replaceEntities(string, true);
    boolean _equals = Objects.equal(str, null);
    if (_equals) {
      return null;
    }
    String _trim = str.trim();
    boolean _equals_1 = "".equals(_trim);
    if (_equals_1) {
      return null;
    }
    return str;
  }
  
  public List<BTSComment> getComments() {
    return this.comments;
  }
}
