/**
 * 
 */
package com.smartcab.design.dispatcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.smartcab.main.RequestStrategy;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;

/**
 * @author mahesh
 *
 */
public class DispatcherManager implements RequestStrategy {

	static DispatcherManager pm;

	public static DispatcherManager getInstance() {
		if (pm == null) {
			pm = new DispatcherManager();
		}
		return pm;
	}

	public void processRequest(SmartCabData data, Request request1) {

		ProcessRequest(data, request1);

	}

	public void ProcessRequest(SmartCabData data, Request request1) {
		Scanner s = new Scanner(System.in);
		BufferedReader bufferedReader = null;
		boolean continueFlag = true;
		while (continueFlag) {

			System.out.println("1.Fetch Request Queue");
			System.out.println("2.Fetch Vehicle Inventory");
			System.out.println("3.Dispatch");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			String requestType = "";
			int i = 0;

			try {
				i = s.nextInt();
			} catch (Exception e) {
				System.out.println("Please select correct type.");
				continue;
			}

			DispatcherContext dc = new DispatcherContext();

			switch (i) {
			case 1:
				System.out.println("Fetching all the requests in the Queue:");
				System.out.println(data.requestQ.toString());
				break;
			case 2:
				System.out.println("Fetch Vehicle available in the Queue.");
				System.out.println(data.vehicleInventory.toString());
				break;
			case 3:
				System.out.println("Dispatching the vehicle.");

				if (request1 != null) {
					System.out
							.println("\n Processing Dispatch for the request Id: "
									+ request1.getRequestId());
					bufferedReader = new BufferedReader(new InputStreamReader(
							System.in));
					try {
						Request request = data.requestQ.get(request1
								.getRequestId());
						if (request != null) {
							System.out.println("Request to be dispatched: "
									+ request.toString());
							DispatcherStrategyApp.getInstance().dispatch(data,
									request);
						} else {
							System.out
									.println("Request NOT found. Please enter valid request id.");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out
							.println("No Request to be processed. Enter a new request.");
				}
				break;
			case 4:
				continueFlag = false;
				System.exit(0);
				break;
			default:
				System.out.println("Please select correct type.");
				System.exit(0);

			}

		}
		// Close s
		if (s != null) {
			s.close();
		}
	}

}
