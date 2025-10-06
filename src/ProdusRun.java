import java.util.Scanner;

public class ProdusRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Produs total1 = new Produs("Lapte",20,1 );
        System.out.println("Achitarea totala este de: " + total1.calculeazaTotalAchitare() +" mdl.");


    }
}
