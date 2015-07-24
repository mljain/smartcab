package com.smartcab.design.vehicle;


public class VehicleServiceInterfaceImpl implements VehicleServiceInterface{
	
	VehicleState state;
	
	public VehicleServiceInterfaceImpl(VehicleState state){
		this.state=state;
		
	}

	public void requestState() {
		state.requestState();
		// TODO Auto-generated method stub
		
	}

	public void qualifyVehicle() {
		state.qualifyVehicle();
		// TODO Auto-generated method stub
		
	}

	public void serviceVehicle() {
		// TODO Auto-generated method stub
		state.serviceVehicle();
		
	}

	public void completeVehicle() {
		// TODO Auto-generated method stub
		state.completeVehicle();
		
	}

	public void cancelvehicle() {
		// TODO Auto-generated method stub
		state.cancelvehicle();
		
	}

	public VehicleState getState() {
		// TODO Auto-generated method stub
		return state;
	}

	public void setState(VehicleState s) {
		this.state=s;
		
	}

}
