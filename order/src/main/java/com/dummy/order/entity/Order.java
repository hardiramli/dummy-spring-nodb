package com.dummy.order.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String productName;
	
	@Column
	private String customer;
	
	@Column
	private Integer amount;
	
	@Column
	private Long totalOrder;
			
}