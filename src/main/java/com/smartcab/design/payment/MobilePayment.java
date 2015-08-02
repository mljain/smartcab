package com.smartcab.design.payment;

public class MobilePayment extends Payment {

	public MobilePayment(PaymenProcessor pp) {
		super(pp);
		// TODO Auto-generated constructor stub
	}

	public void process(com.smartcab.payment.domain.Payment payment) {
		System.out.println("Processing Payment using MobilePayment");
		processPayment(payment);
		updateTransaction();

	}

}
