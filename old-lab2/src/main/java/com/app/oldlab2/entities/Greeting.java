package com.app.oldlab2.entities;

public class Greeting {

	private String name;
	private String saudacao;

	public Greeting(String nome, String saudacao) {
		this.setName(nome);
		this.setSaudacao(saudacao);
	}

	public String getName() {
		return name;
	}

	public String getSaudacao() {
		return saudacao;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}

}
