package abschnitt_z;

import java.util.*;
public class anwendungIterator {
    public static void main(String[] args) {
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++LeseAufgabe
        ArrayList<Integer> list= new ArrayList<Integer>();
        Collections.addAll(list,1,1,3,5,5,5,5,7,7,11);
        // +++++++++++++++Entferne alle Duplikate aus dem Array mit
        //++++++++++++++++++++++++++++++++++++++++++++ ListIterator
        ListIterator<Integer> iter= list.listIterator();
        int oldVal= iter.next();// im gegensatz zu .get und .remove
        while (iter.hasNext()) {// bei linkedList besonders++++++++
            int val= iter.next();// effizient ! +++++++++++++++++++
            if (val == oldVal) {// Output +++++++++++++++++++++++++
                iter.remove();//+++++++++++++++++++++iter.remove= 1
            } else {          //+++++++++++++++++++++iter.remove= 5
                oldVal= val;  //+++++++++++++++++++++...        = 5
            }                 //++++++++++++++++++++...        = ..
        }                     //+++++++++++++++++++[ 1, 3, 5, 7, 11]
        System.out.println(list);

        anwendungIteratorZwei();
    }//+++++++++++++++++++++++++++++++++++++++++++++++++LeseAufgabeLernZielFrage
    public static void anwendungIteratorZwei() {
        ArrayList<Integer> list= new ArrayList<Integer>();
        Collections.addAll(list,1,1,3,5,5,5,5,7,7,11);
        // Entferne jedes 3te Element einer liste
        ListIterator<Integer> iter= list.listIterator();
        int countVal= 1; //+++++++++++++++++Erste Ziffer ignorieren
        int lastVal= iter.next(); //++++++++++++sonst bei 0 starten
        while (iter.hasNext()) {
            lastVal= iter.next(); //+++init !! sonst InllegalState-
            if (countVal % 3 == 0) {//++++++++++++++++++++Exception
                iter.remove();
                countVal= 1;
            } else {
                countVal++;
            }
        }

    }
}