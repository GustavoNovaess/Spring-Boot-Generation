package br.org.generation.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade2Controller {

	@GetMapping("/atividade2")
	public String atividade() {
		return "Hello World! Meus objetivos de aprendizagem essa semana são absorver bem os conceitos básicos do spring boot.";
	}
	
}
