package com.cursospring.beans;

public class Alumno {
	private Saludo saludo;
	
	public Alumno() {
		System.out.println("-- Contruyendo un nuevo alumno --");
	}
	
	public Saludo getSaludo() {
		return saludo;
	}
	
	public void setSaludo(Saludo saludo) {
		this.saludo = saludo;
	}
}
