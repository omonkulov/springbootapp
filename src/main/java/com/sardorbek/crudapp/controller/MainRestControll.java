package com.sardorbek.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sardorbek.crudapp.entity.User;
import com.sardorbek.crudapp.repository.UserRepository;


@RestController
@RequestMapping("delete")
public class MainRestControll {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping(path ="/all")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	@PostMapping(path ="/all")
	public List<User> deleteAllUsers() {
		userRepository.deleteAll();
		return userRepository.findAll();
	}
}
