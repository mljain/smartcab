package com.test.designpattern.state1;

public class Admission implements AdmissionInterface {
	State state;

	public Admission() {
		state = new WaitingState(this);
	}

	public void receiveApplication() {
		System.out.println(state.receiveApplication());
	}

	public void qualifyApplicant(double g) {
		System.out.println(state.qualifyApplicant(g));
	}

	public void admitStudent() {
		System.out.println(state.admitStudent());
	}

	public void setState(State s) {
		state = s;
	}

	public State getState() {
		return state;
	}

}
