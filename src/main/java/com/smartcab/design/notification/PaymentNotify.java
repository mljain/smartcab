package com.smartcab.design.notification;


public class PaymentNotify extends Observer {
	public PaymentNotify(NotificationManager manager){
		  this.manager = manager;
	      this.manager.attach( this);
	}

	@Override
	public void update() {
		System.out.println("******************************");
		System.out.println("PaymentNotify Observer Is called");
		System.out.println("******************************");
		
	}
}
