package com.smartcab.member.domain;

import java.util.ArrayList;

public class Supervisor extends Member{
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	public Supervisor(){
		super();
	}
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	@Override
	public String toString(){
		String output ="******************************\nSupervisor:  ";
		
		output += super.toString()+"\n Employees:\n";
		for (Employee e: employees)
		{
			output+= e.toString()+"\n";
		}

		output+= "******************************\n";
		return output;
	}

}
