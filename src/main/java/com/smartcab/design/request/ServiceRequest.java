package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public interface ServiceRequest {
	public Dispatcher dispatcherStatus = null;

	public void receiveRequest();

	public void qualifyCustomer(Customer c);

	public void processRequest(Request request);

	public void completeRequest(Request request);
	public void cancelRequest(Request request);

	public State getState();

	public void setState(State s);
}