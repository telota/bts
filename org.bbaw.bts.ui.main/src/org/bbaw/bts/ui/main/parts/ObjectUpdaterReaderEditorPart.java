package org.bbaw.bts.ui.main.parts;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.commons.viewerSorter.BTSUserManagerViewerComparator;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;

public class ObjectUpdaterReaderEditorPart extends Composite {

    private static final String[] databaseRoles = new String[]{
            "Readers", "Updaters"};
    private static final String[] databaseRolesDescs = new String[]{
            "Readers may view the object.", "Updaters may modify the object.",};
    protected TreeNodeWrapper selectedTreeNode;
    protected Object selectedTreeObject;
    @Inject
    private BTSResourceProvider resourceProvider;
    @Inject
    @Optional
    @Named(IServiceConstants.ACTIVE_SELECTION)
    private BTSDBBaseObject dbBaseObject;
    @Inject
    private EditingDomainController editingDomainController;
    @Inject
    private UserManagerController userManagerController;
    @Inject
    private BTSUserController userController;
    @Inject
    @Active
    private Shell parentShell;
    // Get UISynchronize injected as field
    @Inject
    private UISynchronize sync;
    private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
            ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    private Composite composite;
    private ToolItem roles_ToolUndo;
    private ToolItem roles_ToolRedo;
    private SashForm roles_sashForm;
    private Composite roles_composite_Left;
    private TreeViewer roles_treeViewer;
    private Composite roles_composite_right;
    private ISelectionChangedListener roles_selectionListener;
    private WritableList roles_list;
    private Label lblUserGroup_1;
    private Label lblGroupName;
    private Text text;
    private Link roles_group_removeGroupfromRole_link;
    private Label lblUser_1;
    private Label lblForename_1;
    private Text roles_user_forename_text;
    private Label lblSurname;
    private Text roles_user_surname_text;
    private Object observableLisAllUsers;
    private Object observableLisAllUserGroups;
    private HashMap<String, BTSUserGroup> userGroupMap;
    private HashMap<String, BTSUser> userMap;
    private Label lblUserRoleDefinition;
    private Label lblRoleName;
    private Text roles_rolesDesc_name_text;
    private HashMap<String, String> roleDescMap;

    private ComboViewer roles_rolesDesc_users_comboViewer;

    private Link roles_roleDesc_assignUser_link;

    private Group grpAssignUserGroup;

    private Label lblSelectUserGroup;

    private ComboViewer roles_rolesDesc_group_comboViewer;

    private Link roles_roleDesc_assignGroup_link;

    private Link roles_roleDesc_removeRoleDesc_link;

    @Inject
    public ObjectUpdaterReaderEditorPart(Composite parent) {
        super(parent, SWT.None);
        parentShell = parent.getShell();
    }

    private void init() {
        roleDescMap = new HashMap<>();
        for (int i = 0; i < databaseRoles.length; i++) {
            roleDescMap.put(databaseRoles[i], databaseRolesDescs[i]);
        }
        loadAllUsers();
        loadAllUserGroups();

    }

    @PostConstruct
    public void postConstruct() {
        init();
        this.setLayout(new GridLayout(1, false));
        ((GridLayout) this.getLayout()).marginHeight = 0;
        ((GridLayout) this.getLayout()).marginHeight = 0;
        GridData gridLayoutData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        this.setLayoutData(gridLayoutData);

        composite = new Composite(this, SWT.NONE);
        composite.setLayoutData(gridLayoutData);
        composite.setLayout(new GridLayout(1, false));

        ToolBar roles_toolbar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);

        roles_ToolUndo = new ToolItem(roles_toolbar, SWT.NONE);
        roles_ToolUndo.setText("Undo");
        roles_ToolUndo.setImage(resourceProvider.getImage(Display.getDefault(),
                BTSResourceProvider.IMG_UNDO));
        roles_ToolUndo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                getEditingDomain(dbBaseObject).getCommandStack().undo();
            }
        });

        roles_ToolRedo = new ToolItem(roles_toolbar, SWT.NONE);
        roles_ToolRedo.setText("Redo");
        roles_ToolRedo.setImage(resourceProvider.getImage(Display.getDefault(),
                BTSResourceProvider.IMG_REDO));
        roles_ToolRedo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                getEditingDomain(dbBaseObject).getCommandStack().redo();
            }
        });

        roles_sashForm = new SashForm(composite, SWT.NONE);
        roles_sashForm.setLayoutData(gridLayoutData);

        roles_composite_Left = new Composite(roles_sashForm, SWT.NONE);
        roles_composite_Left.setLayout(new GridLayout(1, false));

        Label lblDatabaseCollectionsAnd = new Label(roles_composite_Left,
                SWT.NONE);
        lblDatabaseCollectionsAnd
                .setText("Readers and Updaters of Current Object");


        roles_treeViewer = new TreeViewer(roles_composite_Left, SWT.BORDER);
        Tree roles_tree = roles_treeViewer.getTree();
        roles_tree.setLayoutData(gridLayoutData);
        roles_treeViewer.setComparator(new BTSUserManagerViewerComparator());

        roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
        roles_composite_right.setLayout(new GridLayout(2, false));

        roles_sashForm.setWeights(new int[]{1, 1});
        loadRolesTree();
        this.layout();
    }

    private EditingDomain getEditingDomain(Object object) {
        return editingDomainController.getEditingDomain(object);
    }

    private void loadRolesTree() {
        AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
                adapterFactory);
        AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
                adapterFactory);
        // AdapterFactoryContentProvider contentProvider = new
        // AdapterFactoryContentProvider(factory);
        // roles_treeViewer.setContentProvider(contentProvider);
        roles_treeViewer.setLabelProvider(labelProvider);
        // ObservableListTreeContentProvider contentProvider = new
        // ObservableListTreeContentProvider(
        // new ProjectDBCollectionTreeFactory(),
        // new ProjectDBCollectionTreeStructureAdvisor());
        roles_treeViewer.setContentProvider(contentProvider);
        roles_selectionListener = new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (StructuredSelection) event
                        .getSelection();
                if (selection.getFirstElement() instanceof TreeNodeWrapper)
                    selectedTreeNode = (TreeNodeWrapper) selection
                            .getFirstElement();
                handleRolesTreeSelection(selection);
            }

        };

        roles_treeViewer.addSelectionChangedListener(roles_selectionListener);
        TreeNodeWrapper roles = BtsviewmodelFactory.eINSTANCE
                .createTreeNodeWrapper();
        TreeNodeWrapper readers = BtsviewmodelFactory.eINSTANCE
                .createTreeNodeWrapper();
        readers.setLabel(databaseRoles[0]); // "Readers"
        readers.setChildrenLoaded(false);
        roles.getChildren().add(readers);
        TreeNodeWrapper updaters = BtsviewmodelFactory.eINSTANCE
                .createTreeNodeWrapper();
        updaters.setLabel(databaseRoles[1]); // "Updaters"
        updaters.setChildrenLoaded(false);

        roles.getChildren().add(updaters);
        roles_treeViewer.setInput(roles);
    }

    protected void handleRolesTreeSelection(IStructuredSelection selection) {
        if (selection.getFirstElement() instanceof BTSIdentifiableItem) {
            selectedTreeObject = (BTSIdentifiableItem) selection
                    .getFirstElement();
            if (selectedTreeObject instanceof BTSUser) {
                loadDBRoleDescUserEditComposite((BTSUser) selectedTreeObject);
                enableRolesUndoRedo();
            } else if (selection.getFirstElement() instanceof BTSUserGroup) {
                loadDBRoleDescUserGroupEditComposite((BTSUserGroup) selectedTreeObject);
                enableRolesUndoRedo();
            }
            if (selectedTreeObject == null
                    || !selectedTreeObject.equals(selection.getFirstElement()))
                selectedTreeObject = (BTSIdentifiableItem) selection
                        .getFirstElement();
        } else if (selection.getFirstElement() instanceof TreeNodeWrapper) {
            TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
            selectedTreeNode = tn;
            if (tn.getObject() == null) {
                if (!tn.isChildrenLoaded()) {
                    List<TreeNodeWrapper> parents = new Vector<>(1);
                    parents.add(tn);
                    loadChildren(parents);
                }
                loadDBRoleDescEditComposite();
                enableRolesUndoRedo();
            }
            if (tn.getObject() instanceof BTSUserGroup) {
                loadDBRoleDescUserGroupEditComposite((BTSUserGroup) tn
                        .getObject());
                enableRolesUndoRedo();
            } else if (tn.getObject() instanceof BTSUser) {
                loadDBRoleDescUserEditComposite((BTSUser) tn.getObject());
                enableRolesUndoRedo();
            }
        }

    }

    private void loadAllUserGroups() {
        Realm.runWithDefault(DisplayRealm.getRealm(Display.getDefault()), new Runnable() {
            @Override
            public void run() {
                List<BTSUserGroup> groups = userManagerController.listUserGroups(null);
                observableLisAllUserGroups = new WritableList(groups,
                        BTSUserGroup.class);
                userGroupMap = new HashMap<>(groups.size());
                for (BTSUserGroup u : groups)
                    userGroupMap.put(u.get_id(), u);
            }
        });
    }

    private void loadAllUsers() {
        Realm.runWithDefault(DisplayRealm.getRealm(Display.getDefault()), new Runnable() {
            @Override
            public void run() {
                List<BTSUser> users = userManagerController.listUsers(null);
                observableLisAllUsers = new WritableList(users, BTSUser.class);
                userMap = new HashMap<>(users.size());
                for (BTSUser u : users)
                    userMap.put(u.getUserName(), u);
            }
        });
    }

    private void loadDBRoleDescEditComposite() {
        if (roles_composite_right != null) {
            roles_composite_right.dispose();
            roles_composite_right = null;
        }
        if (observableLisAllUsers == null)
            loadAllUsers();
        if (observableLisAllUserGroups == null)
            loadAllUserGroups();
        roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
        roles_composite_right.setLayout(new GridLayout(3, false));
        lblUserRoleDefinition = new Label(roles_composite_right, SWT.NONE);
        lblUserRoleDefinition.setLayoutData(new GridData(SWT.CENTER,
                SWT.CENTER, true, false, 1, 1));
        lblUserRoleDefinition.setText("User Role Definition");

        lblRoleName = new Label(roles_composite_right, SWT.NONE);
        lblRoleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
                false, 1, 1));
        lblRoleName.setText("Role Name");

        roles_rolesDesc_name_text = new Text(roles_composite_right, SWT.BORDER);
        roles_rolesDesc_name_text.setLayoutData(new GridData(SWT.FILL,
                SWT.CENTER, true, false, 1, 1));
        roles_rolesDesc_name_text.setEditable(false);
        if (selectedTreeNode.getLabel() != null)
            roles_rolesDesc_name_text
                    .setText(((TreeNodeWrapper) selectedTreeNode)
                            .getLabel());
        // Label lblRoleDesc = new Label(roles_composite_right, SWT.NONE);
        // lblRoleDesc.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
        // false, 1, 1));
        // lblRoleDesc.setText("Role Description");

        Text txt_rolesDesc = new Text(roles_composite_right, SWT.BORDER
                | SWT.MULTI | SWT.WRAP);
        txt_rolesDesc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
                false, 3, 2));
        txt_rolesDesc.setEditable(false);
        String desc = roleDescMap.get(((TreeNodeWrapper) selectedTreeNode)
                .getLabel());
        if (desc != null) {
            txt_rolesDesc.setText(desc);
        }

        Group grpAssignUser = new Group(roles_composite_right, SWT.NONE);
        grpAssignUser.setLayout(new GridLayout(2, false));
        grpAssignUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
                false, 3, 1));
        grpAssignUser.setText("Assign User");

        Label lblSelectUser = new Label(grpAssignUser, SWT.NONE);
        lblSelectUser.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
                false, 1, 1));
        lblSelectUser.setText("Select User");
        lblSelectUser.pack();

        roles_rolesDesc_users_comboViewer = new ComboViewer(grpAssignUser,
                SWT.READ_ONLY);
        roles_rolesDesc_users_comboViewer.getCombo().setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
                adapterFactory);
        roles_rolesDesc_users_comboViewer
                .setContentProvider(new ObservableListContentProvider());
        roles_rolesDesc_users_comboViewer.setLabelProvider(labelProvider);
        roles_rolesDesc_users_comboViewer.setComparator(new BTSUserManagerViewerComparator());
        roles_rolesDesc_users_comboViewer.setInput(observableLisAllUsers);

        roles_roleDesc_assignUser_link = new Link(grpAssignUser, SWT.NONE);
        roles_roleDesc_assignUser_link.setText("<a>Assign role to user</a>");
        roles_roleDesc_assignUser_link.setLayoutData(new GridData(SWT.FILL,
                SWT.CENTER, true, false, 2, 1));
        roles_roleDesc_assignUser_link
                .addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (roles_rolesDesc_users_comboViewer.getSelection() != null) {
                            IStructuredSelection sel = (IStructuredSelection) roles_rolesDesc_users_comboViewer
                                    .getSelection();
                            if (sel.getFirstElement() != null) {
                                BTSUser u = (BTSUser) sel.getFirstElement();
                                TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
                                        .wrappObject(u);
                                tn.setParent(selectedTreeNode);
                                tn.setChildrenLoaded(true);
                                CompoundCommand compoundCommand = new CompoundCommand();
                                Command c1 = AddCommand
                                        .create(
                                                getEditingDomain(dbBaseObject),
                                                selectedTreeNode,
                                                BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN,
                                                tn);
                                compoundCommand.append(c1);
                                Command command = null;
                                if (selectedTreeNode.getLabel().equals(
                                        databaseRoles[0])) { // "Readers"
                                    command = AddCommand
                                            .create(getEditingDomain(dbBaseObject),
                                                    dbBaseObject,
                                                    BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
                                                    u.getUserName());
                                } else if (selectedTreeNode.getLabel().equals(
                                        databaseRoles[1])) { // "Updaters"
                                    command = AddCommand
                                            .create(getEditingDomain(dbBaseObject),
                                                    dbBaseObject,
                                                    BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
                                                    u.getUserName());
                                }
                                if (command != null) {
                                    compoundCommand.append(command);
                                    getEditingDomain(dbBaseObject)
                                            .getCommandStack().execute(
                                            compoundCommand);
                                }
                                roles_treeViewer.refresh();

                            }
                        }

                    }
                });

        grpAssignUserGroup = new Group(roles_composite_right, SWT.NONE);
        grpAssignUserGroup.setLayout(new GridLayout(2, false));
        grpAssignUserGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
                false, false, 3, 1));
        grpAssignUserGroup.setText("Assign User Group");

        lblSelectUserGroup = new Label(grpAssignUserGroup, SWT.NONE);
        lblSelectUserGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
                false, false, 1, 1));
        lblSelectUserGroup.setText("Select Group");
        lblSelectUserGroup.pack();

        roles_rolesDesc_group_comboViewer = new ComboViewer(grpAssignUserGroup,
                SWT.READ_ONLY);
        roles_rolesDesc_group_comboViewer.getCombo().setLayoutData(
                new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        roles_rolesDesc_group_comboViewer
                .setContentProvider(new ObservableListContentProvider());
        roles_rolesDesc_group_comboViewer.setLabelProvider(labelProvider);
        roles_rolesDesc_group_comboViewer.setInput(observableLisAllUserGroups);
        roles_roleDesc_assignGroup_link = new Link(grpAssignUserGroup, SWT.NONE);
        roles_roleDesc_assignGroup_link
                .setText("<a>Assign role to whole user group</a>");
        roles_roleDesc_assignGroup_link.setLayoutData(new GridData(SWT.FILL,
                SWT.CENTER, true, false, 2, 1));
        roles_roleDesc_assignGroup_link
                .addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (roles_rolesDesc_group_comboViewer.getSelection() != null) {
                            IStructuredSelection sel = (IStructuredSelection) roles_rolesDesc_group_comboViewer
                                    .getSelection();
                            if (sel.getFirstElement() != null) {
                                BTSUserGroup ug = (BTSUserGroup) sel
                                        .getFirstElement();
                                TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
                                        .wrappObject(ug);
                                tn.setParent(selectedTreeNode);
                                tn.setChildrenLoaded(true);
                                CompoundCommand compoundCommand = new CompoundCommand();
                                Command c1 = AddCommand
                                        .create(
                                                getEditingDomain(dbBaseObject),
                                                selectedTreeNode,
                                                BtsviewmodelPackage.TREE_NODE_WRAPPER__CHILDREN,
                                                tn);
                                compoundCommand.append(c1);
                                Command command = null;
                                if (selectedTreeNode.getLabel().equals(
                                        databaseRoles[0])) { // "Readers"
                                    command = AddCommand
                                            .create(getEditingDomain(dbBaseObject),
                                                    dbBaseObject,
                                                    BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
                                                    ug.get_id());
                                } else if (selectedTreeNode.getLabel().equals(
                                        databaseRoles[1])) { // "Updaters";
                                    command = AddCommand
                                            .create(getEditingDomain(dbBaseObject),
                                                    dbBaseObject,
                                                    BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
                                                    ug.get_id());
                                }
                                if (command != null) {
                                    compoundCommand.append(command);
                                    getEditingDomain(dbBaseObject)
                                            .getCommandStack().execute(
                                            compoundCommand);
                                }
                                roles_treeViewer.refresh();

                            }
                        }

                    }
                });

        roles_composite_right.layout();
        roles_sashForm.setWeights(new int[]{10, 8});
        roles_sashForm.layout();

    }


    private void loadDBRoleDescUserGroupEditComposite(BTSUserGroup group) {
        if (roles_composite_right != null) {
            roles_composite_right.dispose();
            roles_composite_right = null;
        }
        roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
        roles_composite_right.setLayout(new GridLayout(2, false));

        lblUserGroup_1 = new Label(roles_composite_right, SWT.NONE);
        lblUserGroup_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true,
                false, 2, 1));
        lblUserGroup_1.setText("User Group");

        lblGroupName = new Label(roles_composite_right, SWT.NONE);
        lblGroupName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
                false, 1, 1));
        lblGroupName.setText("Group name");

        text = new Text(roles_composite_right, SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        text.setText(group.getName());
        text.setEditable(false);

        roles_group_removeGroupfromRole_link = new Link(roles_composite_right,
                SWT.NONE);
        roles_group_removeGroupfromRole_link.setLayoutData(new GridData(
                SWT.LEFT, SWT.BOTTOM, true, true, 2, 1));
        roles_group_removeGroupfromRole_link
                .setText("<a>Remove Group from role</a>");
        roles_group_removeGroupfromRole_link
                .addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (selectedTreeNode != null) {
                            Object parent = selectedTreeNode.getParent();
                            BTSUserGroup u = (BTSUserGroup) selectedTreeNode
                                    .getObject();
                            CompoundCommand compoundCommand = new CompoundCommand();
                            Command c1 = RemoveCommand.create(
                                    getEditingDomain(dbBaseObject),
                                    selectedTreeNode);
                            compoundCommand.append(c1);
                            Command command = null;
                            if (((TreeNodeWrapper) parent).getLabel().equals(
                                    databaseRoles[0])) { // "Readers"
                                command = RemoveCommand
                                        .create(getEditingDomain(dbBaseObject),
                                                dbBaseObject,
                                                BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
                                                u.get_id());
                            } else if (((TreeNodeWrapper) parent).getLabel().equals(
                                    databaseRoles[1])) { // "Updaters"
                                command = RemoveCommand
                                        .create(getEditingDomain(dbBaseObject),
                                                dbBaseObject,
                                                BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
                                                u.get_id());
                            }
                            if (command != null) {
                                compoundCommand.append(command);
                                getEditingDomain(dbBaseObject).getCommandStack()
                                        .execute(compoundCommand);
                            }
                            roles_treeViewer.refresh();
                        }

                    }
                });

        roles_sashForm.setWeights(new int[]{10, 8});
        roles_sashForm.layout();

    }

    private void loadDBRoleDescUserEditComposite(BTSUser user) {
        if (roles_composite_right != null) {
            roles_composite_right.dispose();
            roles_composite_right = null;
        }
        roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
        roles_composite_right.setLayout(new GridLayout(2, false));

        lblUser_1 = new Label(roles_composite_right, SWT.NONE);
        lblUser_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true,
                false, 2, 1));
        lblUser_1.setText("User");

        lblForename_1 = new Label(roles_composite_right, SWT.NONE);
        lblForename_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
                false, 1, 1));
        lblForename_1.setText("Forename");

        roles_user_forename_text = new Text(roles_composite_right, SWT.BORDER);
        roles_user_forename_text.setLayoutData(new GridData(SWT.FILL,
                SWT.CENTER, true, false, 1, 1));
        roles_user_forename_text.setEditable(false);
        if (user.getForeName() != null) {
            roles_user_forename_text.setText(user.getForeName());
        }

        lblSurname = new Label(roles_composite_right, SWT.NONE);
        lblSurname.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
                false, 1, 1));
        lblSurname.setText("Surname");

        roles_user_surname_text = new Text(roles_composite_right, SWT.BORDER);
        roles_user_surname_text.setLayoutData(new GridData(SWT.FILL,
                SWT.CENTER, true, false, 1, 1));
        roles_user_surname_text.setEditable(false);
        if (user.getSureName() != null) {
            roles_user_surname_text.setText(user.getSureName());
        }

        Link roles_user_removeRolefromUser_link = new Link(
                roles_composite_right, SWT.NONE);
        roles_user_removeRolefromUser_link.setLayoutData(new GridData(SWT.LEFT,
                SWT.BOTTOM, false, true, 2, 1));
        roles_user_removeRolefromUser_link
                .setText("<a>Remove Role from User</a>");
        roles_user_removeRolefromUser_link
                .addSelectionListener(new SelectionAdapter() {

                    @Override
                    public void widgetSelected(SelectionEvent e) {
                        if (selectedTreeNode != null) {
                            Object parent = selectedTreeNode.getParent();
                            BTSUser u = (BTSUser) selectedTreeNode.getObject();
                            CompoundCommand compoundCommand = new CompoundCommand();
                            Command c1 = RemoveCommand.create(
                                    getEditingDomain(dbBaseObject),
                                    selectedTreeNode);
                            compoundCommand.append(c1);
                            Command command = null;
                            if (((TreeNodeWrapper) parent).getLabel().equals(
                                    databaseRoles[0])) { // "Readers"
                                command = RemoveCommand
                                        .create(getEditingDomain(dbBaseObject),
                                                dbBaseObject,
                                                BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__READERS,
                                                u.getUserName());
                            } else if (((TreeNodeWrapper) parent).getLabel().equals(
                                    databaseRoles[1])) { // "Updaters"
                                command = RemoveCommand
                                        .create(getEditingDomain(dbBaseObject),
                                                dbBaseObject,
                                                BtsmodelPackage.Literals.BTSDB_BASE_OBJECT__UPDATERS,
                                                u.getUserName());
                            }
                            if (command != null) {
                                compoundCommand.append(command);
                                getEditingDomain(dbBaseObject).getCommandStack()
                                        .execute(compoundCommand);
                            }
                            roles_treeViewer.refresh();

                        }

                    }
                });

        roles_sashForm.setWeights(new int[]{10, 8});
        roles_sashForm.layout();

    }

    private void enableRolesUndoRedo() {
        roles_ToolUndo.setEnabled(getEditingDomain(dbBaseObject)
                .getCommandStack().canUndo());
        roles_ToolRedo.setEnabled(getEditingDomain(dbBaseObject)
                .getCommandStack().canRedo());
    }

    private void loadChildren(final List<TreeNodeWrapper> parents) {
        for (TreeNodeWrapper parent : parents) {
            if (!parent.isChildrenLoaded()) {
                List<BTSObject> children = new Vector<>();
                List<String> ids = null;
                if (parent.getLabel().equals(databaseRoles[0])) {
                    ids = dbBaseObject.getReaders();
                } else {
                    ids = dbBaseObject.getUpdaters();
                }
                for (String id : ids) {
                    BTSObject o = userMap.get(id);
                    o = (o == null) ? userGroupMap.get(id) : o;
                    if (o != null)
                        children.add(o);
                }
                for (BTSObject o : children) {
                    TreeNodeWrapper tn = wrapObject(o);
                    tn.setParent(parent);
                    // grandChildren.add(tn);
                    parent.getChildren().add(tn);
                    roles_treeViewer.expandToLevel(tn, 0);
                }
                parent.setChildrenLoaded(true);
                roles_treeViewer.refresh();
            }
        }
    }

    @Inject
    void setSelection(
            @Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection) {
        if (selection == null) {
            /* implementation not shown */
        } else if (dbBaseObject == null || !dbBaseObject.equals(selection)) {

            this.dbBaseObject = selection;
        }
    }

    private TreeNodeWrapper wrapObject(BTSObject o) {
        return BtsviewmodelFactory.eINSTANCE.wrappObject(o);
    }

    public void save(Object object) {
        userManagerController.saveDBBaseObject(dbBaseObject);

    }

}
