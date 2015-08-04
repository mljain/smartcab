package com.smartcab.design.recipt;

import com.smartcab.payment.domain.Payment;

public abstract class PaymentReceipt {
	public double finalamount=0.00;
	
	public  void generateReceipt(Payment payment){
		getInvoice(payment);
		getServiceTax(payment);
		//generateReceiptimpl(payment);
		//processReceipt(finalamount);
		
	}

	public   abstract void generateReceiptimpl(Payment payment);
	public   abstract void processReceipt(double finalamount);

	private void getServiceTax(Payment payment) {
		System.out.println("****Getting the Service Tax****");
		System.out.println("Service Tax Amount"+payment.getServiceTax());
		
	}

	private void getInvoice(Payment payment) {
		System.out.println("****Getting the Invoice****");
		System.out.println("Get Invoice"+payment.getServiceTax());
		//finalamount=payment.getAmount();
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
