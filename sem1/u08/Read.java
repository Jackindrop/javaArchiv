import java.io.*;
import java.util.*;
public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("numbers2.txt");
        Scanner input = new Scanner(f);
        input.useLocale(new Locale("en", "US"));
        System.out.println();
        double summe = 0.0;
        while (input.hasNext()); {
            if (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println("nummer = " + next);
                summe += next;
            } else {
                input.next(); // Token Trap
            }
        }
        input.close();
        System.out.println("Summe ist = " + summe);
    }
    public static Scanner getScanner() throws FileNotFoundException {
        Scanner datei = new Scanner(new File("data.txt"));
        return datei;
    }
}
        