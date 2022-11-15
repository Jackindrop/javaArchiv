package de.hsh.prog.factorsengine;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class testCalculation extends Thread {

    public static HashMap<Integer,
            TreeSet<Integer>> hMap= new HashMap<>();
    public int numb;

    public testCalculation() {numb= 0;}
    public testCalculation(int n) {setNumb(n);}

    public void setNumb(int numb) {
        this.numb= numb;
        hMap.put(numb, new TreeSet<>());
        hMap.get(numb).add(numb);
        run();
    }

    @Override public void run() { // Hier wird die Teilermenge berechnet
        for (int i = 1; i <= numb/2; i++) {
            if (numb % i == 0) {
                hMap.get(numb).add(i);
            }
        }

        hMap.get(numb).add(numb);
    }


    public void printMap() {
        int z= 0;
        Iterator<Integer> it;

        for (Integer key : hMap.keySet()) {
            it= hMap.get(key).iterator();

            while (it.hasNext()) {
                z= it.next();
            }
            System.out.print("z= " + z + "= "+
                    hMap.get(key).toString().replace(
                            '[', '{').replace(
                                    ']','}')+"\n");
        }
    }

    public static void main(String[] args) {
        testCalculation tC= new testCalculation();
        tC.setNumb(12);
        tC.setNumb(35);
        tC.setNumb(117);
        tC.printMap();
    }
}
