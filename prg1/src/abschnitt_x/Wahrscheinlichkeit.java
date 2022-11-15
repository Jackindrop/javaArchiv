package abschnitt_x;

import java.util.*;
public class Wahrscheinlichkeit {
    public static void main(String[] args) {
        int start = 1;
        wTest(start);
    }
    public static void wTest(int start) {
        int counts = 0;
        int zehnprozent = 0;
        int dreißigprozent = 0;
        int sechzigprozent = 0;
        for (int i = start; i <= 100000; i++) {
            Random rand = new Random();
            int x6 = rand.nextInt(100) + 1;
            System.out.println("lauf: " +i + " rand: " +x6);
            if (x6 >= 1 && x6 <= 60) {
                counts ++;
                sechzigprozent ++;
            } else if (x6 >= 60 && x6 <= 90) {
                counts --;
                dreißigprozent ++;
            } else if (x6 >= 90 && x6 <= 100) {
                counts += 0;
                zehnprozent ++;
            }
            System.out.println("Live counts: " + counts);
        }
        System.out.println("Anzahl 60% addition um 1: " + sechzigprozent);
        System.out.println("Anzahl 30% subtraktion um 1: " + dreißigprozent);
        System.out.println("Anzahl 10% keiner operation: " + zehnprozent);
    }
}


