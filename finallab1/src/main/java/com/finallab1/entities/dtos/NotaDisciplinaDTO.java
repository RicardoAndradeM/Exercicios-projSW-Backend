package com.finallab1.entities.dtos;

import java.util.Objects;

public class NotaDisciplinaDTO {
	private int nota;

	/**
	 * 
	 */
	public NotaDisciplinaDTO() {
		super();
	}

	/**
	 * @param nota
	 */
	public NotaDisciplinaDTO(int nota) {
		super();
		this.nota = nota;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof NotaDisciplinaDTO))
			return false;
		NotaDisciplinaDTO other = (NotaDisciplinaDTO) obj;
		return nota == other.nota;
	}

	public int getNota() {
		return nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nota);
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotaDisciplinaDTO [nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}
}
