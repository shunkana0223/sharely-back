package com.sharely.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharely.model.User;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@PostMapping(path = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User registerUser(@RequestBody User user) {
		return user;
	}
	
}
