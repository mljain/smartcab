package com.smartcab.design.payment;

public class CashPayment extends Payment {

	public CashPayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	public void process() {
		processPayment();
		updateTransaction();

	}

}
