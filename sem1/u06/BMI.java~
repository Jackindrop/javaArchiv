/** import macht Scanner Objekt nutzbar */
import java.util.*;
/** Aufruf der Class-Datei */
public class BMI {
    /** Aufruf der main methode */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Dieses Programm berechnet, Ihren BMI!");
        System.out.println("Geben sie erst Ihr Gewicht an in Kg: ");
        double g = console.nextDouble();
        System.out.println("Und jetzt ihre Körpergröße in Metern");
        double l = console.nextDouble();
        double bmi = (g)/(l*l);
        System.out.println("Ihr BMI: "+bmi);
        if (bmi < 20) {
            System.out.println("Untergewichtig");
        } else if (bmi < 25) {
            System.out.println("Normalgewicht");
            } else if (bmi < 30) {
            System.out.println("Übergewicht");
            } else if (bmi < 40) {
            System.out.println("Adipositas");  
            } else if (bmi > 40) {
            System.out.println("Schwere Adipositas"); 
        }
    }
}