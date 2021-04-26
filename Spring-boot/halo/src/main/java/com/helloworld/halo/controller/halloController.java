package com.helloworld.halo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class halloController {
	
	
	@GetMapping
	public String hello() {
		return "<b>Habilidades utilizadas:</b> Atenção aos detalhes e "
				+ "Mentalidades de crescimento, persistência.";
				
	}

}
