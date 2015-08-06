package com.smartcab.design.dispatcher;

import java.util.Scanner;

import com.smartcab.request.domain.Request;

public class DispatcherStrategyApp {
	
	static DispatcherStrategyApp dsa;

	public static DispatcherStrategyApp getInstance(){
		if(dsa==null) {
			dsa = new DispatcherStrategyApp();
		}
		return dsa;
	}
	
	public static void main(String[] args){
		Request r = new Request();
	}
	
	
	public static void dispatch(Request r) {
		Scanner s = new Scanner(System.in);
		boolean continueFlag = true;
		while (continueFlag) {
			 
			System.out.println("1.Taxi");
			System.out.println("2.ShareARide");
			System.out.println("3.RentACar");
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
				requestType = "Taxi";
				break;
			case 2:
				requestType = "ShareARide";
				// System.out.println("in case 2");
				break;
			case 3:
				requestType = "RentACar";
				break;
			case 4:
				continueFlag = false;
				break;
			default:
				System.out.println("Please select correct type.");
				System.exit(0);

			}

			r.setRequestType(requestType);
			System.out.println("DispacherStrategy: "
					+ dc.dispatch(r.getRequestType()));
		}
		// Close s
		if (s != null) {
			s.close();
		}
	}

}
