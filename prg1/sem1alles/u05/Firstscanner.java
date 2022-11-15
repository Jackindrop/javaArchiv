import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;
public class Firstscanner {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.GERMAN;
    Scanner console = new Scanner(System.in);
    System.out.println("Gebe die erste von drei \n Nummern an, von dessen Summe");
    System.out.println("wir den durschnitt berechnen");
    int num1 = console.nextInt();
    System.out.println("Jetzt die zweite Nummer");
    int num2 = console.nextInt();
    System.out.println("Nun gib die letzte Nummer ein");
    int num3 = console.nextInt();
    double average = (double) (num1+num2+num3)/3;
    String string = NumberFormat.getNumberInstance(locale).format(average); 
    System.out.println("Der Durchschnitt ist "+string);
    }
}


    