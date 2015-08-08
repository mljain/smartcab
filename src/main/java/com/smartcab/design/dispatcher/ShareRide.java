package com.smartcab.design.dispatcher;

import java.util.List;

import com.smartcab.design.payment.PaymnetController;
import com.smartcab.design.utill.PaymentCalculator;
import com.smartcab.design.utill.ShareRidePayment;
import com.smartcab.design.utill.TaxiPayment;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.Vehicle;


public class ShareRide implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){
		//Request request = data.requestQ.get(request.getRequestId());
		List<Vehicle> vehicle=SmartCabData.getvehicleByGpsLocation(request.getGeoLocation());
		if(vehicle.size()>0){
		System.out.println("\n Found vehicle");
		System.out.println("Vehicle Details:"+vehicle.get(0));
		
		
		System.out.println("\n Getting driver informations");
		Driver driver=data.getDriver(vehicle.get(0));
		System.out.println("\n Driver Informations:"+driver.toString());
		
		
		System.out.println("\n processing Payment");
		PaymentCalculator calc = new ShareRidePayment();
		
		PaymnetController.processPayment(calc.finalPayment(request));
		System.out.println("\n Driver Informations:"+driver.toString());
		return "Dispatching ShareRide";
	}
		return "not able to dispatch";

}
}