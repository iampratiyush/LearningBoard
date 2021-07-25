package com.vasco.payment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PaymentController {
	
	
	@GetMapping("/confirmPayment")
	public String confirmPayment()  {
		System.out.println("Payment request received");
		return "Payment Confirmed";
	}

}
