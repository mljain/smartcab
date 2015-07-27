/**
 * 
 */
package com.smartcab.design.dispatcher;

import com.smartcab.main.RequestStrategy;


/**
 * @author mahesh
 *
 */
public class DispatcherManager implements RequestStrategy{

	static DispatcherManager pm;

	public static DispatcherManager getInstance(){
		if(pm==null) {
			pm = new DispatcherManager();
		}
		return pm;
	}

	
}
