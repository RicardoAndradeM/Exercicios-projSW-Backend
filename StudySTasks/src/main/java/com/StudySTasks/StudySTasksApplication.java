package com.StudySTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StudySTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySTasksApplication.class, args);
	}

}
