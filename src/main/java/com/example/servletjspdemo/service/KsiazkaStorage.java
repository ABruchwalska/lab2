package com.example.servletjspdemo.service;
import java.util.*;
import com.example.servletjspdemo.domain.Ksiazka;
public class KsiazkaStorage {
public List<Ksiazka> tabOb = new ArrayList<Ksiazka>();
public KsiazkaStorage(){
}
public void dodajKsiazka(Ksiazka ksiazka){
System.out.println(ksiazka);

tabOb.add(new Ksiazka(ksiazka.getId(),ksiazka.getAutor(),ksiazka.getTytul()));
}
public void usunPozycje(int pozycja){
tabOb.remove(pozycja);
reorganizeId();
}
private void reorganizeId() {
for(int i = 0; i < tabOb.size() ; i++){
tabOb.get(i).setId(i); //setId(i);
}
}
public List<Ksiazka> getTabOb(){
for(int i = 0; i < tabOb.size(); i++)
{
System.out.println(tabOb.get(i));
}
return tabOb;
}
	public ArrayList<HashMap<String, String>> getKsiazkiMap (){
		ArrayList <HashMap<String, String>> hm = new ArrayList<HashMap<String, String>>();
		for (int i=0; i<tabOb.size(); i++){
			HashMap<String, String> km = new HashMap<String, String>();
			km.put("id", tabOb.get(i).getId() + "");// konkatenuje go z pustym stringiem w celu rzutowania (int -> string)
			km.put("tytul", tabOb.get(i).getTytul());
			km.put("autor", tabOb.get(i).getAutor());
		
			hm.add(km);
		
		}
		
		
		return hm;
		
		
	}




}