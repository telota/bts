package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSImageServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSImageServiceContextFunction extends ContextFunction {
    @Override
    public Object compute(IEclipseContext context) {
        System.out.println("Intitialize BTSImageService");
        // Add the new object to the application context
        MApplication application = context.get(MApplication.class);
        IEclipseContext ctx = context;
        if (application != null) {
            ctx = application.getContext();
        }
        if (ctx == null) {
            ctx = context;
        }
        BTSImageService imageService = ContextInjectionFactory.make(BTSImageServiceImpl.class, ctx);
        ctx.set(BTSImageService.class, imageService);

        return imageService;
    }
}