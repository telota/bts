package org.bbaw.bts.ui.egy.parts.lemmatizer;

import java.text.ParseException;
import java.text.RuleBasedCollator;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class BTSLemmatizerEgyObjectByNameViewerSorter extends ViewerComparator {
	private RuleBasedCollator egyCollator;
	private AlphanumComparator alphaNumComp;
	private String wordChars;
	
	public BTSLemmatizerEgyObjectByNameViewerSorter(){
		try {
			egyCollator =  new RuleBasedCollator(BTSEGYUIConstants.EGY_COLLATOR_RULE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		alphaNumComp = new AlphanumComparator(egyCollator);
	}

	public boolean thisOrAnyDescendentsStartWithPrefix(TreeNodeWrapper node) {
		if (node.getLabel().toLowerCase().startsWith(wordChars)) {
			return true;
		} else {
			for (TreeNodeWrapper child : node.getChildren()) {
				if (this.thisOrAnyDescendentsStartWithPrefix(child)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		String s1 = null;
		String s2 = null;
		if (e1 instanceof TreeNodeWrapper && e2 instanceof TreeNodeWrapper) {

			TreeNodeWrapper t1 = (TreeNodeWrapper) e1;
			TreeNodeWrapper t2 = (TreeNodeWrapper) e2;

			boolean vip1 = this.thisOrAnyDescendentsStartWithPrefix(t1);
			boolean vip2 = this.thisOrAnyDescendentsStartWithPrefix(t2);
			
			if (vip1) {
				if (vip2) {
					return alphaNumComp.compare(t1.getLabel(), t2.getLabel());
				} else {
					return -1;
				}
			} else {
				if (vip2) {
					return 1;
				} else {
					return alphaNumComp.compare(t1.getLabel(), t2.getLabel());
				}
			}
			
			/*if (t1.getObject() != null && t1.getObject() instanceof BTSObject) {
				s1 = ((BTSObject) t1.getObject()).getName().toLowerCase();
			} else {
				s1 = t1.getLabel().toLowerCase();
			}
			
			if (t2.getObject() != null && t2.getObject() instanceof BTSObject) {
				s2 = ((BTSObject) t2.getObject()).getName().toLowerCase();
			} else {
				s2 = t2.getLabel().toLowerCase();
			}
			if (t1.getLabel() != null) {
				// XXX ???
			}
			if (t2.getLabel() != null) { // XXX ???
				s2 = t2.getLabel().toLowerCase();
			}*/

		} else if (e1 instanceof BTSObject && e2 instanceof BTSObject) {
			BTSObject b1 = (BTSObject) e1;
			BTSObject b2 = (BTSObject) e2;
			if (b1.getName() != null) {
				s1 = b1.getName().toLowerCase();
			}
			if (b2.getName() != null) {
				s2 = b2.getName().toLowerCase();
			}

		}
		
		// sort _Orphans node in tree at bottom 
		if (BTSConstants.ORPHANS_NODE_LABEL.equals(s1)) return 1;
		else if (BTSConstants.ORPHANS_NODE_LABEL.equals(s2)) return -1;
		
		if (s1 != null) {
			if (s2 != null) {
				if (wordChars != null)
				{
					if (s1.startsWith(wordChars.toLowerCase()) && s2.startsWith(wordChars.toLowerCase()))
					{
						return alphaNumComp.compare(s1, s2);
					}
					else if (s1.startsWith(wordChars.toLowerCase()))
					{
						return -1;
					}
					else if (s2.startsWith(wordChars.toLowerCase()))
					{
						return 1;
					}
				}
				return alphaNumComp.compare(s1, s2);
			} else
				return -1;
		}
		if (e1 instanceof BTSObject && e2 instanceof BTSObject)
			return ((BTSObject)e1).get_id().compareTo(((BTSObject)e2).get_id());
		return 0;
	}


	public void setLemmatizerWordChar(String wordChars) {
		if (wordChars != null) {
			this.wordChars = wordChars.toLowerCase();
		}
	}
}
