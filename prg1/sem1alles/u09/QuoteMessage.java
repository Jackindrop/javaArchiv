import java.io.*;
import java.util.*;
public class QuoteMessage {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("zeilen.txt"));
        while(input.hasNextLine())
        {
            String s = input.nextLine();
            System.out.println("> " + s);
        }
        input.close();
    }

    public static Scanner getScanner() throws FileNotFoundException {
        Scanner datei = new Scanner(new File("dataEx.txt"));
        return datei;
    }
}