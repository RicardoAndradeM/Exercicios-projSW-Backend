package com.app1.lab1.controllers;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app1.lab1.entities.Greeting;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(name, Saudacao());
	}

	private String Saudacao() {
		String saudacao;
		int hora = LocalTime.now().getHour();
		
		if(hora < 12) {
			saudacao = "Bom dia";
		} else if (hora < 18) {
			saudacao = "Boa tarde";
		} else {
			saudacao = "Boa noite";
		}
		return saudacao;
	}
}
