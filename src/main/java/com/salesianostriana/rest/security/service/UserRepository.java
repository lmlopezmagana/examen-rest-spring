package com.salesianostriana.rest.security.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.rest.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
