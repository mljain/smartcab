package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class VehicleWaitingState implements VehicleState{
		public Vehicle vehicle;
	
	public VehicleWaitingState(Vehicle vehicle){
		this.vehicle = vehicle;
	}

	public void maintainVehicle() {
		System.out.println("Maintaining Vehicle\n");
		vehicle.setState(new MaintainenceState(vehicle));		
	}

	public void dispatchVehicle() {
		System.out.println("Dispatching Vehicle\n");
		vehicle.setState(new DispatchState(vehicle));		
		
	}

	public void completeProcess() {
		System.out.println("Vehicle is already waiting\n");		
	}
}
