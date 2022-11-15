package mainStat;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * scan file & calculate relevant Parameters
 * for Histogramm vertikal/horizontal output
 * and some important Variables from Statistik.
 * @author mariusG.
 */

public class getValues {

    public static Point[] ordArr;
    public static Point[] klssArr;

    public static int sizeFRAME= 0;
    public static int valMAX= 0;
    public static int valMIN= 10000;
    public static int numbOfKlss= 4;
    public static int widthOfKlss= 15;

    /**
     * Liest Zahlen aus der Datei aus.
     * Werte werden für die optische ausgabe in der console
     * als Histrogramm ausgewertet.
     * <ordArr></> Ordnungsstatistik Ausgabe als Histogramm
     *                          horizontal. Index vom Array wird als Attri-
     *                          butswert interpretiert.
     *                          Messwerte werden in x abgelegt.
     *                          Bei der Ausgabe  einfach   <if (xyz.x != 0)>
     *                          um leere "Messwerte" zu überspringen.
     * <klssArr></> Klassenstatistik Ausgabe als Histogramm
     *                             horizontal. Index des Arrays[n]= Klasse-n.
     *                             [n].x= Messwert
     *                             [n].y= AnzahlMesswert
     *
     * @param baseName -of .txt (int, ' ') file to scan.
      */
    public static void getArrays(String baseName) {

        ordArr= new Point[100];
        klssArr= new Point[numbOfKlss];
        initPoints(ordArr, 100);
        initPoints(klssArr, numbOfKlss);

        int klassenIndi= 0;
        int StichprobenAnzahl = 0;
        int[] dryArr= new int[100]; //------------------------insert number of Values
        Arrays.fill(dryArr, 0);

        Scanner input = null;
        /* einlesen der Int-Values, ablage in Array zum aufbereiten */

        try  {

            input = new Scanner(new File(baseName));

            while (input.hasNextInt()) { // scannt int des files
                int p = input.nextInt(); //  & legt es im ersten
                dryArr[p]++;                        // arr ab <dryArr>
                if (p != 0) {
                    StichprobenAnzahl++; // indicator for all Elements
                }
                if (p<valMIN) {    // kleinster & größter wert
                    valMIN= p;      // werden für operationen abgelegt
                }
                if (p> valMAX) {
                    valMAX= p;
                }
            }
            System.out.println("Number of scanned Values: "+ StichprobenAnzahl);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        /* Int Array aufbereiten in Point Array
          *  Messwert wird in x abgelegt    */
        for (int i= 0; i< dryArr.length; i++ ) {
            if (dryArr[i] != 0) {
                ordArr[i].x= dryArr[i];
            }
        }
        /* bilden des Array zur OrdnungsStatistik fertig */

        frameSize();

        /* bildet Array für klassen-statistik */
        for (int i = 0; i < ordArr.length; i++) {//
            if (i == 56) {
                klassenIndi++;
                valMIN += 15;                                                //
            } else if (i == 71) {
                klassenIndi++;
                valMIN += 15;
            } else if (i == 86) {                                   //
                klassenIndi++;
                valMIN += 15;
            }                                                                       //
            klssArr[klassenIndi].x = valMIN - 1;//um richtige anzahl zu zählen
            klssArr[klassenIndi].y+= ordArr[i].x;
        }
        valMIN-= 45;
    }

    /**
     * berechnung der klassenteilung anhand der rohdaten.
     * Anzahl Klassen: numbOfKlss
     * Größter Wert:    valMAX
     * Kleinster Wert: valMIN
     *
     */
    public static void frameSize() {
        int p= 0;
        for (int i= 0; i< ordArr.length; i++) {
            if (ordArr[i].x != 0) {
                p++;
            }
        }
        sizeFRAME= p;
    }

    /**
     * test methode zum optischen
     * prüfen des inhaltes der p-arrays
     * @param arr zu visualisierendes array
     */
    public static void printArr(Point[] arr) {
        for (int i = 0; i < arr.length; i++)
        if (arr[i].x != 0 || arr[i].y != 0) {
            System.out.println("\t" + i + "|x:" + arr[i].x + "|y:" + arr[i].y);
        }
    }

    /**
     * methode initialisiert point objekte mit x,y= 0
     * @param arr clear new Point Array
     * @return init. Point Array [i].x/y= 0;
     */
    public static void initPoints(Point[] arr, int n) {
        for (int i= 0; i< arr.length; i++) {
            Point tmp = new Point(0, 0);
            arr[i] = tmp;
        }
    }
}
