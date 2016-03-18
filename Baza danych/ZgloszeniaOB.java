package com.example.ob;

import com.example.ETypZgloszenia;

import java.util.List;

/**
 * Created by bidzis on 2016-03-18.
 */
public class ZgloszeniaOB extends BaseOB {
    private String opis;
    private Long idPriorytetu;
    private Long idProjektu;
    private ETypZgloszenia typ;
    private List<ZalacznikiOB> listaZalacznikow;
    private Long idUzytkownika;

    public Long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(Long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public List<ZalacznikiOB> getListaZalacznikow() {
        return listaZalacznikow;
    }

    public void setListaZalacznikow(List<ZalacznikiOB> listaZalacznikow) {
        this.listaZalacznikow = listaZalacznikow;
    }

    public ETypZgloszenia getTyp() {
        return typ;
    }

    public void setTyp(ETypZgloszenia typ) {
        this.typ = typ;
    }

    public String getOpis(){return opis;}
    public void setOpis(String opis){this.opis = opis;}

    public Long getIdPriorytetu(){return idPriorytetu;}
    public void setIdPriorytetu(Long idPriorytetu){this.idPriorytetu = idPriorytetu;}

    public Long getIdProjektu(){return idProjektu;}
    public void setIdProjektu(Long idProjektu){this.idProjektu = idProjektu;}
}
