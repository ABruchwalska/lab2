package com.example.servletjspdemo.domain;

public class Ksiazka {
private String tytul;
private String autor;
private String kategoria;
private int rokWydania;

public Ksiazka(){
super();
}
public Ksiazka(String tytul, String autor, String kategoria, int rokWydania){
this.tytul = tytul;
this.autor = autor;
this.kategoria = kategoria;
this.rokWydania = rokWydania;

}
public String gettytul(){
return tytul;
}
public void settytul(String tytul){
this.tytul = tytul;
}
public String getautor(){
return autor;
}
public void setautor(String autor){
this.autor = autor;
}
public String getkategoria(){
return kategoria;
}
public void setkategoria(String kategoria){
this.kategoria = kategoria;
}
public int getrokWydania(){
return rokWydania;
}
public void setrokWydania(int rokWydania){
this.rokWydania = rokWydania;
}

}
