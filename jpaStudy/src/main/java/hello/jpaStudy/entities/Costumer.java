package hello.jpaStudy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Costumer {

	@Id
	@GeneratedValue
	private long id;
	private String fistName, lastName;
	
	protected Costumer() {}
	
	public Costumer(String fistName, String lastName) {
		this.fistName = fistName;
		this.lastName = lastName;
	}
}
