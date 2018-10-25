package com.cgi.latch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.latch.dto.AuthDto;
import com.cgi.latch.dto.UserDto;
import com.cgi.latch.repository.UserRepository;

@RestController
@RequestMapping("api/auth")
public class AuthController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.POST)
	public UserDto createUser(@RequestBody AuthDto authDto) {
		// TODO: find the user entity in the database, validate the password and convert it to a userDto
		// sanitizeDto(userDto);		
		 return null;
	}
	
	private void sanitizeUserDto(UserDto userDto) {
		userDto.setPassword("");
	}
}
