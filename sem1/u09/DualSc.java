import java.io.*;
import java.util.*;
public class DualSc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input = null;
        
        try {
            input = new Scanner(new File("dualInt.txt"));
            while (input.hasNextInt()) {
                int numb1 = input. nextInt();
                int numb2 = input.nextInt();
                int average = numb1 / numb2;
                System.out.println(average);
            }
            } catch (FileNotFoundException e) {
                System.out.println("Datei wurde nicht gefunden");
            } catch (ArithmeticException e) {
                System.out.println("SYNTAX ERROR");
            } finally {
                if (input != null) {
                    input.close();
                }
            }
            input.close();
        
    }
}