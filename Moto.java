public class Moto extends Veicolo{
	private int cilindrata = 0;
	
	
	//costruttore
	
	public Moto(){}
	
	public Moto(String targa, int anno, String nome, Owner owner, int cilindrata){
		super(targa, anno, nome, owner);
		this.cilindrata = cilindrata;
	}
	
	//set
	
	public void setCilindrata(int cilindrata){
		this.cilindrata=cilindrata;
	}
	
	//get
	public int getCilindrata(){
		return cilindrata;
	}
	
	@Override
	public String toString(){
		return "[VEICOLO]\nTarga: " + targa +
		"\nAnno di produzione: " + anno +
		"\nNome veicolo: " + nome +
		"\nProprietario: " + owner +
		"\nCilindrata: " + cilindrata;
	}
}
