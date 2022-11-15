import java.awt.*;
public class Schmierblatt {
    public static final int gZahl= 7;
    public static void main(String[] args) {
        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");
        System.out.println("\nSincerely,");
        System.out.println("Susan");
        
        int _broetchen= 2;
        
        System.out.print("Ich ");
        System.out.println("denke.");
        System.out.print("Also ");
        System.out.println("bin ich.");
        
        for (int i=1; i<=2; i++) {
            for (int j=0; j<3; j++) {
                System.out.print((i+j) + " ");
            }
            System.out.println();
        }
        
        System.out.print("|");
        for (int i= 1; i<= gZahl; i++) {
            System.out.print(i +"|"); 
        }
        
        String str= "Four score and seven years ago";
        System.out.println("\n"+str.indexOf("score"));
        
        Point p1= new Point(17, 9);
        Point p2= new Point(4, -1);
        Point p3= p2;
        p1.translate(3, 1);
        p2.x= 50;
        p3.translate(-4, 5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
            }
        }