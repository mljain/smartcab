/**
 * 
 */
package com.smartcab.main;

import com.smartcab.model.SmartCabData;

/**
 * @author mahesh
 *
 */
public interface RequestStrategy {
   public void processRequest(SmartCabData data);
}
