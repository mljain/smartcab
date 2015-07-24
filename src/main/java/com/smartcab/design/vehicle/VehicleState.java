package com.smartcab.design.vehicle;


public interface VehicleState {
	public void requestState();

	public void qualifyVehicle();

	public void serviceVehicle();

	public void completeVehicle();

	public void cancelvehicle();

}
