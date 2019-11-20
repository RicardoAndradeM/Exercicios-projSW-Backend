package estudo.jpa.services;

import org.springframework.stereotype.Service;

import estudo.jpa.entities.User;
import estudo.jpa.entities.dto.UserResponseDTO;
import estudo.jpa.repository.UserRepository;

@Service
public class ServiceUser {

	private UserRepository repository;
	
	public ServiceUser(UserRepository repository) {
		this.repository = repository;
	}

	public UserResponseDTO save(User user) {
		return new UserResponseDTO(repository.save(user));
	}

	public UserResponseDTO getOne(String id) {
		return new UserResponseDTO(repository.getOne(id));
	}

}
