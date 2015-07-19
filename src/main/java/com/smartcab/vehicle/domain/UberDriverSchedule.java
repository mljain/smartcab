package com.smartcab.vehicle.domain;

import java.util.Date;

public class UberDriverSchedule extends Driver {
	
private Date serviceStartTime;
private Date serviceEndTime;
private int driverId;

/**
 * @return the driverId
 */
public int getDriverId() {
	return driverId;
}

/**
 * @param driverId the driverId to set
 */
public void setDriverId(int driverId) {
	this.driverId = driverId;
}

/**
 * @return the serviceStartTime
 */
public Date getServiceStartTime() {
	return serviceStartTime;
}

/**
 * @return the serviceEndTime
 */
public Date getServiceEndTime() {
	return serviceEndTime;
}

/**
 * @param serviceStartTime the serviceStartTime to set
 */
public void setServiceStartTime(Date serviceStartTime) {
	this.serviceStartTime = serviceStartTime;
}

/**
 * @param serviceEndTime the serviceEndTime to set
 */
public void setServiceEndTime(Date serviceEndTime) {
	this.serviceEndTime = serviceEndTime;
}


}
