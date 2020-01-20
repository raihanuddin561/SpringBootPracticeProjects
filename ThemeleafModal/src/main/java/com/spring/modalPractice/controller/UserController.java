package com.spring.modalPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.modalPractice.model.User;
import com.spring.modalPractice.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/addUser")
	public String addUser(User user) {
		userService.addUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/getOne/{id}")
	@ResponseBody
	public User getUser(@PathVariable("id") int id) {
		User user = userService.getOne(id);
		return user;
	}
	
	
	
}
