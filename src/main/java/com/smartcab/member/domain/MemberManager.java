package com.smartcab.member.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

import com.smartcab.main.RequestStrategy;
import com.smartcab.model.SmartCabData;

public class MemberManager implements RequestStrategy{

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
					addMember();
					break;

				case VIEW:
					viewMembers();
					break;

				case DELETE:
					deleteMember();
					break;

				case UPDATE:
					updateMember();
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
	
	public void addMember(){
		Random r= new Random();
		Member m =new Member();
		String input ="";
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		
		m.setMemberId(r.nextInt());

		try {
			System.out.println("Enter First Name");
			input = bufferedReader.readLine();
			m.setFirstName(input);

			System.out.println("Enter Last Name");
			input = bufferedReader.readLine();
			m.setLastName(input);
			
			m.setMemberType(MemberType.SILVER);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		memberList.put(m.getMemberId(), m);
		
	}
	
	public void viewMembers(){

		System.out.println("Member count: "+memberList.size());
		for (Integer i : memberList.keySet()){
			System.out.println("Member: "+memberList.get(i).toString());						
		}

		System.out.println("");
	}
	
	public void deleteMember(){
		
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		Member m =null;

		System.out.println("Enter Member ID for member delete:");
		int id;
		try {
			id = Integer.parseInt(bufferedReader.readLine());

			for (Integer i : memberList.keySet()){
				m = memberList.get(i);	
				if(m.getMemberId() == id)
				{
					memberList.remove(i);
					System.out.println("Member: " +m.getFirstName() + " " + m.getLastName() +" removed.");
					return;
				}
			}
			System.out.println("Member: " +m.getFirstName() +" " + m.getLastName() +" not found in the system.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect ID.");
		}
		System.out.println("");
	}
	
	public void updateMember(){
		
		Random r= new Random();
		String input ="";
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		
		Member m =null;

		System.out.println("Enter Member ID for member update:");
		int id;
		try {
			id = Integer.parseInt(bufferedReader.readLine());

			for (Integer i : memberList.keySet()){
				if(memberList.get(i).getMemberId() == id)
				{
					m = memberList.get(i);	
				}
			}
			if(m == null)
			{
				System.out.println("Member: " +m.getFirstName() +" " + m.getLastName() +" not found in the system.");
				return;
			}
			
			System.out.println("Current First name. Enter new first name(blank to not change)S");
			input = bufferedReader.readLine();
			if(!input.equalsIgnoreCase(""))
				m.setFirstName(input);

			System.out.println("Current Last name. Enter new last name(blank to not change)");
			input = bufferedReader.readLine();
			if(!input.equalsIgnoreCase(""))
				m.setLastName(input);
			
			System.out.println("Member updated: "+ m.toString()+"\n");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect ID.");
			//e.printStackTrace();
		}		
	}
	
	public static  void main(String[] args){

		SmartCabData data = new SmartCabData();
		MemberManager mm = new MemberManager();
		Member m = new Member();
		m.setFirstName("p");
		m.setLastName("S");
		Random r = new Random();
		m.setMemberId(1212);
		
		mm.memberList.put(1, m);
		/*
		mm.viewMembers();
		mm.addMember();
		mm.viewMembers();
		mm.deleteMember();
		mm.viewMembers();*/
		mm.updateMember();
		
		mm.viewMembers();
		
	}

}
