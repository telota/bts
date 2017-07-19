package org.bbaw.bts.corpus.text.egy.ui.custom;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;

import com.google.inject.Provider;

public class BTSE4ToGuiceXtextSourceViewerProvider implements Provider<XtextSourceViewer> {

    private static IEclipseContext context;

    public static void setContext(IEclipseContext ctx) {
        context = ctx;
    }

    @Override
    public XtextSourceViewer get() {
        if (context == null) return null;
        return context.get(XtextSourceViewer.class);
    }
}
