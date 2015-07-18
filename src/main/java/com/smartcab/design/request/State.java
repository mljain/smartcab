package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public interface State {
	public void receiveRequest();

	public void qualifyCustomer(Customer c);

	public void processRequest(Request request);

	public void completeRequest(Request request);
	
	public void cancelRequest(Request request);
}