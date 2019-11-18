package mogo.database;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mogo.database.entities.Costumer;
import mogo.database.repository.CostumerRepository;

@RestController
public class ControlerDB {

	@Autowired
	private CostumerRepository repository;
	
	@GetMapping("/db")
	public String getdbstatus() {
		return "bom dia";
	}
}
