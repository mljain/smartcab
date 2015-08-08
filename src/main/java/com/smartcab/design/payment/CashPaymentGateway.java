package com.smartcab.design.payment;

import java.util.Scanner;

import com.smartcab.design.notification.NotificationManager;
import com.smartcab.design.notification.NotifyDispatch;
import com.smartcab.design.notification.PaymentNotify;
import com.smartcab.design.notification.RequestNotify;
import com.smartcab.design.recipt.EmailReceipt;
import com.smartcab.design.recipt.MessageReceipt;
import com.smartcab.design.recipt.PaperReceipt;
import com.smartcab.payment.domain.Payment;

public class CashPaymentGateway extends PaymenProcessor {

	@Override
	public void updateTransaction() {
		System.out.println("Updating the Transaction after Payment.");
	}

	@Override
	public void processPayment(Payment payment) {
		System.out.println("Processing Payment using CashPaymentGateway");
		System.out.println("**********************************************");
		System.out.println("Amont:"+payment.getAmount()+payment.getServiceTax());
		System.out.println("**********************************************");

		System.out.println("Processing Payment using CashPaymentGateway Done");

		System.out.println("select the Receipt Type");
		System.out.println("1.Send Email Recepit");
		System.out.println("2.Send Receipt Via Sms");
		System.out.println("3.Print Paper Receipt");
		System.out.println("4.No Reeipt");
		Scanner s = new Scanner(System.in);
		int i = 0;
		i = s.nextInt();

		switch(i) {
		case 1: 
			EmailReceipt email = new EmailReceipt();
			email.generateReceiptimpl(payment);
			break;
		case 2: 
			MessageReceipt message = new MessageReceipt();
			message.generateReceiptimpl(payment);
			break;
		case 3: 
			PaperReceipt paper = new PaperReceipt();
			paper.generateReceiptimpl(payment);
			break;
		case 4: 
			System.out.println("Thank you for payment");
					System.out.println("No receipt desired");
					break;
		default:
			System.out.println("Wrong Option Selected");
		}

	}
	static {
		NotificationManager manager = new NotificationManager();

		new PaymentNotify(manager);
		new NotifyDispatch(manager);
		new RequestNotify(manager);
		manager.setState(10);
	}

}
