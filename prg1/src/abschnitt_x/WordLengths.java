package abschnitt_x;

    /** scanner und file funktion reinholen*/
import java.util.*;
import java.io.*;
    /** aufruf der Klassendatei*/
public class WordLengths {
    /** aufruf der Main Methode */
    public static void main(String[] args)
            throws FileNotFoundException {
        String fileName = "bspWL.txt";
        wordLengths(fileName);

    }
    /** aufruf der eigentlichen Funktion,
     wörter eines Files durchzählen  und nach
     länge in einem Histogramm visualisieren*/
    public static void wordLengths(String dateiName)
            throws FileNotFoundException  {
        Scanner input = new Scanner(new File(dateiName));
        ArrayList<String> list = new ArrayList<>();
        int counts[] = new int[200];
        while (input.hasNext()) {
            String p= input.next();
            list.add(p);
            int temp2 = p.length();
            counts[temp2]++;
        } // suche grötßten Wert im Array
        int max = counts[0];
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            int temp2 = temp.length();
            if (max < temp2) {
                max = temp2;
            }
        } // Ausgabe als Histogramm
        for (int i = 1; i <= max; i++) {
            if (counts[i] < max && i < 10) {
                System.out.print(i  + ": " + counts[i] + "   ");
                for (int k = 0; k < counts[i]; k++) {
                    System.out.print("*");
                }
            } else if (counts[i] < max && i >= 10) { // formatierung
                System.out.print(i  + ": " + counts[i] + "  "); //zwei-
                for (int k = 0; k < counts[i]; k++) {//stelliger buschstaben
                    System.out.print("*");                                     //länge
                }
            }                                       // formatiereung
            if (counts[i] > max) { // zweistellige buchstabenzahl
                System.out.print(i  + ": " + counts[i] + "  ");
                for (int k = 0; k < counts[i]; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

