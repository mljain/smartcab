package com.smartcab.design.payment;

import com.smartcab.design.invoice.Invoice;

public abstract class Payment {
	protected PaymenProcessor _pp;
	public double amount;
	
	public Payment(PaymenProcessor pp){
		this._pp = pp;
		
	}
public abstract void process();

protected void processPayment(com.smartcab.payment.domain.Payment payment){
	_pp.processPayment(payment);
}

protected void updateTransaction(){
	_pp.updateTransaction();
}


	

}
