package com.app.oldlab2.controllers;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.oldlab2.entities.AlternativeSaudacao;
import com.app.oldlab2.entities.Greeting;

@RestController
public class GreetingsCotroller {
	
	private AlternativeSaudacao saudacao;
	
	public GreetingsCotroller() {
		this.saudacao = null;
	}
	
	@GetMapping("/api/v1/greetings")
	public ResponseEntity<Greeting> getGreeting(@RequestParam(value="nome", defaultValue="Pessoa") String nome) {
		return new ResponseEntity<Greeting>(new Greeting(nome,saudacao()), HttpStatus.OK);
	}
	
	@PostMapping("/api/v1/greetings/alternative")
	public ResponseEntity<String> setCustonSaudacao(@RequestBody AlternativeSaudacao saudacao){
		this.saudacao = saudacao;
		return new ResponseEntity<String>(this.saudacao.getSaudacao(), HttpStatus.OK);
	}
	
	@GetMapping("/api/v1/greetings/alternative")
	public ResponseEntity<Greeting> getCustonSaudacao(@RequestParam(value="nome", defaultValue ="Pessoa") String nome){
		return new ResponseEntity<Greeting>(new Greeting(nome, saudacao.getSaudacao()), HttpStatus.OK);
	}

	private String saudacao() {
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
