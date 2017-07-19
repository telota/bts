package org.bbaw.bts.core.corpus.controller.partController;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
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

    void transformToDocument(BTSTextContent textContent, Document doc, IAnnotationModel model,
                             List<BTSObject> relatingObjects, Map<String, List<BTSInterTextReference>> relatingObjectsMap,
                             Map<String, List<Object>> lemmaAnnotationMap, IProgressMonitor monitor, int lineLength);

//	BTSText updateTextFromDocument(BTSText text, Document document, IAnnotationModel annotationModel,
//			TextViewer textViewer);

    boolean save(BTSText text);

    // TextModel transformToRamsesTextModel(BTSText text, TextModel textModel,
    // Map<Object, BTSSentenceItem> ramsesTextModelMap);

    // BTSText updateTextFromRamsesModel(BTSText text, TextModel textModel,
    // Map<Object, BTSSentenceItem> ramsesTextModelMap);

    String transformWordToMdCString(BTSWord word, int selectedGlypheIndex);

    void updateBTSWordFromMdCString(BTSWord word, String mdc,
                                    EditingDomain editingDomain);

    String transformTextToJSeshMdCString(BTSText text);

    String[] splitSignsKeepDelimeters(String mdC);

    String insertMarkerBehindSingleCode(String mdcString, String marker);

    List<BTSObject> getRelatingObjects(BTSText text, IProgressMonitor monitor);

    BTSText createNewText(BTSCorpusObject parentObject);

    Image transformToSWT(BufferedImage bufferedImage);

    BufferedImage getImageData(String topItemList) throws Exception;

    BufferedImage getImageData(String topItemList, int height, int width) throws Exception;

    HashMap<String, List<BTSInterTextReference>> fillRelatingObjectsMap(List<BTSObject> relatingObjects);

    BTSTextContent updateModelFromTextContent(BTSTextContent textContent,
                                              EObject eo, IAnnotationModel am);

    BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor);

    boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts);

    boolean testTextValidAgainstGrammar(BTSTextContent textContent, BTSObject object);

    Injector findEgyDslInjector();


    List<BTSText> listAllTexts(IProgressMonitor monitor);

    List<BTSText> listInAllInvalidTexts(IProgressMonitor monitor);

    int[] checkTextCompleteness(BTSText text);

    List<BTSText> listInAllInCompleteTexts(IProgressMonitor monitor);

    BTSSentenceItem copySentenceItem(BTSSentenceItem copyItem);

    BTSSenctence copySentence(BTSSenctence copyItem);
}
