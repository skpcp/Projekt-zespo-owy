package pierwszyProjekt;

public class Za��cznik {
	private Long id;
	private Long idZg�oszenia;
	private String nazwa;
	private String nazwaPliku;
	private Long idBinaria;
	//private jakistyp main_type - nie bardzo wiedzia�em o co chodzi, czy te pole powinno tutaj by�?
		
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public Long getIdZg�oszenia(){return idZg�oszenia;}
	public void setIdZg�oszenia(Long idZg�oszenia){this.idZg�oszenia = idZg�oszenia;}
	
	public String getNazwa(){return nazwa;}
	public void setNazwa(String nazwa){this.nazwa=nazwa;}	
	
	public String getNazwaPliku(){return nazwaPliku;}
	public void setNazwaPliku(String nazwaPliku){this.nazwaPliku = nazwaPliku;}
	
	public Long getIdBinaria(){return idBinaria;}
	public void setIdBinaria(Long idBinaria){this.idBinaria = idBinaria;}
	
	
}
