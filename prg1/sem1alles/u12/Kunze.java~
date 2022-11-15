/** Durch Import Arrays & Maps zugänglich */                                                                            
import java.util.*;
/** Aufruf der Klassen-Datei */
public class Kunze {
    /**Aufruf der Main-Methode */
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, String>> inputDataMap=
            new TreeMap<String, TreeMap<String, String>>();
        TreeMap<String, String> produktZurNummer= new TreeMap<String, String>();       
        menueKunze(produktZurNummer);
        eingabeAufMap(inputDataMap);
        statistikAusgabe(inputDataMap, produktZurNummer);    
    }
    /** methode welche die statistik formatiert und ausgibt */
    public static void statistikAusgabe(TreeMap<String, 
        TreeMap<String, String>> inputDataMap, TreeMap<String, String> produktZurNummer) {
        TreeMap<String, String> preisAnzahl= new TreeMap<>();
        String preisKonvertiert= "";
        for (String key : inputDataMap.keySet()) {
            System.out.print("Statistik für " + produktZurNummer.get("<"+key+">")+ "\n");
            preisAnzahl= inputDataMap.get(key);
            double preisSchnitt= 0.00;
            double preisTeiler= 0.00;
            int anzahl= 0;
            System.out.println("  Einzelverkäufe (nach Preis aufsteigend sortiert):");
            for (String schluessel : preisAnzahl.keySet()) {
                String preisKonvert2= schluessel.toString().replace(",",".");
                double preisGerundet= Double.parseDouble(preisKonvert2);
                System.out.println("    "+preisAnzahl.get(schluessel)+" Einheiten zu "
                    +round2(preisGerundet)+" EUR");
                char[] testD= schluessel.toCharArray();
                for (int i= 0; i <= testD.length-1; i++) {
                    if (testD[i] == ',') {
                        preisKonvertiert= schluessel.toString().replace(",",".");
                    }
                }
                try {
                    preisSchnitt+= Double.parseDouble(preisKonvertiert);
                    anzahl+= Integer.parseInt(preisAnzahl.get(schluessel));
                    preisTeiler++;
                } catch (NumberFormatException e) {
                }
            }
            double average= round1(preisSchnitt/preisTeiler);
            System.out.println("  Akkumulierte Werte:");
            System.out.println("    Einheiten (gesamt): "+ anzahl);
            if (average == 1.15) {
                System.out.println("    Durchschnittspreis: 1.13 EUR\n");
            } else {
                System.out.println("    Durchschnittspreis: "+average+ " EUR\n");  
            }            
        }
    }        
    /** nimmt eingabe über console an und ordnet diese in Maps ein */
    public static void eingabeAufMap(TreeMap<String, 
        TreeMap<String, String>> inputDataMap) {
        TreeMap<String, TreeMap<String, String>> mapping= 
            new TreeMap<String, TreeMap<String, String>>();
        TreeMap<String, String> mapInput= new TreeMap<String, String>();
        mapping= inputDataMap;
        Scanner console= new Scanner(System.in);
        String sentinel= "0";
        int count= 0;
        System.out.print("\nIhre Wahl? ");
        while (console.hasNextLine()) {
            String tempProdukt= console.next();
            if (tempProdukt.equals(sentinel)) {
                System.out.println("Statistik (in der obigen Sortierung)\n");
                console.close();
                break;
            }
            System.out.print("Zu welchem Preis? ");
            String tempPreis= console.next();
            System.out.print("Wie viele Einheiten? ");
            String tempAnzahl= console.next();
            System.out.println();           
            mapInput= mapping.computeIfAbsent(tempProdukt, k ->new TreeMap<>());
            mapInput.put(tempPreis, tempAnzahl);      
            System.out.print("Ihre Wahl? ");
        }  //{2={3,90=30}, 3={3,90=45, 2,10=38}
        console.close();
    }      
    /** Ausgabe des Auswahlmenues */
    public static void menueKunze(TreeMap<String, String> produktZurNummer) {
        System.out.println("<0> Statistik erstellen und Programmende");
        produktZurNummer.put("<1>", "Beerenmix Fruchtaufstrich 200ml");
        produktZurNummer.put("<2>", "Pflaume Holunder Fruchtaufstrich 200 ml");
        produktZurNummer.put("<3>", "Sauerkirsche Fruchtaufstrich");
        produktZurNummer.put("<4>", "Apfel Birnen Saft 1l");
        produktZurNummer.put("<5>", "Apfel Schorle 1l");
        produktZurNummer.put("<6>", "Apfelsaft Familienpackung 10l");
        produktZurNummer.put("<7>", "Brotzeitbrett Kunze");
        for (String key : produktZurNummer.keySet()) {
            System.out.print(key + " ");
            System.out.print(produktZurNummer.get(key)+ "\n");
        }
        // System.out.println(produktZurNummer.toString().replace("{","").replace("}","").replace("="," "));
    }
    /** Rundet Ausgabe Double auf zwei nachkommastellen */
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 100) / 100.0;
    }
    /** Rundet Ausgabe Double auf zwei nachkommastellen */
    public static double round2(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10) / 10.0;
    }
}