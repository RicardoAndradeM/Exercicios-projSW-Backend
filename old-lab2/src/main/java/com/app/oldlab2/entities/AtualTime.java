package com.app.oldlab2.entities;

import java.time.LocalDateTime;

public class AtualTime {
	private String hora;
	private String minuto;
	private String segundo;
	
	public AtualTime() {
		super();
		LocalDateTime horaAtual = LocalDateTime.now();
		this.setHora(String.valueOf(horaAtual.getHour()));
		this.setMinuto(String.valueOf(horaAtual.getMinute()));
		this.setSegundo(String.valueOf(horaAtual.getSecond()));
	}

	public String getHora() {
		return hora;
	}

	public String getMinuto() {
		return minuto;
	}

	public String getSegundo() {
		return segundo;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}
}
