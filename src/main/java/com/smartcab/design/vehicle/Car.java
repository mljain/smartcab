package com.smartcab.design.vehicle;

import java.util.Map.Entry;

import com.smartcab.vehicle.domain.Vehicle;

public class Car extends VehicleManagerAbstruct {

	public boolean addVehicle(Vehicle vehicle) {
		try {
			vehicleInventory.put(vehicle.getVehicleId(), vehicle);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean removeVehicle(Vehicle vehicle) {
		vehicleInventory.remove(vehicle.getVehicleId());
		return true;
	}

	public boolean updateVehicle(Vehicle vehicle) {
		for (Entry<Integer, Vehicle> vehicle1 : vehicleInventory.entrySet()) {
			Vehicle vehicle2 = vehicle1.getValue();
			if (vehicle2.getVehicleId() == vehicle.getVehicleId()) {
				vehicleInventory.put(vehicle.getVehicleId(), vehicle);
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

	public Vehicle getVehicle(int vehicleId) {
		if (vehicleInventory.get(vehicleId) != null) {
			return vehicleInventory.get(vehicleId);

		}
		return null;
	}

	public void maintainVehicle(String operation, Vehicle vehicle) {
		// TODO Auto-generated method stub
		if (operation.equals("add")) {
			addVehicle(vehicle);
		} else if (operation.equals("delete")) {
			removeVehicle(vehicle);
		}

	}

}
