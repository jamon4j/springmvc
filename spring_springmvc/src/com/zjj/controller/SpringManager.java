package com.zjj.controller;

public class SpringManager implements ISpring{
	public String getManager() {
		System.out.println("I'm SpringManager!");
		return "get method from SpringManager";
	}
}
