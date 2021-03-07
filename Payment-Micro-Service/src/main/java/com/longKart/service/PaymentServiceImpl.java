package com.longKart.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longKart.entity.Payment;
import com.longKart.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public Payment savePayment(Payment payment) {
		// below code should be generated from the payment gate way
		payment.setTransactionId(UUID.randomUUID().toString());			
		payment.setPaymentStatus(new Random().nextBoolean()?"SUCCESS":"FAIL");
		payment.setPaymentId((int)Math.random()*120000);
		
		return paymentRepository.save(payment);
	}

}
