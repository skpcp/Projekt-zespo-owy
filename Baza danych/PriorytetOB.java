package com.example.ob;

import com.example.EJednostka;

/**
 * Created by bidzis on 2016-03-18.
 */
public class PriorytetOB extends BaseOB {
    private String nazwa;
    private EJednostka czasReakcji;
    private long ilosc;

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa=nazwa;}

    public EJednostka getCzasReakcji() {
        return czasReakcji;
    }

    public void setCzasReakcji(EJednostka czasReakcji) {
        this.czasReakcji = czasReakcji;
    }

    public long getIlosc() {
        return ilosc;
    }

    public void setIlosc(long ilosc) {
        this.ilosc = ilosc;
    }
}
