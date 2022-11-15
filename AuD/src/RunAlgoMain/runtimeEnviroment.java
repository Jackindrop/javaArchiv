package RunAlgoMain;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class runtimeEnviroment {
    public static Scanner console = new Scanner(System.in);
    public static void executeForceAlgo(int cycles, int[] arrayLength) {
        System.out.print("Length from 1.Array: ");
        for (int s = 0; s <= cycles - 1; s++) {
            // run BruteForce
            Instant start = Instant.now();
            Teilsumme.runBruteForce(arrayLength[s]);
            warteAufAbbruch();
            Instant finish = Instant.now();
            long timeBruteF = Duration.between(start, finish).toMillis();
            System.out.print("Brute Force Runtime from " + (1 + s) +
                    ".Array: " + timeBruteF + "mS\n"); // print time in mS
        }
        for (int s = 0; s <= cycles - 1; s++) {
            // run OptmusBruteForce
            Instant start = Instant.now();
            Teilsumme.runOptimusBruteForce(arrayLength[s]);
            Instant finish = Instant.now();
            long timeBruteF = Duration.between(start, finish).toMillis();
            System.out.print("OptimusBrFo Runtime from " + (1 + s) +
                    ".Array: " + timeBruteF + "mS\n"); // print time in mS
        }
    }
    public static void warteAufAbbruch() {
        System.out.println("<ENTER> to terminate alg");
        console.nextLine();
        System.out.println("Alg. terminated by usr");

    }

}

