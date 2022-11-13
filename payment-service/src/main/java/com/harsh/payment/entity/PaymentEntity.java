package com.harsh.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PAYMENT_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_ID")
	public Long paymentId;
	
	@Column(name = "PAYMENT_STATUS")
	@Getter		@Setter
	public String paymentStatus;
	
	@Column(name = "TRANSACTION_ID")
	@Getter		@Setter
	public String transactionId;

	@Column(name = "ORDER_ID")
	@Getter		@Setter
	public Long OrderId;

	@Column(name = "AMOUNT_PAID")
	@Getter		@Setter
	public double amountPaid;
}