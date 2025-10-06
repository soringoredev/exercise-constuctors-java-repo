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
        total = cantitate * pret;
       return total;
    }

    public void display() {
        System.out.println("Nume produs: " + nume);
        System.out.println("Pret: " + pret + " lei");
        System.out.println("Cantitate: " + cantitate);
        System.out.println("Total de achitat: " + calculeazaTotalAchitare() + " lei");
    }
}
