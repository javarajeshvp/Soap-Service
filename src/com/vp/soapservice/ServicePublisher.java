package com.vp.soapservice;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8082/SoapService/services/ProductService", new ProductService());
	}
}
