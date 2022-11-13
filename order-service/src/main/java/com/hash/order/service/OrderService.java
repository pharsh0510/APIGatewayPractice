package com.hash.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hash.order.common.Payment;
import com.hash.order.common.TransactionRequest;
import com.hash.order.common.TransactionResponse;
import com.hash.order.dao.OrderRepository;
import com.hash.order.entity.OrderEntity;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		OrderEntity order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmountPaid(order.getAmountPaid());

		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/api/v1/payment/doPayment", payment, Payment.class);
		String paymentRes = paymentResponse.getPaymentStatus().equals("Success") ? "The payment was successful" : "Payment Failed, Please try again!";
		
		OrderEntity savedOrder = orderRepository.save(order);
		return new TransactionResponse(savedOrder, paymentResponse.getAmountPaid(), paymentResponse.getTransactionId(), paymentRes);
	}
}