package com.joe.User.controller;

import com.joe.User.entity.User;
import com.joe.User.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther liangxiongqiao
 * @date 2018/3/13 15:16
 * @description
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService iUserService;

	@ResponseBody
	@RequestMapping("test")
	public String say(){
		return "hello world!";
	}

	@RequestMapping("index")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@RequestMapping("testJpa")
	public void testJpa(){
		List<User> userList = this.iUserService.findAll();
		System.out.println("123");
	}
}
