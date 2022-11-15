import java.util.*;
public class Exception {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Bitte Jahre eingeben: ");
        int jahre= scanner.nextInt();
        System.out.println("Das sind "+alterInMonaten(jahre)+" Monate");
    }
    /** Vorbdg: jahre muss >= 0 sein
    Nachbdg: liefert 12 x jahre */
    public static int alterInMonaten(int jahre) {
       if (jahre < 0) {
       throw new IllegalArgumentException("jahre muss >= 0 sein.");
       }
       return jahre*12;
    }
}