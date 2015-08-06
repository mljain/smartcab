package com.smartcab.design.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import com.smartcab.main.RequestStrategy;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Address;
import com.smartcab.request.domain.Request;
import com.smartcab.request.domain.ServiceType;


public class RequestManager implements RequestStrategy {

	static RequestManager pm;
	public HashMap<Integer, Request> requestQueue = new HashMap<Integer, Request>();

	public static RequestManager getInstance() {
		if (pm == null) {
			pm = new RequestManager();
		}
		return pm;
	}



	
	public void processRequest(SmartCabData data) {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		REQUESTOP requestOperation = REQUESTOP.NO_OP;

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("\n\t  Request Manager Manu")
				.append("\n1. Create New Request")
				.append("\n2. Cancel Request").append("\n3. Update Request")
				.append("\n4. Retrieve Request").append("\n5. Exit System");

		StringBuilder requestOptionBuilder = new StringBuilder();
		requestOptionBuilder.append("\n\t VehicleType").append("\n1. TAXI")
				.append("\n2. Share Ride").append("\n3. Exit");

		do {
			System.out.println(strBuilder.toString());
			try {

				String option = bufferedReader.readLine();
				System.out.println("Request Received:"
						+ requestOperation.values()[Integer.parseInt(option)]);
				Integer numericOption = Integer.parseInt(option);
				requestOperation = requestOperation.values()[numericOption];
				if (requestOperation == requestOperation.EXIT) {
					break;
				}

				System.out.println(requestOptionBuilder.toString());
				option = bufferedReader.readLine();
				numericOption = Integer.parseInt(option);

				REQUESTKind requestKind = REQUESTKind.values()[numericOption];
				switch (requestOperation) {
				case ADD_REQUEST:
					addRequest(requestKind);

					break;

				case REMOVE_REQUEST:
					cancelRequest(requestKind);
					break;

				case UPDATE_REQUEST:
					updateRequest(requestKind);
					break;

				case RETRIEVE_REQUEST:
					retrieveRequest(requestKind);
					break;

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (requestOperation != requestOperation.EXIT);

	}
	

	public Entry<Integer, Request> updateRequest(REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to update : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {
				addRequest(kind);
			}

		}
		return null;
	}

	public Entry<Integer, Request> retrieveRequest(REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to Delete : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {
				return request;
			}

		}
		return null;
	}

	public Entry<Integer, Request> cancelRequest(REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to Delete : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {			
				//Set State to the Cancel state
				request.getValue().cancelRequest();;
				//requestQueue.remove(requestId);
				
				return request;
			}

		}
		return null;
	}

	public void addRequest(REQUESTKind kind) {
		Random random = new Random();
		Request request = new Request();
		request.setRequestId(random.nextInt());
		System.out.println("\n Enter The pick up location:");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			String sourceLocation = bufferedReader.readLine();
			System.out.println("Source Location:" + sourceLocation);
			System.out.println("\n Enter The Destination:");
			BufferedReader bufferedReader1 = new BufferedReader(
					new InputStreamReader(System.in));
			String destination = bufferedReader1.readLine();
			System.out.println("Destination Location:" + destination);
			Address address = new Address();
			request.setAddress(address);
			request.setType(ServiceType.TAXI);
			request.receiveRequest();
			requestQueue.put(new Integer(request.getRequestId()), request);
			System.out.println("Request is in Processing State:::"
					+ request.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private enum REQUESTOP {
		NO_OP, ADD_REQUEST, REMOVE_REQUEST, UPDATE_REQUEST, RETRIEVE_REQUEST, EXIT
	}

	private enum REQUESTKind {
		NO_OP, TAXI, SHARE_RIDE, RENTCAR, EXIT
	}

	public static void main(String args[]) {
		SmartCabData data = new SmartCabData();
		RequestManager.getInstance().processRequest(data);
	}

}
