import java.io.*;
import java.util.*;
public class equalOrNot2 {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String,String>> bUchner= 
            new TreeMap<String, TreeMap<String, String>>();
        TreeMap<String, TreeMap<String,String>> bUchnerNOTEQUAL= 
            new TreeMap<String, TreeMap<String, String>>();   
        
        options(bUchner, bUchnerNOTEQUAL);
    }
    
    public static void options(TreeMap<String, TreeMap<String,String>> bUchner, 
            TreeMap<String, TreeMap<String,String>> bUchnerNOTEQUAL) {
        System.out.println("\n|Gift of Time|-------------------------------------------------------------------------|v.1.0.0|");                            
        System.out.println("|            |-------------------------------------------------------------------------|       |");                            
        System.out.println("|   Options  |-------------------------------------------------------------------------|       |");           
        Scanner console= new Scanner(System.in);
        optionsOfGift();   
        System.out.print("\t\t      Bitte fühlen Sie sich zur Interaktion gezwungen: ");
        while (console. hasNextLine()) {                        
            String tempS= console.next();             
            if (tempS.equals("0")) {
                break;
            }  
            if (tempS.equals("1")) {
            buchnerDataIn("aRniInputData.csv", bUchner);   
            System.out.println("\n\n|Abrechnungen Buechner|----------------------------------------|Datensatz erfolgreich zugeführt|\n");
            } 
            if (tempS.equals("2")) {
            arniDataIn("aRniInputDataB.csv", bUchnerNOTEQUAL); 
            System.out.println("\n\n|Abrechnungen Arni|--------------------------------------------|Datensatz erfolgreich zugeführt|\n");
            } 
            if (tempS.equals("3")) {
            nameFehlt(bUchner, bUchnerNOTEQUAL);  
            } 
            if (tempS.equals("4")) {
            belegFehlt(bUchner, bUchnerNOTEQUAL);   
            } 
            if (tempS.equals("5")) {
                try {
                    belegePrüfen(bUchner, bUchnerNOTEQUAL);  
                } catch (NullPointerException e) {
                    System.out.println("\n\n\n\n\n----|FEHLER|---> Vor Belegprüfung, vorerst auf fehlende Daten prüfen.");
                    System.out.println("----|FEHLER|----------------------------------------> Irgendeinen Buchstaben eingeben, für Menü.");
                    continue;
                }
            } 
            if (tempS.equals("6")) {
            printMaps(bUchner, bUchnerNOTEQUAL);              
            }
        optionsOfGift();
        System.out.print("\t\t      Bitte fühlen Sie sich zur Interaktion gezwungen: ");
        }
    }
            
    
    public static void optionsOfGift() {
        System.out.println("\n\t\t\t  <0> ..ich glaube Papierkram muss warten");
        System.out.println("\n\t\t\t  <1>" + "Scanne Abrechnung Buechner");
        System.out.println("\t\t\t  <2>" + "Scanne Abrechnung Arni");
        System.out.println("\t\t\t  <3>" + "Aussortieren & Anzeigen fehlender Namen");
        System.out.println("\t\t\t  <4>" + "Aussortieren & Anzeigen fehlender BelegNr.");
        System.out.println("\t\t\t  <5>" + "Falsche Abrechnungen Anzeigen");
        System.out.println("\n\t\t\t  <6>" + "Anzeige aktueller Datenbestände\n\n\n");
    }

            
    //DataZeile[]= {Index0=BelegNr, Index1=Datum, Index3=Brutto, Index4=zuZahlung} 
    public static void belegePrüfen(TreeMap<String, TreeMap<String,String>> mapOne, 
            TreeMap<String, TreeMap<String,String>> mapTwo) {
        int sizeOne= mapOne.size();
        int sizeTwo= mapTwo.size();
        int count2= 0;
        TreeMap<String, String> feedA= new TreeMap<String, String>();
        TreeMap<String, String> feedB= new TreeMap<String, String>();
        String fehlerQuelle= "";
        double summenDef= 0.0;
        for (String key : mapOne.keySet()) {
            feedA= mapOne.get(key);
            feedB= mapTwo.get(key);
            for (String val : feedA.keySet()) {
                String chainA= feedA.get(val);
                String chainB= feedB.get(val);
                Scanner rowA= new Scanner(chainA);
                double[] cashA= new double[2];
                double[] cashB= new double[2];
                while (rowA.hasNext()) {
                    int count= 0;
                    String tokenCave= rowA.next();
                    double preisA= rowA.nextDouble();
                    double eigenAnteilA= rowA.nextDouble();
                    cashA[count]= preisA;
                    count++;
                    cashA[count]= eigenAnteilA;
                }
                rowA.close();
                Scanner rowB= new Scanner(chainB);
                while (rowB.hasNext()) {
                    int count= 0;
                    String tokenCave= rowB.next();
                    double preisB= rowB.nextDouble();
                    double eigenAnteilB= rowB.nextDouble();
                    cashB[count]= preisB;
                    count++;
                    cashB[count]= eigenAnteilB;
                }
                rowB.close();
                for (int i =0; i<= 1; i++) {
                    boolean defiziet= false;
                    double tempCashA= cashA[i];
                    double tempCashB= cashB[i];
                    double cashDeff= round2(tempCashB - tempCashA);
                    summenDef+= cashDeff;
                    if ((cashDeff >= 0.1)||(cashDeff <= -0.1)) {
                        defiziet= true;
                        if (count2 == 0) {
                            count2++;
                            System.out.println("\n|Falsche Abrechnungen|------------------------------------------------------------------|     |");                                 
                        }
                        
                        System.out.println("\n-------------|" +
                        key+"\n");                
                        belegToKeyPrinter(key, feedA);
                        belegToKeyPrinter(key, feedB);
                        }
                        if ((i == 0)&&(defiziet)) {
                        System.out.println("\n----------------------------------------------------------|Brutto defiziet: "+ cashDeff);
                        }
                        if ((i == 1)&&(defiziet)) {
                        System.out.println("\n----------------------------------------------------------|zuZahlungs defiziet: "+ cashDeff);
            
                        }
                    }
                }
            }
            System.out.println("\n|Insgesamt|------------------------------------------------------------------------|"+summenDef+"|\n");

        }
        
    
    // ident. missing Values at Keys of main Map 1 & 2 -> print out console
    // method void eraseEmptyValues to delete Keys of Main Maps without values
    public static void belegFehlt(TreeMap<String, TreeMap<String,
        String>> mapOne, TreeMap<String, TreeMap<String,String>> mapTwo) {
        TreeMap<String,String> valuesA= new TreeMap<String, String>();
        TreeMap<String,String> valuesB= new TreeMap<String, String>();
        TreeMap<String,TreeMap<String,String>> namesValuesMissingOne= new 
        TreeMap<String, TreeMap<String,String>>();
        TreeMap<String,TreeMap<String,String>> namesValuesMissingTwo= new 
        TreeMap<String, TreeMap<String,String>>();
        TreeMap<String, String> dumA= new TreeMap<String, String>();
        TreeMap<String, String> dumB= new TreeMap<String, String>();                   
        for (String key : mapOne.keySet()) {
             dumA= mapOne.get(key);
             dumB= mapTwo.get(key);
            for (String values : dumA.keySet()) { 
                if (!dumB.containsKey(values)) { 
                    valuesA.put(values, dumA.get(values)); // init missing subKeyMap1
                }                 
            }  
            for (String values : dumB.keySet()) { 
                if (!dumA.containsKey(values)) { 
                    valuesB.put(values, dumB.get(values)); // init missing subKeyMap1
                }     
            }           
        }
        for (String key : mapOne.keySet()) { // ident. missing Belege at brother-
            TreeMap<String, String> subOne= mapOne.get(key);            //-Map
            for (String val : valuesA.keySet()) {
                TreeMap<String, String> feederA= new TreeMap<String, String>();
                TreeMap<String,String> filler= new TreeMap<String,String>();
                filler= mapOne.get(key);
                feederA.put(val, valuesA.get(val));
                for (String vale : filler.keySet()) { // remove missing values
                    if (feederA.containsKey(vale)) { // in subKeyMap
                        filler.remove(vale);
                        namesValuesMissingOne.put(key, feederA);
                    }
                }
                                               // add full data SubKey-
                
                mapOne.put(key, filler); 
                }
            }      
        for (String key : mapTwo.keySet()) {                    // ""
            TreeMap<String, String> subOne= mapTwo.get(key); 
            for (String val : valuesB.keySet()) {
                if (subOne.containsKey(val)) {
                    TreeMap<String, String> feederA= new TreeMap<String, String>();
                    TreeMap<String,String> filler= new TreeMap<String,String>();
                    filler= mapTwo.get(key);
                    feederA.put(val, valuesB.get(val));
                    for (String vale : filler.keySet()) { // remove missing values
                        if (feederA.containsKey(vale)) { // in subKeyMap
                            filler.remove(vale);
                            namesValuesMissingTwo.put(key, feederA);
                        }
                    }
                                               // add full data SubKey-
                mapTwo.put(key, filler); 
                }
            }
        }
        int countOne= 0;
        int countTwo= 0;
        ArrayList<String> missing= new ArrayList<>(); // print.out missing Value
        for (String key : namesValuesMissingTwo.keySet()) {
            countTwo++;
            if (countTwo == 1) {
                System.out.println("\n|Fehlende Belege|-----------------------------------------------------------------------|Arni|\n");                             
            }
                System.out.println("\n-------------|" +
                    key+ " fehlt:\n");
                TreeMap<String,String> tempPrint= namesValuesMissingTwo.get(key);                
                belegToKeyPrinter(key, tempPrint);
                missing.add(key);
        }
        for (String key : namesValuesMissingOne.keySet()) {
            countOne++;
            if (countOne == 1) {
                System.out.println("\n|Fehlende Belege|----------------------------------------------------------------------|Buechner|\n");                             
               }
                System.out.println("\n-------------|" +
                    key+ " fehlt:\n");
                TreeMap<String,String> tempPrint= namesValuesMissingOne.get(key);                
                belegToKeyPrinter(key, tempPrint);
                missing.add(key);
        }
        //Aufruf leere Datensätze zu leeren Keys löschen
        eraseEmptyNames(mapOne, mapTwo, namesValuesMissingOne,namesValuesMissingTwo);
    }
    //Leere Datensätze zu Keys werden gelöscht
    public static void eraseEmptyNames(TreeMap<String, TreeMap<String,String>> 
            mapOne,TreeMap<String, TreeMap<String,String>> mapTwo,TreeMap<String,
            TreeMap<String,String>> namesValuesMissingOne,
            TreeMap<String,TreeMap<String,String>> namesValuesMissingTwo) {
        boolean empty= false;
        for (String key : namesValuesMissingOne.keySet()) {
            TreeMap<String, String> dumA= new TreeMap<String, String>();
            dumA= mapOne.get(key);
            if (dumA.isEmpty()) {
                empty= true;
                if (empty) {
                mapOne.remove(key);
                }
            }
        }
        for (String key : namesValuesMissingTwo.keySet()) {
            TreeMap<String, String> dumB= new TreeMap<String, String>();
            dumB= mapTwo.get(key);
            if (dumB.isEmpty()) {
                empty= true;
                if (empty) {
                    mapTwo.remove(key);
                }
            }
        }
    }  
    // methode druckt Werte zum Key/BelegNr zeilenweise aus
    public static void belegToKeyPrinter(String keyToPrint, 
            TreeMap<String, String> data) {
        ArrayList<String> datenTabelle= new ArrayList<>();

        datenTabelle.add("Beleg-Nr.: ");
        datenTabelle.add("           ");
        datenTabelle.add("Brutto: ");
        datenTabelle.add("zuZahlung: ");
        for (String key : data.keySet()) {
            String belegNr= key+ " ";
            belegNr+= data.get(key);
            String[] splitter= belegNr.split(" ");
            for (int i= 0; i<= datenTabelle.size(); i++) {
                if (i < 1) {
                    System.out.println("\t\t\t\t\t"+datenTabelle.get(i)
                        +splitter[i]);
                }
                if (i >= 3) {
                    System.out.println("\t\t\t\t\t"+datenTabelle.get(i-1)
                        +splitter[i]);
                }
            }
            System.out.println();
        }
    }   
    // prüft auf fehlende Namen in den Listen , gibt diese auf Console aus
    //-> geht in methode über welche besagte Namen löscht.
    public static void nameFehlt(TreeMap<String, TreeMap<String,String>> mapOne, 
            TreeMap<String, TreeMap<String,String>> mapTwo) {
        int countOne= 0;
        int countTwo= 0;
        ArrayList<String> missing= new ArrayList<>();       
        for (String key : mapOne.keySet()) {
            if (mapTwo.containsKey(key)) {
                if (mapOne.containsKey(key)) {                  
                }
            } else {
                countOne++;
                if (countOne == 1) {
                    System.out.println("\n|Fehlende Namen|-----------------------------------------------------------------------|Buchner|");
                }
                System.out.println("\n---------------|" +
                    key+ " fehlt:");
                TreeMap<String,String> tempPrint= mapOne.get(key);                
                belegToKeyPrinter(key, tempPrint);
                missing.add(key);
            }           
        }
        for (String key : mapTwo.keySet()) {
            if (mapOne.containsKey(key)) {
                if (mapTwo.containsKey(key)) {                  
                }
            } else {
                countTwo++;
                if (countTwo <= 1) {
                System.out.println("\n|Fehlende Namen|-------------------------------------------------------------------------|Arni|");                }              
                System.out.println("\n---------------|" +
                    key+ " fehlt:");
                TreeMap<String,String> tempPrint= mapTwo.get(key);                
                belegToKeyPrinter(key, tempPrint);
                missing.add(key);
            } 
            
        } 
        int sum= countOne + countTwo;
      //  System.out.println("\n|Summe fehlender Namen|---------------------------------------------------------------------|"+sum+"|\n\n");
        eraseMissingNames(mapOne, mapTwo, missing);
    }
    
    // fehlende namen werden aus den Collections gelöscht
    public static void eraseMissingNames(TreeMap<String, TreeMap<String,String>> mapOne, 
            TreeMap<String, TreeMap<String,String>> mapTwo, ArrayList<String> missingName) {
        for (int i= 0; i<= missingName.size()-1; i++) {
            if (!(mapOne.containsKey(missingName.get(i)) &&
                    mapTwo.containsKey(missingName.get(i)) )) {
                mapOne.remove(missingName.get(i));
            }
        }
        for (int i= 0; i<= missingName.size()-1; i++) {
            if (!(mapTwo.containsKey(missingName.get(i)) &&
                   mapOne.containsKey(missingName.get(i)) )) {
               mapTwo.remove(missingName.get(i));
           }          
        }
    }
    public static void printMaps(TreeMap<String, TreeMap<String,String>> mapOne, 
            TreeMap<String, TreeMap<String,String>> mapTwo) {
        int countA= 0;
        int countB= 0;
        System.out.println("\n\n|Erfasste Namen|----------------------------------------------------------------------|Buchner|\n");
        for (String key : mapOne.keySet()) {
            countA++;
            System.out.println("\n---------------|" +key);
            belegToKeyPrinter(key, mapOne.get(key));
        }
        System.out.println("\n\n|Erfasste Namen|-------------------------------------------------------------------------|Arni|\n");
        for (String key : mapTwo.keySet()) {
            countB++;
            System.out.println("\n---------------|" +key);
            belegToKeyPrinter(key, mapTwo.get(key));
        }
        System.out.print("\n\n|----------------------------------------------------------------------|Anzahl erfasster Namen|");
        System.out.println("\n|Arni|--------------------------------------------------------------------------------------|"+countA+"|");
        System.out.println("|Buchner|-----------------------------------------------------------------------------------|"+countB+"|");
        System.out.println("|Insgesamt|---------------------------------------------------------------------------------|"+((countA+countB)-countA)+"|");
            
        
        System.out.println("|---------------------------------------------------------------------------------------------|\n\n");
    }
    // scann der Datensätze von Buechner
    public static void buchnerDataIn(String baseName, TreeMap<String, TreeMap<String,String>> bUchner) { 
        Scanner inputFile= new Scanner(System.in);
        inputFile.useLocale(new Locale("en", "US"));
        try {
            inputFile= new Scanner(new File(baseName));
        } catch (FileNotFoundException e) {
            System.out.println("Fehler beim Datei zugriff.");
        } 
        while (inputFile.hasNextLine()) {
            String zeile= inputFile.nextLine();
            String[] splitZ= zeile.split(" ");
            String token1= splitZ[0]; // token1 = key          
            if (token1.length() == 0) { // aussortieren des
                continue;             // Versicherungs-Abschluss
            }//-----------------------------------------------------------------                      
            if (token1.length() == 6) { // einsortieren der Daten
                String data="";         // data <== key = Map
                String name= "";
                for (int i= 1; i<= 1; i++) { // Token's vor dem Key zsmf.
                    data+= splitZ[i]+ " ";      // zu data
                }
                for (int x= 2; x<=3; x++) { // Token 3-4= Name= key
                    name+= splitZ[x]+ " ";
                }                           // Token's nach dem Key zsmf.
                for (int i= 4; i<= splitZ.length-2; i++) { // zu data
                    data+= splitZ[i]+ " ";
                }
                if (name.charAt(0) == '"') { // AnführungZeichen "xyzName"
                    String[] nameSplitter= name.split("\""); // enfernen
                    name= nameSplitter[1];
                }
                if (!bUchner.containsKey(name)) {
                    TreeMap<String, String> belege= new TreeMap<String, String>();
                    String belegNrEins= splitZ[0];                 
                    belege.put(belegNrEins, data);
                    bUchner.put(name, belege);
                } else if (bUchner.containsKey(name)) { // if contains Name add
                    TreeMap<String, String> belege= bUchner.get(name); // data
                    belege.put(splitZ[0], data);
                }             
            }//----------------------------------------------------------------- 
            if (token1.length() == 7) {// aussortieren der 
                                      // Krankenkassen-Zeilen
            }                        // 7 stellige BeitragsNr.
        }
        inputFile.close();
    }
    /** Einlesen Tabelle mit anderen werten, zwecks prüfung der 
        differenz-methode*/
    public static void arniDataIn(String baseName, TreeMap<String, 
            TreeMap<String,String>> mapFalse) { 
        Scanner inputFile= new Scanner(System.in);
        inputFile.useLocale(new Locale("en", "US"));
        try {
            inputFile= new Scanner(new File(baseName));
        } catch (FileNotFoundException e) {
            System.out.println("Fehler beim Datei zugriff.");
        } 
        while (inputFile.hasNextLine()) {
            String zeile= inputFile.nextLine();
            String[] splitZ= zeile.split(" ");
            String token1= splitZ[0]; // token1 = key
            
            if (token1.length() == 0) { // aussortieren des
                continue;             // Versicherungs-Abschluss
            }//-----------------------------------------------------------------           
            
            if (token1.length() == 6) { // einsortieren der Daten
                String data="";         // data <== key = Map
                String name= "";
                for (int i= 1; i<= 1; i++) { // Token's vor dem Key zsmf.
                    data+= splitZ[i]+ " ";      // zu data
                }
                for (int x= 2; x<=3; x++) { // Token 3-4= Name= key
                    name+= splitZ[x]+ " ";
                }                           // Token's nach dem Key zsmf.
                for (int i= 4; i<= splitZ.length-2; i++) { // zu data
                    data+= splitZ[i]+ " ";
                }
                if (name.charAt(0) == '"') { // AnführungZeichen "xyzName"
                    String[] nameSplitter= name.split("\""); // enfernen
                    name= nameSplitter[1];
                }
                if (!mapFalse.containsKey(name)) {
                    TreeMap<String, String> belege= new TreeMap<String, String>();
                    String belegNrEins= splitZ[0];                 
                    belege.put(belegNrEins, data);
                    mapFalse.put(name, belege);
                } else if (mapFalse.containsKey(name)) { // if contains Name add
                    TreeMap<String, String> belege= mapFalse.get(name); // data
                    belege.put(splitZ[0], data);
                    mapFalse.put(name, belege);
                }             
            }//----------------------------------------------------------------- 
            
            if (token1.length() == 7) {// aussortieren der 
                                      // Krankenkassen-Zeilen
            }                        // 7 stellige BeitragsNr.
        }
        inputFile.close();
    }
    /** Rundet Ausgabe Double auf zwei nachkommastellen */
    public static double round2(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 100) / 100.0;
    }
}