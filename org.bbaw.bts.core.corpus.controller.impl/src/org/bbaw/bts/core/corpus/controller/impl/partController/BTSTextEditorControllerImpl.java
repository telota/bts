package org.bbaw.bts.core.corpus.controller.impl.partController;

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
import java.util.Collection;
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
import org.bbaw.bts.core.corpus.controller.impl.partController.support.ModelUpdater;
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
import org.bbaw.bts.ui.commons.corpus.text.BTSLinkageAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSentenceAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
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

public class BTSTextEditorControllerImpl implements BTSTextEditorController {
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
	
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	
	@Inject private BTSTextService textService;
	@Inject private Logger logger; 
	@Inject private IEclipseContext context; 
	private int idcounter = 0;
	private Comparator<? super Object> glyphsStringComparator;
	@Inject private CorpusObjectService corpusObjectService;
	@Inject private BTSCommentService commentService; 
	@Inject private BTSLemmaEntryService lemmaService; 
	
    public HashMap<String, List<BTSInterTextReference>> fillRelatingObjectsMap(List<BTSObject> relatingObjects) {
		HashMap<String, List<BTSInterTextReference>> relatingObjectsMap = new HashMap<String, List<BTSInterTextReference>>();
		if (relatingObjects == null)
            return relatingObjectsMap;

		for (BTSObject o : relatingObjects) {
			for (BTSRelation rel : o.getRelations()) {
				if (rel.getParts() == null || rel.getParts().isEmpty())
                    continue;

                for (BTSInterTextReference part : rel.getParts()) {
                    if (part.getBeginId() != null) {
                        List<BTSInterTextReference> parts = relatingObjectsMap.get(part.getBeginId());
                        if (parts == null) {
                            parts = new Vector<BTSInterTextReference>(4);
                            relatingObjectsMap.put(part.getBeginId(), parts);
                        }
                        parts.add(part);
                    }

                    if (part.getEndId() != null && !part.getEndId().equals(part.getBeginId())) {
                        List<BTSInterTextReference> parts = relatingObjectsMap.get(part.getEndId());
                        if (parts == null) {
                            parts = new Vector<BTSInterTextReference>(4);
                            relatingObjectsMap.put(part.getEndId(), parts);
                        }
                        parts.add(part);
                    }
                }
			}
		}
		return relatingObjectsMap;
	}

	@Override
	public boolean save(BTSText text) {
		return textService.save(text);
	}

	public String transformWordToMdCString(BTSWord word, int selectedGlypheIndex) {
		String mdc = "";
		if (!word.getGraphics().isEmpty()) {
			int i = 0;
			for (BTSGraphic graphic : word.getGraphics()) {
				if (graphic.getCode() == null)
                    continue;

                if (!"".equals(mdc))
                if (!(mdc.endsWith("-") || mdc.endsWith(":") || mdc.endsWith("*")))
                if (!"".equals(graphic.getCode()))
                if (!(graphic.getCode().startsWith("-")
                    || graphic.getCode().startsWith(":")
                    || graphic.getCode().startsWith("*")))
                    mdc += "-";// add standard mdc separator

                mdc += graphic.getCode();

                if (i == selectedGlypheIndex)
                    mdc = insertMarkerBehindSingleCode(mdc, MDC_SELECTION);
                else if (graphic.isIgnored())
                    mdc = insertMarkerBehindSingleCode(mdc, MDC_IGNORE);

                i++;
			}
		}
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
		if (!(word.eContainer() instanceof BTSSenctence))
            return 0;

        BTSSenctence sentence = (BTSSenctence) word.eContainer();
        for (int i=sentence.getSentenceItems().indexOf(word); i>0; i--) {
            BTSSentenceItem leftSibbling = sentence.getSentenceItems().get(i-1);
            if (leftSibbling instanceof BTSWord) {
                if (!((BTSWord) leftSibbling).getGraphics().isEmpty()) {
                    BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
                    if (last != null)
                        return last.getInnerSentenceOrder();
                }

            } else if (leftSibbling instanceof BTSAmbivalence) {
                if (!((BTSAmbivalence) leftSibbling).getCases().isEmpty()) {

                    int biggest = 0;
                    for (BTSLemmaCase c : ((BTSAmbivalence) leftSibbling).getCases()) {
                        if (c.getScenario().isEmpty())
                            continue;

                        for (BTSAmbivalenceItem item : c.getScenario()) {
                            if (!(item instanceof BTSWord))
                                continue;

                            // FIXME  org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl cannot be cast to org.bbaw.bts.corpus.btsCorpusModel.BTSWord
                            // Ambivalence fälle bedenken!!!
                            if (!(leftSibbling instanceof BTSWord))
                                continue;

                            if (((BTSWord) leftSibbling).getGraphics().isEmpty())
                                continue;

                            BTSGraphic last = ((BTSWord) leftSibbling).getGraphics().get(((BTSWord) leftSibbling).getGraphics().size()- 1);
                            if (last == null)
                                continue;

                            biggest = last.getInnerSentenceOrder() > biggest ? last.getInnerSentenceOrder() : biggest;
                        }
                    }
                    if (biggest > 0)
                        return biggest;
                }
            }
        }
        return 0; //no sibbling, first word
	}

	@Override
	public String transformTextToJSeshMdCString(BTSText text) {
		String result = "";
		if (text == null || text.getTextContent() == null || text.getTextContent().getTextItems().isEmpty())
            return "";

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
							glyphs.add("-!");
						glyphs.add(new String("\"" + m + "\""));

					}

					Collections.sort(glyphs, getGlyphsStringComparator());

					int lineLength = 0;
					boolean inBracket = false;
					for (int i = 0; i < glyphs.size(); i++) {
						Object o = glyphs.get(i);
						String mdc = "";
						if (o instanceof BTSGraphic)
							mdc = ((BTSGraphic) o).getCode();
						else
							mdc = (String) o;

						if (mdc == null)
                            continue;
						
						if (result.length() == 0 || result.endsWith("-") || mdc.startsWith("-") || mdc.startsWith(":"))
							result += mdc;
						else
							result += "-" + mdc;

						if (mdc.contains("<") && !mdc.contains(">"))
							inBracket = true;
						else if (mdc.contains(">") && !mdc.contains("<"))
							inBracket = false;
						
						lineLength = lineLength + mdc.length();
						if (result.endsWith("-!")) {
							lineLength = 0;
                        } else if (!inBracket && lineLength > 40) {
							if (!result.endsWith("-!"))
								result += "-!";
							lineLength = 0;
						}
					}
				}
				result += "-O-!";
			}
		}

		result = result.replace("-!-!", "-!");
		if (result.startsWith("-!"))
			result = result.substring(2);

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
	
	@Override
	public BTSText createNewText(BTSCorpusObject parentObject) {
		return textService.createNewRelationPartOf(parentObject);
	}

	@Override
	public Image transformToSWT(BufferedImage bufferedImage)
	{

		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			DirectColorModel colorModel = (DirectColorModel) bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha())
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
				}
			}

			return new Image(Display.getCurrent(), data);

		} else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
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
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);

			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(),
					colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}

			return new Image(Display.getCurrent(), data);

		} else return null;
	}

	public BufferedImage getImageData(String topItemList, int height, int width) throws MDCSyntaxError {
        MDCDrawingFacade facade = new MDCDrawingFacade();
        facade.setDrawingSpecifications(drawingSpecifications);
        facade.setMaxSize(200, 45);
        facade.setCadratHeight(30);
        try {
            return facade.createImage(topItemList);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(topItemList);
            return null;
        }
	}
	
	public BufferedImage getImageData(String topItemList) throws MDCSyntaxError {
		return getImageData(topItemList, 200, 45);
	}

	@Override
	public BTSLemmaEntry findLemmaEntry(String lemmaId, IProgressMonitor monitor) {
		return lemmaService.find(lemmaId, monitor);
	}

	@Override
    public boolean testTextValidAgainstGrammar(BTSTextContent textContent, BTSObject object) {
        try {
            Document doc = new Document();
            transformToDocument(textContent, doc, null, null, null, null, null);
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
		if (o instanceof Injector)
			return (Injector) o;

        EgyDslActivator activator = EgyDslActivator.getInstance();
        Injector injector = activator.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
        context.set(BTSEGYUIConstants.EGYDSL_INJECTOR, injector);
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
		int wordCount = 0;
		int sentenceCount = 0;

		if (text.getTextContent() == null)
			return new int[]{100,100,100,100,100};

		for (BTSTextItems textItems : text.getTextContent().getTextItems())
		{
			if (!(textItems instanceof BTSSenctence))
                continue;

            BTSSenctence sentence = (BTSSenctence) textItems;
            sentenceCount++;
            if (sentence.getTranslation() != null && sentence.getTranslation().getTranslation(null) != null)
                sentTrans++;

            for (BTSSentenceItem sentenceItem : sentence.getSentenceItems())
            {
                if (!(sentenceItem instanceof BTSWord))
                    continue;
                wordCount++;

                BTSWord w = (BTSWord) sentenceItem;
                if (w.getLKey() != null && !"".equals(w.getLKey()))
                    lemma++;
                
                if (w.getFlexCode() != null && !"".equals(w.getFlexCode()))
                    flex++;
                
                if (w.getGraphics() != null && !w.getGraphics().isEmpty())
                    hiero++;
                
                if (w.getTranslation() != null && w.getTranslation().getTranslation(null) != null)
                    wordTrans++;
            }
		}

		if (wordCount == 0)
			return new int[]{100,100,100,100,100};

        return new int[]{
		    (lemma      * 100) / wordCount,
		    (flex       * 100) / wordCount,
		    (hiero      * 100) / wordCount,
		    (wordTrans  * 100) / wordCount,
		    (sentTrans  * 100) / sentenceCount};
	}

	@Override
	public List<BTSText> listInAllInCompleteTexts(IProgressMonitor monitor) {
        String[] params = new String[3];
        List<BTSText> invalidtexts = new Vector<BTSText>();
        String[] active_corpora= textService.getActive_corpora(null);
        for (String active_corpus : active_corpora) {
            try {
                do {
                    List<BTSText> texts = textService.listChunks(100, params, active_corpus, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
                    if (texts == null)
                        break;

                    for (BTSText t : texts) {
                        if (monitor.isCanceled())
                            break;
                        checkAndFullyLoad(t, false);
                        monitor.worked(1);

                        if (!testTextComplete(t))
                            invalidtexts.add(t);
                        monitor.worked(1);
                    }
                     params = new String[]{params[1], params[2], null};
                } while(params[1] != null);
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
			if (i < 100) return false;
		return true;
	}

	@Override
	public BTSSentenceItem copySentenceItem(BTSSentenceItem item) {
		return textService.copySentenceItem(item);
	}

	@Override
	public BTSSenctence copySentence(BTSSenctence item) {
		return textService.copySentence(item);
	}

	@Override
	public Collection<BTSSentenceItem> copySentenceItems(Collection<BTSSentenceItem> items) {
		return textService.copySentenceItems(items);
	}

	@Override
	public Collection<BTSSenctence> copySentences(Collection<BTSSenctence> sents) {
		return textService.copySentences(sents);
    }
}
