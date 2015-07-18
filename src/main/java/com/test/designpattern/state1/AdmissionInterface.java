package com.test.designpattern.state1;

public interface AdmissionInterface {
	public static final double GPA = 3.0;

	public void receiveApplication();

	public void qualifyApplicant(double g);

	public void admitStudent();

	public State getState();

	public void setState(State s);
}