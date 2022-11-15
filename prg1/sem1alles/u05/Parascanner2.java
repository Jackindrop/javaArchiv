import java.util.*;
    public class Parascanner2 {
        /** Liest Daten für einen Angestellten mit gegebener nummer ein.
        Gibt die Gesamtstunden für den Angestellten zurück. */
        public static int processEmployee(Scanner console, int nummer) {
            System.out.print("Angestellter " + nummer + ": Wie viele Tage? ");
            int days = console.nextInt();
            // totalHours ist eine kumulative Summe der Arbeitsstunden.
            int totalHours = 0;
            for (int i = 1; i <= days; i++) {
                System.out.print("Stunden? ");
                int hours = console.nextInt();
                totalHours += Math.min(hours, 8); // alles über 8 Std.
                // abschneiden
            }
            System.out.println("Gesamtstunden für Angestellter " + nummer
                + " = " + totalHours);
            System.out.println();
            return totalHours;
        }
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int hours1 = processEmployee(console, 1);
            int hours2 = processEmployee(console, 2);
            int total = hours1 + hours2;
            System.out.println("Gesamtstunden für beide = " + total);
        }
    }
    