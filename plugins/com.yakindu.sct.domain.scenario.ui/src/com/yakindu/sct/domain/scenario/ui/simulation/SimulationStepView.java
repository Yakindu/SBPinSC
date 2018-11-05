package com.yakindu.sct.domain.scenario.ui.simulation;

import java.util.ArrayList;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.yakindu.base.types.Event;
import org.yakindu.sct.simulation.core.debugmodel.SCTDebugTarget;
import org.yakindu.sct.simulation.core.engine.ISimulationEngine;
import org.yakindu.sct.simulation.ui.view.AbstractDebugTargetView;

import com.yakindu.sct.domain.scenario.simulation.IExecutionProcess;
import com.yakindu.sct.domain.scenario.simulation.IExecutionStep;


public class SimulationStepView extends AbstractDebugTargetView {

	public static final String ID = "org.yakindu.sct.domain.scenario.ui.simulation.simulationstepview"; //$NON-NLS-1$

	protected TableViewer stepViewer;
	
	protected ViewUpdater viewUpdater;
	
	protected IExecutionProcess executionProcess;

	public SimulationStepView() {
		super();
	}

	@Override
	protected void activeTargetChanged(IDebugTarget target) {

		ISimulationEngine engine = (ISimulationEngine) debugTarget.getAdapter(ISimulationEngine.class);

		// set table input if the interpreter provides scenario events
		if ( engine instanceof IExecutionProcess) {
			executionProcess = (IExecutionProcess) engine;
		} else {
			executionProcess = null;
		}
		
		updateViewInput();
		updateViewUpdater();
	}


	protected void updateViewInput() {

		Display.getDefault().asyncExec(() -> {
			if ( executionProcess != null ) {
				stepViewer.setInput(executionProcess.getExecutionSteps());
			} else {
				stepViewer.setInput(null);
			}
		});
	}
	
	
	protected void updateViewUpdater() {
		
		if (executionProcess != null) {
			if (viewUpdater == null) {
				this.viewUpdater = new ViewUpdater();
				new Thread(viewUpdater).start();
			}
		} else {
			if (viewUpdater != null) {
				viewUpdater.setCancel(true);
				viewUpdater = null;
			}
		}
	}
	
	
	@Override
	protected void handleDebugEvent(DebugEvent event) {
		switch (event.getKind()) {
		case DebugEvent.TERMINATE:
			executionProcess = null;
			updateViewInput();
			updateViewUpdater();
			break;
		case DebugEvent.SUSPEND:
			break;
		case DebugEvent.RESUME:
			break;
		}
	}

	@Override
	public void setFocus() {
		stepViewer.getControl().setFocus();
	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		stepViewer	= createTable(container, "next steps");
		stepViewer.setInput(new ArrayList<Event>());
	}
	
	
	protected TableViewer createTable(Composite parent, String title) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true,2,1));
		TableColumnLayout layout = new TableColumnLayout();
		composite.setLayout(layout);
		
		TableViewer eventTableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		eventTableViewer.setContentProvider(new ArrayContentProvider());
		Table table = eventTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		final TableViewerColumn stepColumn = new TableViewerColumn(eventTableViewer, SWT.NONE);
		// Snapshot column
		stepColumn.getColumn().setText(title);
		stepColumn.getColumn().setResizable(true);
		stepColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof IExecutionStep ) {
					String taskDescr = ((IExecutionStep) element).getDescription();
					if (taskDescr.contains("_time_event_")) {
						String[] parts = taskDescr.split("\\.");
						String[] lastParts = parts[(parts.length)-1].split("_");
						taskDescr = "raise time event " + lastParts[lastParts.length-1] + " on " + lastParts[0];
						for (int i = parts.length-2; i>=1; i--) {
							taskDescr += ":" + parts[i];
						}
					}
							
					return taskDescr;
				}
				return element.toString();
			}
		});
		layout.setColumnData(stepColumn.getColumn(), new ColumnWeightData(3));

		final TableViewerColumn timeColumn = new TableViewerColumn(eventTableViewer, SWT.NONE);
		// Snapshot column
		timeColumn.getColumn().setText("time");
		timeColumn.getColumn().setResizable(true);
		timeColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof IExecutionStep ) {
					long time = ((IExecutionStep) element).getTime();
					if (time == -1l) {
						return "now";
					} else {
						return "" + time;
					}
				}
				return "";
			}
		});
		layout.setColumnData(timeColumn.getColumn(), new ColumnWeightData(1));
		
		return eventTableViewer;
	}
	
	
	protected SCTDebugTarget getSCTDebugTarget() {
		return ( this.debugTarget instanceof SCTDebugTarget ) 
					? (SCTDebugTarget) this.debugTarget
					: null;
	}

	
	
	protected class ViewUpdater implements Runnable {

		private static final long UPDATE_INTERVAL = 100;
		private boolean cancel = false;

		@Override
		public void run() {
			while (!cancel) {
				try {
					Thread.sleep(UPDATE_INTERVAL);
					updateViewInput();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public boolean isCancel() {
			return cancel;
		}

		public void setCancel(boolean cancel) {
			this.cancel = cancel;
		}
	}

}
