package com.smartcab.design.payment;

import com.smartcab.design.invoice.Invoice;

public abstract class PaymenProcessor {
	public abstract void processPayment(double amount,Invoice invoice);
	public abstract void updateTransaction();
	

}
