package com.smartcab.design.payment;

import java.util.Scanner;

import com.smartcab.payment.domain.Payment;
import com.smartcab.payment.domain.PaymentType;

public class PaymnetController {

	public static void processPayment(Payment payment) {
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
            	payment.setPaymentType(PaymentType.CREDITCARD);
            	PaymentManager.getInstance().submitPayment(payment);
        		break;
            case 2: 
            	payment.setPaymentType(PaymentType.CASH);
            	PaymentManager.getInstance().submitPayment(payment);
        		break;
            case 3: 
            	payment.setPaymentType(PaymentType.CHECK);
        		PaymentManager.getInstance().submitPayment(payment);
        		break;
            case 4: 
            	payment.setPaymentType(PaymentType.MOBILEPAY);
        		PaymentManager.getInstance().submitPayment(payment);
        		break;
           default : System.out.println("Thank You for using Smart Cab Application.");
                    System.exit(0);

        }
	}

}
