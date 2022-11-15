/**hier wird die class datei aufgerufen */
public class QuadraticReturn {
    /** Main Methode übergibt primitive Daten */
    public static void main(String[] args) {
        quadratic(1, -12, 35);
        quadratic(0.2, -0.8, 0.8);
        quadratic(1, 12, 37);
        quadratic(0.1, 0.6, 0.9);
        quadratic(1.8, 1.2, 0.2);
        quadratic(0, 4, 7);
        quadratic(1, -4.2, 4.21);
    }   
    /** hier werden endergebnisse auf eine nachkommastelle gerundet */
    public static double round1(double value) {
        if (Double.isNaN(value)) return -1;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10) / 10.0;
    }
    /** methode überprüft parameter zwecks mathematisch korrekter
    syntax & und berechnet endergebnisse, gerundet */
    public static double quadratic(double a, double b, double c) {
        // Wieso machst du das hier? Gib doch einfach immer return 0 zurück
        double g = 0;
        if (a <= 0) {
            System.out.println("a muss ungleich 0 sein");
        return g;
        } else if (-0.01 > (b*b-4*a*c)) {
            System.out.println("Keine reelle Lösung");
        return g;
        }

        // Negative Quadratwurzeln sind mathematisch nicht definiert -> auf 0 setzen
        double tmpValue = b*b-4.0*a*c;
        if(tmpValue < 0) tmpValue = 0;

        double x1 = round1((-b-Math.sqrt(tmpValue))/(2.0*a));
        double x2 = round1((-b+Math.sqrt(tmpValue))/(2.0*a));

        if (x1 == x2) {
            System.out.println("Lösung: " + x1);
            return g;
        }
        System.out.println("Erste Lösung = " + x2);
        System.out.println("Zweite Lösung = " + x1);
        return g;
    }
}