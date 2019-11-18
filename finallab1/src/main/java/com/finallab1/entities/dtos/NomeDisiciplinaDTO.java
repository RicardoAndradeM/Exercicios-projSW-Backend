package com.finallab1.entities.dtos;

import java.util.Objects;

public class NomeDisiciplinaDTO {
	private String nome;

	/**
	 * 
	 */
	public NomeDisiciplinaDTO() {
		super();
	}

	/**
	 * @param nome
	 */
	public NomeDisiciplinaDTO(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof NomeDisiciplinaDTO))
			return false;
		NomeDisiciplinaDTO other = (NomeDisiciplinaDTO) obj;
		return Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NomeDisiciplinaDTO [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}
