package org.bbaw.bts.ui.main.toolbar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

public class StatusBarToolControl implements IProgressMonitor {
    @Inject
    UISynchronize sync;
    private ProgressBar progressBar;

    @PostConstruct
    public void createControls(Composite parent) {
        progressBar = new ProgressBar(parent, SWT.SMOOTH);
        progressBar.setBounds(100, 10, 200, 20);
    }

    @Override
    public void worked(final int work) {
        sync.syncExec(new Runnable() {
            @Override
            public void run() {
                System.out.println("Worked");
                progressBar.setSelection(progressBar.getSelection() + work);
            }
        });
    }

    @Override
    public void subTask(String name) {

    }

    @Override
    public void setTaskName(String name) {

    }

    @Override
    public boolean isCanceled() {
        return false;
    }

    @Override
    public void setCanceled(boolean value) {

    }

    @Override
    public void internalWorked(double work) {
    }

    @Override
    public void done() {
        System.out.println("Done");

    }

    @Override
    public void beginTask(final String name, final int totalWork) {
        sync.syncExec(new Runnable() {
            @Override
            public void run() {
                progressBar.setMaximum(totalWork);
                progressBar.setToolTipText(name);
            }
        });
        System.out.println("Starting");
    }
} 