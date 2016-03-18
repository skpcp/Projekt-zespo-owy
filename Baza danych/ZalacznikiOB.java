package com.example.ob;

/**
 * Created by bidzis on 2016-03-18.
 */
public class ZalacznikiOB extends BaseOB {
    private Long idZgłoszenia;
    private String nazwaPliku;
    private Long idBinaria;

    //private jakistyp main_type - nie bardzo wiedziałem o co chodzi, czy te pole powinno tutaj być?

    public Long getIdZgłoszenia(){return idZgłoszenia;}
    public void setIdZgłoszenia(Long idZgłoszenia){this.idZgłoszenia = idZgłoszenia;}

    public String getNazwaPliku(){return nazwaPliku;}
    public void setNazwaPliku(String nazwaPliku){this.nazwaPliku = nazwaPliku;}

    public Long getIdBinaria(){return idBinaria;}
    public void setIdBinaria(Long idBinaria){this.idBinaria = idBinaria;}
}

