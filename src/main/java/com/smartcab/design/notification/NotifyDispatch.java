package com.smartcab.design.notification;

import com.smartcab.member.domain.Member;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;

public class NotifyDispatch extends NotificationManager {

	private Request request;
	private Driver driver;

	public NotifyDispatch(Request request, Driver driver) {
		this.request = request;
		this.driver = driver;

	}

	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}

	/**
	 * @param request
	 *            the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
		notifyObserver(new Member());
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
