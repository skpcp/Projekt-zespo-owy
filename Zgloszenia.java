/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
public class Zgloszenia {
    private Long id;
    private String opis;
    private String typzgloszenia;
    private Long priorytet;
    private Long projekt;
    enum Etyp{
        Wewnetrzny,
        Zewnetrzny,}
    private Etyp typ = Etyp.Zewnetrzny;
    private List lista = (List) new ArrayList();
    public Zgloszenia(){}

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getOpis(){return opis;}
    public void setOpis(String opis){this.opis = opis;}

    public String getTyp(){return typzgloszenia;}
    public void setTyp(String typzgloszenia){this.typzgloszenia = typzgloszenia;}

    public Long getPriorytet(){return priorytet;}
    public void setPriorytet(Long priorytet){this.priorytet = priorytet;}

    public Long getProjekt(){return projekt;}
    public void setProjekt(Long projekt){this.projekt = projekt;}
}
