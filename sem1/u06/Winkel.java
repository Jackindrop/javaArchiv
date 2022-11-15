import java.util.*;
public class Winkel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Dieses Programm errechnet die drei Winkel eines Dreiecks.");
        double a = scann(console, 'a');
        double b = scann(console, 'b');
        double c = scann(console, 'c');        
        double alpha = winkela(a,b,c);
        double beta = winkela(b,a,c);
        double gamma = 180 - alpha - beta;        
        System.out.println("alpha = "+round1(alpha));
        System.out.println("beta = "+round1(beta));
        System.out.println("gamma = "+round1(gamma));
    }
    public static double winkela(double a, double b, double c) {
        double winkel = Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        return winkel;
    }    e
    /** Liest Seitenlängen über Console vom Benutzer ein */
    public static double scann(Scanner console, char seite) {
        System.out.print("Bitte Seitenlänge " +seite+ " eingeben: ");
        double a = console.nextDouble();
        return a;
    }
    /** Rundet eine gegebene Zahl auf eine Nachkommastelle. */
    public static double round1(double alpha) {
        if (Double.isNaN(alpha)) return alpha;
        if (Double.isInfinite(alpha)) return alpha;
        return Math.round(alpha * 10) / 10.0;
    }
}