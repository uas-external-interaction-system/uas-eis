package com.uas.eis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uas.eis.service.UserService;

@RestController
public class HelloWorldController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello,World!";
	}
	
	@RequestMapping("/getUser")
	public Map<String, Object> getUser(String username){
		return userService.getUser(username);
	}
}
