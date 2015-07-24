package com.smartcab.design.vehicle;

public class EconomyDecorator extends VehicleDecorator {
	private int numberOfPassenger;

	public EconomyDecorator(VehicleBuilder vehicleBuilder) {
		super(vehicleBuilder);
		// TODO Auto-generated constructor stub
	}

	public void bookEconomyCar(int numberOfPassenger) {
		vehicleBuilder.setBudget(Budget.ECONOMICAL);
		vehicleBuilder.setNumPassenger(numberOfPassenger);
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
