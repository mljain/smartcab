package com.test.designpattern.state1;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class ReceivedApplicationState implements State {

	private ServiceRequest sericeRequest;

	public ReceivedApplicationState(ServiceRequest request) {
		sericeRequest = request;
	}

	public void receiveRequest() {
		// TODO Auto-generated method stub
		
	}

	public void qualifyCustomer(Customer c) {
		// TODO Auto-generated method stub
		
	}

	public void processRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	public void completeRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

	
}
