package com.generation.travelWithMe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo categoria é obrigatório!")
	@Size(max = 50, message = "O atributo deve conter no máximo 50 caracteres")
	private String categoria;
	
	@Size(min = 5, max = 255, message = "O atributo deve conter no mínimo 5 e no máximo 255 caracteres")
	private String descricao;	
}
