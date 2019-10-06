package com.app.oldlab2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.oldlab2.entities.AtualTime;

@RestController
public class TimeController {

	@GetMapping("/api/v1/time")
	public ResponseEntity<AtualTime> getTime(){
		return new ResponseEntity<AtualTime>(new AtualTime(), HttpStatus.OK);
	}
}
