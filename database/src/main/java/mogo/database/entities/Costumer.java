package mogo.database.entities;

import org.springframework.data.annotation.Id;

public class Costumer {

	@Id
	public String id;
	public String fistName;
	public String lastName;

	public Costumer() {}
	
	public Costumer(String fistName, String lastName) {
		this.fistName = fistName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id,fistName,lastName);
	}
}
