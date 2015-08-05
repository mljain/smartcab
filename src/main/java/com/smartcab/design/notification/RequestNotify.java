package com.smartcab.design.notification;

public class RequestNotify extends Observer {
	public RequestNotify(NotificationManager manager) {
		this.manager = manager;
		this.manager.attach(this);
	}

	@Override
	public void update() {
		System.out.println("******************************");
		System.out.println("RequestNotify Observer Is called");
		System.out.println("******************************");

	}

}
