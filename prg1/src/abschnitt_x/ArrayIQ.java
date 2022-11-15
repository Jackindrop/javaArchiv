package abschnitt_x;

import java.util.*;
public class ArrayIQ {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] iq = readAllIQs(console);
        System.out.println(Arrays.toString(iq));
        doubleAllIQs(iq);
        System.out.println(Arrays.toString(iq));

    } //Array als Ausgabeparameter, methode verädnert inhalt
    public static void doubleAllIQs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 2*array[i];
        }
    }
    // Array als Parameter in Methode genutzt
    public static int maximumIQ(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    // Array als Rückgabe einer Methode
    public static int[] readAllIQs (Scanner console) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        return array;
    }
}