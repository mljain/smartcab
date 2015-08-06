package com.smartcab.request.domain;

import java.util.Date;

import com.smartcab.design.request.ReceiveRequestState;
import com.smartcab.design.request.ServiceRequest;
import com.smartcab.design.request.State;
import com.smartcab.member.domain.Member;
import com.smartcab.notification.domain.Notification;

public class Request implements ServiceRequest{	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", deparatureTime="
				+ deparatureTime + ", address=" + address + ", requestStatus="
				+ requestStatus + ", requestType=" + requestType
				+ ", geoLocation=" + geoLocation + ", zone=" + zone
				+ ", client=" + client + ", state=" + state + ", type=" + type
				+ ", notification=" + notification + "]";
	}

	private int requestId;
	private Date deparatureTime;
	private Address address;
	private RequestStatus requestStatus; 
	private String requestType;
	private GeoLocation geoLocation;
	private Zone zone;
	private Member client;	
	private State state;
	private ServiceType type;

	/**
	 * @return the type
	 */
	public ServiceType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ServiceType type) {
		this.type = type;
	}

	private Notification notification;
	
	
	
	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Request(){
		state = new ReceiveRequestState(this);
	}

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
	 * @return the zone
	 */
	public Zone getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	/**
	 * @return the geoLocation
	 */
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	/**
	 * @param geoLocation the geoLocation to set
	 */
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}
	/**
	 * @return the deparatureTime
	 */
	public Date getDeparatureTime() {
		return deparatureTime;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @return the requestStatus
	 */
	public RequestStatus getRequestStatus() {
		return requestStatus;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	/**
	 * @param deparatureTime the deparatureTime to set
	 */
	public void setDeparatureTime(Date deparatureTime) {
		this.deparatureTime = deparatureTime;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}
	public Member getClient() {
		return client;
	}
	public void setClient(Member client) {
		this.client = client;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public void receiveRequest() {
		state.receiveRequest();
		
	}
	
	public void processRequest() {
		state.processRequest();
		
	}
	public void completeRequest(String status) {
		state.completeRequest(status);
		
	}
	public void cancelRequest() {
		state.cancelRequest();
		
	}

	public void qualifyCustomer(Customer c) {
		// TODO Auto-generated method stub
		
	}



}
