package com.mc.gis.map;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.mc.gis.common.pojo.GeoPon;
import com.mc.gis.common.spec.GeoPonRepository;

/**
 *
 */
public class RemoteGeoPonRepository implements GeoPonRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteGeoPonRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}

	@Override
	public GeoPon getGeoPon(String ponAddress) {
		return restTemplate.getForObject(serviceUrl + "/geopon/{ponAddress}",
				GeoPon.class, ponAddress);
	}

	@Override
	public Collection<GeoPon> getAllGeoPons() {
		GeoPon[] accounts = restTemplate.getForObject(serviceUrl+"/allGeoPons", GeoPon[].class);
		return Arrays.asList(accounts);
	}

}
