package probeKlausurThreads;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * 9.Aufgabe Threads und anonyme Klasse (10Pkt)
 * Schreiben Sie eine main-Methode in der eine Ressource instanziiert wird und starten sie 2 Threads
 * mithilfe einer anonymen Klasse. 1 Thread soll die Variable mit einer for-Schleife bis 100 Zählen lassen
 * und der andere Thread soll die Variable in einer schleife um 100 wieder reduzieren. Also am ende soll
 * die Variable den Wert 0 besitzen. Achten sie dabei auf einen geregelten Zugriff der Threads auf
 * kritische Bereiche und verhindern sie diese durch einen minimalen Eingriff. Wichtig: Klasse Ressource
 * darf nicht verändert werden.
 */
public class Ressource {
    private int val;
    public int incr() {
        return val+1;
    }
    public int decr() {
        return val-1;
    }

    public static void main(String[] args) {
        Ressource r= new Ressource();
        Thread t1= new Thread() {
            @Override
            public void start() {
                for (int i = 0; i < 1000000000; i++) {
                    r.val= r.incr();
                }
            }
        };
        Thread t2= new Thread() {
            @Override
            public void start() {
                for (int i = 0; i < 1000000000; i++) {
                    r.val = r.decr();
                }
            }
        };
    t1.start();
    t2.start();
    r.print(r);
    }

    public void print(Ressource ressource) {
        System.out.println(ressource.val);
    }
}
