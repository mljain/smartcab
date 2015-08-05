package com.smartcab.design.dispatcher;


public class Taxi implements DispatcherStrategy{

	public String dispatch (String requestType){
		return "Dispatching Taxi";
	}

}
