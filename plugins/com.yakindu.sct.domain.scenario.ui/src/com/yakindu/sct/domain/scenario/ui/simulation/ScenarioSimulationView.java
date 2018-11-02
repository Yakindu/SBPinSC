package com.yakindu.sct.domain.scenario.ui.simulation;

import java.util.ArrayList;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.yakindu.base.types.Event;
import org.yakindu.sct.simulation.core.debugmodel.SCTDebugTarget;
import org.yakindu.sct.simulation.core.engine.ISimulationEngine;
import org.yakindu.sct.simulation.ui.view.AbstractDebugTargetView;

import com.google.inject.Inject;
import com.yakindu.sct.domain.scenario.simulation.IScenarioEvents;


public class ScenarioSimulationView extends AbstractDebugTargetView {

	public static final String ID = "org.yakindu.sct.domain.scenario.ui.simulation.scenariosimulationview"; //$NON-NLS-1$

	@Inject protected IQualifiedNameProvider nameProvider;

	protected TableViewer requestedEventViewer;
	protected TableViewer blockedEventViewer;
	protected TableViewer enabledEventViewer;
	protected TableViewer selectedEventViewer;
	
	protected ViewUpdater viewUpdater;
	
	protected IScenarioEvents scenarioEvents;

	public ScenarioSimulationView() {
		super();
	}

	@Override
	protected void activeTargetChanged(IDebugTarget target) {

		ISimulationEngine engine = (ISimulationEngine) debugTarget.getAdapter(ISimulationEngine.class);

		// set table input if the interpreter provides scenario events
		if ( engine instanceof IScenarioEvents) {
			scenarioEvents = (IScenarioEvents) engine;
		} else {
			scenarioEvents = null;
		}
		
		updateViewInput();
		updateViewUpdater();
	}


	protected void updateViewInput() {

		Display.getDefault().asyncExec(() -> {
			if ( scenarioEvents != null ) {
				requestedEventViewer.setInput(scenarioEvents.getRequestedEvents());
				blockedEventViewer.setInput(scenarioEvents.getBlockedEvents());
				enabledEventViewer.setInput(scenarioEvents.getEnabledEvents());
//				selectedEventViewer.setInput(scenarioEvents.getSelectedEvents());
			} else {
				requestedEventViewer.setInput(null);
				blockedEventViewer.setInput(null);			
				enabledEventViewer.setInput(null);
//				selectedEventViewer.setInput(null);
			}
		});
	}
	
	
	protected void updateViewUpdater() {
		
		if (scenarioEvents != null) {
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
			scenarioEvents = null;
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
		requestedEventViewer.getControl().setFocus();

	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));


		SashForm vSash = new SashForm(container, SWT.SMOOTH | SWT.VERTICAL);
		vSash.setSashWidth(5);
		vSash.setBackground(ColorConstants.white);
		vSash.setLayout(new FillLayout());

		SashForm rbSash = new SashForm(vSash, SWT.SMOOTH | SWT.HORIZONTAL);
		rbSash.setSashWidth(5);
		rbSash.setBackground(ColorConstants.white);
		rbSash.setLayout(new FillLayout());

		requestedEventViewer	= createEventTable(rbSash, "requested");
		requestedEventViewer.setInput(new ArrayList<Event>());
		
		blockedEventViewer = createEventTable(rbSash, "blocked");
		blockedEventViewer.setInput(new ArrayList<Event>());
		
		enabledEventViewer = createEventTable(vSash, "enabled");
		enabledEventViewer.setInput(new ArrayList<Event>());

//		selectedEventViewer = createEventTable(vSash, "selected");
//		selectedEventViewer.setInput(new ArrayList<Event>());
		
		vSash.setWeights(new int[]{5, 2});

	}
	
	
	protected TableViewer createEventTable(Composite parent, String title) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true,2,1));
		TableColumnLayout layout = new TableColumnLayout();
		composite.setLayout(layout);
		
		TableViewer eventTableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		eventTableViewer.setContentProvider(new ArrayContentProvider());
		Table table = eventTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		final TableViewerColumn snapshotColumn = new TableViewerColumn(eventTableViewer, SWT.NONE);
		// Snapshot column
		snapshotColumn.getColumn().setText(title);
		snapshotColumn.getColumn().setResizable(true);
		snapshotColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				SCTDebugTarget target = getSCTDebugTarget();
				return (target != null) 
						? target.fullQfn((Event) element)
						: "<unknown>";
//				return ((Event) element).getName();		
			}
		});
		
		layout.setColumnData(snapshotColumn.getColumn(), new ColumnWeightData(1));

		
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
