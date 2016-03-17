/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
public class Zalacznik {
    private Long id;
    private Long idZgloszenia;
    private String nazwa;
    private String nazwaPliku;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Long getIdZgloszenia(){return idZgloszenia;}
    public void setIdZgloszenia(Long idZgloszenia){this.idZgloszenia = idZgloszenia;}

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public String getNazwaPliku(){return nazwaPliku;}
    public void setNazwaPliku(String nazwaPliku){this.nazwaPliku = nazwaPliku;}
}
