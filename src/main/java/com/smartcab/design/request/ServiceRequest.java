/*
 * Copyright 2015. All Rights Reserved.  
 * 
 * Author: Soumya
 * Date: Jul 26, 2015
 */
package com.smartcab.design.request;

import com.smartcab.design.dispatcher.Dispatcher;
import com.smartcab.request.domain.Customer;
import com.smartcab.request.domain.Request;

/**
 * The Interface ServiceRequest.
 */
public interface ServiceRequest {
	
	/** The dispatcher status. */
	public Dispatcher dispatcherStatus = null;

	/**
	 * Receive request.
	 */
	public void receiveRequest();

	/**
	 * Qualify customer.
	 *
	 * @param c the c
	 */
	public void qualifyCustomer(Customer c);

	/**
	 * Process request.
	 *
	 * @param request the request
	 */
	public void processRequest(Request request);

	/**
	 * Complete request.
	 *
	 * @param request the request
	 */
	public void completeRequest(Request request);
	
	/**
	 * Cancel request.
	 *
	 * @param request the request
	 */
	public void cancelRequest(Request request);

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public State getState();

	/**
	 * Sets the state.
	 *
	 * @param s the new state
	 */
	public void setState(State s);
}