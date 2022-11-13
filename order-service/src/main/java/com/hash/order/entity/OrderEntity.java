package com.hash.order.entity;

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
@Table(name = "ORDER_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	public Long Id;
	
	@Column(name = "ITEM_NUMBER")
	@Getter		@Setter
	public String Item;
	
	@Column(name = "ITEM_DESC")
	@Getter		@Setter
	public String itemDescription;

	@Column(name = "PAYMENT_TYPE")
	@Getter		@Setter
	public String paymentType;

	@Column(name = "QUANTITY")
	@Getter		@Setter
	public Long quantity;
	
	@Column(name = "AMOUNT_PAID")
	@Getter		@Setter
	public double amountPaid;
	
}
