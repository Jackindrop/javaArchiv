import java.util.*;
public class DoubleArray {
    public static void main(String[] args) {
        double array[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println(Arrays.toString(array));
        jedesDritte(array);
        System.out.println(Arrays.toString(array));
    }
    public static void jedesDritte(double[] array) {
        double temp= 0.0;
        for (int i = 0; i < array.length; i++) {
            if (i >0 && i % 3 == 0.0) {
                array[i-1] = 0.3;
            }
            
        }
    }
}