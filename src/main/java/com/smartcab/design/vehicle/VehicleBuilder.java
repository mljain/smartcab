package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;
import com.smartcab.vehicle.domain.VehicleType;

public abstract class VehicleBuilder {
	private int numPassenger;
	private VehicleType type;
	private Budget budget;
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}


	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	private Vehicle vehicle;


	/**
	 * @return the type
	 */
	public VehicleType getType() {
		return type;
	}


	/**
	 * @return the budget
	 */
	public Budget getBudget() {
		return budget;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(VehicleType type) {
		this.type = type;
	}


	/**
	 * @param budget the budget to set
	 */
	public void setBudget(Budget budget) {
		this.budget = budget;
	}


	/**
	 * @return the numPassenger
	 */
	public int getNumPassenger() {
		return numPassenger;
	}


	/**
	 * @param numPassenger the numPassenger to set
	 */
	public void setNumPassenger(int numPassenger) {
		this.numPassenger = numPassenger;
	}


	public abstract void buildVehicle();

}
