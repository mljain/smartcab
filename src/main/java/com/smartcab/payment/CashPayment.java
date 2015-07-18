package com.smartcab.payment;

public class CashPayment extends Payment {

	public CashPayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		processPayment();
		updateTransaction();
		
	}

}
