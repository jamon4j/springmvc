package com.zjj.controller.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zjj.controller.entity.User;

@Controller
@RequestMapping("/user2")
public class User2Controller {
	/*@RequestMapping("/addUser")
	public String addUser(@RequestParam String username,@RequestParam String password,HttpServletRequest request,HttpServletResponse response)
	{	
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "/userManager";
	}*/
	
	@RequestMapping("/addUser")
	public String addUser(User user,HttpServletRequest request,HttpServletResponse response)
	{	
		request.setAttribute("username", user.getUsername());
		request.setAttribute("password", user.getPassword());
		return "/userManager";
	}
	
	@RequestMapping("/addUserJson")
	public String addUserJson(@ModelAttribute User user,HttpServletRequest request,HttpServletResponse response)
	{	
		//{"username":"user.getUsername","password":"user.getPassword"}
		String result = "{\"username\":\"" + user.getUsername() + "\",\"password\":\"" + user.getPassword() +"\"}";
		PrintWriter pw = null;
		response.setContentType("application/json");
		try {
			pw = response.getWriter();
			pw.write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/userManager";
	}
	
	@RequestMapping("/toUser")
	public String toUser()
	{	
		return "/addUser";
	}
	
	@RequestMapping("/toUserJson")
	public String toUserJson()
	{	
		return "/json";
	}
}
