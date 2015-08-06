package com.smartcab.design.dispatcher;

import com.smartcab.request.domain.Request;


public class Taxi implements DispatcherStrategy{

	public String dispatch (Request request){
		return "Dispatching Taxi";
	}

}
