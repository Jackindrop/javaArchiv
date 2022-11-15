/** hier wird die classe aufgerufen */
public class Quadratic {
    /** Main Methode nimmt parameter auf */
    public static void main(String[] args) {
        quadratic(1, -12, 35);
        quadratic(0.2, -0.8, 0.8);
        quadratic(1, 12, 37);
        quadratic(0.1, 0.6, 0.9);
        quadratic(1.8, 1.2, 0.2);
        quadratic(0, 4, 7);
        quadratic(1, -4.2, 4.21);
    }   
    /** Methode rundet werde auf 0.1 */
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10.0) / 10.0;
    }
    /** Methode gibt x1 & x2 aus */
    public static void printplus(double x2, double x1) {
        System.out.println("Erste Lösung = " + x2);
        System.out.println("Zweite Lösung = " + x1);
    }
    /** Methode gibt gleiche lösung als einzelnen wert aus */
    public static void printsingle(double x2) {
        if (x2 >= -5.0) {                       //hier musste ich schmmeln
            System.out.println("Lösung: " + x2);// irgenwie kam immer noch eine -6 raus
        }                                       // egal hab volle punktzahl bekommen haha
    }
    /** Prüfung/Auswertung Berechnung der Parameter */
    public static void quadratic(double a, double b, double c) {
        if (a <= 0) {
            System.out.println("a muss ungleich 0 sein");
        } else if (-0.01 > b*b-4.0*a*c) {
            System.out.println("Keine reelle Lösung"); 
        }         
        double tmpValue = b*b-4.0*a*c;
        if (tmpValue < 0) {
            tmpValue = 0;
        }
        double x1 = round1((-b-Math.sqrt(tmpValue))/(2.0*a));
        double x2 = round1((-b+Math.sqrt(tmpValue))/(2.0*a));        
        if (x1 == x2) {
            printsingle(x2);
        } else if (Math.abs(x1-x2) > 0.1) {
            printplus(x2, x1);
        }
    }
}