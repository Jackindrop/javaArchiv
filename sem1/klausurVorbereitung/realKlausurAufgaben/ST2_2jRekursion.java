import java.util.*;
public class ST2_2jRekursion {
    public static void main(String[] args) {
        System.out.println(m(5));
        double d= 5.255534;
        System.out.println(Math.round(d*100)/100.0);
    }
    public static double round2(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 100) / 100.0;
    }
    public static String m(int n) {
        if (n> 1) {
            String s= m(n-1);
            return n+s+s+n;
        }
        return "1";
    }
}
