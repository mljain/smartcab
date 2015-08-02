package com.smartcab.design.payment;

import com.smartcab.payment.domain.Payment;
import com.smartcab.payment.domain.PaymentType;


public class TestPayment {

	
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.setAmount(100.00);
		payment.setCustomerId(12);
		payment.setDriverId(12);
		payment.setInvoiceId(12);
		payment.setPaymentType(PaymentType.CASH);
		PaymentManager.getInstance().submitPayment(payment);
		
	}

}
