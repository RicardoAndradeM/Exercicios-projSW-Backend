package com.finallab1.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finallab1.entities.Disciplina;
import com.finallab1.entities.dtos.DisciplinaDTO;
import com.finallab1.entities.dtos.NomeDisiciplinaDTO;
import com.finallab1.entities.dtos.NotaDisciplinaDTO;
import com.finallab1.services.DisciplinaService;

/**
 * @author ricardo
 *
 */
@RestController
public class DisciplinaController {

	
	private final DisciplinaService disciplinaService;
	
	/**
	 * @param disciplinaService
	 */
	public DisciplinaController(DisciplinaService disciplinaService) {
		this.disciplinaService = disciplinaService;
	}

	/**
	 * @param disciplina
	 * @return
	 */
	@PostMapping("/v1/api/disciplinas")
	public ResponseEntity<Disciplina> adicionaDisciplina(@RequestBody DisciplinaDTO disciplina){
		return new ResponseEntity<Disciplina>(disciplinaService.save(disciplina),HttpStatus.CREATED);
	}
	
	@GetMapping("/v1/api/disciplinas/{id}")
	public ResponseEntity<Disciplina> requisitarDisciplina(@PathVariable int id){
		return new ResponseEntity<Disciplina>(disciplinaService.get(id), HttpStatus.OK);
	}
	
	@GetMapping("/v1/api/disciplinas")
	public ResponseEntity<ArrayList<Disciplina>> requisitarDisciplinas(){
		return new ResponseEntity<ArrayList<Disciplina>>(disciplinaService.getAll(), HttpStatus.OK);
	}
	
	@PutMapping("/v1/api/disciplinas/{id}/nome")
	public ResponseEntity<Disciplina> atualizaNome(@PathVariable int id,@RequestBody NomeDisiciplinaDTO nome){
		return new ResponseEntity<Disciplina>(disciplinaService.putName(id,nome),HttpStatus.OK);
	}
	
	@PutMapping("/v1/api/disciplinas/{id}/nota")
	public ResponseEntity<Disciplina> atualizaNota(@PathVariable int id,@RequestBody NotaDisciplinaDTO nota){
		return new ResponseEntity<Disciplina>(disciplinaService.putNota(id,nota),HttpStatus.OK);
	}
	
	@DeleteMapping("/v1/api/disciplinas/{id}")
	public ResponseEntity<Disciplina> removeDisiciplina(@PathVariable int id){
		return new ResponseEntity<Disciplina>(disciplinaService.remove(id),HttpStatus.OK);
	}
	
	@GetMapping("/v1/api/disciplinas/ranking")
	public ResponseEntity<ArrayList<Disciplina>> getRank(){
		return new ResponseEntity<ArrayList<Disciplina>>(disciplinaService.getRank(),HttpStatus.OK);
	}
}