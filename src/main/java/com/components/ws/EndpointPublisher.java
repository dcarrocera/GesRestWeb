package com.components.ws;

import javax.xml.ws.Endpoint;

import com.components.ws.impl.GestRestWebService;

public class EndpointPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			final String url = "http://localhost:8080/GesRestWeb/GestRestWebService"; 
		 System.out.println("Publishing RandService at endpoint " + url);
		 Endpoint.publish(url, new GestRestWebService()); 


	}

}
