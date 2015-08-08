/**
 * 
 */
package com.smartcab.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;

import com.smartcab.design.vehicle.VehicleKind;
import com.smartcab.member.domain.Member;
import com.smartcab.request.domain.GeoLocation;
import com.smartcab.request.domain.Request;
import com.smartcab.vehicle.domain.Dispatcher;
import com.smartcab.vehicle.domain.Driver;
import com.smartcab.vehicle.domain.DriverBackgroundCheck;
import com.smartcab.vehicle.domain.DriverType;
import com.smartcab.vehicle.domain.Vehicle;
import com.smartcab.vehicle.domain.VehicleType;

/**
 * @author mahesh
 *
 */
public class SmartCabData {
	public static HashMap<String, GeoLocation> dummyGps;
	public static HashMap<Integer, Vehicle> vehicleInventory;
	public static HashMap<Integer, Request> requestQ;
	public static HashMap<Integer, Dispatcher> dispatcher;
	public static HashMap<Integer, Member> memberList;
	public static HashMap<Integer, DriverBackgroundCheck> driverbc;
	public static HashMap<String, Driver> driverData;
	static {
		// intitializing some gps data
		dummyGps = new HashMap<String, GeoLocation>();
		vehicleInventory = new HashMap<Integer, Vehicle>();
		requestQ = new HashMap<Integer, Request>();
		dispatcher = new HashMap<Integer, Dispatcher>();
		memberList = new HashMap<Integer, Member>();
		driverbc = new HashMap<Integer, DriverBackgroundCheck>();
		driverData = new HashMap<String, Driver>();

		GeoLocation geo = new GeoLocation();
		geo.setLatitude(-111.23);
		geo.setLongitude(222.11);
		dummyGps.put("fremont", geo);

		GeoLocation geo1 = new GeoLocation();
		geo1.setLatitude(-112.23);
		geo1.setLongitude(223.11);
		dummyGps.put("sanjose", geo);

		GeoLocation geo2 = new GeoLocation();
		geo2.setLatitude(-113.23);
		geo2.setLongitude(224.11);
		dummyGps.put("santaclara", geo2);

		GeoLocation geo3 = new GeoLocation();
		geo3.setLatitude(-114.23);
		geo3.setLongitude(225.11);
		dummyGps.put("plasenton", geo3);

		GeoLocation geo4 = new GeoLocation();
		geo4.setLatitude(-115.23);
		geo4.setLongitude(226.11);
		dummyGps.put("cupertino", geo4);

		GeoLocation geo5 = new GeoLocation();
		geo5.setLatitude(-116.23);
		geo5.setLongitude(227.11);
		dummyGps.put("san mateo", geo5);

		GeoLocation geo6 = new GeoLocation();
		geo6.setLatitude(-117.23);
		geo6.setLongitude(228.11);
		dummyGps.put("sanfrancisco", geo6);

		// populate some vehicle data....
		Vehicle vehicle = new Vehicle();
		vehicle.setDriverId("1234");
		vehicle.setGeolocation(geo);
		vehicle.setLicencePlate("1234");
		vehicle.setVehicleType(VehicleType.YELLOWCAB);
		// vehicle.setVehicleType(VehicleKind.CAR);

		vehicle.setModelName("Honda Civic");
		vehicle.setVehicleId(1234);
		vehicleInventory.put(vehicle.getVehicleId(), vehicle);

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setDriverId("12345");
		vehicle1.setGeolocation(geo1);
		vehicle1.setLicencePlate("12345");
		vehicle1.setModelName("BMW");
		vehicle1.setVehicleType(VehicleType.UBER);
		vehicle1.setVehicleId(12345);
		vehicleInventory.put(vehicle1.getVehicleId(), vehicle1);

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setDriverId("123456");
		vehicle2.setGeolocation(geo1);
		vehicle2.setLicencePlate("123456");
		vehicle2.setModelName("BMW");
		vehicle2.setVehicleType(VehicleType.UBER);
		vehicle2.setVehicleId(123456);
		vehicleInventory.put(vehicle2.getVehicleId(), vehicle2);

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setDriverId("1234567");
		vehicle3.setGeolocation(geo1);
		vehicle3.setLicencePlate("1234567");
		vehicle3.setModelName("BMW");
		vehicle3.setVehicleType(VehicleType.UBER);
		vehicle3.setVehicleId(1234567);
		vehicleInventory.put(vehicle3.getVehicleId(), vehicle3);

		// populate some Driver data

		Driver driver = new Driver();
		driver.setDriverId("1234");
		driver.setDriverType(DriverType.YELLOWCAB);
		// driver.setBgCheck();
		driver.setFirstName("Soumya");
		driver.setLastname("Acharya");
		driver.setLicenceId("1234");
		driverData.put(driver.getDriverId(), driver);

		Driver driver2 = new Driver();
		driver2.setDriverId("12345");
		driver2.setDriverType(DriverType.UBER);
		// driver.setBgCheck();
		driver2.setFirstName("Parnit");
		driver2.setLastname("Sanion");
		driver2.setLicenceId("12345");
		driverData.put(driver2.getDriverId(), driver2);

		Driver driver3 = new Driver();
		driver3.setDriverId("123456");
		driver3.setDriverType(DriverType.UBER);
		// driver.setBgCheck();
		driver3.setFirstName("Sweer");
		driver3.setLastname("Kaul");
		driver3.setLicenceId("123456");
		driverData.put(driver3.getDriverId(), driver3);

		Driver driver4 = new Driver();
		driver4.setDriverId("1234567");
		driver4.setDriverType(DriverType.UBER);
		// driver.setBgCheck();
		driver4.setFirstName("Mahesh");
		driver4.setLastname("Jain");
		driver4.setLicenceId("1234567");
		driverData.put(driver4.getDriverId(), driver4);
		
		Member m = new Member();
		m.setFirstName("Parnit");
		m.setLastName("Sainion");
		Random r = new Random();
		m.setMemberId(1212);
		
		memberList.put(m.getMemberId(), m);

	}

	public GeoLocation getGpsByLocation(String location) {
		for (Entry<String, GeoLocation> geo : dummyGps.entrySet()) {
			if (geo.getKey().equalsIgnoreCase(location)) {
				return geo.getValue();
			}
		}
		return null;
	}

	public static HashMap<String, GeoLocation> getGpsData() {
		return dummyGps;
	}

	public static List<Vehicle> getvehicleByGpsLocation(GeoLocation geo) {
		if(geo!=null){
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		double latitude = Math.abs(geo.getLatitude());
		double longitude = Math.abs(geo.getLongitude());
		double vehiclelatitude = 0.0;
		double vehiclelongitude = 0.0;
		for (Entry<Integer, Vehicle> vehicle : vehicleInventory.entrySet()) {
			int vehicleId=0;
			vehiclelatitude = Math.abs(vehicle.getValue().getGeolocation()
					.getLatitude());
			vehiclelongitude = Math.abs(vehicle.getValue().getGeolocation()
					.getLongitude());
			
			if(Math.abs(vehiclelatitude - latitude)==0 && Math.abs(vehiclelongitude - longitude)==0){
				vehicleId=vehicle.getValue().getVehicleId();
			}
			else if((Math.abs(vehiclelatitude - latitude)>0 && Math.abs(vehiclelatitude - latitude)<100) && (Math.abs(vehiclelongitude - longitude)==0)&&Math.abs(vehiclelongitude - longitude)<100){
				vehicleId=vehicle.getValue().getVehicleId();
			}

			if(vehicleId!=0){
				for (Entry<Integer, Vehicle> vehicle1 : vehicleInventory.entrySet()) {
                  if(vehicle1.getValue().getVehicleId()==vehicleId){
                	  vehicleList.add(vehicle1.getValue());
                  }
				}
			}
			

		}

		return vehicleList;
		}
		return null;
	}

	public static Driver getDriver(Vehicle vehicle) {
		for (Entry<String, Driver> driver : driverData.entrySet()) {
			if(driver.getValue().getDriverId().equalsIgnoreCase(vehicle.getDriverId())){
				return driver.getValue();
			}
		}
		return null;
	}
	public static void setRequstQ(Request request) {
		requestQ.put(request.getRequestId(), request);
	}
}
