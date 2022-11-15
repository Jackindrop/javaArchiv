/** aufruf von Scanner und File funktion*/
import java.io.*;
import java.util.*;
/** aufruf der classe*/
public class TextDiff {
    /** aufruf der main methode*/
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("zu vergleichende Text-Datei #1: ");
        String text1 = console.nextLine();
        System.out.print("zu vergleichende Text-Datei #2: ");
        String text2 = console.nextLine();         
        diff(text1 ,text2);
        console.close();
    }
    
    public static void diff(String text1, String text2) {
        try {
            Scanner line1 = new Scanner(new File(text1));
            Scanner line2 = new Scanner(new File(text2));
            String zeile1 = " ";
            String zeile2 = " ";
            String zeile1dummy = " ";
            String zeile2dummy = " ";
            int count = 0;
            boolean gleich = true;
            while (line1 != null || line2 != null) {
                if (line1 == null) {          
                    zeile1 = zeile1dummy;
                }
                if (line2 == null) {
                    zeile2 = zeile2dummy;
                }
                if ( ! zeile1.equals(zeile2)) {
                    if (gleich || count ==1) {
                        System.out.println("Unterscheide gefunden: ");
                        gleich = false;
                    }
                }
                if ( ! zeile1.equals(zeile2)) {
                    System.out.println("Zeile: " + count);
                    System.out.println("< " + zeile1);
                    System.out.println("> " + zeile2);
                    System.out.println();
                }
                
                if (line1 != null && line1.hasNextLine()) {
                    zeile1 = line1.nextLine();
                } else if (line1.hasNext() || line1 != null) {
                    zeile1 = zeile1dummy;
                    line1.close();
                }
                 if (line2 != null && line2.hasNextLine()) {
                    zeile2 = line2.nextLine();
                } else if (line2.hasNext() || line2 != null) {
                    zeile2 = zeile2dummy;
                    line2.close();
                }
            count++;
            }
            
                 
            } catch (FileNotFoundException e) {
                System.out.println("Kann Datei nicht finden: ");
            } catch (NoSuchElementException e) {
                System.out.println("keine zeile ");
            } 
        }
    }

