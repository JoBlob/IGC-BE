package com.cgi.latch.repository.dto;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.latch.model.User;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public User getUser() {
		User user = new User();
		user.setFirstName("Flavien");
		user.setLastName("Grenier");

		return user;
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public User getUser(@RequestBody User user) {
		User testHere = user;
		
		return user;
	}
}
