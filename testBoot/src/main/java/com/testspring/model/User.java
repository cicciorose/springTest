package com.testspring.model;

import org.springframework.stereotype.Component;


public class User {

	
	private Long idUser;
	
	private String username;
	
//	public User() {
//		super();
//	}
	public User(Long idUser, String username) {
		
		this.idUser = idUser;
		this.username = username;
	}
	public Long getIdUser() {
		return idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + "]";
	}
	
	
}
