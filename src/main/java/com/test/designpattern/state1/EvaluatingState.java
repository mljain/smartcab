package com.test.designpattern.state1;

public class EvaluatingState implements State {

	private AdmissionInterface admission;

	public EvaluatingState(AdmissionInterface a) {
		admission = a;
	}

	public String receiveApplication() {
		return "Already received an application.";
	}

	public String qualifyApplicant(double g) {
		if (g >= AdmissionInterface.GPA) {
			
			admission.setState(new ProcessingState(admission));
			return "The application is accepted.";
		} else {
		
			admission.setState(new WaitingState(admission));
			return "The applicant is denied.";
		}
	}

	public String admitStudent() {
		return "Must be evaluated first.";
	}
}
