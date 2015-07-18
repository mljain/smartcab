package com.test.designpattern.bridge;

public abstract class Shape {
	DrawAPI drawapi;
	protected Shape(DrawAPI drawapi){
		this.drawapi=drawapi;
		
	}
	
	public abstract void draw();

}
