/** random funktion importieren */
import java.util.*;
/** aufruf der classen methode */
public class RandomText {
    /** random Int geben auf 5-8 Zeilen,
    zwischen 4 bis 6 Umlaute aus */
    public static void main(String[] args) {
        Random rand = new Random();
        String text = "aeiou";
        int z = rand.nextInt(4) + 5;
        int z2 = rand.nextInt(3) + 4;
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z2; j++) {
                int y = rand.nextInt(text.length());
                System.out.print(text.charAt(y));
            }
            System.out.println();
        }
    }
}
            
          
                
            
