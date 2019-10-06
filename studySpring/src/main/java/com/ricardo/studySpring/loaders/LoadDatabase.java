package com.ricardo.studySpring.loaders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ricardo.studySpring.entities.Product;
import com.ricardo.studySpring.repotories.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LoadDatabase {

	@Bean
	 public CommandLineRunner initDatabase(ProductRepository repository) {
		return args -> {
			//verificar problema do log.info()
			System.out.println("Preloading " + repository.save(new Product("Banan", 2.25)));
			System.out.println("Preloading " + repository.save(new Product("carne", 20.0)));
		};
	}
}
