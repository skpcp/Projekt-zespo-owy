package pierwszyProjekt;

import java.util.Date;

public class Historia {
	private Long id;
	private enum typ{Wewn皻rzna,Zewn皻rzna}
	private Long idZg這szenia;
	private Long idU篡tkownika;
	private String opis;
	private Date data;
	
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	 
	public Long getIdZg這szenia(){return idZg這szenia;}
	public void setIdZg這szenia(Long idZg這szenia){this.idZg這szenia = idZg這szenia;}
	
	public Long getIdU篡tkownika(){return idU篡tkownika;}
	public void setIdU篡tkownika(Long idU篡tkownika){this.idU篡tkownika = idU篡tkownika;}
	
	public String getOpis(){return opis;}
	public void setOpis(String opis){this.opis = opis;}
	
	public Date getData(){return data;}
	public void setData(Date data){this.data = data;}
}
