package com.smartcab.design.request;

import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

public interface State {
	public void receiveRequest();

	public void qualifyCustomer(Customer c);

	public void processRequest();

	public void completeRequest();
	
	public void cancelRequest();
}