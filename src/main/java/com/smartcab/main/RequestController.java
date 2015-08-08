/**
 * 
 */
package com.smartcab.main;

import java.util.Scanner;

import com.smartcab.customer.template.CustomerManager;
import com.smartcab.design.dispatcher.DispatcherManager;
import com.smartcab.design.payment.PaymentManager;
import com.smartcab.design.request.RequestManager;
import com.smartcab.design.vehicle.VehicleFacadeController;
import com.smartcab.member.domain.MemberManager;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;

/**
 * @author mahesh
 *
 */
public class RequestController {

	RequestStrategy requestStrategy;

	public RequestStrategy setProcessRequestStrategy(String requestType) {

		if ("Request".equalsIgnoreCase(requestType))
			requestStrategy = RequestManager.getInstance();
		else if ("Dispatcher".equalsIgnoreCase(requestType))
			requestStrategy = DispatcherManager.getInstance();
		else if ("Vehicle".equalsIgnoreCase(requestType))
			requestStrategy = VehicleFacadeController.getInstance();
		else if ("Member".equalsIgnoreCase(requestType))
			requestStrategy = MemberManager.getInstance();
		else if ("Payment".equalsIgnoreCase(requestType))
			requestStrategy = PaymentManager.getInstance();
		else if ("previousMenu".equalsIgnoreCase(requestType))
			requestStrategy = RequestManager.getInstance();
		// else if("Vehicle".equalsIgnoreCase(requestType))
		// requestStrategy = VehicleManager.getInstance();

		return requestStrategy;
	}

	public void processRequest(SmartCabData data) {

		while (true) {
			System.out.println("\nMain menu::::");
			System.out.println("select the option from the menu::");
			System.out.println("1.Manage Service Request");
			System.out.println("2.Manage Vehicle Inventory");
			System.out.println("3.Manage Member");
			System.out.println("4.Operate Dispatcher");
			System.out.println("6.Exit:");
			System.out.println("Enter your choice:");
			String requestType = "";
			int i = 0;

			Scanner s = new Scanner(System.in);
			i = s.nextInt();

			switch (i) {
			case 1:
				requestType = "Request";
				break;
			case 2:
				requestType = "Vehicle";
				// System.out.println("in case 2");
				break;
			case 3:
				requestType = "Member";
				break;
			case 4:
				requestType = "Dispatcher";
				break;
			case 5:
				requestType = "Previous";
				break;
			default:
				System.out
						.println("Thank You for using Smart Cab Application.");
				//System.exit(0);

			}

			requestStrategy = setProcessRequestStrategy(requestType);
			requestStrategy.processRequest(data, null);
		}

	}
}
