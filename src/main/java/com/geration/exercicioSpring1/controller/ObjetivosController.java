package com.geration.exercicioSpring1.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public List<String> listar() {
		return Arrays.asList("Assistir a todas as aulas", "Fazer exercícios em dia", "Trocar com os colegas no Discord");
	}
}
