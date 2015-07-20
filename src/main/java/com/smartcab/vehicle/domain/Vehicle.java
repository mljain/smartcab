package com.smartcab.vehicle.domain;

import com.smartcab.request.domain.GeoLocation;

public class Vehicle {
private int vehicleId;
private String vehicleBrand;
private String vehicleColor;
private String modelName;
private String driverId;
private VehicleType vehicleType;
private GeoLocation geolocation;
private String licencePlate;
/**
 * @return the licencePlate
 */
public String getLicencePlate() {
	return licencePlate;
}
/**
 * @param licencePlate the licencePlate to set
 */
public void setLicencePlate(String licencePlate) {
	this.licencePlate = licencePlate;
}
/**
 * @return the vehicleId
 */
public int getVehicleId() {
	return vehicleId;
}
/**
 * @return the vehicleBrand
 */
public String getVehicleBrand() {
	return vehicleBrand;
}
/**
 * @return the vehicleColor
 */
public String getVehicleColor() {
	return vehicleColor;
}
/**
 * @return the modelName
 */
public String getModelName() {
	return modelName;
}
/**
 * @return the driverId
 */
public String getDriverId() {
	return driverId;
}
/**
 * @return the vehicleType
 */
public VehicleType getVehicleType() {
	return vehicleType;
}
/**
 * @return the geolocation
 */
public GeoLocation getGeolocation() {
	return geolocation;
}
/**
 * @param vehicleId the vehicleId to set
 */
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
/**
 * @param vehicleBrand the vehicleBrand to set
 */
public void setVehicleBrand(String vehicleBrand) {
	this.vehicleBrand = vehicleBrand;
}
/**
 * @param vehicleColor the vehicleColor to set
 */
public void setVehicleColor(String vehicleColor) {
	this.vehicleColor = vehicleColor;
}
/**
 * @param modelName the modelName to set
 */
public void setModelName(String modelName) {
	this.modelName = modelName;
}
/**
 * @param driverId the driverId to set
 */
public void setDriverId(String driverId) {
	this.driverId = driverId;
}
/**
 * @param vehicleType the vehicleType to set
 */
public void setVehicleType(VehicleType vehicleType) {
	this.vehicleType = vehicleType;
}
/**
 * @param geolocation the geolocation to set
 */
public void setGeolocation(GeoLocation geolocation) {
	this.geolocation = geolocation;
}

	


}
