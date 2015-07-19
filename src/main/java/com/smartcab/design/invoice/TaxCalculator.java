package com.smartcab.design.invoice;

public class TaxCalculator {
	private static TaxCalculator instance;
	private double taxvalue;

	private TaxCalculator(){
		
	}

	public static TaxCalculator getInstance() {
		if (instance == null)
			instance = new TaxCalculator();
		return instance;
	}

	public double salesTotal() { 
		return taxvalue;
	}
}
