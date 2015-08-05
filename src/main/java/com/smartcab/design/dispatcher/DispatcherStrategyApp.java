package com.smartcab.design.dispatcher;

import java.io.Console;
import java.util.Scanner;

import com.smartcab.request.domain.Request;

public class DispatcherStrategyApp {

	public static void main(String[] args) {
		Request r = new Request();
		Console c = System.console();
		Scanner s = new Scanner(System.in);
		boolean continueFlag = true;
		while (continueFlag) {
			System.out.println("select a type of request::");
			System.out.println("1.Taxi");
			System.out.println("2.ShareARide");
			System.out.println("3.RentACar");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			String requestType = "";
			int i = 0;

			String input = c.readLine();
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
