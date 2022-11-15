package javaMap;

import java.util.*;
import java.io.*;

/**
 * Complete
 */
class Solution{

    public static  void checkInvalids() throws FileNotFoundException { //TODO remove
        File goodRes = new File("testCase1CorrectResults.txt");
        File myRes = new File("testCase1output.txt");
        checkFiles check1= new checkFiles(goodRes, myRes);

    }

    public static void main(String []argh) throws FileNotFoundException {
        Scanner in = new Scanner(new File("testCase1.txt"));
        int n = in.nextInt();
        in.nextLine();
        String[] refNames = new String[n];
        Arrays.fill(refNames, " ");
        HashMap<String, Integer> telBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) { // add values to Map

            String tmpName = in.nextLine();

            int tmpNumb = Integer.parseInt(in.nextLine());
            telBook.put(tmpName, tmpNumb);
        }
        int k = 0;
        while (in.hasNextLine()) {
            String tmpN= in.nextLine();
            if (!in.hasNextInt()) {
                refNames[k] = tmpN;
                k++;
            }  else {
                in.nextLine();
            }
        }
        PrintStream out = new PrintStream(new File("testCase1output.txt")); // TODO remove
        for (int i = 0; i < k; i++) { // print out consent values
            if (telBook.containsKey(refNames[i])) {
                System.out.println(refNames[i] + "=" + telBook.get(refNames[i]));
                out.println(refNames[i] + "=" + telBook.get(refNames[i]));  //TODO remove
            } else {
                System.out.println("Not found");
                out.println("Not found");                                                       //TODO remove
            }
        }
        checkInvalids();
    }
}



