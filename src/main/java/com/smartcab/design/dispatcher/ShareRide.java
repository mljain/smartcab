package com.smartcab.design.dispatcher;

import java.util.List;

import com.smartcab.design.payment.PaymnetController;
import com.smartcab.design.request.State;
import com.smartcab.design.utill.PaymentCalculator;
import com.smartcab.design.utill.ShareRidePayment;
import com.smartcab.design.vehicle.Luxury;
import com.smartcab.design.vehicle.LuxuryDecorator;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.Vehicle;


public class ShareRide implements DispatcherStrategy{

	public String dispatch (SmartCabData data,Request request){

		System.out.println("\n Request Status :" + request.toString());
		request.receiveRequest();;
		
		List<Vehicle> vehicle=SmartCabData.getvehicleByGpsLocation(request,request.getGeoLocation());
		if(vehicle.size()>0){
		System.out.println("\n Found vehicle");
		System.out.println("Vehicle Details:"+vehicle.get(0));
		
		
		Luxury luxury = new Luxury();
		LuxuryDecorator luxuryDecorator = new LuxuryDecorator(luxury);
		Vehicle finalVehicle=luxuryDecorator.bookLuxuary(10, vehicle.get(0));
		
		
		
		System.out.println("\n Getting driver informations");
		Driver driver=data.getDriver(finalVehicle);
		System.out.println("\n Driver Informations:"+driver.toString());
		
		System.out.println("\n REquest Status :" + request.toString());
		request.processRequest();
		vehicle.get(0).dispatchVehicle();
		
		System.out.println("Vehicle: " + vehicle.get(0).toString());
		
		
		System.out.println("\n processing Payment");
		PaymentCalculator calc = new ShareRidePayment();
		
		PaymnetController.processPayment(calc.finalPayment(request));
		System.out.println("\n Driver Informations:"+driver.toString());
		request.completeRequest(State.COMPLETED);
		System.out.println("\n Request Status :" + request.toString());
		vehicle.get(0).completeProcess();			
		System.out.println("Vehicle: " + vehicle.get(0).toString());
		
		return "Dispatching ShareRide";
	}
		return "not able to dispatch";

}
}