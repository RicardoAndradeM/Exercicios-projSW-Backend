package com.app1.lab1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app1.lab1.entities.AtualTime;

@RestController
public class TimeController {
	
	@RequestMapping("/time")
	public AtualTime time() {
		return new AtualTime();
	}
}
