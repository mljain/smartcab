package com.test.designpattern.bridge;

public class GreenCircle implements DrawAPI {


	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
		
	}

}
