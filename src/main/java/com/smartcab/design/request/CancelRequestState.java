package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class CancelRequestState implements State{
	private Request sericeRequest =null;
	
	public CancelRequestState(Request request) {
		sericeRequest = request;
	}

	public void receiveRequest() {
		System.out.println("Request is already cancelled.\n");		
	}


	public void processRequest() {
		System.out.println("Request is already cancelled.\n");		
	}


	public void completeRequest() {
		System.out.println("Request is already cancelled.\n");		
	}


	public void cancelRequest() {
		System.out.println("Request is already cancelled.\n");		
	}

	public String getCurrentState() {
		return State.CANCELLED;
	}

}
