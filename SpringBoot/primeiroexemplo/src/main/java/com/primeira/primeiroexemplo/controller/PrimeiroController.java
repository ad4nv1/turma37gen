package com.primeira.primeiroexemplo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	
	@GetMapping("/atividade1")
	public String exemplo() {
		return "atenção aos detalhes, persistência";
	}
	@GetMapping("/atividade2")
	public String exemplo2() {
		return "Desenvolver habilidades de desenvolvimento back-end";
	}
}
