package com.smartcab.design.notification;


public class NotifyDispatch extends Observer {
	
	public NotifyDispatch(NotificationManager manager){
		  this.manager = manager;
	      this.manager.attach( this);
	}

	@Override
	public void update() {
		System.out.println("******************************");
		System.out.println("Dispatch Observer Is called");
		System.out.println("******************************");
		
	}



}
