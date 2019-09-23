package com.hello.helloWord.controlles;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHello {
	
	@GetMapping("/")
	public String sayHello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		
		String saudacao;
		int hora = LocalTime.now().getHour();
		
		if(hora < 12) {
			saudacao = "Bom dia";
		} else if (hora < 18) {
			saudacao = "Boa tarde";
		} else {
			saudacao = "Boa noite";
		}
		model.addAttribute("saudacao", saudacao);
		
		return "hello";
	}
	
	@GetMapping("/time")
	public String horaAtual(Model model) {
		String hora = LocalTime.now().toString();
		model.addAttribute("hora", hora );
		return "hora";
	}
	
}
