package com.smartcab.design.payment;

public class CheckPayment extends Payment {

	public CheckPayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	public void process(com.smartcab.payment.domain.Payment payment) {
		System.out.println("Processing Payment using CheckPayment");
		processPayment(payment);
		updateTransaction();

	}

}
