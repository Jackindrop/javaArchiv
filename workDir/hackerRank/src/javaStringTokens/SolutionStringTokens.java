package javaStringTokens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Task: Java String Tokens // REGEX
 * -----> Complete!
 */
public class SolutionStringTokens {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("StringTokensTC5IN.txt"));
        String s= scan.nextLine();

        String[] spl= {" ", "!", ",", ".", "_", "'", "@"}; // split & break lines at these chars
        String[] words= s.split("\\!|\\?|\\,|\\'|\\_|\\.|\\@|\\s");
        int count= 0;
        for (int k= 0; k< words.length; k++) {
            if (!words[k].equals("")) {
                count++;
            }
        }
        for (int k= 0; k< words.length; k++) {
            if (!words[k].equals("")) {
                System.out.println(words[k]);
            }
        }
        System.out.println(count);
    }
}