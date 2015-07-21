package com.smartcab.design.notification;

import com.smartcab.design.invoice.Invoice;
import com.smartcab.member.domain.Member;

public class PaymentNotify extends NotificationManager {
	private Invoice invoice;

	/**
	 * @return the invoice
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice
	 *            the invoice to set
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
		notifyObserver(new Member());
	}

}
