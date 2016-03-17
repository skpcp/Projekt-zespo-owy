/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
public class Projekty {
    private Long id;
    private String nazwa;
    private String wersja;
    private String opis;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public String getWersja(){return wersja;}
    public void setWersja(String wersja){this.wersja = wersja;}

    public String getOpis(){return opis;}
    public void setOpis(String opis){this.opis = opis;}
}
