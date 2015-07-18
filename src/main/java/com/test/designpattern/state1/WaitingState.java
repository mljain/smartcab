package com.test.designpattern.state1;

public class WaitingState implements State {

	private AdmissionInterface admission;

	public WaitingState(AdmissionInterface a) {
		admission = a;
	}

	public String receiveApplication() {
		admission.setState(new EvaluatingState(admission));
		return "Received an application.";
	}

	public String qualifyApplicant(double g) {
		return "Must receive an application first.";
	}

	public String admitStudent() {
		return "Must receive an application first.";
	}
}
