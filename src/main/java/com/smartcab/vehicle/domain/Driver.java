package com.smartcab.vehicle.domain;

import java.util.List;

public class Driver {
	private int driverId;
	private List<Vehicle> vehicle;
	private String firstName;
	private String lastname;
	private String licenceId;
	private DriverType driverType;
	private DriverBackgroundCheck bgCheck;
	/**
	 * @return the bgCheck
	 */
	public DriverBackgroundCheck getBgCheck() {
		return bgCheck;
	}
	/**
	 * @param bgCheck the bgCheck to set
	 */
	public void setBgCheck(DriverBackgroundCheck bgCheck) {
		this.bgCheck = bgCheck;
	}
	/**
	 * @return the driverId
	 */
	public int getDriverId() {
		return driverId;
	}
	/**
	 * @return the vehicle
	 */
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @return the licenceId
	 */
	public String getLicenceId() {
		return licenceId;
	}
	/**
	 * @return the driverType
	 */
	public DriverType getDriverType() {
		return driverType;
	}
	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @param licenceId the licenceId to set
	 */
	public void setLicenceId(String licenceId) {
		this.licenceId = licenceId;
	}
	/**
	 * @param driverType the driverType to set
	 */
	public void setDriverType(DriverType driverType) {
		this.driverType = driverType;
	} 

}
