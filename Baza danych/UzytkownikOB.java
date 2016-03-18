package com.example.ob;

import java.util.List;

/**
 * Created by bidzis on 2016-03-18.
 */


public class UzytkownikOB extends BaseOB {

    private String nazwa;
    private String email;
    private Boolean stan;
    private List<RoleOB> listaRol;
    private List<ProjektyOB> listaProjektow;
    private Long idBinaria;

    public List<ProjektyOB> getListaProjektow() {
        return listaProjektow;
    }

    public void setListaProjektow(List<ProjektyOB> listaProjektow) {
        this.listaProjektow = listaProjektow;
    }

    public List<RoleOB> getListaRol() {
        return listaRol;
    }

    public void setListaRol(List<RoleOB> listaRol) {
        this.listaRol = listaRol;
    }

    public UzytkownikOB(){

    }

    //nazwa
    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }

    //email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //stan
    public Boolean getStan(){
        return stan;
    }
    public void setStan(Boolean stan){
        this.stan = stan;
    }

}
