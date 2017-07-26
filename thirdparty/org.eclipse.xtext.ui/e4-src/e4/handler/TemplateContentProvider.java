package e4.handler;


import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.jface.text.templates.persistence.TemplateStore;


/**
 * A content provider for the template preference page's table viewer.
 *
 * @since 3.0
 */
class TemplateContentProvider implements IStructuredContentProvider {

    /**
     * The template store.
     */
    private TemplateStore fStore;

    /*
     * @see IStructuredContentProvider#getElements(Object)
     */
    public Object[] getElements(Object input) {
        return fStore.getTemplateData(false);
    }

    /*
     * @see IContentProvider#inputChanged(Viewer, Object, Object)
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        fStore = (TemplateStore) newInput;
    }

    /*
     * @see IContentProvider#dispose()
     */
    public void dispose() {
        fStore = null;
    }

}

