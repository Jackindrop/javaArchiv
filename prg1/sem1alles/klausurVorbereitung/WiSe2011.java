import java.util.*;
import java.io.*;
public class WiSe2011 { /**                          
--------------------------------------------------------------------------------------------------------------------
1. Ausrücke programmieren
--------------------------------------------------------------------------------------------------------------------
2. Wie lautet die Ausgabe (insbesondere Point)
--------------------------------------------------------------------------------------------------------------------
3. Minimun

Eingabe von einer Gesamtanzahl von Aufrufen, dann Eingabe von mehreren Ganzzahlen und am Ende die Rückgabe der kleinsten eingebenen Zahl
--------------------------------------------------------------------------------------------------------------------
4. Verschachtele Schleife für 

xx#000000
xxx#0000
xxxx#00
xxxxx#
--------------------------------------------------------------------------------------------------------------------
5. Arrays (Methode um Variable aus dem Array auszusortieren und am Ende anzuanhängen)

int[] arr = {1,2,3,2,4,5,6,7}
int x = 2
MoveToTail(int[] arr, int x)
int[] arr = {1,3,4,5,6,7,2,2}
Methode sollte keine Rückgabe haben und das Ursprungsarray verändern.
--------------------------------------------------------------------------------------------------------------------
6. Collections (Datei einlesen mit Fehlerbehandlung, Methode um Katalog in eine Map zu packen und abzurufen)

Datei:
Foxtrot nails
Alpha gel
Beta wood
Foxtrot steel

Ausgabe:
Alpha:	 gel
Beta:	 wood
Foxtrot: nails steel
--------------------------------------------------------------------------------------------------------------------
7. Zeichenkette prüfen
Anforderung:
- keine 3 A's in der Zeichenkette
- keine Zahl folgt auf +
- kein y/Y in der Zeichenkette

z.B. 
12314+A+A123Ay -> false
1231231A123A1231 -> true
--------------------------------------------------------------------------------------------------------------------
8. Rekursion

Array mit: 2,4,1,1,18,29,2,3
Abstand bei arr[i] und arr[i+1] darf nur größer sein für +1
Abstand bei arr[i] und arr[i+2] darf nur kleiner sein für +2;
Ausgabe für oben: +1 +2 +1 +2                                               */
//------------------------------------------------------------------------------------------------------------------
    public static void aufgabeAcht() {
        
    }

//------------------------------------------------------------------------------------------------------------------
    public static boolean aufgabeSieben() {
        StringBuilder falschEr= new StringBuilder("1231231A123A1231");
        StringBuilder richtiGer= new StringBuilder("1231231A123A1231");
        int termCount= 0;
        int[] reFer= new int[falschEr.length()];
        // -----------------------------------------------init int arr
        for (int i= 0; i<=reFer.length-1; i++) {
            reFer[i]= i;
        }
        for (int k= 0; k<= falschEr.length()-1; k++) {
            if (falschEr.charAt(k)== 'A') { 
                termCount++;        // zählt A#s
                if (termCount== 3) {// falsch bei 3
                    return false;   
                }
            }
            if (falschEr.charAt(k)== '+') { // prüfe auf Nummer nach
                if (Character.isDigit(falschEr.charAt(k+1))) {
                    return false;
                }
            }
        }
        return true;
    }
//------------------------------------------------------------------------------------------------------------------
    public static void aufgabeSechs() {
        TreeMap<String, TreeSet<String>> kataLog= new TreeMap<String,
            TreeSet<String>>();
        Scanner input= new Scanner(System.in);
        try {// Exception gehandelt.. ungeschickt.
            input= new Scanner(new File("aSechsCollections.txt"));
        } catch (FileNotFoundException e) {
            input.close();
            System.out.println("Dateizugriff fehlgeschlagen.");
        }// Token-basiertes einlesen und ablegen in Set/Map
        while (input.hasNext()) {
            String tempKey= input.next();
            String tempData=input.next();
            if (kataLog.containsKey(tempKey)) {//wenn key da, ergänze data
                TreeSet<String> data= kataLog.get(tempKey);
                data.add(tempData);
            } else {                        // wenn nicht, gebe key und Set  
                TreeSet<String> data= new TreeSet<String>(); //zwecks init.
                kataLog.put(tempKey, data);
                data.add(tempData);
            }
        }
        for (String keys: kataLog.keySet()) {
                System.out.println(keys+ ": "+ kataLog.get(keys));
        }
    }
//------------------------------------------------------------------------------------------------------------------
    public static void aufgabeFünf(int[] arr, int x) { // --------------------X
        int[] arrDummy= new int[arr.length];
        int count= 0;
        for (int i= 0; i<= arr.length-1; i++) {
            arrDummy[i]= arr[i];
        }
        for (int i= 1; i<= arr.length; i++) {
            if (arr[i-1]== x) {
                for (int k= i; k<= arr.length-1; k++) {
                    arr[k-1]= arrDummy[k];
                }
            }
        }
        System.out.println(Arrays.toString(arrDummy));
        System.out.println(Arrays.toString(arr));
    }
//------------------------------------------------------------------------------------------------------------------
    public static void aufgabeVier() {
        for (int i= 1; i< 5; i++) {
            for (int j= 1; j<= i+1; j++) {
                System.out.print("x");
            }
            System.out.print("#");
            for (int k= 0; k<= 3-i; k++) {
                System.out.print("00");
            }
        System.out.println();
        }
    }
//------------------------------------------------------------------------------------------------------------------
    public static void aufgabeDrei() { // minimum getätigter eingaben
        Scanner console= new Scanner(System.in);
        System.out.print("Wieviele Eingaben\nmöchten Sie tätigen? ");
        int laenge= console.nextInt();
        int min= 0;
        int[] eingabe= new int[laenge];
        for (int i= 0; i<= laenge-1; i++) {
            System.out.print("Eingabe Nr. "+(i+1)+": ");
            eingabe[i]= console.nextInt();
            if (min == 0) {
                min= eingabe[i];
            } else if (eingabe[i] <= min) {
                min= eingabe[i];
            }
        }
        System.out.println("Die kleinste Zahl\nIhrer Eingabe lautet: "+ min);
    }
//------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------Aufgabe 3");
        //aufgabeDrei();
        System.out.println("--------------------------------------------------Aufgabe 4");
        aufgabeVier();
        int [] arr= {1,2,3,2,4,5,6,7};
        int x= 2;
        System.out.println("--------------------------------------------------Aufgabe 5");
        aufgabeFünf(arr, x);
        System.out.println("--------------------------------------------------Aufgabe 6");
        aufgabeSechs(); //eigentlich mit parameterübergabe aber der drop ist ja gelutscht
        System.out.println("--------------------------------------------------Aufgabe 7");
        System.out.println(aufgabeSieben());
    }
}
