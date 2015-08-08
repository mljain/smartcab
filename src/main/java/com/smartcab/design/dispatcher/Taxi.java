package com.smartcab.design.dispatcher;

import java.util.List;

import com.smartcab.design.payment.PaymnetController;
import com.smartcab.design.request.State;
import com.smartcab.design.utill.PaymentCalculator;
import com.smartcab.design.utill.TaxiPayment;
import com.smartcab.design.vehicle.Economy;
import com.smartcab.design.vehicle.EconomyDecorator;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.Vehicle;

public class Taxi implements DispatcherStrategy {

	public String dispatch(SmartCabData data, Request request) {

		System.out.println("\n Request Status :" + request.toString());
		request.receiveRequest();;
		
		// Request request = data.requestQ.get(request.getRequestId());
		List<Vehicle> vehicle = SmartCabData.getvehicleByGpsLocation(request,
				request.getGeoLocation());
		if (vehicle.size() > 0) {
			System.out.println("\n Found vehicle");
			System.out.println("Vehicle Details:" + vehicle.get(0));
			Economy economy = new Economy();
			EconomyDecorator economyDecorator = new EconomyDecorator(economy);
			Vehicle finalVehicle = economyDecorator.bookEconomyCar(5,
					vehicle.get(0));

			System.out.println("\n Getting driver informations");
			Driver driver = data.getDriver(finalVehicle);
			System.out.println("\n Driver Informations:" + driver.toString());
			
			System.out.println("\n Driver Informations:" + driver.toString());
			vehicle.get(0).dispatchVehicle();
			
			System.out.println("Vehicle: " + vehicle.get(0).toString());
			
			System.out.println("\n Request Status :" + request.toString());
			request.processRequest();

			System.out.println("\n processing Payment");
			PaymentCalculator calc = new TaxiPayment();

			PaymnetController.processPayment(calc.finalPayment(request));
			
			request.completeRequest(State.COMPLETED);
			
			System.out.println("\n Request Status :" + request.toString());

			vehicle.get(0).completeProcess();			
			System.out.println("Vehicle: " + vehicle.get(0).toString());

			return "Dispatching Taxi";
		}
		return "unable to dispatch";
	}

}
