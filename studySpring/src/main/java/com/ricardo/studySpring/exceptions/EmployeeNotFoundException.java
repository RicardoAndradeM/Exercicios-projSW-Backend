package com.ricardo.studySpring.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(Long id) {
		super("Could not find product " + id);
	}
}
