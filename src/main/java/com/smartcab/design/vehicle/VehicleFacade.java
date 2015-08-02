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

	  public void maintainCar(String operation,Vehicle vehicle){
		  car.maintainVehicle(operation,vehicle);
	   }
	   public void drawRectangle(String operation,Vehicle vehicle){
		   bus.maintainVehicle(operation,vehicle);
	   }
	   public void drawSquare(String operation,Vehicle vehicle){
	      suv.maintainVehicle(operation,vehicle);
	   }
}
