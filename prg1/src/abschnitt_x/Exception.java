package abschnitt_x;

import java.util.*;

/**
 * Exception-Handling Nr.1
 */
public class Exception {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Bitte Jahre eingeben: ");
        int jahre= console.nextInt();
        System.out.println("Das sind "+alterInMonaten(jahre)+" Monate");
    }/** Vorbdg: jahre muss >= 0 & <=100
     Nachbdg: liefert 12 x jahre */
    public static int alterInMonaten(int jahre) {
        if (jahre < 0) {
            throw new IllegalArgumentException("jahre muss >= 0 sein.");
        } //throw new <exception-class>( <message> )
        if (jahre > 100) {
            throw new IllegalArgumentException("jahre muss <= 100 sein.");
        }
        return jahre*12;
    }
}
