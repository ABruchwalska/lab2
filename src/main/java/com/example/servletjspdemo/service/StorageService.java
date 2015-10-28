package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Ksiazka;

public class StorageService {
	
	private List<Ksiazka> db = new ArrayList<Ksiazka>();
	
	public void add(Ksiazka Ksiazka){
		Ksiazka newKsiazka = new Ksiazka(Ksiazka.getAutor(), Ksiazka.getTytul());
		db.add(newKsiazka);
	}
	
	public List<Ksiazka> getAllKsiazkas(){
		return db;
	}

}
