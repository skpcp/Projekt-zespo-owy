package pierwszyProjekt;

import java.util.Date;

public class Historia {
	private Long id;
	private enum typ{Wewn�trzna,Zewn�trzna}
	private Long idZg�oszenia;
	private Long idU�ytkownika;
	private String opis;
	private Date data;
	
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	 
	public Long getIdZg�oszenia(){return idZg�oszenia;}
	public void setIdZg�oszenia(Long idZg�oszenia){this.idZg�oszenia = idZg�oszenia;}
	
	public Long getIdU�ytkownika(){return idU�ytkownika;}
	public void setIdU�ytkownika(Long idU�ytkownika){this.idU�ytkownika = idU�ytkownika;}
	
	public String getOpis(){return opis;}
	public void setOpis(String opis){this.opis = opis;}
	
	public Date getData(){return data;}
	public void setData(Date data){this.data = data;}
}
