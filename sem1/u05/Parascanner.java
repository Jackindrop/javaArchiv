/** Sumiert vorgegebenen zahlenwert auf */

import java.util.*;
public class Parascanner {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n= console.nextInt();
        int sum = readSum(console, n);
        System.out.println("The sum is " + sum);
    }
    public static int readSum(Scanner console, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Type a number: ");
            sum += console.nextInt();
        }
        return sum;
    }
}


    