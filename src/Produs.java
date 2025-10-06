public class Produs {

    String nume;
    double pret;
    int cantitate;
    double total;

    Produs(String nume, double pret, int cantitate) {
        this.nume      = nume;
        this.pret      = pret;
        this.cantitate = cantitate;
    }

    public double calculeazaTotalAchitare() {
        Produs  prod1 = new Produs("Lapte",20,1);
        total = cantitate * pret;
       return total;

    }
}
