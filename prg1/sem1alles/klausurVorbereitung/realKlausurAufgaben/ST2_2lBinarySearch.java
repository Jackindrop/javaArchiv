import java.awt.*;
import java.util.*;
public class ST2_2lBinarySearch {
    
    public static void main(String[] args) {
        
        searchFor(-10);
        searchFor(0);
        searchFor(3); 
        searchFor(4); 
       
    }
    
    public static Point binarySearch(Point[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length);
    }
    
    public static Point binarySearch(Point[] arr, int x, int left, int right) {      
        if (left >= right) {
            return null;
        }
        
        if (left == right -1) {
            if (arr[left].x == x) {
                return arr[left];
            } else {
                return null;
            }
        }
        
        int mid= (left + right) / 2;
        if (arr[mid].x > x) {
             System.out.println("1# "+Arrays.toString(arr) + x + left + mid);
            return binarySearch(arr, x, left, mid);
        } else {
            System.out.println("2# "+Arrays.toString(arr) + x + mid + right);
            return binarySearch(arr, x, mid, right);
        }
    }
    public static void searchFor(int x) {
        Point[] arr= {new Point(-10, 8), new Point(-2, 6), new Point(-2, 13), new Point(0, 7), 
            new Point(3, 9), new Point(13, 6), new Point(43, 50)};
        
            Point bS_result= new Point();
        bS_result= binarySearch(arr, x); 
        
        try {
            System.out.println("Looking for: "+ x+"\nGet result: "+
                "\n        |P|oint\n\t|x|-> "+bS_result.x+"\n\t|y|-> "+bS_result.y);
        } catch (NullPointerException e) {
            System.out.println("Point == null");
        }
    }
}
