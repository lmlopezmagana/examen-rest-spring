package com.salesianostriana.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesianostriana.rest.security.model.User;

@RestController
public class UserController {
	
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping("/auth/register")
	public ResponseEntity<?> registro(@RequestBody User user) {
		//TODO Completa todo el código necesario para crear un nuevo usuario
		return null;
	}

}
