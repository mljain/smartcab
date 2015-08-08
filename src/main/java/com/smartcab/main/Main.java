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
		RequestController reqController = new RequestController();
		reqController.processRequest(data);
	}

}
