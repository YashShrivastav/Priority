package com.tatsam.priority.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class UserController {

	//Register an user
	
	@GetMapping("/register")
	public String register()
	{
		return "This is register page";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "this is login page";
	}

}
