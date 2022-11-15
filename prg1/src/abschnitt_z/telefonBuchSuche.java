package abschnitt_z;

import java.util.*;
public class telefonBuchSuche {
    public static void main(String[] args) {
        int[] a= {1,4,4,4,7,8,11,15,21,22,23,24,25,26,20};
        System.out.println(Arrays.toString(a));
        /**System.out.println(1+": "+binarySearch(a, 1));
         System.out.println(30+": "+binarySearch(a, 30));
         System.out.println(0+": "+binarySearch(a, 0));
         System.out.println(31+": "+binarySearch(a, 31));
         System.out.println(11+": "+binarySearch(a, 11));
         System.out.println(25+": "+binarySearch(a, 25));
         System.out.println(4+": "+binarySearch(a, 4));
         System.out.println(12+": "+binarySearch(a, 12)); */
        System.out.println(24+": "+binarySearch(a, 24));
        System.out.println(20+": "+binarySearch(a, 20));
        System.out.println(0+": "+binarySearch(a, 0));
    }
    /** Sucht den Key im sortierten Array a, Liefert den Index des
     gefundenen Wertes oder -1, falls nicht gefunden. Wenn der
     key mehrfach in a vorkommt, wiord irgendein passender
     Index zurück gegeben.                                   */
    public static int binarySearch(int[] a, int key) {
        return binarySearchRecursive(a, key, 0, a.length);
    }
    /** Sucht den key im sortierten Array a, und zwar nur im halboffenen
     Bereich des Indizies {from, to). Liefert den Index des gefundenen
     Wertes oder -1, falls nicht gefunden. Wenn der key mehrfach in
     a vorkommt, wird irgendein passender Index zurück gegeben */
    public static int binarySearchRecursive(int[] a, int key, int from, int to) {
        if (from >= to) { //leerer Indexbereich
            return -1;
        }
        int middle= (from+to)/2; //mittleren Index ermitteln
        System.out.println(a[middle]);
        if (a[middle] == key) { //Zufalsstreffer
            return middle;
        }
        // Entscheide, ob links oder rechts weiter suchen
        if (a[middle] > key) { // Links weiter suchen
            return binarySearchRecursive(a, key, from, middle);
        }
        // Rechts weiter suchen
        return binarySearchRecursive(a, key, middle+1, to);
    }//___________________________________________________________________key=24
}//    |    |  |      |         |            |neue aktuelle| 
//Ebene|from|to|middle|a[middle]|Weitersuchen|Parameter    |
//-----|----|--|------|---------|------------|-------------|
// 1   | 0  |16| 8    | 21      | rechts     | middle+1,to |
// 2   | 9  |16| 12   | 25      | links      | from, middle|
// 3   | 9  |12| 10   | 23      | rechts     | middle+1,to |
// 4   | 11 |12| 11   | 24      |     Einfacher Fall,      |
//     |    |  |      |         |a[middle]==key. return mid|
//-----|----|--|------|------------------------------------|______________key=20
// 1   | 0  |16| 8    | 21      | links      | from, middle|
// 2   | 0  |8 | 4    |  7      | rechts     | middle+1,to |
// 3   | 5  |8 | 6    | 11      | rechts     | middle+1,to |
// 4   | 7  |8 | 7    | 15      | rechts     | middle+1,to |     
// 5   | 8  |8 |      |         |    Einfacher Fall,       |
//     |    |  |      |         |  from>=to, return -1;    |
//-----|----|--|------|------------------------------------|______________key=0
// 1   | 0  |16| 8    | 21      | links      | from, middle|
// 2   | 0  |8 | 4    |  7      | links      | from, middle|
// 3   | 5  |8 | 6    | 11      | rechts     | middle+1,to |
// 4   | 7  |8 | 7    | 15      | rechts     | middle+1,to |     
// 5   | 8  |8 |      |         |    Einfacher Fall,       |
//     |    |  |      |         |  from>=to, return -1;    |
//-----|----|--|------|------------------------------------|______________key=40
// 1   | 0  |16| 8    | 21      | links      | from, middle|
// 2   | 0  |8 | 4    |  7      | rechts     | middle+1,to |
// 3   | 5  |8 | 6    | 11      | rechts     | middle+1,to |
// 4   | 7  |8 | 7    | 15      | rechts     | middle+1,to |     
// 5   | 8  |8 |      |         |    Einfacher Fall,       |
//     |    |  |      |         |  from>=to, return -1;    |
//-----|----|--|------|------------------------------------|______________key=04
// 1   | 0  |16| 8    | 21      | links      | from, middle|
// 2   | 0  |8 | 4    |  7      | rechts     | middle+1,to |
// 3   | 5  |8 | 6    | 11      | rechts     | middle+1,to |
// 4   | 7  |8 | 7    | 15      | rechts     | middle+1,to |     
// 5   | 8  |8 |      |         |    Einfacher Fall,       |
//     |    |  |      |         |  from>=to, return -1;    |
//_____|____|__|______|_________|__________________________|