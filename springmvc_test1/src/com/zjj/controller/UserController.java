package com.zjj.controller;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		Map<String,Object> maps = new HashMap<String,Object>();
		maps.put("user1", "zjj");
		maps.put("user2", "sds");
		maps.put("user3", "qed");
		
		return new ModelAndView("/welcome","maps",maps);
	}
}
