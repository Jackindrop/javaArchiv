import java.util.*;
import java.io.*;
public class ArrayHisto { // 11, 15, 3, 5, 12, 11, 15, 3 5,
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("punkte.txt"));
            int[] counts = new int[16];
            
            while (input.hasNextInt()) {
                int p= input.nextInt();
                counts[p]++;
            }
            
            input.close();
            //0:, 1:, 2:, 3: **, 4:, 5: ** ....
            for (int i = 0; i < counts.length; i++) {
                if ( i < 10) {
                    System.out.print(" ");
                }
                System.out.print(i + ": ");
                for (int k = 0; k < counts[i]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
        