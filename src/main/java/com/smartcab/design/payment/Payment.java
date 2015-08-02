package com.smartcab.design.payment;


public abstract class Payment {
	protected PaymenProcessor _pp;
	public double amount;
	
	public Payment(PaymenProcessor pp){
		this._pp = pp;
		
	}
public abstract void process(com.smartcab.payment.domain.Payment payment);

protected void processPayment(com.smartcab.payment.domain.Payment payment){
	_pp.processPayment(payment);
}

protected void updateTransaction(){
	_pp.updateTransaction();
}


	

}
