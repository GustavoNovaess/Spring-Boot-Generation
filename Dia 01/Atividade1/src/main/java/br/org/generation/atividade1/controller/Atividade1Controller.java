package br.org.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Annotation que indica que é uma classe controladora
public class Atividade1Controller {

	@GetMapping("/atividade1")
	public String atividade() {
		return "Hello World!\n Nessa atividade utilizei a habilidade de atenção ao detalhe e a mentalidade de persistência!";
	}
	
}
