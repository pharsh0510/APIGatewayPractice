package com.hash.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hash.order.common.TransactionRequest;
import com.hash.order.common.TransactionResponse;
import com.hash.order.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse saveSingleOrder(@RequestBody TransactionRequest transactionRequest) {
		return orderService.saveOrder(transactionRequest);
	}
}