package bts.transform.ui.xtend;

import Btsaux.AuthorsType;
import Btsaux.DocumentRoot;
import Btsaux.StupidXMLType;
import bts.transform.ui.chars.CharsService;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.inject.Inject;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

@SuppressWarnings("all")
public class Authors2BTSTransform {
  @Inject
  private IDService idService;
  
  @Inject
  private BTSUserService userService;
  
  @Inject
  private BTSUserGroupService userGroupService;
  
  private final String[] groupNames = { "Berlin-Brandenburgische Akademie der Wissenschaften", "Sächsische Akademie der Wissenschaften", "Demotische Textdatenbank, Akademie der Wissenschaften Mainz", "Totenbuch-Projekt, Ägyptologisches Seminar der Universität Bonn", "Projekt Digital Heka, Univ. Leipzig", "Coffin Texts Textcorpus, Univ. Tübingen", "DAI Abt. Kairo", "Material aus privaten Forschungsprojekten", "Leuven Online Index of Ptolemaic and Roman Hieroglyphic Texts", "Edfu-Projekt / Akademie der Wissenschaften zu Göttingen", "Leibniz Projekt \"Späthieratische Ritualpapyri aus Tebtynis\"" };
  
  private final Map<String, BTSUserGroup> map = new HashMap<String, BTSUserGroup>();
  
  public List<BTSUserGroup> getGroups() {
    final List<BTSUserGroup> gs = new Vector<BTSUserGroup>();
    Collection<BTSUserGroup> _values = this.map.values();
    for (final BTSUserGroup g : _values) {
      gs.add(g);
    }
    return gs;
  }
  
  public List<BTSUser> transform(final DocumentRoot root) {
    List<BTSUser> users = new Vector<BTSUser>();
    StupidXMLType stupid = this.retrieveStupid(root);
    this.makeUserGroups(this.userGroupService);
    EList<AuthorsType> _authors = stupid.getAuthors();
    for (final AuthorsType a : _authors) {
      {
        BTSUser u = this.makeUser(a, this.userService);
        users.add(u);
      }
    }
    return users;
  }
  
  public void makeUserGroups(final BTSUserGroupService userGroupService) {
    int i = 0;
    for (final String gName : this.groupNames) {
      {
        final BTSUserGroup ug = userGroupService.createNew();
        ug.setName(gName);
        Integer _integer = new Integer((i + 1));
        String _string = _integer.toString();
        this.map.put(_string, ug);
        final BTSExternalReference ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference();
        ref.setType("aaew_1");
        Integer _integer_1 = new Integer((i + 1));
        String _string_1 = _integer_1.toString();
        ref.setReference(_string_1);
        EList<BTSExternalReference> _externalReferences = ug.getExternalReferences();
        _externalReferences.add(ref);
        i = (i + 1);
      }
    }
  }
  
  public BTSUser makeUser(final AuthorsType a, final BTSUserService userService) {
    final BTSExternalReference ref = BtsmodelFactory.eINSTANCE.createBTSExternalReference();
    BTSUser u = userService.createNew();
    ref.setType("aaew_1");
    String _auct = a.getAuct();
    ref.setReference(_auct);
    EList<BTSExternalReference> _externalReferences = u.getExternalReferences();
    _externalReferences.add(ref);
    Object _sigle = a.getSigle();
    u.setSigle(((String) _sigle));
    Object _weblink = a.getWeblink();
    u.setWebURL(((String) _weblink));
    Object _page = a.getPage();
    String _replaceEntities = this.replaceEntities(((String) _page));
    u.setWebDescription(_replaceEntities);
    Object _comment = a.getComment();
    String _replaceEntities_1 = this.replaceEntities(((String) _comment));
    u.setComment(_replaceEntities_1);
    Object _line = a.getLine();
    String name = ((String) _line);
    String[] _split = name.split(",");
    String _get = _split[0];
    name = _get;
    u.setName(name);
    boolean _contains = name.contains(" ");
    if (_contains) {
      String[] _split_1 = name.split(" ");
      String sn = _split_1[1];
      System.out.println(("sn " + sn));
      u.setSureName(sn);
      String[] _split_2 = name.split(" ");
      String fn = _split_2[0];
      String _replace = fn.replace(".", "");
      fn = _replace;
      u.setForeName(fn);
    }
    String _webDescription = u.getWebDescription();
    boolean _contains_1 = _webDescription.contains("Kontakt:");
    if (_contains_1) {
      String _webDescription_1 = u.getWebDescription();
      String[] _split_3 = _webDescription_1.split("Kontakt:");
      String email = _split_3[1];
      System.out.println(("email: " + email));
      String _trim = email.trim();
      u.setMail(_trim);
    }
    String userName = a.getLoginname();
    System.out.println(("userName: " + userName));
    u.setUserName(userName);
    String _pword = a.getPword();
    u.setPassword(_pword);
    String _augp = a.getAugp();
    final BTSUserGroup ug = this.map.get(_augp);
    System.out.println(ug);
    boolean _notEquals = (!Objects.equal(ug, null));
    if (_notEquals) {
      EList<String> _groupIds = u.getGroupIds();
      String __id = ug.get_id();
      _groupIds.add(__id);
    }
    return u;
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
}
