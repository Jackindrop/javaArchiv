package abschnitt_x;

/** import des Scanners zur Eingabe */
import java.util.*;

/**
 * Fordert zur Eingabe vonb Benutzerdaten auf,
 * prüft diese auf Korrektheit.
 */
public class Geheim {
    /** Eingabeaufforderung an Benutzer */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Benutzername bitte: ");
        String user = console.next();
        System.out.print("Geheimwort bitte: ");
        String pwd = console.next();
        database(user, pwd);
    }
    /** Eingaben werden mit bestehenden Nutzerdaten verglichen
     und entsprechend der Vorgabe ausgewertet */
    public static String database(String user, String pwd) {
        String pwd1 = "lightmyfire";
        String pwd2 = "dos";
        String pwd3 = "42";
        switch (user) {
            case "doors":
                if (pwd.equals(pwd1)) {
                    richtig();
                } else {
                    fastrichtig();
                }
                break;
            case "gates":
                if (pwd.equals(pwd2)) {
                    richtig();
                } else {
                    fastrichtig();
                }
                break;
            case "dent":
                if (pwd.equals(pwd3)) {
                    richtig();
                } else {
                    fastrichtig();
                }
                break;
            default:
                System.out.println("falsch");
        }
        return user;
    }
    /** Ausgabe aufruf zwecks renundanz minimierung */
    public static void richtig() {
        System.out.println("richtig");
    }
    /** Zwecks renundanzoptimierung Methode zur Ausgabe */
    public static void fastrichtig() {
        System.out.println("Benutzername richtig, Geheimwort falsch");
    }
}


