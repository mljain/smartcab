package com.smartcab.design.recipt;

import com.smartcab.payment.domain.Payment;

public abstract class PaymentReceipt {
	private double finalamount=0.00;
	
	public  void generateReceipt(Payment payment){
		getInvoice(payment);
		getServiceTax(payment);
		//generateReceipt();
		
	}

	//public  abstract generateReceipt();

	private void getServiceTax(Payment payment) {
		System.out.println("****Getting the Service Tax****");
		finalamount=payment.getServiceTax();
		
	}

	private void getInvoice(Payment payment) {
		System.out.println("****Getting the Invoice****");
		finalamount=payment.getAmount();
	}

	/**
	 * @return the finalamount
	 */
	public double getFinalamount() {
		return finalamount;
	}

	/**
	 * @param finalamount the finalamount to set
	 */
	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}

}
