/**
Gegeben sei ein Ratespiel, bei dem man eine Zahlenkombination aus 9 Ziffern mit 
möglichst wenigen Anfragen an das Ratespiel erraten muss. Das Ratespiel bietet 
Ihnen dazu drei Methoden zum Raten an:
    public class Ratespiel {
    public static boolean rate(int vermutung);
    public static boolean istGroesserAls(int vermutung);
    public static boolean istKleinerAls(int vermutung);
    public static int anfragen();
    }
Die vierte Methode anfragen liefert Ihnen die Anzahl aller Anfragen an das 
Ratespiel zurück. Beim Aufruf dieser Methode wird der interne Zähler der 
Anfragen wieder auf 0 gesetzt.
Das Ratespiel ist als Ratespiel.class-Datei als Anlage zu dieser Aufgabe 
verfügbar. Kopieren Sie die Datei in dasselbe Verzeichnis, in dem auch Ihr 
eigenes Programm liegt. Die Datei Ratespiel.class wurde mit einem JDK 6 
compiliert und funktioniert auch mit den neueren Java-Versionen 7 und 8. 
a) Schreiben Sie zunächst eine iterative Methode mit einer einfachen for-Schleife, 
die versucht, die Zahlenkombination zu erraten. Rufen Sie einfach immer wieder 
die Methode Ratespiel.rate auf und beenden die Schleife, wenn Sie die gesuchte 
Zahl gefunden haben. Geben Sie anschließend die Anzahl der Anfragen aus. 
Messen Sie außerdem die Laufzeit Ihrer iterativen Methode unter Verwendung 
von System.currentTimeMillis(). Die Laufzeit wird vermutlich im Bereich einiger 
Zehntelsekunden bis Sekunden liegen. Man nennt die iterative Vorgehensweise auch
"brute force"-Vorgehen, weil sie im Prinzip alle Möglichkeiten durchprobiert. 
Brute force Algorithmen sind einfach zu implementieren, 
aber nicht besonders effizient. 
b) Implementieren Sie anschließend eine rekursive Methode, die ebenfalls 
versucht, die Zahlenkombination zu erraten. Wenden Sie dabei das naheliegende 
Schema an, bei dem Sie zunächst eine mittlere Zahl ausprobieren und das 
Ratespiel fragen, ob die gesuchte Zahl größer kleiner oder gleich der geratenen 
Zahl ist. Entsprechend raten Sie beim nächsten Mal höher oder niedriger. Geben 
Sie auch hier am Ende die Anzahl der Anfragen aus und messen die Laufzeit. */
public class Raten {
    public static void main(String[] args) {
        int wert= -1;
        long start, stop;
        final int MAX= 1000000000;
        
        System.out.println("Brute Force Version:");
        start= System.currentTimeMillis();
        wert= ratenIterativ(MAX);
        stop= System.currentTimeMillis();
        System.out.println("Zahlenkombination ist: " + wert);
        System.out.println("Dauer: " + (stop-start)/1000.0 + "s");
        System.out.println("Anfragen: " + Ratespiel.anfragen());
        System.out.println();

        System.out.println("Rekursive Version:");
        start= System.currentTimeMillis();
        wert= ratenRekursiv(0, MAX);
        stop= System.currentTimeMillis();
        System.out.println("Zahlenkombination ist: " + wert);
        System.out.println("Dauer: " + (stop-start)/1000.0 + "s");
        System.out.println("Anfragen: " + Ratespiel.anfragen());
    }
    
    public static int ratenIterativ(int max) {
        for (int i=0; i<max; i++) {
            if (Ratespiel.rate(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int ratenRekursiv(int min, int max) {
        if (min > max) {
            return -1;
        }
        int vermutung= (min+max)/2;
        if (Ratespiel.istGroesserAls(vermutung)) {
            return ratenRekursiv(vermutung+1, max);
        }
        if (Ratespiel.rate(vermutung)) {
            return vermutung;
        }
        return ratenRekursiv(min, vermutung-1);
    }
}