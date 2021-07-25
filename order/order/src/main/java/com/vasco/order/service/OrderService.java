package com.vasco.order.service;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;


@Service
public class OrderService {
	
	@Value("/confirmPayment")
	private String paymentsUrl;

	public String getOrderConfirmation(int id) {
		RestTemplate restTemplate = new RestTemplate();
		String paymentsUrl  = "http://localhost:8085/confirmPayment";
		ResponseEntity<String> response  = restTemplate.getForEntity(paymentsUrl, String.class);
		return "" + response.getStatusCode();
	}
}