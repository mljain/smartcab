package com.smartcab.customer.template;

import java.util.ArrayList;

import com.smartcab.main.RequestStrategy;

public class CustomerManager implements RequestStrategy{
	private ArrayList<Customer> customers;
	
	static CustomerManager pm;

	public static CustomerManager getInstance(){
		if(pm==null) {
			pm = new CustomerManager();
		}
		return pm;
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
