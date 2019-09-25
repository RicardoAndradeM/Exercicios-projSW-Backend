package com.app1.lab1.entities;

public class Greeting {
	
	private String greeting, name;
	
	public Greeting(String name, String greeting) {
		this.name = name;
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
