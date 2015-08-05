package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class VehicleFacade {
	
	private Car car = null;
	private Bus bus = null;
	private Suv suv = null;
	
	  public VehicleFacade() {
		  car = new Car();
		  bus = new Bus();
		  suv = new Suv();
	   }

	  public void updateVehicle(VehicleKind kind, Vehicle vehicle){
		  switch(kind) {
		   case BUS : bus.updateVehicle(vehicle);
		   	break;
		   	
		   case CAR : car.updateVehicle(vehicle);
		   	break;
		   	
		   case SUV : suv.updateVehicle(vehicle);
		   	break;
		  }
	   }
	  
	   public void addVehicle(VehicleKind kind, Vehicle vehicle){
		   switch(kind) {
		   case BUS : bus.addVehicle(vehicle);
		   	break;
		   	
		   case CAR : car.addVehicle(vehicle);
		   	break;
		   	
		   case SUV : suv.addVehicle(vehicle);
		   	break;
		  }
	   }
	   
	   public void removeVehicle(VehicleKind kind,Vehicle vehicle){
		   switch(kind) {
		   case BUS : bus.removeVehicle(vehicle);
		   	break;
		   	
		   case CAR : car.removeVehicle(vehicle);
		   	break;
		   	
		   case SUV : suv.removeVehicle(vehicle);
		   	break;
		  }
	   }
	   
	   public Vehicle getVehicle(VehicleKind kind,Vehicle vehicle) {
		   Vehicle returnedVehicle = null;
		   switch(kind) {
		   case BUS : returnedVehicle = bus.getVehicle(vehicle.getVehicleId());
		   	break;
		   	
		   case CAR : returnedVehicle = car.getVehicle(vehicle.getVehicleId());
		   	break;
		   	
		   case SUV : returnedVehicle= suv.getVehicle(vehicle.getVehicleId());
		   	break;
		  }
		   
		   return returnedVehicle;
	   }
}
