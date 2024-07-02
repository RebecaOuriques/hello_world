package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")
public class AprendizagemSemana {

	@GetMapping
	public String aprendizagemSemana() {
		return "Aprendizagem da semana: Aprender Spring Boot, API's, Frameworks!!";
	}
}
