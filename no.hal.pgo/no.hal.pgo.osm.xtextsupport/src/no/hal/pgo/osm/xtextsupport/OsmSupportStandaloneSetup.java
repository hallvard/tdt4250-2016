package no.hal.pgo.osm.xtextsupport;

public class OsmSupportStandaloneSetup {

	public static void setup() {
		new OsmSupportStandaloneSetup();
	}
	
	public OsmSupportStandaloneSetup() {
		new OsmSupport().registerServices(false);
	}
	
}
