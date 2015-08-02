package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class DispatchState implements VehicleState{
	private Vehicle vehicle;
	
	public DispatchState(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	public void maintainVehicle() {
		System.out.println("Vehicle is currently dispatched\n");		
	}

	public void dispatchVehicle() {
		System.out.println("Vehicle is already dispatched\n");		
	}

	public void completeProcess() {

		System.out.println("Vehicle finished ride\n");
		vehicle.setState(new VehicleWaitingState(vehicle));		
	}

	public String getCurrentState() {
		return VehicleState.DISPATCHED;
	}
}
