
public class Teren extends Proprietate {
	
	private Rang rang;

	public Teren(Adresa adresa, int suprafata, int cost, Rang rang) {
		super(adresa, suprafata, cost);
		this.rang = rang;
	}

	public int calculeazaCost() {
		return 350 * this.getSuprafata() / rang.getRang();
	}
	
	
	
	

}
