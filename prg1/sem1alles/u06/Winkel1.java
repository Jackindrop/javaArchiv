import java.util.*;
public class Winkel1 {
    public static void main(String[] args) {
        double a = 3.5;
        double b = 2;
        double c = 4;
        double alpha;
        
        winkel1(a, b, c);
        
        System.out.println("alpha = "+alpha);
    }
    public static double winkel1(double a, double b, double c) {
        double alpha = Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        return alpha;
    }
    /** Rundet eine gegebene Zahl auf eine Nachkommastelle. */
    public static double round1(double alpha) {
        if (Double.isNaN(alpha)) return alpha;
        if (Double.isInfinite(alpha)) return alpha;
        return Math.round(alpha * 10) / 10.0;
}
}