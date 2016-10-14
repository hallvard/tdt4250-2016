package no.hal.pgo.osm.geomap;

import org.eclipse.nebula.widgets.geomap.GeoMap;
import org.eclipse.nebula.widgets.geomap.jface.GeoMapViewer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;

public class MovePinMouseHandler extends org.eclipse.nebula.widgets.geomap.internal.DefaultMouseHandler {
	
	private GeoMapViewer viewer;
	
	private int panOffset = 4;
	private int thumbSize = 7;

	MovePinMouseHandler(GeoMapViewer geoMapViewer) {
		super(geoMapViewer.getGeoMap());
		this.viewer = geoMapViewer;
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
		if (isPanning() || isZooming()) {
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
		}
	}
}
