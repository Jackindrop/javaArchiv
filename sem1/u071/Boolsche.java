import java.util.*;
public class Boolsche {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String eing = eingabe(console);
            
        
        System.out.println(istVokal(eing));
    }
    public static boolean istVokal(String s) {
        return (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")); 
    }
        
    
    public static String eingabe(Scanner console) {
        System.out.println("Bitte Buchstaben eingeben: ");
        String s = console.next();
        if (s.length() > 1 ) {
            System.out.println("Eingabe zu lang, wiederholung: ");
            eingabe(console);
        }
        return s;
    }
}