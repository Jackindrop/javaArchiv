package abschnitt_y;

import java.util.*;
public class Formatierungen {
    public static void main(String[] args) {
        //L10.1 Zeichenketten-Vertiefung
        int i= 78973;
        String is= Integer.toString(i);
        //= String.valueOf(i);
        int ziffern= is.length();
        //Formatierung von Zahlen in Strings
        String prefix= "00000000".substring(0, 8-ziffern);
        is= prefix + is;
        System.out.println(is); //00078973;
        // Umwandlung von Strings in Zahlen
        String s= "89975";
        int zahl= Integer.parseInt(s);
        String bs= "true";
        boolean b= Boolean.parseBoolean(s);
        // StringBuilder
        String s2= "Hallo"; //Erstes Objekt "Hallo"
        s= s + "Welt";    //Zweites Objekt" Welt"
        //drittes Objekt "Hallo Welt"
        int pos= 1; // positionswert im String
        StringBuilder sb= new StringBuilder("Initialer Inhalt");
        sb.append("mehr Text"); //anhängen
        sb.insert(pos, "einzufügender Text"); //einfügen
        sb.setCharAt(pos, 'x'); // ersetzen
        /**Konvertieren in eine konstante Zeichenkette*/
        String s3= sb.toString();
        /**BSP, ersetzte jedes o durch e*/
        String str= "moin moin";
        StringBuilder sb2= new StringBuilder(str);
        for (int k= 0; k < sb2.length(); k++) {
            if (sb2.charAt(k) == 'o') {
                sb2.setCharAt(k, 'e');
            }
        }
        str= sb2.toString();
        System.out.println(str); //mein mein
        // String Konkatenation lz 46sek
        String sb2String= "";
        for (int j=0; j<10000; j++) {
            s+= "Ich soll meinem Bruder keine Smarties klauen";
        }
        // mit String Builder lz 0,1sek
        StringBuilder sbb= new StringBuilder("");
        for (int x=0; x<10000; x++) {
            sb.append("Ich soll meinem Bruder keine Smarties klauen");
        }	String sBuilder= sb.toString();

        //String.split
        String line= "04.04.2007;55,66;58,44";
        String[] splitted= line.split(";");
        System.out.println(Arrays.toString(splitted));
        // output: [04.04.2007, 55,66, 58,44]
        /** .split(x)| x: regulärer Ausdruck
         Beispiel: "[a-z]" beschreibt die kleinen Buchstaben von a
         bis z. Beispiel: "\d+" bezeichnet die Menge der Zeichenketten,
         die aus einer oder mehreren Ziffern (digit) bestehen.
         Beispiel: ".{5}?" bezeichnet die Menge der Zeichenketten, die
         aus genau 5 Zeichen bestehen. Der Punkt bezeichnet ein beliebiges
         Zeichen, die Konstruktion "{5}?"bedeutet: genau 5 Stück davon */
        //Beispiel zum Regulären Ausdruck
        //Breche String auf "=" & "+"
        String name= "aber=hallo+hier";
        System.out.println(Arrays.toString(name.split("[+=]")));
        // "." wird folgend aufgebrochen "\\.";
        String d= "20.12.2012";
        String[] splitPoint= d.split("\\.");
        System.out.println(Arrays.toString(splitPoint));
    }
}