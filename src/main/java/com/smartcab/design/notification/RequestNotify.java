package com.smartcab.design.notification;

import com.smartcab.member.domain.Member;
import com.smartcab.request.domain.Request;

public class RequestNotify extends NotificationManager{
	
	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
		notifyObserver(new Member());
	}

	private Request request;

}
