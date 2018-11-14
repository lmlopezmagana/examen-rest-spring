package com.salesianostriana.rest;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.rest.model.Autor;
import com.salesianostriana.rest.model.Libro;
import com.salesianostriana.rest.repositories.AutorRepo;
import com.salesianostriana.rest.repositories.LibroRepo;

@SpringBootApplication
public class PlantillaExamenRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantillaExamenRestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(AutorRepo autorRepo, LibroRepo libroRepo) {
		
		return (args) -> {
			
			Autor a1 = new Autor("Jesús Casanova", LocalDate.of(1980, 1, 10));
			Autor a2 = new Autor("Luis Miguel López", LocalDate.of(1982, 2, 20));
			Autor a3 = new Autor("Miguel Campos", LocalDate.of(1984, 3, 30));
			
			Libro l1 = new Libro("Productividad en las empresas", 200);
			Libro l2 = new Libro("Apps móviles con Android", 750);
			Libro l3 = new Libro("Salesianos por el Mundo", 195);
			
			autorRepo.save(a1);
			autorRepo.save(a2);
			autorRepo.save(a3);
			
			libroRepo.save(l1);
			libroRepo.save(l2);
			libroRepo.save(l3);
			
			l1.getMisAutores().add(a1);
			l1.getMisAutores().add(a3);
			libroRepo.save(l1);
			
			l2.getMisAutores().add(a2);
			l2.getMisAutores().add(a3);
			libroRepo.save(l2);
			
			l3.getMisAutores().add(a2);
			l3.getMisAutores().add(a3);
			libroRepo.save(l3);
			
			
		};
		
		
		
	}
	
}
