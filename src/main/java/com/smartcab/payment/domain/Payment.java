package com.smartcab.payment.domain;

import com.smartcab.notification.domain.Notification;
import com.smartcab.request.domain.Request;

public class Payment {
	private int invoiceId;
	private double amount;
	private double serviceTax;
	private PaymentType paymentType;
	private int customerId;
	private int requestId;
	private int driverId;
	private Notification notification;
	/**
	 * @return the notification
	 */
	public Notification getNotification() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	/**
	 * @return the invoiceId
	 */
	public int getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @return the paymentType
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}

	/**
	 * @return the driverId
	 */
	public int getDriverId() {
		return driverId;
	}

	/**
	 * @param invoiceId
	 *            the invoiceId to set
	 */
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @param requestId
	 *            the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	/**
	 * @param driverId
	 *            the driverId to set
	 */
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	/**
	 * @return the serviceTax
	 */
	public double getServiceTax() {
		return serviceTax;
	}

	/**
	 * @param serviceTax the serviceTax to set
	 */
	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}

}
