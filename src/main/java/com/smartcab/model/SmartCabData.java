/**
 * 
 */
package com.smartcab.model;

import java.util.HashMap;
import java.util.Map.Entry;

import com.smartcab.request.domain.GeoLocation;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Dispatcher;
import com.smartcab.vehicle.domain.Vehicle;

/**
 * @author mahesh
 *
 */
public class SmartCabData {
	public static HashMap<String, GeoLocation> dummyGps;
	static {

		dummyGps = new HashMap<String, GeoLocation>();
		GeoLocation geo = new GeoLocation();
		geo.setLatitude(-111.23);
		geo.setLongitude(222.11);
		dummyGps.put("fremont", geo);

		GeoLocation geo1 = new GeoLocation();
		geo1.setLatitude(-112.23);
		geo1.setLongitude(223.11);
		dummyGps.put("sanjose", geo);

		GeoLocation geo2 = new GeoLocation();
		geo2.setLatitude(-113.23);
		geo2.setLongitude(224.11);
		dummyGps.put("santaclara", geo2);

		GeoLocation geo3 = new GeoLocation();
		geo3.setLatitude(-114.23);
		geo3.setLongitude(225.11);
		dummyGps.put("plasenton", geo3);

		GeoLocation geo4 = new GeoLocation();
		geo4.setLatitude(-115.23);
		geo4.setLongitude(226.11);
		dummyGps.put("cupertino", geo4);

		GeoLocation geo5 = new GeoLocation();
		geo5.setLatitude(-116.23);
		geo5.setLongitude(227.11);
		dummyGps.put("san mateo", geo5);

		GeoLocation geo6 = new GeoLocation();
		geo6.setLatitude(-117.23);
		geo6.setLongitude(228.11);
		dummyGps.put("sanfrancisco", geo6);

	}
	public HashMap<Integer, Vehicle> vehicleInventory = new HashMap<Integer, Vehicle>();
	public HashMap<Integer, Request> requestQ = new HashMap<Integer, Request>();
	public HashMap<Integer, Dispatcher> dispatcher = new HashMap<Integer, Dispatcher>();

	public GeoLocation getGpsByLocation(String location) {
		for (Entry<String, GeoLocation> geo : dummyGps.entrySet()) {
			if (geo.getKey().equalsIgnoreCase(location)) {
				return geo.getValue();
			}
		}
		return null;
	}
}
