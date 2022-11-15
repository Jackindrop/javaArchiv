package DivisibleSumPairs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * TASK: completed
 */
public class SolutionDivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(new File("DivisibleSumPairsTC0IN.txt"));
        List<Integer> ar= new ArrayList<Integer>();
        int n= input.nextInt();
        int k= input.nextInt();
        input.nextLine();
        for (int i=0; i< n; i++) {
            ar.add(input.nextInt());
        }

        System.out.println(divisibleSumPairs(n, k, ar));
    }

    //Lösung
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int pairs= 0;
        for (int s= 0; s< n; s++) {
            for (int d= 1; d< n; d++) {
                if ((ar.get(d)+ ar.get(s))% k== 0) {
                    if (s< d) {pairs++;}
                }
            }
        }
        return pairs;
    }
}
