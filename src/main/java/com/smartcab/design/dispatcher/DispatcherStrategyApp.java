package com.smartcab.design.dispatcher;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;

public class DispatcherStrategyApp {
	
	static DispatcherStrategyApp dsa;

	public static DispatcherStrategyApp getInstance(){
		if(dsa==null) {
			dsa = new DispatcherStrategyApp();
		}
		return dsa;
	}	
	
	public static void dispatch(SmartCabData data,Request r) {
		DispatcherContext dc = new DispatcherContext();
		System.out.println("DispacherStrategy: "
				+ dc.dispatch(data,r));
	}

}
