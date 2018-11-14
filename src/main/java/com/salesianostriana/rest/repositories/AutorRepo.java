package com.salesianostriana.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.rest.model.Autor;

public interface AutorRepo extends JpaRepository<Autor, Long> {

}
