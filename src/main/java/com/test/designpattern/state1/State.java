package com.test.designpattern.state1;

public interface State {
	public String receiveApplication();

	public String qualifyApplicant(double g);

	public String admitStudent();
}