package abschnitt_x;

import java.util.*;
public class ArrayPlenum {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double numAverage = averageOfNumbers(numbers);
        System.out.println("Durchschnitt: " + numAverage);
        System.out.println(contains(numbers, 5));
        System.out.println(contains(numbers, 11));
        double [] numbers2 = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        roundAll(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
    // 7.c.iii - Ausgabeparameter, verändert Array
    public static void roundAll(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double round = Math.round(array[i]);
            array[i] = round;
        }
    }
    // 7.c.ii
    public static boolean contains(int[] array, int keyword) {
        boolean answer = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == keyword) {
                return true;
            }
        }
        return false;
    }
    // 7.c.i
    public static double averageOfNumbers(int[] nums) {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}