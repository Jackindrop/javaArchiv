import java.awt.*;
public class Scale {
    public static void main(String[] args) {
        int x= 4;
        int y= 3;
        int faktor= 2;
        Point p1 = new Point(x, y);
        skaliere(p1 ,faktor);
        System.out.println("x="+p1.x+",y="+p1.y);
    }
    public static void skaliere(Point p1, int faktor) {
        int xx = p1.x * faktor;
        int yy = p1.y * faktor;
        p1.setLocation(xx ,yy);
    }
}
