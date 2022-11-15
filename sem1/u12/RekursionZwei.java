import java.io.*;
import java.util.*;
public class RekursionZwei {
    public static void main(String[] args) {
        ersteRekursive();
        System.out.println(potenzFunktion(4, 3)); //64
        System.out.println("Mystery output:");
        System.out.println(mystery(6)); // 6
        System.out.println(mystery(17)); // 8
        System.out.println(mystery(259)); // 16
        System.out.println(mystery(977)); // 23
        System.out.println(mystery(-479)); // -20
        System.out.println(sterne(0));
        System.out.println(sterne(1));
        System.out.println(sterne(2));
        System.out.println(sterne(3));
        System.out.println(istPalindrom("ANNASUSANNA"));
        System.out.println(istPalindrom("ANNASUZANNA"));
        System.out.println(mystery3("a"));
        System.out.println(mystery3("ab"));
        System.out.println(mystery3("a bc"));
        System.out.println(mystery3("a b c"));
        System.out.println(mystery3("Rekursion ist gar nicht so schwer"));
    } // L.9 Rekursion:
    public static void ersteRekursive() {
        
    }
    } // L.9.2 berechnet anzahl der tokens im string
    public static int mystery3(String s) {
        int i= s.indexOf(" ");
        if (i < 0) {
            return 1;
        }
        return 1+ mystery3(s.substring(i+1));
    } // 9.b. gibt string mit 2^n sternen zurück
    public static String sterne(int n) {
        if (n == 0) {
            return "*";
        } else {
            String s= sterne(n-1);
            return s+s;
        }
    } // 9.c. checkt ob String ein Palindrom ist
    public static boolean istPalindrom(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            return s.charAt(0) == s.charAt(s.length()-1)
                && istPalindrom(s.substring(1, s.length()-1));
        }
    } // 9.a. berechnet quersumme 
    public static int mystery(int n) {
        if (n < 0) {
            return -mystery(-n);
        } else if (n < 10) {
            return n;
        } else {
            return mystery(n/10) + mystery(n %10);
        }
    } //iterative Methode
    public static int interaPoFu(int x, int n) {
        int produkt= 1;
        for (int i = 0; i < n; i++) {
            produkt = produkt * x;
        }
        return produkt;
    } // rekursive Methode
    public static int potenzFunktion(int x, int n) {
        if (n ==0) {
            return 1;
        } else if (n%2 == 0) { //gerade?
            return potenzFunktion(x*x, n/2);
        } else { // ungerade
            return x* potenzFunktion(x, n-1);
        }
    }
}