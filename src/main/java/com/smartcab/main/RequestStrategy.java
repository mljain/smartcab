/**
 * 
 */
package com.smartcab.main;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;

/**
 * @author mahesh
 *
 */
public interface RequestStrategy {
   public void processRequest(SmartCabData data,Request request);
}
