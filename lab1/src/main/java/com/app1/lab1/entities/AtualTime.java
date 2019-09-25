package com.app1.lab1.entities;

import java.time.LocalDateTime;

public class AtualTime {
	private String time;
	
public AtualTime() {
	this.time = LocalDateTime.now().toLocalTime().toString();
}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
