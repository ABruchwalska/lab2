package com.example.servletjspdemo.domain;

public class Ksiazka {
	
	private String autor = "unknown";
	private String tytul = "unknown";
	
	public Ksiazka() {
		super();
	}
	
	public Ksiazka(String Autor, String Tytul) {
		super();
		this.autor = Autor;
		this.tytul = Tytul;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String Autor) {
		this.autor = Autor;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String Tytul) {
		this.tytul = Tytul;
	}
}
