package abschnitt_x;

/** aufruf der array funktion*/
import java.util.*;
/**aufruf der Klassen Datei*/
public class VergleichArrays {
    /**aufruf der main Methode*/
    public static void main(String[] args) {
        int[] arrA = {2, 1, -5, 6, 3, 12};
        int [] arrB = {2, 1, -5, 6, 4};
        System.out.println(kleinerGleich(arrA, arrB));
    }
    /**aufruf der vergleich methode*/
    public static boolean kleinerGleich(int[] arrA, int[] arrB) {
        int akleinerb = 0;
        int bkleinera = 0;
        int agleichb = 0;
        if (arrA.length == 0) {
            return true;
        }
        if ( arrB.length == 0) {
            return false;
        }
        if (arrA.length <= arrB.length) {
            for (int i = 1; i <= arrA.length-1; i++) {
                if (arrB.length != 0) {

                    if (arrA[i-1] == arrB[i-1]) {
                        agleichb++;
                    } else if (arrA[i-1] > arrB[i-1]) {
                        bkleinera++;
                    } else if (arrA[i-1] < arrB[i-1]) {
                        akleinerb++;
                    }
                }
            }
        }
        if (arrA.length > arrB.length) {
            for (int i = 1; i <= arrB.length-1; i++) {
                if (arrB.length != 0) {

                    if (arrA[i-1] < arrB[i-1]) {
                        akleinerb++;
                    } else if (arrA[i-1] > arrB[i-1]) {
                        bkleinera++;
                    } else if (arrA[i-1] == arrB[i-1]) {
                        agleichb++;
                    }
                }
            }
        }
        System.out.println("a < b: " + akleinerb);
        System.out.println("a > b: " + bkleinera);
        System.out.println("a = b: " + agleichb);
        if (akleinerb > bkleinera && arrA.length >= arrB.length) {
            return true;
        }
        if (akleinerb == bkleinera && agleichb > 0 && arrA.length <= arrB.length) {
            return true;
        }
        return false;
    }
}


