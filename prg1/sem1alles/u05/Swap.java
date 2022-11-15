import java.awt.*;
/** Aufruf der Klasse '*/
public class Swap {
    /** Aufruf der Main-Methode */
    public static void main(String[] args) {
        Point p1= new Point(5, 2);
        Point p2= new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("p1: ("+p1.x+", "+p1.y+")");
        System.out.println("p2: ("+p2.x+", "+p2.y+")");
    }
    /** Swap Methode tauscht koordinaten der Punkte */
    public static void swapPoints(Point p1, Point p2) {
        Point temp = new Point(p1);
        p1.setLocation(p2);
        p2.setLocation(temp);
    }
}