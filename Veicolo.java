class Veicolo{
	protected String targa = null;
	protected int anno = 0;
	protected String nome = null;
	protected Owner owner = null;
	
	//costruttori
	
	public Veicolo(){}
	
	public Veicolo(String targa, int anno, String nome, Owner owner){
		this.targa = targa;
		this.anno = anno;
		this.nome = nome;
		this.owner = owner;
	}
	
	//set
	
	public void setTarga(String targa){
		this.targa = targa;
	}
	
	public void setAnno(int anno){
		this.anno = anno;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setNome(Owner owner){
		this.owner = owner;
	}
	
	//get
	
	public String getTarga(){
		return targa;
	}
	
	public int getAnno(){
		return anno;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Owner getOwner(){
		return owner;
	}
	
	@Override
	public String toString(){
		return "[VEICOLO]\nTarga: " + targa +
		"\nAnno di produzione: " + anno +
		"\nNome veicolo: " + nome +
		"\nProprietario: " + owner;
	}
	
}
