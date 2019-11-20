package estudo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudo.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
