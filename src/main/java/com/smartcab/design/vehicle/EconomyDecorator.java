package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class EconomyDecorator extends VehicleDecorator {
	private int numberOfPassenger;
	

	public EconomyDecorator(RideBuilder vehicleBuilder) {
		super(vehicleBuilder);
		// TODO Auto-generated constructor stub
	}

	public Vehicle bookEconomyCar(int numberOfPassenger,Vehicle vehicle) {
		System.out.println("Building Ride using EconomyDecorator pattern");
		vehicleBuilder.setBudget(Budget.ECONOMICAL);
		vehicleBuilder.setNumPassenger(numberOfPassenger);
		//vehicle.setBudget(Budget.LUXUARY);
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
