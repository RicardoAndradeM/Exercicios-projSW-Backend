package com.StudySTasks;

import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TimeTask {
	
	@Scheduled(fixedRate = 5000)
	public void sayTime() {
		log.info("A hora atual é: " + LocalTime.now());
	}
}
