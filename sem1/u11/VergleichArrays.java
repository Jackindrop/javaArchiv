/** ORIGINAL IN u10*/
import java.util.*;
/**aufruf der Klassen Datei*/
public class VergleichArrays {
    /**aufruf der main Methode*/
    public static void main(String[] args) {
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
        if (arrA.length < arrB.length) {
            for (int i = 0; i < arrA.length; i++) {
                if (arrB.length != 0) { 
                
                    if (arrA[i] == arrB[i]) {
                        agleichb++;
                    } else if (arrA[i] > arrB[i]) {
                        bkleinera++;
                    } else if (arrA[i] < arrB[i]) {
                        akleinerb++;
                    }
                }       
            }
        } else {
            for (int i = 0; i < arrB.length; i++) {
                if (arrB.length != 0) { 
                
                    if (arrA[i] == arrB[i]) {
                        agleichb++;
                    } else if (arrA[i] > arrB[i]) {
                        bkleinera++;
                    } else if (arrA[i] < arrB[i]) {
                        akleinerb++;
                    }
                }       
            }
        }
        if ((akleinerb > bkleinera) || akleinerb == bkleinera && 
            agleichb > 0 && arrA.length <= arrB.length) {
            return true;
        }      
        return false;
    }
}

            