import java.util.*;
public class Read {
    public static void main(String[] args) {       // bei kombinierter
        Scanner console = new Scanner(System.in);  // einlese hilft es 
        System.out.print("Enter your age: ");    // alles in zeilen
        String ageAsString = console.nextLine();    // zu packen
        int age = Integer.parseInt(ageAsString);    // um fehler zu
        System.out.print("Now enter your name: ");  // vermeiden
        String name = console.nextLine();
        System.out.println(name + " is " + age + " years old.");
    }
}