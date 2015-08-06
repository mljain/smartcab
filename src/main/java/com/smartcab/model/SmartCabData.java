/**
 * 
 */
package com.smartcab.model;

import java.util.HashMap;

import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Dispatcher;
import com.smartcab.vehicle.domain.Vehicle;

/**
 * @author mahesh
 *
 */
public class SmartCabData {

	public HashMap<Integer, Vehicle> vehicleInventory = new HashMap<Integer, Vehicle>();
	public HashMap<Integer, Request> requestQ = new HashMap<Integer, Request>();
	public HashMap<Integer, Dispatcher> dispatcher = new HashMap<Integer, Dispatcher>();
	
}
