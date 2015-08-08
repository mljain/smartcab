package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class LuxuryDecorator extends VehicleDecorator {
	private int numberOfPassenger;
	

	public LuxuryDecorator(RideBuilder vehicleBuilder) {
		super(vehicleBuilder);
		// TODO Auto-generated constructor stub
	}

	public Vehicle bookLuxuary(int numberOfPassenger,Vehicle vehicle) {
		System.out.println("Building Ride using  LuxuryDecorator pattern");
		//vehicleBuilder.setBudget(Budget.ECONOMICAL);
		vehicleBuilder.setNumPassenger(numberOfPassenger);
		vehicle.setBudget(Budget.LUXUARY);
		vehicle.setNumberOfpassenger(numberOfPassenger);
		return vehicle;
	}

	@Override
	public void buildVehicle() {
		super.buildVehicle();

	}

	/**
	 * @return the numberOfPassenger
	 */
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	/**
	 * @param numberOfPassenger
	 *            the numberOfPassenger to set
	 */
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

}
