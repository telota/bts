package org.bbaw.bts.core.corpus.controller.impl.partController;

//import grammaticalBase.model.light.LightInflexion;
//import grammaticalBase.model.light.LightLemma;
//import grammaticalBase.model.light.LightSpelling;
//import grammaticalBase.model.text.TextModel;
//import grammaticalBase.model.text.WordAnalysis;
//import grammaticalBase.model.text.WordOccurrence;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.naming.Context;

import jsesh.mdc.MDCSyntaxError;
import jsesh.mdcDisplayer.draw.MDCDrawingFacade;
import jsesh.mdcDisplayer.preferences.DrawingSpecification;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.impl.partController.support.TextModelHelper;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.corpus.text.egy.EgyDslStandaloneSetup;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator;
import org.bbaw.bts.ui.commons.corpus.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.compare.Comparison;
//import org.eclipse.emf.compare.EMFCompare;
//import org.eclipse.emf.compare.match.DefaultComparisonFactory;
//import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
//import org.eclipse.emf.compare.match.DefaultMatchEngine;
//import org.eclipse.emf.compare.match.IComparisonFactory;
//import org.eclipse.emf.compare.match.IMatchEngine;
//import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
//import org.eclipse.emf.compare.scope.IComparisonScope;
//import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.elasticsearch.index.query.QueryBuilders;

import com.google.inject.Injector;

public class BTSTextEditorControllerImpl implements BTSTextEditorController
{

	private static final String MDC_DELIMETERS = ":-<>*";
	private static final String SENTENCE_SIGN = "\u00A7";
	private static final String AMBIVALENCE_START_SIGN = "\u0025";
	private static final String AMBIVALENCE_END_SIGN = "\u0025";
	private static final String LEMMA_CASE_TERMIAL = "case";
	private static final String LEMMA_CASE_SEPARATOR = "| ";
	private static final String WS = " ";
	private static final String LEMMA_CASE_INTERFIX = ": ";
	private static final String MARKER_START_SIGN = "\u0023";
	private static final String MARKER_END_SIGN = "\u0023";
	
	

//	private static final String MARKER_VERS_SIGN = "\u0040";
	private static final String MARKER_INTERFIX = ": ";
	private static final String MDC_IGNORE = "\\i";
	private static final String MDC_SELECTION = "\\red";
	private static final int GAP = 10;
	private static final int DEFAULT_LINE_LENGTH = 70;
	
	protected TextModelHelper textModelHelper = new TextModelHelper();

	
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	
	@Inject
	private BTSTextService textService;
	
	@Inject
	private Logger logger;
	
	@Inject
	private IEclipseContext context;
	
	
	private int idcounter = 0;
	private Comparator<? super Object> glyphsStringComparator;
	
	@Inject
	private CorpusObjectService corpusObjectService;
	private Map<BTSInterTextReference, AnnotationCache> annotationRangeMap;
	
	@Inject
	private BTSCommentService commentService;
	
	@Inject
	private BTSLemmaEntryService lemmaService;
	
	private int counter;
	

	@Override
	public void transformToDocument(BTSTextContent textContent, Document doc, IAnnotationModel model, 
			List<BTSObject> relatingObjects, Map<String, List<BTSInterTextReference>> relatingObjectsMap, 
			Map<String, List<Object>> lemmaAnnotationMap, IProgressMonitor monitor, int lineLength)
	{
//		if (textContent == null)
//		{
//			throw new NullPointerException("TextContent may not be null.");
//		}
		if (lineLength == 0)
		{
			lineLength = DEFAULT_LINE_LENGTH;
		}
		annotationRangeMap = new HashMap<BTSInterTextReference, AnnotationCache>();
		if (relatingObjects != null && ! relatingObjects.isEmpty())// && (relatingObjectsMap == null || relatingObjectsMap.isEmpty()))
		{
			relatingObjectsMap = fillRelatingObjectsMap(relatingObjects);
		}
		
			
		StringBuilder stringBuilder = new StringBuilder();
		if (textContent == null)
		{
			doc.set(stringBuilder.toString());
			return;
		}
		for (BTSTextItems textItems : textContent.getTextItems())
		{
			if (textItems instanceof BTSSenctence)
			{
				BTSSenctence sentence = (BTSSenctence) textItems;
				int start = stringBuilder.length();
//				logger.info("BTSTextEditorController before sentence sign added: " + stringBuilder.toString());

				stringBuilder.append(SENTENCE_SIGN);
//				logger.info("BTSTextEditorController sentence sign: " + SENTENCE_SIGN);

//				logger.info("BTSTextEditorController after sentence sign added: " + stringBuilder.toString());

				BTSModelAnnotation ma = new BTSSentenceAnnotation(BTSSentenceAnnotation.TYPE,sentence);
				int len = stringBuilder.length();
				int loopLen = stringBuilder.length();
				int lineLoop = stringBuilder.length();
				boolean lineBreak = false;
				for (BTSSentenceItem sentenceItem : sentence.getSentenceItems())
				{
					appendToStringBuilder(sentenceItem, model, stringBuilder, relatingObjects, relatingObjectsMap, lemmaAnnotationMap);
					if (stringBuilder.length() > loopLen)
					{
						stringBuilder.append(WS);
						loopLen = stringBuilder.length();
						lineBreak = false;
					}
					
					// calcualte 
					if (loopLen - lineLoop > lineLength)
					{
						stringBuilder.append("\n");
						loopLen = stringBuilder.length();
						lineLoop = stringBuilder.length();
						lineBreak = true;
					}
					if (monitor != null)
					{
						if (monitor.isCanceled()) return;
						monitor.worked(1);
					}
				}
				
				// check whether sentence items were added
				if (stringBuilder.length() > len && lineBreak) // linebreak just appended
				{
					stringBuilder.replace(stringBuilder.length() - 2,stringBuilder.length(), SENTENCE_SIGN);
				} else if (stringBuilder.length() > len) // linebreak, remove only WS
				{
					stringBuilder.replace(stringBuilder.length() - 1,stringBuilder.length(), SENTENCE_SIGN);
				}
				else // nothing appended, add only sentence sign
				{
					stringBuilder.append(SENTENCE_SIGN);
				}
						
				stringBuilder.append("\n");
				int length = stringBuilder.length() - start;
				// shorten sentence annotation to avoid mixing it with next sentence
				Position pos = new Position(start, length-1); 
				if (model != null) model.addAnnotation(ma, pos);
			} else
			{
				appendToStringBuilder(textItems, model, stringBuilder, relatingObjects, relatingObjectsMap, lemmaAnnotationMap);
			}
		}
		if (stringBuilder.length() > 0)
		{
			stringBuilder.deleteCharAt(stringBuilder.length() -1);
		}
		logger.info("BTSTextEditorController text as string egydsl: " + stringBuilder.toString());
		
		doc.set(stringBuilder.toString());// + BTSConstants.EOF);

	}

	

	public HashMap<String, List<BTSInterTextReference>> fillRelatingObjectsMap(List<BTSObject> relatingObjects) {
		HashMap<String, List<BTSInterTextReference>> relatingObjectsMap = new HashMap<String, List<BTSInterTextReference>>();
		counter = 0;
		if (relatingObjects == null) return relatingObjectsMap;
		for (BTSObject o : relatingObjects)
		{
			o.setTempSortKey(-1);
			for (BTSRelation rel : o.getRelations())
			{
				if (rel.getParts() != null && !rel.getParts().isEmpty())
				{
					for (BTSInterTextReference part : rel.getParts())
					{
						if (part.getBeginId() != null)
						{
							List<BTSInterTextReference> parts = relatingObjectsMap.get(part.getBeginId());
							if (parts == null)
							{
								parts = new Vector<BTSInterTextReference>(4);
								relatingObjectsMap.put(part.getBeginId(), parts);
							}
							parts.add(part);
						}
						if (part.getEndId() != null && !part.getEndId().equals(part.getBeginId()))
						{
							List<BTSInterTextReference> parts = relatingObjectsMap.get(part.getEndId());
							if (parts == null)
							{
								parts = new Vector<BTSInterTextReference>(4);
								relatingObjectsMap.put(part.getEndId(), parts);
							}
							parts.add(part);
						}
					}
				}
			}
		}
		return relatingObjectsMap;
		
	}

	private void appendToStringBuilder(BTSIdentifiableItem item, IAnnotationModel model, 
			StringBuilder stringBuilder, List<BTSObject> relatingObjects, 
			Map<String, List<BTSInterTextReference>> relatingObjectsMap, 
			Map<String, List<Object>> lemmaAnnotationMap)
	{
		Position pos = null;
		if (item instanceof BTSWord)
		{
			BTSWord word = (BTSWord) item;
			pos = appendWordToStringBuilder(word, stringBuilder);
			appendWordToModel(word, model, pos, lemmaAnnotationMap);

		} else if (item instanceof BTSMarker)
		{
			BTSMarker marker = (BTSMarker) item;
			pos = appendMarkerToStringBuilder(marker, stringBuilder);
			appendMarkerToModel(marker, model, pos);
		} else if (item instanceof BTSAmbivalence) {
			BTSAmbivalence ambivalence = (BTSAmbivalence) item;
			pos = appendAmbivalenceToStringBuilder(ambivalence, stringBuilder,
					model, relatingObjectsMap, lemmaAnnotationMap);
			appendAmbivalenceToModel(ambivalence, model, pos);

		}
		// check if there are comments, annotations or subtext pointing to this
		// item
		// pointer can either be start or end positions!
		if (item != null && relatingObjectsMap != null && pos != null && relatingObjectsMap.containsKey(item.get_id()))
		{
			createAnnotations(item, model, pos, relatingObjectsMap.get(item.get_id()));
		}


	}

	private void createAnnotations(BTSIdentifiableItem item, IAnnotationModel model, Position pos, List<BTSInterTextReference> list) {
		// FIXME ende einer annotation berechnen!!!!!!!!
		if (model == null) return; 
		for (BTSInterTextReference ref : list)
		{
			if (ref.getBeginId() == null || ref.getEndId() == null || ref.getBeginId().equals(ref.getEndId()))
			{
				//1) ref referenziert nur ein Item
				BTSModelAnnotation modelAnnotation = createAnnotation(item, model, pos, ref);
				model.addAnnotation(modelAnnotation, pos);

			}
			else if (ref.getBeginId().equals(item.get_id())) {
			// 2) ref ist start
			// annotation erzeugen
				BTSModelAnnotation modelAnnotation = createAnnotation(item, model, pos, ref);
				AnnotationCache cache = new AnnotationCache(modelAnnotation, pos.getOffset());
				annotationRangeMap.put(ref, cache);
			// annotation und start position cachen
			
			}
			else if (ref.getEndId().equals(item.get_id())){
			// 3) ref ist end
			// annotation aus cache holen - wie?
				AnnotationCache cache = annotationRangeMap.get(ref);
				if (cache != null)
				{
					Position pos2 = new Position(cache.getStart());
					pos2.setLength((pos.offset - pos2.getOffset()) + pos.getLength());
				// end position
				// position und anno zu modell adden
					model.addAnnotation(cache.getAnnotation(), pos2);
					annotationRangeMap.remove(ref);
				}
				else
				{// begin element not found, only end element
					BTSModelAnnotation modelAnnotation = createAnnotation(item, model, pos, ref);
					model.addAnnotation(modelAnnotation, pos);
				}
			}
		}

		
	}

	private BTSModelAnnotation createAnnotation(BTSIdentifiableItem item, IAnnotationModel model,
			Position pos, BTSInterTextReference reference) {
		BTSModelAnnotation modelAnnotation = null;
		if (reference.eContainer() != null && reference.eContainer() instanceof BTSRelation && reference.eContainer().eContainer() != null)
		{
			if (reference.eContainer().eContainer() instanceof BTSAnnotation)
			{
				// annotation
				BTSAnnotation anno = (BTSAnnotation) reference.eContainer().eContainer();
				if (anno.getTempSortKey() < 0)
				{
					anno.setTempSortKey(counter + GAP);
				}
				modelAnnotation = new BTSAnnotationAnnotation(item, reference, anno);
				if (anno.getType() != null && anno.getType().equalsIgnoreCase("rubrum"))
				{
					modelAnnotation.setText( "org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum");
				}
			}
			else if (reference.eContainer().eContainer() instanceof BTSText)
			{
				// subtext
				BTSText text = (BTSText) reference.eContainer().eContainer();
				if (text.getTempSortKey() < 0)
				{
					text.setTempSortKey(counter + GAP);
				}
				modelAnnotation = new BTSSubtextAnnotation(item, reference, text);
			}
			else if (reference.eContainer().eContainer() instanceof BTSComment)
			{
				// comment
				BTSComment comment = (BTSComment) reference.eContainer().eContainer();
				if (comment.getTempSortKey() < 0)
				{
					comment.setTempSortKey(counter + GAP);
				}
				modelAnnotation = new BTSCommentAnnotation(item, comment, reference);
			}
			counter = counter + GAP;
		}
		return modelAnnotation;
		
	}

	private void appendAmbivalenceToModel(BTSAmbivalence ambivalence,
			IAnnotationModel model, Position pos) {
		if (model == null) return;

		BTSModelAnnotation annotation = new BTSModelAnnotation(BTSModelAnnotation.TOKEN,
				(BTSIdentifiableItem) ambivalence);

		model.addAnnotation(annotation, pos);

	}

	private Position appendAmbivalenceToStringBuilder(
			BTSAmbivalence ambivalence, StringBuilder stringBuilder,
			IAnnotationModel model, Map<String, List<BTSInterTextReference>> relatingObjectsMap, 
			Map<String, List<Object>> lemmaAnnotationMap) {
		Position pos = new Position(stringBuilder.length());
		stringBuilder.append(AMBIVALENCE_START_SIGN);
		if (ambivalence.getCases() != null) {
			for (BTSLemmaCase amCase : ambivalence.getCases()) {
				appendLemmaCase(amCase, ambivalence, stringBuilder, model, relatingObjectsMap, lemmaAnnotationMap);
				stringBuilder.append(LEMMA_CASE_SEPARATOR);
			}
		}
		stringBuilder.replace(
				stringBuilder.length() - LEMMA_CASE_SEPARATOR.length(),
				stringBuilder.length(), AMBIVALENCE_END_SIGN);
		pos.setLength(stringBuilder.length() - pos.getOffset());

		return pos;
	}

	private void appendLemmaCase(BTSLemmaCase amCase,
			BTSAmbivalence ambivalence, StringBuilder stringBuilder,
			IAnnotationModel model, Map<String, List<BTSInterTextReference>> relatingObjectsMap,
			Map<String, List<Object>> lemmaAnnotationMap) {
		Position pos = new Position(stringBuilder.length());
		stringBuilder.append(LEMMA_CASE_TERMIAL + WS);
		if (amCase.getName() != null) {
			stringBuilder.append(amCase.getName());
		}
		stringBuilder.append(LEMMA_CASE_INTERFIX);

		if (amCase.getScenario() != null) {
			for (BTSAmbivalenceItem item : amCase.getScenario()) {
				appendAmbivalenceItem((BTSIdentifiableItem) item, amCase, ambivalence, stringBuilder,
						model, relatingObjectsMap, lemmaAnnotationMap);
				stringBuilder.append(WS);
			}
		}
		stringBuilder.replace(stringBuilder.length() - 1,
				stringBuilder.length(), "");
		pos.setLength(stringBuilder.length() - pos.getOffset());

		// append to model
		if (model == null) return;

		BTSModelAnnotation annotation = new BTSModelAnnotation(BTSModelAnnotation.TOKEN,
				(BTSIdentifiableItem) amCase);

		model.addAnnotation(annotation, pos);
		return;

	}

	private void appendAmbivalenceItem(BTSIdentifiableItem item,
			BTSLemmaCase amCase, BTSAmbivalence ambivalence,
			StringBuilder stringBuilder, IAnnotationModel model, 
			Map<String, List<BTSInterTextReference>> relatingObjectsMap, Map<String, List<Object>> lemmaAnnotationMap) {
		Position pos = null;
		if (item instanceof BTSWord) {
			BTSWord word = (BTSWord) item;
			pos = appendWordToStringBuilder(word, stringBuilder);
			appendWordToModel(word, model, pos, lemmaAnnotationMap);
		} else if (item instanceof BTSMarker) {
			BTSMarker marker = (BTSMarker) item;
			pos = appendMarkerToStringBuilder(marker, stringBuilder);
			appendMarkerToModel(marker, model, pos);
		}
		if (item != null && relatingObjectsMap != null && pos != null && relatingObjectsMap.containsKey(item.get_id()))
		{
			createAnnotations(item, model, pos, relatingObjectsMap.get(item.get_id()));
		}

	}

	private void appendMarkerToModel(BTSMarker marker, IAnnotationModel model,
			Position pos)
	{
		if (model == null) return;
		BTSModelAnnotation annotation = new BTSModelAnnotation(BTSModelAnnotation.TOKEN,
				(BTSIdentifiableItem) marker);

		model.addAnnotation(annotation, pos);

	}

	private Position appendMarkerToStringBuilder(BTSMarker marker,
			StringBuilder stringBuilder)
	{
		Position pos = new Position(stringBuilder.length());
		if (marker.getType() != null) {
			if (marker.getType().equals(BTSConstants.TEXT_VERS_FRONTIER_MARKER)) {
				stringBuilder.append(BTSConstants.VERS_FRONTER_MARKER_SIGN);
			} else if (marker.getType().equals(
					BTSConstants.TEXT_VERS_BREAK_MARKER)) {
				stringBuilder.append(BTSConstants.VERS_BREAK_MARKER_SIGN);
			} else if (marker.getType().equals(
					BTSConstants.BROKEN_VERS_MARKER)) {
				stringBuilder.append(BTSConstants.BROKEN_VERS_MARKER_SIGN);
				
			} else if (marker.getType().equals(
					BTSConstants.DESTROYED_VERS_MARKER)) {
				stringBuilder.append(BTSConstants.DESTROYED_VERS_MARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DELETED_VERS_MARKER)) {
				stringBuilder.append(BTSConstants.DELETED_VERS_MARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLE_VERS_MARKER)) {
				stringBuilder.append(BTSConstants.DISPUTALBE_VERS_MARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.MISSING_VERS_MARKER)) {
				stringBuilder.append(BTSConstants.MISSING_VERS_MARKER_SIGN);
				
			}
			
			
			else if (marker.getType().equals(
					BTSConstants.DESTROYEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DESTROYEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DELETEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEVERSMARKER)) {
				stringBuilder.append(BTSConstants.DISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.RESTORATIONOVERRASURMARKER)) {
				stringBuilder.append(BTSConstants.RESTORATIONOVERRASURMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.ANCIENTEXPANDEDMARKER)) {
				stringBuilder.append(BTSConstants.ANCIENTEXPANDEDMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.RASURMARKER)) {
				stringBuilder.append(BTSConstants.RASURMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.EMENDATIONVERSMARKER)) {
				stringBuilder.append(BTSConstants.EMENDATIONVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDVERSFRONTIERMARKER)) {
				stringBuilder.append(BTSConstants.DESTROYEDVERSFRONTIERMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.PARTIALDESTROYEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER)) {
				stringBuilder.append(BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER)) {
				stringBuilder.append(BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEDESTROYEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DISPUTABLEDESTROYEDVERSMARKER_SIGN);
				
			}
			
			else if (marker.getType().equals(
					BTSConstants.DELETEDDISPUTABLEVERSMARKER)) {
				stringBuilder.append(BTSConstants.DELETEDDISPUTABLEVERSMARKER_SIGN);
				
			}
			else if (marker.getType().equals(
					BTSConstants.MISSINGDISPUTABLEVERSMARKER)) {
				stringBuilder.append(BTSConstants.MISSINGDISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEDELETEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DISPUTABLEDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDDELETEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DESTROYEDDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DELETEDDESTROYEDVERSMARKER)) {
				stringBuilder.append(BTSConstants.DELETEDDESTROYEDVERSMARKER_SIGN);
				
			}
			
			
			
			
			
			
			else if (marker.getType().equals(
					BTSConstants.DESTRUCTION_MARKER)) {
//				stringBuilder.append(MARKER_VERS_SIGN);
				stringBuilder.append("--" + marker.getName() + "--");
			}  
			else {
				pos.setOffset(pos.getOffset() +1);
				stringBuilder.append(MARKER_START_SIGN);
				stringBuilder.append(marker.getType());
				if (marker.getName() != null && !"".equals(marker.getName())) {
					stringBuilder.append(MARKER_INTERFIX);
					stringBuilder.append(marker.getName());
				}
				stringBuilder.append(MARKER_END_SIGN);
			}
		}

		pos.setLength(stringBuilder.length() - pos.getOffset());
		return pos;

	}

	private void appendWordToModel(BTSWord word, IAnnotationModel model, Position position, Map<String, List<Object>> lemmaAnnotationMap)
	{
		if (model == null) return;

		BTSModelAnnotation annotation;
		if (word.getLKey() != null && !"".equals(word.getLKey())) {

			annotation = new BTSLemmaAnnotation(BTSLemmaAnnotation.TYPE, word);
			if (lemmaAnnotationMap != null)
			{
				add2LemmaAnnotationMap(word.getLKey(), annotation, lemmaAnnotationMap);
			}
			
		} else {
			annotation = new BTSModelAnnotation(BTSModelAnnotation.TOKEN,
					(BTSIdentifiableItem) word);
		}
		model.addAnnotation(annotation, position);

	}

	private void add2LemmaAnnotationMap(String lemmaId, BTSModelAnnotation annotation, Map<String, List<Object>> lemmaAnnotationMap) {
		List<Object> list = lemmaAnnotationMap.get(lemmaId);
		if (list == null)
		{
			list = new Vector<Object>(4);
			lemmaAnnotationMap.put(lemmaId, list);
		}
		list.add(annotation);
	}

	private Position appendWordToStringBuilder(BTSWord word, StringBuilder stringBuilder)
	{
		Position pos = new Position(stringBuilder.length());
		if (word.getWChar() != null && !"".equals(word.getWChar().trim()))
		{
			stringBuilder.append(word.getWChar().trim());
			pos.setLength(word.getWChar().trim().length());
		}
		return pos;
	}

//	@Override
//	public BTSText updateTextFromDocument(BTSText text, Document document, IAnnotationModel annotationModel,
//			TextViewer textViewer)
//	{
//		BTSEgySourceViewerConfiguration configuration = new BTSEgySourceViewerConfiguration();
//		RuleBasedScanner scanner = configuration.getScanner();
//		scanner.setRange(document, 0, document.getLength());
//		IToken token = scanner.nextToken();
//		int length = document.getLength();
//		Iterator annotationIterator = annotationModel.getAnnotationIterator();
//		StringBuffer buffer = new StringBuffer(length);
//		//		StringTokenizer tokenizer= new StringTokenizer(document.get(), "\n\r><", true); //$NON-NLS-1$
//		//		while (tokenizer.hasMoreTokens()){
//		//
//		//			String token = tokenizer.nextToken();
//		//		}
//
//		int pos;
//		int len;
//		int annotationOffset = 0;
//		String content = null;
//		boolean hasToken = token != null;
//		BTSModelAnnotation annotation = null;
//		BTSSenctence sentence;
//
//		if (!text.getTextContent().getTextItems().isEmpty())
//		{
//			sentence = (BTSSenctence) text.getTextContent().getTextItems().get(0);
//			sentence.getSentenceItems().clear();
//		} else
//		{
//			sentence = textService.createNewSentence();
//			text.getTextContent().getTextItems().add(sentence);
//		}
//		BTSWord word = null;
//		int innerSentencePosition = 0;
//		while (hasToken)
//		{
//
//			pos = scanner.getTokenOffset();
//			len = scanner.getTokenLength();
//			Object o = token.getData();
//			//			annotationModel.
//			logger.info("BTSTextEditorController token " + token + " offset: " + pos + " token length: " + len);
//			try
//			{
//				content = document.get(pos, len);
//			} catch (BadLocationException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if (content != null)
//			{
//
//				boolean wordFound = false;
//				if (annotationOffset <= pos)
//				{
//					annotation = getAnnotation(annotation, annotationIterator, annotationModel, content, pos, len);
//					Position position = annotationModel.getPosition(annotation);
//					if (position != null)
//					{
//						annotationOffset = position.getOffset();
//					}
//					if (annotation != null && annotationOffset == pos && position.getLength() == len)
//					{
//						word = (BTSWord) annotation.getModel();
//						word.setWChar(content);
//						sentence.getSentenceItems().add(innerSentencePosition, word);
//						wordFound = true;
//						innerSentencePosition++;
//					}
//				}
//				if (!wordFound)
//				{
//					word = createNewWord(content);
//					sentence.getSentenceItems().add(innerSentencePosition, word);
//					innerSentencePosition++;
//				}
//
//				content = null;
//			}
//
//			token = scanner.nextToken();
//			hasToken = token != null && scanner.getTokenLength() > 0;
//		}
//		return text;
//	}

	private BTSWord createNewWord(String content)
	{
		BTSWord word = textService.createNewWord();
		word.setWChar(content);
		return word;
	}

	private BTSModelAnnotation getAnnotation(Annotation annotation,
			Iterator annotationIterator,
			IAnnotationModel annotationModel, String content, int pos, int len)
	{
		if (annotation != null)
		{
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() > pos)
				{
					return (BTSModelAnnotation) annotation;
				}
			}
		}

		boolean forward = annotationIterator.hasNext();
		while (forward)
		{
			Object o = annotationIterator.next();
			annotation = (Annotation) o;
			if (!(annotation instanceof BTSModelAnnotation))
			{
				continue;
			}
			Position position = annotationModel.getPosition(annotation);
			if (position != null)
			{
				if (position.getOffset() >= pos)
				{
					return (BTSModelAnnotation) annotation;
				}

			}
			forward = annotationIterator.hasNext();
		}
		if (annotation instanceof BTSModelAnnotation)
		{
			return (BTSModelAnnotation) annotation;
		}
		return null;
	}

	@Override
	public boolean save(BTSText text)
	{
		return textService.save(text);
	}

	// @Override
	// public TextModel transformToRamsesTextModel(BTSText text, TextModel
	// textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// ramsesTextModelMap.clear();
	// textModel.clear();
	// if (text != null && !text.getTextContent().getTextItems().isEmpty())
	// {
	// return transformToRamsesTextModelInteral(text, textModel,
	// ramsesTextModelMap);
	// }
	// return textModel;
	//
	// }
	//
	// private TextModel transformToRamsesTextModelInteral(BTSText text,
	// TextModel textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// for (BTSTextItems item : text.getTextContent().getTextItems())
	// {
	// if (item instanceof BTSSenctence && !((BTSSenctence)
	// item).getSentenceItems().isEmpty())
	// {
	// for (BTSSentenceItem sentenceItem : ((BTSSenctence)
	// item).getSentenceItems())
	// {
	// addSentenceItemToTextModel(sentenceItem, textModel, ramsesTextModelMap);
	// }
	// }
	// }
	// return textModel;
	// }

	// private void addSentenceItemToTextModel(BTSSentenceItem sentenceItem,
	// TextModel textModel,
	// Map<Object, BTSSentenceItem> ramsesTextModelMap)
	// {
	// if (sentenceItem instanceof BTSWord)
	// {
	// BTSWord word = (BTSWord) sentenceItem;
	// WordOccurrence modelElement = new WordOccurrence();
	// LightSpelling ls = new LightSpelling(idcounter++, word.getWChar(),
	// transformWordToMdCString(word));
	// // ls.setEncodedOrder<ingTranslitteration(word.getWChar());
	//
	// ls.setLabel(word.getWChar() + " " + idcounter);
	// ls.setTranslitteration(word.getWChar());
	// modelElement.setSpelling(ls);
	// modelElement.setFreeTranslitteration(word.getWChar());
	// WordAnalysis wordAnalysis = new WordAnalysis();
	// wordAnalysis.setSpelling(ls);
	// LightLemma lightLemma = new LightLemma();
	// lightLemma.setTranslitteration("hhhh");
	// LightInflexion lightInflexion = new LightInflexion();
	// lightInflexion.setInflexionName("hihihi");
	// wordAnalysis.addInflexion(lightLemma, lightInflexion);
	// modelElement.setWordAnalysis(wordAnalysis);
	// textModel.add(modelElement);
	//
	// ramsesTextModelMap.put(modelElement, word);
	// }
	//
	// }

	public String transformWordToMdCString(BTSWord word, int selectedGlypheIndex)
	{
		String mdc = "";
		if (!word.getGraphics().isEmpty())
		{
			int i = 0;
			for (BTSGraphic graphic : word.getGraphics())
			{

				if (graphic.getCode() != null)
				{
					if (!"".equals(mdc))
					{
						if (!(mdc.endsWith("-")
								|| mdc.endsWith(":")
								|| mdc.endsWith("*"))
								)
						{
							if (!"".equals(graphic.getCode()))
							{
								if (!(graphic.getCode().startsWith("-")
										|| graphic.getCode().startsWith(":")
										|| graphic.getCode().startsWith("*"))
										)
								{
									mdc += "-";// add standard mdc separator
								}
							}
						}
					}
				mdc += graphic.getCode();
					if (i == selectedGlypheIndex) {
						mdc = insertMarkerBehindSingleCode(mdc, MDC_SELECTION);
					} else if (graphic.isIgnored()) {
						mdc = insertMarkerBehindSingleCode(mdc, MDC_IGNORE);
					}
					i++;
				}
			}
		}

		// XXX mockup
		// mdc = "s-t-n";
		return mdc;
	}

	public String insertMarkerBehindSingleCode(String mdcString, String marker) {
		String resultString = "";
		if (!(mdcString.endsWith("-") || mdcString.endsWith(":")
				|| mdcString.endsWith("<") || mdcString.endsWith("*") || mdcString
					.endsWith(">")|| mdcString
					.endsWith("<S"))) {
			mdcString += marker;
			return mdcString;
		} else {

			ArrayList<String> res = new ArrayList<String>();
			Pattern p = Pattern.compile("[-:<>*]");
			Matcher m = p.matcher(mdcString);
			int pos = 0;
			String last = null;
			int offset = 1;
			int index = 0;
			while (m.find()) {
				String next = mdcString.substring(pos, m.end() - offset);
				if (next.endsWith("-") || next.endsWith(":")
						|| next.endsWith("<") || next.endsWith("*")
						|| next.endsWith("<S")) {
					continue;
				} else if (next.endsWith(">")) {
					last = last + next;
					res.remove(index - 1);
					res.add(index, last);
				} else {
					res.add(next);
					index++;
				}
				pos = m.end() - offset;
				last = next;
			}

			if (pos < mdcString.length()) {
				String next = mdcString.substring(pos);
				if (next.endsWith("-") || next.endsWith(":")
						|| next.endsWith("<") || next.endsWith("*")
						|| next.endsWith(">") || next.endsWith("<S")) {
					last = last + marker + next;
					res.remove(index - 1);
					res.add(index - 1, last);
				} else if (index < res.size()) {
					last = res.get(index - 1);
					last += marker;
					res.set(index - 1, last);
					res.add(next);
				}

			} else {
				last = res.get(index - 1);
				last += marker;
				res.set(index - 1, last);
			}
			for (String s : res) {
				resultString += s;
			}
			return resultString;
		}
	}

	public void updateBTSWordFromMdCString(BTSWord word, String mdc,
			EditingDomain editingDomain)
	{
		List<BTSGraphic> toDelete = new ArrayList<BTSGraphic>(1);
		String[] tokens = splitSignsKeepDelimeters(mdc);
		int i = 0;
		int innerSentenceOrder = -1;
		CompoundCommand compoundCommand = new CompoundCommand();
		for (i = 0; i < word.getGraphics().size(); i++)
		{
			BTSGraphic graphic = word.getGraphics().get(i);
			if (i < tokens.length)
			{
				Command command = SetCommand.create(editingDomain, graphic,
						BtsCorpusModelPackage.Literals.BTS_GRAPHIC__CODE,
						tokens[i]);
				compoundCommand.append(command);
				innerSentenceOrder = graphic.getInnerSentenceOrder();
			} else
			{
				toDelete.add(graphic);
			}
		}
		int createdIndex = 0;
		if (innerSentenceOrder == -1) {
			innerSentenceOrder = calculateSentenceOrder(word);
		}
		if (i < tokens.length + 1)
		{
			while (i < tokens.length)
			{
				BTSGraphic graphic = textService.createNewGraphic();
				createdIndex++;
				graphic.setCode(tokens[i]);
				graphic.setInnerSentenceOrder(innerSentenceOrder + createdIndex);
				Command command = AddCommand.create(editingDomain, word,
						BtsCorpusModelPackage.Literals.BTS_WORD__GRAPHICS, graphic);
				compoundCommand.append(command);
				i++;
			}
		} else if (!toDelete.isEmpty())
		{
			Command command = RemoveCommand.create(editingDomain, word,
					BtsCorpusModelPackage.Literals.BTS_WORD__GRAPHICS, toDelete);
			compoundCommand.append(command);
		}
		editingDomain.getCommandStack().execute(compoundCommand);
	}

	private int calculateSentenceOrder(BTSWord word) {
		if (word.eContainer() instanceof BTSSenctence) {
			BTSSenctence sentence = (BTSSenctence) word.eContainer();
			int i = sentence.getSentenceItems().indexOf(word);
			if (i <= 0) {
				return 0; // no sibbling, first word
			} else {
				BTSSentenceItem leftSibbling = null;
				boolean found = false;
				while (!found) {
					leftSibbling = sentence.getSentenceItems().get(i - 1);
					if (leftSibbling instanceof BTSWord)
					{
						if (!((BTSWord) leftSibbling).getGraphics().isEmpty())
						{
							BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
							if (last != null)
							{
								return last.getInnerSentenceOrder();
							}
						}
					}
					else if (leftSibbling instanceof BTSAmbivalence) {
						if (!((BTSAmbivalence) leftSibbling).getCases().isEmpty())
						{
							int biggest = 0;
							for (BTSLemmaCase c : ((BTSAmbivalence) leftSibbling).getCases())
							{
								if (!c.getScenario().isEmpty())
								{
									for (BTSAmbivalenceItem item : c.getScenario())
									{
										if (item instanceof BTSWord)
										{
											// FIXME  org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl cannot be cast to org.bbaw.bts.corpus.btsCorpusModel.BTSWord
											// Ambivalence fälle bedenken!!!
											if (leftSibbling instanceof BTSWord && !((BTSWord) leftSibbling).getGraphics().isEmpty())
											{
												BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
												if (last != null)
												{
													biggest = last.getInnerSentenceOrder() > biggest ? last.getInnerSentenceOrder() : biggest;
												}
											}
										}
									}
								}
							}
							if (biggest > 0) {
								return biggest;
							}
						}
					}
					i--;
					if (i <= 0) {
						return 0; // no sibbling, first word
					}
				}
				return 0; // no valid sibbling found
			}
		}
		return 0;
	}

	@Override
	public String transformTextToJSeshMdCString(BTSText text) {
		String result = "";
		if (text == null || text.getTextContent() == null
				|| text.getTextContent().getTextItems().isEmpty()) {
			return result;
		}
		for (BTSTextItems s : text.getTextContent().getTextItems()) {
			if (s instanceof BTSSenctence) {
				BTSSenctence sentence = (BTSSenctence) s;
				for (BTSSentenceItem item : sentence.getSentenceItems()) {
					List<Object> glyphs = new Vector<Object>();
					if (item instanceof BTSWord) {
						for (BTSGraphic g : ((BTSWord) item).getGraphics()) {
//							if (!g.isIgnored()) {
							//TODO ignore auskommentiert: Check Klammerung, Öffnen und Schließen
								glyphs.add(g);
//							}
						}

					} else if (item instanceof BTSMarker) {
						String m = item.getType().replace("[", "(");
						m = m.replace("]", ")");

						if (m.contains("lc"))
						{
							glyphs.add("-!");
						}
						glyphs.add(new String("\"" + m + "\""));

					}
					Collections.sort(glyphs, getGlyphsStringComparator());
					int lineLength = 0;
					boolean inBracket = false;
					for (int i = 0; i < glyphs.size(); i++) {
						Object o = glyphs.get(i);
						String mdc = "";
						if (o instanceof BTSGraphic) {
							mdc = ((BTSGraphic) o).getCode();
						} else {
							mdc = (String) o;
//							if (i == 0 && mdc.startsWith("-!"))
//							{
//								mdc = mdc.substring(2);
//							}
						}
						if (mdc == null) continue;
						
						if (result.length() == 0 || result.endsWith("-") || mdc.startsWith("-") || mdc.startsWith(":"))
						{
							result += mdc;
						}
						else
						{
							result += "-" + mdc;
						}
						if (mdc.contains("<") && !mdc.contains(">"))
						{
							inBracket = true;
						}
						else if (mdc.contains(">") && !mdc.contains("<"))
						{
							inBracket = false;
						}
						
						lineLength = lineLength + mdc.length();
						if (result.endsWith("-!"))
						{
							lineLength = 0;
						}
						else if (!inBracket && lineLength > 40)
						{
							if (!result.endsWith("-!"))
							{
								result += "-!";
							}
							lineLength = 0;
						}
						// if (!"".equals(mdc) && !mdc.endsWith(":")
						// && !mdc.endsWith("*") && !mdc.endsWith("<")
						// && !mdc.endsWith("[")) {
						// result += "-";
						// }
					}

				}
				result += "-O-!";
			}
		}
		result = result.replace("-!-!", "-!");
		if (result.startsWith("-!"))
		{
			result = result.substring(2);
		}
		return result;
	}

	private Comparator<? super Object> getGlyphsStringComparator() {
		if (glyphsStringComparator != null) {
			return glyphsStringComparator;
		} else {
			glyphsStringComparator = new Comparator<Object>() {

				@Override
				public int compare(Object o1, Object o2) {
					if (o1 != null && o2 != null) {
						if (o1 instanceof BTSGraphic
								&& o2 instanceof BTSGraphic) {
							return ((BTSGraphic) o1).getInnerSentenceOrder()
									- ((BTSGraphic) o2).getInnerSentenceOrder();
						}
					}
					return 0;
				}
			};
		}
		return glyphsStringComparator;
	}

	private String[] splitAndKeep(String input, int offset) {
		ArrayList<String> res = new ArrayList<String>();
		Pattern p = Pattern.compile("[-:<>*]");
		Matcher m = p.matcher(input);
		int pos = 0;
		String last = null;
		int index = 0;
		while (m.find()) {
			String next = input.substring(pos, m.end() - offset);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*") || next.endsWith("<S")) {
				continue;
			} else if (next.endsWith(">")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index - 1, last);
			} else {
				res.add(next);
				index++;
			}
			pos = m.end() - offset;
			last = next;
		}
		if (pos < input.length()) {
			String next = input.substring(pos);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*") || next.endsWith(">")
					|| next.endsWith("<S")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index - 1, last);
			} else {
				res.add(next);
			}
		}
		return res.toArray(new String[res.size()]);
	}

	public String[] splitSignsKeepDelimeters(String mdCString) {
		return splitAndKeep(mdCString, 1);
	}

	@Override
	public List<BTSObject> getRelatingObjects(BTSText text, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId",
				text.get_id()));
		query.setQueryId("relations.objectId-" + text.get_id());
		System.out.println(query.getQueryId());
		List<BTSObject> children = new Vector<BTSObject>();
		List<BTSCorpusObject> obs = corpusObjectService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		for (BTSCorpusObject o : obs)
		{
			children.add(o);
		}
		if (monitor != null)
		{
			if (monitor.isCanceled()) return children;
			monitor.beginTask("Load comments", IProgressMonitor.UNKNOWN);
		}
		children.addAll(commentService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, true, monitor));
		return children;
	}
	
	@Override
	public boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts)
	{
		return corpusObjectService.checkAndFullyLoad(object, checkForConflicts);
	}
	
	private class AnnotationCache {
		
		public AnnotationCache(BTSModelAnnotation modelAnnotation, int start) {
			this.setAnnotation(modelAnnotation);
			this.setStart(start);
		}

		public BTSModelAnnotation getAnnotation() {
			return annotation;
		}

		public void setAnnotation(BTSModelAnnotation annotation) {
			this.annotation = annotation;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		private BTSModelAnnotation annotation;
		
		private int start;
		
		private int end;
		
		
	}
	
	@Override
	public BTSText createNewText(BTSCorpusObject parentObject)
	{
		BTSText text = textService.createNewRelationPartOf(parentObject);
		return text;
	}

	@Override
	public Image transformToSWT(BufferedImage bufferedImage)
	{

		if (bufferedImage.getColorModel() instanceof DirectColorModel)
		{
			DirectColorModel colorModel = (DirectColorModel) bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(),
					colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++)
			{
				for (int x = 0; x < data.width; x++)
				{
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha())
					{
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			return new Image(Display.getCurrent(), data);
		} else if (bufferedImage.getColorModel() instanceof IndexColorModel)
		{
			IndexColorModel colorModel = (IndexColorModel) bufferedImage.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++)
			{
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++)
			{
				for (int x = 0; x < data.width; x++)
				{
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			return new Image(Display.getCurrent(), data);
		}
		return null;

	}
	public BufferedImage getImageData(String topItemList, int height, int width) throws MDCSyntaxError
	{
		BufferedImage result = null;
		{
			MDCDrawingFacade facade = new MDCDrawingFacade();
			facade.setDrawingSpecifications(drawingSpecifications);
			facade.setMaxSize(200, 45);
			facade.setCadratHeight(30);
			try {
				result = facade.createImage(topItemList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(topItemList);
			}
		}
		return result;
	}
	
	public BufferedImage getImageData(String topItemList) throws MDCSyntaxError
	{
		return getImageData(topItemList, 200, 45);
	}

	@Override
	public BTSTextContent updateModelFromTextContent(
			BTSTextContent textContent, EObject eo, IAnnotationModel am) {
		BTSTextContent result = textModelHelper.updateModelFromTextContent(textContent, eo, am);
		
		
		// testing
		EcoreUtil.EqualityHelper h = new EcoreUtil.EqualityHelper();
		System.out.println("BTSTextEditorController.updateModelFromTextContent Model is structurally equal to original: "
		+ h.equals(textContent, result));
		
//		// Configure EMF Compare
//		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
//		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
//		IMatchEngine matchEngine = new DefaultMatchEngine(matcher, comparisonFactory);
////	        IMatchEngine.Factory.Registry matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
////	    IPostProcessor.Descriptor.Registry<String> postProcessorRegistry = EMFCompareRCPPlugin.getDefault().getPostProcessorRegistry();
//		EMFCompare comparator = EMFCompare.builder()
////	                                           .setMatchEngineFactoryRegistry(matchEngineRegistry)
////	                                           .setPostProcessorRegistry(postProcessorRegistry)
//	                                           .build();
//
//		// Compare the two models
//		IComparisonScope scope =EMFCompare.createDefaultScope(textContent, textContent);
//		Comparison comparison = comparator.compare(scope);
//		
//		System.out.println("BTSTextEditorController.updateModelFromTextContent Model differs from original: " +
//		!comparison.getDifferences().isEmpty());
		
		return result;
	}



	@Override
	public BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor) {
		return lemmaService.find(lemmaId, monitor);
	}



	@Override
	public boolean testTextValidAgainstGrammar(BTSTextContent textContent, BTSObject object) {
		try {
			Document doc = new Document();
			transformToDocument(textContent, doc, null, null, null, null, null, DEFAULT_LINE_LENGTH);
			Injector injector = findEgyDslInjector();
			 XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			 resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			 Resource resource = resourceSet.createResource(URI.createURI("dummy:/" + object.get_id() + ".egydsl"));
			 InputStream in = new ByteArrayInputStream(doc.get().getBytes(Charset.forName("UTF-8")));
			 try {
				resource.load(in, resourceSet.getLoadOptions());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 boolean valid = resource.getErrors().isEmpty();
			 System.out.println("testTextValidAgainstGrammar valid " + valid);
			return valid;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public Injector findEgyDslInjector() {
		Object o = context.get(BTSEGYUIConstants.EGYDSL_INJECTOR);
		Injector injector;
		if (o != null && o instanceof Injector)
		{
			injector = (Injector) o;
		}
		else
		{
			EgyDslActivator activator = EgyDslActivator.getInstance();
//			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");

			injector = activator
					.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
			context.set(BTSEGYUIConstants.EGYDSL_INJECTOR, injector);
		}
		return injector;
	}



	@Override
	public List<BTSText> listAllTexts(IProgressMonitor monitor) {
		return textService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
	}



	@Override
	public List<BTSText> listInAllInvalidTexts(IProgressMonitor monitor) {
		String[] params = new String[3];
		List<BTSText> invalidtexts = new Vector<BTSText>();
		String[] active_corpora= textService.getActive_corpora(null);
		for (String active_corpus : active_corpora)
		{
			try {
				do
				{
					List<BTSText> texts = textService.listChunks(100, params, active_corpus, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
					if (texts == null) break;
					for (BTSText t : texts)
					{
						if (monitor.isCanceled()) break;
						checkAndFullyLoad(t, false);
						monitor.worked(1);
						if (!testTextValidAgainstGrammar(t))
						{
							invalidtexts.add(t);
						}
						monitor.worked(1);
					}
					 params = new String[]{params[1], params[2], null};
				}
				while(params[1] != null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return invalidtexts;
	}



	private boolean testTextValidAgainstGrammar(BTSText t) {
		if (t.getTextContent() == null || t.getTextContent().getTextItems().isEmpty()) return true;
		return testTextValidAgainstGrammar(t.getTextContent(), t);
	}



	@Override
	public int[] checkTextCompleteness(BTSText text) {
		int lemma = 0;
		int flex = 0;
		int hiero = 0;
		int wordTrans = 0;
		int sentTrans = 0;
		int [] results= new int[5];
		
		int wordCount = 0;
		int SentenceCount = 0;
		if (text.getTextContent() == null)
		{
			return results;
		}
		for (BTSTextItems textItems : text.getTextContent().getTextItems())
		{
			if (textItems instanceof BTSSenctence)
			{
				BTSSenctence sentence = (BTSSenctence) textItems;
				SentenceCount++;
				if (sentence.getTranslation() != null && sentence.getTranslation().getTranslation(null) != null)
				{
					sentTrans++;
				}
				for (BTSSentenceItem sentenceItem : sentence.getSentenceItems())
				{
					if (sentenceItem instanceof BTSWord)
					{
						wordCount++;
						BTSWord w = (BTSWord) sentenceItem;
						if (w.getLKey() != null && !"".equals(w.getLKey()))
						{
							lemma++;
						}
						
						if (w.getFlexCode() != null && !"".equals(w.getFlexCode()))
						{
							flex++;
						}
						
						if (w.getGraphics() != null && !w.getGraphics().isEmpty())
						{
							hiero++;
						}
						
						if (w.getTranslation() != null && w.getTranslation().getTranslation(null) != null)
						{
							wordTrans++;
						}
					}
				}
			}
		}
		if (wordCount == 0)
		{
			return new int[]{100,100,100,100,100};
		}
		results[0] = (lemma * 100) / wordCount ;
		results[1] = (flex * 100) / wordCount;
		results[2] = (hiero * 100) / wordCount;
		results[3] = (wordTrans * 100) / wordCount;
		
		results[4] = (sentTrans * 100) / SentenceCount;
		return results;
	}



	@Override
	public List<BTSText> listInAllInCompleteTexts(IProgressMonitor monitor) {
			String[] params = new String[3];
			List<BTSText> invalidtexts = new Vector<BTSText>();
			String[] active_corpora= textService.getActive_corpora(null);
			for (String active_corpus : active_corpora)
			{
				try {
					do
					{
						List<BTSText> texts = textService.listChunks(100, params, active_corpus, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
						if (texts == null) break;
						for (BTSText t : texts)
						{
							if (monitor.isCanceled()) break;
							checkAndFullyLoad(t, false);
							monitor.worked(1);
							if (!testTextComplete(t))
							{
								invalidtexts.add(t);
							}
							monitor.worked(1);
						}
						 params = new String[]{params[1], params[2], null};
					}
					while(params[1] != null);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return invalidtexts;
	}



	private boolean testTextComplete(BTSText t) {
		int[] completeness = checkTextCompleteness(t);
		for (int i : completeness)
		{
			if (i < 100) return false;
		}
		return true;
	}



	@Override
	public BTSSentenceItem copySentenceItem(BTSSentenceItem copyItem) {
		return textService.copySentenceItem(copyItem);
	}

	@Override
	public BTSSenctence copySentence(BTSSenctence copyItem) {
		return textService.copySentence(copyItem);
	}
}
