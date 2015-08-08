package com.smartcab.member.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.smartcab.model.SmartCabData;

public class MemberManager {

	private static MemberManager mm;
	public HashMap<Integer, Member> memberList = new HashMap<Integer, Member>();
	public String[] requests = {"Add Member", " View Member", " Delete Member", " Update Member", "Exit System"};
	public final int ADD = 0;
	public final int VIEW = 1;
	public final int DELETE = 2;
	public final int UPDATE = 3;
	public final int EXIT=4;
	private Integer numericOption;
	
	public static MemberManager getInstance() {
		if (mm == null) {
			mm = new MemberManager();
		}
		return mm;
	}
	
	public void processRequest(SmartCabData data) {
		memberList = data.memberList;
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("\nAdd Member")
				.append("\n1. View Member")
				.append("\n2. Delete Member")
				.append("\n4. Update Member")
				.append("\n5. Exit System");

		StringBuilder requestOptionBuilder = new StringBuilder();
		numericOption = 0;
		
		do {
			System.out.println(strBuilder.toString());
			try {

				String option = bufferedReader.readLine();
				numericOption = Integer.parseInt(option)-1;
				
				System.out.println("Request Received:"+ requests[numericOption]);
				if (numericOption == EXIT) {
					break;
				}

				switch (numericOption) {
				case ADD:
					//addRequest(requestKind);
					break;

				case VIEW:
					//cancelRequest(requestKind);
					break;

				case DELETE:
					//updateRequest(requestKind);
					break;

				case UPDATE:
					//retrieveRequest(requestKind);
					break;
				default:
					System.out.println("Enter valid option.")
;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (numericOption != EXIT);

	}

}
