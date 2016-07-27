package com.rina.model;

import java.io.Serializable;

public class UserAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String money;
		
	public UserAccount() {
		// TODO Auto-generated constructor stub
	}
	public UserAccount(int id,String username,String money){
		this.id=id;
		this.username=money;
		this.money=money;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	
}
