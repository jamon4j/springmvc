package com.zjj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StaticController extends MultiActionController{
	public ModelAndView viewImg(HttpServletRequest request,HttpServletResponse response) {
		return new ModelAndView("/viewImg");
	}
}
