package com.taobao.entity;

public class User {
	
	private String username;
	private String password;
	private char state;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
}
