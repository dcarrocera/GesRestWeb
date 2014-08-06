package com.components.ws.impl;

import javax.jws.WebService;

import com.components.ws.GestRestEndpoint;

@WebService(serviceName="GestRestWebService", endpointInterface="com.components.ws.GestRestEndpoint",  wsdlLocation="/META-INF/wsdl/GestRestWebService.wsdl")
public class GestRestWebService implements GestRestEndpoint {

	
	public com.components.ws.impl.User webMethodTest(String param1, String param2, String param3, String param4) {
		com.components.ws.impl.User use = new com.components.ws.impl.User();
		use.setNombre("hola");
		use.setEdad(49);
		return use;
	}

	
}
