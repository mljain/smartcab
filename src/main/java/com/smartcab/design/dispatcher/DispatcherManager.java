/**
 * 
 */
package com.smartcab.design.dispatcher;

import java.util.Scanner;

import com.smartcab.main.RequestStrategy;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;


/**
 * @author mahesh
 *
 */
public class DispatcherManager implements RequestStrategy{

	static DispatcherManager pm;

	public static DispatcherManager getInstance(){
		if(pm==null) {
			pm = new DispatcherManager();
		}
		return pm;
	}

	public void processRequest(SmartCabData data) {

		Scanner s = new Scanner(System.in);
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
				// i = new Integer(input )
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
				if(data.requestQ.size() > 0){
					Request request = data.requestQ.get(data.requestQ.keySet().iterator().next());
					System.out.println("Next Request in Q: " + request.toString());
					DispatcherStrategyApp.getInstance().dispatch(request);
				}else{
					System.out.println("Enter the request first.");
				}
				break;
			case 4:
				continueFlag = false;
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
