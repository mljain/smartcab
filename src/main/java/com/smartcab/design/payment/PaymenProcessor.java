package com.smartcab.design.payment;

import com.smartcab.payment.domain.Payment;

public abstract class PaymenProcessor {
	public abstract void processPayment(Payment payment);
	public abstract void updateTransaction();
	

}
