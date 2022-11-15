import java.io.*; 
import java.util.*;
public class Echo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Echo.java"));
        PrintStream output = new PrintStream(new File("tmp.txt"));
        echoUpper(input, output);
        output.close();
        input.close();       
    }   
    public static void echoUpper(Scanner input, PrintStream output) {
        while(input.hasNextLine()) {
                output.println(input.nextLine().toUpperCase());
        }
    }
}