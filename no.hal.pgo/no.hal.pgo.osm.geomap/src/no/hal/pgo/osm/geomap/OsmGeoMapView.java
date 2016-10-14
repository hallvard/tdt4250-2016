package no.hal.pgo.osm.geomap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.nebula.widgets.geomap.GeoMapUtil;
import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.nebula.widgets.geomap.jface.GeoMapViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;

import no.hal.pgo.ui.AbstractSelectionView;

public class OsmGeoMapView extends AbstractSelectionView {

	private GeoMapViewer viewer;

	private IMemento memento;

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		this.memento = memento;
	}

	private OsmContentProvider contentProvider = new OsmContentProvider();
	
	@Override
	public void createPartControl(Composite parent) {
		contentProvider = new OsmContentProvider();
		viewer = new GeoMapViewer(parent, SWT.NONE) {
			@Override
			protected void inputChanged(Object input, Object oldInput) {
				super.inputChanged(input, oldInput);
				getGeoMap().redraw();
			}
		};
		viewer.setMoveSelectionMode(GeoMapViewer.MOVE_SELECTION_NONE);
		viewer.setLocationProvider(new OsmLocationProvider());
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new OsmLabelProvider());
		if (memento != null) {
			String xyString = memento.getString("position");
			if (xyString != null) {
				String[] xy = xyString.split("[,;]");
				if (xy.length >= 2) {
					int x = Integer.valueOf(xy[0]), y = Integer.valueOf(xy[1]);
					viewer.getGeoMap().setCenterPosition(new Point(x, y));
				}
			}
			String zoomString = memento.getString("zoom");
			if (zoomString != null) {
				int zoom = Integer.valueOf(zoomString);
				viewer.getGeoMap().setZoom(zoom);
			}
		}
		viewer.getGeoMap().addMouseHandler(new MovePinMouseHandler(viewer));
	}

	@Override
	public void saveState(IMemento memento) {
		super.saveState(memento);
		Point centerPosition = viewer.getGeoMap().getCenterPosition();
		memento.putString("position", centerPosition.x + "," + centerPosition.y);
		memento.putInteger("zoom", viewer.getGeoMap().getZoom());
	}

	@Override
	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}
	
	@Override
	protected void updateView() {
		super.updateView();
		Object selection = getSelection();
		if (selection != null) {
			viewer.setInput(selection);
			Object[] elements = contentProvider.getElements(selection);
			if (elements != null && elements.length > 0) {
				viewer.zoomTo(elements, 5);
			}
			viewer.getGeoMap().redraw();
		}
	}
	
	protected void setLocation(int x, int y, int zoom) {
		PointD longLat = GeoMapUtil.getLongitudeLatitude(new Point(x, y), zoom);
		setLocation(longLat.y, longLat.x);
	}

	protected void setLocation(double lat, double lon) {
		System.out.println("Set location of " + getSelection() + " to " + lat + ", " + lon);
	}
	
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	private class MovePinMouseHandler extends org.eclipse.nebula.widgets.geomap.internal.DefaultMouseHandler {
		
		private int panOffset = 4;
		private int thumbSize = 7;

		MovePinMouseHandler(GeoMapViewer geoMapViewer) {
			super(geoMapViewer.getGeoMap());
		}

		protected GeoMap getControl() {
			return viewer.getGeoMap();
		}
		
		protected Object getElementAt(int x, int y) {
			return viewer.getElementAt(x, y, thumbSize);
		}
		
		@Override
		public Point getMapSize() {
			return getControl().getSize();
		}

		@Override
		protected boolean isPanStart(MouseEvent e) {
			return false;
		}

		private MouseEvent selectionStart = null;
		
		@Override
		public void mouseDown(MouseEvent e) {
			super.mouseDown(e);
			if (isZooming()) {
				return;
			}
			Object element = getElementAt(e.x, e.y);
			if (element == null) {
				selectionStart = e;
			}
		}

		protected boolean shouldPan(MouseEvent e) {
			return Math.abs(e.x - selectionStart.x) > panOffset || Math.abs(e.y - selectionStart.y) > panOffset;
		}
		
		@Override
		public void mouseMove(MouseEvent e) {
			if (selectionStart != null && shouldPan(e)) {
				panStart(selectionStart);
				selectionStart = null;
				super.mouseMove(e);
			}
		}

		@Override
		public void mouseUp(MouseEvent e) {
			if (selectionStart != null) {
				setLocation(e.x, e.y, viewer.getGeoMap().getZoom());
			}
		}
	}
}
