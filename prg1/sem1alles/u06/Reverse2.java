/** Bibliothek macht Consolen eingabe möglich */
import java.util.Scanner;
/** Aufruf der classe */
public class Reverse2 {
/** Main Methode soll eingelesenen vor und zunamen umgekehrt ausgeben */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren vollen Namen ein: ");
        String name = scanner.next();
        String name2 = scanner.next();
        System.out.println("Ihr Name in umgekehrter Schreibweise ist: "+name2+" + "+name2);
    }
}
