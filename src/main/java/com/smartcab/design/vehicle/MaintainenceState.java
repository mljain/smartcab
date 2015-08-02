package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class MaintainenceState implements VehicleState{
	
	private Vehicle vehicle;
	public MaintainenceState(Vehicle vehicle){
		this.vehicle = vehicle;
	}

	public void maintainVehicle() {
		System.out.println("Vehicle is already in maintainence\n.");		
	}

	public void dispatchVehicle() {
		System.out.println("Vehicle is in maintainence\n.");		
	}

	public void completeProcess() {
		System.out.println("Maintainence is complete\n.");
		vehicle.setState(new VehicleWaitingState(vehicle));		
	}

}
