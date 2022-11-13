package com.harsh.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.payment.entity.PaymentEntity;
import com.harsh.payment.service.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public PaymentEntity savePayment(@RequestBody PaymentEntity paymentEntity) {
		return paymentService.savePaymentDetails(paymentEntity);
	}

}
