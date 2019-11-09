package hello.jpaStudy.repositorys;

import org.springframework.data.repository.CrudRepository;

import hello.jpaStudy.entities.Costumer;

public interface CostumerRepository extends CrudRepository<Costumer, Long>{

}
