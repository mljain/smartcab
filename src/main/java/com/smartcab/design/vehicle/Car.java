package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class Car extends VehicleManagerAbstruct {

	public boolean addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public Vehicle getVehicle(int vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void maintainVehicle(String operation, Vehicle vehicle) {
		// TODO Auto-generated method stub
		if(operation.equals("add")){
			addVehicle(vehicle);
		}else if(operation.equals("delete")){
			removeVehicle(vehicle);
		}
		
	}

}