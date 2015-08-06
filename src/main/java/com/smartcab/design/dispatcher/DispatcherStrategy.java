package com.smartcab.design.dispatcher;

import com.smartcab.request.domain.Request;


public interface DispatcherStrategy {

	String dispatch(Request request);

}
