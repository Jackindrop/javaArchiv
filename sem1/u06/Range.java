/** Aufruf der Class-Datei */
public class Range { 
    /** Aufruf der Main Methode */
    public static void main(String[] args) {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);
    }
    /** Methode welche die geforderte aufzählung ausgibt,
    hier wird geschaut ob a größer kleiner gleich b ist, um 
    entsprechende schleifenfunktion zu nutzen */
    public static void printRange(int a, int b) {
        if (a < b) {
            System.out.print("["+a);
            for (int i = a+1; i <= b; i++) {
                System.out.print(", "+i);
            }
            System.out.println("]");
        } else if (a > b) {
            System.out.print("["+a);
            for (int i = a-1; i >= b; i--) {
                System.out.print(", "+i);
            }
            System.out.println("]");
        } else if (a == b) {
            System.out.println("["+a+"]");
        }
    }
}