package com.zjj.controller.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.zjj.controller.ISpring;

@Controller
@RequestMapping("/spring")
public class SpringController {
	@RequestMapping("/get")
	public String get(HttpServletRequest request)
	{
		System.out.println("get pass!");
		
		WebApplicationContext ac1 = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		
		WebApplicationContext ac2 = RequestContextUtils.getWebApplicationContext(request);
		
		/*ISpring springManager = (ISpring) ac1.getBean("springManager");	*/	
		ISpring springManager = (ISpring) ac2.getBean("springManager");		
		System.out.println(springManager.getManager());
		return "/success";
	}
}
