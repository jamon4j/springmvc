package com.zjj.model;

public class User {
	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public User(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public User() {
		super();
	}
	
	public String toString() {
		return "User [id = "+id +",name = "+username+"]";
	}
}
