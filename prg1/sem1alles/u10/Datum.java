import java.util.*;
public class Datum {
    public static void main(String[] args) {
        String metric = "03/05/1995";
        System.out.println(metric);
        toAmerica(metric);
    }
    public static void toAmerica(String metric) {
        String[] result = metric.split("/");
        String temp = result[0];
        result[0] = result[1];
        result[1] = temp;
        
        System.out.println(Arrays.toString(result));
    }
}