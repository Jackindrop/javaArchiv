package BreakingTheRecords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * TASK: Completed
 */
public class SolutionBreakingRecords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BreakRecordsTC0IN.txt"));
        int n= input.nextInt();
        input.nextLine();
        List<Integer> arr= new ArrayList<Integer>();
        while (input.hasNextInt()) {
            arr.add(input.nextInt());
        }
        System.out.println(breakingRecords(arr));
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int games= scores.size(), min= scores.get(0), max= min;
        List<Integer> minMax= new ArrayList<Integer>();
        Collections.addAll(minMax, 0, 0);
        for (int i= 1; i< scores.size(); i++ ) {
            if (scores.get(i)> max) {
                max= scores.get(i);
                minMax.set(0, minMax.get(0)+1);
            } else if (scores.get(i)< min) {
                min= scores.get(i);
                minMax.set(1, minMax.get(1)+1);
            }
        }
        return minMax;
    }
}
