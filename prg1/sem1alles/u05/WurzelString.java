/** n-te Wurzel ziehen */
public class WurzelString {
    /** Math Methode zur berechnung */
    public static String zahlHoch1Durchn(double a, String n) {
        String nn = String.valueOf(n);
        String n1 = nn.substring(0 ,1);
        System.out.println(n1);
        double i = Math.pow(a, (1.0/1));
        String s = String.valueOf(i);
        return s;
        /** main Methode gibt werte an */     
    }
    public static void main(String[] args) {
        System.out.println(zahlHoch1Durchn(256, 4));
        System.out.println(zahlHoch1Durchn(0.16, 2));
        System.out.println(zahlHoch1Durchn(4, (1/2))); 
        System.out.println(zahlHoch1Durchn(27, (1/3))); 
        System.out.println(zahlHoch1Durchn(1048576, (1/10))); 
        double d = (1.0*1/10);
        System.out.println(d);
    }
}