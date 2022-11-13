package com.hash.order.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	public Long paymentId;
	public String paymentStatus;
	public String transactionId;
	public Long OrderId;
	public double amountPaid;
}