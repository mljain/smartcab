package com.smartcab.design.dispatcher;


public class RentACar implements DispatcherStrategy{

	public String dispatch (String requestType){
		return "Dispatching Rent A Car";
	}

}
