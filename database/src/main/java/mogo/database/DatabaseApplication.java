package mogo.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mogo.database.entities.Costumer;
import mogo.database.repository.CostumerRepository;

@SpringBootApplication
public class DatabaseApplication {

	@Autowired
	private CostumerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner databaserun(CostumerRepository repository) {
		return (args) -> {
			System.out.println("Ola o ebjeto criado ae ->->-> " + repository.save(new Costumer("betinho", "safado")));
			System.out.println("Olha os carar ai:" + repository.findAll());
		};
	}

}
