package RunAlgoMain;

import algos.StraightInsertion;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Laufhaus {
    private static Scanner console= new Scanner(System.in);
    public static void main(String[] args) {
        int[] freier = ArrayPacker.nNumbers(5);
        callStraightInsertion(new int[] {6, 4, 3, 1, 5, 2});
    }
    public static void callStraightInsertion(int[] freier) {
        Instant start = Instant.now();
        Thread t= new Thread() {
            @Override public void run() {
                StraightInsertion.sort(freier, true);
            }
        };
        t.start();
        warteAufAbbruch();
        if (t.isAlive()) {
            t.interrupt();
        }
        Instant finish = Instant.now();

        long runTime = Duration.between(start, finish).toMillis();
        System.out.println(runTime + "mS\n"); // print time in mS
    }

    public static void warteAufAbbruch() {
        System.out.println("Zum Abbrechen <ENTER> ...");
        console.nextLine();
    }

    public static void showFreier(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
