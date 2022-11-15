package abschnitt_x;

import java.util.*;

/**
 * switch-case--statement
 */
public class Monat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Geben Sie den Monat ein (1-12): ");
        int Monat = console.nextInt();
        System.out.print("Der Monat hat ");
        switch (Monat) {
            case 1: case 3: case 5: case 7: case 8: case 9: case 12:
                System.out.print("31");
                break;
            case 2:
                System.out.print("28");
                break;
            case 4: case 6: case 10: case 11:
                System.out.print("30");
            default:
                System.out.println();
        }
        System.out.println(" Tage");
    }
}
