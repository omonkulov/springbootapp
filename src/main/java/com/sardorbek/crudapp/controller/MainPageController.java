package com.sardorbek.crudapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sardorbek.crudapp.entity.User;
import com.sardorbek.crudapp.repository.UserRepository;

@Controller
@RequestMapping("/")
public class MainPageController {
	@Autowired
	UserRepository userRepository;

	@GetMapping
	public String getUser(HttpServletRequest attribute) {
		attribute.setAttribute("allUsers", userRepository.findAll());
		return "index";
	}

	@PostMapping()
	public String addUser(@ModelAttribute User user, HttpServletRequest request) {
		System.out.print(user.getFirstName());
		System.out.print(user.toString());
		userRepository.save(user);
		request.setAttribute("allUsers", userRepository.findAll());
		return "index";
	}

}
