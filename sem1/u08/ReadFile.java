import java.io.*;
import java.util.*;
public class ReadFile {
    public static final String SENTINEL = " ";
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String temp = console.nextLine();
        System.out.println(temp.equals(SENTINEL));
    }
}