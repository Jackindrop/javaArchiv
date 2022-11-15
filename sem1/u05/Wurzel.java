/** n-te Wurzel ziehen */
public class Wurzel {
    /** Math Methode zur berechnung */
    public static double zahlHoch1Durchn(double a, double n) {
        return Math.pow(a, 1/n);
        /** main Methode gibt werte an */     
    }
    public static void main(String[] args) {
        System.out.println(zahlHoch1Durchn(256, 4));
        System.out.println(zahlHoch1Durchn(0.16, 2));
        System.out.println(zahlHoch1Durchn(4, 1/2)); 
        System.out.println(zahlHoch1Durchn(27, 1/3)); 
        System.out.println(zahlHoch1Durchn(1048576, 1/10)); 
    }
}