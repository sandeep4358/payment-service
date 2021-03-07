package com.longKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.longKart.controller.PaymentController;

@SpringBootApplication
public class PaymentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMicroServiceApplication.class, args);
	}

}
