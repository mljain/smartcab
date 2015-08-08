package com.smartcab.design.dispatcher;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;


public class ShareRide implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){
		return "Dispatching ShareRide";
	}

}
