package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class CancelRequestState implements State{
	private ServiceRequest sericeRequest =null;
	
	public CancelRequestState(ServiceRequest request) {
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

	public void cancelRequest(Request request) {
		// TODO Auto-generated method stub
		
	}

}
