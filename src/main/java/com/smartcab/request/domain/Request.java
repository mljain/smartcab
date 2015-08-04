package com.smartcab.request.domain;

import java.util.Date;

import com.smartcab.design.request.ReceiveRequestState;
import com.smartcab.design.request.ServiceRequest;
import com.smartcab.design.request.State;
import com.smartcab.member.domain.Member;
import com.smartcab.notification.domain.Notification;

public class Request implements ServiceRequest{	
	private int requestId;
	private Date deparatureTime;
	private Address address;
	private RequestStatus requestStatus; 
	private GeoLocation geoLocation;
	private Zone zone;
	private Member client;
	private State state;

	private Notification notification;
	
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
	public void qualifyCustomer(Customer c) {
		state.qualifyCustomer(c);
		
	}
	public void processRequest(Request request) {
		state.processRequest();
		
	}
	public void completeRequest(Request request) {
		state.completeRequest();
		
	}
	public void cancelRequest(Request request) {
		state.cancelRequest();
		
	}

}
