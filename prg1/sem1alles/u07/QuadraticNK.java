public class QuadraticNK {
    public static void main(String[] args) {
        quadratic(1, -12, 35);
        quadratic(0.2, -0.8, 0.8);
        quadratic(1, 12, 37);
        quadratic(0.1, 0.6, 0.9);
        quadratic(1.8, 1.2, 0.2);
        quadratic(0, 4, 7);
        quadratic(1, -4.2, 4.21);
    }   
    public static double round1(double value) {
        if (Double.isNaN(value)) return -1;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10.0) / 10.0;
    }
    public static void printplus(double x2, double x1) {
        System.out.println("Erste Lösung = " + x2);
        System.out.println("Zweite Lösung = " + x1);
    }
    
    
    
    
    public static void quadratic(double a, double b, double c) {
        double tmpValue = b*b-4.0*a*c;
        double x1 = round1((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        double x2 = round1((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        double x11 = round1((-b-Math.sqrt(tmpValue))/(2.0*a));
        double x21 = round1((-b+Math.sqrt(tmpValue))/(2.0*a));
        if (a <= 0) {
            System.out.println("a muss ungleich 0 sein");
        } else if (-0.01 > (b*b-4*a*c)) {
            System.out.println("Keine reelle Lösung");
        }
          else if (x1 == x2) {
            System.out.println("Lösung: " + x1);
        } else if (a > 0) {
            printplus(x2, x1);
        }
    }
}