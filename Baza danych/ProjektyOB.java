package com.example.ob;

import java.util.List;

/**
 * Created by bidzis on 2016-03-18.
 */
public class ProjektyOB extends BaseOB {
    private String nazwa;
    private String wersja;
    private String opis;
    private List<UzytkownikOB> listaUzytkownikow;
    private List<ZgloszeniaOB> listaZgloszen;

    public List<ZgloszeniaOB> getListaZgloszen() {
        return listaZgloszen;
    }

    public void setListaZgloszen(List<ZgloszeniaOB> listaZgloszen) {
        this.listaZgloszen = listaZgloszen;
    }

    public List<UzytkownikOB> getListaUzytkownikow() {
        return listaUzytkownikow;
    }

    public void setListaUzytkownikow(List<UzytkownikOB> listaUzytkownikow) {
        this.listaUzytkownikow = listaUzytkownikow;
    }

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa=nazwa;}

    public String getWersja(){return wersja;}
    public void setWersja(String wersja){this.wersja=wersja;}

    public String getOpis(){return opis;}
    public void setOpis(String opis){this.opis = opis;}
}
