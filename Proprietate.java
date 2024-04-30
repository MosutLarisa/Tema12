
public abstract class Proprietate {
		
	private Adresa adresa;
	private int suprafata, cost;
	
	public Proprietate(Adresa adresa, int suprafata, int cost) {
		this.adresa = adresa;
		this.suprafata = suprafata;
		this.cost = cost;
		}
	
	public Adresa getAdresa() {
		return adresa;
	}

	public int getSuprafata() {
		return suprafata;
	}

	public int getCost() {
		return cost;
	}
	
    public abstract int calculeazaCost();
}
