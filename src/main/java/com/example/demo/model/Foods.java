package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="foods")
public class Foods {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer FOOD_ID;
	
	private String FOOD_NAME;
	
	private String FOOD_CATEGORY;
	
	private String FOOD_DESC;
	
	private Integer BASE_PRICE;
	
	private String IMG_PATH;
	
	private Boolean IS_APPROVED;

	public Integer getFOOD_ID() {
		return FOOD_ID;
	}

	public void setFOOD_ID(Integer fOOD_ID) {
		FOOD_ID = fOOD_ID;
	}

	public String getFOOD_NAME() {
		return FOOD_NAME;
	}

	public void setFOOD_NAME(String fOOD_NAME) {
		FOOD_NAME = fOOD_NAME;
	}

	public String getFOOD_CATEGORY() {
		return FOOD_CATEGORY;
	}

	public void setFOOD_CATEGORY(String fOOD_CATEGORY) {
		FOOD_CATEGORY = fOOD_CATEGORY;
	}

	public String getFOOD_DESC() {
		return FOOD_DESC;
	}

	public void setFOOD_DESC(String fOOD_DESC) {
		FOOD_DESC = fOOD_DESC;
	}

	public Integer getBASE_PRICE() {
		return BASE_PRICE;
	}

	public void setBASE_PRICE(Integer bASE_PRICE) {
		BASE_PRICE = bASE_PRICE;
	}

	public String getIMG_PATH() {
		return IMG_PATH;
	}

	public void setIMG_PATH(String iMG_PATH) {
		IMG_PATH = iMG_PATH;
	}

	public Boolean getIS_APPROVED() {
		return IS_APPROVED;
	}

	public void setIS_APPROVED(Boolean iS_APPROVED) {
		IS_APPROVED = iS_APPROVED;
	}
	
}
