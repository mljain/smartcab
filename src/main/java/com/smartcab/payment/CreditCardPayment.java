package com.smartcab.payment;

public class CreditCardPayment extends Payment {

	public CreditCardPayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		processPayment();
		updateTransaction();
		
	}

}
