package e4.handler;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateVariableResolver;


/**
 * A content assist processor for template variables.
 * <p>
 * This class should not be used by clients and may become package visible in
 * the future.
 * </p>
 *
 * @since 3.0
 */
final class TemplateVariableProcessor implements IContentAssistProcessor {

    private static Comparator fgTemplateVariableProposalComparator = new Comparator() {
        public int compare(Object arg0, Object arg1) {
            TemplateVariableProposal proposal0 = (TemplateVariableProposal) arg0;
            TemplateVariableProposal proposal1 = (TemplateVariableProposal) arg1;

            return proposal0.getDisplayString().compareTo(proposal1.getDisplayString());
        }

        /*
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object arg0) {
            return false;
        }

        /*
         * Returns Object#hashCode.
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    };


    /**
     * the context type
     */
    private TemplateContextType fContextType;

    /**
     * Returns the context type.
     *
     * @return the context type
     */
    public TemplateContextType getContextType() {
        return fContextType;
    }

    /**
     * Sets the context type.
     *
     * @param contextType the context type for this processor
     */
    public void setContextType(TemplateContextType contextType) {
        fContextType = contextType;
    }

    /*
     * @see IContentAssistProcessor#computeCompletionProposals(ITextViewer, int)
     */
    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int documentOffset) {

        if (fContextType == null)
            return null;

        List proposals = new ArrayList();

        String text = viewer.getDocument().get();
        int start = getStart(text, documentOffset);

        String string = text.substring(start, documentOffset);
        String prefix = (string.length() >= 2)
                ? string.substring(2)
                : null;

        int length = documentOffset - start;

        for (Iterator iterator = fContextType.resolvers(); iterator.hasNext(); ) {
            TemplateVariableResolver variable = (TemplateVariableResolver) iterator.next();

            if (prefix == null || variable.getType().startsWith(prefix))
                proposals.add(new TemplateVariableProposal(variable, start, length, viewer));
        }

        Collections.sort(proposals, fgTemplateVariableProposalComparator);
        return (ICompletionProposal[]) proposals.toArray(new ICompletionProposal[proposals.size()]);
    }

    /* Guesses the start position of the completion */
    private int getStart(String string, int end) {
        int start = end;

        if (start >= 1 && string.charAt(start - 1) == '$')
            return start - 1;

        while ((start != 0) && Character.isUnicodeIdentifierPart(string.charAt(start - 1)))
            start--;

        if (start >= 2 && string.charAt(start - 1) == '{' && string.charAt(start - 2) == '$')
            return start - 2;

        return end;
    }

    /*
     * @see IContentAssistProcessor#computeContextInformation(ITextViewer, int)
     */
    public IContextInformation[] computeContextInformation(ITextViewer viewer, int documentOffset) {
        return null;
    }

    /*
     * @see IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
     */
    public char[] getCompletionProposalAutoActivationCharacters() {
        return new char[]{'$'};
    }

    /*
     * @see IContentAssistProcessor#getContextInformationAutoActivationCharacters()
     */
    public char[] getContextInformationAutoActivationCharacters() {
        return null;
    }

    /*
     * @see IContentAssistProcessor#getErrorMessage()
     */
    public String getErrorMessage() {
        return null;
    }

    /*
     * @see IContentAssistProcessor#getContextInformationValidator()
     */
    public IContextInformationValidator getContextInformationValidator() {
        return null;
    }

}

