package com.smartcab.vehicle.domain;

public class PaymentStatus {
	private boolean PaymentStatus;
	private boolean isNotificationSend;
	/**
	 * @return the paymentStatus
	 */
	public boolean isPaymentStatus() {
		return PaymentStatus;
	}
	/**
	 * @return the isNotificationSend
	 */
	public boolean isNotificationSend() {
		return isNotificationSend;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(boolean paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	/**
	 * @param isNotificationSend the isNotificationSend to set
	 */
	public void setNotificationSend(boolean isNotificationSend) {
		this.isNotificationSend = isNotificationSend;
	}

}
