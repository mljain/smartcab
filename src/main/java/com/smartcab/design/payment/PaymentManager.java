/**
 * 
 */
package com.smartcab.design.payment;

import com.smartcab.main.RequestStrategy;


/**
 * @author mahesh
 *
 */
public class PaymentManager implements RequestStrategy{
	static PaymentManager pm;

	public static PaymentManager getInstance(){
		if(pm==null) {
			pm = new PaymentManager();
		}
		return pm;
	}

}
