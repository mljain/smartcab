package com.smartcab.design.dispatcher;

import com.smartcab.request.domain.Request;


public class RentACar implements DispatcherStrategy{

	public String dispatch (Request request){
		return "Dispatching Rent A Car";
	}

}
