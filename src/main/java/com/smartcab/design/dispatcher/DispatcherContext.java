package com.smartcab.design.dispatcher;

public class DispatcherContext {
		
		private DispatcherStrategy ds;
		
		public String dispatch( String requestType ) { 
			ds = setDispatcherStrategy(requestType); 
			return ds.dispatch(requestType);
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
