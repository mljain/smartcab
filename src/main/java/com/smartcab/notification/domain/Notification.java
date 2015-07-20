package com.smartcab.notification.domain;

public class Notification {
	
	private int notificationId;
	private String notoficationDesc;
	private int requestId;
	private int requestDesc;
	/**
	 * @return the notificationId
	 */
	public int getNotificationId() {
		return notificationId;
	}
	/**
	 * @return the notoficationDesc
	 */
	public String getNotoficationDesc() {
		return notoficationDesc;
	}
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}
	/**
	 * @return the requestDesc
	 */
	public int getRequestDesc() {
		return requestDesc;
	}
	/**
	 * @param notificationId the notificationId to set
	 */
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	/**
	 * @param notoficationDesc the notoficationDesc to set
	 */
	public void setNotoficationDesc(String notoficationDesc) {
		this.notoficationDesc = notoficationDesc;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	/**
	 * @param requestDesc the requestDesc to set
	 */
	public void setRequestDesc(int requestDesc) {
		this.requestDesc = requestDesc;
	}

	

}
