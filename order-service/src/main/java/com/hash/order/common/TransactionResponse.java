package com.hash.order.common;

import com.hash.order.entity.OrderEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    
    public OrderEntity order;
    public double amountPaid;
    public String transactionId;
    public String message;
}