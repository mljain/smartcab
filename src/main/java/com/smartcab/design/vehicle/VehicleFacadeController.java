package com.smartcab.design.vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.UUID;

import com.smartcab.main.RequestStrategy;
import com.smartcab.model.SmartCabData;
import com.smartcab.vehicle.domain.Vehicle;

public class VehicleFacadeController implements RequestStrategy{
	
	static VehicleFacadeController pm;

	public static VehicleFacadeController getInstance(){
		if(pm==null) {
			pm = new VehicleFacadeController();
		}
		return pm;
	}

	
	public void processRequest(SmartCabData data) {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		FacadeOperation facadeOperation = FacadeOperation.NO_OP;
		
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("\n\t  Facade Menu")
			.append("\n1. Add Vehicle")
			.append("\n2. Delete Vehicle")
			.append("\n3. Update Vehicle")
			.append("\n4. Get Vehicle")
			.append("\n5. Exit System");
		
		StringBuilder vehicleOptionBuilder = new  StringBuilder();
		vehicleOptionBuilder.append("\n\t VehicleType")
			.append("\n1. BUS")
			.append("\n2. CAR")
			.append("\n3. SUV");

		VehicleFacade facade = new VehicleFacade(data);
		
		do {
			System.out.println(strBuilder.toString());
			try {
				String option = bufferedReader.readLine();
				if(option.isEmpty()){
					System.out.println("Enter Valid Choice");
					break;
				}
				else{
					Integer numericOption = Integer.parseInt(option);
					facadeOperation = FacadeOperation.values()[numericOption];
					
					if (facadeOperation == FacadeOperation.EXIT){
						break;
					}
					
					System.out.println(vehicleOptionBuilder.toString());
					option = bufferedReader.readLine();
					numericOption = Integer.parseInt(option);
					
					VehicleKind vehicleKind = VehicleKind.values()[numericOption - 1];
					switch(facadeOperation) {
						case ADD_VEHICLE : addVehicle(facade, vehicleKind);
							break;
							
						case DELETE_VEHICLE : deleteVehicle(facade, vehicleKind);
							break;
						
						case UPDATE_VEHICLE : updateVehicle(facade, vehicleKind);
							break;
							
						case GET_VEHICLE : getVehicle(facade, vehicleKind);
							break;
					}
				}
				
			} catch (InputMismatchException e){
				System.out.println("Enter Valid Choice");
			}catch(NumberFormatException e){
				System.out.println("Enter Valid Choice");
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(facadeOperation != FacadeOperation.EXIT);

	}
	
	private static void updateVehicle(VehicleFacade facade, VehicleKind vehicleKind) throws IOException {
		System.out.println("\nEnter the vehicle id to update : ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer vehicleId = Integer.parseInt(option);
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(vehicleId);
		
		System.out.println("\n Enter the new Color : ");
		option = bufferedReader.readLine();
		
		vehicle.setVehicleColor(option.trim());
		facade.updateVehicle(vehicleKind, vehicle);
	}
	
	private static void deleteVehicle(VehicleFacade facade, VehicleKind vehicleKind) throws IOException {
		System.out.println("\nEnter the vehicle id to delete : ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer vehicleId = Integer.parseInt(option);
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(vehicleId);
		
		vehicle.setVehicleColor(option.trim());
		facade.removeVehicle(vehicleKind, vehicle);
	}
	
	private static void addVehicle(VehicleFacade facade, VehicleKind vehicleKind) {
		Random random = new Random();
		Vehicle vehicle= new Vehicle();
		vehicle.setDriverId(UUID.randomUUID().toString());
		vehicle.setVehicleId(random.nextInt(1024));
		vehicle.setLicencePlate(UUID.randomUUID().toString());
		vehicle.setVehicleColor("Blue");
		System.out.println("Added a new " + vehicleKind.name().toLowerCase() + " with vehicleId "+ vehicle.getVehicleId()
				+ " and color " + vehicle.getVehicleColor());
		
		facade.addVehicle(vehicleKind, vehicle);
	}
	
	private static void getVehicle(VehicleFacade facade, VehicleKind vehicleKind) throws IOException {
		System.out.println("\nEnter the vehicle id to get : ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer vehicleId = Integer.parseInt(option);
		
		Vehicle vehicle= new Vehicle();
		vehicle.setVehicleId(vehicleId);
		
		Vehicle returnedVehicle = facade.getVehicle(vehicleKind, vehicle);
		
		if (returnedVehicle == null){
			System.out.println("Didn't find " + vehicleKind.name().toLowerCase() + " with vehicleId " + vehicleId);
		} else {
			System.out.println("Found a  " + vehicleKind.name().toLowerCase() + " with vehicleId "+ returnedVehicle.getVehicleId()
					+ " and color " + returnedVehicle.getVehicleColor());
		}
		
		
		facade.addVehicle(vehicleKind, vehicle);
	}
	
	private enum FacadeOperation {
		NO_OP,
		ADD_VEHICLE,
		DELETE_VEHICLE,
		UPDATE_VEHICLE,
		GET_VEHICLE,
		EXIT
	}
	
}
