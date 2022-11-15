/** import macht Scanner Objekt nutzbar */
import java.util.*;
/** Aufruf der Class-Datei */
public class KumulProd {
    /** Aufruf der main methode */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Wieviele Zahlen? ");
        produkt(console);
    }
    /** Methode liest zahlen ein und verrechnet sie entsprechend */
    public static int produkt(Scanner console) {
        int zahlen = console.nextInt();
        int produkt = 1;
        for (int i = 1; i <= zahlen; i++) {
            System.out.print(i+"-te Zahl: ");
            int nzahl = console.nextInt();
            produkt *= nzahl;
        }
        System.out.println("Das kumulative Produkt ist: "+produkt);
        return produkt;
    }
}
        
        