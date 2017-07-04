package bts.transform.ui.xtend;

import Btsaux.DocumentRoot;
import Btsaux.StupidXMLType;
import Btsaux.ThsdataType;
import bts.transform.ui.chars.CharsService;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.inject.Inject;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

@SuppressWarnings("all")
public class Ths2BTSTransform {
  @Inject
  private IDService idService;
  
  @Inject
  private BTSThsEntryService thsService;
  
  private Map<String, BTSThsEntry> map = new HashMap<String, BTSThsEntry>();
  
  private Map<String, String> idmap = new HashMap<String, String>();
  
  private Map<String, BTSThsEntry> rootmap = new HashMap<String, BTSThsEntry>();
  
  private final String[] rootNames = { "null", "2 = Aufbewahrungsorte, Museen", "3 = Fundstellen", "4 = Sprachen", "5 = Schriftformen", "null", "null", "null", "9 = Datierungen", "10 = Themen, Schlagwörter", "11 = Textsorten", "null", "null", "null", "null", "null", "null", "null", "null", "null", "21 = Objekttyp", "22 = Komponente", "23 = Akteur", "24 = Material", "25 = Kontext", "26 = Modell", "27 = Imitation", "28 = Miniatur", "29 = Skeuomorph", "30 = Abschrift" };
  
  public List<BTSThsEntry> transform(final DocumentRoot root) {
    List<BTSThsEntry> thss = new Vector<BTSThsEntry>();
    StupidXMLType stupid = this.retrieveStupid(root);
    this.makeRoots();
    Collection<BTSThsEntry> _values = this.rootmap.values();
    for (final BTSThsEntry r : _values) {
      String _name = r.getName();
      boolean _notEquals = (!Objects.equal(_name, "null"));
      if (_notEquals) {
        thss.add(r);
      }
    }
    EList<ThsdataType> _thsdata = stupid.getThsdata();
    for (final ThsdataType o : _thsdata) {
      {
        BTSThsEntry t = this.makeThs(o, this.thsService);
        String __id = t.get_id();
        this.map.put(__id, t);
        thss.add(t);
      }
    }
    for (final BTSThsEntry t : thss) {
      EList<BTSRelation> _relations = t.getRelations();
      boolean _isEmpty = _relations.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<BTSRelation> _relations_1 = t.getRelations();
        for (final BTSRelation r_1 : _relations_1) {
          String _type = r_1.getType();
          boolean _equals = Objects.equal(_type, "owner");
          if (_equals) {
            String _objectId = r_1.getObjectId();
            String _get = this.idmap.get(_objectId);
            boolean _notEquals_1 = (!Objects.equal(_get, null));
            if (_notEquals_1) {
              String _objectId_1 = r_1.getObjectId();
              String _get_1 = this.idmap.get(_objectId_1);
              r_1.setObjectId(_get_1);
              r_1.setType("partOf");
            }
          }
        }
      }
    }
    return thss;
  }
  
  public BTSThsEntry makeThs(final ThsdataType type, final BTSThsEntryService service) {
    BTSThsEntry t = service.createNew();
    Object _term = type.getTerm();
    String _replaceEntities = this.replaceEntities(((String) _term));
    t.setName(_replaceEntities);
    t.setRevisionState("published");
    t.setVisibility("public");
    String _thstype = type.getThstype();
    String thstype = ((String) _thstype);
    boolean _equals = Objects.equal(thstype, "2");
    if (_equals) {
      System.out.println(("thstype " + thstype));
      t.setType("location");
    } else {
      boolean _equals_1 = Objects.equal(thstype, "3");
      if (_equals_1) {
        System.out.println(("thstype " + thstype));
        t.setType("findSpot");
      } else {
        boolean _equals_2 = Objects.equal(thstype, "4");
        if (_equals_2) {
          System.out.println(("thstype " + thstype));
          t.setType("language");
        } else {
          boolean _equals_3 = Objects.equal(thstype, "5");
          if (_equals_3) {
            System.out.println(("thstype " + thstype));
            t.setType("script");
          } else {
            boolean _equals_4 = Objects.equal(thstype, "7");
            if (_equals_4) {
              System.out.println(("thstype " + thstype));
              t.setType("objectType");
            } else {
              boolean _equals_5 = Objects.equal(thstype, "9");
              if (_equals_5) {
                System.out.println(("thstype " + thstype));
                t.setType("date");
              } else {
                boolean _equals_6 = Objects.equal(thstype, "10");
                if (_equals_6) {
                  System.out.println(("thstype " + thstype));
                  t.setType("subjects");
                } else {
                  boolean _equals_7 = Objects.equal(thstype, "11");
                  if (_equals_7) {
                    System.out.println(("thstype " + thstype));
                    t.setType("textType");
                  } else {
                    boolean _equals_8 = Objects.equal(thstype, "21");
                    if (_equals_8) {
                      System.out.println(("thstype " + thstype));
                      t.setType("objecttype");
                    } else {
                      boolean _equals_9 = Objects.equal(thstype, "22");
                      if (_equals_9) {
                        System.out.println(("thstype " + thstype));
                        t.setType("component");
                      } else {
                        boolean _equals_10 = Objects.equal(thstype, "23");
                        if (_equals_10) {
                          System.out.println(("thstype " + thstype));
                          t.setType("actor");
                        } else {
                          boolean _equals_11 = Objects.equal(thstype, "24");
                          if (_equals_11) {
                            System.out.println(("thstype " + thstype));
                            t.setType("material");
                          } else {
                            boolean _equals_12 = Objects.equal(thstype, "25");
                            if (_equals_12) {
                              System.out.println(("thstype " + thstype));
                              t.setType("context");
                            } else {
                              boolean _equals_13 = Objects.equal(thstype, "26");
                              if (_equals_13) {
                                System.out.println(("thstype " + thstype));
                                t.setType("model");
                              } else {
                                boolean _equals_14 = Objects.equal(thstype, "27");
                                if (_equals_14) {
                                  System.out.println(("thstype " + thstype));
                                  t.setType("imitation");
                                } else {
                                  boolean _equals_15 = Objects.equal(thstype, "28");
                                  if (_equals_15) {
                                    System.out.println(("thstype " + thstype));
                                    t.setType("miniature");
                                  } else {
                                    boolean _equals_16 = Objects.equal(thstype, "29");
                                    if (_equals_16) {
                                      System.out.println(("thstype " + thstype));
                                      t.setType("skeuomorph");
                                    } else {
                                      boolean _equals_17 = Objects.equal(thstype, "30");
                                      if (_equals_17) {
                                        System.out.println(("thstype " + thstype));
                                        t.setType("copy");
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
    final BTSExternalReference ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference();
    ref.setType("aaew_1");
    String _thsct = type.getThsct();
    String _plus = ((thstype + "/") + _thsct);
    ref.setReference(_plus);
    EList<BTSExternalReference> _externalReferences = t.getExternalReferences();
    _externalReferences.add(ref);
    String _reference = ref.getReference();
    String __id = t.get_id();
    this.idmap.put(_reference, __id);
    final BTSPassport passport = BtsCorpusModelFactory.eINSTANCE.createBTSPassport();
    final BTSPassportEntryGroup pGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
    t.setPassport(passport);
    EList<BTSPassportEntry> _children = passport.getChildren();
    _children.add(pGroup);
    pGroup.setType("thesaurus");
    final BTSPassportEntryGroup mainGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
    mainGroup.setType("main_group");
    EList<BTSPassportEntry> _children_1 = pGroup.getChildren();
    _children_1.add(mainGroup);
    final BTSPassportEntryItem ppEntryOldType = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppEntryOldType.setType("old_thesaurus_number");
    ppEntryOldType.setValue(thstype);
    EList<BTSPassportEntry> _children_2 = mainGroup.getChildren();
    _children_2.add(ppEntryOldType);
    final BTSPassportEntryItem ppEntryOldId = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppEntryOldId.setType("old_id");
    String _thsct_1 = type.getThsct();
    ppEntryOldId.setValue(_thsct_1);
    EList<BTSPassportEntry> _children_3 = mainGroup.getChildren();
    _children_3.add(ppEntryOldId);
    final BTSPassportEntryItem ppTermSort = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
    ppTermSort.setType("termsort");
    Object _termsort = type.getTermsort();
    String _replaceEntities_1 = this.replaceEntities(((String) _termsort));
    ppTermSort.setValue(_replaceEntities_1);
    EList<BTSPassportEntry> _children_4 = mainGroup.getChildren();
    _children_4.add(ppTermSort);
    String _yearfrom = type.getYearfrom();
    boolean _notEquals = (!Objects.equal(_yearfrom, Integer.valueOf(0)));
    if (_notEquals) {
      final BTSPassportEntryGroup dGroup = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
      EList<BTSPassportEntry> _children_5 = passport.getChildren();
      _children_5.add(dGroup);
      dGroup.setType("thesaurus_date");
      final BTSPassportEntryGroup mainGroup2 = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
      mainGroup2.setType("main_group");
      EList<BTSPassportEntry> _children_6 = dGroup.getChildren();
      _children_6.add(mainGroup2);
      final BTSPassportEntryItem ppBegin = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
      ppBegin.setType("beginning");
      String _yearfrom_1 = type.getYearfrom();
      ppBegin.setValue(_yearfrom_1);
      EList<BTSPassportEntry> _children_7 = mainGroup2.getChildren();
      _children_7.add(ppBegin);
      final BTSPassportEntryItem ppEnd = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
      ppEnd.setType("end");
      String _yearto = type.getYearto();
      ppEnd.setValue(_yearto);
      EList<BTSPassportEntry> _children_8 = mainGroup2.getChildren();
      _children_8.add(ppEnd);
    }
    if (((!Objects.equal(type.getThsowner(), null)) && (!Objects.equal(type.getThsowner(), "0")))) {
      final BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
      rel.setType("owner");
      String _thsowner = type.getThsowner();
      String _plus_1 = ((thstype + "/") + _thsowner);
      rel.setObjectId(_plus_1);
      EList<BTSRelation> _relations = t.getRelations();
      _relations.add(rel);
    } else {
      boolean _containsKey = this.rootmap.containsKey(thstype);
      if (_containsKey) {
        BTSThsEntry parent = this.rootmap.get(thstype);
        final BTSRelation rel_1 = BtsmodelFactory.eINSTANCE.createBTSRelation();
        rel_1.setType("partOf");
        String __id_1 = parent.get_id();
        rel_1.setObjectId(__id_1);
        EList<BTSRelation> _relations_1 = t.getRelations();
        _relations_1.add(rel_1);
      }
    }
    return t;
  }
  
  public String replaceEntities(final String string) {
    return CharsService.replaceEntities(string, true);
  }
  
  public void makeRoots() {
    int i = 0;
    for (final String rName : this.rootNames) {
      {
        final BTSThsEntry root = this.thsService.createNew();
        root.setRevisionState("published");
        root.setName(rName);
        String _rootType = this.getRootType(rName);
        root.setType(_rootType);
        Integer _integer = new Integer((i + 1));
        String _string = _integer.toString();
        this.rootmap.put(_string, root);
        final BTSExternalReference ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference();
        ref.setType("aaew_1");
        Integer _integer_1 = new Integer((i + 1));
        String _string_1 = _integer_1.toString();
        String _plus = (_string_1 + "/0");
        ref.setReference(_plus);
        EList<BTSExternalReference> _externalReferences = root.getExternalReferences();
        _externalReferences.add(ref);
        i = (i + 1);
      }
    }
  }
  
  public String getRootType(final String rootName) {
    String _xblockexpression = null;
    {
      String type = null;
      String _xifexpression = null;
      boolean _startsWith = rootName.startsWith("2");
      if (_startsWith) {
        _xifexpression = type = "location";
      } else {
        String _xifexpression_1 = null;
        boolean _startsWith_1 = rootName.startsWith("3");
        if (_startsWith_1) {
          _xifexpression_1 = type = "findSpot";
        } else {
          String _xifexpression_2 = null;
          boolean _startsWith_2 = rootName.startsWith("4");
          if (_startsWith_2) {
            _xifexpression_2 = type = "language";
          } else {
            String _xifexpression_3 = null;
            boolean _startsWith_3 = rootName.startsWith("5");
            if (_startsWith_3) {
              _xifexpression_3 = type = "script";
            } else {
              String _xifexpression_4 = null;
              boolean _startsWith_4 = rootName.startsWith("7");
              if (_startsWith_4) {
                _xifexpression_4 = type = "objectType";
              } else {
                String _xifexpression_5 = null;
                boolean _startsWith_5 = rootName.startsWith("9");
                if (_startsWith_5) {
                  _xifexpression_5 = type = "date";
                } else {
                  String _xifexpression_6 = null;
                  boolean _startsWith_6 = rootName.startsWith("10");
                  if (_startsWith_6) {
                    _xifexpression_6 = type = "subjects";
                  } else {
                    String _xifexpression_7 = null;
                    boolean _startsWith_7 = rootName.startsWith("11");
                    if (_startsWith_7) {
                      _xifexpression_7 = type = "textType";
                    } else {
                      String _xifexpression_8 = null;
                      boolean _startsWith_8 = rootName.startsWith("21");
                      if (_startsWith_8) {
                        _xifexpression_8 = type = "objecttype";
                      } else {
                        String _xifexpression_9 = null;
                        boolean _startsWith_9 = rootName.startsWith("22");
                        if (_startsWith_9) {
                          _xifexpression_9 = type = "component";
                        } else {
                          String _xifexpression_10 = null;
                          boolean _startsWith_10 = rootName.startsWith("23");
                          if (_startsWith_10) {
                            _xifexpression_10 = type = "actor";
                          } else {
                            String _xifexpression_11 = null;
                            boolean _startsWith_11 = rootName.startsWith("24");
                            if (_startsWith_11) {
                              _xifexpression_11 = type = "material";
                            } else {
                              String _xifexpression_12 = null;
                              boolean _startsWith_12 = rootName.startsWith("25");
                              if (_startsWith_12) {
                                _xifexpression_12 = type = "context";
                              } else {
                                String _xifexpression_13 = null;
                                boolean _startsWith_13 = rootName.startsWith("26");
                                if (_startsWith_13) {
                                  _xifexpression_13 = type = "model";
                                } else {
                                  String _xifexpression_14 = null;
                                  boolean _startsWith_14 = rootName.startsWith("27");
                                  if (_startsWith_14) {
                                    _xifexpression_14 = type = "imitation";
                                  } else {
                                    String _xifexpression_15 = null;
                                    boolean _startsWith_15 = rootName.startsWith("28");
                                    if (_startsWith_15) {
                                      _xifexpression_15 = type = "miniature";
                                    } else {
                                      String _xifexpression_16 = null;
                                      boolean _startsWith_16 = rootName.startsWith("29");
                                      if (_startsWith_16) {
                                        _xifexpression_16 = type = "skeuomorph";
                                      } else {
                                        String _xifexpression_17 = null;
                                        boolean _startsWith_17 = rootName.startsWith("30");
                                        if (_startsWith_17) {
                                          _xifexpression_17 = type = "copy";
                                        }
                                        _xifexpression_16 = _xifexpression_17;
                                      }
                                      _xifexpression_15 = _xifexpression_16;
                                    }
                                    _xifexpression_14 = _xifexpression_15;
                                  }
                                  _xifexpression_13 = _xifexpression_14;
                                }
                                _xifexpression_12 = _xifexpression_13;
                              }
                              _xifexpression_11 = _xifexpression_12;
                            }
                            _xifexpression_10 = _xifexpression_11;
                          }
                          _xifexpression_9 = _xifexpression_10;
                        }
                        _xifexpression_8 = _xifexpression_9;
                      }
                      _xifexpression_7 = _xifexpression_8;
                    }
                    _xifexpression_6 = _xifexpression_7;
                  }
                  _xifexpression_5 = _xifexpression_6;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
}
