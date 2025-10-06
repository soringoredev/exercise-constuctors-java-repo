import java.util.Scanner;

public class ProdusRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti numele produsului: ");
        String nume = scan.nextLine();

        System.out.print("Introduceti pretul produsului: ");
        double pret = scan.nextDouble();

        System.out.print("Introduceti cantitatea: ");
        int cantitate = scan.nextInt();

        Produs produs1 = new Produs(nume , pret , cantitate);

        System.out.println("Detalii produs:");
        produs1.display();

    }
}
