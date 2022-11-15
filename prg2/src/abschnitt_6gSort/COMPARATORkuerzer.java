package abschnitt_6gSort;

import abschnitt_6Schnitstelle.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class COMPARATORkuerzer {
    public static void main(String[] args) {
        ArrayList<Shape> liste= new ArrayList<Shape>();
        liste.add(new Rectangle(1,1));
        liste.add(new Circle(1.0));
        liste.add(new Ellipsis(5, 2));
        liste.add(new Triangle(4.5, 6.6, 6.8));
        System.out.println("vorher  : " + liste);

        Collections.sort(liste, new Comparator<HasArea>() {
            private double f(double area) {
                return area+Math.sin(4*area);
            }
            @Override public int compare(HasArea a1, HasArea a2) {
                return Double.compare(f(a1.area()), f(a2.area()));
            }
        });
    }
}
