package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")

public class ListaBSM {
	@GetMapping
	public String listaBSM() {
		return """
				Lista BSM:
				Mentalidades: de crescimento, responsabilidade pessoal, orientação ao futuro, persistência;
				Competências comportamentais: Comunicação, Proatividade, Orientação ao Detalhe, Trabalho em equipe.
				""";
	}
}
