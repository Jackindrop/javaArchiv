/** aufruf von Scanner und File funktion*/
import java.io.*;
import java.util.*;
/** aufruf der classe*/
public class Diff {
    /** aufruf der main methode*/
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Scanner input =null;

        System.out.print("zu vergleichende Text-Datei #1: ");
        String text1 = console.nextLine();
        System.out.print("zu vergleichende Text-Datei #2: ");
        String text2 = console.nextLine();
        diff( text1, text2);
        console.close(); 
    }   
 
    /** aufruf der diff-methode, wertet gegebene  inputFiles
    nach vorgabe aus  */
    public static void diff(String text1, String text2) {
        try {
            Scanner line1 = new Scanner(new File(text1));
            Scanner line2 = new Scanner(new File(text2));
            String zeile1 = " ";
            String zeile2 = " ";
            String zeile1dummy = "";
            String zeile2dummy = "";
            int count = 0;
            boolean gleich = true;
            boolean killswitch1 = true;
            boolean killswitch2 = true;
            while (line1 != null || line2 != null) {             
                if ( ! zeile1.equals(zeile2) && gleich) { // if-Schleife zerlegt sich selbst 
                    if (gleich ) {                          // nach einem durchlauf
                        System.out.println("Unterschiede gefunden: ");
                        gleich = false;
                    }
                } // if loop druckt ungleiche zeilen zum vergleich aus
                if ( ! zeile1.equals(zeile2) ) {
                    System.out.println("Zeile " + count + " :");
                    System.out.println("");
                    System.out.println("< " + zeile1);
                    System.out.println("> " + zeile2);
                    System.out.println("");
                } //if loop verhindert NoSuchElemtException
                if (line1 != null && line1.hasNextLine()) {
                    zeile1 = line1.nextLine();
                } else if (line1.hasNext() || line1 != null) {
                    zeile1 = zeile1dummy;
                    killswitch1 = false;
                }
                if (line2 != null && line2.hasNextLine()) {
                    zeile2 = line2.nextLine();
                } else if (line2.hasNext() || line2 != null) {
                    zeile2 = zeile2dummy;
                    killswitch2 = false;
                } //nach erneuter zuweisung neuer zahlen coutner +1
                count++;
                if (!killswitch1 && !killswitch2) {
                    break;
                }
            } //gleich müsste wahr sein fur die folgende behauptung
            if (gleich) {
                System.out.println("Keine Unterschiede gefunden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Kann Datei nicht finden: " +text1);
        } catch (NoSuchElementException e) {
            System.out.println("keine weitere Zeile gefunden. ");
        } catch (IllegalStateException e) {
            System.out.println("joch des Graja");            
        }
    }
}


    