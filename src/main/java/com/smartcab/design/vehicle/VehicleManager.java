package com.smartcab.design.vehicle;

import com.smartcab.vehicle.domain.Vehicle;

public interface VehicleManager {
public boolean addVehicle(Vehicle vehicle);	
public boolean removeVehicle(Vehicle vehicle);	
public boolean updateVehicle(Vehicle vehicle);	
public Vehicle getVehicle(int vehicleId);

}
