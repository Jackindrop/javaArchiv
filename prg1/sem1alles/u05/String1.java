import java.util.*;
public class String1 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = "Schundroman";
        System.out.println("String: " + s);
        System.out.println("Welcher Index des Strings ist gesucht?");
        int num = console.nextInt();
        System.out.println(s.substring(num, num+1));
    }
}
