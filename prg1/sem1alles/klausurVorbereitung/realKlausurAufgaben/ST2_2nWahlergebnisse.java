import java.util.*;
public class ST2_2nWahlergebnisse { 
    
    public static void main(String[] args) {
        String[] parteien= {"XP", "POD", "SKP", "MEP", "GHKP"};
        TreeMap<String, Integer> ergebnis= new TreeMap<String, Integer>();
        
        for (int i= 0; i< parteien.length; i++) { // initialisiere
            ergebnis.put(parteien[i], 0);        // Ergebnis-Map mit Keys
        }                                       // (Parteien) -> data=0
        
        String[] peterPro= {"", "XX", "", "XX", ""};
        String[] peterContra= {"X", "", "", "", ""};
        zaehlen(ergebnis, parteien, peterPro, peterContra);
        
        String[] sabinePro= {"X", "X", "", "XX", ""};
        String[] sabineContra= {"", "", "", "", ""};
        zaehlen(ergebnis, parteien, sabinePro, sabineContra);
        
        String[] karlPro= {"X", "", "", "X", ""};
        String[] karlContra= {"", "X", "", "", "X"};
        zaehlen(ergebnis, parteien, karlPro, karlContra);
        
        String[] bugPro= {"X", "X", "", "X", ""};
        String[] bugContra= {"", "X", "", "", ""};
        zaehlen(ergebnis, parteien, bugPro, bugContra);
        
        String[] bug2Pro= {"XX", "XX", "", "", ""};
        String[] bug2Contra= {"", "", "", "X", "X"};
        zaehlen(ergebnis, parteien, bug2Pro, bug2Contra);
        
        System.out.println(ergebnis);
        
    }
    public static void  zaehlen(TreeMap<String, Integer> ergebnis, String[] parteien,
            String[] pro, String[] contra) {
        int[] summe= new int[parteien.length];
        int kreuze= 0;
        
        for (int i= 0; i< parteien.length; i++) {
            int p= pro[i].length(); // länge des Wertes = Anzahl der Kreuze
            int c= contra[i].length(); //  "          "               "
            
            if (p!=0 && c!=0) { // ungültig wegen pro & contra 
                return;        // stimme bei gleicher partei
            }
            
            summe[i]= p- c;
            kreuze+= p+c;
        }
        if (kreuze> 5) {  // ungültig wegen mehr 
            return;     // als 5 Stimmen
        }
        
        for (int i= 0; i< parteien.length; i++) {
            
            if (summe[i] != 0) { // Int-Obj. unveränderlich  demnach...
                ergebnis.put(parteien[i], ergebnis.get(parteien[i])+summe[i]);
            }
        }
    }
}
        
