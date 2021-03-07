package com.longKart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.longKart.entity.Payment;
import com.longKart.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/doPayment")	
	public Payment processPayment(@RequestBody Payment payment) {
		System.out.println("payment ::"+payment);		
		return paymentService.savePayment(payment);		
	}
	
}
