/**
 * 
 */
package com.mc.gis.common.spec;

import java.util.Collection;

import com.mc.gis.common.pojo.GeoPon;

/**
 *
 */
public interface GeoPonRepository {
	
	GeoPon getGeoPon(String ponAddress);

	Collection<GeoPon> getAllGeoPons();
}
