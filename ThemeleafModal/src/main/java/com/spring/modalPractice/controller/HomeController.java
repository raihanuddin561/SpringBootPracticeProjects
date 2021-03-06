package com.spring.modalPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.modalPractice.model.User;
import com.spring.modalPractice.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
	public String home(Model model) {
		List<User> users = userService.getAllUser();
		model.addAttribute("users",users);
		return "index";
	}
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		
		return "redirect:/";
	}
}
