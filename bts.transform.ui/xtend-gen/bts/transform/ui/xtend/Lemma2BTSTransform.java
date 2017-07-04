package bts.transform.ui.xtend;

import Btsaux.BwlenglType;
import Btsaux.BwllinkType;
import Btsaux.BwllistType;
import Btsaux.DocumentRoot;
import Btsaux.StupidXMLType;
import bts.transform.ui.chars.CharsService;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import org.apache.commons.lang.StringUtils;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;

@SuppressWarnings("all")
public class Lemma2BTSTransform {
  @Inject
  private BTSLemmaEntryService lemmaService;
  
  private Map<String, BTSLemmaEntry> map = new HashMap<String, BTSLemmaEntry>();
  
  private boolean demotic;
  
  private Pattern commentGapPattern = Pattern.compile("(^[^;]*)([;\\s]*)");
  
  public List<BTSLemmaEntry> transform(final DocumentRoot root, final boolean demotic) {
    this.demotic = demotic;
    List<BTSLemmaEntry> lemmata = new Vector<BTSLemmaEntry>();
    StupidXMLType stupid = this.retrieveStupid(root);
    this.processBWLListEntries(stupid, lemmata);
    EList<BwlenglType> _bwlengl = stupid.getBwlengl();
    for (final BwlenglType bw : _bwlengl) {
      this.processTranslation(bw);
    }
    EList<BwllinkType> _bwllink = stupid.getBwllink();
    for (final BwllinkType link : _bwllink) {
      this.processLink(link);
    }
    return lemmata;
  }
  
  public void processBWLListEntries(final StupidXMLType stupid, final List<BTSLemmaEntry> lemmata) {
    int counter = 0;
    Vector<BwllistType> ls = new Vector<BwllistType>();
    FeatureMap _group = stupid.getGroup();
    for (final FeatureMap.Entry e : _group) {
      Object _value = e.getValue();
      if ((_value instanceof BwllistType)) {
        Object _value_1 = e.getValue();
        ls.add(((BwllistType) _value_1));
      }
    }
    for (final BwllistType o : ls) {
      {
        BTSLemmaEntry t = this.makeLemma(o);
        String _wcn = o.getWcn();
        this.map.put(_wcn, t);
        lemmata.add(t);
        counter = (counter + 1);
        if ((counter == 130)) {
          System.out.println(counter);
        }
      }
    }
    System.out.println(counter);
  }
  
  public boolean processLink(final BwllinkType type) {
    boolean _xifexpression = false;
    String _wcn = type.getWcn();
    boolean _containsKey = this.map.containsKey(_wcn);
    if (_containsKey) {
      boolean _xblockexpression = false;
      {
        String _wcn_1 = type.getWcn();
        final BTSLemmaEntry l = this.map.get(_wcn_1);
        boolean _xifexpression_1 = false;
        boolean _notEquals = (!Objects.equal(l, null));
        if (_notEquals) {
          boolean _xblockexpression_1 = false;
          {
            final BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
            Object _ltype = type.getLtype();
            final String _switchValue = ((String) _ltype);
            switch (_switchValue) {
              case "RFX":
                rel.setType("referencing");
                break;
              case "RFY":
                rel.setType("referencedBy");
                break;
              case "HIX":
                rel.setType("contains");
                break;
              case "HIY":
                rel.setType("partOf");
                break;
              case "COX":
                rel.setType("composedOf");
                break;
              case "COY":
                rel.setType("composes");
                break;
              default:
                rel.setType("partOf");
                break;
            }
            String objectId = null;
            if (this.demotic) {
              String _lkey = type.getLkey();
              boolean _startsWith = _lkey.startsWith("-");
              if (_startsWith) {
                String _lkey_1 = type.getLkey();
                String _replaceFirst = _lkey_1.replaceFirst("-", "m");
                String _plus = ("d" + _replaceFirst);
                objectId = _plus;
              } else {
                String _lkey_2 = type.getLkey();
                String _plus_1 = ("d" + _lkey_2);
                objectId = _plus_1;
              }
            } else {
              String _lkey_3 = type.getLkey();
              objectId = _lkey_3;
            }
            rel.setObjectId(objectId);
            EList<BTSRelation> _relations = l.getRelations();
            _xblockexpression_1 = _relations.add(rel);
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public Object processTranslation(final BwlenglType type) {
    Object _xifexpression = null;
    if ((((!Objects.equal(type, null)) && (!Objects.equal(type.getWcn(), null))) && this.map.containsKey(type.getWcn()))) {
      Object _xblockexpression = null;
      {
        String _wcn = type.getWcn();
        final BTSLemmaEntry l = this.map.get(_wcn);
        Object _xifexpression_1 = null;
        boolean _equals = Objects.equal(l, null);
        if (_equals) {
          _xifexpression_1 = null;
        } else {
          BTSTranslations _translations = l.getTranslations();
          Object _elabel = type.getElabel();
          String _replaceEntities = this.replaceEntities(((String) _elabel));
          _translations.setTranslation(_replaceEntities, "en");
          BTSPassport _passport = l.getPassport();
          BTSPassportEntry item = _passport.getPassportEntryByPath("lemma>>main_group>>english_comment");
          boolean _equals_1 = Objects.equal(item, null);
          if (_equals_1) {
            BTSPassport _passport_1 = l.getPassport();
            BTSPassportEntry group = _passport_1.getPassportEntryByPath("lemma>>main_group");
            boolean _equals_2 = Objects.equal(group, null);
            if (_equals_2) {
              BTSPassport _passport_2 = l.getPassport();
              BTSPassportEntry pGroup = _passport_2.getPassportEntryByPath("lemma");
              final BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
              mainGroup.setType("main_group");
              EList<BTSPassportEntry> _children = pGroup.getChildren();
              _children.add(mainGroup);
            }
            BTSPassportEntryItem _createBTSPassportEntryItem = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
            item = _createBTSPassportEntryItem;
            item.setType("english_comment");
            EList<BTSPassportEntry> _children_1 = group.getChildren();
            _children_1.add(item);
          }
          Object _ecomment = type.getEcomment();
          item.setValue(((String) _ecomment));
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public BTSLemmaEntry makeLemma(final BwllistType type) {
    BTSLemmaEntry t = this.lemmaService.createNew();
    if (this.demotic) {
      String _wcn = type.getWcn();
      boolean _startsWith = _wcn.startsWith("-");
      if (_startsWith) {
        String _wcn_1 = type.getWcn();
        String _replaceFirst = _wcn_1.replaceFirst("-", "m");
        String _plus = ("d" + _replaceFirst);
        t.set_id(_plus);
      } else {
        String _wcn_2 = type.getWcn();
        String _plus_1 = ("d" + _wcn_2);
        t.set_id(_plus_1);
      }
    } else {
      String _wcn_3 = type.getWcn();
      t.set_id(_wcn_3);
    }
    Object _lemma = type.getLemma();
    String _replaceEntities = this.replaceEntities(((String) _lemma));
    t.setName(_replaceEntities);
    String _redaction = type.getRedaction();
    final String _switchValue = ((String) _redaction);
    switch (_switchValue) {
      case "-1":
        t.setRevisionState("undefined");
        break;
      case "0":
        t.setRevisionState("published-awaiting-review");
        break;
      case "1":
        t.setRevisionState("published-awaiting-review");
        break;
      case "2":
        t.setRevisionState("published");
        break;
      case "3":
        t.setRevisionState("obsolete");
        break;
      case "4":
        t.setRevisionState("published-obsolete");
        break;
      case "6":
        t.setRevisionState("published-awaiting-review");
        break;
      case "7":
        t.setRevisionState("published");
        break;
      case "8":
        t.setRevisionState("new");
        break;
      case "9":
        t.setRevisionState("published-obsolete");
        break;
      default:
        t.setRevisionState("new");
        break;
    }
    final BTSExternalReference ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference();
    ref.setType("aaew_wcn");
    String _wcn_4 = type.getWcn();
    ref.setReference(_wcn_4);
    EList<BTSExternalReference> _externalReferences = t.getExternalReferences();
    _externalReferences.add(ref);
    EList<String> _updaters = t.getUpdaters();
    _updaters.add("SSchweitzer");
    t.setVisibility("public");
    if ((Objects.equal(t.get_id(), "861909") || Objects.equal(t.get_id(), "861902"))) {
      String _name = t.getName();
      System.out.println(_name);
    }
    final Vector<String> names = new Vector<String>();
    String _name_1 = t.getName();
    boolean _contains = _name_1.contains(" ");
    if (_contains) {
      String _name_2 = t.getName();
      String[] _split = _name_2.split("\\s");
      CollectionExtensions.<String>addAll(names, _split);
    } else {
      String _name_3 = t.getName();
      names.add(_name_3);
    }
    for (final String s : names) {
      {
        final BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
        w.setWChar(s);
        EList<BTSWord> _words = t.getWords();
        _words.add(w);
      }
    }
    BTSTranslations _createBTSTranslations = BtsmodelFactory.eINSTANCE.createBTSTranslations();
    t.setTranslations(_createBTSTranslations);
    BTSTranslations _translations = t.getTranslations();
    Object _label = type.getLabel();
    String _replaceEntities_1 = this.replaceEntities(((String) _label));
    String _normalizeWS = this.normalizeWS(_replaceEntities_1);
    _translations.setTranslation(_normalizeWS, "de");
    this.processWClassnum(type, t);
    final BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport();
    final BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
    t.setPassport(passport);
    EList<BTSPassportEntry> _children = passport.getChildren();
    _children.add(pGroup);
    pGroup.setType("lemma");
    final BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
    mainGroup.setType("main_group");
    EList<BTSPassportEntry> _children_1 = pGroup.getChildren();
    _children_1.add(mainGroup);
    final BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppEntryOldType.setType("word_class");
    Object _wclass = type.getWclass();
    ppEntryOldType.setValue(((String) _wclass));
    EList<BTSPassportEntry> _children_2 = mainGroup.getChildren();
    _children_2.add(ppEntryOldType);
    final BTSPassportEntryItem ppEntryOldType2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppEntryOldType2.setType("wclassnum");
    String _wclassnum = type.getWclassnum();
    ppEntryOldType2.setValue(((String) _wclassnum));
    EList<BTSPassportEntry> _children_3 = mainGroup.getChildren();
    _children_3.add(ppEntryOldType2);
    final BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppEntryOldId.setType("woart");
    String _woart = type.getWoart();
    ppEntryOldId.setValue(_woart);
    EList<BTSPassportEntry> _children_4 = mainGroup.getChildren();
    _children_4.add(ppEntryOldId);
    final BTSPassportEntryItem comment = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    comment.setType("comment");
    Object _kommentar = type.getKommentar();
    String _replaceEntities_2 = this.replaceEntities(((String) _kommentar));
    String s_1 = this.replaceCommentGaps(_replaceEntities_2);
    boolean _notEquals = (!Objects.equal(s_1, null));
    if (_notEquals) {
      comment.setValue(s_1);
      EList<BTSPassportEntry> _children_5 = mainGroup.getChildren();
      _children_5.add(comment);
    }
    final BTSPassportEntryItem arb_vermerk = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    arb_vermerk.setType("arb_vermerk");
    Object _arbVermerk = type.getArbVermerk();
    String _replaceEntities_3 = this.replaceEntities(((String) _arbVermerk));
    String abs = this.replaceCommentGaps(_replaceEntities_3);
    boolean _notEquals_1 = (!Objects.equal(abs, null));
    if (_notEquals_1) {
      arb_vermerk.setValue(abs);
      EList<BTSPassportEntry> _children_6 = mainGroup.getChildren();
      _children_6.add(arb_vermerk);
    }
    final BTSPassportEntryItem lsort = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    lsort.setType("lsort");
    Object _lsort = type.getLsort();
    String _replaceEntities_4 = this.replaceEntities(((String) _lsort));
    lsort.setValue(_replaceEntities_4);
    EList<BTSPassportEntry> _children_7 = mainGroup.getChildren();
    _children_7.add(lsort);
    Object _shortref = type.getShortref();
    boolean _notEquals_2 = (!Objects.equal(_shortref, null));
    if (_notEquals_2) {
      final BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
      EList<BTSPassportEntry> _children_8 = passport.getChildren();
      _children_8.add(dGroup);
      dGroup.setType("bibliography");
      final BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
      ppBegin.setType("bibliographical_text_field");
      Object _shortref_1 = type.getShortref();
      ppBegin.setValue(((String) _shortref_1));
      EList<BTSPassportEntry> _children_9 = dGroup.getChildren();
      _children_9.add(ppBegin);
    }
    if (((!Objects.equal(type.getGlyphs(), null)) && (type.getGlyphs().length() > 0))) {
      String _glyphs = type.getGlyphs();
      String[] hieros = _glyphs.split("\\s");
      EList<BTSWord> _words = t.getWords();
      BTSWord word = _words.get(0);
      boolean _equals = Objects.equal(word, null);
      if (_equals) {
        BTSWord _createBTSWord = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
        word = _createBTSWord;
        word.setWChar("??");
        EList<BTSWord> _words_1 = t.getWords();
        _words_1.add(word);
      }
      for (final String h : hieros) {
        {
          String string = h;
          if (((string.length() > 1) && StringUtils.isAlpha(string.substring(1, 2)))) {
            String _substring = string.substring(0, 1);
            String _substring_1 = string.substring(1, 2);
            String _lowerCase = StringUtils.lowerCase(_substring_1);
            String _plus_2 = (_substring + _lowerCase);
            String _substring_2 = string.substring(2);
            String _plus_3 = (_plus_2 + _substring_2);
            string = _plus_3;
          }
          BTSGraphic g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
          g.setCode(string);
          EList<BTSGraphic> _graphics = word.getGraphics();
          _graphics.add(g);
        }
      }
    }
    if (((!Objects.equal(type.getPredecessor(), null)) && (type.getPredecessor().length() > 0))) {
      String _predecessor = type.getPredecessor();
      String[] preds = _predecessor.split(",");
      for (final String pred : preds) {
        {
          BTSRelation r = BtsmodelFactory.eINSTANCE.createBTSRelation();
          r.setType("predecessor");
          String objectId = null;
          objectId = pred;
          String _trim = objectId.trim();
          r.setObjectId(_trim);
          EList<BTSRelation> _relations = t.getRelations();
          _relations.add(r);
        }
      }
    }
    if (((!Objects.equal(type.getSuccessor(), null)) && (type.getSuccessor().length() > 0))) {
      String _successor = type.getSuccessor();
      String[] sucs = _successor.split(",");
      for (final String suc : sucs) {
        {
          BTSRelation r = BtsmodelFactory.eINSTANCE.createBTSRelation();
          r.setType("successor");
          String objectId = null;
          boolean _startsWith_1 = suc.startsWith("-");
          if (_startsWith_1) {
            String _replaceFirst_1 = suc.replaceFirst("-", "m");
            String _plus_2 = ("d" + _replaceFirst_1);
            objectId = _plus_2;
          } else {
            objectId = ("d" + suc);
          }
          String _trim = objectId.trim();
          r.setObjectId(_trim);
          EList<BTSRelation> _relations = t.getRelations();
          _relations.add(r);
        }
      }
    }
    return t;
  }
  
  public String replaceCommentGaps(final String string) {
    boolean _equals = Objects.equal(string, null);
    if (_equals) {
      return null;
    }
    Matcher m = this.commentGapPattern.matcher(string);
    String txt = null;
    boolean _find = m.find();
    if (_find) {
      String _group = m.group(1);
      txt = _group;
    }
    String _trim = txt.trim();
    txt = _trim;
    int _length = txt.length();
    boolean _equals_1 = (_length == 0);
    if (_equals_1) {
      return null;
    }
    return txt;
  }
  
  public void processWClassnum(final BwllistType type, final BTSLemmaEntry t) {
    String _wclassnum = type.getWclassnum();
    switch (_wclassnum) {
      case "0":
        t.setType("undefined");
        break;
      case "1000":
        t.setType("substantive");
        break;
      case "1010":
        t.setType("substantive");
        t.setSubtype("substantive_masc");
        break;
      case "1020":
        t.setType("substantive");
        t.setSubtype("substantive_fem");
        break;
      case "2000":
        t.setType("adjective");
        break;
      case "2010":
        t.setType("adjective");
        t.setSubtype("nisbe_adjective_preposition");
        break;
      case "2020":
        t.setType("adjective");
        t.setSubtype("nisbe_adjective_substantive");
        break;
      case "3000":
        t.setType("adverb");
        break;
      case "3010":
        t.setType("adverb");
        t.setSubtype("prepositional_adverb");
        break;
      case "4000":
        t.setType("verb");
        break;
      case "4010":
        t.setType("verb");
        t.setSubtype("verb_2-lit");
        break;
      case "4020":
        t.setType("verb");
        t.setSubtype("verb_caus_2-lit");
        break;
      case "4030":
        t.setType("verb");
        t.setSubtype("verb_2-gem");
        break;
      case "4040":
        t.setType("verb");
        t.setSubtype("verb_caus_2-gem");
        break;
      case "4050":
        t.setType("verb");
        t.setSubtype("verb_3-lit");
        break;
      case "4060":
        t.setType("verb");
        t.setSubtype("verb_caus_3-lit");
        break;
      case "4070":
        t.setType("verb");
        t.setSubtype("verb_3-inf");
        break;
      case "4080":
        t.setType("verb");
        t.setSubtype("verb_caus_3-inf");
        break;
      case "4090":
        t.setType("verb");
        t.setSubtype("verb_irr");
        break;
      case "4100":
        t.setType("verb");
        t.setSubtype("verb_3-gem");
        break;
      case "4110":
        t.setType("verb");
        t.setSubtype("verb_caus_3-gem");
        break;
      case "4120":
        t.setType("verb");
        t.setSubtype("verb_4-inf");
        break;
      case "4130":
        t.setType("verb");
        t.setSubtype("verb_caus_4-inf");
        break;
      case "4140":
        t.setType("verb");
        t.setSubtype("verb_4-lit");
        break;
      case "4150":
        t.setType("verb");
        t.setSubtype("verb_caus_4-lit");
        break;
      case "4160":
        t.setType("verb");
        t.setSubtype("verb_5-inf");
        break;
      case "4170":
        t.setType("verb");
        t.setSubtype("verb_5-lit");
        break;
      case "4180":
        t.setType("verb");
        t.setSubtype("verb_caus_5-lit");
        break;
      case "4190":
        t.setType("verb");
        t.setSubtype("verb_6-lit");
        break;
      case "5000":
        t.setType("preposition");
        break;
      case "6000":
        t.setType("pronoun");
        break;
      case "6010":
        t.setType("pronoun");
        t.setSubtype("demonstrative_pronoun");
        break;
      case "6020":
        t.setType("pronoun");
        t.setSubtype("personal_pronoun");
        break;
      case "6030":
        t.setType("pronoun");
        t.setSubtype("relative_pronoun");
        break;
      case "6040":
        t.setType("pronoun");
        t.setSubtype("interrogative_pronoun");
        break;
      case "7000":
        t.setType("particle");
        break;
      case "7100":
        t.setType("particle");
        t.setSubtype("particle_nonenclitic");
        break;
      case "7200":
        t.setType("particle");
        t.setSubtype("particle_enclitic");
        break;
      case "8000":
        t.setType("numeral");
        break;
      case "8010":
        t.setType("numeral");
        t.setSubtype("cardinal");
        break;
      case "8020":
        t.setType("numeral");
        t.setSubtype("ordinal");
        break;
      case "9000":
        t.setType("interjection");
        break;
      case "10000":
        t.setType("entity_name");
        t.setSubtype("person_name");
        break;
      case "10010":
        t.setType("entity_name");
        t.setSubtype("kings_name");
        break;
      case "10020":
        t.setType("entity_name");
        t.setSubtype("gods_name");
        break;
      case "10030":
        t.setType("entity_name");
        t.setSubtype("animal_name");
        break;
      case "10040":
        t.setType("entity_name");
        t.setSubtype("artifact_name");
        break;
      case "10045":
        t.setType("entity_name");
        t.setSubtype("org_name");
        break;
      case "10050":
        t.setType("entity_name");
        t.setSubtype("place_name");
        break;
      case "10060":
        t.setType("epitheton_title");
        t.setSubtype("epith_god");
        break;
      case "10070":
        t.setType("epitheton_title");
        t.setSubtype("epith_king");
        break;
      case "10080":
        t.setType("epitheton_title");
        t.setSubtype("title");
        break;
      default:
        t.setRevisionState("undefined");
        break;
    }
  }
  
  public String replaceEntities(final String string) {
    return CharsService.replaceEntities(string, true);
  }
  
  public StupidXMLType retrieveStupid(final DocumentRoot root) {
    FeatureMap _mixed = root.getMixed();
    for (final Object o : _mixed) {
      if (((o instanceof FeatureMap.Entry) && (((FeatureMap.Entry) o).getValue() instanceof StupidXMLType))) {
        Object _value = ((FeatureMap.Entry) o).getValue();
        return ((StupidXMLType) _value);
      }
    }
    return null;
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
}
