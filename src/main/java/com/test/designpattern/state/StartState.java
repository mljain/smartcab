package com.test.designpattern.state;

public class StartState implements State {


	public void doAction(Context context) {
		context.setState(this);
		
	}

	public String toString() {
		return "Start State";
	}

}
