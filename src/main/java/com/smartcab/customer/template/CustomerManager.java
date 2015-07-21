package com.smartcab.customer.template;

import java.util.ArrayList;

public class CustomerManager {
	private ArrayList<Customer> customers;
	
	public CustomerManager(){
		
	}
	
	public void addNewCustomer(Customer c){
		customers.add(c);
	}
	
	public Customer getCustomer (int id){
		//to be added
		return  customers.get(id);
	}
	
	public void updateCustomer(String newInfo)
	{
		
	}

}
