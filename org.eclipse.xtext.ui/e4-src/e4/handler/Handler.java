package e4.handler;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.xtext.ui.editor.embedded.TextViewerOperationAction;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

/**
 * @since 2.4
 */
public class Handler {
    @Execute
    public void execute() {

        TextViewerOperationAction action = null;
        Bundle bundle = FrameworkUtil.getBundle(getClass());
        BundleContext bundleContext = bundle.getBundleContext();
        IEclipseContext context = EclipseContextFactory.getServiceContext(bundleContext);
        action = (TextViewerOperationAction) context.get(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);

//		TextViewerOperationAction action = new TextViewerOperationAction(bundle, prefix, viewer, operationCode);
        action.run();
    }

}