package com.hash.order.common;

import com.hash.order.entity.OrderEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
    
    public OrderEntity order;
    public Payment payment;   
}