import java.util.*;
public class Passwort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Erstelle Passwort: ");
        int passw = console.next();
        if (passw <= 8) {
            System.out.println("Bitte ein längeres Passwort eingeben (mind. 8 Zeichen)");
            System.out.print("Erstelle Passwort: ");
            String passw = console.next();
            return passw;
        } while (passw <= 8) {
            System.out.println("Bitte ein längeres Passwort eingeben (mind. 8 Zeichen)");
            System.out.print("Erstelle Passwort: ");
            String passw = console.next();
            return passw;
        }
        System.out.print(passw);
    }
}