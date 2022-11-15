/** Ausgabe der Anzahl der 20-Cent Stücke
    nach Abzug der ganzen Euros */
public class Cent {
    /** Ausgabe der 20 Cent Stücke */
    public static void main(String[] args) {
        zaehle20CentStuecke(100);
        zaehle20CentStuecke(0);
        zaehle20CentStuecke(1235);
        zaehle20CentStuecke(64);
    }
    /** berechnung der Stücke nach abzug der ganzen */
    public static int zaehle20CentStuecke(int c) {
        int betrag = (c % 100) / 20;
        System.out.println(betrag);
        return betrag;
    }
}