/******************************************************************************
 Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.contentassist;

import java.util.List;

import org.eclipse.xtext.util.Strings;

import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FQNPrefixMatcher extends PrefixMatcher {

    // TODO make delegate injectable via named binding
    @Inject
    private PrefixMatcher.IgnoreCase delegate;

    @Inject(optional = true)
    @Named("org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.delimiter")
    private char delimiter = '.';

    @Inject
    private LastSegmentFinder lastSegmentFinder;

    @Override
    public boolean isCandidateMatchingPrefix(String name, String prefix) {
        if (delegate.isCandidateMatchingPrefix(name, prefix))
            return true;
        if (name.indexOf(delimiter) >= 0) { // assume a fqn if delimiter is present
            if (prefix.indexOf(delimiter) < 0) {
                // prefix is without a dot - either namespace or last segment
                // namespace was checked prior by delegate
                String lastSegment = lastSegmentFinder.getLastSegment(name, delimiter);
                if (lastSegment != null && delegate.isCandidateMatchingPrefix(lastSegment, prefix))
                    return true;
            } else {
                List<String> splitPrefix = Strings.split(prefix, '.');
                if (splitPrefix.isEmpty())
                    return false;
                List<String> splitName = Strings.split(name, '.');
                if (splitName.size() < splitPrefix.size()) {
                    return false;
                }
                for (int i = 0; i < splitPrefix.size(); i++) {
                    if (!delegate.isCandidateMatchingPrefix(splitName.get(i), splitPrefix.get(i)))
                        return false;
                }
                return true;
            }
        }
        return false;
    }

    public char getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public PrefixMatcher.IgnoreCase getDelegate() {
        return delegate;
    }

    public void setDelegate(PrefixMatcher.IgnoreCase delegate) {
        this.delegate = delegate;
    }

    public LastSegmentFinder getLastSegmentFinder() {
        return lastSegmentFinder;
    }

    public void setLastSegmentFinder(LastSegmentFinder lastSegmentFinder) {
        this.lastSegmentFinder = lastSegmentFinder;
    }

    @ImplementedBy(DefaultLastSegmentFinder.class)
    public interface LastSegmentFinder {
        String getLastSegment(String fqn, char delimiter);
    }

    public static class DefaultLastSegmentFinder implements LastSegmentFinder {

        public String getLastSegment(String fqn, char delimiter) {
            if (fqn == null || fqn.length() == 0)
                return null;
            boolean lookForUppercase = true;
            int lastDelimiterIndex = -1;
            for (int i = 0; i < fqn.length(); i++) {
                if (lookForUppercase) {
                    if (Character.isUpperCase(fqn.charAt(i))) {
                        return fqn.substring(i);
                    }
                }
                lookForUppercase = delimiter == fqn.charAt(i);
                if (lookForUppercase)
                    lastDelimiterIndex = i;
            }
            if (lastDelimiterIndex >= 0 && lastDelimiterIndex < fqn.length() - 1)
                return fqn.substring(lastDelimiterIndex + 1);
            return null;
        }

    }

}
