import java.util.ArrayList;

public class Contribuabil {
    private String nume;
    private String cnp;
    private ArrayList<Proprietate> proprietati;

    public Contribuabil(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
        this.proprietati = new ArrayList<Proprietate>();
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void adaugaProprietate(Proprietate proprietate) {
        proprietati.add(proprietate);
    }

    public int calculeazaSumaTotala() {
        int suma = 0;
        for (Proprietate proprietate : proprietati) {
            suma += proprietate.calculeazaCost();
        }
        return suma;
    }

    public void addFluturas() {
        System.out.println("Contribuabil: " + nume);
        System.out.println("CNP: " + cnp);
        System.out.println("Proprietati");
        for (Proprietate proprietate : proprietati) {
            System.out.println(proprietate.getClass().getName() + ": " + "Strada " +proprietate.getAdresa().getStrada() + " " + "Nr. "+ proprietate.getAdresa().getNumar());
            System.out.println("Suprafata: " + proprietate.getSuprafata());
            System.out.println("Cost: " + proprietate.calculeazaCost());
        }
        System.out.println("Suma totala: " + calculeazaSumaTotala());
    }
}