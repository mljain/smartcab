package com.smartcab.design.dispatcher;

import com.smartcab.model.SmartCabData;
import com.smartcab.request.domain.Request;


public interface DispatcherStrategy {

	String dispatch(SmartCabData data,Request request);

}
