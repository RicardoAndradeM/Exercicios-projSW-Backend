package com.finallab1.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.finallab1.entities.Disciplina;
import com.finallab1.entities.dtos.DisciplinaDTO;
import com.finallab1.entities.dtos.NomeDisiciplinaDTO;
import com.finallab1.entities.dtos.NotaDisciplinaDTO;

/**
 * @author ricardo
 *
 */
@Service
public class DisciplinaService {

	private final HashMap<Integer, Disciplina> repositorio;

	/**
	 * 
	 */
	public DisciplinaService() {
		this.repositorio = new HashMap<Integer, Disciplina>();
	}

	/**
	 * @param disciplina
	 * @return
	 */
	public Disciplina save(DisciplinaDTO disciplina) {
		int chave = repositorio.size() + 1;
		repositorio.put(chave, new Disciplina(chave,disciplina));
		return repositorio.get(chave);
	}

	/**
	 * @return
	 */
	public ArrayList<Disciplina> getAll() {
		return new ArrayList<Disciplina>(repositorio.values());
	}

	/**
	 * @param id
	 * @return
	 */
	public Disciplina get(int id) {
		return repositorio.get(id);
	}

	public Disciplina putName(int id, NomeDisiciplinaDTO nome) {
		repositorio.get(id).setNome(nome.getNome());
		return repositorio.get(id);
	}

	public Disciplina putNota(int id, NotaDisciplinaDTO nota) {
		repositorio.get(id).setNota(nota.getNota());
		return repositorio.get(id);
	}

	public Disciplina remove(int id) {
		return repositorio.remove(id);
	}

	public ArrayList<Disciplina> getRank() {
		ArrayList<Disciplina> rank = new ArrayList<Disciplina>(repositorio.values());
		Collections.sort(rank, new Comparator<Disciplina>() {
			@Override
			public int compare(Disciplina arg0, Disciplina arg1) {
				if (arg0.getNota() > arg1.getNota()) {
					return 1;
				} else if (arg0.getNota() == arg1.getNota()){
					return 0;
				} else {
					return -1;
				}
			}
			
		});
		return rank;
	}

}
