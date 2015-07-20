package com.smartcab.vehicle.domain;

import java.util.Date;

public class UberDriverSchedule extends Driver {
	
private Date serviceStartTime;
private Date serviceEndTime;


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
