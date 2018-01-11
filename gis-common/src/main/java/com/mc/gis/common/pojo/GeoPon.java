package com.mc.gis.common.pojo;

import java.io.Serializable;

public class GeoPon implements Serializable {

	private static final long serialVersionUID = 1L;
	private String lat;
	private String lon;
	private String ponAddress;

	public GeoPon() {
	}
	public GeoPon(String ponAddress, String lat, String lon) {
		this.lat = lat;
		this.lon = lon;
		this.ponAddress = ponAddress;
	}

	public String getPonAddress() {
		return ponAddress;
	}

	public void setPonAddress(String ponAddress) {
		this.ponAddress = ponAddress;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String log) {
		this.lon = log;
	}
}
