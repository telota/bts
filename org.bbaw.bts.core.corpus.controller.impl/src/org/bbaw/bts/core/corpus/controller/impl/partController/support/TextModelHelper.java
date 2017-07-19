package org.bbaw.bts.core.corpus.controller.impl.partController.support;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpandedMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Case;
import org.bbaw.bts.corpus.text.egy.egyDsl.DeletedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DestructionMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.DisputableVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.EmendationVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Marker;
import org.bbaw.bts.corpus.text.egy.egyDsl.MissingVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestroyedVersMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.RasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasurMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Sentence;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextItem;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker;
import org.bbaw.bts.corpus.text.egy.egyDsl.Word;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class TextModelHelper {

    private final static Pattern lemmaPattern = Pattern.compile("(?:case\\s+)([^:]+)(?::\\s*)");
    private final static Pattern destructionMarkerPattern = Pattern.compile("--([^-]+)--");

    public BTSTextContent updateModelFromTextContent(BTSTextContent textContent, EObject eo,
                                                     IAnnotationModel am) {
        Map<Position, List<Annotation>> annotationMap = null;
        if (am != null) {
            annotationMap = loadAnnotationMapping(eo, am);
        }
        if (textContent == null) {
            textContent = BtsCorpusModelFactory.eINSTANCE
                    .createBTSTextContent();
        } else {
            textContent.getTextItems().clear();
        }

        if (eo instanceof TextContent) {
            TextContent tc = (TextContent) eo;
            BTSSenctence lastModelSentence = null;
            int counter = 0;
            for (TextItem item : tc.getItems()) {
                if (item instanceof Sentence) {

                    // workaround: if one enters only one sentence, xtext adds a second one without items
                    // this is probably caused by grammer.
                    if (counter == tc.getItems().size() - 1 && ((Sentence) item).getItems().isEmpty()) {
                        continue;
                    }
                    Sentence sentence = (Sentence) item;
                    BTSSenctence modelSentence = null;
                    INode node = NodeModelUtils.getNode(sentence);

                    BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSSenctence.class, annotationMap);
                    if (ma != null) {
                        modelSentence = (BTSSenctence) ma.getModel();
                    }
                    if (modelSentence == null) {
                        if (((Sentence) item).getItems().isEmpty()) {
//							sentence actually empty
                            continue;
                        }
                        modelSentence = makeNewModelSentence(sentence,
                                lastModelSentence, textContent);
                    } else {
                        modelSentence.getSentenceItems().clear();
                    }
                    // add model sentence to btstextcontent
                    if (lastModelSentence != null) {
                        int lastIndex = textContent.getTextItems()
                                .indexOf(lastModelSentence);
                        try {
                            textContent.getTextItems()
                                    .add(lastIndex + 1, modelSentence);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    } else {
                        textContent.getTextItems()
                                .add(0, modelSentence);
                    }
                    BTSIdentifiableItem lastItem = null;
//					EList<BTSSentenceItem> oldSentenceItems = modelSentence
//							.getSentenceItems();

                    for (SentenceItem si : sentence.getItems()) {

                        lastItem = updateItemFromTextContent(si, lastItem,
                                sentence,
                                modelSentence, annotationMap);
                    }
                    lastModelSentence = modelSentence;
                }
                counter++;
            }
        }
        return textContent;

    }

    private <E> BTSModelAnnotation getModelAnnotationFromMap(INode node,
                                                             Class<E> clazz, Map<Position, List<Annotation>> annotationMap) {
        List<Annotation> list = null;
        int offset = node.getOffset();
        Position pos = null;
        if (annotationMap != null && node != null) {
            pos = new Position(offset, node.getLength());
            list = annotationMap
                    .get(pos);
        }
        if (list == null) {
            if (node.getSemanticElement() instanceof Marker) {
                // cut away Marker beginnings and endings
                list = annotationMap
                        .get(new Position(offset + 1, node
                                .getLength() - 1));
            }
            // look around if annotation before or after supposed position
            else if (offset > 0)
                list = annotationMap
                        .get(new Position(offset - 1, node
                                .getLength()));
            else {
                list = annotationMap
                        .get(new Position(offset + 1, node
                                .getLength()));
            }
        }
        if (list == null) {
            try {
                System.out.println("no cached model found for node, node chars: " + node.getText() + "; pos offset " + pos.getOffset() + " len " + pos.getLength());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        for (Annotation an : list) {
            if (an instanceof BTSModelAnnotation && clazz.isInstance(((BTSModelAnnotation) an).getModel())) {
                return (BTSModelAnnotation) an;
            }
        }
        return null;
    }

    private BTSSenctence makeNewModelSentence(Sentence sentence,
                                              BTSSenctence lastModelSentence, BTSTextContent textContent) {

        return BtsCorpusModelFactory.eINSTANCE
                .createBTSSenctence();
    }

    private BTSIdentifiableItem updateItemFromTextContent(SentenceItem si,
                                                          BTSIdentifiableItem lastItem, Sentence sentence,
                                                          BTSSenctence modelSentence, Map<Position, List<Annotation>> annotationMap) {
        if (si instanceof Word) {
            return updateWordFromTextContent((Word) si, lastItem, sentence,
                    modelSentence, annotationMap);
        } else if (si instanceof AbstractMarker) {
            return updateMarkerFromTextContent((AbstractMarker) si, lastItem,
                    sentence,
                    modelSentence, annotationMap);
        } else if (si instanceof Ambivalence) {
            return updateAmbivalenceFromTextContent((Ambivalence) si, lastItem,
                    sentence,
                    modelSentence, annotationMap);
        }
        return null;

    }

    private BTSIdentifiableItem updateAmbivalenceFromTextContent(
            Ambivalence ambivalence, BTSIdentifiableItem lastItem,
            Sentence sentence,
            BTSSenctence modelSentence, Map<Position, List<Annotation>> annotationMap) {
        BTSAmbivalence modelAmbivalence = null;
        INode node = NodeModelUtils.getNode(ambivalence);
        BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSAmbivalence.class, annotationMap);
        if (ma != null && ma.getModel() instanceof BTSAmbivalence) {
            modelAmbivalence = (BTSAmbivalence) ma.getModel();
        }
        if (modelAmbivalence == null) {
            modelAmbivalence = makeNewModelAmbivalence(ambivalence, lastItem,
                    modelSentence);
        }
        // add modelMarker to btsSentence
        if (lastItem != null) {
            int lastIndex = modelSentence.getSentenceItems().indexOf(lastItem);
            modelSentence.getSentenceItems().add(lastIndex + 1,
                    modelAmbivalence);
        } else {
            modelSentence.getSentenceItems().add(0, modelAmbivalence);
        }
        EList<BTSLemmaCase> oldLemmaCases = modelAmbivalence.getCases();
        modelAmbivalence.getCases().clear();
        BTSLemmaCase lastModelCase = null;
        for (Case item : ambivalence.getCases()) {
            BTSLemmaCase modelCase = null;
            INode nodeCase = NodeModelUtils.getNode(item);
            BTSModelAnnotation maCase = getModelAnnotationFromMap(nodeCase, BTSLemmaCase.class, annotationMap);
            if (maCase != null) {
                modelCase = (BTSLemmaCase) maCase.getModel();
            }
            if (modelCase == null) {
                modelCase = makeNewModelCase(ambivalence, lastModelCase);
            }
            // add model case to ambivalence
            if (lastModelCase != null) {
                int lastIndex = modelAmbivalence.getCases().indexOf(
                        lastModelCase);
                modelAmbivalence.getCases().add(lastIndex + 1, modelCase);
            } else {
                modelAmbivalence.getCases().add(0, modelCase);
            }
            modelCase.setName(extractLemmaCaseName(item.getName()));
            BTSAmbivalenceItem lastAmbivalenceItem = null;
            EList<BTSAmbivalenceItem> oldAmbivalenceItems = modelCase
                    .getScenario();
            modelCase.getScenario().clear();
            for (SentenceItemNoAmbivalence ai : item.getItems()) {

                lastAmbivalenceItem = updateAmbivalenceItemFromTextContent(ai,
                        lastAmbivalenceItem, item, modelCase, annotationMap);
            }
            lastModelCase = modelCase;

        }
        return modelAmbivalence;

    }

    private String extractLemmaCaseName(String name) {
        Matcher m = lemmaPattern.matcher(name.trim());
        if (m.matches()) {
            return m.group(1);
        }
        return name.trim();
    }

    private BTSAmbivalenceItem updateAmbivalenceItemFromTextContent(
            SentenceItemNoAmbivalence ai,
            BTSAmbivalenceItem lastAmbivalenceItem,
            Case item, BTSLemmaCase modelCase, Map<Position, List<Annotation>> annotationMap) {
        if (ai instanceof Word) {
            return updateWordFromTextAmbivalence((Word) ai,
                    lastAmbivalenceItem, item, modelCase, annotationMap);
        } else if (ai instanceof Marker) {
            return updateMarkerFromTextAmbivalence((Marker) ai,
                    lastAmbivalenceItem, item, modelCase, annotationMap);
        }
        return null;
    }

    private BTSAmbivalenceItem updateMarkerFromTextAmbivalence(Marker marker,
                                                               BTSAmbivalenceItem lastAmbivalenceItem, Case item,
                                                               BTSLemmaCase modelCase, Map<Position, List<Annotation>> annotationMap) {
        BTSMarker modelMarker = null;
        INode node = NodeModelUtils.getNode(marker);
        BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSMarker.class, annotationMap);
        if (ma != null) {
            modelMarker = (BTSMarker) ma.getModel();
        }
        if (modelMarker == null) {
            modelMarker = makeNewModelMarker(null, null, null);
        }
        // add modelMarker to btsSentence
        if (lastAmbivalenceItem != null) {
            int lastIndex = modelCase.getScenario()
                    .indexOf(lastAmbivalenceItem);
            modelCase.getScenario().add(lastIndex + 1, modelMarker);
        } else {
            modelCase.getScenario().add(0, modelMarker);
        }
        String text = node.getText();
        if (text != null) {
            if (!text.equals(modelMarker.getValue())) {
                modelMarker.setValue(text);
            }
        } else {
            modelMarker.setValue(null);
        }
        return modelMarker;
    }

    private BTSAmbivalenceItem updateWordFromTextAmbivalence(Word word,
                                                             BTSAmbivalenceItem lastAmbivalenceItem, Case item,
                                                             BTSLemmaCase modelCase, Map<Position, List<Annotation>> annotationMap) {
        BTSWord modelWord = null;
        INode node = NodeModelUtils.getNode(word);
        // System.out.println("word " + node.getText() + " node offset "
        // + node.getOffset() + " node length " + node.getLength());
        BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSWord.class, annotationMap);
        if (ma != null) {
            modelWord = (BTSWord) ma.getModel();
        }
        if (modelWord == null) {
            modelWord = makeNewModelWord(null, null, null);
        }
        // add modelWord to btssentence
        if (lastAmbivalenceItem != null) {
            int lastIndex = modelCase.getScenario()
                    .indexOf(lastAmbivalenceItem);
            modelCase.getScenario().add(lastIndex + 1, modelWord);
        } else {
            modelCase.getScenario().add(0, modelWord);
        }
        String text = node.getText();
        if (!modelWord.getWChar().equals(text)) {
            modelWord.setWChar(text);
        }
        return modelWord;
    }

    private BTSLemmaCase makeNewModelCase(Ambivalence ambivalence,
                                          BTSLemmaCase lastModelCase) {
        return BtsCorpusModelFactory.eINSTANCE
                .createBTSLemmaCase();
    }

    private BTSAmbivalence makeNewModelAmbivalence(Ambivalence ambivalence,
                                                   BTSIdentifiableItem lastItem, BTSSenctence modelSentence) {
        return BtsCorpusModelFactory.eINSTANCE
                .createBTSAmbivalence();
    }

    private BTSIdentifiableItem updateMarkerFromTextContent(AbstractMarker si,
                                                            BTSIdentifiableItem lastItem, Sentence sentence,
                                                            BTSSenctence modelSentence, Map<Position, List<Annotation>> annotationMap) {
        BTSMarker modelMarker = null;
        INode node = NodeModelUtils.getNode(si);
        BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSMarker.class, annotationMap);
//		System.out.println(ma);
        if (ma != null) {
            modelMarker = (BTSMarker) ma.getModel();
        }
//		else if (modelMarker == null) {
//			ma = (BTSModelAnnotation) annotationMap.get(new Position(node
//					.getOffset() - 1, node.getLength() + 1));
//			if (ma != null) {
//				modelMarker = (BTSMarker) ma.getModelObject();
//			}
//		}
        if (modelMarker == null) {
            modelMarker = makeNewModelMarker(sentence, lastItem, modelSentence);
        }
        // add modelMarker to btsSentence
        if (lastItem != null) {
            int lastIndex = modelSentence.getSentenceItems().indexOf(lastItem);
            modelSentence.getSentenceItems().add(lastIndex + 1, modelMarker);
        } else {
            modelSentence.getSentenceItems().add(0, modelMarker);
        }
        if (si instanceof Marker) {
            Marker m = (Marker) si;
            if (m.getType() != null) {
                String basetype = m.getType();
                basetype = basetype.substring(1, basetype.length() - 1);
                String type = basetype;
                if (basetype.contains(":")) {
                    String[] arr = basetype.split(":");
                    type = arr[0];
                    String name = arr[1].trim();
                    if (name != null) {
                        if (!name.equals(modelMarker.getName())) {
                            modelMarker.setName(name);
                        }
                    } else {
                        modelMarker.setName(null);
                    }
                }

                if (!type.equals(modelMarker.getType())) {
                    modelMarker.setType(type);
                }
            } else {
                modelMarker.setType(null);
            }

        } else if (si instanceof VersbreakMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.TEXT_VERS_BREAK_MARKER)) {
                modelMarker.setType(BTSConstants.TEXT_VERS_BREAK_MARKER);
            }
        } else if (si instanceof VersFrontierMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.TEXT_VERS_FRONTIER_MARKER)) {
                modelMarker.setType(BTSConstants.TEXT_VERS_FRONTIER_MARKER);
            }
        } else if (si instanceof BrokenVersbreakMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.BROKEN_VERS_MARKER)) {
                modelMarker.setType(BTSConstants.BROKEN_VERS_MARKER);
            }
        } else if (si instanceof DestroyedVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DESTROYED_VERS_MARKER)) {
                modelMarker.setType(BTSConstants.DESTROYED_VERS_MARKER);
            }
        } else if (si instanceof DisputableVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DISPUTABLE_VERS_MARKER)) {
                modelMarker.setType(BTSConstants.DISPUTABLE_VERS_MARKER);
            }
        } else if (si instanceof DeletedVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DELETED_VERS_MARKER)) {
                modelMarker.setType(BTSConstants.DELETED_VERS_MARKER);
            }
        } else if (si instanceof MissingVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.MISSING_VERS_MARKER)) {
                modelMarker.setType(BTSConstants.MISSING_VERS_MARKER);
            }
        } else if (si instanceof DestroyedVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DESTROYEDVERSMARKER)) {
                modelMarker.setType(BTSConstants.DESTROYEDVERSMARKER);
            }
        } else if (si instanceof DeletedVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DELETEDVERSMARKER)) {
                modelMarker.setType(BTSConstants.DELETEDVERSMARKER);
            }
        } else if (si instanceof DisputableVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DISPUTABLEVERSMARKER)) {
                modelMarker.setType(BTSConstants.DISPUTABLEVERSMARKER);
            }
        } else if (si instanceof RestorationOverRasurMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.RESTORATIONOVERRASURMARKER)) {
                modelMarker.setType(BTSConstants.RESTORATIONOVERRASURMARKER);
            }
        } else if (si instanceof AncientExpandedMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.ANCIENTEXPANDEDMARKER)) {
                modelMarker.setType(BTSConstants.ANCIENTEXPANDEDMARKER);
            }
        } else if (si instanceof RasurMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.RASURMARKER)) {
                modelMarker.setType(BTSConstants.RASURMARKER);
            }
        } else if (si instanceof EmendationVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.EMENDATIONVERSMARKER)) {
                modelMarker.setType(BTSConstants.EMENDATIONVERSMARKER);
            }
        } else if (si instanceof DestroyedVersFrontierMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.DESTROYEDVERSFRONTIERMARKER)) {
                modelMarker.setType(BTSConstants.DESTROYEDVERSFRONTIERMARKER);
            }
        } else if (si instanceof PartialDestroyedVersMarker) {
            if (modelMarker.getType() == null
                    || !modelMarker.getType().equals(
                    BTSConstants.PARTIALDESTROYEDVERSMARKER)) {
                modelMarker.setType(BTSConstants.PARTIALDESTROYEDVERSMARKER);
            }
        }
//		else if (si instanceof PartialDestroyedDisputableVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER)) {
//				modelMarker.setType(BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER);
//			}
//		}else if (si instanceof DestroyedDisputableVersFrontierMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER)) {
//				modelMarker.setType(BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER);
//			}
//		}else if (si instanceof DisputableDestroyedVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DISPUTABLEDESTROYEDVERSMARKER)) {
//				modelMarker.setType(BTSConstants.DISPUTABLEDESTROYEDVERSMARKER);
//			}
//		}
//		
//		else if (si instanceof DeletedDisputableVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DELETEDDISPUTABLEVERSMARKER)) {
//				modelMarker.setType(BTSConstants.DELETEDDISPUTABLEVERSMARKER);
//			}
//		}else if (si instanceof MissingDisputableVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.MISSINGDISPUTABLEVERSMARKER)) {
//				modelMarker.setType(BTSConstants.MISSINGDISPUTABLEVERSMARKER);
//			}
//		}else if (si instanceof DisputableDeletedVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DISPUTABLEDELETEDVERSMARKER)) {
//				modelMarker.setType(BTSConstants.DISPUTABLEDELETEDVERSMARKER);
//			}
//		}else if (si instanceof PartialDestroyedDeletedVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER)) {
//				modelMarker.setType(BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER);
//			}
//		}else if (si instanceof DestroyedDeletedVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DESTROYEDDELETEDVERSMARKER)) {
//				modelMarker.setType(BTSConstants.DESTROYEDDELETEDVERSMARKER);
//			}
//		}else if (si instanceof DeletedDestroyedVersMarker) {
//			if (modelMarker.getType() == null
//					|| !modelMarker.getType().equals(
//							BTSConstants.DELETEDDESTROYEDVERSMARKER)) {
//				modelMarker.setType(BTSConstants.DELETEDDESTROYEDVERSMARKER);
//			}
//		}


        else if (si instanceof DestructionMarker) {
            if (modelMarker.getType() == null) {
                modelMarker.setType(BTSConstants.DESTRUCTION_MARKER);
            }
            Matcher m = destructionMarkerPattern.matcher(((DestructionMarker) si).getType());
            if (m.find()) {
                modelMarker.setName(m.group(1));
            }
        }
        return modelMarker;

    }

    private BTSMarker makeNewModelMarker(Sentence sentence,
                                         BTSIdentifiableItem lastItem, BTSSenctence modelSentence) {

        return BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
    }

    private BTSIdentifiableItem updateWordFromTextContent(Word word,
                                                          BTSIdentifiableItem lastItem, Sentence sentence,
                                                          BTSSenctence modelSentence, Map<Position, List<Annotation>> annotationMap) {
        BTSWord modelWord = null;
        INode node = NodeModelUtils.getNode(word);
        if (node != null) {
//		System.out.println("Word " + node.getText() + " node offset "
//				+ node.getOffset() + " node length " + node.getLength());
        }
        BTSModelAnnotation ma = getModelAnnotationFromMap(node, BTSWord.class, annotationMap);
        if (ma != null && ma.getModel() instanceof BTSWord) {
            modelWord = (BTSWord) ma.getModel();
        }
        if (modelWord == null) {
            modelWord = makeNewModelWord(sentence, lastItem, modelSentence);
        }
        // add modelWord to btssentence
        if (lastItem != null) {
            int lastIndex = modelSentence.getSentenceItems().indexOf(lastItem);
            modelSentence.getSentenceItems().add(lastIndex + 1, modelWord);
        } else {
            modelSentence.getSentenceItems().add(0, modelWord);
        }
        String text = node.getText();
        if (modelWord.getWChar() == null || !modelWord.getWChar().equals(text)) {
            modelWord.setWChar(text);
        }
        return modelWord;

    }

    private BTSWord makeNewModelWord(Sentence sentence,
                                     BTSIdentifiableItem lastItem, BTSSenctence modelSentence) {
        BTSWord newModelWord = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
        newModelWord.setWChar("");

        return newModelWord;
    }

    private Map<Position, List<Annotation>> loadAnnotationMapping(EObject TextContent, IAnnotationModel am) {
        Map<Position, List<Annotation>> annotationMap = new HashMap<>();
        Iterator it = am.getAnnotationIterator();
        while (it.hasNext()) {
            Annotation an = (Annotation) it.next();
            if (an instanceof BTSModelAnnotation) {
                if (((BTSModelAnnotation) an).getModel() != null) {
                    Position pos = null;

                    // special treatment for sentences
                    if (((BTSModelAnnotation) an).getModel() instanceof BTSSenctence) {
                        pos = am.getPosition(an);
                        int offset = pos.getOffset();
                        int len = pos.getLength();
                        if (pos.getOffset() == 1) {
                            offset = 0;
                            len = len + 1;
                        } else {
                            // old logic, superflous
//							len = len-1;
//							offset = pos.getOffset() + 1;
                        }
                        pos = new Position(offset, len);
                    } else {
                        pos = am.getPosition(an);
                    }
                    List<Annotation> list = annotationMap.get(pos);
                    if (list == null) {
                        list = new Vector<>(4);
                        annotationMap.put(pos, list);
                    }
                    list.add(an);
                }
            }
        }
        return annotationMap;

    }

}
