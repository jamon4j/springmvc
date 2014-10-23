 package com.zjj.model;

public class Article {
	private int id;
	private User user;
	private String title;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Article() {
		super();
	}
	
	public Article(int id, User user, String title, String content) {
		super();
		this.id = id;
		this.user = user;
		this.title = title;
		this.content = content;
	}
}
