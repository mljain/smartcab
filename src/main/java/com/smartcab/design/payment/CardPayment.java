package com.smartcab.design.payment;

public class CardPayment extends Payment {

	public CardPayment(PaymenProcessor pp) {
		super(pp);
	}

	@Override
	public void process(com.smartcab.payment.domain.Payment payment) {
		processPayment(payment);
		updateTransaction();

	}

}
