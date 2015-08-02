package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class ReceiveRequestState implements State {

	private Request serviceRequest;

	public ReceiveRequestState(Request serviceRequest) {
		this.serviceRequest =serviceRequest;
	}

	public void receiveRequest() {
		System.out.println("Recieved Request.\n");
		serviceRequest.setState(new ProcessRequestState(serviceRequest));
		
	}

	public void qualifyCustomer(Customer c) {
		System.out.println("Cannot Qualify Customer. Have not recieved a Request.\n");
		
	}

	public void processRequest() {
		System.out.println("Cannot process request.Have not recieved a Request.\n");
		
	}

	public void completeRequest() {
		System.out.println("Cannot compelete request. Have not recieved a Request.\n");
		
	}

	public void cancelRequest() {
		System.out.println("Cannot cancel request.Have not recieved a Request.\n");
		
	}

	
}
