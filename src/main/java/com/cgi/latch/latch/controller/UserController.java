package com.cgi.latch.latch.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public UserDto getUserDto() {
		UserDto userDto = new UserDto();
		userDto.setFirstName("Flavien");
		userDto.setLastName("Grenier");
		userDto.setPassword("toto");
		
		return userDto;
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public UserDto getUserDto(@RequestBody UserDto userDto) {	
		UserDto testHere = userDto; 
		
		return userDto;
	}
}
