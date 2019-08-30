package com.vp.publish;

import javax.xml.ws.Endpoint;
import com.vp.soapservice.ProductService;
public class ServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8082/SoapService/services/ProductService", new ProductService());

	}

}
