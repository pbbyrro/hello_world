package com.geration.exercicioSpring1.controller;


import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")
public class BSMController {
	
	@GetMapping
	public List<String> listar() {
		return Arrays.asList("Persistência", "Proatividade", "Mentalidade de cresimento", "Orientação ao detalhe");
	}
}
