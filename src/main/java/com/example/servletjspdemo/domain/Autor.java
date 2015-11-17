package com.example.servletjspdemo.domain;

public class Autor {
private String imie;
private String nazwisko;
private String miasto;

public Autor(){
super();
}
public Autor(String imie, String nazwisko, String miasto){
this.imie = imie;
this.nazwisko = nazwisko;
this.miasto = miasto;

}
public String getImie() {
return imie;
}
public void setImie(String imie) {
this.imie = imie;
}
public String getNazwisko() {
return nazwisko;
}
public void setNazwisko(String nazwisko) {
this.nazwisko = nazwisko;
}
public String getMiasto() {
return miasto;
}
public void setMiasto(String miasto) {
this.miasto = miasto;
}

}