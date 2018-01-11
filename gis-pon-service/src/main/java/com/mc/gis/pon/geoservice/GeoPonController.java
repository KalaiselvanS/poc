/**
 * 
 */
package com.mc.gis.pon.geoservice;

import java.util.Collection;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc.gis.common.pojo.GeoPon;
import com.mc.gis.common.spec.GeoPonRepository;

@RestController
public class GeoPonController {

	protected Logger logger = Logger
			.getLogger(GeoPonController.class.getName());
	
	@Autowired
	GeoPonRepository geoPonRepository;
	
	@RequestMapping("/allGeoPons")
	public GeoPon[] all() {
		logger.info("GisPon-microservice all() invoked");
		Collection<GeoPon> GeoPons = geoPonRepository.getAllGeoPons();
		logger.info("GisPon-microservice all() found: " + GeoPons.size());
		return GeoPons.toArray(new GeoPon[GeoPons.size()]);
	}
	
	@RequestMapping("/geopon/{ponAddress}")
	public GeoPon byPonAddress(@PathVariable("ponAddress") String ponAddress) {
		logger.info("GisPon-microservice byPonAddress() invoked: " + ponAddress);
		GeoPon GeoPon = geoPonRepository.getGeoPon(ponAddress);
		logger.info("GisPon-microservice byPonAddress() found: " + GeoPon);
		return GeoPon;
	}
}
