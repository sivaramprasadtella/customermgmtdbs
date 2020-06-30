package com.siva.ordermanagement.springbootjpacrud;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.siva.ordermanagement.springbootjpacrud.model.OrderInfo;

public class SpringRestClient {

	private static final String GET_ALL_ITEMS_ENDPOINT_URL = "http://localhost:8080/api/v1/items";
	private static final String GET_ITEM_ENDPOINT_URL = "http://localhost:8080/api/v1/item/{id}";
	private static final String POST_EMPLOYEE_ENDPOINT_URL = "http://localhost:8080/api/v1/item";

	private static final String CREATE_ORDERS_ENDPOINT_URL = "http://localhost:8080/api/v1/orders";
	private static final String GET_ORDERS_ENDPOINT_URL = "http://localhost:8080/api/v1/order/{id}";
	private static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringRestClient springRestClient = new SpringRestClient();
		
	
	}

	
}
