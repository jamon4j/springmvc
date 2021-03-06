package com.zjj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zjj.inter.SqlMap;
import com.zjj.model.Article;

@Controller
@RequestMapping("/article")
public class UserController {
	@Autowired
	SqlMap sqlMap;
	
	@RequestMapping("/list")	
	public ModelAndView listAll(HttpServletRequest request,HttpServletResponse response)
	{
		List<Article> articles = sqlMap.selectArticlesByUser(1);
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("articles", articles);
		return mav;
	}
}
