package com.smartcab.design.vehicle;

public interface VehicleServiceInterface {
	
	public void requestState();

	public void qualifyVehicle();

	public void serviceVehicle();

	public void completeVehicle();

	public void cancelvehicle();
	
	 public VehicleState getState();
	 public void setState(VehicleState s);

}
