package com.smartcab.design.vehicle;

public class VehicleDecorator extends RideBuilder {
	protected RideBuilder vehicleBuilder;
	
	public VehicleDecorator(RideBuilder vehicleBuilder){
		this.vehicleBuilder =vehicleBuilder;
		
	}

	@Override
	public void buildVehicle() {
		vehicleBuilder.buildVehicle();
		
	}

}
