package com.example.ob;

import java.util.List;

/**
 * Created by bidzis on 2016-03-18.
 */
public class RoleOB extends BaseOB {
    private String nazwa;
    private List<UprawnieniaOB> listaUprawnien;

    public List<UprawnieniaOB> getListaUprawnien() {
        return listaUprawnien;
    }

    public void setListaUprawnien(List<UprawnieniaOB> listaUprawnien) {
        this.listaUprawnien = listaUprawnien;
    }

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa=nazwa;}
}
