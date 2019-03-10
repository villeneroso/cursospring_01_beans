package com.cursospring.beans;

public class SaludoImpl implements Saludo {
	private String valor;
	
	public String saluda() {
		return valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
}
