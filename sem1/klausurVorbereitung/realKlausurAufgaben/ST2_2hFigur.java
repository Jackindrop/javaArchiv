import java.util.*;         
public class ST2_2iMakierungsfahrzeug {
    public static void main(String[] args) {
        int n= 5;
        drawTriangle(5);
        drawTriangle(10);
        drawTriangle(2);
    }  
    public static void drawTriangle(int n) {
        for (int i= 1; i<= n; i++) {
            drawRow(i, n);
        }
        drawChar("-", n*2-2);
        System.out.println();
    }  
    public static void drawRow(int i, int n) {
        drawChar(" ", n-i-1);
        if (i>= 2) {
            System.out.print("/");
        }
        drawChar(" ", i-3);
        System.out.print("|");
        if (i>= 2) {
            drawChar(" ", i-3);
            System.out.print("\\");
        }
        System.out.println();
    } 
    public static void drawChar(String s, int n) {
        for (int x= 0; x<= n; x++) {
            System.out.print(s);
        }
    }
}
        
            