package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.servletjspdemo.domain.Autor;

public class AutorStorage {
public ArrayList<Autor> tabAutor = new ArrayList<Autor>();
public void dodajAutora(Autor autor){
tabAutor.add(autor);
}
public void usunPozycje(int indeks){
tabAutor.remove(indeks);
}
public List<Autor> getTabAutor(){
return tabAutor;
}
}