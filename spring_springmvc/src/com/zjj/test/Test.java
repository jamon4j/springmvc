package com.zjj.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Test {
	@RequestMapping("/find")
	public void test()
	{
		System.out.println("pass!");
	}
}
