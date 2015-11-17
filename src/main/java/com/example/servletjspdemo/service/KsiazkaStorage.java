package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.servletjspdemo.domain.Ksiazka;

public class KsiazkaStorage {
public ArrayList<Ksiazka> tabOb = new ArrayList<Ksiazka>();
public KsiazkaStorage(){
}
public void dodajKsiazka(Ksiazka ksiazka){
tabOb.add(ksiazka);
}
public void usunPozycje(int pozycja){
tabOb.remove(pozycja);
}
public List<Ksiazka> getTabOb(){
return tabOb;
}
}