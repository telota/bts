package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;

public class BTSObjectByNameComparator implements Comparator<BTSObject>{

	@Override
	public int compare(BTSObject arg0, BTSObject o1) {
		if (arg0 != null && arg0.getName() != null && o1 != null && o1.getName() != null)
		{
			return arg0.getName().compareTo(o1.getName());
		}
		return 0;
	}

}