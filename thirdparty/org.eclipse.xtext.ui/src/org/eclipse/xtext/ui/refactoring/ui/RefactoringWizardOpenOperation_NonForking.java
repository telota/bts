package org.eclipse.xtext.ui.refactoring.ui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.ltk.core.refactoring.CheckConditionsOperation;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.internal.ui.refactoring.ExceptionHandler;
import org.eclipse.ltk.internal.ui.refactoring.RefactoringUIMessages;
import org.eclipse.ltk.internal.ui.refactoring.RefactoringWizardDialog;
import org.eclipse.ltk.internal.ui.refactoring.RefactoringWizardDialog2;
import org.eclipse.ltk.internal.ui.refactoring.WorkbenchRunnableAdapter;
import org.eclipse.ltk.ui.refactoring.RefactoringUI;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;

/**
 * Another class that had to be copied entirely from LTK to apply a simple change. We cannot execute the checking of
 * initial conditions in a separate thread, as we are holding the lock on the document.
 *
 * @see org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation
 * @since 2.4
 */
public class RefactoringWizardOpenOperation_NonForking {

    /**
     * @see RefactoringWizardOpenOperation#INITIAL_CONDITION_CHECKING_FAILED
     */
    public static final int INITIAL_CONDITION_CHECKING_FAILED = IDialogConstants.CLIENT_ID + 1;
    private RefactoringWizard fWizard;
    private RefactoringStatus fInitialConditions;

    /**
     * @see RefactoringWizardOpenOperation#RefactoringWizardOpenOperation
     */
    public RefactoringWizardOpenOperation_NonForking(RefactoringWizard wizard) {
        Assert.isNotNull(wizard);
        fWizard = wizard;
    }

    /**
     * @see RefactoringWizardOpenOperation#getInitialConditionCheckingStatus()
     */
    public RefactoringStatus getInitialConditionCheckingStatus() {
        return fInitialConditions;
    }

    /**
     * @see RefactoringWizardOpenOperation#run(Shell, String)
     */
    public int run(final Shell parent, final String dialogTitle) throws InterruptedException {
        return run(parent, dialogTitle, null);
    }

    /**
     * That one exists since
     * see RefactoringWizardOpenOperation#run(Shell, String, IRunnableContext)
     * - not a JavaDoc link since this breaks the build on Galileo :-)
     */
    public int run(final Shell parent, final String dialogTitle, final IRunnableContext context)
            throws InterruptedException {
        Assert.isNotNull(dialogTitle);
        final Refactoring refactoring = fWizard.getRefactoring();
        final IJobManager manager = Job.getJobManager();
        final int[] result = new int[1];
        final InterruptedException[] canceled = new InterruptedException[1];
        Runnable r = new Runnable() {
            public void run() {
                try {
                    // we are getting the block dialog for free if we pass in null
                    manager.beginRule(ResourcesPlugin.getWorkspace().getRoot(), null);

                    refactoring.setValidationContext(parent);
                    fInitialConditions = checkInitialConditions(refactoring, parent, dialogTitle, context);
                    if (fInitialConditions.hasFatalError()) {
                        String message = fInitialConditions.getMessageMatchingSeverity(RefactoringStatus.FATAL);
                        MessageDialog.openError(parent, dialogTitle, message);
                        result[0] = INITIAL_CONDITION_CHECKING_FAILED;
                    } else {
                        fWizard.setInitialConditionCheckingStatus(fInitialConditions);
                        /* CHANGE: don't use package private RefactoringUI */
                        Dialog dialog = createRefactoringWizardDialog(fWizard, parent);
                        dialog.create();
                        IWizardContainer wizardContainer = (IWizardContainer) dialog;
                        if (wizardContainer.getCurrentPage() == null)
							/*
							 * Don't show the dialog at all if there are no user
							 * input pages and change creation was cancelled.
							 */
                            result[0] = Window.CANCEL;
                        else
                            result[0] = dialog.open();
                    }
                } catch (InterruptedException e) {
                    canceled[0] = e;
                } catch (OperationCanceledException e) {
                    canceled[0] = new InterruptedException(e.getMessage());
                } finally {
                    manager.endRule(ResourcesPlugin.getWorkspace().getRoot());
                    refactoring.setValidationContext(null);
                    disposeRefactoringContext(fWizard);
                }
            }

        };
        BusyIndicator.showWhile(parent != null ? parent.getDisplay() : null, r);
        if (canceled[0] != null)
            throw canceled[0];
        return result[0];
    }

    /**
     * Only applicable for Eclipse >= 3.7, therefore reflective
     */
    private void disposeRefactoringContext(RefactoringWizard wizard) {
        try {
            Field refactoringContextField = getPrivateField(wizard.getClass(), "fRefactoringContext");
            refactoringContextField.setAccessible(true);
            Object refactoringContext = refactoringContextField.get(wizard);
            if (refactoringContext != null) {
                Method disposeMethod = refactoringContext.getClass().getMethod("dispose");
                disposeMethod.invoke(refactoringContext);
            }
        } catch (NoSuchFieldException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            // ignore
        }
    }

    /**
     * CHANGED to protected
     * CHANGED do not fork as we are keeping the resource lock.
     */
    protected RefactoringStatus checkInitialConditions(Refactoring refactoring, Shell parent, String title,
                                                       IRunnableContext context) throws InterruptedException {
        try {
            CheckConditionsOperation cco = new CheckConditionsOperation(refactoring,
                    CheckConditionsOperation.INITIAL_CONDITONS);
            WorkbenchRunnableAdapter workbenchRunnableAdapter = new WorkbenchRunnableAdapter(cco, ResourcesPlugin
                    .getWorkspace().getRoot());
			/* CHANGE: don't fork (or use busyCursorWhile) as this will cause a deadlock */
            if (context == null) {
                PlatformUI.getWorkbench().getProgressService().run(false, true, workbenchRunnableAdapter);
            } else if (context instanceof IProgressService) {
                context.run(false, true, workbenchRunnableAdapter);
            } else {
                context.run(false, true, workbenchRunnableAdapter);
            }
            return cco.getStatus();
        } catch (InvocationTargetException e) {
            ExceptionHandler.handle(e, parent, title, RefactoringUIMessages.RefactoringUI_open_unexpected_exception);
            return RefactoringStatus
                    .createFatalErrorStatus(RefactoringUIMessages.RefactoringUI_open_unexpected_exception);
        }
    }

    /**
     * Copied from {@link RefactoringUI} as the original is package private.
     */
    protected Dialog createRefactoringWizardDialog(RefactoringWizard wizard, Shell parent) {
        Dialog result;
        if (needsWizardBasedUserInterface(wizard))
            result = new RefactoringWizardDialog(parent, wizard);
        else
            result = new RefactoringWizardDialog2(parent, wizard);
        return result;
    }

    /**
     * Copied from {@link RefactoringWizard} as the original is package private.
     * Once again reflection is used because of getWizardFlags() did not exist back in Galileo.
     */
    protected boolean needsWizardBasedUserInterface(RefactoringWizard wizard) {
        try {
            Field flagsField = getPrivateField(wizard.getClass(), "fFlags");
            flagsField.setAccessible(true);
            return ((Integer) flagsField.get(wizard) & RefactoringWizard.WIZARD_BASED_USER_INTERFACE) != 0;
        } catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException | SecurityException e) {
            // ignore
        }
        return true;
    }

    protected Field getPrivateField(Class<?> clazz, String name) throws SecurityException {
        try {
            return clazz.getDeclaredField(name);
        } catch (NoSuchFieldException e) {
            if (clazz.getSuperclass() != null)
                return getPrivateField(clazz.getSuperclass(), name);
        }
        return null; // dead code
    }
}
