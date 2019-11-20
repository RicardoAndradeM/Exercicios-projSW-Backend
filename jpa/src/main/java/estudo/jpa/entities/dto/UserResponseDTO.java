package estudo.jpa.entities.dto;

import estudo.jpa.entities.User;
import lombok.Data;

@Data
public class UserResponseDTO {

	private String name,email;

	public UserResponseDTO(User user) {
		super();
		this.name = user.getName();
		this.email = user.getEmail();
	}
	
	
}
