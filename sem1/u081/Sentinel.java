/** import Scan-, Array-Funktion */
import java.util.*;
/** aufruf der class datei*/
public class Sentinel {
    /** main methode liest eingabe für eingabe  ein
    und legt die Strings in einem Array ab */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int dummy = 1;
        System.out.print("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");
        while (console.hasNext()) {
            names.add(console.nextLine());     
            System.out.print("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");
        }
        if (dummy <= names.size()) {
            printList(names);
        } else {
            System.out.println("Willkommen an alle: ");
        }         
    }
    /** methode regelt ordentliche ausgabe des Array's */
    public static void printList(ArrayList<String> names) {
        System.out.print("Willkommen an alle: ");
        System.out.print(names.get(0));
        for (int i = 1; i < names.size(); i++) {
            System.out.print(", " + names.get(i));
        }
        System.out.println();
    }
}
                
    
        