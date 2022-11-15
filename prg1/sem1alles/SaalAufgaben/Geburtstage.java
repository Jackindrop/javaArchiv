import java.util.*;
/**
 * Simuliert das Geburtstagsparadoxon.
 * Gibt die simulierten Wahrscheinlichkeiten von Geburtstagskollisionen
 * für Gruppengrößen von n=1 bis n=366 aus.
 */
public class Geburtstage {
    public static void main(String[] args) {
        double[] wk = new double[367];
        for (int n=1; n<=366; n++) {
            wk[n] = simuliere(n);
        }
        for (int n=1; n<wk.length; n++) {
            System.out.println(n + ": " + wk[n]);
        }
    }
    /**
     * Führt "experiment(n)" insg. 10000 mal aus und zählt,
     * wie oft eine Geburtstagskollision gefunden wird.
     * Rückgabewert ist die simulierte Wahrscheinlichkeit 
     * aus [0,1] mit der eine Kollision für ein gegebenes n vorliegt.
     */
    public static double simuliere(int n) {
        int anzahl = 0;
        int N = 10000;
        for (int k=0; k<N; k++) {
            if (experiment(n)) {
                anzahl++;
            }
        }
        return (double)anzahl / N;
    }
    /**
     * Erzeuge zufällig n Geburtstage.
     * Liefere true, wenn mindestens zwei Geburtstage gleich sind.
     */
    public static boolean experiment(int n) {
        Random rand = new Random();
        HashSet<Integer> geburtstage = new HashSet<>();
        for (int i=0; i<n; i++) {
            int geburtstag = rand.nextInt(365);
            if (geburtstage.contains(geburtstag)) {
                return true;
            }
            geburtstage.add(geburtstag);
        }
        return false;
    }
}