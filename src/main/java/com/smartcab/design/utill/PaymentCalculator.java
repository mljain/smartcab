package com.smartcab.design.utill;

import com.smartcab.payment.domain.Payment;
import com.smartcab.request.domain.Request;

public  abstract class PaymentCalculator {
	
	public abstract Payment finalPayment(Request request);
}
