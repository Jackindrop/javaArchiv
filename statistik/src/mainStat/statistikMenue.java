package mainStat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class statistikMenue {

    public static void run() {

        Scanner input= new Scanner(System.in);
        int answer= 1;
        int answerZwei= 1;
        boolean togg= true;

        System.out.print("000-Exit-Menue\n001-Ordnungstatistik\n002-Klassenstatistik\n00");
        while (togg) {

            try {
                answer= input.nextInt();

                if (answer== 0){
                    togg= false;
                    continue;
                } else {
                    System.out.print("000-Exit-Menue\n001-Vertikal\n002-Horizontal\n00");
                    if (answerZwei== 0){
                        togg= false;
                        continue;
                    }
                }

                answerZwei= input.nextInt();

                if (answer== 0||answerZwei== 0) {
                    togg= false;
                    continue;
                } else if (answer== 0||answerZwei== 0) {
                    togg= false;
                    continue;
                }

                if (answer== 1) {
                    if (answerZwei== 1) {
                        printStatistik.ordStatVert();
                        System.out.println();
                    } else if (answerZwei== 2) {
                        System.out.println();
                    }
                } else if (answer== 2) {
                    if (answerZwei== 1) {
                        printStatistik.klssStatVert();
                        System.out.println();
                    } else if (answerZwei== 2){
                        printStatistik.klssStatHori();
                        System.out.println();
                    }
                }

                System.out.print("000-Exit-Menue\n001-Ordnungstatistik\n002-Klassenstatistik\n00");
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Eingabe war Fehlerhaft\n");
            }
        }
    }
}
