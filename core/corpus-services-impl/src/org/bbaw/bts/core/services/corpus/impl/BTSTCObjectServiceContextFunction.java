package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSTCObjectServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSTCObjectServiceContextFunction extends ContextFunction {
    @Override
    public Object compute(IEclipseContext context) {
        System.out.println("Intitialize BTSTCObjectService");
        // Add the new object to the application context
        MApplication application = context.get(MApplication.class);
        IEclipseContext ctx = context;
        if (application != null) {
            ctx = application.getContext();
        }
        if (ctx == null) {
            ctx = context;
        }
        BTSTCObjectService tcObjectService = ContextInjectionFactory.make(BTSTCObjectServiceImpl.class, ctx);
        ctx.set(BTSTCObjectService.class, tcObjectService);

        return tcObjectService;
    }
}