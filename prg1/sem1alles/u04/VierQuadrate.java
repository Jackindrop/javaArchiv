/** Komplexe Figur mit for-loops, 
    und statischen Methoden.     */
public class VierQuadrate {
    
    /** Statische Methode zum skalieren der Grafik */
    public static final int SIZE = 8;
    
    /** Methode welche die Grafik aufruft */
    public static void main(String[] args) {
        drawL();
        drawM();
        drawL();
        drawM();
        drawL();
    }
    
    /** Methode produziert die Linie */
    public static void drawL() {
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int a = 1; a <= (SIZE+1); a++) {
            System.out.print("=");
        }
        System.out.println();
    }
    
    /** Methode produzier die Mauern */
    public static void drawM() {
        
        /** Diese doppel-Schleife lässt die Mauern
            zum SIZE Wert im Quadrat skalieren */
        for (int c = 1; c <= SIZE; c++) {
            System.out.print("#");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int d = 1; d <= SIZE; d++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
    }
}
            
        
    

   