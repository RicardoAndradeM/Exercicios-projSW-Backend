package estudo.jpa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import estudo.jpa.entities.User;
import estudo.jpa.entities.dto.UserResponseDTO;
import estudo.jpa.services.ServiceUser;

@RestController
@RequestMapping("/user")
public class UserControler {
	
	private ServiceUser serviceUser;
	
	public UserControler(ServiceUser serviceUser) {
		this.serviceUser = serviceUser;
	}

	@PostMapping
	public ResponseEntity<UserResponseDTO> singUpUser(@RequestBody User user) {
		return new ResponseEntity<UserResponseDTO>(serviceUser.save(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserResponseDTO> getUser(@RequestParam String id){
		return new ResponseEntity<UserResponseDTO>(serviceUser.getOne(id),HttpStatus.OK);
	}
}
