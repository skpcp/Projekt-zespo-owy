package pierwszyProjekt;

public class Załącznik {
	private Long id;
	private Long idZgłoszenia;
	private String nazwa;
	private String nazwaPliku;
	private Long idBinaria;
	//private jakistyp main_type - nie bardzo wiedziałem o co chodzi, czy te pole powinno tutaj być?
		
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public Long getIdZgłoszenia(){return idZgłoszenia;}
	public void setIdZgłoszenia(Long idZgłoszenia){this.idZgłoszenia = idZgłoszenia;}
	
	public String getNazwa(){return nazwa;}
	public void setNazwa(String nazwa){this.nazwa=nazwa;}	
	
	public String getNazwaPliku(){return nazwaPliku;}
	public void setNazwaPliku(String nazwaPliku){this.nazwaPliku = nazwaPliku;}
	
	public Long getIdBinaria(){return idBinaria;}
	public void setIdBinaria(Long idBinaria){this.idBinaria = idBinaria;}
	
	
}
