package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class CompleteRequestState implements State{
	private Request serviceRequest =null;
	
	public CompleteRequestState(Request serviceRequest){
		this.serviceRequest = serviceRequest;
	}

	public void receiveRequest() {
		System.out.println("Request already completed\n");		
	}

	public void qualifyCustomer(Customer c) {
		System.out.println("Request already completed\n");		
	}

	public void processRequest() {
		System.out.println("Request already completed\n");		
	}

	public void completeRequest() {
		System.out.println("Request already completed\n");		
	}

	public void cancelRequest() {
		System.out.println("Request already completed\n");		
	}

	public String getCurrentState() {
		return State.COMPLETED;
	}


}
