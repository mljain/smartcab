package com.smartcab.vehicle.domain;

public class DriverBackgroundCheck extends Driver {
	private boolean isbgCheckdone;
	private String agency;

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
