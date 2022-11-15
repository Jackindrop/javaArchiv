/**aufruf der Array funktion*/
import java.util.*;
/**aufruf der klassen datei */
public class Pascal {
    /** main fragt zeilen-menge vom benutzer ab,
    übergibt diese an eine methode zum berechnen.
    rückgabe wird an print-methode übergeben*/
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Wieviele Zeilen? ");
        int[][] row= new int [console.nextInt()][];
        pascalDreieck(row);
        print(row);  
    }
    /**hier wird das dreieck berechnet*/
    public static int[][] pascalDreieck(int[][] dreieck) {
        for (int i=0; i < dreieck.length; i++) {
            dreieck[i]= new int[i+1];
            dreieck[i][0]= 1;
            dreieck[i][i]= 1;
            for (int k= 0; k<= i; k++) {
                if (k == 0 || k == i) {
                    dreieck[i][k] = 1;
                } else {
                    dreieck[i][k]= dreieck[i - 1][k - 1] +
                    dreieck[i - 1][k];
                }
            }
        }
        return dreieck;
    }
    /**hier wird das 2d array ausgedruckt*/
    public static void print(int[][] grid) {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}