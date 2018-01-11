package com.mc.gis.pon.geoservice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.mc.gis.common.pojo.GeoPon;
import com.mc.gis.common.spec.GeoPonRepository;

/**
 *
 */
@Repository
public class StubGeoPonRepository implements GeoPonRepository {

	private Map<String, GeoPon> geoPonDB = new HashMap<>();

	public StubGeoPonRepository() {
		geoPonDB.put("RAVAN:1-1-1-1", new GeoPon("RAVAN:1-1-1-1", "80.238913", "13.056082"));
		geoPonDB.put("RAVAN:1-1-1-2", new GeoPon("RAVAN:1-1-1-2", "80.237813", "13.069579"));
		geoPonDB.put("RAVAN:1-1-1-3", new GeoPon("RAVAN:1-1-1-3", "80.235612", "13.087266"));
		geoPonDB.put("RAVAN:1-1-1-4", new GeoPon("RAVAN:1-1-1-4", "80.257072", "13.087266"));
		geoPonDB.put("RAVAN:1-1-1-5", new GeoPon("RAVAN:1-1-1-5", "80.271929", "13.079226"));
		geoPonDB.put("RAVAN:1-1-1-6", new GeoPon("RAVAN:1-1-1-6", "80.282934", "13.064218"));
		geoPonDB.put("RAVAN:1-1-1-7", new GeoPon("RAVAN:1-1-1-7", "80.27468", "13.047065"));
		geoPonDB.put("RAVAN:1-1-1-8", new GeoPon("RAVAN:1-1-1-8", "80.260924", "13.040096"));
		geoPonDB.put("RAVAN:1-1-1-9", new GeoPon("RAVAN:1-1-1-9", "80.244693", "13.022483"));
		geoPonDB.put("RAVAN:1-1-1-10", new GeoPon("RAVAN:1-1-1-10", "80.221582", "13.03803"));
		geoPonDB.put("RAVAN:1-1-1-11", new GeoPon("RAVAN:1-1-1-11", "80.228185", "13.051968"));
		geoPonDB.put("RAVAN:1-1-1-12", new GeoPon("RAVAN:1-1-1-12", "80.231486", "13.057328"));
		geoPonDB.put("RAVAN:1-1-1-13", new GeoPon("RAVAN:1-1-1-13", "80.238913", "13.056082"));

		Logger.getLogger(StubGeoPonRepository.class).info("Created StubGeoPonRepository");
	}

	@Override
	public GeoPon getGeoPon(String ponAddress) {
		return geoPonDB.get(ponAddress);
	}

	@Override
	public Collection<GeoPon> getAllGeoPons() {
		return geoPonDB.values();
	}

}
