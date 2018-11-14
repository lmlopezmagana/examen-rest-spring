package com.salesianostriana.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.rest.model.Libro;

public interface LibroRepo extends JpaRepository<Libro, Long> {

}
