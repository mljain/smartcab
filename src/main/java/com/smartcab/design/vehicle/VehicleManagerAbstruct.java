package com.smartcab.design.vehicle;

public abstract class VehicleManagerAbstruct implements VehicleManager {

	static VehicleManager pm;

	public static VehicleManager getInstance() {
		// if(pm==null) {
		// pm = new VehicleManager();
		// }
		return pm;
	}

	private Car car = new Car();
	private Bus bus = new Bus();
	private Suv suv = new Suv();

}
