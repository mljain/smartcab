/**
 * 
 */
package com.smartcab.design.payment;

import com.smartcab.main.RequestStrategy;
import com.smartcab.payment.domain.Payment;
import com.smartcab.payment.domain.PaymentType;

/**
 * @author mahesh
 *
 */
public class PaymentManager implements RequestStrategy {
	static PaymentManager pm;
	PaymenProcessor pp = null;
	com.smartcab.design.payment.Payment paymentType = null;

	public static PaymentManager getInstance() {
		if (pm == null) {
			pm = new PaymentManager();
		}
		return pm;
	}

	public void submitPayment(Payment payment) {
		if (payment.getPaymentType().equals(PaymentType.CREDITCARD)
				|| payment.getPaymentType().equals(PaymentType.DEBITCARD)) {
			//
			System.out.println("Processing Payment Using Card"+payment.getPaymentType());
			pp = new GenericCardPaymentGateway();
			paymentType = new CardPayment(pp);
			paymentType.process(payment);

		}

		else if (payment.getPaymentType().equals(PaymentType.CASH)) {
			System.out.println("Processing Payment Using Cash Payment");
			pp = new CashPaymentGateway();
			paymentType = new CashPayment(pp);
			paymentType.process(payment);

		}
		else if (payment.getPaymentType().equals(PaymentType.CHECK)) {
			System.out.println("Processing Payment Using Check payment");
			pp = new CheckPaymentGateway();
			paymentType = new CheckPayment(pp);
			paymentType.process(payment);

		}
		
		else if (payment.getPaymentType().equals(PaymentType.MOBILEPAY)) {
			System.out.println("Processing Payment Using Mobile Payment");
			pp = new MobilePaymentGateway();
			paymentType = new MobilePayment(pp);
			paymentType.process(payment);

		}
	}

}
