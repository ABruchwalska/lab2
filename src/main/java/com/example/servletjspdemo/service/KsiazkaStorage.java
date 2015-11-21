package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.servletjspdemo.domain.Ksiazka;

public class KsiazkaStorage {
public ArrayList<Ksiazka> tabOb = new ArrayList<Ksiazka>();
public KsiazkaStorage(){
}
public void dodajKsiazka(Ksiazka ksiazka){
	System.out.println(ksiazka);
	tabOb.add(new Ksiazka(tabOb.size(), ksiazka.getTytul(),ksiazka.getAutor()));
}
public void usunPozycje(int pozycja){
tabOb.remove(pozycja);
	reorganizeId();
}
private void reorganizeId() {
	for(int i = 0; i < tabOb.size() ; i++){
		tabOb.get(i).setId(i);
	}
	
}
public List<Ksiazka> getTabOb(){
	for(int i = 0; i < tabOb.size(); i++)
	{
	    System.out.println(tabOb.get(i));
	}
return tabOb;
}
}