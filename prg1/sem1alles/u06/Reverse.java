/** Bibliothek macht Consolen eingabe möglich */
import java.util.Scanner;
/** Aufruf der classe */
public class Reverse {
/** Main Methode soll eingelesenen vor und zunamen umgekehrt ausgeben */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren vollen Namen ein: ");
        String name = scanner.nextLine();
        /** name1 isoliert den vornamen aus dem string */
        String name1 = name.substring(0, name.indexOf(" "));
        /** name2 & name21 isolieren den zunamen + vorangehende
        Leerzeichen aus dem String */
        String name2 = name.replace(name1, "");
        String name21 = name2.replace(" ", "");
        System.out.print("Ihr Name in umgekehrter Schreibweise ist: ");
        System.out.print(name21+", ");
        System.out.println(name1);
    }
}
