package com.smartcab.design.dispatcher;

import java.util.ArrayList;
import java.util.List;

import com.smartcab.design.payment.PaymnetController;
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
		// Request request = data.requestQ.get(request.getRequestId());
		List<Vehicle> vehicle = SmartCabData.getvehicleByGpsLocation(request,
				request.getGeoLocation());
		boolean result=Process(data, request, vehicle);
		if(result) return "Dispatching Taxi";
		List<Vehicle> vehiclelist = new ArrayList<Vehicle>();
		vehiclelist.add(SmartCabData.vehicleInventory.get(0));
		result=Process(data, request,vehiclelist );
		if(result) return "Dispatching Taxi";
		System.out.println("Unable to find a proper vehicle providing random one from inventory");
		return "unable to dispatch";
	}

	private boolean Process(SmartCabData data, Request request,
			List<Vehicle> vehicle) {
		if (vehicle!=null && vehicle.size() > 0) {
			System.out.println("\n Found vehicle");
			System.out.println("Vehicle Details:" + vehicle.get(0));
			Economy economy = new Economy();
			EconomyDecorator economyDecorator = new EconomyDecorator(economy);
			Vehicle finalVehicle = economyDecorator.bookEconomyCar(5,
					vehicle.get(0));

			System.out.println("\n Getting driver informations");
			Driver driver = data.getDriver(finalVehicle);
			System.out.println("\n Driver Informations:" + driver.toString());

			System.out.println("\n processing Payment");
			PaymentCalculator calc = new TaxiPayment();

			PaymnetController.processPayment(calc.finalPayment(request));
			System.out.println("\n Driver Informations:" + driver.toString());

			vehicle.get(0).dispatchVehicle();
			request.completeRequest("Done");
			return true;

		}
		return false;
	}

}
