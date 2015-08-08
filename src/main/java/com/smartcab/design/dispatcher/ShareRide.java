package com.smartcab.design.dispatcher;

import java.util.ArrayList;
import java.util.List;

import com.smartcab.design.payment.PaymnetController;
import com.smartcab.design.utill.PaymentCalculator;
import com.smartcab.design.utill.ShareRidePayment;
import com.smartcab.design.utill.TaxiPayment;
import com.smartcab.design.vehicle.Economy;
import com.smartcab.design.vehicle.EconomyDecorator;
import com.smartcab.design.vehicle.Luxury;
import com.smartcab.design.vehicle.LuxuryDecorator;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.Vehicle;


public class ShareRide implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){
		List<Vehicle> vehicle = SmartCabData.getvehicleByGpsLocation(request,
				request.getGeoLocation());
		boolean result=process(data, request, vehicle);
		if(result) return "Dispatching Share Ride";
		List<Vehicle> vehiclelist = new ArrayList<Vehicle>();
		vehiclelist.add(SmartCabData.vehicleInventory.get(0));
		result=process(data, request,vehiclelist );
		System.out.println("Unable to find a proper vehicle providing random one from inventory");
		if(result) return "Dispatching Share Ride";
		return "unable to dispatch";

}

	private boolean process(SmartCabData data, Request request,
			List<Vehicle> vehicle) {
		if(vehicle!=null && vehicle.size()>0){
		System.out.println("\n Found vehicle");
		System.out.println("Vehicle Details:"+vehicle.get(0));
		
		
		Luxury luxury = new Luxury();
		LuxuryDecorator luxuryDecorator = new LuxuryDecorator(luxury);
		Vehicle finalVehicle=luxuryDecorator.bookLuxuary(10, vehicle.get(0));
		
		
		
		System.out.println("\n Getting driver informations");
		Driver driver=data.getDriver(finalVehicle);
		System.out.println("\n Driver Informations:"+driver.toString());
		
		
		System.out.println("\n processing Payment");
		PaymentCalculator calc = new ShareRidePayment();
		
		PaymnetController.processPayment(calc.finalPayment(request));
		System.out.println("\n Driver Informations:"+driver.toString());
		vehicle.get(0).dispatchVehicle();
		request.completeRequest("Done");
		return true;
		
	}
		return false;
	}
}