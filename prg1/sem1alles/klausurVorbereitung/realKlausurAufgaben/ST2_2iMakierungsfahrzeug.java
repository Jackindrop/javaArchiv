import java.util.*;         
public class ST2_2iMakierungsfahrzeug {
    public static void main(String[] args) {
        double teillaenge[]= {6.5, 1.5, 4.3, 2.1, 8.7, 8.3};
        String farben[]= {"rot", "gelb", "blau"};
        double abstand= 3;      // der Makierungen
        int stadtTeilIndex= 0;   // startpunkt
        double gefahren= 0;     // zurück gelegter weg
        double grenze= teillaenge[0]; // hier kommt nächster Teil
        int farbIndex= 0; // nächste Farbmakierung
        
        while (stadtTeilIndex < teillaenge.length) {
            System.out.print((char) ('A' + stadtTeilIndex));
            System.out.println(" "+ gefahren+ " "+ farben[farbIndex]);
            gefahren += abstand;
        //checke ob Stadteil zuende oder gar Gesamtroute
        while (gefahren > grenze && stadtTeilIndex < teillaenge.length) {
            stadtTeilIndex++;
            if (stadtTeilIndex < teillaenge.length) {
                grenze += teillaenge[stadtTeilIndex];
            }
        }
    farbIndex= (farbIndex+1)%farben.length;
    }
    System.out.println((char)'A');
    System.out.println((char)('A'+1));
    }
}
