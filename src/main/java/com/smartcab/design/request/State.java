package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public interface State {
	public final static String CANCELLED = "Cancelled";
	public final static String COMPLETED = "Completed";
	public final static String PROCESSING = "Processing";
	public final static String RECIEVED = "Recieved";
	
	public void receiveRequest();

	public void processRequest();

	public void completeRequest(String request);
	
	public void cancelRequest();
	
	public String getCurrentState();
}