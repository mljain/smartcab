package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleFacade facade = new VehicleFacade();
		String opType="add";
		Vehicle vehicle= new Vehicle();
		facade.maintainCar(opType, vehicle);
	}

}
