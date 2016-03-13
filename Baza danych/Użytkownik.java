package pierwszyProjekt;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class U¿ytkownik {
	private Long id;
	private String nazwa;
	private String email;
	private Boolean stan;
	enum Etyp { 
		Wewnêtrzny, 
		Zewnêtrzny,
		}//
	private Etyp typ = Etyp.Zewnêtrzny;
	private List lista = (List) new ArrayList();
	public U¿ytkownik(){
		
	}
	
	//id
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	
	//nazwa
	public String getNazwa(){
		return nazwa;
	}
	public void setNazwa(String nazwa){
		this.nazwa = nazwa;
	}
	
	//email
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	//stan
	public Boolean getStan(){
		return stan;
	}
	public void setStan(Boolean stan){
		this.stan = stan;
	}
	
}
