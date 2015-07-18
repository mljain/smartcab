package com.test.designpattern.state1;

public class ProcessingState implements State {

	private AdmissionInterface admission;

	public ProcessingState(AdmissionInterface a) {
		admission = a;
	}

	public String receiveApplication() {
		return "The appcation is finalized.";
	}

	public String qualifyApplicant(double g) {
		return "The appcation is finalized.";
	}

	public String admitStudent() {
		admission.setState(new WaitingState(admission));
		return "The application is finalized and an admission letter is in the mail.";
	}
}
