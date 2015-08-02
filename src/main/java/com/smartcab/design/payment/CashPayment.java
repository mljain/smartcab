package com.smartcab.design.payment;

public class CashPayment extends Payment {

	public CashPayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	public void process(com.smartcab.payment.domain.Payment payment) {
		System.out.println("Processing Payment using CashPayment");
		processPayment(payment);
		updateTransaction();

	}

}
