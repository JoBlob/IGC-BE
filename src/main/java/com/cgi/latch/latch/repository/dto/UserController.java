package com.cgi.latch.latch.repository.dto;

import com.cgi.latch.latch.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
