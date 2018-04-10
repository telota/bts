package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;

public class BTSLinkageAnnotation extends BTSModelAnnotation
{
    public BTSLinkageAnnotation(BTSIdentifiableItem item) {
        super(BTSModelAnnotation.TOKEN, item);
    }
}
