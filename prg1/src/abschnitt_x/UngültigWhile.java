package abschnitt_x;

import java.util.*;
public class UngültigWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Nicht-negative Zahl bitte: ");
        int number = console.nextInt();
        if (number < 0) {
            System.out.print("Ungültig. Nochmal: ");
            number = console.nextInt();
        }
        while (number < 0) {
            System.out.print("Ungültig. Nochmal: ");
            number = console.nextInt();
        }
        int square = number * number;
        System.out.println(number + " zum Quadrat ist " + square);
    }
}
