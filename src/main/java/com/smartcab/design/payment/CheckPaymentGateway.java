package com.smartcab.design.payment;

import com.smartcab.payment.domain.Payment;

public class CheckPaymentGateway extends PaymenProcessor {



	@Override
	public void updateTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processPayment(Payment payment) {
		System.out.println("Processing Payment using CheckPaymentGateway");
		
	}

}
