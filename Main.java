public class Main {
    public static void main(String[] args) {
    	
        Contribuabil c = new Contribuabil("Ion Popescu", "1234");

        Adresa a1 = new Adresa("V. Parvan", 2);
        Proprietate c1 = new Cladire(a1, 20, 10000);

        Adresa a2 = new Adresa("V. Parvan", 2);
        Proprietate t = new Teren(a2, 10, 3500, Rang.I);

        Adresa a3 = new Adresa("Lugoj", 4);
        Proprietate c2 = new Cladire(a3, 25, 12500);

        c.adaugaProprietate(c1);
        c.adaugaProprietate(t);
        c.adaugaProprietate(c2);

        c.addFluturas();
    }
}