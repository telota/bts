package org.eclipse.xtext.ui.editor.info;

import java.io.InputStream;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

/**
 * @author Michael Clay
 * @author Jan Koehnlein
 */
public class ResourceForResourceWorkingCopyEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {

    @Override
    public Resource createResource(IEditorInput editorInput) {
        if (editorInput instanceof ResourceWorkingCopyFileEditorInput) {
            return createWorkingCopy((ResourceWorkingCopyFileEditorInput) editorInput);
        } else {
            return super.createResource(editorInput);
        }
    }

    protected Resource createWorkingCopy(ResourceWorkingCopyFileEditorInput editorInput) {
        try {
            ResourceSet resourceSet = getResourceSet(editorInput.getFile());
            Resource workingCopy = resourceSet.createResource(editorInput.getResource().getURI());
            try (InputStream inputStream = editorInput.getFile().getContents()) {
                workingCopy.load(inputStream, Collections.singletonMap(XtextResource.OPTION_ENCODING, editorInput.getEncoding()));
            }
            return workingCopy;
        } catch (Exception exc) {
            throw new IllegalStateException(exc);
        }
    }
}
