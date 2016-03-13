package pierwszyProjekt;

public class Za³¹cznik {
	private Long id;
	private Long idZg³oszenia;
	private String nazwa;
	private String nazwaPliku;
	private Long idBinaria;
	//private jakistyp main_type - nie bardzo wiedzia³em o co chodzi, czy te pole powinno tutaj byæ?
		
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public Long getIdZg³oszenia(){return idZg³oszenia;}
	public void setIdZg³oszenia(Long idZg³oszenia){this.idZg³oszenia = idZg³oszenia;}
	
	public String getNazwa(){return nazwa;}
	public void setNazwa(String nazwa){this.nazwa=nazwa;}	
	
	public String getNazwaPliku(){return nazwaPliku;}
	public void setNazwaPliku(String nazwaPliku){this.nazwaPliku = nazwaPliku;}
	
	public Long getIdBinaria(){return idBinaria;}
	public void setIdBinaria(Long idBinaria){this.idBinaria = idBinaria;}
	
	
}
