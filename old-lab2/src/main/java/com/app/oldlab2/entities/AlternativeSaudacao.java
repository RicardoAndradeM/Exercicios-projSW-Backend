package com.app.oldlab2.entities;

public class AlternativeSaudacao {
	
	private String saudacao;
	
	public AlternativeSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}
	
	public AlternativeSaudacao() {
		this.saudacao = "Olá";
	}

	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}
}
