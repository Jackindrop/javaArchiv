/** n-te Wurzel ziehen */
public class Wurzel1 {
    /** Math Methode zur berechnung */
    public static double zahlHoch1Durchn(double a, double n) {
        double i = Math.pow(a, n);
        double x = Math.round(i*0.000000001)/1;
        return x;
        /** main Methode gibt werte an */     
    }
    public static void main(String[] args) {
        System.out.println(zahlHoch1Durchn(256, 4));     
    }
}