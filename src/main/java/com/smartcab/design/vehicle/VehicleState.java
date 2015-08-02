package com.smartcab.design.vehicle;


public interface VehicleState {
	public final static String DISPATCHED = "dispatched";
	public final static String IN_MAINTAINENCE = "Maintainence";
	public final static String WAITING = "Waiting";
	
	public void maintainVehicle();
	public void dispatchVehicle();
	public void completeProcess();
	public String getCurrentState();

}
