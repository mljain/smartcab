/**
 * 
 */
package com.smartcab.design.dispatcher;

import java.util.Scanner;

import com.smartcab.main.RequestStrategy;


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

	public void processRequest() {
		// TODO Auto-generated method stub
		
	}
	
//	public void processRequest() {
//	
//		Scanner s = new Scanner(System.in);
//		boolean continueFlag = true;
//		while (continueFlag) {
//			 
//			System.out.println("1.Taxi");
//			System.out.println("2.ShareARide");
//			System.out.println("3.RentACar");
//			System.out.println("4.Exit");
//			System.out.println("Enter your choice:");
//			String requestType = "";
//			int i = 0;
//
//			try {
//				i = s.nextInt();
//				// i = new Integer(input )
//			} catch (Exception e) {
//				System.out.println("Please select correct type.");
//				continue;
//			}
//
//			DispatcherContext dc = new DispatcherContext();
//
//			switch (i) {
//			case 1:
//				requestType = "Taxi";
//				break;
//			case 2:
//				requestType = "ShareARide";
//				// System.out.println("in case 2");
//				break;
//			case 3:
//				requestType = "RentACar";
//				break;
//			case 4:
//				continueFlag = false;
//				break;
//			default:
//				System.out.println("Please select correct type.");
//				System.exit(0);
//
//			}
//
//			r.setRequestType(requestType);
//			System.out.println("DispacherStrategy: "
//					+ dc.dispatch(r.getRequestType()));
//		}
//		// Close s
//		if (s != null) {
//			s.close();
//		}
//	
//		
//		
//	}
	
}
