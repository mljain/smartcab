package com.smartcab.design.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import com.smartcab.design.dispatcher.DispatcherManager;
import com.smartcab.design.vehicle.Budget;
import com.smartcab.main.RequestStrategy;
import com.smartcab.member.domain.Member;
import com.smartcab.member.domain.MemberManager;
import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Address;
import com.smartcab.request.domain.GeoLocation;
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

	public void processRequest(SmartCabData data, Request request) {
		requestQueue = data.requestQ;
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		REQUESTOP requestOperation = REQUESTOP.NO_OP;

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("\nRequest Manager Manu")
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
					addRequest(data,requestKind);
					break;

				case REMOVE_REQUEST:
					cancelRequest(data,requestKind);
					break;

				case UPDATE_REQUEST:
					updateRequest(data,requestKind);
					break;

				case RETRIEVE_REQUEST:
					retrieveRequest(data,requestKind);
					break;

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (requestOperation != requestOperation.EXIT);

	}

	public Entry<Integer, Request> updateRequest(SmartCabData data,REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to update : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {
				createNewRequest(data,kind, request.getKey().intValue());
			}

		}
		return null;
	}

	public Entry<Integer, Request> retrieveRequest(SmartCabData data,REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to Delete : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {
				System.out.println("Request Retrieved:" + requestId.toString());
				return request;
			}

		}
		return null;
	}

	public Entry<Integer, Request> cancelRequest(SmartCabData data,REQUESTKind kind)
			throws IOException {
		System.out.println("\nEnter the Request id to Delete : ");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String option = bufferedReader.readLine();
		Integer requestId = Integer.parseInt(option);
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			if (request.getKey() == requestId) {
				// Set State to the Cancel state
				request.getValue().cancelRequest();
				;
				// requestQueue.remove(requestId);
				System.out.println("Cancelled Below Request"
						+ request.toString());
				return request;
			}

		}
		return null;
	}

	public void addRequest(SmartCabData data,REQUESTKind kind) {
		createNewRequest(data,kind, 0);

	}

	private void createNewRequest(SmartCabData data, REQUESTKind kind, int reqId) {
		Request request = new Request();
		if (reqId != 0) {
			Random random = new Random();
			request.setRequestId(Math.abs(random.nextInt()));
		} else {
			request.setRequestId(reqId);
		}
		try {
		System.out.println("Enter valid Member Id to process request \n:");
		BufferedReader bufferedReader2 = new BufferedReader(
				new InputStreamReader(System.in));
		String memberId = bufferedReader2.readLine();
		int id =Integer.parseInt(memberId);

		
		Member member = null;
		
		for (Integer key : data.memberList.keySet()){
			if(id == data.memberList.get(key).getMemberId())
			{
				member = data.memberList.get(key);
				System.out.println("Member found: " + member.toString());
			}
				
		}
		
		if(member == null)
		{
			System.out.println("Member Id not found. Add a new account\n");
			member =  MemberManager.addMember();

			System.out.println(member.toString());
			
		}
		
		request.setClient(member);
		//MemberManager.getInstance().processRequest(data, request);
		
		System.out.println("\n Enter The pick up location:");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

			String sourceLocation = bufferedReader.readLine();
			System.out.println("Source Location:" + sourceLocation);
			//SmartCabData data = new SmartCabData();
			GeoLocation geo1 = data.getGpsByLocation(sourceLocation);
			System.out.println("Getting geolocation from the gps:" + geo1);

			System.out.println("\n Enter The Destination:");
			BufferedReader bufferedReader1 = new BufferedReader(
					new InputStreamReader(System.in));
			String destination = bufferedReader1.readLine();
			System.out.println("Destination Location:" + destination);
			Address address = new Address();
			address.setSourceAddrsss(sourceLocation);
			address.setDestinationAddrsss(destination);
			request.setAddress(address);
			if (kind.name().equals("TAXI")) {
				request.setType(ServiceType.TAXI);
			} else if (kind.name().equals("SHARE_RIDE")) {
				request.setType(ServiceType.SHARE_RIDE);
			} else if (kind.name().equals("RENTCAR")) {
				request.setType(ServiceType.RENTCAR);
			}
			request.receiveRequest();
			request.setGeoLocation(geo1);
			request.setBudget(Budget.ECONOMICAL);
			requestQueue.put(new Integer(request.getRequestId()), request);
			System.out.println("Request is in Processing State"
					+ request.toString());
			// System.out.println(":::Current Request Queue:::");
			// printQueue();

			DispatcherManager.getInstance().ProcessRequest(data, request);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printQueue() {
		for (Entry<Integer, Request> request : requestQueue.entrySet()) {
			System.out.println("Request Id:" + request.getKey());
			System.out.println("Request Response:"
					+ request.getValue().toString());

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
		RequestManager.getInstance().processRequest(data, null);
	}

}
