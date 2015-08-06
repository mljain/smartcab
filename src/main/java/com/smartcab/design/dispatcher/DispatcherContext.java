package com.smartcab.design.dispatcher;

import com.smartcab.request.domain.Request;

public class DispatcherContext {
		
		private DispatcherStrategy ds;
		
		public String dispatch(Request request ) { 
			ds = setDispatcherStrategy(request.getRequestType()); 
			return ds.dispatch(request);
		}
	
		public DispatcherStrategy setDispatcherStrategy (String requestType) { 
			
			if( requestType.equalsIgnoreCase("Taxi") ){
				ds =  new Taxi();
			}else if ( requestType.equalsIgnoreCase("ShareARide") ){
				ds = new ShareRide();
			}else if ( requestType.equalsIgnoreCase("RentACar") ){
				ds = new RentACar();
			}
			return ds;
		}
}
