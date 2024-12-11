package com.generation.travelWithMe.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario") //usuario -> tb_usuario

public class UsuarioModel {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "O nome é obrigatório.")
	    @Size(min = 5, max = 50, message = "O nome deve ter entre 5 e 50 caracteres.")
	    private String nome;

	    @NotBlank(message = "O email é obrigatório.")
	    @Size(min = 11, max = 255, message = "O email deve ter entre 11 e 255 caracteres.")
	    @Email(message = "O email deve ser válido.")
	    private String email;

	    @NotBlank(message = "A senha é obrigatória.")
	    @Size(min = 11, max = 255, message = "A senha deve ter entre 11 e 255 caracteres.")
	    private String senha;

	    @Size(max = 5000, message = "A foto deve ter no máximo 5000 caracteres.")
	    private String foto;
	    
	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
	    @JsonIgnoreProperties("usuario")
	    private List<ViagemModel> viagem;

	    // Getters e Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public String getFoto() {
	        return foto;
	    }

	    public void setFoto(String foto) {
	        this.foto = foto;
	    }

		public List<ViagemModel> getViagem() {
			return viagem;
		}

		public void setViagem(List<ViagemModel> viagem) {
			this.viagem = viagem;
		}
	    
	}
