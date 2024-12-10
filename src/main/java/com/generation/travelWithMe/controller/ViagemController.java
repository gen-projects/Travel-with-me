package com.generation.travelWithMe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.travelWithMe.model.ViagemModel;
import com.generation.travelWithMe.repository.ViagemRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/viagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;

	@GetMapping
	public ResponseEntity<List<ViagemModel>> getAll() {
		return ResponseEntity.ok(viagemRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ViagemModel> getById(@PathVariable Long id) {
		return viagemRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	} 
	
	@GetMapping("/destino/{destino}")
	public ResponseEntity<List<ViagemModel>> getByNome(@PathVariable String destino){
		return ResponseEntity.ok(viagemRepository.findAllByDestinoContainingIgnoreCase(destino));
	}
	
	@PostMapping
	public ResponseEntity<ViagemModel> post(@Valid @RequestBody ViagemModel viagemModel){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(viagemRepository.save(viagemModel));
	}
	
	@PutMapping
	public ResponseEntity<ViagemModel> put(@Valid @RequestBody ViagemModel viagemModel){
		return viagemRepository.findById(viagemModel.getId()) 
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
				.body(pessoaRepository.save(viagemModel)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
			
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<ViagemModel> pessoa = viagemRepository.findById(id);
		
		if(pessoa.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		viagemRepository.deleteById(id);	
	}	
}
