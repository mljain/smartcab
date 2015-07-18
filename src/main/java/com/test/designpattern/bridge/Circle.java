package com.test.designpattern.bridge;

public class Circle extends Shape {

	private int x, y, radius;
	protected Circle(int x, int y, int radius,DrawAPI drawapi) {
		super(drawapi);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	}

	@Override
	public void draw() {
		drawapi.drawCircle(radius, x, y);
		
	}

}
