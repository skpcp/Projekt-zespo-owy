package pierwszyProjekt;

public class Zg�oszenieWewn�trzne {
	private Long id;
	private Long idZg�oszenia;
	private String opis;
	private enum typ{B��d,Inne} 
	private Long idPriorytetu;
	private Long idProjektu;
	
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public String getOpis(){return opis;}
	public void setOpis(String opis){this.opis = opis;}
	
	public Long getIdPriorytetu(){return idPriorytetu;}
	public void setIdPriorytetu(Long idPriorytetu){this.idPriorytetu = idPriorytetu;}
	
	public Long getIdProjektu(){return idProjektu;}
	public void setIdProjektu(Long idProjektu){this.idProjektu = idProjektu;}
	
	public Long getIdZg�oszenia(){return idZg�oszenia;}
	public void setIdZg�oszenia(Long idZg�oszenia){this.idZg�oszenia = idZg�oszenia;}
}
