package com.smartcab.design.payment;

import com.smartcab.payment.domain.Payment;

public class MobilePaymentGateway extends PaymenProcessor {

	@Override
	public void updateTransaction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void processPayment(Payment payment) {
		System.out.println("Processing Payment using MobilePaymentGateway");
		// System.out.println("1.Manage Service Request");
		// System.out.println("2.Manage Vehicle Inventory");
		// System.out.println("3.Manage Member");
		// System.out.println("4.Operate Dispatcher");
		// System.out.println("5.Exit:");
		// System.out.println("Enter your choice:");

	}

}
