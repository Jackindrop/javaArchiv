// mapping
import java.util.*;
public class LernMaps {
    public static void main(String[] args) {
        HashMap<String, String> haschMap= new HashMap<String, String>();
        haschMap.put("3", "0");
        haschMap.put("1", "0");
        System.out.println(haschMap); //{1=0, 3=0}
        
        TreeMap<String, String> baumMap= new TreeMap<String, String>();
        baumMap.put("3", "0");
        baumMap.put("1", "0");
        System.out.println(baumMap); //{1=0, 3=0}
        
        HashMap<Integer, String> hasschMap= new HashMap<Integer, String>();
        hasschMap.put(3, "0");
        hasschMap.put(1, "0");
        System.out.println(hasschMap); //{1=0, 3=0}
        
        
        HashMap<HashSet<String>, HashMap<String, String>> inputDataMap=
        new HashMap<HashSet<String>, HashMap<String, String>>();
        
        HashSet<String> produktNumbers= new HashSet<>();
        
        HashMap<String, String> preisAnzahl= new HashMap<String, String>();
      
        String tempProdukt1= "1";
        String tempProdukt2= "2";
        String tempPreis1= "1,8";
        String tempPreis2= "2,2";
        String tempAnzahl1= "30";
        String tempAnzahl2= "5";
        
        produktNumbers.add(tempProdukt2);
        produktNumbers.add(tempProdukt1);
        
        inputDataMap.put(produktNumbers, new HashMap<>());
        preisAnzahl.put(tempPreis2, tempAnzahl2);
        preisAnzahl.put(tempPreis1, tempAnzahl1);
        inputDataMap.put(produktNumbers, preisAnzahl);
        
        System.out.println(inputDataMap); //{[1, 2]={2,2=5, 1,8=30}}
        
        
        HashMap<ArrayList<String>, HashMap<String, String>> dataMap=
        new HashMap<ArrayList<String>, HashMap<String, String>>();
        
        HashMap<String, String> preisAnzahl2= new HashMap<String, String>();
        ArrayList<String> auswahl= new ArrayList<>();
        
        auswahl.add(tempProdukt2);
        auswahl.add(tempProdukt1);
        System.out.println(auswahl);
        preisAnzahl2.put(tempPreis2, tempAnzahl2);
        preisAnzahl2.put(tempPreis1, tempAnzahl1);
        
        dataMap.put(auswahl, preisAnzahl2);
        System.out.println(dataMap);
        
        TreeMap<String, TreeMap<String, String>> testMap=
        new TreeMap<String, TreeMap<String, String>>();
        
        testMap.put(tempProdukt2, baumMap);
        testMap.put(tempProdukt1, baumMap);
         System.out.println(testMap);
    }
}