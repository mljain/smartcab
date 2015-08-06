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
	 * Process request.
	 *
	 * @param request the request
	 */
	public void processRequest();

	/**
	 * Complete request.
	 *
	 * @param request the request
	 */
	public void completeRequest(String status);
	
	/**
	 * Cancel request.
	 *
	 * @param request the request
	 */
	public void cancelRequest();

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