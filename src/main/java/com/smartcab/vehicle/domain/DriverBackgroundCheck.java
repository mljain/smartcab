package com.smartcab.vehicle.domain;

public class DriverBackgroundCheck extends Driver {
	private int driverId;
	private boolean isbgCheckdone;
	private String agency;
	/**
	 * @return the driverId
	 */
	public int getDriverId() {
		return driverId;
	}
	/**
	 * @return the isbgCheckdone
	 */
	public boolean isIsbgCheckdone() {
		return isbgCheckdone;
	}
	/**
	 * @return the agency
	 */
	public String getAgency() {
		return agency;
	}
	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	/**
	 * @param isbgCheckdone the isbgCheckdone to set
	 */
	public void setIsbgCheckdone(boolean isbgCheckdone) {
		this.isbgCheckdone = isbgCheckdone;
	}
	/**
	 * @param agency the agency to set
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}
	

}
