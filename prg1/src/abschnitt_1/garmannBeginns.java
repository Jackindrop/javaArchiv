package abschnitt_1;

// u01/02/u03/u04/u05(erstenzwei)
/** Der Graphic code nummer 1 */
public class garmannBeginns {

    public static final double FACTOR= 2.0; // called by powers
    public static final int EXPONENT= 4; // called by powers
    /** Statische Methode zum skalieren der Grafik */
    public static final int SIZE = 8;   // called by fourSquares

    public static void main(String[] args) {
        grafik();
        powers();
        fourSquares();
        cent();
        drawBox(4, 1);

    }

//------------------------------------------------------------------------------

    public static void drawBox (int breite, int höhe) {
        for (int i = 1; i <= breite; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int d = 1; d <= höhe; d++) {
            spaces(breite);
        }
        for (int i = 1; i <= breite; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void spaces(int breite) {
        System.out.print("*");
        for (int y = 1; y <= breite -2; y++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

//------------------------------------------------------------------------------

    /** Ausgabe der Anzahl der 20-Cent Stücke
     nach Abzug der ganzen Euros */
    /** Ausgabe der 20 Cent Stücke */
    public static void cent() {
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
//------------------------------------------------------------------------------

    public static void fourSquares() {
        drawL();
        drawM();
        drawL();
        drawM();
        drawL();
    }
    /** Methode produziert die Linie */ // called by fourSquares
    public static void drawL() {
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.println();
    }
    /** Methode produzier die Mauern */ // called by fourSquares
    public static void drawM() {

        /** Diese doppel-Schleife lässt die Mauern
         zum SIZE Wert im Quadrat skalieren */
        for (int c = 1; c <= SIZE; c++) {
            System.out.print("#");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
    }
//------------------------------------------------------------------------------

    public static void powers() {
        double product= FACTOR;
        System.out.print(product);
        for (int i=2; i <= EXPONENT; i++) { // call global value
            product *= FACTOR;
            System.out.print(", " + product);
        }
        System.out.println();
    }

//------------------------------------------------------------------------------

    /**Code für Grafik*/
    public static void grafik() {
        sp(2);
        for (int x = 1; x <= 7; x++) {
            System.out.print("_");
        }
        System.out.println();
        sp(1);
        System.out.print("/");
        sp(7);
        System.out.print("\\");
        System.out.println();
        System.out.print("/");
        sp(9);
        System.out.print("\\");
        System.out.println();
        System.out.println("-\"-'-\"-'-\"-");
        System.out.print("\\");
        sp(9);
        System.out.print("/");
        System.out.println();
        sp(1);
        System.out.print("\\");
        for (int x = 1; x <= 7; x++) {
            System.out.print("_");
        }
        System.out.print("/");
        System.out.println();
    }
    // called by grafik()
    public static void sp(int s) {
        for (int i = 1; i <= s; i++) {
            System.out.print(" ");
        }
    }
}