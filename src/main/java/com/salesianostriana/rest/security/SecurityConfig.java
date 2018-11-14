package com.salesianostriana.rest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BasicAuthenticationEntryPoint aEntryPoint;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//TODO Completa este método para realizar la autenticación en base de datos
		//con contraseñas bcrypt.

	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// @formatter:off
		http
				.csrf().disable()
				.headers().frameOptions().disable();
		
		/**
		 * TODO: Completa todo lo necesesario para
		 * - Permitir cualquier conexión a /h2-console/
		 * - Permitir las conexiones a la url de registro
		 * - Que el resto de peticiones estén autenticadas con HTTP Basic con el EntryPoint proporcionado
		 */
		// @formatter:on

	}

}
