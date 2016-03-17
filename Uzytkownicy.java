

/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
public class Uzytkownicy {
    private Long id;
    private String nazwa;
    private String email;
    private Boolean aktwyny;
    private Long typ;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getNazwa(){return nazwa;}
    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public Boolean getAktwyny(){return aktwyny;}
    public void setAktywny(Boolean aktwyny){this.aktwyny = aktwyny;}

    public Long getTyp(){return typ;}
    public void setTyp(Long typ){this.typ = typ;}

}
