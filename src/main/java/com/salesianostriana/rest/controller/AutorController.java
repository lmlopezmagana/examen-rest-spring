package com.salesianostriana.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesianostriana.rest.model.Autor;

@RestController
public class AutorController {

	
	@GetMapping("/autor")
	public ResponseEntity<?> listaAutores() {
		//TODO Completa todo lo necesario para devolver una lista con todos los autores y los libros que han escrito
		return null;
	}
	
	@PostMapping("/autor")
	public ResponseEntity<?> nuevoAutor(@RequestBody Autor autor) {
		//TODO Completa todo lo necesario para dar de alta un nuevo autor (sin libros escritos).
		return null;
	}

}
