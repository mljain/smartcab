package com.smartcab.design.invoice;

import com.smartcab.design.payment.Payment;

public class Invoice {
	
	private int invoiceId;
	private int vehicleId;
	private int requestId;
	private String source;
	private String desination;
	private TaxCalculator taxcalc;
	private double totalAmount;
	
	/**
	 * @return the taxcalc
	 */
	public TaxCalculator getTaxcalc() {
		return TaxCalculator.getInstance();
	}
	/**
	 * @param taxcalc the taxcalc to set
	 */
	public void setTaxcalc(TaxCalculator taxcalc) {
		this.taxcalc = taxcalc;
	}
	/**
	 * @return the invoiceId
	 */
	public int getInvoiceId() {
		return invoiceId;
	}
	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @return the desination
	 */
	public String getDesination() {
		return desination;
	}
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @param desination the desination to set
	 */
	public void setDesination(String desination) {
		this.desination = desination;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
