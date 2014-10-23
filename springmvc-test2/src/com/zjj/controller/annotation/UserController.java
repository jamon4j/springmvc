package com.zjj.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/addUser")
	public ModelAndView addUser()
	{
		String result = "this is addUser()";
		return new ModelAndView("/jquery","result",result);
	}
	
	@RequestMapping("/delUser")
	public ModelAndView delUser()
	{
		String result = "this is delUser()";
		return new ModelAndView("/jquery","result",result);
	}
	
	@RequestMapping("/toUser")
	public ModelAndView toUser()
	{
		return new ModelAndView("/jquery");
	}
}
