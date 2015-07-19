package com.smartcab.design.vehicle;

import javax.management.RuntimeErrorException;

import com.smartcab.vehicle.domain.Vehicle;

public abstract class VehicleManagerAbstruct implements VehicleManager {

	public abstract boolean addVehicle(Vehicle vehicle);

	public abstract boolean removeVehicle(Vehicle vehicle);

	public abstract boolean updateVehicle(Vehicle vehicle);

	public abstract Vehicle getVehicle(int vehicleId);
	
	public VehicleManager getVehicleManager(String managerType){
		if(managerType.equals("ADD")){
			return new AddVehicleManager();
		}
		else if(managerType.equals("REMOVE")){
			return new RemoveVehicleManager();
		}
		else if(managerType.equals("READ")){
			return new GetVehicleManager();
		}
		else if(managerType.equals("UPDATE")){
			return new UpdateVehicleManager();
		} throw new RuntimeErrorException(null, "UNdefined Manager");
	}

}
