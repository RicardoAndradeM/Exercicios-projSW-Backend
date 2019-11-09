package hello.jpaStudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.jpaStudy.entities.Costumer;
import hello.jpaStudy.repositorys.CostumerRepository;

@SpringBootApplication
public class JpaStudyApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaStudyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpaStudyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CostumerRepository repository) {
		return (args) -> {
			log.info("Obijeto salvo ai "+ (repository.save(new Costumer("nome","sobrenome"))));
		};
	}

}
