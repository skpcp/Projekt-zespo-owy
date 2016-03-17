/**
 * Created by Radosław Cybulski on 2016-03-13.
 */
package pierwszyProjekt;

import java.util.Date;

public class Historia {
    private Long id;
    private Long idZgłoszenia;
    private Long idUżytkownika;
    private String opis;
    private Date data;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Long getIdZgłoszenia() {return idZgłoszenia;}
    public void setIdZgłoszenia(Long idZgłoszenia){this.idZgłoszenia = idZgłoszenia;}

    public Long getIdUżytkownika() {return idUżytkownika;}
    public void setIdUżytkownika(Long idUżytkownika){this.idUżytkownika = idUżytkownika;}

    public String getOpis() {return opis;}
    public void setOpis(String opis) {this.opis = opis;}

    public Date getData() {return data;}
    public void setData(Date data) {this.data = data;}
}