package com.cgi.latch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.latch.dto.UserDto;
import com.cgi.latch.model.User;

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
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public UserDto createUser(@RequestBody UserDto userDto) {
		//TODO: Convertir le DTO a un DAO et creer l'utilisateur dans la base de donnees
		return userDto;
	}
}
