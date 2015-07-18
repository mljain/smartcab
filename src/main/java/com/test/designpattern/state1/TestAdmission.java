package com.test.designpattern.state1;

public class TestAdmission {
	static Admission admission;

	public static void main(String[] args) {
		admission = new Admission();
		admission.receiveApplication();
		admission.qualifyApplicant(3.5);
		admission.admitStudent();
	}
}