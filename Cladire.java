
public class Cladire extends Proprietate {

	public Cladire(Adresa adresa, int suprafata, int cost) {
		super(adresa, suprafata, cost);
	}

	public int calculeazaCost() {
		return 500 * this.getSuprafata();
	}
	
	
	
	
}
