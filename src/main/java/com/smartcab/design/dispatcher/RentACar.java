package com.smartcab.design.dispatcher;

import java.util.ArrayList;
import java.util.List;

import com.smartcab.design.payment.PaymnetController;
import com.smartcab.design.utill.PaymentCalculator;
import com.smartcab.design.utill.RentCarPayment;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.Vehicle;


public class RentACar implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){
		List<Vehicle> vehicle = SmartCabData.getvehicleByGpsLocation(request,
				request.getGeoLocation());
		boolean result=process(data, request, vehicle);
		if(result) return "Dispatching Rent a Car";
		List<Vehicle> vehiclelist = new ArrayList<Vehicle>();
		vehiclelist.add(SmartCabData.vehicleInventory.get(0));
		result=process(data, request,vehiclelist );
		System.out.println("Unable to find a proper vehicle providing random one from inventory");
		if(result) return "Dispatching Rent a Car";
		return "unable to dispatch";

}

	private boolean process(SmartCabData data, Request request,
			List<Vehicle> vehicle) {
		if(vehicle!=null && vehicle.size()>0){
		System.out.println("***********************************");	
		System.out.println("\n Found vehicle");
		System.out.println("Vehicle Details:"+vehicle.get(0));
		System.out.println("***********************************");	
		
		System.out.println("***********************************");	
		System.out.println("\n Getting driver informations");
		Driver driver=data.getDriver(vehicle.get(0));
		System.out.println("\n Driver Informations:"+driver.toString());
		System.out.println("***********************************");	
		
		
		System.out.println("***********************************");	
		System.out.println("\n processing Payment");
		PaymentCalculator calc = new RentCarPayment();
		System.out.println("***********************************");	
		PaymnetController.processPayment(calc.finalPayment(request));
		System.out.println("\n Driver Informations:"+driver.toString());
		vehicle.get(0).dispatchVehicle();
		request.completeRequest("Done");
		return true;
	}
		return false;
	}
}
