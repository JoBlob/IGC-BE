package com.cgi.latch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.latch.dto.UserDto;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public UserDto createUser(@RequestBody UserDto userDto) {
		//TODO: Convertir le DTO a un DAO et creer l'utilisateur dans la base de donnees
			
		sanitizeDto(userDto);
		return userDto;
	}
	
	private void sanitizeDto(UserDto userDto) {
		userDto.setPassword("");
	}
}
