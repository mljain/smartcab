package com.smartcab.design.vehicle;

public class VehicleDecorator extends VehicleBuilder {
	protected VehicleBuilder vehicleBuilder;
	
	public VehicleDecorator(VehicleBuilder vehicleBuilder){
		this.vehicleBuilder =vehicleBuilder;
		
	}

	@Override
	public void buildVehicle() {
		vehicleBuilder.buildVehicle();
		
	}

}
