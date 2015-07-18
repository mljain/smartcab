package com.smartcab.design.payment;

import com.smartcab.model.Invoice;

public abstract class PaymenProcessor {
	public abstract void processPayment(double amount,Invoice invoice);
	public abstract void updateTransaction();
	

}
