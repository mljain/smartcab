/**
 * 
 */
package com.smartcab.main;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;


/**
 * @author mahesh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartCabData data = new SmartCabData();
		
		// initiating the dummy request
		Request r = new Request();
		r.setRequestType("Taxi");
		
		data.requestQ.put(123, r);
		
		RequestController reqController = new RequestController();
		reqController.processRequest(data);
	}

}
