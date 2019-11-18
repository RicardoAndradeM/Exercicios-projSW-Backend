package com.finallab1.entities.dtos;

import java.util.Objects;

/**
 * @author ricardo
 *
 */
public class DisciplinaDTO {
	
	private String nome;
	private double nota;

	/**
	 * 
	 */
	public DisciplinaDTO() {
		super();
	}

	/**
	 * @param nome
	 * @param nota
	 */
	public DisciplinaDTO(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof DisciplinaDTO))
			return false;
		DisciplinaDTO other = (DisciplinaDTO) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
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
		return Objects.hash(nome, nota);
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
		builder.append("DisciplinaDTO [nome=");
		builder.append(nome);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}
}
