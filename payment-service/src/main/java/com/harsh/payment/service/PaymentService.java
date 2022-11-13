package com.harsh.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

import com.harsh.payment.dao.PaymentRepository;
import com.harsh.payment.entity.PaymentEntity;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public PaymentEntity savePaymentDetails(PaymentEntity payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}

	public String paymentProcessing() {
		return new Random().nextBoolean()?"Success":"Failed";
	}
}
