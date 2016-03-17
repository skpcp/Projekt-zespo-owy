/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
public class Priorytet {
    private Long id;
    private String nazwa;
    private Long czasreakcji;
    enum Etyp{
        Wewnetrzny,
        Zewnetrzny,}
    private Etyp typ = Etyp.Zewnetrzny;
    private List lista = (List) new ArrayList();
    public Priorytet(){}

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public Long getCzasreakcji(){return czasreakcji;}
    public void setCzasreakcji(Long czasreakcji){this.czasreakcji = czasreakcji;}



}
