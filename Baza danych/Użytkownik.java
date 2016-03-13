package pierwszyProjekt;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Użytkownik {
	private Long id;
	private String nazwa;
	private String email;
	private Boolean stan;
	enum Etyp { 
		Wewnętrzny, 
		Zewnętrzny,
		}//
	private Etyp typ = Etyp.Zewnętrzny;
	private List lista = (List) new ArrayList();
	public Użytkownik(){
		
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
