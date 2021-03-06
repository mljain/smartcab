package com.smartcab.vehicle.domain;

import com.smartcab.design.vehicle.Budget;
import com.smartcab.design.vehicle.VehicleState;
import com.smartcab.design.vehicle.VehicleWaitingState;
import com.smartcab.request.domain.GeoLocation;

public class Vehicle {
	private int vehicleId;
	private String vehicleBrand;
	private String vehicleColor;
	private String modelName;
	private String driverId;
	private VehicleType vehicleType;
	private GeoLocation geolocation;
	private String licencePlate;
	private VehicleState state;
	private int numberOfpassenger;

	/**
	 * @return the numberOfpassenger
	 */
	public int getNumberOfpassenger() {
		return numberOfpassenger;
	}

	/**
	 * @param numberOfpassenger the numberOfpassenger to set
	 */
	public void setNumberOfpassenger(int numberOfpassenger) {
		this.numberOfpassenger = numberOfpassenger;
	}

	private Budget budget;

	public Vehicle() {
		state = new VehicleWaitingState(this);
	}

	/**
	 * @return the licencePlate
	 */
	public String getLicencePlate() {
		return licencePlate;
	}

	/**
	 * @param licencePlate
	 *            the licencePlate to set
	 */
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}

	/**
	 * @return the vehicleBrand
	 */
	public String getVehicleBrand() {
		return vehicleBrand;
	}

	/**
	 * @return the vehicleColor
	 */
	public String getVehicleColor() {
		return vehicleColor;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}

	/**
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * @return the geolocation
	 */
	public GeoLocation getGeolocation() {
		return geolocation;
	}

	/**
	 * @param vehicleId
	 *            the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @param vehicleBrand
	 *            the vehicleBrand to set
	 */
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	/**
	 * @param vehicleColor
	 *            the vehicleColor to set
	 */
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	/**
	 * @param modelName
	 *            the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @param driverId
	 *            the driverId to set
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	/**
	 * @param vehicleType
	 *            the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @param geolocation
	 *            the geolocation to set
	 */
	public void setGeolocation(GeoLocation geolocation) {
		this.geolocation = geolocation;
	}

	public VehicleState getState() {
		return state;
	}

	public void setState(VehicleState state) {
		this.state = state;
	}

	public void maintainVehicle() {
		state.maintainVehicle();
	}

	public void dispatchVehicle() {
		state.dispatchVehicle();
	}

	public void completeProcess() {
		state.completeProcess();
	}

	public String getCurrentState() {
		return state.getCurrentState();
	}

	/**
	 * @return the budget
	 */
	public Budget getBudget() {
		return budget;
	}

	/**
	 * @param budget
	 *            the budget to set
	 */
	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleBrand="
				+ vehicleBrand + ", vehicleColor=" + vehicleColor
				+ ", modelName=" + modelName + ", driverId=" + driverId
				+ ", vehicleType=" + vehicleType + ", geolocation="
				+ geolocation + ", licencePlate=" + licencePlate + ", state="
				+ state.getCurrentState() + "]";
	}

}
