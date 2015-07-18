package com.test.designpattern.state;

public class StopState implements State {
	

	public void doAction(Context context) {
		context.setState(this);
		
	}

	public String toString() {
		return "Stop State";
	}

}
