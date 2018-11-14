package com.salesianostriana.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
		
	private String titulo;	
	private int numeroPaginas;
	
	@ManyToMany
	List<Autor> misAutores = new ArrayList<>();
	
	public Libro(String titulo, int numeroPaginas) {
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
	}

}
