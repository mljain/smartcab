package com.smartcab.design.vehicle;

import java.util.HashMap;

import com.smartcab.vehicle.domain.Vehicle;

public abstract class VehicleManagerAbstruct implements VehicleManager {
	public HashMap<Integer, Vehicle> vehicleInventory = new HashMap<Integer, Vehicle>();
	static VehicleManager pm;
	public static VehicleManager getInstance() {
		// if(pm==null) {
		// pm = new VehicleManager();
		// }
		return pm;
	}

}
