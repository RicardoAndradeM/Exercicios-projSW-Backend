package com.finallab1.entities;

import java.util.Objects;

import com.finallab1.entities.dtos.DisciplinaDTO;

/**
 * @author ricardo
 *
 */
public class Disciplina {

	private int id;
	private String nome;
	private double nota;

	public Disciplina() {
		super();
	}

	/**
	 * @param id
	 * @param nome
	 * @param nota
	 */
	public Disciplina(int id, String nome, double nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}

	

	/**
	 * @param id
	 * @param disciplina
	 */
	public Disciplina(int id, DisciplinaDTO disciplina) {
		super();
		this.id = id;
		this.nome = disciplina.getNome();
		this.nota = disciplina.getNota();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Disciplina))
			return false;
		Disciplina other = (Disciplina) obj;
		return id == other.id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}

}