/** Aufruf der Class-Datei */
public class Vertical {
    /** Main Methode wird aufgerufen, welche die
    vertical Methode aufruft*/
    public static void main(String[] args) {
        vertical("Gut Holz!");
    }
    /** Hier werden alle Buchstaben einzelnd pro
    Linie ausgegeben */
    public static void vertical(String s) {
        /** Diese Schleife zählt hoch und gibt immer 
        den buchstaben zur Indexzahl aus */
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}