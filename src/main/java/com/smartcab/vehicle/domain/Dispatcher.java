package com.smartcab.vehicle.domain;

import java.util.Date;

import com.smartcab.design.payment.Payment;
import com.smartcab.notification.domain.Notification;
import com.smartcab.request.domain.Request;
import com.smartcab.request.domain.RequestStatus;

public class Dispatcher {
	private int vehicleId;
	private int requestId;
	private Date expectedETA;
	private RequestStatus requestStatus;
	private PaymentStatus paymentStatus;
	private Request request;
	private Vehicle vehicle;
	private Driver driver;
	private Payment payment;
	private Notification notification;
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}
	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}
	/**
	 * @return the notification
	 */
	public Notification getNotification() {
		return notification;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	/**
	 * @param notification the notification to set
	 */
	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}
	/**
	 * @return the expectedETA
	 */
	public Date getExpectedETA() {
		return expectedETA;
	}
	/**
	 * @return the requestStatus
	 */
	public RequestStatus getRequestStatus() {
		return requestStatus;
	}
	/**
	 * @return the paymentStatus
	 */
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	/**
	 * @param expectedETA the expectedETA to set
	 */
	public void setExpectedETA(Date expectedETA) {
		this.expectedETA = expectedETA;
	}
	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * @param request the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
	}
	

}
