package com.smartcab.payment;

public class MobilePayment extends Payment {

	public MobilePayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		processPayment();
		updateTransaction();
		
	}

}
