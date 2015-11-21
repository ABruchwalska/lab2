package com.example.servletjspdemo.domain;

public class Ksiazka {
private String tytul;
private String autor;
private String kategoria;
private int rokWydania;

public Ksiazka(){

}
public Ksiazka(String tytul, String autor){
	this.tytul = tytul;
	this.autor = autor;
}
public Ksiazka(String tytul, String autor, String kategoria, int rokWydania){
this.tytul = tytul;
this.autor = autor;
this.kategoria = kategoria;
this.rokWydania = rokWydania;

}
public String getTytul(){
return tytul;
}
public void setTytul(String tytul){
this.tytul = tytul;
}
public String getAutor(){
return autor;
}
public void setAutor(String autor){
this.autor = autor;
}
public String getKategoria(){
return kategoria;
}
public void setKategoria(String kategoria){
this.kategoria = kategoria;
}
public int getRokWydania(){
return rokWydania;
}
public void setRokWydania(int rokWydania){
this.rokWydania = rokWydania;
}

}
