import java.io.*;  //   kombinierte eingabe 
import java.util.*; // text einlesen und in neuem File speichern
public class Erloese { // allg. abfang von Exceptions in main   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = null;
        Scanner erloeseScanner = null;
        try {       // bei allgemeiner Fehlerbehandlung ist Fehler-
            Scanner console = new Scanner(System.in); //deffinition
            input = getInput(console);          // schwer zu finden
            while (input.hasNextLine()) {
                String produkt = input.nextLine();
                String erloese = input.nextLine();
                System.out.println(produkt+ ": ");
                erloeseScanner = new Scanner(erloese);
                verarbeite(erloeseScanner);
                erloeseScanner.close();
            }
        } catch (Exception e) {
            System.out.println("Sonstiger Fehler");
        } finally {             // block killt im Fehler-
            if (input != null) { // fall alle inputs und
                input.close(); // gibt mem. frei bzw.
            }               // geöffnete Dateien auf System-
            if (erloeseScanner != null) { //ebene
                erloeseScanner.close();
            }
        }
            
    }
    public static void verarbeite(Scanner erloeseScanner) {
        int gesamteinheiten = 0;
        double gesamterloes = 0.0;
        while (erloeseScanner.hasNextInt()) {
            int verkauft = erloeseScanner.nextInt();
            double einzelpreis = erloeseScanner.nextDouble();
            gesamteinheiten += verkauft;
            gesamterloes += verkauft * einzelpreis;
        }
        double durchschnittspreis;
        if (gesamteinheiten != 0) {
            durchschnittspreis = gesamterloes / gesamteinheiten;
        } else {
            durchschnittspreis = 0.0;
        }
        System.out.println("   Einheiten     : " + gesamteinheiten);
        String waehrung =
        Currency.getInstance(erloeseScanner.locale()).getCurrencyCode();
        System.out.println(" Durchschnittspreis: " + durchschnittspreis + waehrung);
    }  
    public static Scanner getInput(Scanner console) {
        Scanner input = null;
        do {
            System.out.print("Jahreszahl: ");
            String jahr = console.next();
            String name = "erloese"+ jahr +".txt";
            try {
                input = new Scanner(new File(name));
            } catch (FileNotFoundException e) {
                System.out.println("Datei nicht gefunden. Nochmal.");
            }
        } while (input == null);
        return input;
    }
}
        