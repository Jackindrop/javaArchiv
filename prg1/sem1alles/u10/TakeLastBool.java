import java.util.*;
public class TakeLastBool {
    public static void main(String[] args) {
        int[] a = {2, 5, -1,6, 14, -7, -9};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            } // alle werte im array die negativ sind
        } // werden auf 0 gesetzt und ausgegeben
        System.out.println(Arrays.toString(a));
    }
}