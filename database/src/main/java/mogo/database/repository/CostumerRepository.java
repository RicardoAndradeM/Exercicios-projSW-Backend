package mogo.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mogo.database.entities.Costumer;

public interface CostumerRepository extends MongoRepository<Costumer, String>{

}
