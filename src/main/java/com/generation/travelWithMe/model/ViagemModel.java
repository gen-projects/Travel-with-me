package com.generation.travelWithMe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_viagem")
public class ViagemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Atributo velocidade é Obrigatorio!")
	private float velocidade;
	
	private Long tempoViagem;
	
	@NotNull
	private float distancia;
	
	@NotBlank(message = "Atributo tipo é Obrigatorio!")
	@Size(min = 5, max = 20, message = "Tipo da viagem deve conter de 5 a 20 caracteres.")
	private String tipo;
	
	
	@NotBlank(message = "Atributo destino é Obrigatorio!")
	@Size(min = 10, max = 50, message = "Destino deve conter de 10 a 50 caracteres.")
	private String destino;
	
	@ManyToOne
	@JsonIgnoreProperties("viagem")
	private CategoriaModel categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("viagem")
	private UsuarioModel usuario;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public float getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}


	public Long getTempoViagem() {
		return tempoViagem;
	}


	public void setTempoViagem(Long tempoViagem) {
		this.tempoViagem = tempoViagem;
	}


	public float getDistancia() {
		return distancia;
	}


	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public CategoriaModel getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}


	public UsuarioModel getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	
	
}
