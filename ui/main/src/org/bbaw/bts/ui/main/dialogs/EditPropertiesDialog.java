package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class EditPropertiesDialog extends TitleAreaDialog {

    private static final String KEY = "Key";
    private static final String VALUE = "Value";
    public static final String[] PROPS = {KEY, VALUE};
    private static final String[] PROPERTY_PROPOSALS = new String[]{
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_PREFIX,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MIN,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MAX,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_STEP,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_BEGIN,
            BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER};
    private List<List<String>> properties;

    public EditPropertiesDialog(Shell parentShell, Map<String, String> inputPorperties) {
        super(parentShell);
        loadProperties(inputPorperties);
    }

    private void loadProperties(Map<String, String> inputPorperties) {
        properties = new ArrayList<>(inputPorperties.size());
        for (String k : inputPorperties.keySet()) {
            List<String> prop = new ArrayList<>(2);
            prop.add(k);
            if (inputPorperties.get(k) != null) {
                prop.add(inputPorperties.get(k));
            } else {
                prop.add("");
            }
            properties.add(prop);
        }

    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        // Add a button to create the new person
        Button newProperty = new Button(composite, SWT.PUSH);
        newProperty.setText("Create New Property");

        // Add the TableViewer
        final TableViewer tv = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER);
        tv.setContentProvider(new PropertiesContentProvider());
        tv.setLabelProvider(new PropertiesLabelProvider());
        tv.setInput(properties);

        // Set up the table
        Table table = tv.getTable();
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        TableColumn kc = new TableColumn(table, SWT.CENTER);
        kc.setText(KEY);
        kc.setWidth(150);
        TableColumn kv = new TableColumn(table, SWT.CENTER);
        kv.setText(VALUE);
        kv.setWidth(250);
//
//	    for (int i = 0, n = table.getColumnCount(); i < n; i++) {
//	      table.getColumn(i).pack();
//	    }

        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        // Add a new person when the user clicks button
        newProperty.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                List<String> prop = new ArrayList<>(2);
                prop.add("key");
                prop.add("value");
                properties.add(prop);
                tv.refresh();
            }
        });

        // Create the cell editors
        CellEditor[] editors = new CellEditor[2];
        ComboBoxViewerCellEditor comboEditor = new ComboBoxViewerCellEditor(table);
        comboEditor.setContentProvider(new ArrayContentProvider());
        comboEditor.setLabelProvider(new LabelProvider());
        comboEditor.setInput(PROPERTY_PROPOSALS);

        editors[0] = comboEditor;
        editors[1] = new TextCellEditor(table);


        // Set the editors, cell modifier, and column properties
        tv.setColumnProperties(PROPS);
        tv.setCellModifier(new PropertyCellModifier(tv));
        tv.setCellEditors(editors);

        tv.refresh();
        return composite;

    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
                true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(500, 400);
    }

    public Map<String, String> getProperties() {
        Map<String, String> props = new HashMap<>(properties.size());
        for (List<String> prop : properties) {
            if (prop.get(0) != null && !"".equals(prop.get(0).trim())
                    && prop.get(1) != null && !"".equals(prop.get(1).trim())) {
                props.put(prop.get(0), prop.get(1));
            }
        }
        return props;
    }

    class PropertiesContentProvider implements IStructuredContentProvider {

        public Object[] getElements(Object inputElement) {
            return ((List) inputElement).toArray();
        }

        public void dispose() {
            // Do nothing
        }

        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            // Ignore
        }
    }

    class PropertiesLabelProvider implements ITableLabelProvider {

        public Image getColumnImage(Object element, int columnIndex) {
            return null;
        }

        public String getColumnText(Object element, int columnIndex) {
            List<String> p = (List<String>) element;
            switch (columnIndex) {
                case 0:
                    return p.get(columnIndex);
                case 1:
                    return p.get(columnIndex);
            }
            return null;
        }

        public void addListener(ILabelProviderListener listener) {
            // Ignore it
        }

        public void dispose() {
            // Nothing to dispose
        }

        public boolean isLabelProperty(Object element, String property) {
            return false;
        }

        public void removeListener(ILabelProviderListener listener) {
            // Ignore
        }
    }

    class PropertyCellModifier implements ICellModifier {
        private Viewer viewer;

        public PropertyCellModifier(Viewer viewer) {
            this.viewer = viewer;
        }

        public boolean canModify(Object element, String property) {
            // Allow editing of all values
            return true;
        }

        public Object getValue(Object element, String property) {
            List<String> p = (List<String>) element;
            if (EditPropertiesDialog.KEY.equals(property))
                return p.get(0);
            else if (EditPropertiesDialog.VALUE.equals(property))
                return p.get(1);
            else
                return null;
        }

        public void modify(Object element, String property, Object value) {
            if (element instanceof Item)
                element = ((Item) element).getData();
            List<String> p = (List<String>) element;
            if (EditPropertiesDialog.KEY.equals(property))
                p.set(0, (String) value);
            else if (EditPropertiesDialog.VALUE.equals(property))
                p.set(1, (String) value);

            // Force the viewer to refresh
            viewer.refresh();
        }
    }
}
