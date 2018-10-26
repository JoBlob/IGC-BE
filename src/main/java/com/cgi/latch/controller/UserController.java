package com.cgi.latch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.latch.dto.UserDto;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public UserDto createUser(@RequestBody UserDto userDto) {
		//TODO: Convertir le DTO a une Entity et creer l'utilisateur dans la base de donnees		
		String passwordEncoded = passwordEncoder.encode(userDto.getPassword());
		//TODO: mettre le password encode dans l'entity			
		sanitizeDto(userDto);
		return userDto;
	}
	
	private void sanitizeDto(UserDto userDto) {
		userDto.setPassword("");
	}
}
