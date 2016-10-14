package no.hal.pgo.osm.geomap;

import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.nebula.widgets.geomap.jface.LocationProvider;

import no.hal.pgo.osm.GeoLocated;
import no.hal.pgo.osm.GeoLocation;
import no.hal.pgo.osm.geoutil.LatLong;

public class OsmLocationProvider implements LocationProvider {

	@Override
	public PointD getLonLat(Object element) {
		if (element instanceof GeoLocated) {
			LatLong latLong = ((GeoLocated) element).getLatLong();
			if (latLong != null) {
				return new PointD(latLong.longitude, latLong.latitude);
			}
		}
		return null;
	}

	@Override
	public boolean setLonLat(Object element, double lon, double lat) {
		if (element instanceof GeoLocation) {
			((GeoLocation) element).setLatitude((float) lat);
			((GeoLocation) element).setLongitude((float) lon);
			return true;
		}
		return false;
	}
}
