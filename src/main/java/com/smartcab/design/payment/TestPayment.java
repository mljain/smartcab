package com.smartcab.design.payment;

import java.util.Scanner;

import com.smartcab.payment.domain.Payment;
import com.smartcab.payment.domain.PaymentType;

public class TestPayment {

	public static void main(String[] args) {
		//Payment payment = new Payment();
		//payment.setAmount(100.00);
		//payment.setCustomerId(12);
		//payment.setDriverId(12);
		//payment.setInvoiceId(12);
		//payment.setPaymentType(PaymentType.CASH);

		System.out.println("select the Payment Type");
		System.out.println("1.CreditCard/Debit Card");
		System.out.println("2.Cash");
		System.out.println("3.Check");
		System.out.println("4.Mobile");
		Scanner s = new Scanner(System.in);
		 int i = 0;
		i = s.nextInt();

        switch(i) {
            case 1: 
            	Payment payment1 = new Payment();
            	//System.out.println("Enter The amount");
        		payment1.setAmount(100.00);
        		payment1.setCustomerId(12);
        		payment1.setDriverId(12);
        		payment1.setInvoiceId(12);
        		payment1.setPaymentType(PaymentType.CREDITCARD);
        		PaymentManager.getInstance().submitPayment(payment1);
            case 2: 
            	Payment payment2 = new Payment();
            	//System.out.println("Enter The amount");
        		payment2.setAmount(100.00);
        		payment2.setCustomerId(12);
        		payment2.setDriverId(12);
        		payment2.setInvoiceId(12);
        		payment2.setPaymentType(PaymentType.CASH);
        		PaymentManager.getInstance().submitPayment(payment2);
            case 3: 
            	Payment payment3 = new Payment();
            	//System.out.println("Enter The amount");
        		payment3.setAmount(100.00);
        		payment3.setCustomerId(12);
        		payment3.setDriverId(12);
        		payment3.setInvoiceId(12);
        		payment3.setPaymentType(PaymentType.CHECK);
        		PaymentManager.getInstance().submitPayment(payment3);
            case 4: 
            	Payment payment4 = new Payment();
            	//System.out.println("Enter The amount");
            	payment4.setAmount(100.00);
            	payment4.setCustomerId(12);
            	payment4.setDriverId(12);
            	payment4.setInvoiceId(12);
            	payment4.setPaymentType(PaymentType.MOBILEPAY);
        		PaymentManager.getInstance().submitPayment(payment4);
           default : System.out.println("Thank You for using Smart Cab Application.");
                    System.exit(0);

        }
	}

}
