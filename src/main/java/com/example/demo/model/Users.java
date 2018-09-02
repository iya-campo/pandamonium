package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer USER_ID;
	
	private String USER_NAME;
	
	private String ROLE;
	
	public Integer getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(Integer uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public String getRole() {
		return ROLE;
	}

	public void setRole(String role) {
		ROLE = role;
	}
	
}
