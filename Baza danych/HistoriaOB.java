package com.example.ob; /**
 * Created by bidzis on 2016-03-18.
 */
import com.example.ETyp;
import org.apache.catalina.LifecycleState;


import java.util.List;

public class HistoriaOB extends BaseOB {
    private Long idZgłoszenia;
    private Long idUżytkownika;
    private String opis;
    private ETyp typ;
    private List<ZalacznikiOB> listaZalacznikow;

    public List<ZalacznikiOB> getListaZalacznikow() {
        return listaZalacznikow;
    }

    public void setListaZalacznikow(List<ZalacznikiOB> listaZalacznikow) {
        this.listaZalacznikow = listaZalacznikow;
    }

    public ETyp getTyp() {
        return typ;
    }

    public void setTyp(ETyp typ) {
        this.typ = typ;
    }

    public Long getIdZgłoszenia(){return idZgłoszenia;}
    public void setIdZgłoszenia(Long idZgłoszenia){this.idZgłoszenia = idZgłoszenia;}

    public Long getIdUżytkownika(){return idUżytkownika;}
    public void setIdUżytkownika(Long idUżytkownika){this.idUżytkownika = idUżytkownika;}

    public String getOpis(){return opis;}
    public void setOpis(String opis){this.opis = opis;}

}
