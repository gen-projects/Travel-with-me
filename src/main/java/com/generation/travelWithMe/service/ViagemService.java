package com.generation.travelWithMe.service;

import java.sql.Time;

import org.springframework.stereotype.Service;

@Service
public class ViagemService {
	

	public static Time tempoDaViagem(float velocidade, float distancia) {
		
		if(velocidade <= 0 || distancia <= 0) {
			throw new IllegalArgumentException("A velocidade e distancia devem ser maior que zero");
		}
		
		float tempoEmHoras = distancia / velocidade;
		
		long milissegundos = Math.round(tempoEmHoras * 3600 * 1000);
		
		return new Time(milissegundos);
	}
	
}
