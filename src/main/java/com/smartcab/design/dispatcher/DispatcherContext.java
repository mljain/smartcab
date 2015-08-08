package com.smartcab.design.dispatcher;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.request.domain.ServiceType;

public class DispatcherContext {
		
		private DispatcherStrategy ds;
		
		public String dispatch(SmartCabData data,Request request ) { 
			ds = setDispatcherStrategy(request); 
			return ds.dispatch(data,request);
		}
	
		public DispatcherStrategy setDispatcherStrategy (Request request) { 
			
//			if( requestType.equalsIgnoreCase("Taxi") ){
//				ds =  new Taxi();
//			}else if ( requestType.equalsIgnoreCase("ShareARide") ){
//				ds = new ShareRide();
//			}else if ( requestType.equalsIgnoreCase("RentACar") ){
//				ds = new RentACar();
//			}
			if( request.getType() == ServiceType.TAXI){
				ds =  new Taxi();
			}else if ( request.getType() == ServiceType.SHARE_RIDE ){
				ds = new ShareRide();
			}else if (request.getType() == ServiceType.RENTCAR) {
				ds = new RentACar();
			}

			return ds;
		}
}
