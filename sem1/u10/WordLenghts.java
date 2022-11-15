import java.util.*;
import java.io.*;
public class WordLenghts {
    public static void main(String[] args) 
    throws FileNotFoundException {
        String fileName = "WL.txt";
        wordLenghts(fileName);
        
    }
    public static void wordLenghts(String dateiName) 
    throws FileNotFoundException  {
        Scanner input = new Scanner(new File(dateiName));
        ArrayList<String> list = new ArrayList<>();
        int counts[] = new int[80];
        while (input.hasNext()) {
            String p= input.next();
            list.add(p);
            int temp2 = p.length();
            counts[temp2]++;
        }
        int max = counts[0];
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            int temp2 = temp.length();
            if (max < temp2) {
                max = temp2;
            }
        }
        
        for (int i = 1; i < 10; i ++) {
            if (counts[i] < max) {
                System.out.print(i  + ": " + counts[i] + "   "); 
                for (int k = 0; k < counts[i]; k++) {
                        System.out.print("*");
                    }
            }
             if (counts[i] >= max) {
                 System.out.print(i  + ": " + counts[i] + "  "); 
                for (int k = 0; k < counts[i]; k++) {
                        System.out.print("*");
                    }
            }
                System.out.println();
        }
        for (int i = 10; i <= max; i ++) {
            if (counts[i] < max) {
                System.out.print(i  + ": " + counts[i] + "  "); 
                for (int k = 0; k < counts[i]; k++) {
                        System.out.print("*");
                    }
            }
                System.out.println();
        }
    }
}
    

