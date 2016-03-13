package pierwszyProjekt;

public class Zg³oszenia {
	private Long id;
	private String opis;
	private enum typ{B³¹d,Inne} 
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
	
}
