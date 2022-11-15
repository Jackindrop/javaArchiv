import java.util.*;         
import java.io.*;
public class SelbstTest2 { //1.n, 1n+1, 1n+2..
    public static void main(String[] args) {
        bvi();
        System.out.println(min(douArr())); // 1.c
    }
    
    public static double min(double[] d) {
        double min= d[0];
        for (int i= 0; i<= d.length-1; i++) {
            min= Math.min(min, d[i]); 
        }
        return min;
    }
    public static void bvi() {
        Scanner input= null;
        try {
            input= new Scanner(new File("datei.txt"));
            while (input.hasNextLine()) {
                String tempRow= input.nextLine();
                System.out.println(tempRow);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    
    
    public static double[] douArr() { // called by 1.c
        double[] arr= new double[] {2.4, 6.3, 1.43, 4.7, 8.3};
        return arr;
    }
}