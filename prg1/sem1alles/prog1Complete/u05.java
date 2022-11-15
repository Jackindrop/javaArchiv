// u05/
// scanner, point, math, formatter, String

import java.util.*;
import java.text.NumberFormat; // calles first by firstScanner 
import java.util.Locale;        // ""       ""          ""
import java.awt.*;              // called by point
public class u05 {
    public static void main(String[] args) {
        firstScanner();
        consolInput();
        employeeDataProcess();
        point();
        stringScan();
        pointSwap();
        squareRoot();
    }
    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    /** n-te Wurzel ziehen */
    public static void squareRoot() {
        System.out.println(zahlHoch1Durchn(256, 4));
        System.out.println(zahlHoch1Durchn(0.16, 2));
        System.out.println(zahlHoch1Durchn(4, 1/2)); 
        System.out.println(zahlHoch1Durchn(27, 1/3)); 
        System.out.println(zahlHoch1Durchn(1048576, 1/10)); 
    }
    
    public static double zahlHoch1Durchn(double a, double n) {
        return Math.pow(a, 1/n);
        /** main Methode gibt werte an */     
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void pointSwap() {
        Point p1= new Point(5, 2);
        Point p2= new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("p1: ("+p1.x+", "+p1.y+")");
        System.out.println("p2: ("+p2.x+", "+p2.y+")");
    }
    /** Swap Methode tauscht koordinaten der Punkte */
    public static void swapPoints(Point p1, Point p2) {
        Point temp = new Point(p1);
        p1.setLocation(p2);
        p2.setLocation(temp);
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void stringScan() {
        Scanner console = new Scanner(System.in);
        String s = "Schundroman";
        System.out.println("String: " + s);
        System.out.println("Welcher Index des Strings ist gesucht?");
        int num = console.nextInt();
        System.out.println(s.substring(num, num+1));
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void point() {
        int x= 4;
        int y= 3;
        int faktor= 2;
        Point p1 = new Point(x, y);
        skaliere(p1 ,faktor);
        System.out.println("x="+p1.x+",y="+p1.y);
    }
    public static void skaliere(Point p1, int faktor) {
        int xx = p1.x * faktor;
        int yy = p1.y * faktor;
        p1.setLocation(xx ,yy);
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    /** Liest Daten für einen Angestellten mit gegebener nummer ein.
        Gibt die Gesamtstunden für den Angestellten zurück. */
    public static void employeeDataProcess() {
        Scanner console = new Scanner(System.in);
        int hours1 = processEmployee(console, 1);
        int hours2 = processEmployee(console, 2);
        int total = hours1 + hours2;
        System.out.println("Gesamtstunden für beide = " + total);
    }
    
     public static int processEmployee(Scanner console, int nummer) {
        System.out.print("Angestellter " + nummer + ": Wie viele Tage? ");
        int days = console.nextInt();
        // totalHours ist eine kumulative Summe der Arbeitsstunden.
        int totalHours = 0;
        for (int i = 1; i <= days; i++) {
            System.out.print("Stunden? ");
            int hours = console.nextInt();
            totalHours += Math.min(hours, 8); // alles über 8 Std.
            // abschneiden
        }
        System.out.println("Gesamtstunden für Angestellter " + nummer
            + " = " + totalHours);
        System.out.println();
        return totalHours;
    }
    
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void consolInput() {
        Scanner console = new Scanner(System.in);
            System.out.print("How many numbers? ");
            int n= console.nextInt();
            int sum = readSum(console, n);
            System.out.println("The sum is " + sum);
        }
        
        public static int readSum(Scanner console, int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Type a number: ");
                sum += console.nextInt();
            }
            return sum;
        }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void firstScanner() {
        Locale locale = Locale.GERMAN;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Gebe die erste von drei \n Nummern an, von dessen Summe");
        System.out.println("wir den durschnitt berechnen");
        int num1 = console.nextInt();
        
        System.out.println("Jetzt die zweite Nummer");
        int num2 = console.nextInt();
        
        System.out.println("Nun gib die letzte Nummer ein");
        int num3 = console.nextInt();
        
        double average = (double) (num1+num2+num3)/3;
        String string = NumberFormat.getNumberInstance(locale).format(average);//<<<-- Formatter
        System.out.println("Der Durchschnitt ist "+string);
    }
}
        