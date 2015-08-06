package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public class ProcessRequestState implements State{

	Request serviceRequest;
	
	public  ProcessRequestState(Request serviceRequest) {
		this.serviceRequest = serviceRequest;
		
	}

	public void receiveRequest() {
		System.out.println("Currently processing request.\n");		
	}

	public void processRequest() {
		if(serviceRequest.getClient().getMemberType().equals("Something")){
			serviceRequest.setState(new CompleteRequestState(serviceRequest));
		}
		else{
			System.out.println("unable to prcess request\n");
			serviceRequest.setState(new CancelRequestState(serviceRequest));
		}		
	}

	public void completeRequest() {
		System.out.println("Currently Processing request\n.");
		
	}

	public void cancelRequest() {
		System.out.println("Cancelling request\n.");
		serviceRequest.setState(new CancelRequestState(serviceRequest));
		
	}

	public String getCurrentState() {
		return State.PROCESSING;
	}

}
