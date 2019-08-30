package com.vp.webservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "ProductCatalog", serviceName = "RajeshService", targetNamespace = "http://service.webservice.rajesh.com")
public class ProductService {
  
	@WebMethod(action="FetchProducts",operationName="fetchProducts")
	public List<String> getProducts(String state) {

		List<String> productList = new ArrayList<String>();
		switch (state) {
		case "CA":
			productList.add("Home Owners");
			productList.add("Personal Auto");
			productList.add("Personal Collections");
			break;
		case "AZ":
			productList.add("Personal Auto");
			productList.add("Personal Collections");
			productList.add("Personal Excess");
			productList.add("BOD");
			break;
		case "NY":
			productList.add("Personal Auto");
			break;
		case "FL":
			productList.add("Personal Collections");
			break;
		default:
			productList.add("Home Owners");
		}

		System.out.println("Called with state = " + state);
		System.out.println("Returning = " + productList);
		return productList;
	}

	
	public Boolean addProduct(String productName) {
		Boolean added = false;

		System.out.println(" Product : " + productName + "Added ");

		return added;
	}

}
