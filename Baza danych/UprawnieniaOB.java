package com.example.ob;

import java.util.List;

/**
 * Created by bidzis on 2016-03-18.
 */
public class UprawnieniaOB extends BaseOB {
    private String nazwa;
    private List<RoleOB> listaRoli;

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa=nazwa;}

    public List<RoleOB> getListaRoli() {
        return listaRoli;
    }

    public void setListaRoli(List<RoleOB> listaRoli) {
        this.listaRoli = listaRoli;
    }
}
