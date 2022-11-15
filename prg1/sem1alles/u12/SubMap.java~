/** Teil-Map, methode submap. Prüft ob
Key1 alle in Key2 vorhanden sind & den selben 
Wert haben. Import für ArrayList  */
import java.util.*;
/**Aufruf der Klassen Datei */
public class SubMap {
    /**Aufruf der Main Methode welche zuerst die Maps initialisiert
    unb dann die gewünschte methode aufruft */
    public static void main(String[] args) {
        HashMap<String,String> mapOne= new HashMap<String,String>();
        HashMap<String,String> mapOneB= new HashMap<String,String>();
        HashMap<String,String> mapTwo= new HashMap<String,String>();
        HashMap<String,String> testTwoA= new HashMap<String,String>();
        HashMap<String,String> testTwoB= new HashMap<String,String>();
        HashMap<String,String> testOneA= new HashMap<String,String>();
        HashMap<String,String> testOneB= new HashMap<String,String>();
        HashMap<String,String> testDreiA= new HashMap<String,String>();
        HashMap<String,String> testDreiB= new HashMap<String,String>();
        HashMap<String,String> testVierA= new HashMap<String,String>();
        HashMap<String,String> testVierB= new HashMap<String,String>();
        
        mapOne.put("Meier", "0511-673904");
        mapOne.put("Müller", "030-8497489");
        
        mapOneB.put("Meier", "0511-673904");
        mapOneB.put("Müller", "030-1111111");
        
        mapTwo.put("Meier", "0511-673904");
        mapTwo.put("Schulz", "0511-673904");
        mapTwo.put("Müller", "030-8497489");
        mapTwo.put("Schmidt", "040-1994533");
        
        testTwoA.put("Meier", "089-88966699");
        testTwoA.put("Müller", "040-1994533");
        testTwoB.put("Meier", "040-1994533");
        testTwoB.put("Müller", "089-88966699");
        
        testOneA.put("Meier", "0221-7716628");
        testOneA.put("Müller", "040-1994533");
        
        testOneB.put("Meier", "0221-7716628");
        testOneB.put("Schmidt", "0511-673904");
        testOneB.put("Müller", "040-1994533");
        testOneB.put("Schulz", "030-8497489");
        
        testDreiA.put("Meier", "0511-673904");
        testDreiA.put("Müller", "030-8497489");
        testDreiB.put("Schmidt", "040-1994533");
        testDreiB.put("Schulz", "030-8497489");
        
        testVierA.put("Meier", "089-88966699");
        testVierB.put("Meier", "089-88966699");
        
        System.out.println(subMap(testOneA, testOneB));
        System.out.println(subMap(testTwoA, testTwoB));
        System.out.println(subMap(testDreiA, testDreiB));
        System.out.println(subMap(testVierA, testVierB));
        System.out.println(subMap(mapOne, mapTwo));
        System.out.println(subMap(mapOneB, mapTwo));
    
    //      True= "Key'sTwo" enthält "Key'sOne" && 
    //      KeyOne&KeyTwo == dataOne&dataTwo 
    }

    /** SubMap-Methode checkt ob Map1 TeilMap der Zweiten ist */
    public static boolean subMap(HashMap<String,String> mapOne, HashMap<String,String> mapTwo) {
        HashMap<String,String> temp= new HashMap<String,String>();
        ArrayList <String> data2= new ArrayList<>();
        ArrayList <String> data1= new ArrayList<>();
        String temp1= "";
        String temp2= "";
        int sizeOfOne= mapOne.size();
        int sizeOfTwo= mapOne.size();
        int count= 0;
        System.out.println("1: "+sizeOfOne+"|2: "+sizeOfTwo);
        
        if (sizeOfOne <= 0) {
            return false;
        } else if (sizeOfTwo <= 0) {
            return false;
        } else if (sizeOfOne > sizeOfTwo) {
            return false;
        }
        for (String key : mapTwo.keySet()) { //Speichert die Daten
            data2.add(mapTwo.get(key));     // =Schlüssel in Array
            data1.add(mapOne.get(key));     //-list.
        }
        Object[] objects1 = data1.toArray();
        Object[] objects2 = data2.toArray();
        System.out.println(Arrays.toString(objects1));
        System.out.println(Arrays.toString(objects2));
        if (sizeOfOne <= sizeOfTwo) {
            for (int i= 0; i<= objects2.length-1; i++) {
                try {
                    temp1= objects1[i].toString();
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException");
                }
                temp2= objects2[i].toString();
                if (temp1.equals(temp2)) {
                    count++;
                }
            }
        } else if (sizeOfOne > sizeOfTwo) {
            count++;
            for (int i= 0; i< sizeOfTwo-1; i++) {
                temp1= objects1[i].toString();
                temp2= objects2[i].toString();
                if (temp1.equals(temp2)) {
                    count++;
                }
            }
        }
        if (count == sizeOfOne) {
            return true;
        }
        System.out.println(count);
        System.out.println(sizeOfOne);
        return false;
    }
}