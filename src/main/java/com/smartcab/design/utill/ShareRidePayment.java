package com.smartcab.design.utill;

import com.smartcab.payment.domain.Payment;
import com.smartcab.request.domain.Request;

public class ShareRidePayment extends PaymentCalculator {

	@Override
	public Payment finalPayment(Request request) {
		Payment payment = new Payment();
		payment.setAmount(70.00);
        payment.setServiceTax(12.00);
        return payment;
	}

}
