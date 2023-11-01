import java.util.ArrayList;

public class GestoreVeicolo{
	public static void main(String [] args){
	
		
		ArrayList<Veicolo> veicoliP1 = new ArrayList<Veicolo>();
		Owner p1 = new Owner("Giovanni", "Tosello", veicoliP1);
		veicoliP1.add(new Moto("XX200YY", 2023, "KTM sx", p1, 125));
		veicoliP1.add(new Automobile("YY000CC", 1969, "Fiat panda", p1, 4));
		
		ArrayList<Veicolo> veicoliP2 = new ArrayList<Veicolo>();
		Owner p2 = new Owner("Mamma", "Maria", veicoliP2);
		veicoliP2.add(new Automobile("YY123RR", 1979, "Fiat punto", p2, 4));
		veicoliP2.add(new Moto("ZX330MY", 2023, "Onda", p2, 50));
		veicoliP2.add(new Moto("ZX330MY", 2013, "Kawasaki", p2, 125));
		
		
		System.out.println("Informazioni sul primo proprietario: \n");
		p1.toString();
		System.out.println("Veicoli del primo proprietario: \n");
		p1.scorriVeicoli();
		
		System.out.println("Informazioni sul secondo proprietario: \n");
		p2.toString();
		System.out.println("Veicoli del secondo proprietario: \n");
		p2.scorriVeicoli();
		
		
	
	}
}
