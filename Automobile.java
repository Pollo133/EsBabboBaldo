public class Automobile extends Veicolo{
	private int posti = 0;
	
	
	//costruttore
	
	public Automobile(){}
	
	public Automobile(String targa, int anno, String nome, Owner owner, int posti){
		super(targa, anno, nome, owner);
		this.posti = posti;
	}
	
	//set
	
	public void setPosti(int posti){
		this.posti=posti;
	}
	
	//get
	public int getPosti(){
		return posti;
	}
	
	@Override
	public String toString(){
		return "[VEICOLO]\nTarga: " + targa +
		"\nAnno di produzione: " + anno +
		"\nNome veicolo: " + nome +
		"\nProprietario: " + owner +		
		"\nPosti: " + posti;
	}
}
