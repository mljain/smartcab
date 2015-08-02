package com.smartcab.design.payment;

import java.util.Scanner;

import com.smartcab.payment.domain.Payment;
import com.smartcab.payment.domain.PaymentType;

public class TestPayment {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.setAmount(100.00);
		payment.setCustomerId(12);
		payment.setDriverId(12);
		payment.setInvoiceId(12);
		payment.setPaymentType(PaymentType.CASH);
		PaymentManager.getInstance().submitPayment(payment);
		System.out.println("select the Payment Type");
		System.out.println("1.Manage Service Request");
		System.out.println("2.Manage Vehicle Inventory");
		System.out.println("3.Manage Member");
		Scanner s = new Scanner(System.in);
	//	i = s.nextInt();

	}

}
