package org.bbaw.bts.core.corpus.controller.partController;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collection;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.graphics.Image;

import com.google.inject.Injector;

public interface BTSTextEditorController {
	boolean save(BTSText text);
	void updateBTSWordFromMdCString(BTSWord word, String mdc, EditingDomain editingDomain);
	String transformTextToJSeshMdCString(BTSText text);

	String transformWordToMdCString(BTSWord word, int selectedGlypheIndex);
	String[] splitSignsKeepDelimeters(String mdC);
	String insertMarkerBehindSingleCode(String mdcString, String marker);
	
    List<BTSObject> queryReferences(BTSIdentifiableItem item, IProgressMonitor monitor);
	HashMap<String, List<BTSInterTextReference>> fillRelatingObjectsMap(List<BTSObject> relatingObjects);
	BTSText createNewText(BTSCorpusObject parentObject);
	
	Image transformToSWT(BufferedImage bufferedImage);
	BufferedImage getImageData(String topItemList) throws Exception;
	BufferedImage getImageData(String topItemList, int height, int width) throws Exception;
	
	boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts);
	boolean testTextValidAgainstGrammar(BTSTextContent textContent, BTSObject object);
	int[] checkTextCompleteness(BTSText text);

	Injector findEgyDslInjector();

	BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor);
	List<BTSText> listAllTexts(IProgressMonitor monitor);
	List<BTSText> listInAllInvalidTexts(IProgressMonitor monitor);
	List<BTSText> listInAllInCompleteTexts(IProgressMonitor monitor);

    /* TODO consolidate this crap to something overloaded */
	BTSSentenceItem copySentenceItem(BTSSentenceItem item);
	Collection<BTSSentenceItem> copySentenceItems(Collection<BTSSentenceItem> items);
	BTSSenctence copySentence(BTSSenctence item);
    Collection<BTSSenctence> copySentences(Collection<BTSSenctence> sents);
}
