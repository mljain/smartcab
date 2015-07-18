package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class ServiceRequestImpl implements ServiceRequest {
	State state;

	public ServiceRequestImpl() {
		state = new ReceivedApplicationState(new ServiceRequestImpl());
	}

	public void setState(State s) {
		state = s;
	}

	public State getState() {
		return state;
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
