package com.generation.travelWithMe.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

@Service
public class ViagemService {
	

	public static Long tempoDaViagem(float velocidade, float distancia) {
		
		if(velocidade <= 0 || distancia <= 0) {
			throw new IllegalArgumentException("A velocidade e distancia devem ser maior que zero");
		}
		
		long tempoEmSegundos = Math.round((distancia / velocidade) * 3600);
		
		return Duration.ofSeconds(tempoEmSegundos).toMinutes();
	}
	
}
