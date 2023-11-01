import java.util.ArrayList;

public class Owner{
	private String nome = null;
	private String cognome = null;
	private ArrayList<Veicolo> veicoli = null;
	
	// costruttore
	
	public Owner(){}
	
	public Owner(String nome, String cognome, ArrayList<Veicolo> veicoli){
		this.nome = nome;
		this.cognome = cognome;
		this.veicoli = veicoli;
	}
	
	//set
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	
	public void setVeicoli(ArrayList<Veicolo> veicoli){
		this.veicoli = veicoli;
	}
	
	
	//get
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public void scorriVeicoli(){
		for(Veicolo veicolo: veicoli){
			System.out.println(veicolo.toString());
		}
	}
	
	public String toString(){
		return "[OWNER] " +
		"Nome: " + nome +
		"Cognome: " + cognome +
		"Veicoli: " + veicoli;
	}
			
}
	
	
