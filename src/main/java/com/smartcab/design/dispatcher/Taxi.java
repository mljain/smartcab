package com.smartcab.design.dispatcher;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;


public class Taxi implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){
		//Request request = data.requestQ.get(request.getRequestId());
		return "Dispatching Taxi";
	}

}
