package org.bbaw.bts.ui.egy.compare;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class CompareViewerFactoryEgyLemmaImpl implements CompareViewerFactory {

    protected BTSResourceProvider resourceProvider = StaticAccessController.getContext().get(BTSResourceProvider.class);
    private CompareViewer compareViewer;
    private IEclipseContext context;

    @Override
    public <T> boolean hasViewerForObject(Class<T> clazz) {
        return BTSLemmaEntry.class.isAssignableFrom(clazz);
    }

    @Override
    public CompareViewer createViewer(Composite parent, int style) {

        if (context == null) {
            context = StaticAccessController.getContext();
        }
        IEclipseContext child = context.createChild();
        child.set(Composite.class, parent);
        compareViewer = ContextInjectionFactory.make(
                CompareViewerEgyLemmaImpl.class, child);
        return compareViewer;
    }

    @Override
    public String getCompareViewerName() {
        return "Egyptian Lemma Editor";
    }

    @Override
    public Image getCompareViewerIcon() {
        return resourceProvider.getImage(Display.getDefault(), BTSResourceProvider.IMG_LEMMA);
    }

}
