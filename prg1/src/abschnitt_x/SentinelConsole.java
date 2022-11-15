package abschnitt_x;

/** Scanner importieren */
import java.util.*;
/** aufruf der class datei */
public class SentinelConsole {
    /** Globaler abbruchparameter deffiniert */
    public static final String SENTINEL = " ";
    /** aufruf der main methode, einlesen/drucken der namen */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int dummy = 1;
        while (true) {
            System.out.print("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");
            String temp = console.nextLine();
            if (breaktest(temp, SENTINEL)) {
                names.add(temp);
            } else {
                break;
            }
        }
        if (dummy <= names.size()) {
            printList(names);
        }
    }
    /** methode gibt nach vorgabe array list aus */
    public static void printList(ArrayList<String> names) {
        System.out.print("Willkommen an alle: ");
        System.out.print(names.get(0));
        for (int i = 1; i < names.size(); i++) {
            System.out.print(", " + names.get(i));
        }
        System.out.println();
    }
    /** methode prüft eingabe auf abbruchparameter */
    public static boolean breaktest(String temp, String SENTINEL) {
        if (temp.equals(SENTINEL)) {
            return false;
        } else {
            return true;
        }
    }
}



