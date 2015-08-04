package com.smartcab.design.recipt;

import com.smartcab.payment.domain.Payment;

public class EmailReceipt extends PaymentReceipt {

	@Override
	public void generateReceiptimpl(Payment payment) {
		generateReceipt(payment);
		finalamount= payment.getAmount()+payment.getServiceTax();
		processReceipt(finalamount);
		
	}

	@Override
	public void processReceipt(double finalamount) {
	System.out.println("******Sending Email Receipt*******"+"\\n");
	System.out.println("******Final Amount*******"+"\\n");
	System.out.println(finalamount+"\\n");
	
	System.out.println("******Email Receipt Send*******"+"\\n");
		
	}


}
