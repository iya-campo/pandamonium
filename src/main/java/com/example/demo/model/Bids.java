package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="bids")
public class Bids {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer BID_PRICE;
	
	private Integer BID_ID;
	
	private Integer USER_ID;
	
	private Integer FOOD_ID;
	
}
